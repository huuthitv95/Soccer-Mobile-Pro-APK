package com.facebook.ads.redexgen.core;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Yr */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC6416Yr implements View.OnClickListener {
    public final /* synthetic */ C5845PU A00;

    public ViewOnClickListenerC6416Yr(C5845PU c5845pu) {
        this.A00 = c5845pu;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (AbstractC6271WU.A02(this)) {
            return;
        }
        try {
            if (this.A00.A01 != null && this.A00.A02.A03()) {
                this.A00.A01.ACl(this.A00);
            }
        } catch (Throwable th) {
            AbstractC6271WU.A00(th, this);
        }
    }
}
