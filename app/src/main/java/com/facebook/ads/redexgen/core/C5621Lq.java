package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Lq */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C5621Lq extends AbstractC6846fo {
    public final /* synthetic */ C5600LV A00;

    public C5621Lq(C5600LV c5600lv) {
        this.A00 = c5600lv;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC6846fo
    public final void A03() {
        if (this.A00.A05 || !this.A00.A01.A07()) {
            this.A00.A01.A05();
        }
        if (this.A00.A0A.get() != null) {
            ((InterfaceC6550b1) this.A00.A0A.get()).AEA();
        }
    }
}
