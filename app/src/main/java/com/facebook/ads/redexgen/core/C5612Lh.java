package com.facebook.ads.redexgen.core;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Lh */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C5612Lh extends AbstractRunnableC6279Wc {
    public final WeakReference<C6847fp> A00;

    public C5612Lh(C6847fp c6847fp) {
        this.A00 = new WeakReference<>(c6847fp);
    }

    public C5612Lh(WeakReference<C6847fp> weakReference) {
        this.A00 = weakReference;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC6279Wc
    public final void A07() {
        C6847fp viewabilityChecker = this.A00.get();
        if (viewabilityChecker != null) {
            viewabilityChecker.A0U();
        }
    }
}
