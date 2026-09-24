package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Es */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C5191Es extends AbstractRunnableC6279Wc {
    public final /* synthetic */ C5183Ek A00;

    public C5191Es(C5183Ek c5183Ek) {
        this.A00 = c5183Ek;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC6279Wc
    public final void A07() {
        if (!this.A00.A04) {
            C6142UM c6142um = this.A00.A0C;
            final int currentPositionInMillis = this.A00.getCurrentPositionInMillis();
            c6142um.A02(new AbstractC5148EB(currentPositionInMillis) { // from class: com.facebook.ads.redexgen.X.4A
            });
            this.A00.A08.postDelayed(this, this.A00.A01);
        }
    }
}
