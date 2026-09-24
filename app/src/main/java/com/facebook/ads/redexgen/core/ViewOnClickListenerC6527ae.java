package com.facebook.ads.redexgen.core;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ae */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC6527ae implements View.OnClickListener {
    public final /* synthetic */ C5637M6 A00;

    public ViewOnClickListenerC6527ae(C5637M6 c5637m6) {
        this.A00 = c5637m6;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (AbstractC6271WU.A02(this)) {
            return;
        }
        try {
            if (this.A00.A08.canGoBack()) {
                this.A00.A08.goBack();
            }
        } catch (Throwable th) {
            AbstractC6271WU.A00(th, this);
        }
    }
}
