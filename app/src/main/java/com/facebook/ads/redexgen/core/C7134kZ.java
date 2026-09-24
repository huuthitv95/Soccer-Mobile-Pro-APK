package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.kZ */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C7134kZ implements InterfaceC5628Lx {
    public final InterfaceC5625Lu A00;

    public C7134kZ(InterfaceC5625Lu interfaceC5625Lu) {
        this.A00 = interfaceC5625Lu;
    }

    public final InterfaceC5625Lu A00() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5628Lx
    public final C48048J ACL() {
        return new C48048J(this);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5628Lx
    public final C7138kd ACM() {
        return new C7138kd(this);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5628Lx
    public final C7138kd ACN(String str) {
        return new C7138kd(this, str);
    }
}
