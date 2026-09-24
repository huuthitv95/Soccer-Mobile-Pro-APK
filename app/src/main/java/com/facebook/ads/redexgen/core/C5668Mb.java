package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Mb */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C5668Mb implements InterfaceC6324XN {
    public final /* synthetic */ C5663MW A00;

    public C5668Mb(C5663MW c5663mw) {
        this.A00 = c5663mw;
    }

    public /* synthetic */ C5668Mb(C5663MW c5663mw, C5679Mm c5679Mm) {
        this(c5663mw);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6324XN
    public final void ADS() {
        this.A00.A0D();
        if (!this.A00.A0R.get()) {
            if (this.A00.A0T || !this.A00.A0D) {
                if (this.A00.A0H.A0V()) {
                    this.A00.A0U.setToolbarActionMode(1);
                    return;
                } else {
                    this.A00.A0U.setToolbarActionMode(0);
                    return;
                }
            }
            this.A00.A0U.setToolbarActionMode(0);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6324XN
    public final void AFV(float f) {
        if (this.A00.A0H.A0A() > 0 && f == this.A00.A0H.A0A()) {
            this.A00.A0U.setToolbarActionMode(8);
        }
    }
}
