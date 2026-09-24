package com.facebook.ads.redexgen.core;

import android.os.Handler;
import android.view.animation.Animation;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Yu */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class AnimationAnimationListenerC6419Yu implements Animation.AnimationListener {
    public final /* synthetic */ C5976Re A00;
    public final /* synthetic */ AbstractC5834PJ A01;
    public final /* synthetic */ AbstractC5834PJ A02;

    public AnimationAnimationListenerC6419Yu(AbstractC5834PJ abstractC5834PJ, AbstractC5834PJ abstractC5834PJ2, C5976Re c5976Re) {
        this.A01 = abstractC5834PJ;
        this.A02 = abstractC5834PJ2;
        this.A00 = c5976Re;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.A01.A06 = false;
        AbstractC6374YB.A0H(this.A02);
        new Handler().postDelayed(new C5841PQ(this), 200L);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
