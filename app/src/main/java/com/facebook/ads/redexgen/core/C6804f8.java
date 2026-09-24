package com.facebook.ads.redexgen.core;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.f8 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C6804f8 extends AnimatorListenerAdapter {
    public final /* synthetic */ C5118Dh A00;

    public C6804f8(C5118Dh c5118Dh) {
        this.A00 = c5118Dh;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.A00.A00.setVisibility(8);
    }
}
