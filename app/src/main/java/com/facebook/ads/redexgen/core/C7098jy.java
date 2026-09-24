package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.jy */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C7098jy implements InterfaceC6426Z1 {
    public final /* synthetic */ C478580 A00;
    public final /* synthetic */ C472976 A01;

    public C7098jy(C478580 c478580, C472976 c472976) {
        this.A00 = c478580;
        this.A01 = c472976;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6426Z1
    public final void AEA() {
        this.A01.A0F().A4Q(this.A00.A03 != null);
        if (this.A00.A03 != null) {
            this.A00.A03.A03();
        }
    }
}
