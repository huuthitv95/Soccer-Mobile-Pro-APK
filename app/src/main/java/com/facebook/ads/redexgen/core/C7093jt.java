package com.facebook.ads.redexgen.core;

import com.facebook.ads.AdError;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.jt */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C7093jt implements InterfaceC6048Sp {
    public final /* synthetic */ C47817w A00;

    public C7093jt(C47817w c47817w) {
        this.A00 = c47817w;
    }

    private void A00(boolean z) {
        if (!z) {
            this.A00.A01.AFp(this.A00, AdError.CACHE_ERROR);
        } else {
            this.A00.A0C.set(true);
            this.A00.A01.AFm(this.A00);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6048Sp
    public final void ADL() {
        A00(false);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6048Sp
    public final void ADT() {
        A00(true);
    }
}
