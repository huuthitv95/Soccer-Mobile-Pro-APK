package com.facebook.ads.redexgen.core;

import android.animation.Animator;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bQ */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C6575bQ implements Animator.AnimatorListener {
    public final /* synthetic */ C6576bR A00;

    public C6575bQ(C6576bR c6576bR) {
        this.A00 = c6576bR;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.A00.A06();
        AbstractC6374YB.A0O(this.A00.A05, 8);
        this.A00.A07.A0F().ADG();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.A00.A01 = true;
    }
}
