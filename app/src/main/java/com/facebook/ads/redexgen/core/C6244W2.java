package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.W2 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C6244W2 implements InterfaceC6557b8 {
    public final /* synthetic */ C6241Vz A00;

    public C6244W2(C6241Vz c6241Vz) {
        this.A00 = c6241Vz;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6557b8
    public final void AE7(C6556b7 c6556b7) {
        this.A00.A0G.set(c6556b7.A00() != null);
        if (this.A00.A0H.get() && this.A00.A05 != null) {
            this.A00.A05.AFB(c6556b7.A00() != null);
        }
    }
}
