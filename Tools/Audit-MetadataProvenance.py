"""Read-only Unity provenance audit. Writes evidence only to --output, never Assets.

Requires UnityPy. A name match is a candidate, not proof of original GUID ownership.
"""
import argparse
import collections
import csv
import hashlib
import json
import re
import struct
import zipfile
from pathlib import Path


def sha(path):
    with open(path, 'rb') as stream:
        h = hashlib.sha256()
        for block in iter(lambda: stream.read(1024 * 1024), b''):
            h.update(block)
        return h.hexdigest()


def write_json(path, value):
    path.write_text(json.dumps(value, indent=2, ensure_ascii=False) + '\n', encoding='utf-8')


def read_guid(text):
    values = re.findall(r'^guid:\s*(\S+)\s*$', text, re.M)
    return values[0] if len(values) == 1 and re.fullmatch('[0-9a-fA-F]{32}', values[0]) else None


def map_candidates(mapping):
    result = collections.defaultdict(list)
    for file in mapping['Files']:
        for obj in file['Assets']:
            result[obj.get('Name', '').casefold()].append({
                'serializedFile': file['Name'], 'pathID': obj['PathID'], 'type': obj['Type']})
    return result


def metadata_types(data):
    # Version-27 layout: Perfare/Il2CppDumper, Il2Cpp/MetadataClass.cs.
    if struct.unpack_from('<II', data) != (0xFAB11BAF, 27):
        raise ValueError('Only the verified metadata version 27 is supported')
    strings, string_size = struct.unpack_from('<II', data, 24)
    offset, size = struct.unpack_from('<II', data, 160)
    if size % 88 or offset + size > len(data) or strings + string_size > len(data):
        raise ValueError('Invalid type definition table bounds')
    def string(index):
        if index >= string_size:
            raise ValueError('Invalid metadata string index')
        end = data.index(b'\0', strings + index, strings + string_size)
        return data[strings + index:end].decode('utf-8')
    types = []
    for pos in range(offset, offset + size, 88):
        name, namespace = struct.unpack_from('<II', data, pos)
        token = struct.unpack_from('<I', data, pos + 84)[0]
        if token >> 24 != 2:
            raise ValueError('Unexpected TypeDef token; unsupported metadata layout')
        types.append({'name': string(name), 'namespace': string(namespace), 'token': token,
                      'typeDefinitionIndex': len(types)})
    image_offset, image_size = struct.unpack_from('<II', data, 168)
    if image_size % 40 or image_offset + image_size > len(data):
        raise ValueError('Invalid image definition table bounds')
    for pos in range(image_offset, image_offset + image_size, 40):
        name, _, start, count = struct.unpack_from('<IiII', data, pos)
        if start + count > len(types):
            raise ValueError('Image type range out of bounds')
        for item in types[start:start+count]:
            item['assembly'] = string(name)
    return types


def scan_apk(apk, mapping):
    import UnityPy
    scripts, components, files, failures, containers = [], [], {}, [], []
    targets = {(f['Name'].lower(), a['PathID']) for f in mapping['Files']
               for a in f['Assets'] if a.get('Name') == 'Win_GlobalConfig'}
    with zipfile.ZipFile(apk) as archive:
        metadata = archive.read('assets/bin/Data/Managed/Metadata/global-metadata.dat')
        types = metadata_types(metadata)
        for entry in sorted(archive.namelist()):
            if not entry.startswith(('assets/bin/Data/', 'assets/assetpack/', 'assets/bundles/')):
                continue
            if entry.endswith(('.resS', '.resource', '.dat', '.dll', '.json', '.xml')) or '/Managed/' in entry:
                continue
            try:
                env = UnityPy.Environment()
                env.load_file(archive.read(entry), name=entry.split('/')[-1])
                for path, ptr in env.container.items():
                    if ptr.m_PathID == 0:
                        containers.append(dict(assetPath=path, apkEntry=entry, pathID=0,
                                               serializedFile=None, type=None, nullReference=True))
                        continue
                    target = ptr.deref()
                    containers.append(dict(assetPath=path, apkEntry=entry,
                        serializedFile=str(target.assets_file.name), pathID=target.path_id,
                        type=target.type.name))
                for obj in env.objects:
                    file = obj.assets_file
                    key = str(file.name).lower()
                    if key not in files:
                        files[key] = {'apkEntry': entry, 'serializedFile': str(file.name),
                                      'externals': [str(e.path) for e in file.externals]}
                    if obj.type.name == 'MonoScript':
                        tree = obj.read_typetree()
                        if tree.get('m_ClassName') == 'Win_GlobalConfig' or (key, obj.path_id) in targets:
                            scripts.append(dict(apkEntry=entry, serializedFile=str(file.name),
                                                pathID=obj.path_id, tree=tree,
                                                rawSha256=hashlib.sha256(obj.get_raw_data()).hexdigest()))
                    elif obj.type.name == 'MonoBehaviour':
                        # Header can be parsed even when stripped scripts have no field type tree.
                        data = obj.read(check_read=False)
                        ptr = data.m_Script
                        target_file = key if ptr.m_FileID == 0 else None
                        if ptr.m_FileID > 0 and ptr.m_FileID <= len(file.externals):
                            target_file = str(file.externals[ptr.m_FileID - 1].path).replace('\\', '/').split('/')[-1].lower()
                        if (target_file, ptr.m_PathID) in targets:
                            try:
                                tree = obj.read_typetree()
                                tree_error = None
                            except Exception as exc:
                                tree, tree_error = None, str(exc)
                            components.append(dict(apkEntry=entry, serializedFile=str(file.name),
                                pathID=obj.path_id, scriptFileID=ptr.m_FileID, scriptPathID=ptr.m_PathID,
                                scriptFile=target_file, tree=tree, typeTreeError=tree_error,
                                byteSize=len(obj.get_raw_data()),
                                rawHex=obj.get_raw_data().hex(),
                                rawSha256=hashlib.sha256(obj.get_raw_data()).hexdigest()))
            except Exception as exc:
                failures.append({'apkEntry': entry, 'error': str(exc)})
    return dict(scripts=scripts, components=components, files=files, containers=containers,
                metadataTypes=types, metadataSha256=hashlib.sha256(metadata).hexdigest(),
                matchingMetadataTypes=[t for t in types if t['name'] == 'Win_GlobalConfig'],
                scanErrors=failures)


def main():
    parser = argparse.ArgumentParser(description=__doc__)
    for name in ('project', 'apk', 'baseline', 'output'):
        parser.add_argument('--' + name, required=True, type=Path)
    args = parser.parse_args()
    project, out = args.project.resolve(), args.output.resolve()
    if out == project or project in out.parents:
        parser.error('--output must be outside the Unity project')
    baseline = json.loads(args.baseline.read_text(encoding='utf-8-sig'))
    mapping_path = project / 'AuxiliaryFiles/path_id_map.json'
    mapping = json.loads(mapping_path.read_text(encoding='utf-8-sig'))
    candidates = map_candidates(mapping)
    out.mkdir(parents=True, exist_ok=True)
    native = scan_apk(args.apk, mapping)
    write_json(out / 'apk-serialized-evidence.json', native)
    direct = collections.defaultdict(list)
    for item in native['containers']:
        if not item.get('nullReference'):
            direct[item['assetPath'].replace('\\', '/').casefold()].append(item)
    script_types = collections.defaultdict(list)
    for item in native['metadataTypes']:
        assembly = item.get('assembly', '').removesuffix('.dll')
        namespace = item['namespace'].replace('.', '/')
        name = item['name'].split('`')[0]
        path = '/'.join(p for p in ['Assets/Scripts', assembly, namespace, name + '.cs'] if p)
        script_types[path.casefold()].append(item)
    guids, invalid = collections.defaultdict(list), []
    metas = sorted((project / 'Assets').rglob('*.meta'))
    for meta in metas:
        rel = meta.relative_to(project).as_posix()
        guid = read_guid(meta.read_text(encoding='utf-8-sig'))
        if guid:
            guids[guid.lower()].append(rel)
        else:
            invalid.append(rel)
    rows, issues = [], []
    seen = set()
    for item in baseline:
        rel = item['Path'].replace('\\', '/')
        if rel in seen or not rel.startswith('Assets/') or '..' in Path(rel).parts:
            raise ValueError('Duplicate or unsafe baseline path: ' + rel)
        seen.add(rel)
        meta = project / rel
        exists = meta.is_file()
        actual = sha(meta) if exists else None
        status = 'unchanged' if actual == item['Hash'].lower() else ('changed' if exists else 'missing')
        if status != 'unchanged':
            issues.append(dict(path=rel, status=status))
        asset = Path(str(meta)[:-5])
        guid = read_guid(meta.read_text(encoding='utf-8-sig')) if exists else None
        category = ('recovery-created' if rel.startswith('Assets/Recovery/') else
                    'directory' if asset.is_dir() else 'unresolved')
        matches = candidates.get(asset.stem.casefold(), []) if category == 'unresolved' else []
        enriched = []
        for match in matches:
            file_info = native['files'].get(match['serializedFile'].lower(), {})
            enriched.append(dict(match, apkEntry=file_info.get('apkEntry')))
        if enriched:
            category = 'export-name-candidate'
        container_matches = direct.get(rel[:-5].casefold(), [])
        if category not in ('directory', 'recovery-created') and container_matches:
            category, enriched = 'apk-container-path', container_matches
        type_matches = script_types.get(rel[:-5].casefold(), [])
        if category not in ('directory', 'recovery-created') and type_matches:
            category = 'metadata-type-path-candidate'
            enriched = [dict(t, apkEntry='assets/bin/Data/Managed/Metadata/global-metadata.dat') for t in type_matches]
        rows.append(dict(path=rel, guid=guid, baselineSha256=item['Hash'].lower(),
                         currentSha256=actual, integrity=status, category=category,
                         originalGuidVerified=False, candidates=enriched))
    duplicates = {g: paths for g, paths in guids.items() if len(paths) > 1}
    summary = dict(baselineCount=len(rows), baselineIssues=issues, invalidGuidFiles=invalid,
                   duplicateGuids=duplicates, newMetas=[p.relative_to(project).as_posix() for p in metas
                       if p.relative_to(project).as_posix() not in seen],
                   categories=dict(collections.Counter(r['category'] for r in rows)),
                   integrityPassed=not (issues or invalid or duplicates),
                   provenanceComplete=False, originalDeveloperGuidsNotAssumed=True,
                   apkSha256=sha(args.apk), baselineSha256=sha(args.baseline),
                   mappingSha256=sha(mapping_path), scanErrors=native['scanErrors'])
    summary['metadataTypeCount'] = len(native['metadataTypes'])
    summary['globalConfigMetadataTypes'] = native['matchingMetadataTypes']
    write_json(out / 'metadata-provenance.json', rows)
    write_json(out / 'summary.json', summary)
    with (out / 'metadata-provenance.csv').open('w', encoding='utf-8', newline='') as stream:
        writer = csv.DictWriter(stream, fieldnames=['path','guid','integrity','category','candidateCount'])
        writer.writeheader()
        for row in rows:
            writer.writerow({**{key: row[key] for key in ('path','guid','integrity','category')},
                             'candidateCount': len(row['candidates'])})
    print(json.dumps(summary))
    return 0 if summary['integrityPassed'] else 1


if __name__ == '__main__':
    raise SystemExit(main())
