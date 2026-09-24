package com.facebook.ads.redexgen.core;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.dW */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C6705dW extends AnimatorListenerAdapter {
    public final /* synthetic */ C46145F A00;
    public final /* synthetic */ boolean A01;

    public C6705dW(C46145F c46145f, boolean z) {
        this.A00 = c46145f;
        this.A01 = z;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.A00.A0H.setTranslationY(0.0f);
        this.A00.A0V();
        if (!this.A01 && this.A00.A0G != null) {
            this.A00.A0G.destroy();
        }
    }
}
