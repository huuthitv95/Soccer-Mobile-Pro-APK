#requires -Version 5.1
<# Runs existing-project validation followed by the isolated offline UI PlayMode tests.
   Does not repair code, generate scenes, change Build Settings or extract the APK. #>
[CmdletBinding()]
param([ValidateRange(60,86400)][int]$StageTimeoutSeconds=1200)
Set-StrictMode -Version Latest
$ErrorActionPreference='Stop'
$project='C:\Users\ZGAMESVN\Downloads\Soccer-Mobile-Pro'
$editor='C:\Program Files\Unity\Hub\Editor\2020.3.49f1\Editor\Unity.exe'
$recovery='C:\Users\ZGAMESVN\Downloads\Soccer-Unity-Recovery'
$run=Join-Path $recovery ('Runs\OfflineValidation-'+[DateTime]::UtcNow.ToString('yyyyMMdd-HHmmss')+'-'+[guid]::NewGuid().ToString('N').Substring(0,8))
$utf8=New-Object Text.UTF8Encoding($false)
$report=[ordered]@{status='Running';project=$project;targetVersion='2020.3.49f1';compilationSucceeded=$false;offlineUiSucceeded=$false;gameplayRecovered=$false;baselineMissingScripts=1;run=$run}
function Write-Report { [IO.File]::WriteAllText((Join-Path $run 'offline-validation.json'),(ConvertTo-Json $report -Depth 8),$utf8) }
function Quote-Arg([string]$v){'"'+[regex]::Replace([regex]::Replace($v,'(\\*)"','$1$1\"'),'(\\+)$','$1$1')+'"'}
function Run([string]$exe,[string[]]$arguments,[string]$name){
    $line=($arguments | ForEach-Object {Quote-Arg $_}) -join ' '
    $p=Start-Process -FilePath $exe -ArgumentList $line -WorkingDirectory $project -WindowStyle Hidden -PassThru -RedirectStandardOutput (Join-Path $run ($name+'.stdout.log')) -RedirectStandardError (Join-Path $run ($name+'.stderr.log'))
    $null=$p.Handle
    try {
        if(!$p.WaitForExit($StageTimeoutSeconds*1000)){$p.Kill(); $p.WaitForExit(); throw "$name timed out; only the owned process was stopped."}
        $p.WaitForExit()
        if($p.ExitCode -ne 0){throw "$name exited with code $($p.ExitCode). Inspect $run"}
    } finally {$p.Dispose()}
}
foreach($path in @($editor,(Join-Path $project 'Assets\Recovery\Scenes\OfflineUI.unity'),(Join-Path $project 'Assets\Recovery\Tests\PlayMode\OfflineUIPlayModeTests.cs'))){if(!(Test-Path -LiteralPath $path)){throw "Required offline UI input missing: $path"}}
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
    $report.compilationSucceeded=$true
    $issues=@($compile.validation.items | Where-Object {$_.missingScripts -gt 0 -or $_.error})
    $unexpected=@($issues | Where-Object {$_.path -ne 'Assets/gamedata/ui/windows/Win_GlobalConfig.prefab' -or $_.missingScripts -ne 1 -or $_.error})
    if($unexpected.Count -or @($compile.validation.editorErrors).Count){throw 'Asset validation regressed beyond the documented missing-script baseline.'}
    $report.assetIssues=$issues
    Write-Report
    $previous=[Environment]::GetEnvironmentVariable('SOCCER_OFFLINE_REPORTS','Process')
    try {
        [Environment]::SetEnvironmentVariable('SOCCER_OFFLINE_REPORTS',$run,'Process')
        Run $editor @('-batchmode','-projectPath',$project,'-runTests','-testPlatform','PlayMode','-testFilter','Soccer.Recovery.Tests.OfflineUIPlayModeTests','-testResults',(Join-Path $run 'playmode.xml'),'-logFile',(Join-Path $run 'playmode.log')) 'playmode'
    } finally {[Environment]::SetEnvironmentVariable('SOCCER_OFFLINE_REPORTS',$previous,'Process')}
    [xml]$results=Get-Content (Join-Path $run 'playmode.xml') -Raw
    $cases=@($results.SelectNodes('//test-case'))
    if($cases.Count -ne 4 -or @($cases | Where-Object {$_.result -ne 'Passed'}).Count){throw 'Offline UI requires all four PlayMode tests to pass; skipped or missing tests fail validation.'}
    $log=Get-Content (Join-Path $run 'playmode.log') -Raw
    if($log -match '(?im)(error CS\d+|Scripts have compiler errors|Assembly .* will not be loaded|Fatal Error!|Failed to load assembly|Safe Mode: Only loading)'){throw 'PlayMode log contains a compiler, assembly or crash error.'}
    foreach($screen in @('welcome-1920x1080.png','team-1920x1080.png','welcome-2560x1080.png','team-2560x1080.png')){if(!(Test-Path (Join-Path $run $screen))){throw "Screenshot missing: $screen"}}
    $report.offlineUiSucceeded=$true
    $report.passedTests=$cases.Count
    $report.status='PassedWithKnownAssetIssue'
    Write-Report
    Write-Host "Offline UI passed. Gameplay remains unrecovered. Report: $(Join-Path $run 'offline-validation.json')"
} catch {
    $report.status='Failed';$report.error=$_.Exception.Message;Write-Report;throw
}
