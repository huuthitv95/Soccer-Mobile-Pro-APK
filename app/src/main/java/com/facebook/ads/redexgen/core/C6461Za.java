package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Za */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C6461Za {
    public int A00;
    public EnumC6385YM A01;
    public InterfaceC6466Zf A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public final C6902gi A0B;
    public boolean A09 = true;
    public boolean A0A = true;
    public boolean A08 = true;
    public boolean A07 = true;
    public final boolean A0C = true;

    public C6461Za(C6902gi c6902gi, InterfaceC6466Zf interfaceC6466Zf) {
        this.A0B = c6902gi;
        this.A02 = interfaceC6466Zf;
    }

    public final C6461Za A0C(int i) {
        this.A00 = i;
        return this;
    }

    public final C6461Za A0D(EnumC6385YM enumC6385YM) {
        this.A01 = enumC6385YM;
        return this;
    }

    public final C6461Za A0E(String str) {
        this.A03 = str;
        return this;
    }

    public final C6461Za A0F(String str) {
        this.A04 = str;
        return this;
    }

    public final C6461Za A0G(String str) {
        this.A05 = str;
        return this;
    }

    public final C6461Za A0H(String str) {
        this.A06 = str;
        return this;
    }

    public final C6461Za A0I(boolean z) {
        this.A08 = z;
        return this;
    }

    public final C6461Za A0J(boolean z) {
        this.A09 = z;
        return this;
    }

    public final C6461Za A0K(boolean z) {
        this.A0A = z;
        return this;
    }

    public final C6462Zb A0L() {
        return new C6462Zb(this, null);
    }
}
