using AssetsTools.NET;
using AssetsTools.NET.Extra;
using System.Security.Cryptography;
using System.Text.Json;

if (args.Length != 1) throw new ArgumentException("GlobalConfigAudit <run-directory>");
var run = Path.GetFullPath(args[0]);
var manager = new AssetsManager();
manager.LoadClassPackage(@"C:\Tools\UABEA\classdata.tpk");
manager.LoadClassDatabaseFromPackage("2020.3.49f1");
var bundle = manager.LoadBundleFile(Path.Combine(run, "ui.unity3d"), true);
var assets = manager.LoadAssetsFileFromBundle(bundle, 0, false);
var global = manager.LoadAssetsFile(Path.Combine(run, "globalgamemanagers.assets"), false);
byte[] Raw(AssetsFileInstance file, AssetFileInfo info) {
    file.file.Reader.Position = info.GetAbsoluteByteOffset(file.file);
    var data = file.file.Reader.ReadBytes((int)info.ByteSize);
    if (data.Length != info.ByteSize) throw new EndOfStreamException();
    return data;
}
string Hash(byte[] bytes) => Convert.ToHexString(SHA256.HashData(bytes)).ToLowerInvariant();
object Describe(AssetTypeValueField node) => new {
    name = node.FieldName, type = node.TypeName, aligned = node.TemplateField.IsAligned,
    value = node.Value == null ? null : node.TypeName == "string" ? node.AsString : node.Value.AsObject,
    children = node.Children.Select(Describe).ToArray()
};
var component = assets.file.GetAssetInfo(5332196853466566746);
var raw = Raw(assets, component);
var template = manager.GetTemplateBaseField(assets, component, AssetReadFlags.SkipMonoBehaviourFields);
var reader = assets.file.Reader;
var start = component.GetAbsoluteByteOffset(assets.file);
reader.Position = start;
var header = template.MakeValue(reader);
var consumed = reader.Position - start;
var scriptId = header["m_Script"]["m_PathID"].AsLong;
var scriptFileId = header["m_Script"]["m_FileID"].AsInt;
var type = assets.file.Metadata.TypeTreeTypes[component.TypeIdOrIndex];
object Script(AssetsFileInstance file, long pathId) {
    var info = file.file.GetAssetInfo(pathId);
    var bytes = Raw(file, info);
    var field = manager.GetBaseField(file, info);
    return new { file = file.name, pathId, byteSize = bytes.Length,
        rawHex = Convert.ToHexString(bytes).ToLowerInvariant(), rawSha256 = Hash(bytes), fields = Describe(field) };
}
// Read the string using the serialized-file reader and preserve its exact bytes/characters.
var result = new {
    parser = typeof(AssetsManager).Assembly.FullName,
    serializedFile = assets.name, unityVersionRaw = assets.file.Metadata.UnityVersion,
    serializedVersion = assets.file.Header.Version,
    typeTreeEnabled = assets.file.Metadata.TypeTreeEnabled,
    pathId = component.PathId, byteSize = raw.Length, typeIndex = component.TypeIdOrIndex,
    scriptTypeIndex = type.ScriptTypeIndex, scriptIdHash = type.ScriptIdHash.ToString(),
    oldTypeHash = type.TypeHash.ToString(), nodeCount = assets.file.Metadata.TypeTreeEnabled ? type.Nodes.Count : 0,
    headerBytesConsumed = consumed, tailBytes = raw.Length - consumed,
    header = Describe(header), scriptFileId, scriptPathId = scriptId,
    rawHex = Convert.ToHexString(raw).ToLowerInvariant(), rawSha256 = Hash(raw),
    scripts = new[] { Script(assets, scriptId), Script(global, 2212) }
};
File.WriteAllBytes(Path.Combine(run, "component-5332196853466566746.bin"), raw);
File.WriteAllText(Path.Combine(run, "independent-assets-audit.json"), JsonSerializer.Serialize(result, new JsonSerializerOptions { WriteIndented = true }));
Console.WriteLine($"Component: {raw.Length} bytes; header: {consumed}; tail: {raw.Length-consumed}; script: {scriptFileId}:{scriptId}; tree: {result.typeTreeEnabled}");
var recovery = Directory.GetParent(Directory.GetParent(run)!.FullName)!.FullName;
var generator = new AssetsTools.NET.Extra.MonoCecilTempGenerator(
    Path.Combine(run,"Il2CppDumper/DummyDll/Assembly-CSharp.dll"));
{
    manager.MonoTempGenerator=generator;
    var sibling=assets.file.GetAssetInfo(1730457265849705995); // Win_Empty: same type hash, distinct script ID.
    var siblingStart=sibling.GetAbsoluteByteOffset(assets.file);
    var siblingRaw=Raw(assets,sibling);
    reader.Position=siblingStart;
    var candidate=manager.GetBaseField(assets,sibling,AssetReadFlags.None);
    var candidateBytes=reader.Position-siblingStart;
    var roundTrip=candidate.WriteToByteArray();
    File.WriteAllText(Path.Combine(run,"sibling-schema-candidate.json"),JsonSerializer.Serialize(new {
        sourceClass="Win_Empty", sourcePathId=sibling.PathId, targetPathId=component.PathId,
        confidence="Unverified sibling candidate: shared type hash does not prove original inheritance or methods",
        sourceByteSize=siblingRaw.Length, sourceRawSha256=Hash(siblingRaw),
        bytesConsumed=candidateBytes, roundTripByteSize=roundTrip.Length,
        roundTripMatchesSource=siblingRaw.SequenceEqual(roundTrip),
        exposedFieldCount=candidate.Children.Count, exposedFieldNames=candidate.Children.Select(c=>c.FieldName).ToArray(),
        assessment=candidate.Children.Count>4 && siblingRaw.SequenceEqual(roundTrip)
            ? "Candidate fields emitted and round-trip verified; still not proof of Win_GlobalConfig's type hierarchy."
            : "No usable sibling layout recovered: parsed value exposed only base header fields and/or failed raw round-trip.",
        fields=Describe(candidate)
    },new JsonSerializerOptions{WriteIndented=true}));
}
manager.UnloadAll();
