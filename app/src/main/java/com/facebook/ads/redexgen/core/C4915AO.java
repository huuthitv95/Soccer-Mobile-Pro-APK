package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.AO */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C4915AO implements InterfaceC46335Y {
    public InterfaceC46545t A02;
    public InterfaceC7143kj<String> A03;
    public String A04;
    public boolean A05;
    public boolean A06;
    public final C46495o A07 = new C46495o();
    public int A00 = 8000;
    public int A01 = 8000;

    public final C4915AO A00(InterfaceC46545t interfaceC46545t) {
        this.A02 = interfaceC46545t;
        return this;
    }

    public final C4915AO A01(String str) {
        this.A04 = str;
        return this;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC46335Y
    /* JADX INFO: renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final C44021k A5I() {
        C44021k c44021k = new C44021k(this.A04, this.A00, this.A01, this.A05, this.A07, this.A03, this.A06);
        if (this.A02 != null) {
            c44021k.A43(this.A02);
        }
        return c44021k;
    }
}
