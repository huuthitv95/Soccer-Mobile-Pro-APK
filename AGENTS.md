# Repository workflow

- Work, commit and push directly on `main`. Do not create feature/recovery branches unless the user explicitly requests one.
- Preserve existing user changes. Never force-push `main` or rewrite published history.
- The paired Unity project is ../Soccer-Mobile-Pro and targets Unity 2020.3.49f1. Keep runtime/validation changes compatible with that project.
- Run `Test-MilestonePipeline.ps1` for validation tooling changes and `Recover-SoccerUnity.ps1 -ValidateLobbyFlow` for the complete offline Editor milestone. Do not forcibly close a user's Unity Editor.
- Keep APK/native/bundle assets in Git LFS. Do not treat reconstructed Android source as proof of a buildable or functional APK.
- Keep full logs, analysis databases and backups in ../Soccer-Unity-Recovery; retain source tools and intentional small evidence.
- Scope build ignores to actual output directories. A source path containing `build` is not necessarily generated output.
- Clean only explicitly identified generated paths; preserve original artifacts, source metadata, IDE settings and recovery evidence.
