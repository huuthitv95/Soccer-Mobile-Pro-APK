package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.j4 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC7044j4 implements InterfaceC6048Sp {
    public final boolean A00;

    public abstract void A00();

    public abstract void A01(boolean z);

    public AbstractC7044j4(boolean z) {
        this.A00 = z;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6048Sp
    public final void ADL() {
        if (this.A00) {
            A00();
        } else {
            A01(false);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6048Sp
    public final void ADT() {
        A01(true);
    }
}
