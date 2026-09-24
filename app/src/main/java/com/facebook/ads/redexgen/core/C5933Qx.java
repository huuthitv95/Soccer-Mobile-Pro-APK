package com.facebook.ads.redexgen.core;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Qx */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C5933Qx {
    public int A00;
    public int A01;
    public int A02;
    public int A03;

    private final C5933Qx A00(AbstractC5956RK abstractC5956RK, int i) {
        View view = abstractC5956RK.A0H;
        this.A01 = view.getLeft();
        this.A03 = view.getTop();
        this.A02 = view.getRight();
        this.A00 = view.getBottom();
        return this;
    }

    public final C5933Qx A01(AbstractC5956RK abstractC5956RK) {
        return A00(abstractC5956RK, 0);
    }
}
