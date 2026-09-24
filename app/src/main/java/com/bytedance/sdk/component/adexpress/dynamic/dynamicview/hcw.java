package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.p119ka.C2475mj;

/* JADX INFO: loaded from: classes3.dex */
public class hcw extends C2410di {

    /* JADX INFO: renamed from: ac */
    private int f6492ac;
    private boolean ihz;

    /* JADX INFO: renamed from: lr */
    ObjectAnimator f6493lr;

    /* JADX INFO: renamed from: ri */
    ObjectAnimator f6494ri;

    /* JADX INFO: renamed from: uq */
    private Runnable f6495uq;

    public hcw(Context context, DynamicRootView dynamicRootView, C2475mj c2475mj) {
        super(context, dynamicRootView, c2475mj);
        this.f6492ac = 0;
        this.ihz = false;
        this.f6495uq = new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.hcw.1
            @Override // java.lang.Runnable
            public void run() {
                hcw.this.m8340ri();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ri */
    public void m8340ri() {
        final View childAt;
        final View childAt2 = getChildAt(this.f6492ac);
        int i = this.f6492ac;
        if (i == 0) {
            this.ihz = false;
        }
        boolean z = i + 1 >= getChildCount() || ((ViewGroup) getChildAt(this.f6492ac + 1)).getChildCount() <= 0;
        if (this.f6473aw.m8627qt().m8592fi().m8561ri() || !z) {
            View childAt3 = z ? getChildAt((this.f6492ac + 2) % getChildCount()) : getChildAt((this.f6492ac + 1) % getChildCount());
            this.f6494ri = ObjectAnimator.ofFloat(childAt2, "translationY", 0.0f, (-(this.f6481mj + getChildAt(this.f6492ac).getHeight())) / 2);
            if (z) {
                this.f6492ac++;
            }
            childAt = childAt3;
        } else {
            this.ihz = true;
            childAt = getChildAt(this.f6492ac - 1);
            this.f6494ri = ObjectAnimator.ofFloat(childAt2, "translationY", 0.0f, (this.f6481mj + getChildAt(this.f6492ac).getHeight()) / 2);
        }
        this.f6494ri.setInterpolator(new LinearInterpolator());
        this.f6494ri.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.hcw.2
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
            this.f6493lr = ObjectAnimator.ofFloat(childAt, "translationY", (-(this.f6481mj + childAt.getHeight())) / 2, 0.0f);
        } else {
            this.f6493lr = ObjectAnimator.ofFloat(childAt, "translationY", (this.f6481mj + childAt.getHeight()) / 2, 0.0f);
        }
        this.f6493lr.setInterpolator(new LinearInterpolator());
        this.f6493lr.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.hcw.3
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
        this.f6494ri.setDuration(500L);
        this.f6493lr.setDuration(500L);
        this.f6494ri.start();
        this.f6493lr.start();
        if (this.ihz) {
            this.f6492ac--;
        } else {
            int i2 = this.f6492ac + 1;
            this.f6492ac = i2;
            this.f6492ac = i2 % getChildCount();
        }
        postDelayed(this.f6495uq, 3000L);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.AbstractC2412fi, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.dzy
    /* JADX INFO: renamed from: lr */
    public void mo8296lr() {
        removeCallbacks(this.f6495uq);
        ObjectAnimator objectAnimator = this.f6494ri;
        if (objectAnimator != null) {
            objectAnimator.removeAllUpdateListeners();
            this.f6494ri.cancel();
        }
        ObjectAnimator objectAnimator2 = this.f6493lr;
        if (objectAnimator2 != null) {
            objectAnimator2.removeAllUpdateListeners();
            this.f6493lr.cancel();
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
        postDelayed(this.f6495uq, 2500L);
    }
}
