package com.facebook.ads.redexgen.core;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ke */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C5547Ke implements InterfaceC6557b8 {
    public final WeakReference<C46836M> A00;

    public C5547Ke(C46836M c46836m) {
        this.A00 = new WeakReference<>(c46836m);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6557b8
    public final void AE7(C6556b7 c6556b7) {
        C46836M c46836m = this.A00.get();
        if (c46836m != null) {
            c46836m.A04 = c6556b7.A00() != null;
            c46836m.A02();
        }
    }
}
