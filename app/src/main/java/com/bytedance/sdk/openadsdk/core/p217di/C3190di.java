package com.bytedance.sdk.openadsdk.core.p217di;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RotateDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.di.di */
/* JADX INFO: loaded from: classes3.dex */
public class C3190di extends FrameLayout {

    /* JADX INFO: renamed from: di */
    private boolean f10565di;

    /* JADX INFO: renamed from: fi */
    private Drawable f10566fi;

    /* JADX INFO: renamed from: ik */
    private Drawable f10567ik;

    /* JADX INFO: renamed from: ka */
    private Drawable f10568ka;

    /* JADX INFO: renamed from: lr */
    private int f10569lr;

    /* JADX INFO: renamed from: mj */
    private boolean f10570mj;

    /* JADX INFO: renamed from: ri */
    private int f10571ri;
    private ValueAnimator xha;

    public C3190di(Context context) {
        super(context);
        this.f10571ri = 100;
    }

    public C3190di(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f10571ri = 100;
    }

    /* JADX INFO: renamed from: ri */
    private void m13327ri() {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 10000);
        this.xha = valueAnimatorOfInt;
        valueAnimatorOfInt.setDuration(2000L);
        this.xha.setRepeatCount(-1);
        this.xha.setInterpolator(new LinearInterpolator());
        this.xha.setRepeatMode(1);
        this.xha.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.core.di.di.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                C3190di.this.setProgress(((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        });
        this.xha.start();
        setMax(10000);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f10565di = true;
        if (this.f10566fi != null) {
            m13327ri();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f10565di = false;
        ValueAnimator valueAnimator = this.xha;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.xha.removeAllUpdateListeners();
            this.xha = null;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i != 0) {
            if (this.xha == null || this.f10570mj) {
                return;
            }
            this.f10570mj = true;
            this.xha.pause();
            return;
        }
        if (this.f10570mj) {
            this.f10570mj = false;
            ValueAnimator valueAnimator = this.xha;
            if (valueAnimator != null) {
                valueAnimator.resume();
            } else {
                m13327ri();
            }
        }
    }

    public void setIndeterminateDrawable(Drawable drawable) {
        this.f10566fi = drawable;
        setProgressDrawable(drawable);
        if (this.f10565di && this.xha == null) {
            m13327ri();
        }
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(jbs.m13330ri(this, layoutParams));
    }

    public void setMax(int i) {
        this.f10571ri = i;
    }

    @Override // android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(i, i2, i3, i4);
    }

    public void setProgress(int i) {
        this.f10569lr = i;
        Drawable drawable = this.f10567ik;
        if (drawable != null) {
            drawable.setLevel((int) ((i * 10000.0f) / this.f10571ri));
        }
    }

    public void setProgressDrawable(Drawable drawable) {
        this.f10568ka = drawable;
        setBackground(drawable);
        Drawable drawable2 = this.f10568ka;
        if (drawable2 instanceof LayerDrawable) {
            int numberOfLayers = ((LayerDrawable) drawable2).getNumberOfLayers();
            for (int i = 0; i < numberOfLayers; i++) {
                Drawable drawable3 = ((LayerDrawable) this.f10568ka).getDrawable(i);
                if ((drawable3 instanceof ScaleDrawable) || (drawable3 instanceof ClipDrawable)) {
                    this.f10567ik = drawable3;
                }
            }
        }
        Drawable drawable4 = this.f10568ka;
        if (drawable4 instanceof RotateDrawable) {
            this.f10567ik = drawable4;
        }
    }
}
