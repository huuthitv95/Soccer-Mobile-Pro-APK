package com.bytedance.sdk.component.adexpress.p113di;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.animation.PathInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.p124ka.xha;
import com.bytedance.sdk.component.utils.C2729uq;

/* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.di.ac */
/* JADX INFO: loaded from: classes3.dex */
public class C2365ac extends FrameLayout {

    /* JADX INFO: renamed from: di */
    private AnimatorSet f6215di;

    /* JADX INFO: renamed from: fi */
    private TextView f6216fi;

    /* JADX INFO: renamed from: ik */
    private ImageView f6217ik;
    private AnimatorSet jbs;

    /* JADX INFO: renamed from: ka */
    private ImageView f6218ka;

    /* JADX INFO: renamed from: lr */
    private ImageView f6219lr;

    /* JADX INFO: renamed from: mj */
    private AnimatorSet f6220mj;

    /* JADX INFO: renamed from: ri */
    private Context f6221ri;
    private AnimatorSet xha;

    public C2365ac(Context context) {
        super(context);
        this.f6215di = new AnimatorSet();
        this.xha = new AnimatorSet();
        this.f6220mj = new AnimatorSet();
        this.jbs = new AnimatorSet();
        this.f6221ri = context;
        m8180ik();
    }

    /* JADX INFO: renamed from: ik */
    private void m8180ik() {
        ImageView imageView = new ImageView(this.f6221ri);
        this.f6218ka = imageView;
        imageView.setBackgroundResource(C2729uq.m10305ka(this.f6221ri, "tt_splash_slide_right_bg"));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(0, -2);
        layoutParams.gravity = 48;
        layoutParams.leftMargin = (int) xha.m8833ri(this.f6221ri, 30.0f);
        addView(this.f6218ka, layoutParams);
        setClipChildren(false);
        setClipToPadding(false);
        ImageView imageView2 = new ImageView(this.f6221ri);
        this.f6217ik = imageView2;
        imageView2.setImageResource(C2729uq.m10305ka(this.f6221ri, "tt_splash_slide_right_circle"));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) xha.m8833ri(this.f6221ri, 50.0f), (int) xha.m8833ri(this.f6221ri, 50.0f));
        layoutParams2.gravity = 48;
        layoutParams2.leftMargin = (int) xha.m8833ri(this.f6221ri, 30.0f);
        addView(this.f6217ik, layoutParams2);
        ImageView imageView3 = new ImageView(this.f6221ri);
        this.f6219lr = imageView3;
        imageView3.setImageResource(C2729uq.m10305ka(this.f6221ri, "tt_splash_hand2"));
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams((int) xha.m8833ri(this.f6221ri, 80.0f), (int) xha.m8833ri(this.f6221ri, 80.0f));
        layoutParams3.gravity = 48;
        layoutParams3.leftMargin = (int) xha.m8833ri(this.f6221ri, 30.0f);
        addView(this.f6219lr, layoutParams3);
        TextView textView = new TextView(this.f6221ri);
        this.f6216fi = textView;
        textView.setTextColor(-1);
        this.f6216fi.setSingleLine();
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams4.gravity = 80;
        addView(this.f6216fi, layoutParams4);
        post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.di.ac.1
            @Override // java.lang.Runnable
            public void run() {
                FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) C2365ac.this.f6219lr.getLayoutParams();
                layoutParams5.topMargin = (int) ((C2365ac.this.f6217ik.getMeasuredHeight() / 2.0f) - xha.m8833ri(C2365ac.this.getContext(), 7.0f));
                layoutParams5.leftMargin = (-C2365ac.this.f6217ik.getMeasuredWidth()) + ((int) xha.m8833ri(C2365ac.this.f6221ri, 30.0f));
                layoutParams5.setMarginStart(layoutParams5.leftMargin);
                layoutParams5.setMarginEnd(layoutParams5.rightMargin);
                C2365ac.this.f6219lr.setLayoutParams(layoutParams5);
                FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) C2365ac.this.f6218ka.getLayoutParams();
                layoutParams6.topMargin = (int) ((C2365ac.this.f6217ik.getMeasuredHeight() / 2.0f) - xha.m8833ri(C2365ac.this.getContext(), 5.0f));
                layoutParams6.leftMargin = (int) ((C2365ac.this.f6217ik.getMeasuredWidth() / 2.0f) + ((int) xha.m8833ri(C2365ac.this.f6221ri, 30.0f)));
                layoutParams5.setMarginStart(layoutParams5.leftMargin);
                layoutParams5.setMarginEnd(layoutParams5.rightMargin);
                C2365ac.this.f6218ka.setLayoutParams(layoutParams6);
            }
        });
    }

    /* JADX INFO: renamed from: ka */
    private void m8182ka() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f6219lr, "alpha", 0.0f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f6217ik, "scaleX", 0.0f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.f6217ik, "scaleY", 0.0f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(this.f6218ka, "alpha", 0.0f, 1.0f);
        this.f6220mj.setDuration(300L);
        this.f6220mj.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3, objectAnimatorOfFloat4);
        ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(this.f6219lr, "translationX", 0.0f, xha.m8833ri(getContext(), 90.0f));
        objectAnimatorOfFloat5.setInterpolator(new PathInterpolator(0.2f, 0.0f, 0.3f, 1.0f));
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, (int) xha.m8833ri(getContext(), 90.0f));
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.di.ac.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                Integer num = (Integer) valueAnimator.getAnimatedValue();
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) C2365ac.this.f6218ka.getLayoutParams();
                layoutParams.width = num.intValue();
                C2365ac.this.f6218ka.setLayoutParams(layoutParams);
            }
        });
        valueAnimatorOfInt.setInterpolator(new PathInterpolator(0.2f, 0.0f, 0.3f, 1.0f));
        ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(this.f6217ik, "translationX", 0.0f, xha.m8833ri(getContext(), 90.0f));
        objectAnimatorOfFloat6.setInterpolator(new PathInterpolator(0.2f, 0.0f, 0.3f, 1.0f));
        this.jbs.setDuration(1500L);
        this.jbs.playTogether(objectAnimatorOfFloat5, valueAnimatorOfInt, objectAnimatorOfFloat6);
        ObjectAnimator objectAnimatorOfFloat7 = ObjectAnimator.ofFloat(this.f6219lr, "alpha", 1.0f, 0.0f);
        ObjectAnimator objectAnimatorOfFloat8 = ObjectAnimator.ofFloat(this.f6218ka, "alpha", 1.0f, 0.0f);
        ObjectAnimator objectAnimatorOfFloat9 = ObjectAnimator.ofFloat(this.f6217ik, "alpha", 1.0f, 0.0f);
        this.xha.setDuration(50L);
        this.xha.playTogether(objectAnimatorOfFloat7, objectAnimatorOfFloat8, objectAnimatorOfFloat9);
        this.f6215di.playSequentially(this.f6220mj, this.jbs, this.xha);
    }

    /* JADX INFO: renamed from: lr */
    public void m8185lr() {
        try {
            AnimatorSet animatorSet = this.f6215di;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = this.f6220mj;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            AnimatorSet animatorSet3 = this.jbs;
            if (animatorSet3 != null) {
                animatorSet3.cancel();
            }
            AnimatorSet animatorSet4 = this.xha;
            if (animatorSet4 != null) {
                animatorSet4.cancel();
            }
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: ri */
    public void m8186ri() {
        m8182ka();
        this.f6215di.start();
        this.f6215di.addListener(new AnimatorListenerAdapter() { // from class: com.bytedance.sdk.component.adexpress.di.ac.3
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                C2365ac.this.postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.di.ac.3.1
                    @Override // java.lang.Runnable
                    public void run() {
                        C2365ac.this.f6215di.start();
                    }
                }, 200L);
            }
        });
    }

    public void setGuideText(String str) {
        this.f6216fi.setText(str);
    }
}
