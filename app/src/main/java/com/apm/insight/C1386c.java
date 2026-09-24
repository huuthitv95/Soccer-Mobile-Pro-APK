package com.apm.insight;

import com.apm.insight.p011b.C1376a;
import com.apm.insight.p016f.C1400b;
import com.apm.insight.p022l.C1431g;

/* JADX INFO: renamed from: com.apm.insight.c */
/* JADX INFO: compiled from: Ensure.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C1386c {

    /* JADX INFO: renamed from: a */
    private static C1376a f493a = new C1376a();

    /* JADX INFO: renamed from: a */
    public static C1376a m990a() {
        return f493a;
    }

    /* JADX INFO: renamed from: a */
    public static void m991a(Throwable th, String str) {
        if (!C1390e.m1034i().isEnsureEnable() || C1431g.m1348a(th)) {
            return;
        }
        C1400b.m1127a(th, str, "core_exception_monitor");
    }
}
