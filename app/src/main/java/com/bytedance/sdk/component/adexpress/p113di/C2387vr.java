package com.bytedance.sdk.component.adexpress.p113di;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.p124ka.xha;
import com.bytedance.sdk.component.utils.C2729uq;

/* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.di.vr */
/* JADX INFO: loaded from: classes3.dex */
public class C2387vr extends FrameLayout {

    /* JADX INFO: renamed from: di */
    private TextView f6389di;

    /* JADX INFO: renamed from: fi */
    private boolean f6390fi;

    /* JADX INFO: renamed from: ik */
    private C2386uq f6391ik;

    /* JADX INFO: renamed from: ka */
    private AnimatorSet f6392ka;

    /* JADX INFO: renamed from: lr */
    private ImageView f6393lr;

    /* JADX INFO: renamed from: ri */
    private Context f6394ri;

    public C2387vr(Context context) {
        super(context);
        this.f6390fi = true;
        this.f6394ri = context;
        this.f6392ka = new AnimatorSet();
        m8276ik();
        m8277ka();
        post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.di.vr.1
            @Override // java.lang.Runnable
            public void run() {
                int iM8833ri = (int) xha.m8833ri(C2387vr.this.f6394ri, 50.0f);
                int iM8833ri2 = (int) xha.m8833ri(C2387vr.this.f6394ri, 50.0f);
                if (C2387vr.this.f6391ik.getMeasuredHeight() > 0) {
                    iM8833ri = C2387vr.this.f6391ik.getMeasuredHeight();
                }
                if (C2387vr.this.f6391ik.getMeasuredWidth() > 0) {
                    iM8833ri2 = C2387vr.this.f6391ik.getMeasuredWidth();
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) C2387vr.this.f6393lr.getLayoutParams();
                layoutParams.topMargin = ((int) ((iM8833ri / 2.0f) - xha.m8833ri(C2387vr.this.getContext(), 5.0f))) + ((int) xha.m8833ri(C2387vr.this.f6394ri, 40.0f));
                layoutParams.leftMargin = ((int) ((iM8833ri2 / 2.0f) - xha.m8833ri(C2387vr.this.getContext(), 5.0f))) + ((int) xha.m8833ri(C2387vr.this.f6394ri, 20.0f));
                layoutParams.bottomMargin = (int) (((-iM8833ri) / 2.0f) + xha.m8833ri(C2387vr.this.getContext(), 5.0f));
                layoutParams.rightMargin = (int) (((-iM8833ri2) / 2.0f) + xha.m8833ri(C2387vr.this.getContext(), 5.0f));
                layoutParams.setMarginStart(layoutParams.leftMargin);
                layoutParams.setMarginEnd(layoutParams.rightMargin);
                C2387vr.this.f6393lr.setLayoutParams(layoutParams);
            }
        });
    }

    /* JADX INFO: renamed from: ik */
    private void m8276ik() {
        this.f6391ik = new C2386uq(this.f6394ri);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) xha.m8833ri(this.f6394ri, 50.0f), (int) xha.m8833ri(this.f6394ri, 50.0f));
        layoutParams.gravity = 8388659;
        layoutParams.topMargin = (int) xha.m8833ri(this.f6394ri, 40.0f);
        layoutParams.leftMargin = (int) xha.m8833ri(this.f6394ri, 20.0f);
        layoutParams.setMarginStart(layoutParams.leftMargin);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        addView(this.f6391ik, layoutParams);
        this.f6393lr = new ImageView(this.f6394ri);
        ViewGroup.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) xha.m8833ri(this.f6394ri, 78.0f), (int) xha.m8833ri(this.f6394ri, 78.0f));
        this.f6393lr.setImageResource(C2729uq.m10305ka(this.f6394ri, "tt_splash_hand"));
        addView(this.f6393lr, layoutParams2);
        TextView textView = new TextView(this.f6394ri);
        this.f6389di = textView;
        textView.setTextColor(-1);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 81;
        layoutParams3.bottomMargin = (int) xha.m8833ri(this.f6394ri, 10.0f);
        addView(this.f6389di, layoutParams3);
        this.f6389di.setVisibility(8);
    }

    /* JADX INFO: renamed from: ka */
    private void m8277ka() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f6393lr, "scaleX", 1.0f, 1.0f, 1.0f, 0.9f);
        objectAnimatorOfFloat.setDuration(600L);
        objectAnimatorOfFloat.setRepeatMode(2);
        objectAnimatorOfFloat.setRepeatCount(-1);
        objectAnimatorOfFloat.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.di.vr.2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                if (C2387vr.this.f6390fi) {
                    C2387vr.this.f6391ik.m8274ri();
                }
                C2387vr c2387vr = C2387vr.this;
                c2387vr.f6390fi = !c2387vr.f6390fi;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(C2387vr.this.f6393lr, "alpha", 0.0f, 1.0f);
                objectAnimatorOfFloat2.setDuration(200L);
                objectAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
                objectAnimatorOfFloat2.start();
                C2387vr.this.f6393lr.setVisibility(0);
            }
        });
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f6393lr, "scaleY", 1.0f, 1.0f, 1.0f, 0.9f);
        objectAnimatorOfFloat2.setDuration(600L);
        objectAnimatorOfFloat2.setRepeatMode(2);
        objectAnimatorOfFloat2.setRepeatCount(-1);
        this.f6392ka.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
    }

    /* JADX INFO: renamed from: lr */
    public void m8282lr() {
        AnimatorSet animatorSet = this.f6392ka;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        C2386uq c2386uq = this.f6391ik;
        if (c2386uq != null) {
            c2386uq.m8273lr();
        }
        ImageView imageView = this.f6393lr;
        if (imageView != null) {
            imageView.clearAnimation();
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m8283ri() {
        this.f6392ka.start();
    }

    public void setGuideText(String str) {
        this.f6389di.setVisibility(0);
        this.f6389di.setText(str);
    }

    public void setGuideTextColor(int i) {
        this.f6389di.setTextColor(i);
    }
}
