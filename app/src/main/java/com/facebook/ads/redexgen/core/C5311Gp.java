package com.facebook.ads.redexgen.core;

import android.widget.FrameLayout;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Gp */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C5311Gp implements InterfaceC6404Yf {
    public final /* synthetic */ AbstractC5305Gj A00;

    public C5311Gp(AbstractC5305Gj abstractC5305Gj) {
        this.A00 = abstractC5305Gj;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6404Yf
    public final void AEZ(int i) {
        this.A00.A0d();
        if (this.A00.A01 != null) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            layoutParams.topMargin = i;
            this.A00.A01.setLayoutParams(layoutParams);
        }
    }
}
