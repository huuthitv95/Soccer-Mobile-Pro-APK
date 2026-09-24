package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Hs */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C5376Hs extends AbstractRunnableC6279Wc {
    public final /* synthetic */ C46145F A00;

    public C5376Hs(C46145F c46145f) {
        this.A00 = c46145f;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC6279Wc
    public final void A07() {
        AbstractC6374YB.A0F(1000, this.A00.A0H);
        this.A00.postDelayed(this, 2000L);
    }
}
