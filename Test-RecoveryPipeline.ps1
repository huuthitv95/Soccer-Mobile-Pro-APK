#requires -Version 5.1
<## Tests synthetic code, installed APIs and tool isolation. Does not load the APK. ##>
[CmdletBinding()]
param()
Set-StrictMode -Version Latest
$ErrorActionPreference='Stop'
$pipeline=Join-Path $PSScriptRoot 'Recover-SoccerUnity.ps1'
$tokens=$null; $errors=$null
$ast=[Management.Automation.Language.Parser]::ParseFile($pipeline,[ref]$tokens,[ref]$errors)
if($errors.Count){throw ($errors | Out-String)}
# Guard the relocated source/project mapping without executing extraction.
$sourceAssignment=$ast.EndBlock.Statements | Where-Object {$_ -is [Management.Automation.Language.AssignmentStatementAst] -and $_.Left.Extent.Text -eq '$Source'}
$projectAssignment=$ast.EndBlock.Statements | Where-Object {$_ -is [Management.Automation.Language.AssignmentStatementAst] -and $_.Left.Extent.Text -eq '$Project'}
if($sourceAssignment.Right.Expression.Value -ne 'C:\Users\ZGAMESVN\Downloads\Soccer-Mobile-Pro-APK'){throw 'Incorrect relocated APK source path.'}
if($projectAssignment.Right.Expression.Value -ne 'C:\Users\ZGAMESVN\Downloads\Soccer-Mobile-Pro'){throw 'Incorrect relocated Unity project path.'}
& $pipeline -SelfTest
# Export preflight deliberately refuses an existing project; these tests are also
# useful after recovery, so do not require empty production output directories.

# Load only declared helpers and embedded source, never the recovery entry point.
$Utf8=New-Object Text.UTF8Encoding($false)
$StageTimeoutSeconds=120
$script:OwnedProcesses=New-Object System.Collections.Generic.List[Diagnostics.Process]
foreach($node in $ast.EndBlock.Statements) {
    if($node -is [Management.Automation.Language.FunctionDefinitionAst]) {Invoke-Expression $node.Extent.Text}
    if($node -is [Management.Automation.Language.AssignmentStatementAst] -and $node.Left.Extent.Text -in @('$RepairSource','$ValidatorSource')) {Invoke-Expression $node.Extent.Text}
}
$root=Join-Path ([IO.Path]::GetTempPath()) ('SoccerRecovery-Integration-'+[guid]::NewGuid().ToString('N'))
[void][IO.Directory]::CreateDirectory($root)
try {
    $Apk=Join-Path $root 'missing.apk'; $Ripper='missing-ripper'; $Dumper='missing-dumper'; $Editor='missing-editor'
    $missingRejected=$false
    try {Get-Preflight} catch {$missingRejected=$_.Exception.Message -like '*Required file missing*'}
    if(!$missingRejected){throw 'Missing-input preflight did not fail as expected.'}
    $sdk=Get-Sdk
    $validator=Join-Path $root 'validator'
    [void][IO.Directory]::CreateDirectory($validator)
    Write-Utf8 (Join-Path $validator 'Validator.cs') $ValidatorSource
    Write-Json (Join-Path $validator 'global.json') @{sdk=@{version=$sdk.Version;rollForward='disable'}}
    Write-Utf8 (Join-Path $validator 'NuGet.Config') '<configuration><packageSources><clear /></packageSources></configuration>'
    $managed='C:\Program Files\Unity\Hub\Editor\2020.3.49f1\Editor\Data\Managed'
    $references=@(Get-ChildItem -LiteralPath $managed -Recurse -Filter 'Unity*.dll' | Where-Object {$_.DirectoryName -eq $managed -or $_.DirectoryName -eq (Join-Path $managed 'UnityEngine')} | ForEach-Object {
        '<Reference Include="'+[Security.SecurityElement]::Escape($_.BaseName)+'"><HintPath>'+[Security.SecurityElement]::Escape($_.FullName)+'</HintPath></Reference>'
    }) -join "`n"
    Write-Utf8 (Join-Path $validator 'Validator.csproj') "<Project Sdk=`"Microsoft.NET.Sdk`"><PropertyGroup><TargetFramework>$($sdk.Tfm)</TargetFramework><NuGetAudit>false</NuGetAudit></PropertyGroup><ItemGroup>$references</ItemGroup></Project>"
    Invoke-Owned $sdk.Exe @('build','Validator.csproj','--nologo') $validator (Join-Path $root 'validator-compile') 120

    $installed='C:\Tools\AssetRipper'
    $installedConfig=Join-Path $installed 'AssetRipper.Settings.json'
    $before=if(Test-Path -LiteralPath $installedConfig){(Get-FileHash -LiteralPath $installedConfig).Hash}else{'ABSENT'}
    $copy=Join-Path $root 'AssetRipper'
    Copy-Item -LiteralPath $installed -Destination $copy -Recurse
    $listener=New-Object Net.Sockets.TcpListener([Net.IPAddress]::Loopback,0)
    $listener.Start(); $port=$listener.LocalEndpoint.Port; $listener.Stop()
    $p=Start-Owned (Join-Path $copy 'AssetRipper.GUI.Premium.exe') @('--headless','--port',"$port",'--log-path',(Join-Path $root 'assetripper.log')) $copy (Join-Path $root 'assetripper')
    $base="http://127.0.0.1:$port"; $ready=$false; $timer=[Diagnostics.Stopwatch]::StartNew()
    while($timer.Elapsed.TotalSeconds -lt 60 -and !$p.HasExited) {
        try {$page=Invoke-WebRequest "$base/Settings/Edit" -UseBasicParsing -TimeoutSec 2; $ready=$true; break} catch {}
        Start-Sleep -Milliseconds 500; $p.Refresh()
    }
    if(!$ready){throw 'AssetRipper did not start.'}
    if(@(Get-NetTCPConnection -LocalPort $port -State Listen | Where-Object OwningProcess -eq $p.Id).Count -ne 1){throw 'Unexpected API port ownership.'}
    Invoke-RipperRequest $base '/Settings/Update' @{
        DefaultVersion='2020.3.49f1';TargetVersion='2020.3.49f1';ScriptContentLevel='Level1';ScriptExportMode='Decompiled';
        ScriptLanguageVersion='CSharp8_0';StreamingAssetsMode='Extract';ShaderExportMode='Decompile';
        ScriptTypesFullyQualified='on';RemoveNullableAttributes='on';ExportUnreadableAssets='on';SaveSettingsToDisk='on'
    } 60
    $saved=Get-Content -Encoding UTF8 -LiteralPath (Join-Path $copy 'AssetRipper.Settings.json') -Raw | ConvertFrom-Json
    if($saved.Import.TargetVersion -ne '2020.3.49f1' -or [int]$saved.Import.ScriptContentLevel -ne 1 -or [int]$saved.Export.ScriptExportMode -ne 0){throw 'API settings did not round trip.'}
    $after=if(Test-Path -LiteralPath $installedConfig){(Get-FileHash -LiteralPath $installedConfig).Hash}else{'ABSENT'}
    if($after -ne $before){throw 'Installed AssetRipper settings changed.'}
    Write-Host "Integration checks passed. No APK loaded. Evidence: $root"
} finally {
    foreach($p in $script:OwnedProcesses){try {if(!$p.HasExited){$p.Kill();$p.WaitForExit()}}finally{$p.Dispose()}}
}
