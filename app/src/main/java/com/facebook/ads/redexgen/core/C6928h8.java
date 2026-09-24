package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.h8 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C6928h8 extends AbstractRunnableC6266WP {
    public final /* synthetic */ C6925h5 A00;
    public final /* synthetic */ C6229Vm A01;

    public C6928h8(C6925h5 c6925h5, C6229Vm c6229Vm) {
        this.A00 = c6925h5;
        this.A01 = c6229Vm;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC6266WP
    public final void A01() {
        if (this.A00.A01.A00() != null) {
            this.A00.A01.A00().onAdError(AbstractC6315XE.A00(this.A01));
        }
    }
}
