package com.facebook.ads.redexgen.core;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ZN */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC6448ZN implements View.OnClickListener {
    public final /* synthetic */ C5649MI A00;

    public ViewOnClickListenerC6448ZN(C5649MI c5649mi) {
        this.A00 = c5649mi;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (AbstractC6271WU.A02(this)) {
            return;
        }
        try {
            this.A00.A07.ADv();
        } catch (Throwable th) {
            AbstractC6271WU.A00(th, this);
        }
    }
}
