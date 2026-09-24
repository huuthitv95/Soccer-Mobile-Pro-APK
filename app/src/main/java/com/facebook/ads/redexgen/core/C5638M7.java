package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.M7 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C5638M7 implements InterfaceC6540ar {
    public final /* synthetic */ C5637M6 A00;

    public C5638M7(C5637M6 c5637m6) {
        this.A00 = c5637m6;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6540ar
    public final void ADB(boolean z) {
        this.A00.A0D(z);
        if (this.A00.A0B && this.A00.A00 != null) {
            this.A00.A00.setEnabled(z);
            this.A00.A00.setAlpha(z ? 1.0f : 0.3f);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6540ar
    public final void ADx(boolean z) {
        this.A00.A0D(z);
        if (this.A00.A0B && this.A00.A02 != null) {
            this.A00.A02.setEnabled(z);
            this.A00.A02.setAlpha(z ? 1.0f : 0.3f);
        }
    }
}
