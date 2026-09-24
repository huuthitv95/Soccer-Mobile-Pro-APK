package com.fyber.inneractive.sdk.util;

import android.graphics.Insets;
import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.util.m */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewOnApplyWindowInsetsListenerC9168m implements View.OnApplyWindowInsetsListener {
    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        Insets insets = windowInsets.getInsets(WindowInsets.Type.displayCutout());
        int iM21997b = AbstractC9174o.m21997b();
        if (iM21997b == 1) {
            view.setPadding(insets.left, 0, 0, 0);
            return windowInsets;
        }
        if (iM21997b == 2) {
            view.setPadding(0, 0, 0, insets.bottom);
            return windowInsets;
        }
        if (iM21997b != 3) {
            view.setPadding(0, insets.top, 0, 0);
            return windowInsets;
        }
        view.setPadding(0, 0, insets.right, 0);
        return windowInsets;
    }
}
