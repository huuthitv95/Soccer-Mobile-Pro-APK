package com.facebook.ads.redexgen.core;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bt */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC6604bt implements View.OnClickListener {
    public final /* synthetic */ ViewOnClickListenerC5560Kr A00;
    public final /* synthetic */ String A01;

    public ViewOnClickListenerC6604bt(ViewOnClickListenerC5560Kr viewOnClickListenerC5560Kr, String str) {
        this.A00 = viewOnClickListenerC5560Kr;
        this.A01 = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (AbstractC6271WU.A02(this)) {
            return;
        }
        try {
            this.A00.A0E(this.A01);
        } catch (Throwable th) {
            AbstractC6271WU.A00(th, this);
        }
    }
}
