package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.hD */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C6933hD implements InterfaceC6324XN {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C6932hC A01;

    public C6933hD(C6932hC c6932hC, int i) {
        this.A01 = c6932hC;
        this.A00 = i;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6324XN
    public final void ADS() {
        this.A01.A0C.A0F().ABa();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6324XN
    public final void AFV(float f) {
        float f2 = 1.0f - (f / this.A00);
        if (this.A01.A0G != null) {
            this.A01.A0G.setProgressWithAnimation(100.0f * f2);
        }
    }
}
