package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.h7 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C6927h7 extends AbstractRunnableC6266WP {
    public final /* synthetic */ C6926h6 A00;

    public C6927h7(C6926h6 c6926h6) {
        this.A00 = c6926h6;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC6266WP
    public final void A01() {
        if (this.A00.A01.A01.A00() != null) {
            this.A00.A01.A01.A00().onAdsLoaded();
        }
    }
}
