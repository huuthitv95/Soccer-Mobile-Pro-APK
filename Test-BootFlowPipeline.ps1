#requires -Version 5.1
# Contract checks only: parse, mode exclusivity, and default overwrite refusal.
# No extraction, source transformation, or Unity process is started.
$ErrorActionPreference='Stop'
$pipeline=Join-Path $PSScriptRoot 'Recover-SoccerUnity.ps1'
foreach($name in @('Recover-SoccerUnity.ps1','Test-BootFlow.ps1','Test-LobbyFlow.ps1','Test-BootFlowPipeline.ps1')) {
    $tokens=$null;$errors=$null
    [void][Management.Automation.Language.Parser]::ParseFile((Join-Path $PSScriptRoot $name),[ref]$tokens,[ref]$errors)
    if($errors.Count){throw "PowerShell parse failed for ${name}: $errors"}
}
foreach($mode in @('SelfTest','PreflightOnly','RepairExisting','ValidateOnly','ValidateOfflineUI','ValidateBootFlow')) {
    $arguments=@{ValidateLobbyFlow=$true};$arguments[$mode]=$true
    $rejected=$false
    try { & $pipeline @arguments } catch {
        if($_.Exception.Message -notlike 'Choose one mode:*'){throw}
        $rejected=$true
    }
    if(!$rejected){throw "ValidateBootFlow was not exclusive with $mode"}
}
$project='C:\Users\ZGAMESVN\Downloads\Soccer-Mobile-Pro'
if(!(Test-Path -LiteralPath (Join-Path $project 'Assets'))){throw 'This overwrite-refusal test requires the existing project.'}
$rejected=$false
try { & $pipeline } catch {
    if($_.Exception.Message -notlike 'Refusing to overwrite*'){throw}
    $rejected=$true
}
if(!$rejected){throw 'Default export did not refuse the existing project.'}
Write-Host 'Lobby pipeline contract passed: parse, six exclusive mode pairs, existing-project refusal.'
