package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Kl */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C5554Kl extends AbstractRunnableC6279Wc {
    public final /* synthetic */ AbstractC6586bb A00;

    public C5554Kl(AbstractC6586bb abstractC6586bb) {
        this.A00 = abstractC6586bb;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC6279Wc
    public final void A07() {
        this.A00.setPressed(false);
        this.A00.postOnAnimationDelayed(this.A00.A09, this.A00.A08);
    }
}
