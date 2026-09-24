package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.rL */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC7521rL {
    public InterfaceC7522rM A00;

    public final void A00() {
        if (this.A00 != null) {
            this.A00.onStart();
        }
    }

    public final void A02() {
        if (this.A00 != null) {
            this.A00.onStop();
        }
    }

    public final void A03(InterfaceC7522rM interfaceC7522rM) {
        this.A00 = interfaceC7522rM;
    }
}
