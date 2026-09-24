package com.facebook.ads.redexgen.core;

import android.animation.ValueAnimator;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.dd */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C6712dd implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ C460455 A00;

    public C6712dd(C460455 c460455) {
        this.A00 = c460455;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Integer num = (Integer) valueAnimator.getAnimatedValue();
        this.A00.A0b.getLayoutParams().height = num.intValue();
        this.A00.A0b.requestLayout();
    }
}
