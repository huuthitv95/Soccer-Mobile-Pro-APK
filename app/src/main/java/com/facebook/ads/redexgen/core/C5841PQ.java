package com.facebook.ads.redexgen.core;

import android.R;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.PQ */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C5841PQ extends AbstractRunnableC6279Wc {
    public final /* synthetic */ AnimationAnimationListenerC6419Yu A00;

    public C5841PQ(AnimationAnimationListenerC6419Yu animationAnimationListenerC6419Yu) {
        this.A00 = animationAnimationListenerC6419Yu;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC6279Wc
    public final void A07() {
        this.A00.A00.finish(3);
        this.A00.A00.A05().overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
    }
}
