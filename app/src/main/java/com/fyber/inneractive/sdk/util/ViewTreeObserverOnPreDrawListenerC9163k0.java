package com.fyber.inneractive.sdk.util;

import android.content.Context;
import android.view.ViewTreeObserver;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.util.k0 */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewTreeObserverOnPreDrawListenerC9163k0 implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Context f21458a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C9172n0 f21459b;

    public ViewTreeObserverOnPreDrawListenerC9163k0(C9172n0 c9172n0, Context context) {
        this.f21459b = c9172n0;
        this.f21458a = context;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.f21459b.m21985b(this.f21458a);
        return true;
    }
}
