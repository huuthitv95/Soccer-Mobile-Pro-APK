package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.mo */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C7259mo implements InterfaceC5356HY {
    public final long A00;
    public final boolean A01;
    public final long[] A02;
    public final long[] A03;

    public C7259mo(long[] jArr, long[] jArr2, long j) {
        AbstractC45353y.A07(jArr.length == jArr2.length);
        int length = jArr2.length;
        this.A01 = length > 0;
        if (this.A01 && jArr2[0] > 0) {
            int length2 = length + 1;
            this.A02 = new long[length2];
            int length3 = length + 1;
            this.A03 = new long[length3];
            System.arraycopy(jArr, 0, this.A02, 1, length);
            System.arraycopy(jArr2, 0, this.A03, 1, length);
        } else {
            this.A02 = jArr;
            this.A03 = jArr2;
        }
        this.A00 = j;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5356HY
    public final long A7t() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5356HY
    public final C5355HX A91(long j) {
        if (!this.A01) {
            return new C5355HX(C5357HZ.A04);
        }
        int iA0L = AbstractC46115C.A0L(this.A03, j, true, true);
        C5357HZ c5357hz = new C5357HZ(this.A03[iA0L], this.A02[iA0L]);
        if (c5357hz.A01 != j) {
            int targetIndex = this.A03.length;
            if (iA0L != targetIndex - 1) {
                int targetIndex2 = iA0L + 1;
                long j2 = this.A03[targetIndex2];
                int targetIndex3 = iA0L + 1;
                C5357HZ rightSeekPoint = new C5357HZ(j2, this.A02[targetIndex3]);
                return new C5355HX(c5357hz, rightSeekPoint);
            }
        }
        return new C5355HX(c5357hz);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5356HY
    public final boolean AAj() {
        return this.A01;
    }
}
