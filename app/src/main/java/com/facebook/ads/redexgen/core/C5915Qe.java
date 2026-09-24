package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Qe */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C5915Qe extends AbstractRunnableC6279Wc {
    public final /* synthetic */ C6325XO A00;

    public C5915Qe(C6325XO c6325xo) {
        this.A00 = c6325xo;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC6279Wc
    public final void A07() {
        if (!this.A00.A05()) {
            return;
        }
        this.A00.A02();
        this.A00.A05.postDelayed(this, this.A00.A02);
    }
}
