package com.facebook.ads.redexgen.core;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Zw */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC6483Zw implements View.OnClickListener {
    public final /* synthetic */ C5643MC A00;

    public ViewOnClickListenerC6483Zw(C5643MC c5643mc) {
        this.A00 = c5643mc;
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
