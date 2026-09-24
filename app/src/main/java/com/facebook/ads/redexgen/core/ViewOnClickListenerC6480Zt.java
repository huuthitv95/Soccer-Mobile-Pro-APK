package com.facebook.ads.redexgen.core;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Zt */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC6480Zt implements View.OnClickListener {
    public final /* synthetic */ C6482Zv A00;

    public ViewOnClickListenerC6480Zt(C6482Zv c6482Zv) {
        this.A00 = c6482Zv;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (AbstractC6271WU.A02(this)) {
            return;
        }
        try {
            this.A00.A02.A9c();
        } catch (Throwable th) {
            AbstractC6271WU.A00(th, this);
        }
    }
}
