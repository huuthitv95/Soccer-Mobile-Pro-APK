package com.facebook.ads.redexgen.core;

import android.os.SystemClock;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.CF */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C5029CF implements InterfaceC6958hc {
    public static final C5029CF A00 = new C5029CF();

    public static C5029CF A00() {
        return A00;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6958hc
    public final long ACf() {
        return SystemClock.elapsedRealtime();
    }
}
