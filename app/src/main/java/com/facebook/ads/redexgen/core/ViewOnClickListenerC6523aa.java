package com.facebook.ads.redexgen.core;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.aa */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC6523aa implements View.OnClickListener {
    public final /* synthetic */ C5639M8 A00;

    public ViewOnClickListenerC6523aa(C5639M8 c5639m8) {
        this.A00 = c5639m8;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (AbstractC6271WU.A02(this)) {
            return;
        }
        try {
            if (this.A00.A07.canGoForward()) {
                this.A00.A07.goForward();
            }
        } catch (Throwable th) {
            AbstractC6271WU.A00(th, this);
        }
    }
}
