package com.facebook.ads.redexgen.core;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ZZ */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC6460ZZ implements View.OnClickListener {
    public final /* synthetic */ C6462Zb A00;

    public ViewOnClickListenerC6460ZZ(C6462Zb c6462Zb) {
        this.A00 = c6462Zb;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (AbstractC6271WU.A02(this)) {
            return;
        }
        try {
            this.A00.A04.AAp();
        } catch (Throwable th) {
            AbstractC6271WU.A00(th, this);
        }
    }
}
