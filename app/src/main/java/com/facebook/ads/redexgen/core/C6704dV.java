package com.facebook.ads.redexgen.core;

import android.animation.ValueAnimator;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.dV */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C6704dV implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ C46145F A00;

    public C6704dV(C46145F c46145f) {
        this.A00 = c46145f;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Integer num = (Integer) valueAnimator.getAnimatedValue();
        this.A00.A0b.getLayoutParams().height = num.intValue();
        this.A00.A0b.requestLayout();
    }
}
