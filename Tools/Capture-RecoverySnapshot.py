"""Fingerprint both working trees without touching them; fail if validation changed inputs."""
import argparse
import hashlib
import json
import subprocess
from datetime import datetime, timezone
from pathlib import Path


def git(root, *args):
    return subprocess.check_output(['git', '-C', str(root), *args])


def capture(root):
    paths = sorted(set(git(root, 'ls-files', '-c', '-o', '--exclude-standard', '-z').decode('utf-8').split('\0')) - {''})
    files = {}
    for name in paths:
        path = root / name
        if not path.is_file():
            files[name] = None  # Preserve tracked deletions in the snapshot.
            continue
        with path.open('rb') as stream:
            files[name] = hashlib.file_digest(stream, 'sha256').hexdigest()
    return {'root': str(root), 'commit': git(root, 'rev-parse', 'HEAD').decode().strip(),
            'statusPorcelain': git(root, 'status', '--porcelain=v1', '-uall').decode('utf-8'), 'files': files}


def main():
    parser = argparse.ArgumentParser(description=__doc__)
    parser.add_argument('--output', type=Path, required=True)
    parser.add_argument('--compare', type=Path)
    args = parser.parse_args()
    apk = Path(__file__).resolve().parents[1]
    roots = [apk.parent / 'Soccer-Mobile-Pro', apk]
    result = {'capturedUtc': datetime.now(timezone.utc).isoformat(), 'repositories': [capture(root) for root in roots]}
    # This original prefab must remain byte-identical, even though its script GUID now resolves.
    prefab = 'Assets/gamedata/ui/windows/Win_GlobalConfig.prefab'
    expected = '0d73cd094b52bc85c4bdb01680365c24b8cfeb49ee9ae2d662e2575625b10b2c'
    result['originalPrefabUnchanged'] = result['repositories'][0]['files'].get(prefab) == expected
    result['differences'] = []
    if args.compare:
        before = json.loads(args.compare.read_text(encoding='utf-8'))
        for old, new in zip(before['repositories'], result['repositories']):
            if old['root'] != new['root'] or old['commit'] != new['commit']:
                result['differences'].append({'repository': new['root'], 'kind': 'root-or-commit'})
            for name in sorted(old['files'].keys() | new['files'].keys()):
                if name not in old['files'] or name not in new['files'] or old['files'].get(name) != new['files'].get(name):
                    result['differences'].append({'repository': new['root'], 'path': name})
    args.output.write_text(json.dumps(result, indent=2, ensure_ascii=False), encoding='utf-8')
    print(json.dumps({'snapshot': str(args.output), 'files': sum(len(r['files']) for r in result['repositories']),
                      'originalPrefabUnchanged': result['originalPrefabUnchanged'], 'differences': len(result['differences'])}))
    if not result['originalPrefabUnchanged'] or result['differences']:
        raise SystemExit(1)


if __name__ == '__main__':
    main()
