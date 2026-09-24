package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Kq */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C5559Kq extends AbstractRunnableC6279Wc {
    public final /* synthetic */ AbstractC6586bb A00;

    public C5559Kq(AbstractC6586bb abstractC6586bb) {
        this.A00 = abstractC6586bb;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC6279Wc
    public final void A07() {
        if (!this.A00.isPressed()) {
            this.A00.setPressed(true);
            this.A00.postOnAnimationDelayed(this.A00.A0A, 250L);
        } else {
            this.A00.postDelayed(this, this.A00.A08);
        }
    }
}
