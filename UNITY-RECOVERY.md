# Soccer Mobile Pro: Unity recovery automation

The self-contained script is [Recover-SoccerUnity.ps1](Recover-SoccerUnity.ps1). Its complete source is reproduced in the PowerShell block below. It targets a **compiling asset/type recovery project**, not restored gameplay. Dummy assemblies contain type information and stub methods; they are not concrete implementations of the original game.

## Execute

Use Windows PowerShell 5.1. The installed .NET SDK 9.0.316 builds the embedded Roslyn helper; the script supports installed SDKs 8 or newer and does not install tools. Unity needs a valid local license, and package resolution may need network access.

```powershell
# Repair the existing Soccer-Mobile-Pro, then compile and validate it.
& 'C:\Users\ZGAMESVN\Downloads\Soccer-Mobile-Pro-APK\Recover-SoccerUnity.ps1' -RepairExisting

# Validate the existing project without running source transformations.
& 'C:\Users\ZGAMESVN\Downloads\Soccer-Mobile-Pro-APK\Recover-SoccerUnity.ps1' -ValidateOnly

# Read-only tool, input, version, output-path and APK hash checks.
& 'C:\Users\ZGAMESVN\Downloads\Soccer-Mobile-Pro-APK\Recover-SoccerUnity.ps1' -PreflightOnly

# Synthetic tests plus installed AssetRipper API and Unity assembly checks.
# Does not load or extract Soccer-Mobile-Pro.apk.
& 'C:\Users\ZGAMESVN\Downloads\Soccer-Mobile-Pro-APK\Test-RecoveryPipeline.ps1'

# Perform recovery and Unity import/compilation/asset validation.
& 'C:\Users\ZGAMESVN\Downloads\Soccer-Mobile-Pro-APK\Recover-SoccerUnity.ps1'

# Inspect the result after a recovery run.
Get-Content -LiteralPath 'C:\Users\ZGAMESVN\Downloads\Soccer-Unity-Recovery\Reports\recovery.json' -Raw
```

Default APK export and its `-PreflightOnly` checks require empty output directories. `-RepairExisting` and `-ValidateOnly` operate on the existing project and create unique `Soccer-Unity-Recovery\Runs\<timestamp-id>` report directories. Modes are mutually exclusive. Repair snapshots include scripts, metadata, assembly definitions, Packages and ProjectSettings, with SHA-256 hashes. Existing reports and export artifacts are retained. Each processing stage defaults to a two-hour timeout, adjustable through `-StageTimeoutSeconds`.

Close the Unity Editor for this project before using either existing-project mode. The script refuses to force-close an existing editor. `-ValidateOnly` does not transform source; normal Unity import may still update its cache and generated metadata. Existing-project operations use an exclusive filesystem lock.

After a successful run, select **Add project from disk** in Unity Hub and choose `C:\Users\ZGAMESVN\Downloads\Soccer-Mobile-Pro`, using editor **2020.3.49f1**.

## Exact inputs and processing

| Input | Fixed location |
| --- | --- |
| APK | `C:\Users\ZGAMESVN\Downloads\Soccer-Mobile-Pro-APK\Soccer-Mobile-Pro.apk` |
| Java evidence | `C:\Users\ZGAMESVN\Downloads\Soccer-Mobile-Pro-APK\app\src\main\java` |
| AssetRipper | `C:\Tools\AssetRipper\AssetRipper.GUI.Premium.exe` |
| Il2CppDumper | `C:\Tools\Il2CppDumper\Il2CppDumper.exe` |
| Unity Editor | `C:\Program Files\Unity\Hub\Editor\2020.3.49f1\Editor\Unity.exe` |

1. Validate the tools and empty output directories, record SHA-256 hashes, then acquire a recovery ownership marker. The AssetRipper HTTP adapter is pinned to the installed `2.0.0+1ac666f47d8e9dedf96afb0b914c70d7656151ea` build; other builds fail preflight rather than receive guessed commands.
2. Inspect the APK archive. For IL2CPP, extract exactly `lib/arm64-v8a/libil2cpp.so` and `assets/bin/Data/Managed/Metadata/global-metadata.dat`. Validate ELF architecture and metadata magic. Detect managed Mono separately. Missing or ambiguous required inputs stop processing.
3. Run a private Il2CppDumper copy with noninteractive settings, verify its artifacts, and copy its supplied IDA/Ghidra Python scripts beside `script.json` and `il2cpp.h`. IDA and Ghidra themselves are not launched; annotation scripts and native pseudocode do not recover executable C# gameplay.
4. Run a private AssetRipper copy as a hidden loopback service. Use `/Settings/Update`, `/LoadFile`, and `/Export/UnityProject`; verify settings persisted before loading. Request `Level1` method stubs, `Decompiled` C# output, C# 8.0, shader decompilation, and StreamingAssets extraction.
5. Detect the source Unity version from the serialized header, then request target conversion to **2020.3.49f1**. Local source assets identify **2020.3.49f1**. This conversion is experimental; the script does not just relabel `ProjectVersion.txt`.
6. Normalize an exporter-created wrapper if necessary and preserve the entire initial export. Keep script `.meta` files, names, namespaces and assembly boundaries. Require `Assets\Scripts`; stop on unexpected DLLs or a conflicting structure instead of blindly moving or deleting definitions.
7. Repair generated C# syntax trees and write Java bridge evidence with candidate C# method matches. `UnitySendMessage` names identify scene objects, so candidate matches are explicitly unverified. Reflection and dynamic JNI calls remain manual research items.
8. Import with the exact installed Unity editor. Preserve the exported package manifest and let that editor resolve it. Package incompatibilities stop validation and remain in the Unity log; the script does not guess replacements or silently install SDK integrations.
9. Validate compilation, scenes, prefabs, shaders, and representative texture/audio/material/mesh imports. Scene checks open additively and close without saving. These are structural checks; no gameplay or Android build is claimed.

## Compilation repair boundaries

The same embedded Roslyn helper operates on a new export or a backed-up existing project. It converts ILSpy-marked parameterized properties into C# indexers, preserving overloads, explicit interfaces, generic types and virtual/override chains. It rewrites accessor invocations by resolved symbols and renames setter parameters by symbol. Ambiguous signatures, method groups and unsupported argument forms fail before committing indexer changes. Ordinary unmarked `get_Item` methods are not converted.

It also fills absent or empty non-abstract method bodies, initializes `out` parameters, provides default value returns, fills empty getters/operators, and adds throwing stubs for absent constructors. Ref-return and async stubs throw `NotImplementedException` rather than invent storage or asynchronous behavior. Existing iterator bodies, interface contracts, abstract declarations, partial methods and auto-properties are preserved. Invalid syntax is reported without rewriting that file. Output is checked as C# 8; the external helper itself uses the installed .NET SDK.

Recognized editor/runtime initialization and edit-mode execution attributes are removed from recovered code before import, including simple using-alias forms. Every edit is recorded; this reduces automatic execution of unfinished scripts but is not an execution sandbox.

Explicit layouts are preserved by default. `-ConfirmedNonInteropLayoutTypes` accepts an array of reviewed, fully qualified type names; only those types can have explicit-layout and field-offset attributes removed. Types marked with native interop attributes remain excluded even when listed. Review external uses and ABI requirements before supplying this parameter. No actual type in this APK has been asserted safe for layout removal.

Dummy DLLs remain outside `Assets`. The script never combines dummy types with their generated C# counterparts. Unity's compiler performs semantic type/assembly checks; unsupported generated constructs, duplicate definitions, missing base constructors, and unresolved dependencies are reported as failures rather than hidden by deleting scripts.

## Directory blueprint

```text
C:\Users\ZGAMESVN\Downloads\Soccer-Mobile-Pro\
  Assets\
    Scripts\                         Generated C# and original script GUIDs
    [exported asset folders]          Scenes, prefabs, shaders, textures, audio, etc.
    StreamingAssets\                 When present in the APK
    SoccerRecoveryValidation\Editor\ Editor-only validation source and assembly
  Packages\                          Exported dependency manifest
  ProjectSettings\                   Exported/converted Unity settings
  Library\                           Generated by Unity on import

C:\Users\ZGAMESVN\Downloads\Soccer-Unity-Recovery\
  recovery-owner.lock                 Persistent run ownership marker
  Extracted\                         Matched original binary/metadata/header files
  Tools\                             Private AssetRipper/dumper and compiled repair helper
  OriginalExport\                    Untouched export before repairs/import
  Il2Cpp\
    DummyDll\                        Reference-only reconstructed assemblies
    dump.cs                          Declaration dump, not an importable source file
    script.json
    stringliteral.json
    il2cpp.h
    [IDA/Ghidra scripts]
  Reports\
    recovery.json                    Overall status, stage, input hashes and results
    assetripper-settings.json         Effective exporter configuration
    script-repairs.json               Edits, warnings, syntax errors and type inventory
    java-bridges.json                 Java/JNI evidence and candidate C# matches
    original-guids.json               Original export GUID inventory
    external-or-missing-references.json
    unexpected-assemblies.json
    unity-validation.json             Produced only when Unity validation completes
  Logs\                              Command arguments, stdout/stderr and Unity/tool logs
```

`Compiled` means editor compilation and the implemented asset checks completed without reported issues. `CompiledWithAssetIssues` means compilation passed but asset loading, shader, missing-script, editor-error or unresolved-reference checks need review. References outside `Assets` can legitimately belong to packages; they are flagged for review rather than presumed broken. `Failed` records the stopping stage and exception; inspect the corresponding log. Preflight errors occur before output creation and are printed directly.

## Verification performed

Verified on this machine: PowerShell parsing; read-only preflight; offline Roslyn helper build; compilation of repaired synthetic fixtures; missing/empty bodies, ref/out/async and iterator cases; alias hook removal; reviewed versus interop layout handling; preservation of invalid source; existing-output refusal; path traversal rejection; IL2CPP metadata magic and ARM64 header checks; occupied ports; process timeouts and nonzero exit handling; Unity validator compilation against the installed editor assemblies; and live AssetRipper settings round-trip without altering its installed configuration.

**Existing-project repair has been executed successfully on Unity 2020.3.49f1.** The successful run is `C:\Users\ZGAMESVN\Downloads\Soccer-Unity-Recovery\Runs\20260924-111756-2adeded8`. It compiled the project and validated 17 scenes, 2,572 prefabs, 93 shaders, and 40 representative assets. All 18,054 original asset GUIDs were preserved. Status is `CompiledWithAssetIssues`: one missing script remains in `Assets/gamedata/ui/windows/Win_GlobalConfig.prefab`; that prefab is byte-identical to the original export, and its unresolved script GUID is absent from the exported Assets metadata. No replacement component was invented.

The repair covered 73 parameterized properties, qualified native-layout attributes without removing their offsets, restored narrowly scoped assembly friendship and missing interface contracts, restored InputControl attribute usage, corrected generated backing-field references, and repaired missing base-constructor calls and a shadowed enum type. Gameplay remains stubbed. The initial archived export targets 2022.3, while this validation targets 2020.3; asset fidelity and gameplay are not implied by successful compilation.

Backups and per-run changes are under `Runs`. `Reports/rollback-verification.json` in the successful run records hash-verified restoration into disposable copies for 126 changed files; it did not roll back the repaired project. To restore a file deliberately, use its recorded backup path and verify the recorded SHA-256 before replacing the corresponding project file with the Editor closed. Keep `.meta` files together with their assets.

Tests include compilation with Unity 2020.3's compiler and reference assemblies, repeated-run stability, ambiguous-indexer refusal without edits, interface/overload/inheritance cases, symbol-resolved accessor calls, constructor argument forwarding, and backing-field and enum-name repair. `Test-RecoveryPipeline.ps1` retains synthetic inputs and logs under unique Windows temporary directories. The default APK extraction mode was not rerun during this repair.

## Source references

- [AssetRipper command handlers at the installed build](https://github.com/AssetRipper/AssetRipper/blob/1ac666f47d8e9dedf96afb0b914c70d7656151ea/Source/AssetRipper.GUI.Web/Pages/Commands.cs)
- [AssetRipper settings form and update handler](https://github.com/AssetRipper/AssetRipper/blob/1ac666f47d8e9dedf96afb0b914c70d7656151ea/Source/AssetRipper.GUI.Web/Pages/Settings/SettingsPage.cs)
- [AssetRipper script-content levels](https://github.com/AssetRipper/AssetRipper/blob/1ac666f47d8e9dedf96afb0b914c70d7656151ea/Source/AssetRipper.Import/Configuration/ScriptContentLevel.cs)
- [Il2CppDumper CLI, outputs and method-body limitation](https://github.com/Perfare/Il2CppDumper)

## Complete self-contained PowerShell script

```powershell
#requires -Version 5.1
<#
.SYNOPSIS
Recovers Soccer-Mobile-Pro into a Unity 2020.3.49f1 asset/type project.
.DESCRIPTION
No gameplay restoration is claimed. No installed tool configuration is modified.
Run -PreflightOnly first. -SelfTest exercises helpers against synthetic inputs only.
Existing project/recovery outputs are never overwritten. Failed runs are retained.
#>
[CmdletBinding()]
param(
    [switch]$PreflightOnly,
    [switch]$SelfTest,
    [switch]$RepairExisting,
    [switch]$ValidateOnly,
    [ValidateRange(60, 86400)][int]$StageTimeoutSeconds = 7200,
    # Explicitly reviewed full type names ONLY. Interop-marked types are still rejected.
    [string[]]$ConfirmedNonInteropLayoutTypes = @()
)
Set-StrictMode -Version Latest
$ErrorActionPreference = 'Stop'
$Source = 'C:\Users\ZGAMESVN\Downloads\Soccer-Mobile-Pro-APK'
$Apk = Join-Path $Source 'Soccer-Mobile-Pro.apk'
$Project = 'C:\Users\ZGAMESVN\Downloads\Soccer-Mobile-Pro'
$Recovery = 'C:\Users\ZGAMESVN\Downloads\Soccer-Unity-Recovery'
$Ripper = 'C:\Tools\AssetRipper\AssetRipper.GUI.Premium.exe'
$Dumper = 'C:\Tools\Il2CppDumper\Il2CppDumper.exe'
$Editor = 'C:\Program Files\Unity\Hub\Editor\2020.3.49f1\Editor\Unity.exe'
$TargetVersion = '2020.3.49f1'
$RipperVersion = '2.0.0+1ac666f47d8e9dedf96afb0b914c70d7656151ea'
$Utf8 = New-Object System.Text.UTF8Encoding($false)
$script:OwnedProcesses = New-Object System.Collections.Generic.List[System.Diagnostics.Process]
$script:Stage = 'Preflight'
$report = $null
$reports = $null
$script:ExistingLease=$null

function Write-Utf8([string]$Path, [string]$Content) {
    [IO.File]::WriteAllText($Path, $Content, $Utf8)
}
function Write-Json([string]$Path, $Value) {
    Write-Utf8 $Path (ConvertTo-Json -InputObject $Value -Depth 30)
}
function Get-SnapshotHash([string]$Path) {
    $hasher=[Security.Cryptography.SHA256]::Create()
    $stream=[IO.File]::OpenRead($Path)
    try {return [BitConverter]::ToString($hasher.ComputeHash($stream)).Replace('-','')}
    finally {$stream.Dispose();$hasher.Dispose()}
}
function Set-RecoveryStage([string]$Name) {
    $script:Stage=$Name
    $report.stage=$Name
    $report.stages+=@([ordered]@{name=$Name;startedUtc=[DateTime]::UtcNow.ToString('o')})
    Write-Json (Join-Path $reports 'recovery.json') $report
}
function Assert-Empty([string]$Path) {
    if (Test-Path -LiteralPath $Path) {
        $item = Get-Item -LiteralPath $Path -Force
        if (!$item.PSIsContainer -or ($item.Attributes -band [IO.FileAttributes]::ReparsePoint) -or
            @(Get-ChildItem -LiteralPath $Path -Force).Count -ne 0) {
            throw "Refusing to overwrite or traverse existing output: $Path"
        }
    }
}
function Assert-Contained([string]$Root, [string]$Path) {
    $prefix = [IO.Path]::GetFullPath($Root).TrimEnd('\') + '\'
    $full = [IO.Path]::GetFullPath($Path)
    if (!$full.StartsWith($prefix, [StringComparison]::OrdinalIgnoreCase)) {
        throw "Path escapes output root: $Path"
    }
    # Also reject junction/symlink ancestors, including the root itself.
    $cursor = $full
    while ($cursor) {
        if (Test-Path -LiteralPath $cursor) {
            if ((Get-Item -LiteralPath $cursor -Force).Attributes -band [IO.FileAttributes]::ReparsePoint) {
                throw "Reparse point is not allowed in output path: $cursor"
            }
        }
        $cursor = [IO.Path]::GetDirectoryName($cursor)
    }
    return $full
}
function Quote-Argument([string]$Value) {
    # Windows CommandLineToArgvW-compatible quoting; never invoke a shell.
    return '"' + [regex]::Replace([regex]::Replace($Value, '(\\*)"', '$1$1\"'), '(\\+)$', '$1$1') + '"'
}
function Start-Owned([string]$Exe, [string[]]$Arguments, [string]$WorkingDirectory, [string]$LogBase) {
    Write-Json ($LogBase+'.command.json') @{executable=$Exe;arguments=$Arguments;workingDirectory=$WorkingDirectory}
    $argLine = ($Arguments | ForEach-Object { Quote-Argument $_ }) -join ' '
    $p = Start-Process -FilePath $Exe -ArgumentList $argLine -WorkingDirectory $WorkingDirectory `
        -WindowStyle Hidden -PassThru -RedirectStandardOutput ($LogBase + '.stdout.log') `
        -RedirectStandardError ($LogBase + '.stderr.log')
    # Retain the process handle: Windows PowerShell otherwise loses ExitCode after exit.
    $null = $p.Handle
    $script:OwnedProcesses.Add($p)
    return $p
}
function Wait-Owned([Diagnostics.Process]$Process, [int]$Timeout, [string]$Description) {
    $timer = [Diagnostics.Stopwatch]::StartNew()
    while (!$Process.HasExited) {
        if ($timer.Elapsed.TotalSeconds -ge $Timeout) {
            $Process.Kill()
            $Process.WaitForExit()
            throw "$Description timed out after $Timeout seconds. Logs are retained."
        }
        Start-Sleep -Milliseconds 250
        $Process.Refresh()
    }
    $Process.WaitForExit()
    if ($Process.ExitCode -ne 0) { throw "$Description failed with exit code $($Process.ExitCode). See logs." }
}
function Invoke-Owned([string]$Exe, [string[]]$Arguments, [string]$WorkingDirectory, [string]$LogBase, [int]$Timeout = $StageTimeoutSeconds) {
    $p = Start-Owned $Exe $Arguments $WorkingDirectory $LogBase
    Wait-Owned $p $Timeout $LogBase
}
function Get-Sdk {
    $dotnet = (Get-Command dotnet.exe -ErrorAction Stop).Source
    $lines = @(& $dotnet --list-sdks)
    if ($LASTEXITCODE -ne 0) { throw 'Cannot enumerate .NET SDKs.' }
    $available = @($lines | ForEach-Object {
        if ($_ -match '^(\d+\.\d+\.\d+) \[(.+)\]$') {
            [pscustomobject]@{ Version = [version]$Matches[1]; Path = Join-Path $Matches[2] $Matches[1] }
        }
    } | Where-Object { $_.Version.Major -ge 8 } | Sort-Object Version -Descending)
    if (!$available.Count) { throw 'The repair helper requires an installed .NET SDK 8 or newer (no automatic downloads).' }
    return [pscustomobject]@{ Exe = $dotnet; Version = $available[0].Version.ToString(); Path = $available[0].Path; Tfm = "net$($available[0].Version.Major).0" }
}
function Read-Il2CppInputInfo([string]$Binary, [string]$Metadata) {
    $stream=[IO.File]::OpenRead($Metadata)
    try {$reader=New-Object IO.BinaryReader($stream); $magic=$reader.ReadUInt32(); $metadataVersion=$reader.ReadInt32()} finally {$stream.Dispose()}
    # 0xFAB11BAF is a negative Int32 literal in Windows PowerShell 5.1.
    if($magic -ne 4205910959L) {throw 'Metadata magic is unsupported or protected; automatic recovery stopped.'}
    $elf=[IO.File]::OpenRead($Binary)
    try {$h=New-Object byte[] 20; $count=$elf.Read($h,0,20)} finally {$elf.Dispose()}
    if($count -ne 20 -or $h[0] -ne 127 -or $h[1] -ne 69 -or $h[2] -ne 76 -or $h[3] -ne 70 -or $h[4] -ne 2 -or $h[5] -ne 1 -or [BitConverter]::ToUInt16($h,18) -ne 183) {throw 'Selected binary is not a little-endian ELF64 AArch64 image.'}
    return $metadataVersion
}

# Embedded syntax-aware helper: references Roslyn from the installed .NET SDK.
$RepairSource = @'
using System;
using System.IO;
using System.Linq;
using System.Collections.Generic;
using System.Text.Json;
using Microsoft.CodeAnalysis;
using Microsoft.CodeAnalysis.CSharp;
using Microsoft.CodeAnalysis.CSharp.Syntax;

// Two-pass recovery of ILSpy parameterized-property output. Only declarations
// carrying the export marker are candidates; calls are resolved through symbols.
sealed class Indexers : CSharpSyntaxRewriter
{
    sealed class Pair {
        public MethodDeclarationSyntax Get=null!;
        public MethodDeclarationSyntax? Set;
        public IMethodSymbol GetSymbol=null!;
        public IMethodSymbol? SetSymbol;
    }
    readonly Dictionary<MethodDeclarationSyntax,Pair> starts=new();
    readonly HashSet<MethodDeclarationSyntax> removed=new();
    readonly Dictionary<ISymbol,Pair> symbols=new(SymbolEqualityComparer.Default);
    readonly Dictionary<ISymbol,string> parameterNames=new(SymbolEqualityComparer.Default);
    SemanticModel model=null!;
    public readonly List<object> Changes=new();
    public readonly List<object> Errors=new();
    static string Key(MethodDeclarationSyntax m, bool setter) =>
        (m.ExplicitInterfaceSpecifier?.Name.WithoutTrivia().ToString() ?? "")+"|"+
        string.Join("|",m.ParameterList.Parameters.Take(m.ParameterList.Parameters.Count-(setter?1:0)).Select(p=>p.Type!.WithoutTrivia().ToString()));
    static bool Marked(MethodDeclarationSyntax m) => m.GetLeadingTrivia().ToFullString().Contains("no syntax for parameterized property");
    void Error(SyntaxNode n,string reason) => Errors.Add(new {file=n.SyntaxTree.FilePath,line=n.GetLocation().GetLineSpan().StartLinePosition.Line+1,reason});
    void Change(SyntaxNode n,string reason) => Changes.Add(new {file=n.SyntaxTree.FilePath,line=n.GetLocation().GetLineSpan().StartLinePosition.Line+1,reason});
    public Dictionary<string,string> Run(SyntaxTree[] trees)
    {
        var references=((string)AppContext.GetData("TRUSTED_PLATFORM_ASSEMBLIES")!).Split(Path.PathSeparator)
            .Select(p=>MetadataReference.CreateFromFile(p));
        var compilation=CSharpCompilation.Create("RecoveryAnalysis",trees,references,new CSharpCompilationOptions(OutputKind.DynamicallyLinkedLibrary,allowUnsafe:true));
        foreach(var tree in trees) {
            var sm=compilation.GetSemanticModel(tree);
            foreach(var type in tree.GetRoot().DescendantNodes().OfType<TypeDeclarationSyntax>()) {
                var methods=type.Members.OfType<MethodDeclarationSyntax>().ToArray();
                foreach(var get in methods.Where(m=>Marked(m))) {
                    if(get.Identifier.ValueText!="get_Item" || get.ParameterList.Parameters.Count==0 || get.TypeParameterList!=null || get.Modifiers.Any(SyntaxKind.StaticKeyword)) {
                        Error(get,"Ambiguous parameterized property: expected instance get_Item with index parameters"); continue;
                    }
                    var setters=methods.Where(m=>m.Identifier.ValueText=="set_Item" && Key(m,true)==Key(get,false)).ToArray();
                    if(setters.Length>1 || methods.Count(m=>m.Identifier.ValueText=="get_Item" && Key(m,false)==Key(get,false))!=1 ||
                        type.Members.OfType<IndexerDeclarationSyntax>().Any(i=>
                            (i.ExplicitInterfaceSpecifier?.Name.WithoutTrivia().ToString()??"") == (get.ExplicitInterfaceSpecifier?.Name.WithoutTrivia().ToString()??"") &&
                            string.Join("|",i.ParameterList.Parameters.Select(p=>p.Type!.WithoutTrivia().ToString()))==string.Join("|",get.ParameterList.Parameters.Select(p=>p.Type!.WithoutTrivia().ToString())))) {
                        Error(get,"Ambiguous or already conflicting indexer signature"); continue;
                    }
                    var set=setters.SingleOrDefault();
                    if(set!=null && (set.ReturnType.ToString()!="void" || set.ParameterList.Parameters.Last().Type!.WithoutTrivia().ToString()!=get.ReturnType.WithoutTrivia().ToString() ||
                        string.Join(" ",get.Modifiers.Select(t=>t.ValueText))!=string.Join(" ",set.Modifiers.Select(t=>t.ValueText)))) {
                        Error(get,"Getter/setter type or modifiers differ; requires metadata review"); continue;
                    }
                    var pair=new Pair {Get=get,Set=set,GetSymbol=(IMethodSymbol)sm.GetDeclaredSymbol(get)!};
                    starts.Add(get,pair); symbols[pair.GetSymbol.OriginalDefinition]=pair;
                    if(set!=null) {
                        pair.SetSymbol=(IMethodSymbol)sm.GetDeclaredSymbol(set)!;
                        removed.Add(set); symbols[pair.SetSymbol.OriginalDefinition]=pair;
                        for(int i=0;i<set.ParameterList.Parameters.Count;i++)
                            parameterNames[pair.SetSymbol.Parameters[i]]=i==set.ParameterList.Parameters.Count-1 ? "value" : get.ParameterList.Parameters[i].Identifier.ValueText;
                    }
                    Change(get,"Recover indexer from marked get_Item/set_Item: "+pair.GetSymbol.ToDisplayString());
                }
            }
        }
        var output=new Dictionary<string,string>();
        foreach(var tree in trees) {
            model=compilation.GetSemanticModel(tree);
            output[tree.FilePath]=Visit(tree.GetRoot())!.ToFullString();
        }
        return output; // caller commits no files if any ambiguity was reported
    }
    public override SyntaxNode? VisitIdentifierName(IdentifierNameSyntax n)
    {
        var symbol=model.GetSymbolInfo(n).Symbol;
        if(symbol!=null && parameterNames.TryGetValue(symbol,out var name)) return SyntaxFactory.IdentifierName(name).WithTriviaFrom(n);
        // Converting a method group into an indexer would change delegate semantics.
        if(symbol is IMethodSymbol m && symbols.ContainsKey(m.OriginalDefinition)) {
            SyntaxNode expression=n.Parent is MemberAccessExpressionSyntax ? n.Parent : n;
            if(expression.Parent is not InvocationExpressionSyntax)
                Error(n,"Accessor used as method group or unsupported expression; manual mapping required");
        }
        return base.VisitIdentifierName(n);
    }
    public override SyntaxNode? VisitInvocationExpression(InvocationExpressionSyntax n)
    {
        var info=model.GetSymbolInfo(n);
        var method=info.Symbol as IMethodSymbol;
        if(method==null) {
            if(info.CandidateSymbols.OfType<IMethodSymbol>().Any(m=>symbols.ContainsKey(m.OriginalDefinition))) Error(n,"Cannot resolve accessor call uniquely");
            return base.VisitInvocationExpression(n);
        }
        if(!symbols.TryGetValue(method.OriginalDefinition,out var pair)) return base.VisitInvocationExpression(n);
        if(n.Expression is not MemberAccessExpressionSyntax && n.Expression is not IdentifierNameSyntax) {Error(n,"Conditional/unsupported accessor invocation"); return n;}
        bool setter=method.Name=="set_Item";
        // Named/reordered arguments need operation-level lowering; do not guess.
        if(n.ArgumentList.Arguments.Any(a=>a.NameColon!=null || a.RefKindKeyword!=default)) {Error(n,"Named/ref accessor arguments require manual mapping");return n;}
        var visited=(InvocationExpressionSyntax)base.VisitInvocationExpression(n)!;
        var receiver=visited.Expression is MemberAccessExpressionSyntax member ? member.Expression : SyntaxFactory.ThisExpression();
        var args=visited.ArgumentList.Arguments;
        var element=SyntaxFactory.ElementAccessExpression(receiver,SyntaxFactory.BracketedArgumentList(
            SyntaxFactory.SeparatedList(args.Take(args.Count-(setter?1:0)))));
        Change(n,"Rewrite symbol-resolved accessor call");
        return setter ? SyntaxFactory.AssignmentExpression(SyntaxKind.SimpleAssignmentExpression,element,args.Last().Expression).WithTriviaFrom(n) : element.WithTriviaFrom(n);
    }
    public override SyntaxNode? VisitMemberAccessExpression(MemberAccessExpressionSyntax n)
    {
        var expressionSymbol=model.GetSymbolInfo(n.Expression);
        var method=expressionSymbol.Symbol as IMethodSymbol;
        if(method==null && expressionSymbol.CandidateSymbols.Length==1) method=expressionSymbol.CandidateSymbols[0] as IMethodSymbol;
        if(method?.ReturnType is INamedTypeSymbol enumType && enumType.TypeKind==TypeKind.Enum &&
            n.Expression is IdentifierNameSyntax identifier && identifier.Identifier.ValueText==enumType.Name &&
            enumType.GetMembers(n.Name.Identifier.ValueText).OfType<IFieldSymbol>().Any()) {
            Change(n,"Qualify enum type shadowed by method name: "+enumType.ToDisplayString());
            return n.WithExpression(SyntaxFactory.ParseExpression(enumType.ToDisplayString(SymbolDisplayFormat.FullyQualifiedFormat)));
        }
        const string suffix="__BackingField";
        if(n.Expression is ThisExpressionSyntax && n.Name.Identifier.ValueText.EndsWith(suffix,StringComparison.Ordinal) && model.GetSymbolInfo(n).Symbol==null) {
            var declaration=n.Ancestors().OfType<TypeDeclarationSyntax>().FirstOrDefault();
            var type=declaration==null ? null : model.GetDeclaredSymbol(declaration);
            string field=n.Name.Identifier.ValueText.Substring(0,n.Name.Identifier.ValueText.Length-suffix.Length);
            if(type!=null && type.GetMembers(field).OfType<IFieldSymbol>().Count()==1 && type.GetMembers(n.Name.Identifier.ValueText).Length==0) {
                Change(n,"Bind missing generated backing-field reference to existing field: "+field);
                return n.WithName(SyntaxFactory.IdentifierName(field).WithTriviaFrom(n.Name));
            }
        }
        return base.VisitMemberAccessExpression(n);
    }
    public override SyntaxNode? VisitConstructorDeclaration(ConstructorDeclarationSyntax n)
    {
        if(n.Initializer==null && !n.Modifiers.Any(SyntaxKind.StaticKeyword) && model.GetDeclaredSymbol(n) is IMethodSymbol ctor &&
            ctor.ContainingType.TypeKind==TypeKind.Class && ctor.ContainingType.BaseType is INamedTypeSymbol parent && parent.TypeKind!=TypeKind.Error) {
            var constructors=parent.InstanceConstructors.Where(c=>c.DeclaredAccessibility!=Accessibility.Private).ToArray();
            if(!constructors.Any(c=>c.Parameters.Length==0 || c.Parameters.All(p=>p.IsOptional))) {
                var matches=constructors.Where(c=>c.Parameters.Length>0 && c.Parameters.All(p=>p.RefKind==RefKind.None &&
                    ctor.Parameters.Any(q=>q.Name==p.Name && SymbolEqualityComparer.Default.Equals(q.Type,p.Type)))).ToArray();
                if(matches.Length==1) {
                    Change(n,"Restore base constructor call using matching named/typed parameters");
                    var args=matches[0].Parameters.Select(p=>SyntaxFactory.Argument(SyntaxFactory.IdentifierName(n.ParameterList.Parameters.First(q=>q.Identifier.ValueText==p.Name).Identifier)));
                    return ((ConstructorDeclarationSyntax)base.VisitConstructorDeclaration(n)!).WithInitializer(
                        SyntaxFactory.ConstructorInitializer(SyntaxKind.BaseConstructorInitializer,SyntaxFactory.ArgumentList(SyntaxFactory.SeparatedList(args))));
                }
            }
        }
        return base.VisitConstructorDeclaration(n);
    }
    static AccessorDeclarationSyntax Accessor(MethodDeclarationSyntax m,SyntaxKind kind) => SyntaxFactory.AccessorDeclaration(kind)
        .WithAttributeLists(m.AttributeLists).WithBody(m.Body).WithExpressionBody(m.ExpressionBody).WithSemicolonToken(m.SemicolonToken);
    TypeDeclarationSyntax Members(TypeDeclarationSyntax original,TypeDeclarationSyntax visited)
    {
        var members=new List<MemberDeclarationSyntax>();
        for(int i=0;i<original.Members.Count;i++) {
            if(original.Members[i] is MethodDeclarationSyntax m && removed.Contains(m)) continue;
            if(original.Members[i] is MethodDeclarationSyntax get && starts.TryGetValue(get,out var pair)) {
                var g=(MethodDeclarationSyntax)visited.Members[i];
                var accessors=new List<AccessorDeclarationSyntax>{Accessor(g,SyntaxKind.GetAccessorDeclaration)};
                if(pair.Set!=null) accessors.Add(Accessor((MethodDeclarationSyntax)visited.Members[original.Members.IndexOf(pair.Set)],SyntaxKind.SetAccessorDeclaration));
                members.Add(SyntaxFactory.IndexerDeclaration(g.ReturnType).WithModifiers(g.Modifiers)
                    .WithExplicitInterfaceSpecifier(g.ExplicitInterfaceSpecifier)
                    .WithParameterList(SyntaxFactory.BracketedParameterList(g.ParameterList.Parameters))
                    .WithAccessorList(SyntaxFactory.AccessorList(SyntaxFactory.List(accessors)))
                    .WithLeadingTrivia(get.GetLeadingTrivia()).WithTrailingTrivia(g.GetTrailingTrivia()));
            } else members.Add(visited.Members[i]);
        }
        return visited.WithMembers(SyntaxFactory.List(members));
    }
    public override SyntaxNode? VisitClassDeclaration(ClassDeclarationSyntax n) => Members(n,(TypeDeclarationSyntax)base.VisitClassDeclaration(n)!);
    public override SyntaxNode? VisitStructDeclaration(StructDeclarationSyntax n) => Members(n,(TypeDeclarationSyntax)base.VisitStructDeclaration(n)!);
    public override SyntaxNode? VisitInterfaceDeclaration(InterfaceDeclarationSyntax n) => Members(n,(TypeDeclarationSyntax)base.VisitInterfaceDeclaration(n)!);
}

sealed class Repair : CSharpSyntaxRewriter
{
    readonly HashSet<string> allow;
    static Dictionary<string,string> aliases = new();
    public readonly List<object> Changes = new();
    public readonly List<object> Warnings = new();
    public string FileName = "";
    public Repair(string[] allowTypes) { allow = new(allowTypes, StringComparer.Ordinal); }
    static string Name(AttributeSyntax a) {
        string name=a.Name.ToString();
        if(aliases.TryGetValue(name,out string? target)) name=target;
        name=name.Split('.').Last();
        return name.EndsWith("Attribute",StringComparison.Ordinal) ? name.Substring(0,name.Length-9) : name;
    }
    static string FullName(SyntaxNode n) => string.Join(".", n.AncestorsAndSelf().Reverse().Select(x => x switch {
        BaseNamespaceDeclarationSyntax ns => ns.Name.ToString(),
        TypeDeclarationSyntax t => t.Identifier.ValueText + (t.TypeParameterList == null ? "" : "`" + t.TypeParameterList.Parameters.Count),
        _ => ""
    }).Where(x => x.Length > 0));
    void Changed(SyntaxNode n, string reason) => Changes.Add(new { file = FileName, line = n.GetLocation().GetLineSpan().StartLinePosition.Line + 1, reason });
    static bool Has(SyntaxTokenList m, SyntaxKind k) => m.Any(k);
    static bool Empty(BlockSyntax? b, ArrowExpressionClauseSyntax? e) => e == null && (b == null || b.Statements.Count == 0);
    static string Default(TypeSyntax t) => "default(" + t.WithoutTrivia() + ")";
    static BlockSyntax Body(TypeSyntax type, SeparatedSyntaxList<ParameterSyntax> parameters, bool async = false)
    {
        string code = "";
        foreach (var p in parameters.Where(p => Has(p.Modifiers, SyntaxKind.OutKeyword)))
            code += p.Identifier.Text + " = " + (p.Type == null ? "default" : Default(p.Type)) + ";";
        // Ref returns require a real storage location. Task-like/custom async results
        // also cannot be safely fabricated. A throwing stub is valid and explicit.
        if (type is RefTypeSyntax || async)
            code += "throw new global::System.NotImplementedException(\"Recovered method has no implementation.\");";
        else if (type is not PredefinedTypeSyntax p || !p.Keyword.IsKind(SyntaxKind.VoidKeyword))
            code += "return " + Default(type) + ";";
        return (BlockSyntax)SyntaxFactory.ParseStatement("{" + code + "}");
    }
    public override SyntaxNode? VisitMethodDeclaration(MethodDeclarationSyntax n)
    {
        if (Empty(n.Body, n.ExpressionBody) && !Has(n.Modifiers, SyntaxKind.AbstractKeyword) &&
            !Has(n.Modifiers, SyntaxKind.ExternKeyword) && !Has(n.Modifiers, SyntaxKind.PartialKeyword) &&
            !(n.Body!=null && n.ReturnType is PredefinedTypeSyntax rt && rt.Keyword.IsKind(SyntaxKind.VoidKeyword) && !n.ParameterList.Parameters.Any(p=>Has(p.Modifiers,SyntaxKind.OutKeyword))) &&
            n.Parent is not InterfaceDeclarationSyntax)
        {
            Changed(n, "Fill absent/empty method body; preserve signature and out parameters");
            n = n.WithBody(Body(n.ReturnType, n.ParameterList.Parameters, Has(n.Modifiers, SyntaxKind.AsyncKeyword)))
                .WithSemicolonToken(default);
        }
        return base.VisitMethodDeclaration(n);
    }
    public override SyntaxNode? VisitOperatorDeclaration(OperatorDeclarationSyntax n)
    {
        if (Empty(n.Body, n.ExpressionBody) && !Has(n.Modifiers, SyntaxKind.ExternKeyword)) {
            Changed(n, "Fill operator stub"); n = n.WithBody(Body(n.ReturnType,n.ParameterList.Parameters)).WithSemicolonToken(default);
        }
        return base.VisitOperatorDeclaration(n);
    }
    public override SyntaxNode? VisitConversionOperatorDeclaration(ConversionOperatorDeclarationSyntax n)
    {
        if (Empty(n.Body, n.ExpressionBody) && !Has(n.Modifiers, SyntaxKind.ExternKeyword)) {
            Changed(n, "Fill conversion stub"); n = n.WithBody(Body(n.Type,n.ParameterList.Parameters)).WithSemicolonToken(default);
        }
        return base.VisitConversionOperatorDeclaration(n);
    }
    public override SyntaxNode? VisitAccessorDeclaration(AccessorDeclarationSyntax n)
    {
        // Semicolon accessors are auto-properties or abstract/interface contracts.
        if (n.IsKind(SyntaxKind.GetAccessorDeclaration) && n.Body != null && n.Body.Statements.Count == 0) {
            TypeSyntax? type = n.Parent?.Parent switch { PropertyDeclarationSyntax p => p.Type, IndexerDeclarationSyntax i => i.Type, _ => null };
            if(type != null) { Changed(n,"Fill empty getter"); n=n.WithBody(Body(type,default)); }
        }
        return base.VisitAccessorDeclaration(n);
    }
    public override SyntaxNode? VisitConstructorDeclaration(ConstructorDeclarationSyntax n)
    {
        if(n.Body==null && n.ExpressionBody==null && !Has(n.Modifiers,SyntaxKind.ExternKeyword)) {
            Changed(n,"Supply explicit missing-constructor stub");
            n=n.WithBody((BlockSyntax)SyntaxFactory.ParseStatement("{throw new global::System.NotImplementedException(\"Recovered constructor has no implementation.\");}"))
                .WithSemicolonToken(default);
        }
        return base.VisitConstructorDeclaration(n);
    }
    public override SyntaxNode? VisitCompilationUnit(CompilationUnitSyntax n)
    {
        var friends=new List<string>();
        if(n.DescendantNodes().OfType<EnumDeclarationSyntax>().Any(t=>t.Identifier.ValueText=="PlatformLogLevel") && FileName.Contains("Firebase.Platform")) friends.Add("Firebase.App");
        if(n.DescendantNodes().OfType<ClassDeclarationSyntax>().Any(t=>t.Identifier.ValueText=="AsyncTraceScope") && FileName.Contains("GoogleMobileAds.Common")) friends.Add("GoogleMobileAds.Android");
        if(n.DescendantNodes().OfType<ClassDeclarationSyntax>().Any(t=>t.Identifier.ValueText=="FirebaseApp") && FileName.Contains("Firebase.App")) friends.AddRange(new[]{"Firebase.Analytics","Firebase.RemoteConfig"});
        var result=(CompilationUnitSyntax)base.VisitCompilationUnit(n)!;
        foreach(string friend in friends.Where(friend=>!n.AttributeLists.ToString().Contains("InternalsVisibleTo(\""+friend+"\")"))) {
            Changed(n,"Restore narrow assembly friendship: "+friend);
            var attributes=SyntaxFactory.ParseCompilationUnit("[assembly: global::System.Runtime.CompilerServices.InternalsVisibleTo(\""+friend+"\")]").AttributeLists;
            result=result.AddAttributeLists(attributes.ToArray());
        }
        return result;
    }
    public override SyntaxNode? VisitClassDeclaration(ClassDeclarationSyntax n)
    {
        string name=FullName(n);
        var result=(ClassDeclarationSyntax)base.VisitClassDeclaration(n)!;
        if(name=="UnityEngine.InputSystem.Layouts.InputControlAttribute" && !n.AttributeLists.SelectMany(a=>a.Attributes).Any(a=>Name(a)=="AttributeUsage")) {
            Changed(n,"Restore InputControl AttributeUsage: fields/properties, AllowMultiple (Unity InputSystem upstream)");
            result=result.AddAttributeLists(SyntaxFactory.AttributeList(SyntaxFactory.SingletonSeparatedList(
                SyntaxFactory.Attribute(SyntaxFactory.ParseName("global::System.AttributeUsage"),SyntaxFactory.ParseAttributeArgumentList("(global::System.AttributeTargets.Field | global::System.AttributeTargets.Property, AllowMultiple = true)")))));
        }
        if(name.StartsWith("Gadsme.Core.Native.Tdabed9b_",StringComparison.Ordinal) &&
            n.BaseList?.Types.Any(t=>t.Type.ToString()=="global::Gadsme.Core.Native.Tdabed9b_64")==true &&
            !n.Members.OfType<PropertyDeclarationSyntax>().Any(p=>p.Identifier.ValueText=="P45")) {
            Changed(n,"Restore obfuscated interface property P45 via existing get_texture method");
            result=result.AddMembers(SyntaxFactory.ParseMemberDeclaration("global::UnityEngine.Texture2D global::Gadsme.Core.Native.Tdabed9b_64.P45 { get { return get_texture(); } }")!);
        }
        if(name.StartsWith("Unity.SharpZipLib.Encryption.",StringComparison.Ordinal) &&
            n.BaseList?.Types.Any(t=>t.Type.ToString()=="global::System.Security.Cryptography.ICryptoTransform")==true &&
            !n.Members.OfType<PropertyDeclarationSyntax>().Any(p=>p.Identifier.ValueText=="CanReuseTransform")) {
            Changed(n,"Supply stripped ICryptoTransform.CanReuseTransform contract as false stub");
            result=result.AddMembers(SyntaxFactory.ParseMemberDeclaration("bool global::System.Security.Cryptography.ICryptoTransform.CanReuseTransform { get { return false; } }")!);
        }
        return result;
    }
    public override SyntaxNode? VisitAttributeList(AttributeListSyntax n)
    {
        var kept = new List<AttributeSyntax>();
        foreach(var originalAttribute in n.Attributes) {
            var a=originalAttribute;
            if(a.Name.ToString()=="StructLayout" || a.Name.ToString()=="StructLayoutAttribute") {
                Changed(a,"Qualify recovered native layout attribute; preserve layout kind, pack, size and offsets");
                a=a.ReplaceNodes(a.DescendantNodes().OfType<IdentifierNameSyntax>().Where(x=>x.Identifier.ValueText=="LayoutKind"),
                    (old,rewritten)=>SyntaxFactory.ParseName("global::System.Runtime.InteropServices.LayoutKind").WithTriviaFrom(old));
                a=a.WithName(SyntaxFactory.ParseName("global::System.Runtime.InteropServices.StructLayout"));
            }
            string name = Name(a);
            if(name is "InitializeOnLoad" or "InitializeOnLoadMethod" or "RuntimeInitializeOnLoadMethod" or "DidReloadScripts" or "ExecuteAlways" or "ExecuteInEditMode") {
                Changed(a,"Disable recovered automatic execution hook: " + name); continue;
            }
            if(name is "StructLayout" or "FieldOffset") {
                var owner=originalAttribute.Ancestors().OfType<TypeDeclarationSyntax>().FirstOrDefault();
                bool explicitLayout = name == "FieldOffset" || a.ToString().Contains("Explicit");
                bool interop = owner != null && owner.DescendantNodes().OfType<AttributeSyntax>().Any(x => Name(x) is "DllImport" or "MarshalAs" or "UnmanagedFunctionPointer" or "ComImport");
                if(explicitLayout && owner != null && allow.Contains(FullName(owner)) && !interop) {
                    Changed(a,"Remove reviewed non-interop explicit layout: " + FullName(owner)); continue;
                }
                if(explicitLayout) Warnings.Add(new { file=FileName, type=owner == null ? "" : FullName(owner), reason="Layout preserved: requires non-interop review (including external/native uses)." });
            }
            kept.Add(a);
        }
        return kept.Count == 0 ? null : n.WithAttributes(SyntaxFactory.SeparatedList(kept));
    }
    public static int Main(string[] args)
    {
        string root=args[0], report=args[1];
        var repair=new Repair(JsonSerializer.Deserialize<string[]>(File.ReadAllText(args[2]))!);
        var errors=new List<object>();
        var types=new List<object>();
        var input=Directory.GetFiles(root,"*.cs",SearchOption.AllDirectories).OrderBy(p=>p,StringComparer.Ordinal).ToArray();
        var trees=input.Select(file=>CSharpSyntaxTree.ParseText(File.ReadAllText(file),new CSharpParseOptions(LanguageVersion.CSharp8),file)).ToArray();
        var indexers=new Indexers();
        var indexed=indexers.Run(trees);
        if(indexers.Errors.Count>0) {
            File.WriteAllText(report,JsonSerializer.Serialize(new { changes=Array.Empty<object>(),warnings=indexers.Errors,syntaxErrors=Array.Empty<object>(),types },new JsonSerializerOptions {WriteIndented=true}));
            return 3;
        }
        repair.Changes.AddRange(indexers.Changes);
        foreach(string file in input) {
            repair.FileName=file;
            string original=File.ReadAllText(file);
            var tree=CSharpSyntaxTree.ParseText(indexed[file],new CSharpParseOptions(LanguageVersion.CSharp8),file);
            aliases=tree.GetRoot().DescendantNodes().OfType<UsingDirectiveSyntax>().Where(u=>u.Alias!=null && u.Name!=null)
                .GroupBy(u=>u.Alias!.Name.Identifier.ValueText).ToDictionary(g=>g.Key,g=>g.First().Name!.ToString());
            var diagnostics=tree.GetDiagnostics().Where(d=>d.Severity==DiagnosticSeverity.Error).ToArray();
            // Broken syntax is not safe to rewrite. Let the report identify it.
            if(diagnostics.Length>0) { errors.Add(new {file, diagnostics=diagnostics.Select(d=>d.ToString()).ToArray()}); continue; }
            foreach(var type in tree.GetRoot().DescendantNodes().OfType<BaseTypeDeclarationSyntax>())
                types.Add(new { file, name=type.Identifier.ValueText, fullName=type is TypeDeclarationSyntax ? FullName(type) : type.Identifier.ValueText,
                    methods=type.ChildNodes().OfType<MethodDeclarationSyntax>().Select(m=>m.Identifier.ValueText).Distinct().ToArray() });
            int before=repair.Changes.Count;
            var rewritten=repair.Visit(tree.GetRoot())!;
            if(repair.Changes.Count!=before || indexed[file]!=original) {
                string output=rewritten.NormalizeWhitespace().ToFullString();
                var check=CSharpSyntaxTree.ParseText(output,new CSharpParseOptions(LanguageVersion.CSharp8));
                if(check.GetDiagnostics().Any(d=>d.Severity==DiagnosticSeverity.Error)) throw new Exception("Repair generated invalid syntax: "+file);
                if(output!=original) File.WriteAllText(file,output,new System.Text.UTF8Encoding(false));
            }
        }
        File.WriteAllText(report,JsonSerializer.Serialize(new { changes=repair.Changes, warnings=repair.Warnings, syntaxErrors=errors, types },new JsonSerializerOptions { WriteIndented=true }));
        return errors.Count==0 ? 0 : 2;
    }
}
'@

function Build-RepairHelper([string]$Directory, $Sdk) {
    [void][IO.Directory]::CreateDirectory($Directory)
    Write-Utf8 (Join-Path $Directory 'Repair.cs') $RepairSource
    Write-Json (Join-Path $Directory 'global.json') @{sdk=@{version=$Sdk.Version;rollForward='disable'}}
    Write-Utf8 (Join-Path $Directory 'NuGet.Config') '<configuration><packageSources><clear /></packageSources></configuration>'
    Write-Utf8 (Join-Path $Directory 'Repair.csproj') @"
<Project Sdk="Microsoft.NET.Sdk">
  <PropertyGroup><OutputType>Exe</OutputType><TargetFramework>$($Sdk.Tfm)</TargetFramework><Nullable>enable</Nullable><EnableDefaultCompileItems>false</EnableDefaultCompileItems><NuGetAudit>false</NuGetAudit></PropertyGroup>
  <ItemGroup><Compile Include="Repair.cs" />
    <Reference Include="Microsoft.CodeAnalysis"><HintPath>`$(MSBuildSDKsPath)\..\Roslyn\bincore\Microsoft.CodeAnalysis.dll</HintPath></Reference>
    <Reference Include="Microsoft.CodeAnalysis.CSharp"><HintPath>`$(MSBuildSDKsPath)\..\Roslyn\bincore\Microsoft.CodeAnalysis.CSharp.dll</HintPath></Reference>
  </ItemGroup>
</Project>
"@
    Invoke-Owned $Sdk.Exe @('build','Repair.csproj','-c','Release','-o','bin','--nologo') $Directory (Join-Path $Directory 'build') 180
    return Join-Path $Directory 'bin\Repair.dll'
}

# Compiles only in a separate editor-only assembly. Scenes are opened additively and
# closed without saving; recovered edit-mode execution hooks are removed first.
$ValidatorSource = @'
using System;
using System.IO;
using System.Linq;
using System.Collections.Generic;
using UnityEditor;
using UnityEditor.SceneManagement;
using UnityEngine;
public static class SoccerRecoveryValidation
{
    [Serializable] public class Item { public string path; public string kind; public int missingScripts; public string error; }
    [Serializable] public class Report { public string unityVersion; public bool compiled; public int scriptCount; public List<Item> items = new List<Item>(); public List<string> editorErrors = new List<string>(); }
    public static void Run()
    {
        var report = new Report { unityVersion = Application.unityVersion, compiled = !EditorUtility.scriptCompilationFailed };
        string root = Environment.GetEnvironmentVariable("SOCCER_RECOVERY_REPORTS");
        if (string.IsNullOrEmpty(root)) throw new Exception("Missing report directory.");
        Application.LogCallback capture=(message,stack,type)=>{
            if((type==LogType.Error || type==LogType.Exception || type==LogType.Assert) && report.editorErrors.Count<500)
                report.editorErrors.Add(message+"\n"+stack);
        };
        Application.logMessageReceived+=capture;
        try {
            report.scriptCount = AssetDatabase.FindAssets("t:MonoScript",new[]{"Assets"}).Length;
            foreach(string guid in AssetDatabase.FindAssets("t:Scene",new[]{"Assets"})) {
                string path=AssetDatabase.GUIDToAssetPath(guid);
                var item=new Item { path=path,kind="scene" }; report.items.Add(item);
                UnityEngine.SceneManagement.Scene scene=default;
                try {
                    scene=EditorSceneManager.OpenScene(path,OpenSceneMode.Additive);
                    foreach(var go in scene.GetRootGameObjects())
                        foreach(var t in go.GetComponentsInChildren<Transform>(true))
                            item.missingScripts+=GameObjectUtility.GetMonoBehavioursWithMissingScriptCount(t.gameObject);
                } catch(Exception e) { item.error=e.ToString(); }
                finally { if(scene.IsValid()) EditorSceneManager.CloseScene(scene,true); }
            }
            foreach(string guid in AssetDatabase.FindAssets("t:Prefab",new[]{"Assets"})) {
                string path=AssetDatabase.GUIDToAssetPath(guid); var item=new Item {path=path,kind="prefab"}; report.items.Add(item);
                try { var go=AssetDatabase.LoadAssetAtPath<GameObject>(path); if(go==null) throw new Exception("Prefab could not be loaded.");
                    foreach(var t in go.GetComponentsInChildren<Transform>(true)) item.missingScripts+=GameObjectUtility.GetMonoBehavioursWithMissingScriptCount(t.gameObject);
                } catch(Exception e) { item.error=e.ToString(); }
            }
            foreach(string guid in AssetDatabase.FindAssets("t:Shader",new[]{"Assets"})) {
                string path=AssetDatabase.GUIDToAssetPath(guid); var shader=AssetDatabase.LoadAssetAtPath<Shader>(path);
                report.items.Add(new Item {path=path,kind="shader",error=shader==null ? "Shader failed to load" : ShaderUtil.ShaderHasError(shader) ? "Shader compiler error; see Unity log" : null});
            }
            foreach(string kind in new[]{"Texture2D","AudioClip","Material","Mesh"})
                foreach(string guid in AssetDatabase.FindAssets("t:"+kind,new[]{"Assets"}).Take(10)) {
                    string path=AssetDatabase.GUIDToAssetPath(guid);
                    report.items.Add(new Item {path=path,kind=kind,error=AssetDatabase.LoadMainAssetAtPath(path)==null ? "Asset failed to load" : null});
                }
            File.WriteAllText(Path.Combine(root,"unity-validation.json"),JsonUtility.ToJson(report,true));
            EditorApplication.Exit(report.compiled && report.scriptCount>0 ? 0 : 3);
        } catch(Exception e) {
            File.WriteAllText(Path.Combine(root,"unity-validation-fatal.txt"),e.ToString()); EditorApplication.Exit(4);
        } finally { Application.logMessageReceived-=capture; }
    }
}
'@

function Get-Preflight {
    foreach ($path in @($Apk,$Ripper,$Dumper,$Editor)) {
        if (!(Test-Path -LiteralPath $path -PathType Leaf)) { throw "Required file missing: $path" }
    }
    foreach ($path in @($Project,$Recovery)) {
        [void](Assert-Contained 'C:\Users\ZGAMESVN\Downloads' $path)
        Assert-Empty $path
    }
    $sdk = Get-Sdk
    $versionText = (& $Ripper --version | Out-String).Trim()
    if ($LASTEXITCODE -ne 0 -or !$versionText.Contains($RipperVersion)) {
        throw "Unsupported AssetRipper API build. Expected $RipperVersion; found $versionText"
    }
    if (!(Get-Item -LiteralPath $Editor).VersionInfo.FileVersion.StartsWith('2020.3.49.')) {
        throw 'Unity editor file version does not match 2020.3.49.'
    }
    return [pscustomobject]@{ sdk=$sdk; apk=$Apk; apkSha256=(Get-FileHash -LiteralPath $Apk -Algorithm SHA256).Hash;
        assetRipper=$versionText; assetRipperSha256=(Get-FileHash -LiteralPath $Ripper).Hash;
        dumperSha256=(Get-FileHash -LiteralPath $Dumper).Hash; unity=$Editor }
}

function Invoke-SelfTest {
    $testRoot = Join-Path ([IO.Path]::GetTempPath()) ('SoccerRecovery-Test-' + [guid]::NewGuid().ToString('N'))
    [void][IO.Directory]::CreateDirectory($testRoot)
    $elfPath=Join-Path $testRoot 'synthetic.so'; $metaPath=Join-Path $testRoot 'synthetic.dat'
    $header=New-Object byte[] 20
    $header[0]=127; $header[1]=69; $header[2]=76; $header[3]=70; $header[4]=2; $header[5]=1; $header[18]=183
    [IO.File]::WriteAllBytes($elfPath,$header)
    [IO.File]::WriteAllBytes($metaPath,([BitConverter]::GetBytes([uint32]4205910959L)+[BitConverter]::GetBytes([int]29)))
    if((Read-Il2CppInputInfo $elfPath $metaPath) -ne 29){throw 'IL2CPP metadata/architecture fixture failed.'}
    $header[18]=62; [IO.File]::WriteAllBytes($elfPath,$header)
    $wrongArch=$false
    try {[void](Read-Il2CppInputInfo $elfPath $metaPath)} catch {$wrongArch=$_.Exception.Message -like '*AArch64*'}
    if(!$wrongArch){throw 'Wrong architecture was accepted.'}
    $header[18]=183; [IO.File]::WriteAllBytes($elfPath,$header)
    [IO.File]::WriteAllBytes($metaPath,(New-Object byte[] 8))
    $wrongMagic=$false
    try {[void](Read-Il2CppInputInfo $elfPath $metaPath)} catch {$wrongMagic=$_.Exception.Message -like '*Metadata magic*'}
    if(!$wrongMagic){throw 'Invalid metadata magic was accepted.'}
    $sdk = Get-Sdk
    $helper = Build-RepairHelper (Join-Path $testRoot 'helper with spaces') $sdk
    $fixture = Join-Path $testRoot 'fixture with spaces'
    [void][IO.Directory]::CreateDirectory($fixture)
    Write-Utf8 (Join-Path $fixture 'Example.cs') @'
using System; using System.Runtime.InteropServices; using System.Collections.Generic; using System.Threading.Tasks;
using Start = InitializeOnLoadAttribute;
class InitializeOnLoadAttribute:Attribute {}
[Start] class Aliased {}
[InitializeOnLoad] class Example {
  public Example(int number);
  public int Absent();
  public int Number(out int value) { }
  public ref int Reference() { }
  public async Task<int> Async() { }
  public int Value { get { } set {} }
  public int Auto { get; set; }
  public IEnumerable<int> ExistingIterator() { yield return 42; }
  public IEnumerable<int> EmptyIterator() { }
  public static Example operator +(Example a, Example b) { }
  public static explicit operator int(Example a) { }
}
abstract class Abstract { public abstract int Keep(); }
interface Contract { int Keep(); }
[StructLayout(LayoutKind.Explicit)] struct Reviewed { [FieldOffset(0)] public object Ref; }
[StructLayout(LayoutKind.Explicit)] struct Native { [FieldOffset(0)] public int N; }
[StructLayout(LayoutKind.Explicit)] struct Interop { [FieldOffset(0), MarshalAs(UnmanagedType.I4)] public int N; }
interface IIndex<T> { T this[int index] {get;set;} }
interface IObjectIndex { object this[int index] {get;set;} }
class Items<T> : IIndex<T>, IObjectIndex {
  private T saved;
  // C# has no syntax for parameterized property 'Item'.
  public T get_Item(int index) {return saved;}
  public void set_Item(int position,T newValue) {int seen=position; saved=newValue;}
  // C# has no syntax for parameterized property 'IObjectIndex.Item'.
  object IObjectIndex.get_Item(int index) {return null;}
  void IObjectIndex.set_Item(int index,object value) {}
  public static T Calls(Items<T> items,T value) {items.set_Item(0,value); return items.get_Item(0);}
}
class JsonBase {
  // C# has no syntax for parameterized property 'Item'.
  public virtual int get_Item(int index) {return 1;}
  public virtual void set_Item(int index,int value) {}
  // C# has no syntax for parameterized property 'Item'.
  public virtual int get_Item(string key) {return 2;}
}
class JsonChild : JsonBase {
  // C# has no syntax for parameterized property 'Item'.
  public override int get_Item(int index) {return 3;}
  public override void set_Item(int index,int value) {}
}
struct BackingFixture {
  private readonly int Item;
  public BackingFixture(int value) {this.Item__BackingField=value;}
  public int Read() {return this.Item__BackingField;}
}
enum CupStageFixture { GROUP }
class EnumFixture {public CupStageFixture CupStageFixture() {return CupStageFixture.GROUP;}}
class BaseFixture {public BaseFixture(int root,string name) {}}
class DerivedFixture : BaseFixture {public DerivedFixture(int root,string name,bool extra) {}}
namespace UnityEngine {
  [AttributeUsage(AttributeTargets.Field)] public class PropertyAttribute : Attribute {}
  public class Texture2D {}
}
namespace UnityEngine.InputSystem.Layouts {
  public class InputControlAttribute : global::UnityEngine.PropertyAttribute {}
}
class DeviceFixture {
  [global::UnityEngine.InputSystem.Layouts.InputControl]
  [global::UnityEngine.InputSystem.Layouts.InputControl]
  public int Axis {get;set;}
}
namespace Gadsme.Core.Native {
  interface Tdabed9b_64 {global::UnityEngine.Texture2D P45 {get;} global::UnityEngine.Texture2D get_texture();}
  class Tdabed9b_Fixture : global::Gadsme.Core.Native.Tdabed9b_64 {
    public global::UnityEngine.Texture2D get_texture() {return null;}
  }
}
namespace Unity.SharpZipLib.Encryption {
  class CryptoFixture : global::System.Security.Cryptography.ICryptoTransform {
    public int InputBlockSize=>0; public int OutputBlockSize=>0; public bool CanTransformMultipleBlocks=>false;
    public int TransformBlock(byte[] input,int offset,int count,byte[] output,int outputOffset){return 0;}
    public byte[] TransformFinalBlock(byte[] input,int offset,int count){return null;}
    public void Dispose(){}
  }
}
'@
    $allow = Join-Path $testRoot 'allow.json'
    Write-Json $allow @('Reviewed','Interop')
    $report = Join-Path $testRoot 'repairs.json'
    Invoke-Owned $sdk.Exe @($helper,$fixture,$report,$allow) $testRoot (Join-Path $testRoot 'repair') 60
    $text = Get-Content -Encoding UTF8 -LiteralPath (Join-Path $fixture 'Example.cs') -Raw
    if ($text -match '\[(InitializeOnLoad|Start)\]' -or $text -notmatch 'yield return 42' -or $text -notmatch 'FieldOffset' -or $text -notmatch 'NotImplementedException') { throw 'Repair assertions failed.' }
    $results = Get-Content -Encoding UTF8 -LiteralPath $report -Raw | ConvertFrom-Json
    if (@($results.changes | Where-Object reason -Like '*reviewed*').Count -ne 2) { throw 'Layout allowlist assertions failed.' }
    Write-Utf8 (Join-Path $fixture 'Fixture.csproj') "<Project Sdk=`"Microsoft.NET.Sdk`"><PropertyGroup><TargetFramework>$($sdk.Tfm)</TargetFramework><NuGetAudit>false</NuGetAudit></PropertyGroup></Project>"
    Copy-Item -LiteralPath (Join-Path (Split-Path (Split-Path $helper)) 'NuGet.Config') -Destination $fixture
    Copy-Item -LiteralPath (Join-Path (Split-Path (Split-Path $helper)) 'global.json') -Destination $fixture
    Invoke-Owned $sdk.Exe @('build','Fixture.csproj','--nologo') $fixture (Join-Path $testRoot 'fixture-compile') 180
    $unityData=Join-Path (Split-Path $Editor) 'Data'
    $unityCsc=Join-Path $unityData 'Tools\Roslyn\csc.exe'
    $unityRef=Join-Path $unityData 'MonoBleedingEdge\lib\mono\4.6.1-api'
    Invoke-Owned $unityCsc @('/nologo','/noconfig','/nostdlib+','/langversion:8.0','/target:library',('/out:'+(Join-Path $testRoot 'UnityFixture.dll')),
        ('/r:'+(Join-Path $unityRef 'mscorlib.dll')),('/r:'+(Join-Path $unityRef 'System.dll')),('/r:'+(Join-Path $unityRef 'System.Core.dll')),(Join-Path $fixture 'Example.cs')) $testRoot (Join-Path $testRoot 'unity-fixture-compile') 120
    $beforeRepeat=(Get-FileHash -LiteralPath (Join-Path $fixture 'Example.cs')).Hash
    Invoke-Owned $sdk.Exe @($helper,$fixture,(Join-Path $testRoot 'repeat.json'),$allow) $testRoot (Join-Path $testRoot 'repeat') 60
    if((Get-FileHash -LiteralPath (Join-Path $fixture 'Example.cs')).Hash -ne $beforeRepeat){throw 'Repair is not idempotent.'}
    $ambiguous=Join-Path $testRoot 'ambiguous'
    [void][IO.Directory]::CreateDirectory($ambiguous)
    $ambiguousFile=Join-Path $ambiguous 'Ambiguous.cs'
    Write-Utf8 $ambiguousFile @'
class Ambiguous {
 // C# has no syntax for parameterized property 'Item'.
 public int get_Item(int index) {return 0;}
 public int get_Item(int other) {return 0;}
}
'@
    $ambiguousHash=(Get-FileHash -LiteralPath $ambiguousFile).Hash
    $ambiguousRejected=$false
    try {Invoke-Owned $sdk.Exe @($helper,$ambiguous,(Join-Path $testRoot 'ambiguous.json'),$allow) $testRoot (Join-Path $testRoot 'ambiguous') 60} catch {$ambiguousRejected=$_.Exception.Message -like '*exit code 3*'}
    if(!$ambiguousRejected -or (Get-FileHash -LiteralPath $ambiguousFile).Hash -ne $ambiguousHash){throw 'Ambiguous indexer changed a source file.'}
    $broken=Join-Path $testRoot 'broken-syntax'
    [void][IO.Directory]::CreateDirectory($broken)
    $brokenFile=Join-Path $broken 'Broken.cs'
    Write-Utf8 $brokenFile 'class Broken { public ??? BrokenMethod(';
    $hashBefore=(Get-FileHash -LiteralPath $brokenFile).Hash
    $syntaxRejected=$false
    try {Invoke-Owned $sdk.Exe @($helper,$broken,(Join-Path $testRoot 'syntax-errors.json'),$allow) $testRoot (Join-Path $testRoot 'syntax-rejection') 60} catch {$syntaxRejected=$_.Exception.Message -like '*exit code 2*'}
    if(!$syntaxRejected -or (Get-FileHash -LiteralPath $brokenFile).Hash -ne $hashBefore) {throw 'Invalid syntax was not safely preserved/reported.'}
    $blocked = $false
    try { Assert-Empty $fixture } catch { $blocked=$true }
    if (!$blocked) { throw 'Existing-output refusal failed.' }
    $blocked=$false
    try { [void](Assert-Contained $fixture (Join-Path $fixture '..\escape')) } catch {$blocked=$true}
    if (!$blocked) { throw 'Traversal protection failed.' }
    $powershell = Join-Path $env:SystemRoot 'System32\WindowsPowerShell\v1.0\powershell.exe'
    $p = Start-Owned $powershell @('-NoProfile','-Command','Start-Sleep -Seconds 15') $testRoot (Join-Path $testRoot 'timeout')
    $timedOut=$false
    try { Wait-Owned $p 1 'Synthetic timeout' } catch { $timedOut=$_.Exception.Message -like '*timed out*' }
    if (!$timedOut -or !$p.HasExited) { throw 'Process timeout/cleanup failed.' }
    $failed=$false
    try {Invoke-Owned $powershell @('-NoProfile','-Command','exit 7') $testRoot (Join-Path $testRoot 'failure') 10} catch {$failed=$_.Exception.Message -like '*exit code 7*'}
    if(!$failed) {throw 'Nonzero exit-code handling failed.'}
    $socket=New-Object Net.Sockets.TcpListener([Net.IPAddress]::Loopback,0)
    $socket.Start()
    try {
        $contender=New-Object Net.Sockets.TcpListener([Net.IPAddress]::Loopback,$socket.LocalEndpoint.Port)
        $collision=$false
        try {$contender.Start()} catch {$collision=$true} finally {$contender.Stop()}
        if(!$collision) {throw 'Occupied-port fixture did not reject a second listener.'}
    } finally {$socket.Stop()}
    Write-Output "Self-test passed. Synthetic fixtures and logs: $testRoot"
}

function Invoke-RipperRequest([string]$Base, [string]$Route, [hashtable]$Form, [int]$Timeout = $StageTimeoutSeconds) {
    $response = Invoke-WebRequest -Uri ($Base+$Route) -Method Post -Body $Form -ContentType 'application/x-www-form-urlencoded' -UseBasicParsing -TimeoutSec $Timeout
    if ($response.StatusCode -ne 200 -or $response.Content -match '(?i)<title>[^<]*(error|exception)') {
        throw "AssetRipper rejected $Route. Inspect AssetRipper logs."
    }
}
function Get-GuidInventory([string]$Assets) {
    $map=@{}
    foreach($file in Get-ChildItem -LiteralPath $Assets -Recurse -File -Filter '*.meta') {
        $match=[regex]::Match([IO.File]::ReadAllText($file.FullName),'(?m)^guid:\s*([0-9a-f]{32})\s*$')
        if($match.Success) {
            $guid=$match.Groups[1].Value
            if($map.ContainsKey($guid)) {throw "Duplicate asset GUID $guid in $($file.FullName) and $($map[$guid])"}
            $map[$guid]=$file.FullName.Substring($Assets.Length+1)
        }
    }
    return $map
}

function Assert-EditorClosed {
    $running=@(Get-CimInstance Win32_Process -Filter "Name = 'Unity.exe'" | Where-Object {
        $_.CommandLine -and $_.CommandLine.Replace('/','\').IndexOf($Project,[StringComparison]::OrdinalIgnoreCase) -ge 0
    })
    if($running.Count) {throw 'Close the Unity Editor for Soccer-Mobile-Pro before batch validation. No existing editor will be stopped.'}
}
function Invoke-ProjectValidation([string]$ReportsDirectory,[string]$LogsDirectory) {
    Assert-EditorClosed
    $old=[Environment]::GetEnvironmentVariable('SOCCER_RECOVERY_REPORTS','Process')
    try {
        [Environment]::SetEnvironmentVariable('SOCCER_RECOVERY_REPORTS',$ReportsDirectory,'Process')
        Invoke-Owned $Editor @('-batchmode','-projectPath',$Project,'-executeMethod','SoccerRecoveryValidation.Run','-logFile',(Join-Path $LogsDirectory 'unity.log')) $Project (Join-Path $LogsDirectory 'unity-process')
    } finally {
        [Environment]::SetEnvironmentVariable('SOCCER_RECOVERY_REPORTS',$old,'Process')
        $compilerLog=Join-Path $LogsDirectory 'unity.log'
        if(Test-Path -LiteralPath $compilerLog) {
            $diagnostics=@(Select-String -LiteralPath $compilerLog -Pattern 'error CS\d+' | ForEach-Object {$_.Line} | Sort-Object -Unique | ForEach-Object {
                if($_ -match '^(.*?)\((\d+),(\d+)\): error (CS\d+): (.*)$') {
                    [pscustomobject]@{file=$Matches[1];line=[int]$Matches[2];column=[int]$Matches[3];code=$Matches[4];message=$Matches[5]}
                } else {[pscustomobject]@{file='';line=0;column=0;code='';message=$_}}
            })
            Write-Json (Join-Path $ReportsDirectory 'compiler-errors.json') $diagnostics
        }
    }
    $path=Join-Path $ReportsDirectory 'unity-validation.json'
    if(!(Test-Path -LiteralPath $path)){throw 'Unity did not produce validation results; inspect the new Unity log.'}
    $result=Get-Content -Encoding UTF8 -LiteralPath $path -Raw | ConvertFrom-Json
    if(!$result.compiled -or $result.unityVersion -ne $TargetVersion){throw 'Unity version/compilation validation failed.'}
    $log=Get-Content -Encoding UTF8 -LiteralPath (Join-Path $LogsDirectory 'unity.log') -Raw
    if($log -match '(?im)(error CS\d+|Scripts have compiler errors|Assembly .* will not be loaded|Fatal Error!|Failed to load assembly|Safe Mode: Only loading)'){throw 'Unity reported compilation/assembly errors or entered Safe Mode.'}
    return $result
}
function Invoke-ExistingRecovery {
    Assert-EditorClosed
    [void](Assert-Contained 'C:\Users\ZGAMESVN\Downloads' $Project)
    [void](Assert-Contained 'C:\Users\ZGAMESVN\Downloads' $Recovery)
    [void][IO.Directory]::CreateDirectory($Recovery)
    $script:ExistingLease=[IO.File]::Open((Join-Path $Recovery 'existing-project.lock'),[IO.FileMode]::OpenOrCreate,[IO.FileAccess]::ReadWrite,[IO.FileShare]::None)
    foreach($path in @($Editor,(Join-Path $Project 'ProjectSettings\ProjectVersion.txt'),(Join-Path $Project 'Packages\manifest.json'))) {
        if(!(Test-Path -LiteralPath $path -PathType Leaf)){throw "Required existing-project input missing: $path"}
    }
    if((Get-Content -Encoding UTF8 -LiteralPath (Join-Path $Project 'ProjectSettings\ProjectVersion.txt') -Raw) -notmatch ('m_EditorVersion:\s*'+[regex]::Escape($TargetVersion)+'\b')){throw 'Existing project must target Unity 2020.3.49f1.'}
    $run=Join-Path $Recovery ('Runs\'+[DateTime]::UtcNow.ToString('yyyyMMdd-HHmmss')+'-'+[guid]::NewGuid().ToString('N').Substring(0,8))
    [void](Assert-Contained $Recovery $run)
    $script:reports=Join-Path $run 'Reports'; $logs=Join-Path $run 'Logs'
    foreach($dir in @($script:reports,$logs)){[void][IO.Directory]::CreateDirectory($dir)}
    $script:report=[ordered]@{status='Running';mode=if($ValidateOnly){'ValidateOnly'}else{'RepairExisting'};targetVersion=$TargetVersion;project=$Project;startedUtc=[DateTime]::UtcNow.ToString('o');stage='Preflight';stages=@();limitations=@('Gameplay methods remain stubs.','Older export provenance targets 2022.3; asset compatibility is checked separately.');run=$run}
    Write-Host "Recovery run: $run"
    Set-RecoveryStage 'Snapshot'
    $assets=Join-Path $Project 'Assets'
    foreach($folder in @($assets,(Join-Path $Project 'Packages'),(Join-Path $Project 'ProjectSettings'))) {
        [void](Assert-Contained $Project $folder)
        if(@(Get-ChildItem -LiteralPath $folder -Recurse -Force -Attributes ReparsePoint).Count){throw "Reparse points are not supported in repair inputs: $folder"}
    }
    $before=Get-GuidInventory $assets
    Write-Json (Join-Path $reports 'guids-before.json') $before
    $files=@(Get-ChildItem -LiteralPath $assets -Recurse -File | Where-Object {$_.Extension -in @('.cs','.meta','.asmdef','.asmref')})
    $files+=@(Get-ChildItem -LiteralPath (Join-Path $Project 'Packages'),(Join-Path $Project 'ProjectSettings') -Recurse -File)
    $manifest=@(foreach($file in $files) {
        $relative=$file.FullName.Substring($Project.Length+1)
        if(!$ValidateOnly) {
            # The run directory is newly owned and source paths were checked above.
            # Avoid thousands of redundant ancestor filesystem probes per snapshot.
            $dest=[IO.Path]::GetFullPath((Join-Path $run ('Backup\'+$relative)))
            if(!$dest.StartsWith($run+'\',[StringComparison]::OrdinalIgnoreCase)){throw 'Snapshot path escaped its run directory.'}
            [void][IO.Directory]::CreateDirectory((Split-Path $dest))
            [IO.File]::Copy($file.FullName,$dest,$false)
        }
        [pscustomobject]@{path=$relative;sha256=(Get-SnapshotHash $file.FullName)}
    })
    Write-Json (Join-Path $reports 'snapshot.json') $manifest
    if(!$ValidateOnly) {
        Set-RecoveryStage 'RepairScripts'
        $sdk=Get-Sdk
        $helper=Build-RepairHelper (Join-Path $run 'Tools\Repair') $sdk
        $allow=Join-Path $reports 'confirmed-noninterop-types.json'
        Write-Json $allow @($ConfirmedNonInteropLayoutTypes)
        Invoke-Owned $sdk.Exe @($helper,$assets,(Join-Path $reports 'script-repairs.json'),$allow) $run (Join-Path $logs 'script-repair')
        $validator=Join-Path $assets 'SoccerRecoveryValidation\Editor'
        [void][IO.Directory]::CreateDirectory($validator)
        Write-Utf8 (Join-Path $validator 'SoccerRecoveryValidation.cs') $ValidatorSource
        $definition=Join-Path $validator 'SoccerRecoveryValidation.asmdef'
        if(!(Test-Path -LiteralPath $definition)){Write-Json $definition @{name='SoccerRecoveryValidation';includePlatforms=@('Editor');autoReferenced=$false;overrideReferences=$true;precompiledReferences=@();references=@()}}
    }
    $after=Get-GuidInventory $assets
    foreach($guid in $before.Keys){if(!$after.ContainsKey($guid) -or $after[$guid] -ne $before[$guid]){throw "Asset GUID/path changed: $guid"}}
    $changes=@(foreach($entry in $manifest){$path=Join-Path $Project $entry.path; $hash=Get-SnapshotHash $path; if($hash -ne $entry.sha256){[pscustomobject]@{path=$entry.path;before=$entry.sha256;after=$hash}}})
    Write-Json (Join-Path $reports 'changed-files.json') $changes
    $report.changedFiles=$changes.Count; $report.preservedGuids=$before.Count
    Set-RecoveryStage 'UnityValidation'
    $result=Invoke-ProjectValidation $reports $logs
    $post=Get-GuidInventory $assets
    foreach($guid in $before.Keys){if(!$post.ContainsKey($guid) -or $post[$guid] -ne $before[$guid]){throw "Unity import changed original GUID/path: $guid"}}
    $report.validation=$result
    $report.assetIssues=@($result.items | Where-Object {$_.error -or $_.missingScripts -gt 0}).Count+@($result.editorErrors).Count
    $report.status=if($report.assetIssues){'CompiledWithAssetIssues'}else{'Compiled'}
    $report.stage='Complete';$report.finishedUtc=[DateTime]::UtcNow.ToString('o')
    Write-Json (Join-Path $reports 'recovery.json') $report
    Write-Host "Result: $($report.status). Reports: $reports"
}

if (@($SelfTest,$PreflightOnly,$RepairExisting,$ValidateOnly | Where-Object {$_}).Count -gt 1) {throw 'Choose one mode: SelfTest, PreflightOnly, RepairExisting or ValidateOnly.'}
try {
    if ($SelfTest) { Invoke-SelfTest; return }
    if ($RepairExisting -or $ValidateOnly) {Invoke-ExistingRecovery; return}
    $preflight=Get-Preflight
    if ($PreflightOnly) { $preflight | ConvertTo-Json -Depth 5; return }

    [void][IO.Directory]::CreateDirectory($Recovery)
    $ownership=[IO.File]::Open((Join-Path $Recovery 'recovery-owner.lock'),[IO.FileMode]::CreateNew,[IO.FileAccess]::Write,[IO.FileShare]::None)
    $ownership.Dispose() # persistent marker makes concurrent/repeated invocations fail closed
    Assert-Empty $Project
    [void][IO.Directory]::CreateDirectory($Project)
    foreach($dir in @('Extracted','Tools','OriginalExport','Il2Cpp','Reports','Logs')) {
        [void][IO.Directory]::CreateDirectory((Join-Path $Recovery $dir))
    }
    $reports=Join-Path $Recovery 'Reports'
    $logs=Join-Path $Recovery 'Logs'
    $report=[ordered]@{ status='Running'; stage=$script:Stage; source=$preflight; targetVersion=$TargetVersion; startedUtc=[DateTime]::UtcNow.ToString('o'); limitations=@('Method bodies are stubs; this is not a playable gameplay reconstruction.','Unity version conversion is experimental.'); stages=@() }
    Write-Json (Join-Path $reports 'recovery.json') $report

    Set-RecoveryStage 'InspectAndExtract'
    Write-Host 'Inspecting APK backend and extracting matched recovery inputs...'
    Add-Type -AssemblyName System.IO.Compression.FileSystem
    $archive=[IO.Compression.ZipFile]::OpenRead($Apk)
    try {
        $entries=@($archive.Entries)
        $binaries=@($entries | Where-Object FullName -eq 'lib/arm64-v8a/libil2cpp.so')
        $metadata=@($entries | Where-Object FullName -eq 'assets/bin/Data/Managed/Metadata/global-metadata.dat')
        $allIl2cpp=@($entries | Where-Object FullName -match '(^|/)libil2cpp\.so$')
        $mono=@($entries | Where-Object FullName -match '^assets/bin/Data/Managed/[^/]+\.dll$')
        if($allIl2cpp.Count -or $metadata.Count) {
            if($binaries.Count -ne 1 -or $metadata.Count -ne 1) { throw 'Incomplete/ambiguous IL2CPP input: exactly one ARM64 binary and metadata pair is required.' }
            $report.backend='IL2CPP'
        } elseif($mono.Count) { $report.backend='Mono' }
        else { throw 'No supported Unity IL2CPP or managed Mono backend found. Supply the complete APK/splits.' }
        $selected=@($binaries)+@($metadata)+@($entries | Where-Object FullName -eq 'assets/bin/Data/globalgamemanagers')
        if($report.backend -eq 'Mono') { $selected+=@($mono) }
        foreach($entry in $selected) {
            $target=Assert-Contained (Join-Path $Recovery 'Extracted') (Join-Path (Join-Path $Recovery 'Extracted') $entry.FullName)
            [void][IO.Directory]::CreateDirectory([IO.Path]::GetDirectoryName($target))
            [IO.Compression.ZipFileExtensions]::ExtractToFile($entry,$target,$false)
        }
        $report.apkEntryCount=$entries.Count
    } finally { $archive.Dispose() }
    $ggm=Join-Path $Recovery 'Extracted\assets\bin\Data\globalgamemanagers'
    if(!(Test-Path -LiteralPath $ggm)) { throw 'globalgamemanagers missing; cannot establish original engine version.' }
    $stream=[IO.File]::OpenRead($ggm)
    try { $header=New-Object byte[] 128; [void]$stream.Read($header,0,$header.Length) } finally {$stream.Dispose()}
    $versionMatch=[regex]::Match([Text.Encoding]::ASCII.GetString($header),'\d{4}\.\d+\.\d+[abfp]\d+')
    if(!$versionMatch.Success) {throw 'Cannot identify source Unity version from serialized header.'}
    $report.sourceUnityVersion=$versionMatch.Value

    if($report.backend -eq 'IL2CPP') {
        Set-RecoveryStage 'Il2CppDumper'
        $privateDumper=Join-Path $Recovery 'Tools\Il2CppDumper'
        Copy-Item -LiteralPath (Split-Path $Dumper) -Destination $privateDumper -Recurse
        $configPath=Join-Path $privateDumper 'config.json'
        $config=Get-Content -Encoding UTF8 -LiteralPath $configPath -Raw | ConvertFrom-Json
        $config.GenerateDummyDll=$true; $config.GenerateStruct=$true; $config.RequireAnyKey=$false
        $config.ForceIl2CppVersion=$false; $config.ForceDump=$false
        Write-Json $configPath $config
        $binary=Join-Path $Recovery 'Extracted\lib\arm64-v8a\libil2cpp.so'
        $meta=Join-Path $Recovery 'Extracted\assets\bin\Data\Managed\Metadata\global-metadata.dat'
        $metadataVersion=Read-Il2CppInputInfo $binary $meta
        $report.metadataVersion=$metadataVersion
        $report.binarySha256=(Get-FileHash -LiteralPath $binary).Hash
        $report.metadataSha256=(Get-FileHash -LiteralPath $meta).Hash
        $dumpOut=Join-Path $Recovery 'Il2Cpp'
        Invoke-Owned (Join-Path $privateDumper 'Il2CppDumper.exe') @($binary,$meta,$dumpOut) $privateDumper (Join-Path $logs 'il2cpp')
        foreach($name in @('dump.cs','script.json','stringliteral.json','il2cpp.h')) {
            if(!(Test-Path -LiteralPath (Join-Path $dumpOut $name))) {throw "Il2CppDumper did not produce $name. Inspect logs for unsupported metadata or registration failures."}
        }
        if(@(Get-ChildItem -LiteralPath (Join-Path $dumpOut 'DummyDll') -Filter '*.dll' -ErrorAction SilentlyContinue).Count -eq 0) {throw 'Il2CppDumper produced no dummy assemblies.'}
        # Enrichment scripts ship with the tool; the dumper need not copy them itself.
        Get-ChildItem -LiteralPath $privateDumper -Filter '*.py' | Copy-Item -Destination $dumpOut
    }

    Set-RecoveryStage 'AssetRipperExport'
    Write-Host 'Exporting APK through the installed AssetRipper headless HTTP API...'
    $privateRipper=Join-Path $Recovery 'Tools\AssetRipper'
    Copy-Item -LiteralPath (Split-Path $Ripper) -Destination $privateRipper -Recurse
    $listener=New-Object Net.Sockets.TcpListener([Net.IPAddress]::Loopback,0)
    $listener.Start(); $port=$listener.LocalEndpoint.Port; $listener.Stop()
    $base="http://127.0.0.1:$port"
    $p=Start-Owned (Join-Path $privateRipper (Split-Path $Ripper -Leaf)) @('--headless','--port',"$port",'--log-path',(Join-Path $logs 'assetripper.log')) $privateRipper (Join-Path $logs 'assetripper')
    $ready=$false; $clock=[Diagnostics.Stopwatch]::StartNew()
    while($clock.Elapsed.TotalSeconds -lt 60 -and !$p.HasExited) {
        try {$page=Invoke-WebRequest "$base/Settings/Edit" -UseBasicParsing -TimeoutSec 2; $ready=$page.StatusCode -eq 200; if($ready){break}} catch {}
        Start-Sleep -Milliseconds 500; $p.Refresh()
    }
    if(!$ready -or $p.HasExited) {throw 'AssetRipper did not start its local API. Check port/process logs.'}
    # Ensure the listener belongs to our process, not a competing port claimant.
    if(@(Get-NetTCPConnection -LocalPort $port -State Listen | Where-Object OwningProcess -eq $p.Id).Count -eq 0) {throw 'AssetRipper port ownership verification failed.'}
    $settings=@{
        DefaultVersion=$report.sourceUnityVersion; TargetVersion=$TargetVersion;
        ScriptContentLevel='Level1'; ScriptExportMode='Decompiled'; ScriptLanguageVersion='CSharp8_0';
        StreamingAssetsMode='Extract'; ShaderExportMode='Decompile';
        ScriptTypesFullyQualified='on'; RemoveNullableAttributes='on'; ExportUnreadableAssets='on';
        SaveSettingsToDisk='on'
    }
    foreach($key in @('TargetVersion','ScriptContentLevel','ScriptExportMode','ScriptLanguageVersion','ShaderExportMode')) {
        if($page.Content -notmatch ('name="'+$key+'"')) {throw "Unsupported AssetRipper settings contract: $key"}
    }
    Invoke-RipperRequest $base '/Settings/Update' $settings 60
    $saved=Get-Content -Encoding UTF8 -LiteralPath (Join-Path $privateRipper 'AssetRipper.Settings.json') -Raw | ConvertFrom-Json
    if($saved.Import.TargetVersion -ne $TargetVersion -or [string]$saved.Import.ScriptContentLevel -notin @('1','Level1') -or [string]$saved.Export.ScriptExportMode -notin @('0','Decompiled')) {throw 'AssetRipper did not accept the requested target/stub/source settings.'}
    Write-Json (Join-Path $reports 'assetripper-settings.json') $saved
    Invoke-RipperRequest $base '/LoadFile' @{Path=$Apk}
    Invoke-RipperRequest $base '/Export/UnityProject' @{Path=$Project;CreateSubfolder='false'}
    if(!$p.HasExited) {$p.Kill(); $p.WaitForExit()}
    if(!(Test-Path -LiteralPath (Join-Path $Project 'Assets'))) {
        $candidates=@(Get-ChildItem -LiteralPath $Project -Directory | Where-Object {Test-Path -LiteralPath (Join-Path $_.FullName 'Assets')})
        if($candidates.Count -ne 1) {throw 'AssetRipper export did not yield exactly one Unity project.'}
        $wrapper=Assert-Contained $Project $candidates[0].FullName
        foreach($child in Get-ChildItem -LiteralPath $wrapper -Force) {
            $dest=Assert-Contained $Project (Join-Path $Project $child.Name)
            if(Test-Path -LiteralPath $dest) {throw "Project wrapper collision: $dest"}
            Move-Item -LiteralPath $child.FullName -Destination $dest
        }
        Remove-Item -LiteralPath $wrapper # now empty; never recursively delete an output
    }
    foreach($child in Get-ChildItem -LiteralPath $Project -Force) {Copy-Item -LiteralPath $child.FullName -Destination (Join-Path $Recovery 'OriginalExport') -Recurse}
    $assets=Join-Path $Project 'Assets'
    $initialGuids=Get-GuidInventory $assets
    Write-Json (Join-Path $reports 'original-guids.json') $initialGuids
    if(@(Get-ChildItem -LiteralPath $assets -Recurse -Filter '*.unity').Count -eq 0) {throw 'Export contains no recovered scenes.'}
    if(@(Get-ChildItem -LiteralPath $assets -Recurse -Filter '*.cs').Count -eq 0) {throw 'Export contains no recovered C# scripts.'}
    $dlls=@(Get-ChildItem -LiteralPath $assets -Recurse -Filter '*.dll')
    Write-Json (Join-Path $reports 'unexpected-assemblies.json') @($dlls | Select-Object FullName)
    if($dlls.Count) {throw 'Source-only export contains DLLs. Review unexpected-assemblies.json before importing; no DLL was silently deleted.'}
    if(!(Test-Path -LiteralPath (Join-Path $assets 'Scripts'))) {throw 'Exporter did not produce Assets\Scripts. Refusing a blind relocation across assembly boundaries.'}

    Set-RecoveryStage 'RepairAndMap'
    $helper=Build-RepairHelper (Join-Path $Recovery 'Tools\Repair') $preflight.sdk
    $allowPath=Join-Path $reports 'confirmed-noninterop-types.json'
    Write-Json $allowPath @($ConfirmedNonInteropLayoutTypes)
    Invoke-Owned $preflight.sdk.Exe @($helper,$assets,(Join-Path $reports 'script-repairs.json'),$allowPath) $Recovery (Join-Path $logs 'script-repair')
    $javaRoot=Join-Path $Source 'app\src\main\java'
    $typeInventory=(Get-Content -Encoding UTF8 -LiteralPath (Join-Path $reports 'script-repairs.json') -Raw | ConvertFrom-Json).types
    $bridges=@(Get-ChildItem -LiteralPath $javaRoot -Recurse -Filter '*.java' | Select-String -Pattern 'UnitySendMessage\s*\(|"UnitySendMessage"|System\.loadLibrary\s*\(|\bnative\s+[^;{]+\(' | ForEach-Object {
        $line=$_.Line.Trim()
        $send=[regex]::Match($line,'UnitySendMessage\s*\(\s*"([^"]+)"\s*,\s*"([^"]+)"')
        $candidates=@()
        if($send.Success) {
            $method=$send.Groups[2].Value
            $candidates=@($typeInventory | Where-Object {$_.methods -contains $method} | Select-Object file,fullName)
        }
        [pscustomobject]@{ source=$_.Path; line=$_.LineNumber; declaration=$line;
            gameObjectTarget=if($send.Success){$send.Groups[1].Value}else{$null};
            methodTarget=if($send.Success){$send.Groups[2].Value}else{$null}; candidates=$candidates;
            mapping='Unverified candidates only: UnitySendMessage targets scene objects, not class names; JNI/dynamic calls require manual mapping' }
    })
    Write-Json (Join-Path $reports 'java-bridges.json') $bridges
    $currentGuids=Get-GuidInventory $assets
    foreach($guid in $initialGuids.Keys) {if(!$currentGuids.ContainsKey($guid)) {throw "Repair lost asset GUID $guid"}}
    $missingRefs=@(Get-ChildItem -LiteralPath $assets -Recurse -File | Where-Object Extension -in @('.unity','.prefab','.asset','.mat','.controller') | ForEach-Object {
        $path=$_.FullName
        foreach($m in [regex]::Matches([IO.File]::ReadAllText($path),'guid:\s*([0-9a-f]{32})')) {
            $g=$m.Groups[1].Value
            if($g -notmatch '^0{16}' -and !$currentGuids.ContainsKey($g)) {[pscustomobject]@{file=$path;guid=$g;status='Not in Assets: check Packages or missing export'}}
        }
    })
    Write-Json (Join-Path $reports 'external-or-missing-references.json') $missingRefs
    if(!(Test-Path -LiteralPath (Join-Path $Project 'Packages\manifest.json'))) {throw 'Export is missing Packages\manifest.json; cannot safely infer package dependencies.'}
    [void](Get-Content -Encoding UTF8 -LiteralPath (Join-Path $Project 'Packages\manifest.json') -Raw | ConvertFrom-Json)
    $versionFile=Join-Path $Project 'ProjectSettings\ProjectVersion.txt'
    if(!(Test-Path -LiteralPath $versionFile) -or (Get-Content -Encoding UTF8 -LiteralPath $versionFile -Raw) -notmatch ('m_EditorVersion:\s*'+[regex]::Escape($TargetVersion)+'\b')) {throw 'Export target version does not match 2020.3.49f1.'}
    $validationDir=Join-Path $assets 'SoccerRecoveryValidation\Editor'
    if(Test-Path -LiteralPath (Split-Path $validationDir)) {throw 'Recovery validator path conflicts with an exported asset.'}
    [void][IO.Directory]::CreateDirectory($validationDir)
    Write-Utf8 (Join-Path $validationDir 'SoccerRecoveryValidation.cs') $ValidatorSource
    Write-Json (Join-Path $validationDir 'SoccerRecoveryValidation.asmdef') @{name='SoccerRecoveryValidation';includePlatforms=@('Editor');autoReferenced=$false;overrideReferences=$true;precompiledReferences=@();references=@()}

    Set-RecoveryStage 'UnityValidation'
    Write-Host 'Importing and validating with Unity 2020.3.49f1. Package resolution may require network access.'
    $validation=Invoke-ProjectValidation $reports $logs
    $report.validation=$validation
    $report.assetIssues=@($validation.items | Where-Object {$_.error -or $_.missingScripts -gt 0}).Count + @($validation.editorErrors).Count
    $report.status=if($report.assetIssues -gt 0 -or $missingRefs.Count -gt 0){'CompiledWithAssetIssues'}else{'Compiled'}
    $report.stage='Complete'; $report.finishedUtc=[DateTime]::UtcNow.ToString('o')
    Write-Json (Join-Path $reports 'recovery.json') $report
    Write-Host "Recovery result: $($report.status). Project: $Project"
    Write-Host "Review $reports\recovery.json. Gameplay methods remain stubs."
} catch {
    if($null -ne $report -and $reports) {
        $report.status='Failed'; $report.stage=$script:Stage; $report.error=$_.Exception.ToString(); $report.finishedUtc=[DateTime]::UtcNow.ToString('o')
        Write-Json (Join-Path $reports 'recovery.json') $report
    }
    throw
} finally {
    if($null -ne $script:ExistingLease){$script:ExistingLease.Dispose()}
    foreach($process in $script:OwnedProcesses) {
        try {if(!$process.HasExited){$process.Kill();$process.WaitForExit()}} catch {Write-Warning "Could not stop owned process $($process.Id): $_"}
        $process.Dispose()
    }
}

```
