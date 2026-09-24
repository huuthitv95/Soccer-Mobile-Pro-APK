package com.facebook.ads.redexgen.core;

import com.facebook.ads.AdError;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.jr */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C7091jr implements InterfaceC6020SM {
    public final /* synthetic */ C47817w A00;
    public final /* synthetic */ boolean A01;

    public C7091jr(C47817w c47817w, boolean z) {
        this.A00 = c47817w;
        this.A01 = z;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6020SM
    public final void ACx() {
        if (!C6171Up.A1t(this.A00.A04) || !this.A01) {
            this.A00.A0C.set(true);
            this.A00.A01.AFm(this.A00);
        } else {
            this.A00.A06 = AbstractC6686dD.A01(this.A00.A04, (C47707l) this.A00.A03, 0, new C7092js(this));
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6020SM
    public final void ACy() {
        this.A00.A01.AFp(this.A00, AdError.CACHE_ERROR);
    }
}
