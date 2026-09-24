package com.ironsource.adqualitysdk.sdk.p286i;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.hv */
/* JADX INFO: loaded from: classes6.dex */
public final class C12019hv {

    /* JADX INFO: renamed from: ﻐ */
    private static C12019hv f29231;

    /* JADX INFO: renamed from: ﾒ */
    private final C12014hq f29233 = new C12014hq();

    /* JADX INFO: renamed from: ﻛ */
    private final C12023hz f29232 = new C12023hz();

    private C12019hv() {
    }

    /* JADX INFO: renamed from: ﾒ */
    public static synchronized C12019hv m30362() {
        if (f29231 == null) {
            f29231 = new C12019hv();
        }
        return f29231;
    }

    /* JADX INFO: renamed from: ﾇ */
    public final C12014hq m30364() {
        return this.f29233;
    }

    /* JADX INFO: renamed from: ﻐ */
    public final C12023hz m30363() {
        return this.f29232;
    }

    /* JADX INFO: renamed from: ﻛ */
    public static synchronized void m30361() {
        f29231 = null;
    }
}
