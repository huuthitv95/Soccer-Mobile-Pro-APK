package com.facebook.ads.redexgen.core;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bJ */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC6568bJ implements View.OnClickListener {
    public final /* synthetic */ AbstractC5589LK A00;

    public ViewOnClickListenerC6568bJ(AbstractC5589LK abstractC5589LK) {
        this.A00 = abstractC5589LK;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (AbstractC6271WU.A02(this)) {
            return;
        }
        try {
            if (this.A00.A0I.getVisibility() != 8) {
                this.A00.A0W();
                this.A00.A0G.removeCallbacks(this.A00.A0X);
                this.A00.A0t(8);
            } else {
                this.A00.A0t(0);
                this.A00.A0G.postDelayed(this.A00.A0X, 1500L);
            }
        } catch (Throwable th) {
            AbstractC6271WU.A00(th, this);
        }
    }
}
