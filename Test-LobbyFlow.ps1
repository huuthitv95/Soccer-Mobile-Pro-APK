#requires -Version 5.1
<# Runs compile, UI, boot and Lobby recovery checks on the existing project only. #>
[CmdletBinding()]
param([ValidateRange(60,86400)][int]$StageTimeoutSeconds=1200)
Set-StrictMode -Version Latest
$ErrorActionPreference='Stop'
$project='C:\Users\ZGAMESVN\Downloads\Soccer-Mobile-Pro'
$recovery='C:\Users\ZGAMESVN\Downloads\Soccer-Unity-Recovery'
$editor='C:\Program Files\Unity\Hub\Editor\2020.3.49f1\Editor\Unity.exe'
$run=Join-Path $recovery ('Runs\LobbyValidation-'+[DateTime]::UtcNow.ToString('yyyyMMdd-HHmmss')+'-'+[guid]::NewGuid().ToString('N').Substring(0,8))
$utf8=New-Object Text.UTF8Encoding($false)
$report=[ordered]@{status='Running';project=$project;targetVersion='2020.3.49f1';compilationSucceeded=$false;offlineUiSucceeded=$false;bootFlowSucceeded=$false;lobbyFlowSucceeded=$false;originalServicesRecovered=$false;gameplayRecovered=$false;knownMissingScripts=1;run=$run}
function Write-Report { [IO.File]::WriteAllText((Join-Path $run 'lobby-validation.json'),(ConvertTo-Json $report -Depth 12),$utf8) }
function Quote-Arg([string]$value){'"'+[regex]::Replace([regex]::Replace($value,'(\\*)"','$1$1\"'),'(\\+)$','$1$1')+'"'}
function Run([string]$exe,[string[]]$arguments,[string]$name){
    $line=($arguments | ForEach-Object {Quote-Arg $_}) -join ' '
    $process=Start-Process -FilePath $exe -ArgumentList $line -WorkingDirectory $project -WindowStyle Hidden -PassThru -RedirectStandardOutput (Join-Path $run ($name+'.stdout.log')) -RedirectStandardError (Join-Path $run ($name+'.stderr.log'))
    $null=$process.Handle
    try { if(!$process.WaitForExit($StageTimeoutSeconds*1000)){$process.Kill();$process.WaitForExit();throw "$name timed out; only its owned process was stopped."}; if($process.ExitCode -ne 0){throw "$name exited with code $($process.ExitCode). See $run"} }
    finally {$process.Dispose()}
}
function Test-Xml([string]$path,[int]$expected,[string]$label){
    if(!(Test-Path -LiteralPath $path)){throw "$label produced no NUnit XML."}
    [xml]$xml=Get-Content -LiteralPath $path -Raw
    $cases=@($xml.SelectNodes('//test-case'))
    $failed=@($cases | Where-Object {$_.result -ne 'Passed'})
    if($cases.Count -ne $expected -or $failed.Count){throw "$label expected $expected passing tests; got $($cases.Count), failed $($failed.Count)."}
    $cases.Count
}
foreach($path in @($editor,(Join-Path $project 'Assets/Recovery/Scenes/LobbyLaunch.unity'),(Join-Path $project 'Assets/Recovery/Scenes/LobbyStart.unity'),(Join-Path $project 'Assets/Recovery/Scenes/LobbyOffline.unity'),(Join-Path $project 'Assets/Recovery/Tests/Lobby/LobbyFlowPlayModeTests.cs'))){if(!(Test-Path -LiteralPath $path)){throw "Required Lobby recovery input missing: $path"}}
if(@(Get-CimInstance Win32_Process -Filter "Name='Unity.exe'" | Where-Object {$_.CommandLine -and $_.CommandLine.Replace('/','\').IndexOf($project,[StringComparison]::OrdinalIgnoreCase) -ge 0}).Count){throw 'Close this project Editor before validation; it will not be force-closed.'}
[void][IO.Directory]::CreateDirectory($run); Write-Report
try {
    Run (Join-Path $PSHOME 'powershell.exe') @('-NoProfile','-File',(Join-Path $PSScriptRoot 'Test-BootFlow.ps1'),'-StageTimeoutSeconds',"$StageTimeoutSeconds") 'base-boot-validation'
    $base=Get-ChildItem -LiteralPath (Join-Path $recovery 'Runs') -Directory -Filter 'BootValidation-*' | Sort-Object LastWriteTimeUtc -Descending | Select-Object -First 1
    $baseReport=Get-Content (Join-Path $base.FullName 'boot-validation.json') -Raw -Encoding UTF8 | ConvertFrom-Json
    if(!$baseReport.compilationSucceeded -or !$baseReport.offlineUiSucceeded -or !$baseReport.bootFlowSucceeded -or $baseReport.offlineUiTests -ne 4 -or $baseReport.bootFlowTests -ne 12){throw 'Existing compile/UI/boot validations did not meet their recorded pass criteria.'}
    $report.compilationSucceeded=$true;$report.offlineUiSucceeded=$true;$report.offlineUiTests=4;$report.bootFlowSucceeded=$true;$report.bootFlowTests=12;$report.baseReport=(Join-Path $base.FullName 'boot-validation.json');$report.assetIssues=$baseReport.assetIssues;Write-Report
    $traceDirectory=Join-Path $run 'EventTrace';[void][IO.Directory]::CreateDirectory($traceDirectory)
    $previousTraceDirectory=$env:SOCCER_LOBBY_TRACE_DIR
    try {
        $env:SOCCER_LOBBY_TRACE_DIR=$traceDirectory
        Run $editor @('-batchmode','-projectPath',$project,'-runTests','-testPlatform','PlayMode','-testFilter','Soccer.Recovery.Tests.LobbyFlowPlayModeTests','-testResults',(Join-Path $run 'lobby-playmode.xml'),'-logFile',(Join-Path $run 'lobby-playmode.log')) 'lobby-playmode'
    } finally {$env:SOCCER_LOBBY_TRACE_DIR=$previousTraceDirectory}
    $report.lobbyFlowTests=Test-Xml (Join-Path $run 'lobby-playmode.xml') 13 'Lobby flow'
    $traceFiles=@(Get-ChildItem -LiteralPath $traceDirectory -Filter '*.trace.txt' -File)
    if($traceFiles.Count -ne 13){throw "Lobby test event trace expected 13 files; found $($traceFiles.Count)."}
    $report.eventTraceDirectory=$traceDirectory;$report.eventTraceFiles=$traceFiles.Count
    if((Get-Content (Join-Path $run 'lobby-playmode.log') -Raw) -match '(?im)(error CS\d+|Scripts have compiler errors|Assembly .* will not be loaded|Fatal Error!|Failed to load assembly|Safe Mode: Only loading)'){throw 'Lobby test log contains compile, assembly-load, or crash errors.'}
    $report.lobbyFlowSucceeded=$true;$report.status='PassedWithKnownMissingScript';Write-Report
    Write-Host "Offline Lobby flow passed. Real services and gameplay remain unrecovered. Report: $(Join-Path $run 'lobby-validation.json')"
} catch {$report.status='Failed';$report.error=$_.Exception.Message;Write-Report;throw}
