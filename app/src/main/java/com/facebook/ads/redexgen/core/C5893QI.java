package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.QI */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C5893QI implements InterfaceC6354Xr {
    public int A00;
    public final InterfaceC6354Xr A01;

    public C5893QI(InterfaceC6354Xr interfaceC6354Xr, int i) {
        this.A01 = interfaceC6354Xr;
        this.A00 = i;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6354Xr
    public final void AH8(String str) {
        if (this.A00 > 0) {
            this.A01.AH8(str);
            this.A00--;
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6354Xr
    public final void flush() {
        this.A01.flush();
    }
}
