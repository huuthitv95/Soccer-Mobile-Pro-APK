package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ga */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C5296Ga extends AbstractRunnableC6279Wc {
    public final /* synthetic */ C45964x A00;

    public C5296Ga(C45964x c45964x) {
        this.A00 = c45964x;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC6279Wc
    public final void A07() {
        if (this.A00.A00 != null) {
            this.A00.A00.A1F();
        }
        this.A00.A09.setToolbarActionMode(this.A00.getCloseButtonStyle());
        this.A00.A09.A0A();
        this.A00.A06.set(true);
    }
}
