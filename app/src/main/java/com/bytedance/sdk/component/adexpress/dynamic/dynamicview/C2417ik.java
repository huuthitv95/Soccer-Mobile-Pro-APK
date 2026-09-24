package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.p119ka.C2475mj;

/* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ik */
/* JADX INFO: loaded from: classes3.dex */
public class C2417ik extends C2410di {

    /* JADX INFO: renamed from: ac */
    private int f6508ac;
    private boolean ihz;

    /* JADX INFO: renamed from: lr */
    ObjectAnimator f6509lr;

    /* JADX INFO: renamed from: ri */
    ObjectAnimator f6510ri;

    /* JADX INFO: renamed from: uq */
    private Runnable f6511uq;

    public C2417ik(Context context, DynamicRootView dynamicRootView, C2475mj c2475mj) {
        super(context, dynamicRootView, c2475mj);
        this.f6508ac = 0;
        this.ihz = false;
        this.f6511uq = new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ik.1
            @Override // java.lang.Runnable
            public void run() {
                C2417ik.this.m8344ri();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ri */
    public void m8344ri() {
        final View childAt;
        final View childAt2 = getChildAt(this.f6508ac);
        if (childAt2 == null) {
            return;
        }
        int i = this.f6508ac;
        if (i == 0) {
            this.ihz = false;
        }
        if (i + 1 >= getChildCount() || ((ViewGroup) getChildAt(this.f6508ac + 1)).getChildCount() <= 0) {
            this.ihz = true;
            childAt = getChildAt(this.f6508ac - 1);
            this.f6510ri = ObjectAnimator.ofFloat(childAt2, "translationX", 0.0f, (this.xha + getChildAt(this.f6508ac).getWidth()) / 2);
        } else {
            childAt = getChildAt(this.f6508ac + 1);
            this.f6510ri = ObjectAnimator.ofFloat(childAt2, "translationX", 0.0f, (-(this.xha + getChildAt(this.f6508ac).getWidth())) / 2);
        }
        if (childAt == null) {
            return;
        }
        this.f6510ri.setInterpolator(new LinearInterpolator());
        this.f6510ri.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ik.2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                childAt2.setVisibility(8);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        });
        if (this.ihz) {
            this.f6509lr = ObjectAnimator.ofFloat(childAt, "translationX", (-(this.xha + childAt.getWidth())) / 2, 0.0f);
        } else {
            this.f6509lr = ObjectAnimator.ofFloat(childAt, "translationX", (this.xha + childAt.getWidth()) / 2, 0.0f);
        }
        this.f6509lr.setInterpolator(new LinearInterpolator());
        this.f6509lr.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ik.3
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                childAt.setVisibility(0);
            }
        });
        this.f6510ri.setDuration(500L);
        this.f6509lr.setDuration(500L);
        this.f6510ri.start();
        this.f6509lr.start();
        if (this.ihz) {
            this.f6508ac--;
        } else {
            this.f6508ac++;
        }
        postDelayed(this.f6511uq, 2000L);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.AbstractC2412fi, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.dzy
    /* JADX INFO: renamed from: lr */
    public void mo8296lr() {
        removeCallbacks(this.f6511uq);
        ObjectAnimator objectAnimator = this.f6510ri;
        if (objectAnimator != null) {
            objectAnimator.removeAllUpdateListeners();
            this.f6510ri.cancel();
        }
        ObjectAnimator objectAnimator2 = this.f6509lr;
        if (objectAnimator2 != null) {
            objectAnimator2.removeAllUpdateListeners();
            this.f6509lr.cancel();
        }
        super.mo8296lr();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.C2410di, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.AbstractC2412fi, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            layoutParams.topMargin = (this.f6481mj - layoutParams.height) / 2;
            childAt.setLayoutParams(layoutParams);
            if (i != 0) {
                childAt.setVisibility(8);
            }
        }
        postDelayed(this.f6511uq, 2500L);
    }
}
