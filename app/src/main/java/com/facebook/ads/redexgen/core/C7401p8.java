package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.p8 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C7401p8 implements InterfaceC46335Y {
    public final InterfaceC46545t A00;

    public C7401p8() {
        this(null);
    }

    public C7401p8(InterfaceC46545t interfaceC46545t) {
        this.A00 = interfaceC46545t;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC46335Y
    public final InterfaceC7408pF A5I() {
        C44011j c44011j = new C44011j();
        if (this.A00 != null) {
            c44011j.A43(this.A00);
        }
        return c44011j;
    }
}
