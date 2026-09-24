package com.facebook.ads.redexgen.core;

import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.GX */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C5293GX extends AbstractRunnableC6279Wc {
    public final /* synthetic */ InterfaceC6724dp A00;
    public final /* synthetic */ C6725dq A01;

    public C5293GX(C6725dq c6725dq, InterfaceC6724dp interfaceC6724dp) {
        this.A01 = c6725dq;
        this.A00 = interfaceC6724dp;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC6279Wc
    public final void A07() {
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(300L);
        alphaAnimation.setInterpolator(new AccelerateInterpolator());
        alphaAnimation.setAnimationListener(new C5294GY(this));
        this.A01.startAnimation(alphaAnimation);
    }
}
