package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Fu */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C5254Fu implements InterfaceC5982Rk {
    public final /* synthetic */ C5976Re A00;
    public final /* synthetic */ C45674U A01;

    public C5254Fu(C45674U c45674u, C5976Re c5976Re) {
        this.A01 = c45674u;
        this.A00 = c5976Re;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5982Rk
    public final boolean AAI() {
        if (!this.A01.A0i()) {
            if (this.A01.A0j()) {
                return true;
            }
            return this.A01.A0k();
        }
        this.A01.A0h(this.A00);
        return true;
    }
}
