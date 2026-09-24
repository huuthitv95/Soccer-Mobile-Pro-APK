package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.hP */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C6945hP extends AbstractRunnableC6266WP {
    public final /* synthetic */ C6942hM A00;

    public C6945hP(C6942hM c6942hM) {
        this.A00 = c6942hM;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC6266WP
    public final void A01() {
        if (this.A00.A01.A06() != null) {
            this.A00.A01.A06().onAdLoaded(this.A00.A01.A07());
        }
    }
}
