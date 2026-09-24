package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.K6 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C5513K6 extends AbstractRunnableC6279Wc {
    public final /* synthetic */ C5489Ji A00;
    public final /* synthetic */ boolean A01;

    public C5513K6(C5489Ji c5489Ji, boolean z) {
        this.A00 = c5489Ji;
        this.A01 = z;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC6279Wc
    public final void A07() {
        AbstractC6400Yb abstractC6400YbA0B = this.A00.A0b.A0B();
        if (abstractC6400YbA0B == null) {
            return;
        }
        abstractC6400YbA0B.setPageDetailsVisible((this.A01 || abstractC6400YbA0B.A0E()) ? false : true);
        abstractC6400YbA0B.setToolbarActionMode(this.A00.getCloseButtonStyle());
    }
}
