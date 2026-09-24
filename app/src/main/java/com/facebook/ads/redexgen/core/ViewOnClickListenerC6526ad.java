package com.facebook.ads.redexgen.core;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ad */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC6526ad implements View.OnClickListener {
    public final /* synthetic */ C5637M6 A00;

    public ViewOnClickListenerC6526ad(C5637M6 c5637m6) {
        this.A00 = c5637m6;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (AbstractC6271WU.A02(this)) {
            return;
        }
        try {
            this.A00.A09.A0F().A9w();
            if (this.A00.A06 != null) {
                this.A00.A06.ADO();
            }
        } catch (Throwable th) {
            AbstractC6271WU.A00(th, this);
        }
    }
}
