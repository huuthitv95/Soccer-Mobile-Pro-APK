package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.hN */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C6943hN extends AbstractRunnableC6266WP {
    public final /* synthetic */ C6942hM A00;

    public C6943hN(C6942hM c6942hM) {
        this.A00 = c6942hM;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC6266WP
    public final void A01() {
        if (this.A00.A01.A06() != null) {
            this.A00.A01.A06().onLoggingImpression(this.A00.A01.A07());
        }
    }
}
