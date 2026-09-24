package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.KV */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C5538KV implements InterfaceC6324XN {
    public final /* synthetic */ C46786H A00;

    public C5538KV(C46786H c46786h) {
        this.A00 = c46786h;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6324XN
    public final void ADS() {
        this.A00.A0B = false;
        if (this.A00.A05 != null) {
            this.A00.A05.setToolbarActionMode(this.A00.getCloseButtonStyle());
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6324XN
    public final void AFV(float f) {
        if (this.A00.A05 != null) {
            this.A00.A05.setProgressImmediate(100.0f * (1.0f - (f / this.A00.getAdInfo().A0K().A00())));
        }
    }
}
