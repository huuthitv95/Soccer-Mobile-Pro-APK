package com.bytedance.sdk.component.adexpress.p113di;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.sdk.component.adexpress.p124ka.xha;
import com.bytedance.sdk.component.utils.C2729uq;

/* JADX INFO: loaded from: classes3.dex */
public class bgr extends FrameLayout {

    /* JADX INFO: renamed from: fi */
    private boolean f6238fi;

    /* JADX INFO: renamed from: ik */
    private C2386uq f6239ik;

    /* JADX INFO: renamed from: ka */
    private AnimatorSet f6240ka;

    /* JADX INFO: renamed from: lr */
    private ImageView f6241lr;

    /* JADX INFO: renamed from: ri */
    private Context f6242ri;

    public bgr(Context context) {
        super(context);
        this.f6238fi = true;
        this.f6242ri = context;
        this.f6240ka = new AnimatorSet();
        m8197ik();
        m8199ka();
        post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.di.bgr.1
            @Override // java.lang.Runnable
            public void run() {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) bgr.this.f6241lr.getLayoutParams();
                layoutParams.topMargin = (int) ((bgr.this.f6239ik.getMeasuredHeight() / 2.0f) - xha.m8833ri(bgr.this.getContext(), 5.0f));
                layoutParams.leftMargin = (int) ((bgr.this.f6239ik.getMeasuredWidth() / 2.0f) - xha.m8833ri(bgr.this.getContext(), 5.0f));
                layoutParams.bottomMargin = (int) (((-bgr.this.f6239ik.getMeasuredHeight()) / 2.0f) + xha.m8833ri(bgr.this.getContext(), 5.0f));
                layoutParams.rightMargin = (int) (((-bgr.this.f6239ik.getMeasuredWidth()) / 2.0f) + xha.m8833ri(bgr.this.getContext(), 5.0f));
                layoutParams.setMarginStart(layoutParams.leftMargin);
                layoutParams.setMarginEnd(layoutParams.rightMargin);
                bgr.this.f6241lr.setLayoutParams(layoutParams);
            }
        });
    }

    /* JADX INFO: renamed from: ik */
    private void m8197ik() {
        this.f6239ik = new C2386uq(this.f6242ri);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) xha.m8833ri(this.f6242ri, 40.0f), (int) xha.m8833ri(this.f6242ri, 40.0f));
        layoutParams.gravity = 8388627;
        addView(this.f6239ik, layoutParams);
        this.f6241lr = new ImageView(this.f6242ri);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) xha.m8833ri(this.f6242ri, 62.0f), (int) xha.m8833ri(this.f6242ri, 62.0f));
        layoutParams2.gravity = 16;
        this.f6241lr.setImageResource(C2729uq.m10305ka(this.f6242ri, "tt_splash_hand"));
        addView(this.f6241lr, layoutParams2);
    }

    /* JADX INFO: renamed from: ka */
    private void m8199ka() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f6241lr, "scaleX", 1.0f, 0.9f);
        objectAnimatorOfFloat.setDuration(800L);
        objectAnimatorOfFloat.setRepeatMode(2);
        objectAnimatorOfFloat.setRepeatCount(-1);
        objectAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        objectAnimatorOfFloat.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.di.bgr.2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                if (bgr.this.f6238fi) {
                    bgr.this.f6239ik.m8274ri();
                }
                bgr bgrVar = bgr.this;
                bgrVar.f6238fi = !bgrVar.f6238fi;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(bgr.this.f6241lr, "alpha", 0.0f, 1.0f);
                objectAnimatorOfFloat2.setDuration(200L);
                objectAnimatorOfFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
                objectAnimatorOfFloat2.start();
                bgr.this.f6241lr.setVisibility(0);
            }
        });
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f6241lr, "scaleY", 1.0f, 0.9f);
        objectAnimatorOfFloat2.setDuration(800L);
        objectAnimatorOfFloat2.setRepeatMode(2);
        objectAnimatorOfFloat2.setRepeatCount(-1);
        objectAnimatorOfFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
        this.f6240ka.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
    }

    /* JADX INFO: renamed from: lr */
    public void m8203lr() {
        AnimatorSet animatorSet = this.f6240ka;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        C2386uq c2386uq = this.f6239ik;
        if (c2386uq != null) {
            c2386uq.m8273lr();
        }
        ImageView imageView = this.f6241lr;
        if (imageView != null) {
            imageView.clearAnimation();
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m8204ri() {
        this.f6240ka.start();
    }
}
