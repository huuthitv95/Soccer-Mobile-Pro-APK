package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.lz */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C7220lz implements InterfaceC5479JY {
    public long A00 = -1;
    public long A01 = -1;
    public C5340HI A02;
    public C5341HJ A03;

    public C7220lz(C5341HJ c5341hj, C5340HI c5340hi) {
        this.A03 = c5341hj;
        this.A02 = c5340hi;
    }

    public final void A00(long j) {
        this.A00 = j;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5479JY
    public final InterfaceC5356HY A5Z() {
        AbstractC45353y.A08(this.A00 != -1);
        return new C7260mp(this.A03, this.A00);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5479JY
    public final long AHN(InterfaceC7263ms interfaceC7263ms) {
        if (this.A01 < 0) {
            return -1L;
        }
        long result = -(this.A01 + 2);
        this.A01 = -1L;
        return result;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5479JY
    public final void AKC(long j) {
        long[] jArr = this.A02.A01;
        this.A01 = jArr[AbstractC46115C.A0L(jArr, j, true, true)];
    }
}
