package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.QF */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C5890QF implements InterfaceC6354Xr {
    public final C6353Xq A00;
    public final InterfaceC6354Xr A01;

    public C5890QF(InterfaceC6354Xr interfaceC6354Xr, int i, int i2) {
        this.A01 = interfaceC6354Xr;
        this.A00 = new C6353Xq(i, i2);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6354Xr
    public final void AH8(String str) {
        this.A00.A04(str);
        if (this.A00.A02() != null && AbstractC6356Xt.A08(this.A00)) {
            this.A01.AH8(this.A00.A02());
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6354Xr
    public final void flush() {
        this.A00.A03();
        while (this.A00.A02() != null) {
            if (AbstractC6356Xt.A08(this.A00)) {
                this.A01.AH8(this.A00.A02());
            }
            this.A00.A03();
        }
    }
}
