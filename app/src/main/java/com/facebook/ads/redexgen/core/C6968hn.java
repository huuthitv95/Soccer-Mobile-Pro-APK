package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.hn */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C6968hn implements InterfaceC5963RR {
    public final /* synthetic */ C47457M A00;

    public C6968hn(C47457M c47457m) {
        this.A00 = c47457m;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5963RR
    public final void AH9(AbstractC5956RK abstractC5956RK, C5933Qx c5933Qx, C5933Qx c5933Qx2) {
        this.A00.A1l(abstractC5956RK, c5933Qx, c5933Qx2);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5963RR
    public final void AHB(AbstractC5956RK abstractC5956RK, C5933Qx c5933Qx, C5933Qx c5933Qx2) {
        this.A00.A0r.A0Y(abstractC5956RK);
        this.A00.A1m(abstractC5956RK, c5933Qx, c5933Qx2);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5963RR
    public final void AHD(AbstractC5956RK abstractC5956RK, C5933Qx c5933Qx, C5933Qx c5933Qx2) {
        abstractC5956RK.A0d(false);
        if (this.A00.A0C) {
            if (this.A00.A05.A0R(abstractC5956RK, abstractC5956RK, c5933Qx, c5933Qx2)) {
                this.A00.A1O();
            }
        } else {
            if (!this.A00.A05.A0Q(abstractC5956RK, c5933Qx, c5933Qx2)) {
                return;
            }
            this.A00.A1O();
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5963RR
    public final void AKZ(AbstractC5956RK abstractC5956RK) {
        this.A00.A06.A1F(abstractC5956RK.A0H, this.A00.A0r);
    }
}
