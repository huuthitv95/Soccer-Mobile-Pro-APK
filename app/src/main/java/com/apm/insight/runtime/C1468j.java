package com.apm.insight.runtime;

import com.apm.insight.C1390e;
import com.apm.insight.MonitorCrash;

/* JADX INFO: renamed from: com.apm.insight.runtime.j */
/* JADX INFO: compiled from: MonitorCrashInner.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C1468j {

    /* JADX INFO: renamed from: a */
    private static MonitorCrash f867a = null;

    /* JADX INFO: renamed from: b */
    private static int f868b = -1;

    /* JADX INFO: renamed from: c */
    private static int f869c;

    /* JADX INFO: renamed from: a */
    public static MonitorCrash m1651a() {
        if (f867a == null) {
            MonitorCrash monitorCrashInitSDK = MonitorCrash.initSDK(C1390e.m1032g(), "239017", 20089L, "2008-20250701130429", "com.apm.insight");
            f867a = monitorCrashInitSDK;
            monitorCrashInitSDK.config().setChannel("release");
        }
        return f867a;
    }

    /* JADX INFO: renamed from: a */
    public static void m1652a(Throwable th, String str) {
        if (C1390e.m1032g() == null) {
            return;
        }
        if (f868b == -1) {
            f868b = 5;
        }
        int i = f869c;
        if (i < f868b) {
            f869c = i + 1;
            m1651a().reportCustomErr(str, "INNER", th);
        }
    }
}
