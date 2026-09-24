package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.hJ */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C6939hJ extends AbstractRunnableC6279Wc {
    public final /* synthetic */ C6938hI A00;
    public final /* synthetic */ C466362 A01;

    public C6939hJ(C6938hI c6938hI, C466362 c466362) {
        this.A00 = c6938hI;
        this.A01 = c466362;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC6279Wc
    public final void A07() {
        this.A01.setAdViewabilityChecker(this.A00.A02.A1G());
        this.A00.A02.A1o(true, true);
    }
}
