#requires -Version 5.1
<# Validates the existing Unity project only. It does not extract, repair, modify
   scenes, or change Build Settings. The project Editor must be closed. #>
[CmdletBinding()]
param([ValidateRange(60,86400)][int]$StageTimeoutSeconds=1200)
Set-StrictMode -Version Latest
$ErrorActionPreference='Stop'
$project='C:\Users\ZGAMESVN\Downloads\Soccer-Mobile-Pro'
$editor='C:\Program Files\Unity\Hub\Editor\2020.3.49f1\Editor\Unity.exe'
$recovery='C:\Users\ZGAMESVN\Downloads\Soccer-Unity-Recovery'
$run=Join-Path $recovery ('Runs\BootValidation-'+[DateTime]::UtcNow.ToString('yyyyMMdd-HHmmss')+'-'+[guid]::NewGuid().ToString('N').Substring(0,8))
$utf8=New-Object Text.UTF8Encoding($false)
$report=[ordered]@{status='Running';project=$project;targetVersion='2020.3.49f1';compilationSucceeded=$false;offlineUiSucceeded=$false;bootFlowSucceeded=$false;lobbyRecovered=$false;gameplayRecovered=$false;originalServicesRecovered=$false;scope='Verified StartGame gates/callbacks with synthetic profile and Editor scene adapter';baselineMissingScripts=1;run=$run}
function Write-Report { [IO.File]::WriteAllText((Join-Path $run 'boot-validation.json'),(ConvertTo-Json $report -Depth 10),$utf8) }
function Quote-Arg([string]$value){'"'+[regex]::Replace([regex]::Replace($value,'(\\*)"','$1$1\"'),'(\\+)$','$1$1')+'"'}
function Run([string]$exe,[string[]]$arguments,[string]$name){
    $line=($arguments | ForEach-Object {Quote-Arg $_}) -join ' '
    $process=Start-Process -FilePath $exe -ArgumentList $line -WorkingDirectory $project -WindowStyle Hidden -PassThru -RedirectStandardOutput (Join-Path $run ($name+'.stdout.log')) -RedirectStandardError (Join-Path $run ($name+'.stderr.log'))
    $null=$process.Handle
    try { if(!$process.WaitForExit($StageTimeoutSeconds*1000)){$process.Kill();$process.WaitForExit();throw "$name timed out; only its owned process was stopped."}; if($process.ExitCode -ne 0){throw "$name exited with code $($process.ExitCode). Inspect $run"} }
    finally {$process.Dispose()}
}
function Assert-TestResult([string]$path,[int]$expected,[string]$label){
    if(!(Test-Path -LiteralPath $path)){throw "$label produced no test result XML."}
    [xml]$xml=Get-Content -LiteralPath $path -Raw
    $cases=@($xml.SelectNodes('//test-case'))
    if($cases.Count -ne $expected -or @($cases | Where-Object {$_.result -ne 'Passed'}).Count){throw "$label requires $expected passed PlayMode tests."}
    return $cases.Count
}
foreach($path in @($editor,(Join-Path $project 'Assets\Recovery\Scenes\OfflineUI.unity'),(Join-Path $project 'Assets\Recovery\Scenes\BootLaunch.unity'),(Join-Path $project 'Assets\Recovery\Scenes\BootStart.unity'),(Join-Path $project 'Assets\Recovery\Tests\BootFlow\BootFlowPlayModeTests.cs'))){if(!(Test-Path -LiteralPath $path)){throw "Required boot recovery input missing: $path"}}
if(@(Get-CimInstance Win32_Process -Filter "Name='Unity.exe'" | Where-Object {$_.CommandLine -and $_.CommandLine.Replace('/','\').IndexOf($project,[StringComparison]::OrdinalIgnoreCase) -ge 0}).Count){throw 'Close this project Editor before validation; it will not be force-closed.'}
[void][IO.Directory]::CreateDirectory($run)
Write-Report
try {
    $powershell=Join-Path $PSHOME 'powershell.exe'
    Run $powershell @('-NoProfile','-File',(Join-Path $PSScriptRoot 'Recover-SoccerUnity.ps1'),'-ValidateOnly','-StageTimeoutSeconds',"$StageTimeoutSeconds") 'compile-validation'
    $output=Get-Content (Join-Path $run 'compile-validation.stdout.log') -Raw
    if($output -notmatch '(?m)^Recovery run: (.+)\r?$'){throw 'Compilation report path was not returned.'}
    $compileRun=$Matches[1].Trim()
    if(!$compileRun.StartsWith($recovery+'\Runs\',[StringComparison]::OrdinalIgnoreCase)){throw 'Unexpected compilation report location.'}
    $compile=Get-Content (Join-Path $compileRun 'Reports\recovery.json') -Raw -Encoding UTF8 | ConvertFrom-Json
    $report.compilationReport=Join-Path $compileRun 'Reports\recovery.json'
    if(!$compile.validation.compiled -or $compile.targetVersion -ne $report.targetVersion -or $compile.project -ne $project){throw 'Compilation/version validation failed.'}
    $issues=@($compile.validation.items | Where-Object {$_.missingScripts -gt 0 -or $_.error})
    $unexpected=@($issues | Where-Object {$_.path -ne 'Assets/gamedata/ui/windows/Win_GlobalConfig.prefab' -or $_.missingScripts -ne 1 -or $_.error})
    if($unexpected.Count -or @($compile.validation.editorErrors).Count){throw 'Asset validation regressed beyond the documented missing-script baseline.'}
    $report.compilationSucceeded=$true;$report.assetIssues=$issues;Write-Report
    Run $editor @('-batchmode','-projectPath',$project,'-runTests','-testPlatform','PlayMode','-testFilter','Soccer.Recovery.Tests.OfflineUIPlayModeTests','-testResults',(Join-Path $run 'offline-playmode.xml'),'-logFile',(Join-Path $run 'offline-playmode.log')) 'offline-playmode'
    $report.offlineUiTests=Assert-TestResult (Join-Path $run 'offline-playmode.xml') 4 'Offline UI'
    $previous=[Environment]::GetEnvironmentVariable('SOCCER_BOOT_REPORTS','Process')
    try {
        [Environment]::SetEnvironmentVariable('SOCCER_BOOT_REPORTS',$run,'Process')
        Run $editor @('-batchmode','-projectPath',$project,'-runTests','-testPlatform','PlayMode','-testFilter','Soccer.Recovery.Tests.BootFlowPlayModeTests','-testResults',(Join-Path $run 'boot-playmode.xml'),'-logFile',(Join-Path $run 'boot-playmode.log')) 'boot-playmode'
    } finally {[Environment]::SetEnvironmentVariable('SOCCER_BOOT_REPORTS',$previous,'Process')}
    $report.bootFlowTests=Assert-TestResult (Join-Path $run 'boot-playmode.xml') 12 'Boot flow'
    if(@(Get-ChildItem -LiteralPath $run -Filter '*.events.txt').Count -ne 12){throw 'Per-test boot event traces are incomplete.'}
    foreach($log in @('offline-playmode.log','boot-playmode.log')){if((Get-Content (Join-Path $run $log) -Raw) -match '(?im)(error CS\d+|Scripts have compiler errors|Assembly .* will not be loaded|Fatal Error!|Failed to load assembly|Safe Mode: Only loading)'){throw "PlayMode log contains a compiler, assembly, or crash error: $log"}}
    $report.offlineUiSucceeded=$true;$report.bootFlowSucceeded=$true;$report.status='PassedWithKnownAssetIssue';Write-Report
    Write-Host "Boot flow passed. Lobby and gameplay remain unrecovered. Report: $(Join-Path $run 'boot-validation.json')"
} catch {$report.status='Failed';$report.error=$_.Exception.Message;Write-Report;throw}
