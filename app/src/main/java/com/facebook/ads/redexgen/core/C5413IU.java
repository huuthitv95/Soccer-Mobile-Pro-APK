package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.IU */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C5413IU implements InterfaceC6324XN {
    public final /* synthetic */ C46275S A00;

    public C5413IU(C46275S c46275s) {
        this.A00 = c46275s;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6324XN
    public final void ADS() {
        this.A00.A0P.ADc(this.A00.A0F);
        this.A00.A0P.ADA();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6324XN
    public final void AFV(float f) {
        int i;
        float totalForce = (this.A00.A0F - f) + (this.A00.A0d ? 0 : this.A00.A0S.getDuration());
        if (this.A00.A0d) {
            i = this.A00.A0F;
        } else {
            i = this.A00.A0E;
        }
        float seenTime = i;
        this.A00.A0P.AKd(totalForce / seenTime);
    }
}
