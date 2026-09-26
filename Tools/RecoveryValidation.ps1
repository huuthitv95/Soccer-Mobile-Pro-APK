# Shared, side-effect-free result checks used by the milestone and its contract tests.
function Assert-RecoveryTests([string]$Path, [int]$Expected, [string]$Suite) {
    if (!(Test-Path -LiteralPath $Path -PathType Leaf)) { throw "$Suite produced no NUnit XML." }
    [xml]$xml = Get-Content -LiteralPath $Path -Raw -Encoding UTF8
    $cases = @($xml.SelectNodes('//test-case'))
    $names = @($cases | ForEach-Object { $_.fullname } | Select-Object -Unique)
    $bad = @($cases | Where-Object { $_.result -ne 'Passed' -or !$_.fullname.StartsWith($Suite+'.',[StringComparison]::Ordinal) })
    if ($xml.DocumentElement.result -ne 'Passed' -or $cases.Count -ne $Expected -or $names.Count -ne $Expected -or $bad.Count) {
        throw "$Suite requires exactly $Expected distinct passing tests and a passing NUnit run."
    }
    return $cases.Count
}

function Read-RecoveryBootReport([string]$Output, [string]$RunsRoot, [string]$Project, [string]$Version, [string]$ValidationId) {
    $markers = [regex]::Matches($Output, '(?m)^Boot validation report: ([^\r\n]+)\r?$')
    if ($markers.Count -ne 1) { throw 'Expected exactly one Boot validation report marker.' }
    $path = [IO.Path]::GetFullPath($markers[0].Groups[1].Value.Trim())
    $root = [IO.Path]::GetFullPath($RunsRoot).TrimEnd('\') + '\'
    if (!$path.StartsWith($root,[StringComparison]::OrdinalIgnoreCase) -or [IO.Path]::GetFileName($path) -ne 'boot-validation.json') {
        throw 'Unexpected Boot report location.'
    }
    $data = Get-Content -LiteralPath $path -Raw -Encoding UTF8 | ConvertFrom-Json
    if ($data.status -ne 'Passed' -or $data.project -ne $Project -or $data.targetVersion -ne $Version -or $data.validationId -ne $ValidationId -or
        !$data.compilationSucceeded -or !$data.offlineUiSucceeded -or !$data.bootFlowSucceeded -or $data.offlineUiTests -ne 4 -or $data.bootFlowTests -ne 12 -or
        $data.baselineMissingScripts -ne 0 -or @($data.assetIssues).Count -ne 0 -or
        [IO.Path]::GetFullPath($data.run) -ne [IO.Path]::GetDirectoryName($path)) {
        throw 'Boot report does not match this successful project/version/validation run.'
    }
    return [pscustomobject]@{Path=$path; Data=$data}
}

function Assert-RecoveryLog([string]$Path) {
    if (!(Test-Path -LiteralPath $Path -PathType Leaf)) { throw "Missing Unity log: $Path" }
    if ((Get-Content -LiteralPath $Path -Raw) -match '(?im)(error CS\d+|Scripts have compiler errors|Assembly .* will not be loaded|Fatal Error!|Failed to load assembly|Safe Mode: Only loading)') {
        throw "Unity log contains compile, assembly-load, or crash errors: $Path"
    }
}

function Assert-RecoveryImage([string]$Path) {
    if (!(Test-Path -LiteralPath $Path -PathType Leaf)) { throw "Missing screenshot: $Path" }
    $bytes = [IO.File]::ReadAllBytes($Path)
    if ($bytes.Length -lt 24 -or [BitConverter]::ToString($bytes,0,8) -ne '89-50-4E-47-0D-0A-1A-0A') { throw "Invalid PNG: $Path" }
    # A PNG signature alone also accepts truncated/corrupt screenshots.
    Add-Type -AssemblyName System.Drawing
    $stream=New-Object IO.MemoryStream(,$bytes)
    $decoded=$null
    try {
        $decoded=[Drawing.Image]::FromStream($stream,$true,$true)
        if($decoded.RawFormat.Guid -ne [Drawing.Imaging.ImageFormat]::Png.Guid -or $decoded.Width -le 0 -or $decoded.Height -le 0){throw "Invalid PNG image: $Path"}
    } finally {if($null -ne $decoded){$decoded.Dispose()};$stream.Dispose()}
}
