package com.facebook.ads.redexgen.core;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.EE */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C5151EE implements InterfaceC6787er {
    public final View A00;
    public final C6902gi A01;

    public C5151EE(C6902gi c6902gi, View view) {
        this.A01 = c6902gi;
        this.A00 = view;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6787er
    public final double A9V() {
        C6848fq result = C6847fp.A0E(this.A00, 0, this.A01);
        return result.A00();
    }
}
