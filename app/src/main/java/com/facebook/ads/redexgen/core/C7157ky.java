package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ky */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C7157ky implements InterfaceC5356HY {
    public final int A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final C5592LN A04;

    public C7157ky(C5592LN c5592ln, int i, long j, long j2) {
        this.A04 = c5592ln;
        this.A00 = i;
        this.A03 = j;
        this.A01 = (j2 - j) / ((long) c5592ln.A02);
        this.A02 = A00(this.A01);
    }

    private long A00(long j) {
        return AbstractC46115C.A0U(j * ((long) this.A00), 1000000L, this.A04.A04);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5356HY
    public final long A7t() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5356HY
    public final C5355HX A91(long j) {
        long jA0T = AbstractC46115C.A0T((((long) this.A04.A04) * j) / (((long) this.A00) * 1000000), 0L, this.A01 - 1);
        long j2 = this.A03 + (((long) this.A04.A02) * jA0T);
        long jA00 = A00(jA0T);
        C5357HZ c5357hz = new C5357HZ(jA00, j2);
        if (jA00 >= j || jA0T == this.A01 - 1) {
            return new C5355HX(c5357hz);
        }
        long j3 = 1 + jA0T;
        return new C5355HX(c5357hz, new C5357HZ(A00(j3), this.A03 + (((long) this.A04.A02) * j3)));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5356HY
    public final boolean AAj() {
        return true;
    }
}
