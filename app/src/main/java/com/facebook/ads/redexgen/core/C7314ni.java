package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ni */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C7314ni implements InterfaceC5198Ez {
    public long A00;
    public long A01;
    public C7314ni A02;
    public C5197Ey A03;

    public C7314ni(long j, int i) {
        A02(j, i);
    }

    public final int A00(long j) {
        return ((int) (j - this.A01)) + this.A03.A00;
    }

    public final C7314ni A01() {
        this.A03 = null;
        C7314ni c7314ni = this.A02;
        this.A02 = null;
        return c7314ni;
    }

    public final void A02(long j, int i) {
        AbstractC45353y.A08(this.A03 == null);
        this.A01 = j;
        this.A00 = ((long) i) + j;
    }

    public final void A03(C5197Ey c5197Ey, C7314ni c7314ni) {
        this.A03 = c5197Ey;
        this.A02 = c7314ni;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5198Ez
    public final C5197Ey A6u() {
        return (C5197Ey) AbstractC45353y.A01(this.A03);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5198Ez
    public final C7314ni ACc() {
        if (this.A02 == null || this.A02.A03 == null) {
            return null;
        }
        return this.A02;
    }
}
