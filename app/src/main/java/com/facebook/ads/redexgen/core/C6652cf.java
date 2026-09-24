package com.facebook.ads.redexgen.core;

import android.animation.ValueAnimator;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.cf */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C6652cf implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ C5489Ji A00;

    public C6652cf(C5489Ji c5489Ji) {
        this.A00 = c5489Ji;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (this.A00.A0T != null) {
            this.A00.A0T.getLayoutParams().height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            this.A00.A0T.requestLayout();
        }
    }
}
