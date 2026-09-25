// @category Recovery
// Targeted analysis in the external recovery database; never executes native code.
import ghidra.app.script.GhidraScript;
import ghidra.app.decompiler.DecompInterface;
import ghidra.program.model.address.Address;
import ghidra.program.model.listing.Function;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.charset.StandardCharsets;
public class ExportLobbyDecomp extends GhidraScript {
    public void run() throws Exception {
        Address base = currentProgram.getImageBase();
        StringBuilder output = new StringBuilder("// Image base: " + base + "; displayed addresses = RVA + base.\n");
        DecompInterface decompiler = new DecompInterface();
        decompiler.openProgram(currentProgram);
        try {
            for (String line : Files.readAllLines(Paths.get(getScriptArgs()[0]))) {
                String[] parts = line.split(",");
                long start = Long.decode(parts[0]), end = Long.decode(parts[1]);
                Address address = base.add(start);
                clearListing(address, base.add(end-1));
                disassemble(address);
                Function function = getFunctionAt(address);
                if (function == null) function = createFunction(address, "Lobby_" + Long.toHexString(start));
                output.append("\n// RVA ").append(parts[0]).append(" ").append(parts[2]).append("\n");
                if (function == null) { output.append("Function creation failed\n"); continue; }
                var result = decompiler.decompileFunction(function, 30, monitor);
                output.append(result.decompileCompleted() ? result.getDecompiledFunction().getC() : result.getErrorMessage());
            }
        } finally { decompiler.dispose(); }
        Files.write(Paths.get(getScriptArgs()[1]), (output.toString().replaceAll("(?m)[ \\t]+$", "").stripTrailing()+"\n").getBytes(StandardCharsets.UTF_8));
    }
}
