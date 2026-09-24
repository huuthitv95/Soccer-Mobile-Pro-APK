package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.kD */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C7113kD extends AbstractRunnableC6279Wc {
    public final /* synthetic */ C5700N8 A00;

    public C7113kD(C5700N8 c5700n8) {
        this.A00 = c5700n8;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC6279Wc
    public final void A07() {
        this.A00.A07();
        this.A00.A02.A06();
        this.A00.A05.countDown();
    }
}
