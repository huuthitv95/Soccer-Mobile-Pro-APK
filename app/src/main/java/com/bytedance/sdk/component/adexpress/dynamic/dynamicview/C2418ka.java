package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.p119ka.C2475mj;

/* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ka */
/* JADX INFO: loaded from: classes3.dex */
public class C2418ka extends C2410di {

    /* JADX INFO: renamed from: ac */
    private int f6517ac;
    private Runnable ihz;

    /* JADX INFO: renamed from: lr */
    ObjectAnimator f6518lr;

    /* JADX INFO: renamed from: ri */
    ObjectAnimator f6519ri;

    public C2418ka(Context context, DynamicRootView dynamicRootView, C2475mj c2475mj) {
        super(context, dynamicRootView, c2475mj);
        this.f6517ac = 0;
        this.ihz = new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ka.1
            @Override // java.lang.Runnable
            public void run() {
                C2418ka.this.m8346ri();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ri */
    public void m8346ri() {
        final View childAt = getChildAt(this.f6517ac);
        final View childAt2 = getChildAt((this.f6517ac + 1) % getChildCount());
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(childAt, "translationY", 0.0f, (-(this.f6481mj + getChildAt(this.f6517ac).getHeight())) / 2);
        this.f6519ri = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        this.f6519ri.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ka.2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                childAt.setVisibility(8);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        });
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(childAt2, "translationY", (this.f6481mj + childAt2.getHeight()) / 2, 0.0f);
        this.f6518lr = objectAnimatorOfFloat2;
        objectAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
        this.f6518lr.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ka.3
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
                childAt2.setVisibility(0);
            }
        });
        this.f6519ri.setDuration(500L);
        this.f6518lr.setDuration(500L);
        this.f6519ri.start();
        this.f6518lr.start();
        int i = this.f6517ac + 1;
        this.f6517ac = i;
        this.f6517ac = i % getChildCount();
        postDelayed(this.ihz, 2000L);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.AbstractC2412fi, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.dzy
    /* JADX INFO: renamed from: lr */
    public void mo8296lr() {
        removeCallbacks(this.ihz);
        ObjectAnimator objectAnimator = this.f6519ri;
        if (objectAnimator != null) {
            objectAnimator.removeAllUpdateListeners();
            this.f6519ri.cancel();
        }
        ObjectAnimator objectAnimator2 = this.f6518lr;
        if (objectAnimator2 != null) {
            objectAnimator2.removeAllUpdateListeners();
            this.f6518lr.cancel();
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
        postDelayed(this.ihz, 2500L);
    }
}
