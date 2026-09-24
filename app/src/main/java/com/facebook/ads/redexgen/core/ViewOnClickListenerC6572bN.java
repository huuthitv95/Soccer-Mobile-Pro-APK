package com.facebook.ads.redexgen.core;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bN */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC6572bN implements View.OnClickListener {
    public final /* synthetic */ C5566Kx A00;

    public ViewOnClickListenerC6572bN(C5566Kx c5566Kx) {
        this.A00 = c5566Kx;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (AbstractC6271WU.A02(this)) {
            return;
        }
        try {
            this.A00.A02();
        } catch (Throwable th) {
            AbstractC6271WU.A00(th, this);
        }
    }
}
