package com.facebook.ads.redexgen.core;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Jf */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C5486Jf implements InterfaceC6557b8 {
    public final WeakReference<AbstractC466867> A00;

    public C5486Jf(AbstractC466867 abstractC466867) {
        this.A00 = new WeakReference<>(abstractC466867);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6557b8
    public final void AE7(C6556b7 c6556b7) {
        AbstractC466867 abstractC466867 = this.A00.get();
        if (abstractC466867 != null) {
            abstractC466867.A06 = c6556b7.A00() != null;
            abstractC466867.A02();
        }
    }
}
