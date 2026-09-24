package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.k3 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C7103k3 extends AbstractRunnableC6279Wc {
    public final /* synthetic */ C7102k2 A00;
    public final /* synthetic */ C466362 A01;

    public C7103k3(C7102k2 c7102k2, C466362 c466362) {
        this.A00 = c7102k2;
        this.A01 = c466362;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC6279Wc
    public final void A07() {
        this.A00.A00.A0A();
        if (this.A00.A00.A0B != null) {
            this.A01.setAdViewabilityChecker(this.A00.A00.A0B);
            this.A00.A00.A0B.A0U();
        }
    }
}
