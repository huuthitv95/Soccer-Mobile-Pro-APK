package com.facebook.ads.redexgen.core;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Pf */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class ViewOnApplyWindowInsetsListenerC5855Pf implements View.OnApplyWindowInsetsListener {
    public final /* synthetic */ InterfaceC5842PR A00;
    public final /* synthetic */ C43430n A01;

    public ViewOnApplyWindowInsetsListenerC5855Pf(C43430n c43430n, InterfaceC5842PR interfaceC5842PR) {
        this.A01 = c43430n;
        this.A00 = interfaceC5842PR;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        C5873Py compatInsets = this.A00.ACw(view, C5873Py.A00(windowInsets));
        return (WindowInsets) C5873Py.A01(compatInsets);
    }
}
