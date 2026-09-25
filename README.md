# Soccer-Mobile-Pro-APK

Offline UI validation: `Recover-SoccerUnity.ps1 -ValidateOfflineUI` runs whole-project validation and four PlayMode tests in the existing Unity project. [Test-OfflineUI.ps1](Test-OfflineUI.ps1) records compile/UI/gameplay status separately and captures both UI panels at 16:9 and ultrawide. It requires the offline UI milestone scene and refuses to stop an open Editor.

Boot-flow validation: `Recover-SoccerUnity.ps1 -ValidateBootFlow` validates the existing project, four offline UI tests, and twelve `Launch → Start` recovery tests. These cover the native network/save-path gates, percent scaling, error preservation, repeated callbacks, cancellation, and three scene restarts. Reports include per-test event traces. It never extracts an APK, repairs source, overwrites scenes, changes Build Settings, or stops an open Editor.

Unity asset/type recovery automation: [guide and complete PowerShell script](UNITY-RECOVERY.md).

- [Recover-SoccerUnity.ps1](Recover-SoccerUnity.ps1): preflight, recovery, repair and Unity validation.
- [Test-RecoveryPipeline.ps1](Test-RecoveryPipeline.ps1): synthetic and installed-tool integration checks; does not extract the APK.

Target editor: Unity 2020.3.49f1. Recovered IL2CPP method bodies remain stubs.

Existing project: run `Recover-SoccerUnity.ps1 -RepairExisting` to back up, repair and validate, or `-ValidateOnly` to validate without transforming source. Close its Unity Editor first. Reports are retained in `Soccer-Unity-Recovery\Runs`.

Decompiled APK source and recovery tooling. The recovered Unity project is maintained in https://github.com/huuthitv95/Soccer-Mobile-Pro at C:\Users\ZGAMESVN\Downloads\Soccer-Mobile-Pro. This repository lives at C:\Users\ZGAMESVN\Downloads\Soccer-Mobile-Pro-APK. Clone with Git LFS installed and run git lfs pull to retrieve the APK and native assets.
