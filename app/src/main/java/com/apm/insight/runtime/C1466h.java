package com.apm.insight.runtime;

import android.text.TextUtils;
import com.apm.insight.C1373a;
import com.apm.insight.C1386c;
import com.apm.insight.C1390e;
import com.apm.insight.p011b.C1383h;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import org.json.JSONArray;

/* JADX INFO: renamed from: com.apm.insight.runtime.h */
/* JADX INFO: compiled from: LogcatDump.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C1466h {

    /* JADX INFO: renamed from: a */
    private static C1383h.a f861a;

    /* JADX INFO: renamed from: a */
    public static JSONArray m1642a(String str) {
        if (!C1390e.m1047v()) {
            return null;
        }
        if (f861a != null && C1390e.m1030f().equals(str)) {
            try {
                return m1644b(f861a.m978b());
            } catch (Throwable th) {
                C1386c.m990a();
                C1468j.m1652a(th, "NPTH_CATCH");
            }
        }
        try {
            return m1644b(C1373a.m856a(str, C1390e.m1034i().getLogcatDumpCount(), C1390e.m1034i().getLogcatLevel()).getAbsolutePath());
        } catch (Throwable th2) {
            C1386c.m990a();
            C1468j.m1652a(th2, "NPTH_CATCH");
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m1643a(C1383h.a aVar) {
        f861a = aVar;
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x004b: MOVE (r1 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:25:0x004b */
    /* JADX INFO: renamed from: b */
    private static JSONArray m1644b(String str) throws Throwable {
        Closeable closeable;
        BufferedReader bufferedReader;
        Closeable closeable2 = null;
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            try {
                JSONArray jSONArray = new JSONArray();
                bufferedReader = new BufferedReader(new FileReader(str));
                try {
                    File file = new File(str);
                    if (file.length() > 512000) {
                        bufferedReader.skip(file.length() - 512000);
                    }
                    while (true) {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            C1373a.m860a((Closeable) bufferedReader);
                            return jSONArray;
                        }
                        jSONArray.put(line);
                    }
                } catch (IOException e) {
                    e = e;
                    e.printStackTrace();
                    C1373a.m860a((Closeable) bufferedReader);
                    return null;
                }
            } catch (IOException e2) {
                e = e2;
                bufferedReader = null;
            } catch (Throwable th) {
                th = th;
                C1373a.m860a(closeable2);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            closeable2 = closeable;
        }
    }
}
