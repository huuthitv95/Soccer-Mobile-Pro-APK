package com.facebook.ads.redexgen.core;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Zl */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC6472Zl implements View.OnClickListener {
    public final /* synthetic */ C5645ME A00;

    public ViewOnClickListenerC6472Zl(C5645ME c5645me) {
        this.A00 = c5645me;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (AbstractC6271WU.A02(this)) {
            return;
        }
        try {
            this.A00.A0D.AAq();
        } catch (Throwable th) {
            AbstractC6271WU.A00(th, this);
        }
    }
}
