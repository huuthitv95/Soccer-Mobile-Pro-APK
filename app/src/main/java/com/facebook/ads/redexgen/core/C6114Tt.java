package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Tt */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C6114Tt extends AbstractRunnableC6266WP {
    public final /* synthetic */ C47216y A00;
    public final /* synthetic */ C6229Vm A01;

    public C6114Tt(C47216y c47216y, C6229Vm c6229Vm) {
        this.A00 = c47216y;
        this.A01 = c6229Vm;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC6266WP
    public final void A01() {
        this.A00.A01.onError(this.A00.A00, AbstractC6315XE.A00(this.A01));
    }
}
