package com.facebook.ads.redexgen.core;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ca */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC6647ca implements View.OnClickListener {
    public final /* synthetic */ C5518KB A00;

    public ViewOnClickListenerC6647ca(C5518KB c5518kb) {
        this.A00 = c5518kb;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (AbstractC6271WU.A02(this)) {
            return;
        }
        try {
            if (this.A00.A08 != null) {
                this.A00.A08.AJz();
            }
        } catch (Throwable th) {
            AbstractC6271WU.A00(th, this);
        }
    }
}
