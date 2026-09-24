package com.apm.insight.p011b;

import com.apm.insight.C1390e;
import com.apm.insight.p016f.C1399a;
import com.apm.insight.p016f.C1400b;

/* JADX INFO: renamed from: com.apm.insight.b.a */
/* JADX INFO: compiled from: ANRInfoHelper.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C1376a {
    public C1376a() {
        C1399a.m1123a();
    }

    /* JADX INFO: renamed from: a */
    public static void m903a(String str) {
        if (C1390e.m1034i().isEnsureEnable()) {
            C1400b.m1131a(Thread.currentThread().getStackTrace(), str, "EnsureNotReachHere");
        }
    }
}
