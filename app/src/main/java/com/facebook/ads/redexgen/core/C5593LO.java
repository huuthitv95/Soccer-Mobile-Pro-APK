package com.facebook.ads.redexgen.core;

import java.io.IOException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.LO */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C5593LO {
    public final int A00;
    public final long A01;

    public C5593LO(int i, long j) {
        this.A00 = i;
        this.A01 = j;
    }

    public static C5593LO A00(InterfaceC7263ms interfaceC7263ms, C45944v c45944v) throws IOException {
        interfaceC7263ms.AGt(c45944v.A0l(), 0, 8);
        c45944v.A0f(0);
        int iA0C = c45944v.A0C();
        long size = c45944v.A0O();
        return new C5593LO(iA0C, size);
    }
}
