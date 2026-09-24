package com.facebook.ads.redexgen.core;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Zy */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC6485Zy implements View.OnClickListener {
    public final /* synthetic */ C6468Zh A00;
    public final /* synthetic */ C5643MC A01;

    public ViewOnClickListenerC6485Zy(C5643MC c5643mc, C6468Zh c6468Zh) {
        this.A01 = c5643mc;
        this.A00 = c6468Zh;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (AbstractC6271WU.A02(this)) {
            return;
        }
        try {
            this.A00.A01();
            this.A01.A0D.AEr(EnumC5798Oi.A06);
        } catch (Throwable th) {
            AbstractC6271WU.A00(th, this);
        }
    }
}
