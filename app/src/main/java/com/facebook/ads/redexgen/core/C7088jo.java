package com.facebook.ads.redexgen.core;

import com.facebook.ads.AdError;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.jo */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C7088jo implements InterfaceC5757O3 {
    public final /* synthetic */ C47817w A00;

    public C7088jo(C47817w c47817w) {
        this.A00 = c47817w;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5757O3
    public final void AFF(AdError adError) {
        this.A00.A01.AFp(this.A00, adError);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5757O3
    public final void AFG() {
        this.A00.A0C.set(true);
        this.A00.A01.AFm(this.A00);
    }
}
