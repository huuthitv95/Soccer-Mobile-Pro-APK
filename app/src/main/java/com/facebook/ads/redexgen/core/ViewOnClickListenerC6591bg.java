package com.facebook.ads.redexgen.core;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bg */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC6591bg implements View.OnClickListener {
    public final /* synthetic */ C6593bi A00;

    public ViewOnClickListenerC6591bg(C6593bi c6593bi) {
        this.A00 = c6593bi;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (AbstractC6271WU.A02(this)) {
            return;
        }
        try {
            this.A00.A05();
        } catch (Throwable th) {
            AbstractC6271WU.A00(th, this);
        }
    }
}
