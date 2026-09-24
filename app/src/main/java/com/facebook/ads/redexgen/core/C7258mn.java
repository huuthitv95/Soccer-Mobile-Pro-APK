package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.mn */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C7258mn implements InterfaceC5356HY {
    public final long A00;
    public final C5355HX A01;

    public C7258mn(long j) {
        this(j, 0L);
    }

    public C7258mn(long j, long j2) {
        this.A00 = j;
        this.A01 = new C5355HX(j2 == 0 ? C5357HZ.A04 : new C5357HZ(0L, j2));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5356HY
    public final long A7t() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5356HY
    public final C5355HX A91(long j) {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5356HY
    public final boolean AAj() {
        return false;
    }
}
