package com.bytedance.sdk.component.adexpress.p113di;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.view.animation.LinearInterpolator;

/* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.di.bu */
/* JADX INFO: loaded from: classes3.dex */
public class C2370bu extends View {

    /* JADX INFO: renamed from: di */
    private long f6245di;

    /* JADX INFO: renamed from: fi */
    private Paint f6246fi;

    /* JADX INFO: renamed from: ik */
    private ValueAnimator f6247ik;
    private Animator.AnimatorListener jbs;

    /* JADX INFO: renamed from: ka */
    private ValueAnimator f6248ka;

    /* JADX INFO: renamed from: lr */
    private float f6249lr;

    /* JADX INFO: renamed from: mj */
    private float f6250mj;

    /* JADX INFO: renamed from: qt */
    private int f6251qt;

    /* JADX INFO: renamed from: ri */
    private float f6252ri;
    private float xha;

    public C2370bu(Context context, int i) {
        super(context);
        this.f6245di = 300L;
        this.xha = 0.0f;
        this.f6251qt = i;
        m8208ri();
    }

    /* JADX INFO: renamed from: ik */
    public void m8206ik() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f6250mj, 0.0f);
        this.f6248ka = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(this.f6245di);
        this.f6248ka.setInterpolator(new LinearInterpolator());
        this.f6248ka.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.di.bu.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                C2370bu.this.xha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                C2370bu.this.invalidate();
            }
        });
        Animator.AnimatorListener animatorListener = this.jbs;
        if (animatorListener != null) {
            this.f6248ka.addListener(animatorListener);
        }
        this.f6248ka.start();
    }

    /* JADX INFO: renamed from: lr */
    public void m8207lr() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, this.f6250mj);
        this.f6247ik = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(this.f6245di);
        this.f6247ik.setInterpolator(new LinearInterpolator());
        this.f6247ik.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.di.bu.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                C2370bu.this.xha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                C2370bu.this.invalidate();
            }
        });
        this.f6247ik.start();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawCircle(this.f6252ri, this.f6249lr, this.xha, this.f6246fi);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f6252ri = i / 2.0f;
        this.f6249lr = i2 / 2.0f;
        this.f6250mj = (float) (Math.hypot(i, i2) / 2.0d);
    }

    /* JADX INFO: renamed from: ri */
    public void m8208ri() {
        Paint paint = new Paint(1);
        this.f6246fi = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f6246fi.setColor(this.f6251qt);
    }

    public void setAnimationListener(Animator.AnimatorListener animatorListener) {
        this.jbs = animatorListener;
    }
}
