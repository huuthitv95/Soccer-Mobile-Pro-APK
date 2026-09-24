# Soccer-Mobile-Pro-APK

Unity asset/type recovery automation: [guide and complete PowerShell script](UNITY-RECOVERY.md).

- [Recover-SoccerUnity.ps1](Recover-SoccerUnity.ps1): preflight, recovery, repair and Unity validation.
- [Test-RecoveryPipeline.ps1](Test-RecoveryPipeline.ps1): synthetic and installed-tool integration checks; does not extract the APK.

Target editor: Unity 2020.3.49f1. Recovered IL2CPP method bodies remain stubs.

Existing project: run `Recover-SoccerUnity.ps1 -RepairExisting` to back up, repair and validate, or `-ValidateOnly` to validate without transforming source. Close its Unity Editor first. Reports are retained in `Soccer-Unity-Recovery\Runs`.

Decompiled APK source and recovery tooling. The recovered Unity project is maintained in https://github.com/huuthitv95/Soccer-Mobile-Pro at C:\Users\ZGAMESVN\Downloads\Soccer-Mobile-Pro. This repository lives at C:\Users\ZGAMESVN\Downloads\Soccer-Mobile-Pro-APK. Clone with Git LFS installed and run git lfs pull to retrieve the APK and native assets.
