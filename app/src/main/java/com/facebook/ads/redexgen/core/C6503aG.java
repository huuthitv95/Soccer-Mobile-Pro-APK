package com.facebook.ads.redexgen.core;

import android.animation.Animator;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.aG */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C6503aG implements Animator.AnimatorListener {
    public final /* synthetic */ C6506aJ A00;

    public C6503aG(C6506aJ c6506aJ) {
        this.A00 = c6506aJ;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.A00.A04 = false;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        if (this.A00.A0H == EnumC6512aP.A04) {
            this.A00.A01.setPadding(AbstractC6332XV.A0S, AbstractC6332XV.A00, AbstractC6332XV.A0S, AbstractC6332XV.A00);
            this.A00.A01.setVisibility(0);
        } else {
            this.A00.A01.setPadding(AbstractC6332XV.A0I, AbstractC6332XV.A00, AbstractC6332XV.A0I, AbstractC6332XV.A00);
        }
    }
}
