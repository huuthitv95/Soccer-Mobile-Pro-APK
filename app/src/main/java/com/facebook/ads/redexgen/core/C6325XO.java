package com.facebook.ads.redexgen.core;

import android.os.Handler;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.XO */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C6325XO {
    public float A00;
    public float A01;
    public long A02;
    public boolean A03;
    public boolean A04;
    public final Handler A05;
    public final InterfaceC6324XN A06;

    public C6325XO(int i, float f, long j, Handler handler, InterfaceC6324XN interfaceC6324XN) {
        this(i, interfaceC6324XN, handler);
        this.A02 = j;
        this.A01 = f;
    }

    public C6325XO(int i, InterfaceC6324XN interfaceC6324XN) {
        this(i, interfaceC6324XN, new Handler());
    }

    public C6325XO(int i, InterfaceC6324XN interfaceC6324XN, Handler handler) {
        this.A04 = false;
        this.A00 = i;
        this.A06 = interfaceC6324XN;
        this.A05 = handler;
        this.A02 = 250L;
        this.A01 = 0.25f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A02() {
        this.A00 -= this.A01;
        this.A06.AFV(this.A00);
        if (this.A00 <= 0.0f && !this.A03) {
            this.A03 = true;
            this.A06.ADS();
            this.A04 = false;
        }
    }

    public final boolean A04() {
        return this.A00 <= 0.0f;
    }

    public final boolean A05() {
        return this.A04;
    }

    public final boolean A06() {
        if (!A05()) {
            return false;
        }
        this.A04 = false;
        return true;
    }

    public final boolean A07() {
        if (A04() && !this.A03) {
            this.A03 = true;
            this.A06.ADS();
        }
        if (A04() || A05()) {
            return false;
        }
        this.A04 = true;
        this.A06.AFV(this.A00);
        this.A05.postDelayed(new C5915Qe(this), this.A02);
        return true;
    }
}
