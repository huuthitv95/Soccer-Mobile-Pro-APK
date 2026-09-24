package com.facebook.ads.redexgen.core;

import com.facebook.ads.AdError;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.jB */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C7051jB implements InterfaceC6020SM {
    public final /* synthetic */ C5748Nu A00;

    public C7051jB(C5748Nu c5748Nu) {
        this.A00 = c5748Nu;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6020SM
    public final void ACx() {
        this.A00.A04.ACp();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6020SM
    public final void ACy() {
        this.A00.A04.ACo(AdError.CACHE_ERROR);
    }
}
