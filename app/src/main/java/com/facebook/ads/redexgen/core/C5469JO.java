package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.JO */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C5469JO {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final C7472qI A07;
    public final long[] A08;
    public final long[] A09;
    public final C5470JP[] A0A;

    public C5469JO(int i, int i2, long j, long j2, long j3, C7472qI c7472qI, int i3, C5470JP[] c5470jpArr, int i4, long[] jArr, long[] jArr2) {
        this.A00 = i;
        this.A03 = i2;
        this.A06 = j;
        this.A05 = j2;
        this.A04 = j3;
        this.A07 = c7472qI;
        this.A02 = i3;
        this.A0A = c5470jpArr;
        this.A01 = i4;
        this.A08 = jArr;
        this.A09 = jArr2;
    }

    public final C5470JP A00(int i) {
        if (this.A0A == null) {
            return null;
        }
        return this.A0A[i];
    }
}
