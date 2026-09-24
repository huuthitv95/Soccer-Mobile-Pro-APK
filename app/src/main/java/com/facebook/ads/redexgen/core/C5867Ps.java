package com.facebook.ads.redexgen.core;

import android.database.DataSetObserver;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ps */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C5867Ps extends DataSetObserver {
    public final /* synthetic */ C5870Pv A00;

    public C5867Ps(C5870Pv c5870Pv) {
        this.A00 = c5870Pv;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        this.A00.A0e();
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.A00.A0e();
    }
}
