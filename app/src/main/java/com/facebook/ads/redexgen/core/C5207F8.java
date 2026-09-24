package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.F8 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C5207F8 implements InterfaceC6872gE {
    public final /* synthetic */ C6770ea A00;

    public C5207F8(C6770ea c6770ea) {
        this.A00 = c6770ea;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6872gE
    public final void AHA() {
        if (this.A00.A02 != null) {
            this.A00.A02.A4j(this.A00.A03.A94());
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6872gE
    public final void AHC(C6874gG c6874gG) {
        if (this.A00.A02 == null) {
            return;
        }
        if (c6874gG == null || !c6874gG.A00()) {
            this.A00.A01.A0F().ABv();
            this.A00.A02.A4j(this.A00.A03.A94());
        } else {
            this.A00.A01.A0F().ABw();
            this.A00.A02.A4j(this.A00.A03.A95());
        }
    }
}
