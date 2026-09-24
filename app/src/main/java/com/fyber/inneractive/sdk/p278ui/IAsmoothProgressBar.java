package com.fyber.inneractive.sdk.p278ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ProgressBar;

/* JADX INFO: loaded from: classes4.dex */
public class IAsmoothProgressBar extends ProgressBar {

    /* JADX INFO: renamed from: c */
    public static final AccelerateDecelerateInterpolator f21399c = new AccelerateDecelerateInterpolator();

    /* JADX INFO: renamed from: a */
    public ValueAnimator f21400a;

    /* JADX INFO: renamed from: b */
    public ValueAnimator f21401b;

    public IAsmoothProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public IAsmoothProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.f21400a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f21401b;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
    }

    @Override // android.widget.ProgressBar
    public synchronized void setProgress(int i) {
        ValueAnimator valueAnimator = this.f21400a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f21400a;
        if (valueAnimator2 == null) {
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(getProgress(), i);
            this.f21400a = valueAnimatorOfInt;
            valueAnimatorOfInt.setInterpolator(f21399c);
            this.f21400a.addUpdateListener(new C9129g(this));
        } else {
            valueAnimator2.setIntValues(getProgress(), i);
        }
        this.f21400a.start();
    }

    @Override // android.widget.ProgressBar
    public synchronized void setSecondaryProgress(int i) {
        ValueAnimator valueAnimator = this.f21401b;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f21401b;
        if (valueAnimator2 == null) {
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(getProgress(), i);
            this.f21401b = valueAnimatorOfInt;
            valueAnimatorOfInt.setInterpolator(f21399c);
            this.f21401b.addUpdateListener(new C9130h(this));
        } else {
            valueAnimator2.setIntValues(getProgress(), i);
        }
        this.f21401b.start();
    }
}
