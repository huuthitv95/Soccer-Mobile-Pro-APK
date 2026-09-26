"""Capture only the dedicated LDPlayer audit instance. No mutation of personal instance 0."""
import json, subprocess, sys, time
from pathlib import Path
run=Path(sys.argv[1]);phase=sys.argv[2]
adb=['C:/LDPlayer/LDPlayer9/adb.exe','-s','emulator-5560']
records=[]
def call(args,name,timeout=35,binary=False):
    start=time.time()
    try:
        p=subprocess.run(adb+args,capture_output=True,timeout=timeout)
        (run/name).write_bytes(p.stdout)
        records.append({'command':args,'exitCode':p.returncode,'seconds':time.time()-start,'stderr':p.stderr.decode(errors='replace')[:3000],'output':name})
        print(name,p.returncode,len(p.stdout),flush=True)
        return p.stdout
    except subprocess.TimeoutExpired as e:
        (run/name).write_bytes(e.stdout or b'')
        records.append({'command':args,'error':'timeout','seconds':time.time()-start,'output':name})
        print(name,'timeout',flush=True)
    finally:(run/('runtime-'+phase+'-commands.json')).write_text(json.dumps(records,indent=2))
if phase=='online':
    call(['shell','svc','wifi','enable'],'runtime-online-wifi.txt')
    call(['shell','am','force-stop','com.football.soccer.league'],'runtime-online-stop.txt')
    call(['shell','monkey','-p','com.football.soccer.league','-c','android.intent.category.LAUNCHER','1'],'runtime-online-launch.txt')
call(['shell','getprop','sys.boot_completed'],f'runtime-{phase}-boot.txt')
call(['logcat','-d','-t','2500','-v','threadtime'],f'runtime-{phase}-bounded.log')
call(['exec-out','screencap','-p'],f'runtime-{phase}.png',binary=True)
call(['shell','dumpsys','activity','activities'],f'runtime-{phase}-activities.txt')
call(['shell','find','/sdcard/Android/data/com.football.soccer.league','/sdcard/Android/obb/com.football.soccer.league','-type','f'],f'runtime-{phase}-files.txt')
call(['shell','run-as','com.football.soccer.league','ls','-R','files'],f'runtime-{phase}-private-files.txt')
