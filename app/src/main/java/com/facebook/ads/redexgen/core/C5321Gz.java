package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Gz */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C5321Gz {
    public static final C5321Gz A03 = new C5321Gz(-3, -9223372036854775807L, -1);
    public final int A00;
    public final long A01;
    public final long A02;

    public C5321Gz(int i, long j, long j2) {
        this.A00 = i;
        this.A02 = j;
        this.A01 = j2;
    }

    public static C5321Gz A03(long j) {
        return new C5321Gz(0, -9223372036854775807L, j);
    }

    public static C5321Gz A04(long j, long j2) {
        return new C5321Gz(-1, j, j2);
    }

    public static C5321Gz A05(long j, long j2) {
        return new C5321Gz(-2, j, j2);
    }
}
