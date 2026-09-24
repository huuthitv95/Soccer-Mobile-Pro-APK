package com.bytedance.sdk.openadsdk.core.p200co.p208lr.p212ka;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.bytedance.adsdk.ugeno.InterfaceC2282ka;
import com.bytedance.adsdk.ugeno.xha.C2348ri;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.co.lr.ka.ri */
/* JADX INFO: loaded from: classes3.dex */
public class C3171ri extends View {

    /* JADX INFO: renamed from: aw */
    private int f10427aw;
    private float bgr;

    /* JADX INFO: renamed from: co */
    private ValueAnimator f10428co;

    /* JADX INFO: renamed from: di */
    private float f10429di;

    /* JADX INFO: renamed from: fi */
    private int f10430fi;

    /* JADX INFO: renamed from: ik */
    private RectF f10431ik;
    private int jbs;

    /* JADX INFO: renamed from: ka */
    private int f10432ka;

    /* JADX INFO: renamed from: lr */
    private Paint f10433lr;

    /* JADX INFO: renamed from: mj */
    private int f10434mj;

    /* JADX INFO: renamed from: qt */
    private String f10435qt;

    /* JADX INFO: renamed from: ri */
    private Paint f10436ri;

    /* JADX INFO: renamed from: sf */
    private InterfaceC2282ka f10437sf;
    private float xha;

    public C3171ri(Context context) {
        super(context);
        this.f10432ka = C2348ri.m8053ri("#FFD813");
        this.f10430fi = C2348ri.m8053ri("rgba(0, 0, 0, 0.5)");
        this.f10429di = 3.0f;
        this.xha = 0.0f;
        this.f10434mj = 0;
        this.jbs = 100;
        this.f10435qt = "line";
        this.f10427aw = 1000;
        setBackgroundColor(0);
        m13217ri();
    }

    /* JADX INFO: renamed from: lr */
    private void m13215lr(Canvas canvas) {
        this.f10436ri.setStyle(Paint.Style.FILL);
        float width = getWidth();
        float f = this.f10429di;
        float f2 = this.xha;
        canvas.drawRoundRect(0.0f, 0.0f, width, f, f2, f2, this.f10436ri);
        float width2 = (getWidth() * this.bgr) / this.jbs;
        this.f10433lr.setStyle(Paint.Style.FILL);
        if (!TextUtils.equals(this.f10435qt, "line_reverse")) {
            float f3 = this.f10429di;
            float f4 = this.xha;
            canvas.drawRoundRect(0.0f, 0.0f, width2, f3, f4, f4, this.f10433lr);
        } else {
            float width3 = getWidth() - width2;
            float width4 = getWidth();
            float f5 = this.f10429di;
            float f6 = this.xha;
            canvas.drawRoundRect(width3, 0.0f, width4, f5, f6, f6, this.f10433lr);
        }
    }

    /* JADX INFO: renamed from: ri */
    private void m13217ri() {
        Paint paint = new Paint(1);
        this.f10436ri = paint;
        paint.setColor(this.f10430fi);
        this.f10436ri.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint(1);
        this.f10433lr = paint2;
        paint2.setColor(this.f10432ka);
        this.f10433lr.setStyle(Paint.Style.FILL);
        this.f10431ik = new RectF();
        this.bgr = this.f10434mj;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(new float[0]);
        this.f10428co = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(this.f10427aw);
        this.f10428co.setInterpolator(new LinearInterpolator());
        this.f10428co.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.core.co.lr.ka.ri.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                C3171ri.this.bgr = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                C3171ri.this.invalidate();
            }
        });
    }

    /* JADX INFO: renamed from: ri */
    private void m13218ri(Canvas canvas) {
        float f;
        int i;
        float f2 = this.f10429di / 2.0f;
        this.f10431ik.set(f2, f2, getWidth() - f2, getHeight() - f2);
        this.f10436ri.setStyle(Paint.Style.STROKE);
        this.f10436ri.setStrokeWidth(this.f10429di);
        canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, (getWidth() / 2.0f) - f2, this.f10436ri);
        if (TextUtils.equals(this.f10435qt, "ring_reverse")) {
            f = this.bgr * (-360.0f);
            i = this.jbs;
        } else {
            f = this.bgr * 360.0f;
            i = this.jbs;
        }
        float f3 = f / i;
        this.f10433lr.setStyle(Paint.Style.STROKE);
        this.f10433lr.setStrokeWidth(this.f10429di);
        if (this.xha <= 0.0f) {
            this.f10433lr.setStrokeCap(Paint.Cap.SQUARE);
        } else {
            this.f10433lr.setStrokeCap(Paint.Cap.ROUND);
        }
        canvas.drawArc(this.f10431ik, -90.0f, f3, false, this.f10433lr);
    }

    public int getMaxProgress() {
        return this.jbs;
    }

    public int getProgress() {
        return this.f10434mj;
    }

    /* JADX INFO: renamed from: lr */
    public C3171ri m13219lr(float f) {
        this.xha = f;
        return this;
    }

    /* JADX INFO: renamed from: lr */
    public C3171ri m13220lr(int i) {
        this.f10436ri.setColor(i);
        return this;
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.f10428co;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (TextUtils.equals(this.f10435qt, "ring") || TextUtils.equals(this.f10435qt, "ring_reverse")) {
            m13218ri(canvas);
        } else {
            m13215lr(canvas);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        InterfaceC2282ka interfaceC2282ka = this.f10437sf;
        if (interfaceC2282ka != null) {
            int[] iArrMo7740ri = interfaceC2282ka.mo7740ri(i, i2);
            super.onMeasure(iArrMo7740ri[0], iArrMo7740ri[1]);
        } else {
            super.onMeasure(i, i2);
        }
        if (TextUtils.equals(this.f10435qt, "ring") || TextUtils.equals(this.f10435qt, "ring_reverse")) {
            int iMin = Math.min(getMeasuredWidth(), getMeasuredHeight());
            setMeasuredDimension(iMin, iMin);
        } else {
            setMeasuredDimension(getMeasuredWidth(), (int) this.f10429di);
        }
        InterfaceC2282ka interfaceC2282ka2 = this.f10437sf;
        if (interfaceC2282ka2 != null) {
            interfaceC2282ka2.mo7734fi();
        }
    }

    /* JADX INFO: renamed from: ri */
    public C3171ri m13221ri(float f) {
        this.f10429di = f;
        invalidate();
        return this;
    }

    /* JADX INFO: renamed from: ri */
    public C3171ri m13222ri(int i) {
        this.f10433lr.setColor(i);
        return this;
    }

    /* JADX INFO: renamed from: ri */
    public C3171ri m13223ri(String str) {
        this.f10435qt = str;
        return this;
    }

    /* JADX INFO: renamed from: ri */
    public void m13224ri(InterfaceC2282ka interfaceC2282ka) {
        this.f10437sf = interfaceC2282ka;
    }

    public void setAnimationDuration(int i) {
        this.f10427aw = i;
        this.f10428co.setDuration(i);
    }

    public void setMaxProgress(int i) {
        this.jbs = i;
        invalidate();
    }

    public void setProgress(int i) {
        int iMin = Math.min(i, this.jbs);
        this.f10434mj = iMin;
        if (iMin < 0) {
            this.f10434mj = 0;
        }
        ValueAnimator valueAnimator = this.f10428co;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f10428co.setFloatValues(this.bgr, this.f10434mj);
            Log.d("UGenRender", "setProgress: animatedProgress=" + this.bgr + " progress=" + i);
            this.f10428co.start();
        }
    }
}
