package com.facebook.ads.redexgen.core;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Yd */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC6402Yd implements View.OnClickListener {
    public final /* synthetic */ C5854Pe A00;

    public ViewOnClickListenerC6402Yd(C5854Pe c5854Pe) {
        this.A00 = c5854Pe;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (AbstractC6271WU.A02(this)) {
            return;
        }
        try {
            this.A00.A0G();
        } catch (Throwable th) {
            AbstractC6271WU.A00(th, this);
        }
    }
}
