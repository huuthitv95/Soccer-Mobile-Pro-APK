package com.facebook.ads.redexgen.core;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.W0 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C6242W0 implements InterfaceC6213VV {
    public WeakReference<C6140UK> A00;

    public C6242W0(C6140UK c6140uk) {
        this.A00 = new WeakReference<>(c6140uk);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6213VV
    public final void AFB(boolean z) {
        if (this.A00.get() != null) {
            this.A00.get().A1o(z, false);
        }
    }
}
