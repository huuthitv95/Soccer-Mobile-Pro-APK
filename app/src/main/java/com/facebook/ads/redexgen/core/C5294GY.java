package com.facebook.ads.redexgen.core;

import android.view.animation.Animation;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.GY */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C5294GY extends AnimationAnimationListenerC6373YA {
    public final /* synthetic */ C5293GX A00;

    public C5294GY(C5293GX c5293gx) {
        this.A00 = c5293gx;
    }

    @Override // com.facebook.ads.redexgen.core.AnimationAnimationListenerC6373YA, android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        AbstractC6374YB.A0H(this.A00.A01);
        this.A00.A00.AEL();
    }
}
