package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Nz */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C5753Nz implements InterfaceC6592bh {
    public final /* synthetic */ C5716NO A00;

    public C5753Nz(C5716NO c5716no) {
        this.A00 = c5716no;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6592bh
    public final void ACt() {
        if (this.A00.A0X()) {
            this.A00.A0N();
            this.A00.A0g.setToolbarActionMessage("");
            this.A00.A0g.setToolbarActionMode(0);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6592bh
    public final void AEm() {
        this.A00.A0K = false;
        this.A00.A0U.A07();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6592bh
    public final void AEn() {
        this.A00.A0K = true;
        this.A00.A0U.A06();
    }
}
