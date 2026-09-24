package com.bytedance.adsdk.p065lr.p066di;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.os.Build;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: com.bytedance.adsdk.lr.di.ri */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2022ri extends ValueAnimator {

    /* JADX INFO: renamed from: ri */
    private final Set<ValueAnimator.AnimatorUpdateListener> f4758ri = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: lr */
    private final Set<Animator.AnimatorListener> f4757lr = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: ik */
    private final Set<Animator.AnimatorPauseListener> f4756ik = new CopyOnWriteArraySet();

    @Override // android.animation.Animator
    public void addListener(Animator.AnimatorListener animatorListener) {
        this.f4757lr.add(animatorListener);
    }

    @Override // android.animation.Animator
    public void addPauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.f4756ik.add(animatorPauseListener);
    }

    @Override // android.animation.ValueAnimator
    public void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f4758ri.add(animatorUpdateListener);
    }

    /* JADX INFO: renamed from: fi */
    void m6590fi() {
        Iterator<Animator.AnimatorPauseListener> it = this.f4756ik.iterator();
        while (it.hasNext()) {
            it.next().onAnimationResume(this);
        }
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public long getStartDelay() {
        throw new UnsupportedOperationException("LottieAnimator does not support getStartDelay.");
    }

    /* JADX INFO: renamed from: ik */
    void m6591ik() {
        Iterator<ValueAnimator.AnimatorUpdateListener> it = this.f4758ri.iterator();
        while (it.hasNext()) {
            it.next().onAnimationUpdate(this);
        }
    }

    /* JADX INFO: renamed from: ka */
    void m6592ka() {
        Iterator<Animator.AnimatorPauseListener> it = this.f4756ik.iterator();
        while (it.hasNext()) {
            it.next().onAnimationPause(this);
        }
    }

    /* JADX INFO: renamed from: lr */
    void mo6575lr() {
        Iterator<Animator.AnimatorListener> it = this.f4757lr.iterator();
        while (it.hasNext()) {
            it.next().onAnimationCancel(this);
        }
    }

    /* JADX INFO: renamed from: lr */
    void m6593lr(boolean z) {
        for (Animator.AnimatorListener animatorListener : this.f4757lr) {
            if (Build.VERSION.SDK_INT >= 26) {
                animatorListener.onAnimationEnd(this, z);
            } else {
                animatorListener.onAnimationEnd(this);
            }
        }
    }

    @Override // android.animation.Animator
    public void removeAllListeners() {
        this.f4757lr.clear();
    }

    @Override // android.animation.ValueAnimator
    public void removeAllUpdateListeners() {
        this.f4758ri.clear();
    }

    @Override // android.animation.Animator
    public void removeListener(Animator.AnimatorListener animatorListener) {
        this.f4757lr.remove(animatorListener);
    }

    @Override // android.animation.Animator
    public void removePauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.f4756ik.remove(animatorPauseListener);
    }

    @Override // android.animation.ValueAnimator
    public void removeUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f4758ri.remove(animatorUpdateListener);
    }

    /* JADX INFO: renamed from: ri */
    void m6594ri() {
        Iterator<Animator.AnimatorListener> it = this.f4757lr.iterator();
        while (it.hasNext()) {
            it.next().onAnimationRepeat(this);
        }
    }

    /* JADX INFO: renamed from: ri */
    void m6595ri(boolean z) {
        for (Animator.AnimatorListener animatorListener : this.f4757lr) {
            if (Build.VERSION.SDK_INT >= 26) {
                animatorListener.onAnimationStart(this, z);
            } else {
                animatorListener.onAnimationStart(this);
            }
        }
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public ValueAnimator setDuration(long j) {
        throw new UnsupportedOperationException("LottieAnimator does not support setDuration.");
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void setInterpolator(TimeInterpolator timeInterpolator) {
        throw new UnsupportedOperationException("LottieAnimator does not support setInterpolator.");
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void setStartDelay(long j) {
        throw new UnsupportedOperationException("LottieAnimator does not support setStartDelay.");
    }
}
