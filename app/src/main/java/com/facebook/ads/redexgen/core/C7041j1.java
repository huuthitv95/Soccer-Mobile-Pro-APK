package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.j1 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C7041j1 extends AbstractRunnableC6279Wc {
    public final /* synthetic */ AbstractC7040j0 A00;
    public final /* synthetic */ C6229Vm A01;

    public C7041j1(AbstractC7040j0 abstractC7040j0, C6229Vm c6229Vm) {
        this.A00 = abstractC7040j0;
        this.A01 = c6229Vm;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC6279Wc
    public final void A07() {
        this.A00.A0B.A0F().A5g(this.A01.A03().getErrorCode(), this.A01.A04());
        if (this.A00.A07 != null) {
            this.A00.A07.A0G(this.A01);
        }
    }
}
