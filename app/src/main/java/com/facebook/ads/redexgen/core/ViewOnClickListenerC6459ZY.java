package com.facebook.ads.redexgen.core;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ZY */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC6459ZY implements View.OnClickListener {
    public final /* synthetic */ C6462Zb A00;

    public ViewOnClickListenerC6459ZY(C6462Zb c6462Zb) {
        this.A00 = c6462Zb;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (AbstractC6271WU.A02(this)) {
            return;
        }
        try {
            if (this.A00.A05) {
                this.A00.A04.A53();
            } else {
                this.A00.A04.A54();
            }
        } catch (Throwable th) {
            AbstractC6271WU.A00(th, this);
        }
    }
}
