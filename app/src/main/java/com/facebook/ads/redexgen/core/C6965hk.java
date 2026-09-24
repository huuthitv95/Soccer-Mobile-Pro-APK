package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.hk */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C6965hk implements InterfaceC5932Qw {
    public final /* synthetic */ C47457M A00;

    public C6965hk(C47457M c47457m) {
        this.A00 = c47457m;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5932Qw
    public final void ACv(AbstractC5956RK abstractC5956RK) {
        abstractC5956RK.A0d(true);
        if (abstractC5956RK.A06 != null && abstractC5956RK.A07 == null) {
            abstractC5956RK.A06 = null;
        }
        abstractC5956RK.A07 = null;
        if (!abstractC5956RK.A0G() && !this.A00.A1x(abstractC5956RK.A0H) && abstractC5956RK.A0i()) {
            this.A00.removeDetachedView(abstractC5956RK.A0H, false);
        }
    }
}
