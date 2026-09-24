package com.bytedance.sdk.component.adexpress.p113di;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.PathInterpolator;
import androidx.core.view.ViewCompat;

/* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.di.uq */
/* JADX INFO: loaded from: classes3.dex */
public class C2386uq extends View {

    /* JADX INFO: renamed from: ik */
    private static int f6383ik = 50;

    /* JADX INFO: renamed from: ka */
    private ObjectAnimator f6384ka;

    /* JADX INFO: renamed from: lr */
    private int f6385lr;

    /* JADX INFO: renamed from: ri */
    private Paint f6386ri;

    public C2386uq(Context context) {
        this(context, null);
    }

    public C2386uq(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public C2386uq(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6385lr = 10;
        m8270ik();
    }

    /* JADX INFO: renamed from: ik */
    private void m8270ik() {
        Paint paint = new Paint();
        this.f6386ri = paint;
        paint.setAntiAlias(true);
        this.f6386ri.setColor(Color.parseColor("#FFFFFFFF"));
        this.f6386ri.setStyle(Paint.Style.STROKE);
        this.f6386ri.setStrokeWidth(18.0f);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "alpha", 1.0f, 0.0f);
        this.f6384ka = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(200L);
    }

    @Override // android.view.View
    public void invalidate() {
        if (hasWindowFocus()) {
            super.invalidate();
        }
    }

    /* JADX INFO: renamed from: lr */
    public void m8273lr() {
        clearAnimation();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        this.f6386ri.setShader(new LinearGradient(getMeasuredWidth() / 2, 0.0f, getMeasuredWidth() / 2, getMeasuredHeight(), -1, ViewCompat.MEASURED_SIZE_MASK, Shader.TileMode.CLAMP));
        canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, this.f6385lr, this.f6386ri);
    }

    /* JADX INFO: renamed from: ri */
    public void m8274ri() {
        int iMin = ((int) Math.min(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f)) - 18;
        f6383ik = iMin;
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(10, iMin);
        valueAnimatorOfInt.setInterpolator(new PathInterpolator(0.0f, 0.2f, 0.3f, 1.0f));
        valueAnimatorOfInt.setDuration(800L);
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.di.uq.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                C2386uq.this.f6385lr = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                C2386uq.this.invalidate();
            }
        });
        valueAnimatorOfInt.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.di.uq.2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                C2386uq.this.f6384ka.start();
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                C2386uq.this.setVisibility(0);
                C2386uq.this.setAlpha(1.0f);
            }
        });
        valueAnimatorOfInt.start();
    }
}
