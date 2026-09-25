"""Read-only, standard-library ARM64 evidence extraction for this exact APK.

ELF64 program headers map RVAs to file offsets; R_AARCH64_RELATIVE relocations
resolve GOT slots to Il2CppDumper metadata/string slots. No native code executes.
"""
import hashlib
import argparse
import json
from pathlib import Path
import re
import struct
import subprocess
import zipfile

ROOT = Path(r'C:\Users\ZGAMESVN\Downloads')
RECOVERY = ROOT / 'Soccer-Unity-Recovery'
OUT = ROOT / 'Soccer-Mobile-Pro/Documentation/Boot/Evidence'
OBJDUMP = Path(r'C:\Users\ZGAMESVN\AppData\Local\Programs\Swift\Toolchains\6.3.3+Asserts\usr\bin\llvm-objdump.exe')

def sha(data):
    return hashlib.sha256(data).hexdigest()

def main():
    parser = argparse.ArgumentParser()
    parser.add_argument('--output', type=Path, default=OUT)
    parser.add_argument('--method-pattern', default=r'^(StartGame|MainViewLoader\$\$|UI_Load\$\$|SceneHelper\$\$LoadScenes)')
    args = parser.parse_args()
    output = args.output
    binary = RECOVERY / 'Extracted/lib/arm64-v8a/libil2cpp.so'
    b = binary.read_bytes()
    metadata = RECOVERY / 'Extracted/assets/bin/Data/Managed/Metadata/global-metadata.dat'
    report = json.loads((RECOVERY / 'Reports/recovery.json').read_text(encoding='utf-8-sig'))
    hashes = {}
    with zipfile.ZipFile(ROOT / 'Soccer-Mobile-Pro-APK/Soccer-Mobile-Pro.apk') as apk:
        for name, path, key in [('lib/arm64-v8a/libil2cpp.so', binary, 'binarySha256'),
                                ('assets/bin/Data/Managed/Metadata/global-metadata.dat', metadata, 'metadataSha256')]:
            hashes[key] = sha(path.read_bytes())
            assert hashes[key] == sha(apk.read(name)) == report[key].lower(), 'Input provenance mismatch: ' + name
    assert b[:6] == b'\x7fELF\x02\x01' and struct.unpack_from('<H', b, 18)[0] == 183
    assert struct.unpack_from('<II', metadata.read_bytes()) == (0xFAB11BAF, 27)
    script_path = RECOVERY / 'Il2Cpp/script.json'
    script = json.loads(script_path.read_text(encoding='utf-8-sig'))
    hashes['scriptJsonSha256'] = sha(script_path.read_bytes())
    hashes['dumpCsSha256'] = sha((RECOVERY / 'Il2Cpp/dump.cs').read_bytes())
    phoff = struct.unpack_from('<Q', b, 32)[0]
    size, num = struct.unpack_from('<HH', b, 54)
    segs = [struct.unpack_from('<IIQQQQQQ', b, phoff + i * size) for i in range(num)]
    def off(a):
        for t, flags, o, v, p, fs, ms, alignment in segs:
            if t == 1 and v <= a < v + fs:
                return o + a - v
        raise ValueError(hex(a))
    shoff = struct.unpack_from('<Q', b, 40)[0]
    ss, sn = struct.unpack_from('<HH', b, 58)
    relocations = {}
    for i in range(sn):
        h = struct.unpack_from('<IIQQQQIIQQ', b, shoff + i * ss)
        if h[1] == 4:
            for p in range(h[4], h[4] + h[5], h[9]):
                a, info, addend = struct.unpack_from('<QQq', b, p)
                if info & 0xffffffff == 1027:
                    relocations[a] = addend
    symbols = {}
    for key in ('ScriptString', 'ScriptMetadata', 'ScriptMetadataMethod'):
        for item in script[key]:
            symbols[item['Address']] = item.get('Name', item.get('Value'))
    methods = {}
    for m in script['ScriptMethod']:
        methods.setdefault(m['Address'], []).append(m)
    starts = sorted(set(script['Addresses']) | set(methods))
    def disasm(start, end):
        return subprocess.check_output([str(OBJDUMP), '-d', '--start-address=' + hex(start),
            '--stop-address=' + hex(end), str(binary)], text=True, encoding='utf-8', timeout=60)
    def annotate(raw):
        regs = {}
        result = []
        for line in raw.splitlines():
            # Only track page constants and direct LDRs from those pages, not
            # arbitrary register contents; unknown values are never guessed.
            m = re.search(r'adrp\s+(x\d+), (0x[0-9a-f]+)', line)
            if m:
                regs[m[1]] = int(m[2], 16)
            m = re.search(r'ldr\s+(x\d+), \[(x\d+), #(0x[0-9a-f]+)\]', line)
            if m and m[2] in regs:
                addr = regs[m[2]] + int(m[3], 16)
                target = relocations.get(addr)
                if target in symbols:
                    line += '  // GOT ' + hex(addr) + ' -> ' + hex(target) + ': ' + symbols[target]
                regs.pop(m[1], None)
            m = re.search(r'\b(?:bl|b)\s+(0x[0-9a-f]+)', line)
            if m and int(m[1], 16) in methods:
                names = [v['Name'] for v in methods[int(m[1], 16)]]
                line += '  // ' + ' | '.join(names[:3]) + (' [shared generics]' if len(names) > 3 else '')
            result.append(line.rstrip())
        return '\n'.join(result)
    output.mkdir(parents=True, exist_ok=True)
    selected = []
    for m in script['ScriptMethod']:
        if re.search(args.method_pattern, m['Name']):
            end = next(a for a in starts if a > m['Address'])
            selected.append(dict(m, endRva=hex(end)))
            text = annotate(disasm(m['Address'], end))
            (output / (hex(m['Address']) + '.asm.txt')).write_text(text + '\n', encoding='utf-8')
    # Import/export summary is evidence about the binary, not a claim that boot
    # invokes each imported API. Dynamic calls still require method-level analysis.
    dynamic = subprocess.check_output([str(OBJDUMP), '-T', str(binary)], text=True, encoding='utf-8', timeout=60)
    (output / 'dynamic-symbols.txt').write_text(dynamic, encoding='utf-8')
    evidence = {'inputHashes': hashes, 'pairMatchesApkAndOriginalDumperRun': True,
                'metadataVersion': 27, 'architecture': 'ELF64 AArch64 little-endian',
                'methods': selected, 'progressConstants': {hex(a): struct.unpack_from('<f', b, off(a))[0]
                    for a in (0x2785a10, 0x27c50e8)},
                'scope': 'Static binary and metadata evidence; external services are not executed.'}
    (output / 'native-evidence.json').write_text(json.dumps(evidence, indent=2) + '\n', encoding='utf-8')
    print(json.dumps({'methods': len(selected), 'hashes': hashes, 'output': str(output)}))

if __name__ == '__main__':
    main()
