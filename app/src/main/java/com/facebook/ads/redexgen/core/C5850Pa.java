package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Pa */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C5850Pa implements InterfaceC6539aq {
    public final /* synthetic */ C5849PZ A00;

    public C5850Pa(C5849PZ c5849pz) {
        this.A00 = c5849pz;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6539aq
    public final void AF7(String str) {
        this.A00.A0C.setProgress(100);
        this.A00.A05 = false;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6539aq
    public final void AF9(String str) {
        this.A00.A05 = true;
        this.A00.A0F.setUrl(str);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6539aq
    public final void AFY(int i) {
        if (this.A00.A05) {
            this.A00.A0C.setProgress(i);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6539aq
    public final void AFb(String str) {
        this.A00.A0F.setTitle(str);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6539aq
    public final void AFe() {
        this.A00.A0B.ADJ(14);
    }
}
