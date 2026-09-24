package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ep */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C5188Ep extends AbstractRunnableC6279Wc {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C5183Ek A02;

    public C5188Ep(C5183Ek c5183Ek, int i, int i2) {
        this.A02 = c5183Ek;
        this.A00 = i;
        this.A01 = i2;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC6279Wc
    public final void A07() {
        this.A02.A0C.A02(new C5135Dy(this.A00, this.A01));
    }
}
