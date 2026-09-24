package com.facebook.ads.redexgen.core;

import com.facebook.ads.AdError;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.jp */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C7089jp implements InterfaceC6020SM {
    public final /* synthetic */ C47817w A00;

    public C7089jp(C47817w c47817w) {
        this.A00 = c47817w;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6020SM
    public final void ACx() {
        this.A00.A0C.set(true);
        this.A00.A01.AFm(this.A00);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6020SM
    public final void ACy() {
        this.A00.A01.AFp(this.A00, AdError.CACHE_ERROR);
    }
}
