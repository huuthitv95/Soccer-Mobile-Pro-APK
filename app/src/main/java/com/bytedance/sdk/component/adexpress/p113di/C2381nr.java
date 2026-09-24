package com.bytedance.sdk.component.adexpress.p113di;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Interpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.C2709ay;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.di.nr */
/* JADX INFO: loaded from: classes3.dex */
public class C2381nr extends LinearLayout {

    /* JADX INFO: renamed from: co */
    private JSONObject f6331co;

    /* JADX INFO: renamed from: di */
    private TextView f6332di;

    /* JADX INFO: renamed from: fi */
    private TextView f6333fi;

    /* JADX INFO: renamed from: ik */
    private ImageView f6334ik;
    private int jbs;

    /* JADX INFO: renamed from: ka */
    private C2709ay f6335ka;

    /* JADX INFO: renamed from: lr */
    private TextView f6336lr;

    /* JADX INFO: renamed from: mj */
    private LinearLayout f6337mj;

    /* JADX INFO: renamed from: qt */
    private int f6338qt;

    /* JADX INFO: renamed from: ri */
    private TextView f6339ri;

    /* JADX INFO: renamed from: sf */
    private int f6340sf;
    private ri xha;

    /* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.di.nr$1, reason: invalid class name */
    class AnonymousClass1 implements Runnable {
        AnonymousClass1() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C2381nr.this.f6334ik != null) {
                final RotateAnimation rotateAnimation = new RotateAnimation(-14.0f, 14.0f, 1, 0.9f, 1, 0.9f);
                rotateAnimation.setInterpolator(new lr(null));
                rotateAnimation.setDuration(1000L);
                rotateAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.bytedance.sdk.component.adexpress.di.nr.1.1
                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationEnd(Animation animation) {
                        C2381nr.this.postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.di.nr.1.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                C2381nr.this.f6334ik.startAnimation(rotateAnimation);
                            }
                        }, 250L);
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationRepeat(Animation animation) {
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationStart(Animation animation) {
                    }
                });
                C2381nr.this.f6334ik.startAnimation(rotateAnimation);
            }
        }
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.di.nr$lr */
    private static class lr implements Interpolator {
        private lr() {
        }

        /* synthetic */ lr(AnonymousClass1 anonymousClass1) {
            this();
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            if (f <= 0.25f) {
                return (f * (-2.0f)) + 0.5f;
            }
            if (f <= 0.5f) {
                return (f * 4.0f) - 1.0f;
            }
            return f <= 0.75f ? (f * (-4.0f)) + 3.0f : (f * 2.0f) - 1.5f;
        }
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.di.nr$ri */
    public interface ri {
    }

    public C2381nr(Context context, View view, int i, int i2, int i3, JSONObject jSONObject) {
        super(context);
        this.jbs = i;
        this.f6338qt = i2;
        this.f6340sf = i3;
        this.f6331co = jSONObject;
        mo8250ri(context, view);
    }

    public LinearLayout getShakeLayout() {
        return this.f6337mj;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isShown()) {
            if (this.f6335ka == null) {
                this.f6335ka = new C2709ay(getContext().getApplicationContext(), 1);
            }
            new Object() { // from class: com.bytedance.sdk.component.adexpress.di.nr.2
            };
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
    }

    /* JADX INFO: renamed from: ri */
    public void m8249ri() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "alpha", 0.0f, 1.0f);
        objectAnimatorOfFloat.setDuration(300L);
        objectAnimatorOfFloat.start();
        postDelayed(new AnonymousClass1(), 500L);
    }

    /* JADX INFO: renamed from: ri */
    protected void mo8250ri(Context context, View view) {
        addView(view);
        this.f6337mj = (LinearLayout) findViewById(2097610727);
        this.f6334ik = (ImageView) findViewById(2097610725);
        this.f6339ri = (TextView) findViewById(2097610724);
        this.f6336lr = (TextView) findViewById(2097610726);
        this.f6333fi = (TextView) findViewById(2097610723);
        this.f6332di = (TextView) findViewById(2097610728);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(Color.parseColor("#57000000"));
        this.f6337mj.setBackground(gradientDrawable);
    }

    public void setOnShakeViewListener(ri riVar) {
        this.xha = riVar;
    }

    public void setShakeText(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f6333fi.setText(str);
        } else {
            this.f6333fi.setVisibility(8);
            this.f6332di.setVisibility(8);
        }
    }
}
