package com.facebook.ads.redexgen.core;

import com.facebook.ads.AdError;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.jC */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C7052jC implements InterfaceC5757O3 {
    public final /* synthetic */ C5748Nu A00;

    public C7052jC(C5748Nu c5748Nu) {
        this.A00 = c5748Nu;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5757O3
    public final void AFF(AdError adError) {
        this.A00.A04.ACo(AdError.CACHE_ERROR);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5757O3
    public final void AFG() {
        this.A00.A04.ACp();
    }
}
