package com.fyber.inneractive.sdk.web;

import android.view.ViewTreeObserver;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.web.p */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewTreeObserverOnPreDrawListenerC9254p implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractC9239i0 f21652a;

    public ViewTreeObserverOnPreDrawListenerC9254p(AbstractC9239i0 abstractC9239i0) {
        this.f21652a = abstractC9239i0;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        C9248m c9248m = this.f21652a.f21565b;
        if (c9248m == null) {
            return false;
        }
        c9248m.getViewTreeObserver().removeOnPreDrawListener(this);
        AbstractC9239i0 abstractC9239i0 = this.f21652a;
        abstractC9239i0.mo22068a(abstractC9239i0.f21565b.getContext(), true);
        return false;
    }
}
