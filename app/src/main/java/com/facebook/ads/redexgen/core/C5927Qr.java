package com.facebook.ads.redexgen.core;

import android.database.Observable;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Qr */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C5927Qr extends Observable<AbstractC5928Qs> {
    public final void A00() {
        for (int size = this.mObservers.size() - 1; size >= 0; size--) {
            ((AbstractC5928Qs) this.mObservers.get(size)).A00();
        }
    }
}
