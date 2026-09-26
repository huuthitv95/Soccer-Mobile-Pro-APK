#requires -Version 5.1
# Synthetic result/process checks. Does not start Unity or change either project.
Set-StrictMode -Version Latest
$ErrorActionPreference='Stop'
. (Join-Path $PSScriptRoot 'Tools/RecoveryValidation.ps1')
$run=Join-Path ([IO.Path]::GetTempPath()) ('SoccerMilestoneContract-'+[guid]::NewGuid().ToString('N'))
[void][IO.Directory]::CreateDirectory($run)
$checks=0
function Reject([scriptblock]$Action,[string]$Label) {
    $rejected=$false
    try { & $Action | Out-Null } catch { $rejected=$true }
    if(!$rejected){throw "Invalid result accepted: $Label"}
    $script:checks++
}
try {
    foreach($name in @('Recover-SoccerUnity.ps1','Test-OfflineUI.ps1','Test-BootFlow.ps1','Test-LobbyFlow.ps1','Test-BootFlowPipeline.ps1','Test-MilestonePipeline.ps1','Tools/RecoveryValidation.ps1')) {
        $tokens=$null;$errors=$null
        $ast=[Management.Automation.Language.Parser]::ParseFile((Join-Path $PSScriptRoot $name),[ref]$tokens,[ref]$errors)
        if($errors.Count){throw "Parse failed: $name : $errors"}
        if($name -eq 'Test-LobbyFlow.ps1'){
            $runner=$ast.Find({param($n) $n -is [Management.Automation.Language.FunctionDefinitionAst] -and $n.Name -eq 'Run'},$true)
            $quote=$ast.Find({param($n) $n -is [Management.Automation.Language.FunctionDefinitionAst] -and $n.Name -eq 'Quote-Arg'},$true)
        }
        $checks++
    }
    $suite='Soccer.Recovery.Tests.GlobalConfigPlayModeTests'
    $xml=Join-Path $run 'tests.xml'
    $valid='<test-run result="Passed">'+((1..7 | ForEach-Object {'<test-case fullname="'+$suite+'.Case'+$_+'" result="Passed" />'}) -join '')+'</test-run>'
    [IO.File]::WriteAllText($xml,$valid)
    if((Assert-RecoveryTests $xml 7 $suite) -ne 7){throw 'Valid XML rejected'};$checks++
    foreach($result in @('Failed','Skipped','Inconclusive')){
        [IO.File]::WriteAllText($xml,$valid.Replace('Case1" result="Passed"',('Case1" result="'+$result+'"')))
        Reject {Assert-RecoveryTests $xml 7 $suite} $result
    }
    foreach($invalid in @($valid.Replace('Case7','Case6'),$valid.Replace($suite,'Wrong.Suite'),$valid.Replace('<test-run result="Passed">','<test-run result="Failed">'),'<test-run result="Passed"/>','<broken')){
        [IO.File]::WriteAllText($xml,$invalid);Reject {Assert-RecoveryTests $xml 7 $suite} 'invalid NUnit'
    }
    Reject {Assert-RecoveryTests (Join-Path $run 'missing.xml') 7 $suite} 'missing XML'
    $boot=Join-Path $run 'boot-validation.json'
    $data=[ordered]@{status='Passed';project='project';targetVersion='2020.3.49f1';validationId='this-run';compilationSucceeded=$true;offlineUiSucceeded=$true;bootFlowSucceeded=$true;offlineUiTests=4;bootFlowTests=12;baselineMissingScripts=0;assetIssues=@();run=$run}
    function Save-Boot { [IO.File]::WriteAllText($boot,($data | ConvertTo-Json -Depth 5)) }
    Save-Boot
    $output="Boot validation report: $boot"
    $accepted=Read-RecoveryBootReport $output $run 'project' '2020.3.49f1' 'this-run'
    if($accepted.Path -ne $boot){throw 'Wrong report selected'};$checks++
    foreach($key in @('status','project','targetVersion','validationId','run')){
        $old=$data[$key];$data[$key]='wrong';Save-Boot
        Reject {Read-RecoveryBootReport $output $run 'project' '2020.3.49f1' 'this-run'} "wrong $key"
        $data[$key]=$old
    }
    foreach($key in @('compilationSucceeded','offlineUiSucceeded','bootFlowSucceeded')){
        $data[$key]=$false;Save-Boot
        Reject {Read-RecoveryBootReport $output $run 'project' '2020.3.49f1' 'this-run'} $key
        $data[$key]=$true
    }
    $data.assetIssues=@('missing script');Save-Boot
    Reject {Read-RecoveryBootReport $output $run 'project' '2020.3.49f1' 'this-run'} 'asset issue'
    $data.assetIssues=@();Save-Boot
    Reject {Read-RecoveryBootReport '' $run 'project' '2020.3.49f1' 'this-run'} 'missing marker'
    Reject {Read-RecoveryBootReport ($output+"`n"+$output) $run 'project' '2020.3.49f1' 'this-run'} 'ambiguous marker'
    Reject {Read-RecoveryBootReport $output (Join-Path $run 'other') 'project' '2020.3.49f1' 'this-run'} 'outside root'
    $log=Join-Path $run 'unity.log'
    foreach($error in @('error CS0001','Fatal Error!','Failed to load assembly')){
        [IO.File]::WriteAllText($log,$error);Reject {Assert-RecoveryLog $log} 'Unity error'
    }
    Reject {Assert-RecoveryLog (Join-Path $run 'absent.log')} 'missing log'
    Reject {Assert-RecoveryImage (Join-Path $run 'absent.png')} 'missing image'
    $image=Join-Path $run 'bad.png';[IO.File]::WriteAllText($image,'not png');Reject {Assert-RecoveryImage $image} 'invalid image'
    $truncated=New-Object byte[] 24
    [byte[]]$signature=137,80,78,71,13,10,26,10
    [Array]::Copy($signature,$truncated,8)
    [IO.File]::WriteAllBytes($image,$truncated)
    Reject {Assert-RecoveryImage $image} 'PNG signature without image data'
    Add-Type -AssemblyName System.Drawing
    $bitmap=New-Object Drawing.Bitmap(2,2)
    try {$bitmap.Save($image,[Drawing.Imaging.ImageFormat]::Png)} finally {$bitmap.Dispose()}
    Assert-RecoveryImage $image;$checks++
    # Exercise the actual bounded runner without invoking the pipeline or Unity.
    . ([scriptblock]::Create($runner.Extent.Text))
    . ([scriptblock]::Create($quote.Extent.Text))
    $StageTimeoutSeconds=10
    $project=$PSScriptRoot
    Run (Join-Path $PSHOME 'powershell.exe') @('-NoProfile','-Command','exit 0') 'success';$checks++
    Reject {Run (Join-Path $PSHOME 'powershell.exe') @('-NoProfile','-Command','exit 9') 'nonzero'} 'nonzero process'
    Reject {Run (Join-Path $PSHOME 'powershell.exe') @('-NoProfile','-Command','Start-Sleep -Seconds 10') 'timeout' 1} 'process timeout'
    & (Join-Path $PSScriptRoot 'Test-BootFlowPipeline.ps1')
    Write-Host "Milestone pipeline contract passed: $checks result/parse/process checks plus mode exclusivity and overwrite refusal."
} finally {
    $resolved=[IO.Path]::GetFullPath($run)
    $tempRoot=[IO.Path]::GetFullPath([IO.Path]::GetTempPath()).TrimEnd('\')+'\'
    if(!$resolved.StartsWith($tempRoot,[StringComparison]::OrdinalIgnoreCase) -or [IO.Path]::GetFileName($resolved) -notlike 'SoccerMilestoneContract-*'){throw 'Refusing cleanup outside the owned temporary fixture.'}
    Remove-Item -LiteralPath $resolved -Recurse -Force
}
