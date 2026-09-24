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

/* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.di.aw */
/* JADX INFO: loaded from: classes3.dex */
public class C2366aw extends FrameLayout {

    /* JADX INFO: renamed from: di */
    private TextView f6226di;

    /* JADX INFO: renamed from: fi */
    private boolean f6227fi;

    /* JADX INFO: renamed from: ik */
    private C2378ka f6228ik;

    /* JADX INFO: renamed from: ka */
    private AnimatorSet f6229ka;

    /* JADX INFO: renamed from: lr */
    private ImageView f6230lr;

    /* JADX INFO: renamed from: ri */
    private Context f6231ri;

    public C2366aw(Context context) {
        super(context);
        this.f6227fi = true;
        this.f6231ri = context;
        this.f6229ka = new AnimatorSet();
        m8188ik();
        m8189ka();
        post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.di.aw.1
            @Override // java.lang.Runnable
            public void run() {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) C2366aw.this.f6230lr.getLayoutParams();
                layoutParams.topMargin = ((int) ((C2366aw.this.f6228ik.getMeasuredHeight() / 2.0f) - xha.m8833ri(C2366aw.this.getContext(), 5.0f))) + ((int) xha.m8833ri(C2366aw.this.f6231ri, 20.0f));
                layoutParams.leftMargin = ((int) ((C2366aw.this.f6228ik.getMeasuredWidth() / 2.0f) - xha.m8833ri(C2366aw.this.getContext(), 5.0f))) + ((int) xha.m8833ri(C2366aw.this.f6231ri, 20.0f));
                layoutParams.bottomMargin = (int) (((-C2366aw.this.f6228ik.getMeasuredHeight()) / 2.0f) + xha.m8833ri(C2366aw.this.getContext(), 5.0f));
                layoutParams.rightMargin = (int) (((-C2366aw.this.f6228ik.getMeasuredWidth()) / 2.0f) + xha.m8833ri(C2366aw.this.getContext(), 5.0f));
                layoutParams.setMarginStart(layoutParams.leftMargin);
                layoutParams.setMarginEnd(layoutParams.rightMargin);
                C2366aw.this.f6230lr.setLayoutParams(layoutParams);
            }
        });
    }

    /* JADX INFO: renamed from: ik */
    private void m8188ik() {
        this.f6228ik = new C2378ka(this.f6231ri);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) xha.m8833ri(this.f6231ri, 80.0f), (int) xha.m8833ri(this.f6231ri, 80.0f));
        layoutParams.gravity = 8388659;
        layoutParams.topMargin = (int) xha.m8833ri(this.f6231ri, 20.0f);
        layoutParams.leftMargin = (int) xha.m8833ri(this.f6231ri, 20.0f);
        layoutParams.setMarginStart(layoutParams.leftMargin);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        addView(this.f6228ik, layoutParams);
        this.f6228ik.m8236ri();
        this.f6230lr = new ImageView(this.f6231ri);
        ViewGroup.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) xha.m8833ri(this.f6231ri, 80.0f), (int) xha.m8833ri(this.f6231ri, 80.0f));
        this.f6230lr.setImageResource(C2729uq.m10305ka(this.f6231ri, "tt_splash_hand"));
        addView(this.f6230lr, layoutParams2);
        TextView textView = new TextView(this.f6231ri);
        this.f6226di = textView;
        textView.setTextColor(-1);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 81;
        layoutParams3.bottomMargin = (int) xha.m8833ri(this.f6231ri, 10.0f);
        addView(this.f6226di, layoutParams3);
    }

    /* JADX INFO: renamed from: ka */
    private void m8189ka() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f6230lr, "scaleX", 1.0f, 0.8f);
        objectAnimatorOfFloat.setDuration(1000L);
        objectAnimatorOfFloat.setRepeatMode(2);
        objectAnimatorOfFloat.setRepeatCount(-1);
        objectAnimatorOfFloat.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.di.aw.2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                if (C2366aw.this.f6227fi) {
                    C2366aw.this.f6228ik.m8236ri();
                    C2366aw.this.f6228ik.setAlpha(1.0f);
                } else {
                    C2366aw.this.f6228ik.m8235lr();
                    C2366aw.this.f6228ik.setAlpha(0.0f);
                }
                C2366aw c2366aw = C2366aw.this;
                c2366aw.f6227fi = !c2366aw.f6227fi;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(C2366aw.this.f6230lr, "alpha", 0.0f, 1.0f);
                objectAnimatorOfFloat2.setDuration(200L);
                objectAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
                objectAnimatorOfFloat2.start();
                C2366aw.this.f6230lr.setVisibility(0);
            }
        });
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f6230lr, "scaleY", 1.0f, 0.8f);
        objectAnimatorOfFloat2.setDuration(1000L);
        objectAnimatorOfFloat2.setRepeatMode(2);
        objectAnimatorOfFloat2.setRepeatCount(-1);
        this.f6229ka.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
    }

    /* JADX INFO: renamed from: lr */
    public void m8194lr() {
        AnimatorSet animatorSet = this.f6229ka;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        C2378ka c2378ka = this.f6228ik;
        if (c2378ka != null) {
            c2378ka.m8235lr();
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m8195ri() {
        this.f6229ka.start();
    }

    public void setGuideText(String str) {
        this.f6226di.setText(str);
    }

    public void setGuideTextColor(int i) {
        this.f6226di.setTextColor(i);
    }
}
