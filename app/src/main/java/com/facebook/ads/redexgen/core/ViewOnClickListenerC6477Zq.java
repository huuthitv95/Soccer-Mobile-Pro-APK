package com.facebook.ads.redexgen.core;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Zq */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC6477Zq implements View.OnClickListener {
    public final /* synthetic */ C5644MD A00;

    public ViewOnClickListenerC6477Zq(C5644MD c5644md) {
        this.A00 = c5644md;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (AbstractC6271WU.A02(this)) {
            return;
        }
        try {
            this.A00.A0D.A9c();
        } catch (Throwable th) {
            AbstractC6271WU.A00(th, this);
        }
    }
}
