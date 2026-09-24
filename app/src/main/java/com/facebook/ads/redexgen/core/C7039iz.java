package com.facebook.ads.redexgen.core;

import com.facebook.ads.internal.protocol.AdErrorType;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.iz */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C7039iz extends AbstractRunnableC6279Wc {
    public final /* synthetic */ C7099jz A00;
    public final /* synthetic */ C5762O8 A01;
    public final /* synthetic */ C47687j A02;

    public C7039iz(C47687j c47687j, C5762O8 c5762o8, C7099jz c7099jz) {
        this.A02 = c47687j;
        this.A01 = c5762o8;
        this.A00 = c7099jz;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC6279Wc
    public final void A07() {
        this.A02.A0T(this.A01);
        this.A02.A0Q(this.A00);
        this.A02.A00 = null;
        C6229Vm c6229VmA00 = C6229Vm.A00(AdErrorType.INTERSTITIAL_AD_TIMEOUT);
        this.A02.A0B.A0F().A5g(c6229VmA00.A03().getErrorCode(), c6229VmA00.A04());
        this.A02.A07.A0G(c6229VmA00);
    }
}
