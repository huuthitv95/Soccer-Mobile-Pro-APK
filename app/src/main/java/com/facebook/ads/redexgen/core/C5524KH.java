package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.KH */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C5524KH extends AbstractRunnableC6279Wc {
    public final /* synthetic */ C5521KE A00;

    public C5524KH(C5521KE c5521ke) {
        this.A00 = c5521ke;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC6279Wc
    public final void A07() {
        if (!this.A00.A0Y) {
            AbstractC6374YB.A0F(1000, this.A00.A0K);
        }
        this.A00.postDelayed(this, 2000L);
    }
}
