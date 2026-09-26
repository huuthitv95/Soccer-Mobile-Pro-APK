"""Inventory local recovery artifacts and compare independently read asset evidence."""
import hashlib, json, os, re, struct, sys, zipfile
from pathlib import Path
import UnityPy

run = Path(sys.argv[1]).resolve()
base = run.parents[2]
roots = [base / n for n in ('Soccer-Mobile-Pro','Soccer-Mobile-Pro-APK','Soccer-Unity-Recovery')]
def sha(p):
    with p.open('rb') as f: return hashlib.file_digest(f,'sha256').hexdigest()
def save(name,obj): (run/name).write_text(json.dumps(obj,indent=2,ensure_ascii=False),encoding='utf-8')
ind=json.loads((run/'independent-assets-audit.json').read_text())
old=json.loads((roots[0]/'Documentation/MetadataProvenance/apk-serialized-evidence.json').read_text())
component=next(x for x in old['components'] if x['pathID']==ind['pathId'])
def fields(node): return {c['name']:c for c in node['children']}
script_results=[]
for s in ind['scripts']:
    prev=next(x for x in old['scripts'] if x['pathID']==s['pathId'])
    f=fields(s['fields']); props=fields(f['m_PropertiesHash'])
    property_hash=bytes(props[f'bytes[{i}]']['value'] for i in range(16)).hex()
    checks={k:f[k]['value']==prev['tree'][k] for k in ('m_Name','m_ClassName','m_Namespace','m_AssemblyName')}
    checks['propertiesHash']=property_hash==bytes(prev['tree']['m_PropertiesHash'][f'bytes[{i}]'] for i in range(16)).hex()
    checks['rawHash']=s['rawSha256']==prev['rawSha256']
    script_results.append({'pathId':s['pathId'],'checks':checks,'propertiesHash':property_hash})
env=UnityPy.load(str(run/'ui.unity3d'))
obj=next(o for o in env.objects if o.path_id==ind['pathId'])
t=obj.serialized_type
comparison={'rawHexEqual':ind['rawHex']==component['rawHex'],'rawHashEqual':ind['rawSha256']==component['rawSha256'],
 'headerBytes':ind['headerBytesConsumed'],'tailBytes':ind['tailBytes'],'scripts':script_results,
 'unityPyScriptId':t.script_id.hex(),'unityPyTypeHash':t.old_type_hash.hex(),
 'scriptIdMatches':t.script_id.hex()==ind['scriptIdHash'],'typeHashMatches':t.old_type_hash.hex()==ind['oldTypeHash'],
 'unityVersionRawUnityPy':obj.assets_file.unity_version,
 'versionExplanation':'Both parsers read the literal serialized Unity version string 2020.3.49f1\\n2. The suffix is present in source data, not a template/parser-added version. Its producer-specific meaning is unknown; class database uses 2020.3.49f1.'}
save('asset-comparison.json',comparison)
assert comparison['rawHexEqual'] and comparison['rawHashEqual'] and all(all(s['checks'].values()) for s in script_results)
assert comparison['scriptIdMatches'] and comparison['typeHashMatches']

excluded={'.git','Library','Temp','obj','node_modules','.gradle','Logs'}
inventory=[]; errors=[]; seen={}; bundles=[]; archives=[]
for root in roots:
    for directory,dirs,files in os.walk(root,onerror=lambda e:errors.append(str(e))):
        dirs[:]=[d for d in dirs if d not in excluded]
        for name in files:
            p=Path(directory)/name
            if run in p.parents: continue
            ext=p.suffix.lower()
            if ext not in ('.dll','.apk','.xapk','.apkm','.obb','.zip','.unity3d','.bundle','.assets','.dat') and not re.search('global.?config',name,re.I): continue
            try:
                digest=sha(p); row={'path':str(p),'size':p.stat().st_size,'sha256':digest,'duplicateOf':seen.get(digest)}
                inventory.append(row)
                if digest in seen:continue
                seen[digest]=str(p)
                if ext in ('.apk','.xapk','.apkm','.obb','.zip'): archives.append(p)
                if ext in ('.unity3d','.bundle','.assets'): bundles.append(p)
            except Exception as e: errors.append({'path':str(p),'error':str(e)})
save('artifact-inventory.json',{'roots':list(map(str,roots)),'exclusions':sorted(excluded),'generatedRunExcluded':str(run),'files':inventory,'errors':errors})
matches=[]; scan_errors=[]; scanned=0
def scan(data,source):
    global scanned
    try:
        env=UnityPy.load(data); scanned+=1
        for obj in env.objects:
            typ=obj.serialized_type
            sid=typ.script_id.hex() if typ.script_id else ''
            th=typ.old_type_hash.hex() if typ.old_type_hash else ''
            match=sid==ind['scriptIdHash'] or th==ind['oldTypeHash']
            if obj.type.name=='MonoScript':
                tree=obj.read_typetree()
                if tree.get('m_ClassName')=='Win_GlobalConfig':
                    matches.append({'source':source,'pathId':obj.path_id,'monoScript':tree})
            if match:
                matches.append({'source':source,'file':str(obj.assets_file.name),'pathId':obj.path_id,'classId':obj.class_id,'scriptId':sid,'typeHash':th,'hasTypeTree':bool(typ.node),'size':obj.byte_size})
    except Exception as e: scan_errors.append({'source':source,'error':str(e)})
for p in bundles:scan(str(p),str(p))
archive_entries=[]; archive_hashes=set()
for p in archives:
    try:
        with zipfile.ZipFile(p) as z:
            for entry in z.infolist():
                if entry.is_dir():continue
                n=entry.filename
                if n.endswith(('.unity3d','.bundle','.assets')) or n.startswith('assets/bundles/'):
                    data=z.read(entry); digest=hashlib.sha256(data).hexdigest()
                    archive_entries.append({'archive':str(p),'entry':n,'sha256':digest})
                    if digest not in archive_hashes and digest not in seen:scan(data,str(p)+'!'+n)
                    archive_hashes.add(digest)
    except Exception as e: scan_errors.append({'source':str(p),'error':str(e)})
save('serialized-artifact-search.json',{'uniqueFilesScanned':scanned,'matches':matches,'archiveEntries':archive_entries,'errors':scan_errors})

# ELF64 PT_LOAD maps for direct AArch64 B/BL callers. Avoid claiming IDA's partial analysis has a complete xref index.
data=(run/'Native/libil2cpp.so').read_bytes()
phoff=struct.unpack_from('<Q',data,32)[0];phsize,phnum=struct.unpack_from('<HH',data,54)
targets={0x151A4D8:'GlobalConfigHelper.GetGlobalConfig',0x11D331C:'SimpleGlobalConfig.get_Config'}
calls=[]
for i in range(phnum):
    typ,flags,off,va,_,size,_,_=struct.unpack_from('<IIQQQQQQ',data,phoff+i*phsize)
    if typ!=1 or not flags&1:continue
    for pos in range(off,off+size-3,4):
        w=struct.unpack_from('<I',data,pos)[0]
        if w&0x7c000000!=0x14000000:continue
        imm=w&0x3ffffff; imm=imm-(1<<26) if imm&(1<<25) else imm
        addr=va+pos-off;target=addr+imm*4
        if target in targets: calls.append({'address':hex(addr),'target':hex(target),'name':targets[target]})
save('Native/direct-callers.json',calls)
print(json.dumps({'artifacts':len(inventory),'uniqueHashes':len(seen),'scanned':scanned,'matches':len(matches),'errors':len(errors)+len(scan_errors),'directCallers':len(calls)}))
