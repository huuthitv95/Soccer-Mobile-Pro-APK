package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.H0 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C5322H0 implements InterfaceC6324XN {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AbstractRunnableC6279Wc A01;
    public final /* synthetic */ AbstractC5305Gj A02;
    public final /* synthetic */ C5110DZ A03;

    public C5322H0(AbstractC5305Gj abstractC5305Gj, int i, C5110DZ c5110dz, AbstractRunnableC6279Wc abstractRunnableC6279Wc) {
        this.A02 = abstractC5305Gj;
        this.A00 = i;
        this.A03 = c5110dz;
        this.A01 = abstractRunnableC6279Wc;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6324XN
    public final void ADS() throws Throwable {
        this.A01.run();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6324XN
    public final void AFV(float f) {
        this.A02.A09.setProgress(100.0f * (1.0f - (f / this.A00)));
        if (this.A03 != null) {
            C5110DZ c5110dz = this.A03;
            float percentage = this.A00;
            c5110dz.A07((int) ((percentage - f) * 1000.0f));
        }
    }
}
