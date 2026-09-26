#requires -Version 5.1
<# Runs compile, UI, Boot, Lobby and GlobalConfig checks on the existing project. #>
[CmdletBinding()]
param([ValidateRange(60,86400)][int]$StageTimeoutSeconds=1200)
Set-StrictMode -Version Latest
$ErrorActionPreference='Stop'
. (Join-Path $PSScriptRoot 'Tools/RecoveryValidation.ps1')
$project='C:\Users\ZGAMESVN\Downloads\Soccer-Mobile-Pro'
$recovery='C:\Users\ZGAMESVN\Downloads\Soccer-Unity-Recovery'
$editor='C:\Program Files\Unity\Hub\Editor\2020.3.49f1\Editor\Unity.exe'
$run=Join-Path $recovery ('Runs\LobbyValidation-'+[DateTime]::UtcNow.ToString('yyyyMMdd-HHmmss')+'-'+[guid]::NewGuid().ToString('N').Substring(0,8))
$utf8=New-Object Text.UTF8Encoding($false)
$report=[ordered]@{status='Running';project=$project;targetVersion='2020.3.49f1';compilationSucceeded=$false;offlineUiSucceeded=$false;bootFlowSucceeded=$false;lobbyFlowSucceeded=$false;originalServicesRecovered=$false;gameplayRecovered=$false;knownMissingScripts=0;run=$run}
$report.validationId=[IO.Path]::GetFileName($run)
$report.globalConfigSucceeded=$false
$report.globalConfigTests=0
$report.sourceSnapshotBefore=Join-Path $run 'source-before.json'
$report.sourceSnapshotAfter=Join-Path $run 'source-after.json'
$report.inputsUnchanged=$false
function Write-Report { [IO.File]::WriteAllText((Join-Path $run 'lobby-validation.json'),(ConvertTo-Json $report -Depth 12),$utf8) }
function Quote-Arg([string]$value){'"'+[regex]::Replace([regex]::Replace($value,'(\\*)"','$1$1\"'),'(\\+)$','$1$1')+'"'}
function Run([string]$exe,[string[]]$arguments,[string]$name,[int]$timeoutSeconds=$StageTimeoutSeconds){
    $line=($arguments | ForEach-Object {Quote-Arg $_}) -join ' '
    $process=Start-Process -FilePath $exe -ArgumentList $line -WorkingDirectory $project -WindowStyle Hidden -PassThru -RedirectStandardOutput (Join-Path $run ($name+'.stdout.log')) -RedirectStandardError (Join-Path $run ($name+'.stderr.log'))
    $null=$process.Handle
    try { if(!$process.WaitForExit($timeoutSeconds*1000)){$process.Kill();$process.WaitForExit();throw "$name timed out; only its owned process was stopped."}; $process.WaitForExit(); if($process.ExitCode -ne 0){throw "$name exited with code $($process.ExitCode). See $run"} }
    finally {$process.Dispose()}
}
function Test-Xml([string]$path,[int]$expected,[string]$label){
    Assert-RecoveryTests $path $expected $label
}
foreach($path in @($editor,(Join-Path $project 'Assets/Recovery/Scenes/LobbyLaunch.unity'),(Join-Path $project 'Assets/Recovery/Scenes/LobbyStart.unity'),(Join-Path $project 'Assets/Recovery/Scenes/LobbyOffline.unity'),(Join-Path $project 'Assets/Recovery/Tests/Lobby/LobbyFlowPlayModeTests.cs'))){if(!(Test-Path -LiteralPath $path)){throw "Required Lobby recovery input missing: $path"}}
if(@(Get-CimInstance Win32_Process -Filter "Name='Unity.exe'" | Where-Object {$_.CommandLine -and $_.CommandLine.Replace('/','\').IndexOf($project,[StringComparison]::OrdinalIgnoreCase) -ge 0}).Count){throw 'Close this project Editor before validation; it will not be force-closed.'}
[void][IO.Directory]::CreateDirectory($run); Write-Report
try {
    $python=(Get-Command python -ErrorAction Stop).Source
    $snapshot=Join-Path $PSScriptRoot 'Tools/Capture-RecoverySnapshot.py'
    Run $python @('-B',$snapshot,'--output',$report.sourceSnapshotBefore) 'source-before'
    # The child has several individually bounded stages; its parent must allow their combined budget.
    Run (Join-Path $PSHOME 'powershell.exe') @('-NoProfile','-File',(Join-Path $PSScriptRoot 'Test-BootFlow.ps1'),'-StageTimeoutSeconds',"$StageTimeoutSeconds",'-ValidationId',$report.validationId) 'base-boot-validation' ($StageTimeoutSeconds*4+60)
    $base=Read-RecoveryBootReport (Get-Content (Join-Path $run 'base-boot-validation.stdout.log') -Raw) (Join-Path $recovery 'Runs') $project $report.targetVersion $report.validationId
    $baseReport=$base.Data
    $report.compilationSucceeded=$true;$report.offlineUiSucceeded=$true;$report.offlineUiTests=4;$report.bootFlowSucceeded=$true;$report.bootFlowTests=12;$report.baseReport=$base.Path;$report.assetIssues=$baseReport.assetIssues
    $report.artifacts=[ordered]@{
        compilationReport=$baseReport.compilationReport
        offlineUiXml=(Join-Path $baseReport.run 'offline-playmode.xml');offlineUiLog=(Join-Path $baseReport.run 'offline-playmode.log');offlineUiScreenshots=$baseReport.offlineUiScreenshots
        bootXml=(Join-Path $baseReport.run 'boot-playmode.xml');bootLog=(Join-Path $baseReport.run 'boot-playmode.log');bootTraceDirectory=$baseReport.run
        lobbyXml=(Join-Path $run 'lobby-playmode.xml');lobbyLog=(Join-Path $run 'lobby-playmode.log')
        globalConfigXml=(Join-Path $run 'globalconfig-playmode.xml');globalConfigLog=(Join-Path $run 'globalconfig-playmode.log');globalConfigScreenshot=(Join-Path $run 'globalconfig-lobby.png')
    };Write-Report
    $traceDirectory=Join-Path $run 'EventTrace';[void][IO.Directory]::CreateDirectory($traceDirectory)
    $previousTraceDirectory=$env:SOCCER_LOBBY_TRACE_DIR
    try {
        $env:SOCCER_LOBBY_TRACE_DIR=$traceDirectory
        Run $editor @('-batchmode','-projectPath',$project,'-runTests','-testPlatform','PlayMode','-testFilter','Soccer.Recovery.Tests.LobbyFlowPlayModeTests','-testResults',(Join-Path $run 'lobby-playmode.xml'),'-logFile',(Join-Path $run 'lobby-playmode.log')) 'lobby-playmode'
    } finally {$env:SOCCER_LOBBY_TRACE_DIR=$previousTraceDirectory}
    $report.lobbyFlowTests=Test-Xml (Join-Path $run 'lobby-playmode.xml') 13 'Soccer.Recovery.Tests.LobbyFlowPlayModeTests'
    $traceFiles=@(Get-ChildItem -LiteralPath $traceDirectory -Filter '*.trace.txt' -File)
    if($traceFiles.Count -ne 13){throw "Lobby test event trace expected 13 files; found $($traceFiles.Count)."}
    $report.eventTraceDirectory=$traceDirectory;$report.eventTraceFiles=$traceFiles.Count
    Assert-RecoveryLog $report.artifacts.lobbyLog
    $report.lobbyFlowSucceeded=$true;Write-Report
    $previousConfigReports=$env:SOCCER_GLOBALCONFIG_REPORTS
    try {
        $env:SOCCER_GLOBALCONFIG_REPORTS=$run
        Run $editor @('-batchmode','-projectPath',$project,'-runTests','-testPlatform','PlayMode','-testFilter','Soccer.Recovery.Tests.GlobalConfigPlayModeTests','-testResults',$report.artifacts.globalConfigXml,'-logFile',$report.artifacts.globalConfigLog) 'globalconfig-playmode'
    } finally {$env:SOCCER_GLOBALCONFIG_REPORTS=$previousConfigReports}
    $report.globalConfigTests=Test-Xml $report.artifacts.globalConfigXml 7 'Soccer.Recovery.Tests.GlobalConfigPlayModeTests'
    Assert-RecoveryLog $report.artifacts.globalConfigLog
    Assert-RecoveryImage $report.artifacts.globalConfigScreenshot
    $report.globalConfigSucceeded=$true
    $report.totalPassedTests=$report.offlineUiTests+$report.bootFlowTests+$report.lobbyFlowTests+$report.globalConfigTests
    if($report.totalPassedTests -ne 36){throw 'Offline recovery milestone requires all 36 tests.'}
    Run $python @('-B',$snapshot,'--output',$report.sourceSnapshotAfter,'--compare',$report.sourceSnapshotBefore) 'source-after'
    $report.inputsUnchanged=$true;$report.status='Passed';Write-Report
    Write-Host 'Offline recovery milestone passed: 36/36 tests, zero missing scripts. Real services, original GlobalConfig schema and gameplay remain unrecovered.'
    Write-Output "Lobby validation report: $(Join-Path $run 'lobby-validation.json')"
} catch {$report.status='Failed';$report.error=$_.Exception.Message;Write-Report;throw}
