package com.facebook.ads.redexgen.core;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.aY */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC6521aY implements View.OnClickListener {
    public final /* synthetic */ C5639M8 A00;

    public ViewOnClickListenerC6521aY(C5639M8 c5639m8) {
        this.A00 = c5639m8;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (AbstractC6271WU.A02(this)) {
            return;
        }
        try {
            this.A00.A08.A0F().A9w();
            if (this.A00.A05 != null) {
                this.A00.A05.ADO();
            }
        } catch (Throwable th) {
            AbstractC6271WU.A00(th, this);
        }
    }
}
