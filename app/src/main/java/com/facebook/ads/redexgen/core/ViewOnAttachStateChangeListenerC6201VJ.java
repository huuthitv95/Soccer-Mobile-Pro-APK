package com.facebook.ads.redexgen.core;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.VJ */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class ViewOnAttachStateChangeListenerC6201VJ implements View.OnAttachStateChangeListener {
    public final /* synthetic */ EnumC6199VH A00;
    public final /* synthetic */ C6200VI A01;

    public ViewOnAttachStateChangeListenerC6201VJ(C6200VI c6200vi, EnumC6199VH enumC6199VH) {
        this.A01 = c6200vi;
        this.A00 = enumC6199VH;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.A01.A04(this.A00, null);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
