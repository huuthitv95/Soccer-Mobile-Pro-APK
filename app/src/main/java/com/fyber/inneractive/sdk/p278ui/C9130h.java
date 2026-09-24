package com.fyber.inneractive.sdk.p278ui;

import android.animation.ValueAnimator;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.ui.h */
/* JADX INFO: loaded from: classes4.dex */
public final class C9130h implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ IAsmoothProgressBar f21424a;

    public C9130h(IAsmoothProgressBar iAsmoothProgressBar) {
        this.f21424a = iAsmoothProgressBar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        super/*android.widget.ProgressBar*/.setSecondaryProgress(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
