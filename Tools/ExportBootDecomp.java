// Run against a private Ghidra project copy only; no native execution.
// @category Recovery
import ghidra.app.script.GhidraScript;
import ghidra.app.decompiler.DecompInterface;
import ghidra.program.model.address.Address;
import ghidra.program.model.listing.Function;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.charset.StandardCharsets;

public class ExportBootDecomp extends GhidraScript {
    public void run() throws Exception {
        long[][] spans = {{0xd42494L,0xd42600L}, {0xd42600L,0xd429acL},
            {0xd429acL,0xd42a24L}, {0xd42a24L,0xd42a94L}, {0xd42aa0L,0xd42bd0L},
            {0xd42bd0L,0xd42c0cL}, {0xc568a0L,0xc56ba4L}};
        long[] starts = {0xd42494L,0xd424a8L,0xd42600L,0xd429acL,0xd42a24L,0xd42aa0L,0xd42bd0L,0xc568a0L};
        Address base = currentProgram.getImageBase();
        for (long[] span : spans) clearListing(base.add(span[0]), base.add(span[1]-1));
        StringBuilder output = new StringBuilder();
        output.append("// Ghidra image base: ").append(base).append("; virtual addresses below include this base.\n");
        DecompInterface decompiler = new DecompInterface();
        decompiler.openProgram(currentProgram);
        try {
            for (long value : starts) {
                Address address = base.add(value);
                disassemble(address);
                Function function = getFunctionAt(address);
                if (function == null) function = createFunction(address, "Recovery_" + Long.toHexString(value));
                output.append("\n// RVA 0x").append(Long.toHexString(value)).append("\n");
                if (function == null) { output.append("Function creation failed\n"); continue; }
                var result = decompiler.decompileFunction(function, 30, monitor);
                output.append(result.decompileCompleted() ? result.getDecompiledFunction().getC() : result.getErrorMessage());
            }
        } finally { decompiler.dispose(); }
        String text = output.toString().replaceAll("(?m)[ \\t]+$", "").stripTrailing() + "\n";
        Files.write(Paths.get(getScriptArgs()[0]), text.getBytes(StandardCharsets.UTF_8));
    }
}
