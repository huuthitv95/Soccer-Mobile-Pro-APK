package com.facebook.ads.redexgen.core;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.QA */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C5885QA extends AnimationAnimationListenerC6373YA {
    public final /* synthetic */ View A00;
    public final /* synthetic */ ScaleAnimation A01;

    public C5885QA(View view, ScaleAnimation scaleAnimation) {
        this.A00 = view;
        this.A01 = scaleAnimation;
    }

    @Override // com.facebook.ads.redexgen.core.AnimationAnimationListenerC6373YA, android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.A00.startAnimation(this.A01);
    }
}
