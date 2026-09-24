package com.apm.insight.p012c;

import com.apm.insight.C1390e;
import com.apm.insight.runtime.C1447a;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.apm.insight.c.a */
/* JADX INFO: compiled from: CommandWriter.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C1387a {

    /* JADX INFO: renamed from: a */
    private static AtomicBoolean f494a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: a */
    public static boolean m992a() {
        synchronized (f494a) {
            if (f494a.get()) {
                return false;
            }
            f494a.set(true);
            return m993b();
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m993b() {
        if (!C1447a.m1542g()) {
            return false;
        }
        try {
            File file = new File(C1390e.m1033h().getFilesDir(), "apminsight/crashCommand");
            file.mkdirs();
            new File(file, "0_" + System.currentTimeMillis()).createNewFile();
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
