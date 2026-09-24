package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.F1 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C5200F1 extends AbstractRunnableC6279Wc {
    public final /* synthetic */ C5193Eu A00;

    public C5200F1(C5193Eu c5193Eu) {
        this.A00 = c5193Eu;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC6279Wc
    public final void A07() {
        this.A00.A03.A07();
        this.A00.A04.getEventBus().A04(this.A00.A06, this.A00.A05);
    }
}
