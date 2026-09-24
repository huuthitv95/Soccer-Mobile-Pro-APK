package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.PM */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C5837PM implements InterfaceC6324XN {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AbstractC5834PJ A01;

    public C5837PM(AbstractC5834PJ abstractC5834PJ, int i) {
        this.A01 = abstractC5834PJ;
        this.A00 = i;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6324XN
    public final void ADS() {
        this.A01.A05 = false;
        this.A01.A0c();
        this.A01.A0H.setToolbarActionMode(this.A01.getCloseButtonStyle());
        if (this.A01.A09 && this.A01.A08 != null) {
            this.A01.A08.A06();
            this.A01.A0C.A4j(new C5647MG().A6l());
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6324XN
    public final void AFV(float f) {
        this.A01.A0H.setProgress(100.0f * (1.0f - (f / this.A00)));
    }
}
