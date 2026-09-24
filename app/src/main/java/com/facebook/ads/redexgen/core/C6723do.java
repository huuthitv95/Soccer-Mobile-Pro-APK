package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.do */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C6723do {
    public String A02;
    public String A03;
    public String A04;
    public final C5726NY A06;
    public final C5740Nm A07;
    public final C6902gi A08;
    public C5728Na A01 = C5728Na.A01(null);
    public int A00 = 1000;
    public boolean A05 = false;

    public C6723do(C6902gi c6902gi, C5726NY c5726ny, C5740Nm c5740Nm) {
        this.A08 = c6902gi;
        this.A06 = c5726ny;
        this.A07 = c5740Nm;
    }

    public final C6723do A09(int i) {
        this.A00 = i;
        return this;
    }

    public final C6723do A0A(C5728Na c5728Na) {
        this.A01 = c5728Na;
        return this;
    }

    public final C6723do A0B(String str) {
        this.A04 = str;
        return this;
    }

    public final C6723do A0C(String str) {
        this.A02 = str;
        return this;
    }

    public final C6723do A0D(String str) {
        this.A03 = str;
        return this;
    }

    public final C6723do A0E(boolean z) {
        this.A05 = z;
        return this;
    }

    public final C6725dq A0F() {
        return new C6725dq(this, null);
    }
}
