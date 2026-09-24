package com.fyber.inneractive.sdk.p278ui;

import android.animation.ValueAnimator;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.ui.g */
/* JADX INFO: loaded from: classes4.dex */
public final class C9129g implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ IAsmoothProgressBar f21423a;

    public C9129g(IAsmoothProgressBar iAsmoothProgressBar) {
        this.f21423a = iAsmoothProgressBar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        super/*android.widget.ProgressBar*/.setProgress(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
