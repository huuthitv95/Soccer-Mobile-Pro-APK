package com.bytedance.sdk.component.p160lr.p161ri.p162lr;

/* JADX INFO: renamed from: com.bytedance.sdk.component.lr.ri.lr.fi */
/* JADX INFO: loaded from: classes3.dex */
final class C2653fi {

    /* JADX INFO: renamed from: di */
    C2653fi f7549di;

    /* JADX INFO: renamed from: fi */
    boolean f7550fi;

    /* JADX INFO: renamed from: ik */
    int f7551ik;

    /* JADX INFO: renamed from: ka */
    boolean f7552ka;

    /* JADX INFO: renamed from: lr */
    int f7553lr;

    /* JADX INFO: renamed from: ri */
    final byte[] f7554ri;
    C2653fi xha;

    C2653fi() {
        this.f7554ri = new byte[8192];
        this.f7550fi = true;
        this.f7552ka = false;
    }

    C2653fi(byte[] bArr, int i, int i2, boolean z, boolean z2) {
        this.f7554ri = bArr;
        this.f7553lr = i;
        this.f7551ik = i2;
        this.f7552ka = z;
        this.f7550fi = z2;
    }

    /* JADX INFO: renamed from: lr */
    public final C2653fi m9928lr() {
        C2653fi c2653fi = this.f7549di;
        C2653fi c2653fi2 = c2653fi != this ? c2653fi : null;
        C2653fi c2653fi3 = this.xha;
        if (c2653fi3 != null) {
            c2653fi3.f7549di = c2653fi;
        }
        C2653fi c2653fi4 = this.f7549di;
        if (c2653fi4 != null) {
            c2653fi4.xha = c2653fi3;
        }
        this.f7549di = null;
        this.xha = null;
        return c2653fi2;
    }

    /* JADX INFO: renamed from: ri */
    final C2653fi m9929ri() {
        this.f7552ka = true;
        return new C2653fi(this.f7554ri, this.f7553lr, this.f7551ik, true, false);
    }

    /* JADX INFO: renamed from: ri */
    public final C2653fi m9930ri(C2653fi c2653fi) {
        c2653fi.xha = this;
        c2653fi.f7549di = this.f7549di;
        this.f7549di.xha = c2653fi;
        this.f7549di = c2653fi;
        return c2653fi;
    }
}
