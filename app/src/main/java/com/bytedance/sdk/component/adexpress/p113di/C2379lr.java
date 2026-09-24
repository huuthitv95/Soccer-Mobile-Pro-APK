package com.bytedance.sdk.component.adexpress.p113di;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.motion.widget.Key;
import com.bytedance.sdk.component.utils.C2729uq;

/* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.di.lr */
/* JADX INFO: loaded from: classes3.dex */
public class C2379lr extends FrameLayout {

    /* JADX INFO: renamed from: di */
    private View f6316di;

    /* JADX INFO: renamed from: fi */
    private View f6317fi;

    /* JADX INFO: renamed from: ik */
    private boolean f6318ik;
    private int jbs;

    /* JADX INFO: renamed from: ka */
    private View f6319ka;

    /* JADX INFO: renamed from: lr */
    private ObjectAnimator f6320lr;

    /* JADX INFO: renamed from: mj */
    private int f6321mj;

    /* JADX INFO: renamed from: qt */
    private Context f6322qt;

    /* JADX INFO: renamed from: ri */
    private AnimatorSet f6323ri;
    private ImageView xha;

    public C2379lr(Context context, int i, int i2) {
        super(context);
        this.f6318ik = false;
        this.f6323ri = new AnimatorSet();
        this.f6321mj = i;
        this.jbs = i2;
        this.f6322qt = context;
        m8238ik();
        m8239ka();
    }

    /* JADX INFO: renamed from: ik */
    private void m8238ik() {
        View view = new View(this.f6322qt);
        this.f6319ka = view;
        view.setBackground(m8241ri("#1A7BBEFF", "#337BBEFF"));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) (((double) this.f6321mj) * 0.45d), (int) (((double) this.jbs) * 0.45d));
        layoutParams.gravity = 17;
        this.f6319ka.setLayoutParams(layoutParams);
        addView(this.f6319ka);
        View view2 = new View(this.f6322qt);
        this.f6317fi = view2;
        view2.setBackground(m8241ri("#337BBEFF", "#807BBEFF"));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) (((double) this.f6321mj) * 0.25d), (int) (((double) this.jbs) * 0.25d));
        layoutParams2.gravity = 17;
        this.f6317fi.setLayoutParams(layoutParams2);
        addView(this.f6317fi);
        View view3 = new View(this.f6322qt);
        this.f6316di = view3;
        view3.setBackground(m8241ri("#807BBEFF", "#FF7BBEFF"));
        int i = this.f6321mj;
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams((int) (((double) i) * 0.25d), (int) (((double) i) * 0.25d));
        layoutParams3.gravity = 17;
        this.f6316di.setLayoutParams(layoutParams3);
        addView(this.f6316di);
        ImageView imageView = new ImageView(this.f6322qt);
        this.xha = imageView;
        imageView.setImageResource(C2729uq.m10305ka(getContext(), "tt_blue_hand"));
        this.xha.setScaleType(ImageView.ScaleType.FIT_CENTER);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams((int) (((double) this.f6321mj) * 0.62d), (int) (((double) this.jbs) * 0.53d));
        layoutParams4.gravity = 17;
        layoutParams4.topMargin = (layoutParams4.width / 2) - 5;
        layoutParams4.leftMargin = (layoutParams4.height / 2) - 5;
        this.xha.setLayoutParams(layoutParams4);
        addView(this.xha);
    }

    /* JADX INFO: renamed from: ka */
    private void m8239ka() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f6319ka, "scaleX", 1.0f, 2.0f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f6319ka, "scaleY", 1.0f, 2.0f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.f6317fi, "scaleX", 1.0f, 2.5f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(this.f6317fi, "scaleY", 1.0f, 2.5f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(this.f6316di, "scaleX", 1.0f, 1.5f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(this.f6316di, "scaleY", 1.0f, 1.5f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat7 = ObjectAnimator.ofFloat(this.xha, Key.ROTATION, 0.0f, -20.0f, 0.0f);
        this.f6320lr = objectAnimatorOfFloat7;
        objectAnimatorOfFloat7.setDuration(1000L);
        this.f6323ri.setDuration(1500L);
        this.f6323ri.setInterpolator(new AccelerateDecelerateInterpolator());
        this.f6323ri.play(objectAnimatorOfFloat).with(objectAnimatorOfFloat2).with(objectAnimatorOfFloat3).with(objectAnimatorOfFloat4).with(objectAnimatorOfFloat5).with(objectAnimatorOfFloat6);
        this.f6323ri.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.di.lr.1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                C2379lr.this.f6318ik = true;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                if (C2379lr.this.f6318ik) {
                    return;
                }
                C2379lr.this.f6320lr.start();
                C2379lr.this.f6323ri.start();
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        });
    }

    /* JADX INFO: renamed from: ri */
    private GradientDrawable m8241ri(String str, String str2) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(Color.parseColor(str));
        gradientDrawable.setStroke(1, Color.parseColor(str2));
        return gradientDrawable;
    }

    /* JADX INFO: renamed from: lr */
    public void m8244lr() {
        this.f6318ik = true;
        ObjectAnimator objectAnimator = this.f6320lr;
        if (objectAnimator == null || this.f6323ri == null) {
            return;
        }
        objectAnimator.cancel();
        this.f6323ri.cancel();
    }

    /* JADX INFO: renamed from: ri */
    public void m8245ri() {
        this.f6318ik = false;
        ObjectAnimator objectAnimator = this.f6320lr;
        if (objectAnimator == null || this.f6323ri == null) {
            return;
        }
        objectAnimator.start();
        this.f6323ri.start();
    }
}
