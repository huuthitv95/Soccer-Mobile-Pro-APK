package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Fd */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C5238Fd implements InterfaceC5982Rk {
    public final /* synthetic */ C5976Re A00;
    public final /* synthetic */ C45664T A01;

    public C5238Fd(C45664T c45664t, C5976Re c5976Re) {
        this.A01 = c45664t;
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
