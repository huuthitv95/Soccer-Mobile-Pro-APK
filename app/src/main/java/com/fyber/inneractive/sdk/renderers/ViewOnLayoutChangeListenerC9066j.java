package com.fyber.inneractive.sdk.renderers;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.renderers.j */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewOnLayoutChangeListenerC9066j implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C9070n f21211a;

    public ViewOnLayoutChangeListenerC9066j(C9070n c9070n) {
        this.f21211a = c9070n;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        ViewGroup.LayoutParams layoutParams;
        if (this.f21211a.f21215B == null) {
            return;
        }
        int i9 = i8 - i6;
        int i10 = i3 - i;
        int i11 = i4 - i2;
        if ((i7 - i5 == i10 && i9 == i11) || (layoutParams = view.getLayoutParams()) == null) {
            return;
        }
        layoutParams.width = i10;
        layoutParams.height = i11;
        this.f21211a.f21215B.setLayoutParams(layoutParams);
    }
}
