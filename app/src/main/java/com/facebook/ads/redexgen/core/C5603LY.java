package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.LY */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C5603LY {
    public int A00;
    public int A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;

    public final C5603LY A00(int i) {
        this.A00 = i;
        return this;
    }

    public final C5603LY A01(int i) {
        this.A01 = i;
        return this;
    }

    public final C5603LY A02(boolean z) {
        this.A02 = z;
        return this;
    }

    public final C5603LY A03(boolean z) {
        this.A03 = z;
        return this;
    }

    public final C5603LY A04(boolean z) {
        this.A04 = z;
        return this;
    }

    public final C5604LZ A05() {
        return new C5604LZ(this.A00, this.A02, this.A01, this.A03, this.A04);
    }
}
