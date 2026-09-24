package com.facebook.ads.redexgen.core;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.f7 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C6803f7 extends AnimatorListenerAdapter {
    public final /* synthetic */ C45143c A00;

    public C6803f7(C45143c c45143c) {
        this.A00 = c45143c;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.A00.A00.A04.postDelayed(new C5119Di(this), 2000L);
    }
}
