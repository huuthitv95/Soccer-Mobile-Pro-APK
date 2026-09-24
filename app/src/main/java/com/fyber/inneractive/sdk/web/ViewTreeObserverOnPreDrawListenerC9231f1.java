package com.fyber.inneractive.sdk.web;

import android.view.ViewTreeObserver;
import com.fyber.inneractive.sdk.mraid.C8321b0;
import com.fyber.inneractive.sdk.util.AbstractC9174o;
import com.fyber.inneractive.sdk.util.AbstractC9183r;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.web.f1 */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewTreeObserverOnPreDrawListenerC9231f1 implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractC9240i1 f21558a;

    public ViewTreeObserverOnPreDrawListenerC9231f1(AbstractC9240i1 abstractC9240i1) {
        this.f21558a = abstractC9240i1;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        C9248m c9248m;
        C9248m c9248m2 = this.f21558a.f21565b;
        if (c9248m2 == null) {
            return false;
        }
        c9248m2.getViewTreeObserver().removeOnPreDrawListener(this);
        this.f21558a.mo21938k();
        AbstractC9240i1 abstractC9240i1 = this.f21558a;
        abstractC9240i1.m22081a(new C8321b0(abstractC9240i1.f21620G));
        AbstractC9240i1 abstractC9240i2 = this.f21558a;
        if (abstractC9240i2.f21620G == EnumC9221c0.INTERSTITIAL && (c9248m = abstractC9240i2.f21565b) != null) {
            c9248m.m22085a("if (window.showInterstitial) { showInterstitial(); }");
        }
        this.f21558a.mo22075j();
        AbstractC9240i1 abstractC9240i3 = this.f21558a;
        abstractC9240i3.mo22068a(AbstractC9174o.m21989a(abstractC9240i3.f21565b), true);
        this.f21558a.mo21939n();
        AbstractC9183r.f21478b.postDelayed(this.f21558a.f21625L, 250L);
        return false;
    }
}
