package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.LQ */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C5595LQ extends AbstractRunnableC6279Wc {
    public final /* synthetic */ C6555b6 A00;

    public C5595LQ(C6555b6 c6555b6) {
        this.A00 = c6555b6;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC6279Wc
    public final void A07() {
        this.A00.A03();
        if (!this.A00.A08) {
            return;
        }
        this.A00.A0D.postDelayed(this.A00.A0F, 250L);
    }
}
