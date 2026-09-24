package com.fyber.inneractive.sdk.renderers;

import android.view.View;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.renderers.k */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewOnAttachStateChangeListenerC9067k implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C9070n f21212a;

    public ViewOnAttachStateChangeListenerC9067k(C9070n c9070n) {
        this.f21212a = c9070n;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        view.removeOnAttachStateChangeListener(this);
        view.removeOnLayoutChangeListener(this.f21212a.f21231z);
    }
}
