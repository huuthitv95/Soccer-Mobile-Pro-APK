package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Pc */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C5852Pc implements InterfaceC5982Rk {
    public final /* synthetic */ C5849PZ A00;

    public C5852Pc(C5849PZ c5849pz) {
        this.A00 = c5849pz;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5982Rk
    public final boolean AAI() {
        if (this.A00.A0E.canGoBack()) {
            this.A00.A0E.goBack();
            return true;
        }
        return false;
    }
}
