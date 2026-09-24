package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ET */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C5166ET extends AbstractRunnableC6279Wc {
    public final /* synthetic */ C45584L A00;

    public C5166ET(C45584L c45584l) {
        this.A00 = c45584l;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC6279Wc
    public final void A07() {
        this.A00.A0C.getEventBus().A04(this.A00.A0E, this.A00.A06, this.A00.A08, this.A00.A05, this.A00.A04, this.A00.A03, this.A00.A07, this.A00.A0A, this.A00.A0B, this.A00.A0D, this.A00.A09);
        if (this.A00.A01 != null) {
            this.A00.A01.A07();
        }
    }
}
