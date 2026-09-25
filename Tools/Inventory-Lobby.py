"""Inventory original Lobby dependencies without importing/activating them."""
from pathlib import Path
import re, json, hashlib
ROOT = Path(r'C:\Users\ZGAMESVN\Downloads\Soccer-Mobile-Pro')
OUT = ROOT / 'Documentation/Lobby'
guids = {}
for meta in (ROOT / 'Assets').rglob('*.meta'):
    match = re.search(r'^guid: (\w+)', meta.read_text(encoding='utf-8-sig'), re.M)
    if match: guids[match[1]] = str(meta.relative_to(ROOT))[:-5].replace('\\','/')
paths = [ROOT / 'Assets/Scenes/UI/Lobby.unity'] + list((ROOT / 'Assets/gamedata/ui/windows/mainview').rglob('*.prefab'))
items = []
for path in paths:
    raw = path.read_text(encoding='utf-8-sig')
    scripts = sorted(set(re.findall(r'm_Script:.*guid: (\w+)', raw)))
    calls = re.findall(r'm_MethodName: (.+)', raw)
    items.append(dict(path=str(path.relative_to(ROOT)).replace('\\','/'), sha256=hashlib.sha256(path.read_bytes()).hexdigest(),
        scripts=[dict(guid=g, source=guids.get(g), known=bool(guids.get(g))) for g in scripts], persistentMethods=calls))
OUT.mkdir(parents=True, exist_ok=True)
(OUT/'asset-inventory.json').write_text(json.dumps(items, indent=2)+'\n', encoding='utf-8')
print(json.dumps({'assets':len(items), 'scriptTypes':len({s['guid'] for i in items for s in i['scripts']}), 'unresolved': [s for i in items for s in i['scripts'] if not s['known']]}))
