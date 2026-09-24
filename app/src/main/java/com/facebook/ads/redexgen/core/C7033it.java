package com.facebook.ads.redexgen.core;

import com.facebook.ads.internal.protocol.AdErrorType;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.it */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C7033it extends AbstractRunnableC6279Wc {
    public final /* synthetic */ C47817w A00;
    public final /* synthetic */ C5762O8 A01;
    public final /* synthetic */ C47597a A02;

    public C7033it(C47597a c47597a, C5762O8 c5762o8, C47817w c47817w) {
        this.A02 = c47597a;
        this.A01 = c5762o8;
        this.A00 = c47817w;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC6279Wc
    public final void A07() {
        this.A02.A0T(this.A01);
        this.A02.A0Q(this.A00);
        this.A02.A00 = null;
        AdErrorType adErrorType = AdErrorType.RV_AD_TIMEOUT;
        this.A02.A0B.A0F().A5g(adErrorType.getErrorCode(), adErrorType.getDefaultErrorMessage());
        this.A02.A07.A0G(new C6229Vm(adErrorType, ""));
    }
}
