package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.QL */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C5896QL implements InterfaceC6354Xr {
    public int A00;
    public final InterfaceC6354Xr A01;
    public final InterfaceC6354Xr A02;

    public C5896QL(InterfaceC6354Xr interfaceC6354Xr, int i, InterfaceC6354Xr interfaceC6354Xr2) {
        this.A01 = interfaceC6354Xr;
        this.A00 = i;
        this.A02 = interfaceC6354Xr2;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6354Xr
    public final void AH8(String str) {
        if (this.A00 > 0) {
            this.A01.AH8(str);
            this.A01.flush();
            this.A00--;
            return;
        }
        this.A02.AH8(str);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6354Xr
    public final void flush() {
        this.A02.flush();
    }
}
