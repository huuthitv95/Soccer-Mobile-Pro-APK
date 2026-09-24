package com.facebook.ads.redexgen.core;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Yz */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC6424Yz implements View.OnClickListener {
    public final /* synthetic */ C6427Z2 A00;

    public ViewOnClickListenerC6424Yz(C6427Z2 c6427z2) {
        this.A00 = c6427z2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (AbstractC6271WU.A02(this)) {
            return;
        }
        try {
            this.A00.A0D();
        } catch (Throwable th) {
            AbstractC6271WU.A00(th, this);
        }
    }
}
