package com.facebook.ads.redexgen.core;

import android.animation.ValueAnimator;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.cM */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C6633cM implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ C5521KE A00;

    public C6633cM(C5521KE c5521ke) {
        this.A00 = c5521ke;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Integer num = (Integer) valueAnimator.getAnimatedValue();
        if (this.A00.A09 != null) {
            this.A00.A09.getLayoutParams().height = num.intValue();
            this.A00.A09.requestLayout();
        }
    }
}
