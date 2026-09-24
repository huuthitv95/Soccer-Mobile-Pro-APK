package com.bytedance.sdk.component.adexpress.p113di;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public class slm extends View {

    /* JADX INFO: renamed from: di */
    private int f6375di;

    /* JADX INFO: renamed from: fi */
    private ValueAnimator f6376fi;

    /* JADX INFO: renamed from: ik */
    private RectF f6377ik;

    /* JADX INFO: renamed from: ka */
    private float f6378ka;

    /* JADX INFO: renamed from: lr */
    private Paint f6379lr;

    /* JADX INFO: renamed from: ri */
    private Context f6380ri;
    private boolean xha;

    public slm(Context context) {
        super(context);
        this.f6375di = 1500;
        this.f6380ri = context;
        Paint paint = new Paint();
        this.f6379lr = paint;
        paint.setAntiAlias(true);
        this.f6379lr.setStyle(Paint.Style.STROKE);
        this.f6379lr.setStrokeWidth(10.0f);
        this.f6379lr.setColor(Color.parseColor("#80FFFFFF"));
        this.f6377ik = new RectF();
    }

    /* JADX INFO: renamed from: ik */
    public void m8267ik() {
        this.xha = true;
        invalidate();
    }

    /* JADX INFO: renamed from: lr */
    public void m8268lr() {
        ValueAnimator valueAnimator = this.f6376fi;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.xha) {
            return;
        }
        canvas.drawArc(this.f6377ik, 270.0f, this.f6378ka, false, this.f6379lr);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        setMeasuredDimension(Math.min(size, size2), Math.min(size, size2));
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f6377ik.set(5.0f, 5.0f, i - 5, i2 - 5);
    }

    /* JADX INFO: renamed from: ri */
    public void m8269ri() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 360.0f);
        this.f6376fi = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(this.f6375di);
        this.f6376fi.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.di.slm.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                slm.this.f6378ka = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                slm.this.requestLayout();
            }
        });
        this.f6376fi.start();
    }

    public void setDuration(int i) {
        this.f6375di = i;
    }
}
