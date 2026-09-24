package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.7u */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C47797u {
    public final long A00;
    public final long A01;
    public static final C47797u A04 = new C47797u(0, 0);
    public static final C47797u A02 = new C47797u(Long.MAX_VALUE, Long.MAX_VALUE);
    public static final C47797u A06 = new C47797u(Long.MAX_VALUE, 0);
    public static final C47797u A05 = new C47797u(0, Long.MAX_VALUE);
    public static final C47797u A03 = A04;

    public C47797u(long j, long j2) {
        AbstractC45353y.A07(j >= 0);
        AbstractC45353y.A07(j2 >= 0);
        this.A01 = j;
        this.A00 = j2;
    }

    public final long A00(long minPositionUs, long j, long j2) {
        if (this.A01 == 0 && this.A00 == 0) {
            return minPositionUs;
        }
        long jA0V = AbstractC46115C.A0V(minPositionUs, this.A01, Long.MIN_VALUE);
        long jA0S = AbstractC46115C.A0S(minPositionUs, this.A00, Long.MAX_VALUE);
        boolean z = true;
        boolean z2 = jA0V <= j && j <= jA0S;
        if (jA0V > j2 || j2 > jA0S) {
            z = false;
        }
        if (z2 && z) {
            long jAbs = Math.abs(j - minPositionUs);
            long maxPositionUs = Math.abs(j2 - minPositionUs);
            if (jAbs <= maxPositionUs) {
                return j;
            }
            return j2;
        }
        if (z2) {
            return j;
        }
        if (z) {
            return j2;
        }
        return jA0V;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C47797u c47797u = (C47797u) obj;
        return this.A01 == c47797u.A01 && this.A00 == c47797u.A00;
    }

    public final int hashCode() {
        return (((int) this.A01) * 31) + ((int) this.A00);
    }
}
