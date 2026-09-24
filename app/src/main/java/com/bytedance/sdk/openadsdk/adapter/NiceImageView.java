package com.bytedance.sdk.openadsdk.adapter;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Xfermode;
import android.os.Build;
import android.util.AttributeSet;
import com.bytedance.sdk.openadsdk.core.p217di.C3193ka;
import com.bytedance.sdk.openadsdk.utils.C3583qd;

/* JADX INFO: loaded from: classes3.dex */
public class NiceImageView extends C3193ka {

    /* JADX INFO: renamed from: ac */
    private RectF f8518ac;

    /* JADX INFO: renamed from: aw */
    private int f8519aw;

    /* JADX INFO: renamed from: ay */
    private Path f8520ay;
    private final Xfermode bgr;

    /* JADX INFO: renamed from: bu */
    private float f8521bu;

    /* JADX INFO: renamed from: co */
    private int f8522co;

    /* JADX INFO: renamed from: di */
    private int f8523di;

    /* JADX INFO: renamed from: fi */
    private int f8524fi;
    private final RectF ihz;

    /* JADX INFO: renamed from: ik */
    private boolean f8525ik;
    private int jbs;

    /* JADX INFO: renamed from: ka */
    private int f8526ka;

    /* JADX INFO: renamed from: lr */
    private boolean f8527lr;

    /* JADX INFO: renamed from: mj */
    private int f8528mj;

    /* JADX INFO: renamed from: nr */
    private final float[] f8529nr;

    /* JADX INFO: renamed from: qt */
    private int f8530qt;

    /* JADX INFO: renamed from: ri */
    private final Context f8531ri;

    /* JADX INFO: renamed from: sf */
    private int f8532sf;
    private int slm;
    private final float[] tan;

    /* JADX INFO: renamed from: uq */
    private final Paint f8533uq;

    /* JADX INFO: renamed from: vr */
    private int f8534vr;
    private final Path wjv;
    private int xha;

    public NiceImageView(Context context) {
        this(context, null);
    }

    public NiceImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NiceImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f8524fi = -1;
        this.xha = -1;
        this.f8531ri = context;
        this.f8528mj = C3583qd.m16589lr(context, 10.0f);
        this.f8529nr = new float[8];
        this.tan = new float[8];
        this.ihz = new RectF();
        this.f8518ac = new RectF();
        this.f8533uq = new Paint();
        this.wjv = new Path();
        if (Build.VERSION.SDK_INT <= 27) {
            this.bgr = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);
        } else {
            this.bgr = new PorterDuffXfermode(PorterDuff.Mode.DST_OUT);
            this.f8520ay = new Path();
        }
        m11055ik();
        m11056ka();
    }

    /* JADX INFO: renamed from: ik */
    private void m11055ik() {
        if (this.f8527lr) {
            return;
        }
        int i = 0;
        if (this.f8528mj <= 0) {
            float[] fArr = this.f8529nr;
            int i2 = this.jbs;
            float f = i2;
            fArr[1] = f;
            fArr[0] = f;
            int i3 = this.f8530qt;
            float f2 = i3;
            fArr[3] = f2;
            fArr[2] = f2;
            int i4 = this.f8522co;
            float f3 = i4;
            fArr[5] = f3;
            fArr[4] = f3;
            int i5 = this.f8532sf;
            float f4 = i5;
            fArr[7] = f4;
            fArr[6] = f4;
            float[] fArr2 = this.tan;
            int i6 = this.f8526ka;
            float f5 = i2 - (i6 / 2.0f);
            fArr2[1] = f5;
            fArr2[0] = f5;
            float f6 = i3 - (i6 / 2.0f);
            fArr2[3] = f6;
            fArr2[2] = f6;
            float f7 = i4 - (i6 / 2.0f);
            fArr2[5] = f7;
            fArr2[4] = f7;
            float f8 = i5 - (i6 / 2.0f);
            fArr2[7] = f8;
            fArr2[6] = f8;
            return;
        }
        while (true) {
            float[] fArr3 = this.f8529nr;
            if (i >= fArr3.length) {
                return;
            }
            int i7 = this.f8528mj;
            fArr3[i] = i7;
            this.tan[i] = i7 - (this.f8526ka / 2.0f);
            i++;
        }
    }

    /* JADX INFO: renamed from: ka */
    private void m11056ka() {
        if (this.f8527lr) {
            return;
        }
        this.f8523di = 0;
    }

    /* JADX INFO: renamed from: lr */
    private void m11057lr() {
        if (!this.f8527lr) {
            this.f8518ac.set(0.0f, 0.0f, this.f8534vr, this.slm);
            if (this.f8525ik) {
                this.f8518ac = this.ihz;
                return;
            }
            return;
        }
        float fMin = Math.min(this.f8534vr, this.slm) / 2.0f;
        this.f8521bu = fMin;
        RectF rectF = this.f8518ac;
        int i = this.f8534vr;
        int i2 = this.slm;
        rectF.set((i / 2.0f) - fMin, (i2 / 2.0f) - fMin, (i / 2.0f) + fMin, (i2 / 2.0f) + fMin);
    }

    /* JADX INFO: renamed from: ri */
    private void m11058ri() {
        if (this.f8527lr) {
            return;
        }
        RectF rectF = this.ihz;
        int i = this.f8526ka;
        rectF.set(i / 2.0f, i / 2.0f, this.f8534vr - (i / 2.0f), this.slm - (i / 2.0f));
    }

    /* JADX INFO: renamed from: ri */
    private void m11059ri(int i, int i2) {
        this.wjv.reset();
        this.f8533uq.setStrokeWidth(i);
        this.f8533uq.setColor(i2);
        this.f8533uq.setStyle(Paint.Style.STROKE);
    }

    /* JADX INFO: renamed from: ri */
    private void m11060ri(Canvas canvas) {
        if (!this.f8527lr) {
            int i = this.f8526ka;
            if (i > 0) {
                m11062ri(canvas, i, this.f8524fi, this.ihz, this.f8529nr);
                return;
            }
            return;
        }
        int i2 = this.f8526ka;
        if (i2 > 0) {
            m11061ri(canvas, i2, this.f8524fi, this.f8521bu - (i2 / 2.0f));
        }
        int i3 = this.f8523di;
        if (i3 > 0) {
            m11061ri(canvas, i3, this.xha, (this.f8521bu - this.f8526ka) - (i3 / 2.0f));
        }
    }

    /* JADX INFO: renamed from: ri */
    private void m11061ri(Canvas canvas, int i, int i2, float f) {
        m11059ri(i, i2);
        this.wjv.addCircle(this.f8534vr / 2.0f, this.slm / 2.0f, f, Path.Direction.CCW);
        canvas.drawPath(this.wjv, this.f8533uq);
    }

    /* JADX INFO: renamed from: ri */
    private void m11062ri(Canvas canvas, int i, int i2, RectF rectF, float[] fArr) {
        m11059ri(i, i2);
        this.wjv.addRoundRect(rectF, fArr, Path.Direction.CCW);
        canvas.drawPath(this.wjv, this.f8533uq);
    }

    /* JADX INFO: renamed from: ri */
    private void m11063ri(boolean z) {
        if (z) {
            this.f8528mj = 0;
        }
        m11055ik();
        m11058ri();
        invalidate();
    }

    public void isCircle(boolean z) {
        this.f8527lr = z;
        m11056ka();
        m11057lr();
        invalidate();
    }

    public void isCoverSrc(boolean z) {
        this.f8525ik = z;
        m11057lr();
        invalidate();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        canvas.saveLayer(this.f8518ac, null, 31);
        if (!this.f8525ik) {
            int i = this.f8534vr;
            int i2 = this.f8526ka;
            int i3 = this.f8523di;
            int i4 = this.slm;
            canvas.scale((((i - (i2 * 2)) - (i3 * 2)) * 1.0f) / i, (((i4 - (i2 * 2)) - (i3 * 2)) * 1.0f) / i4, i / 2.0f, i4 / 2.0f);
        }
        super.onDraw(canvas);
        this.f8533uq.reset();
        this.wjv.reset();
        if (this.f8527lr) {
            this.wjv.addCircle(this.f8534vr / 2.0f, this.slm / 2.0f, this.f8521bu, Path.Direction.CCW);
        } else {
            this.wjv.addRoundRect(this.f8518ac, this.tan, Path.Direction.CCW);
        }
        this.f8533uq.setAntiAlias(true);
        this.f8533uq.setStyle(Paint.Style.FILL);
        this.f8533uq.setXfermode(this.bgr);
        if (Build.VERSION.SDK_INT <= 27) {
            canvas.drawPath(this.wjv, this.f8533uq);
        } else {
            this.f8520ay.addRect(this.f8518ac, Path.Direction.CCW);
            this.f8520ay.op(this.wjv, Path.Op.DIFFERENCE);
            canvas.drawPath(this.f8520ay, this.f8533uq);
        }
        this.f8533uq.setXfermode(null);
        int i5 = this.f8519aw;
        if (i5 != 0) {
            this.f8533uq.setColor(i5);
            canvas.drawPath(this.wjv, this.f8533uq);
        }
        canvas.restore();
        m11060ri(canvas);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f8534vr = i;
        this.slm = i2;
        m11058ri();
        m11057lr();
    }

    public void setBorderColor(int i) {
        this.f8524fi = i;
        invalidate();
    }

    public void setBorderWidth(int i) {
        this.f8526ka = C3583qd.m16589lr(this.f8531ri, i);
        m11063ri(false);
    }

    public void setCornerBottomLeftRadius(int i) {
        this.f8532sf = C3583qd.m16589lr(this.f8531ri, i);
        m11063ri(true);
    }

    public void setCornerBottomRightRadius(int i) {
        this.f8522co = C3583qd.m16589lr(this.f8531ri, i);
        m11063ri(true);
    }

    public void setCornerRadius(int i) {
        this.f8528mj = C3583qd.m16589lr(this.f8531ri, i);
        m11063ri(false);
    }

    public void setCornerTopLeftRadius(int i) {
        this.jbs = C3583qd.m16589lr(this.f8531ri, i);
        m11063ri(true);
    }

    public void setCornerTopRightRadius(int i) {
        this.f8530qt = C3583qd.m16589lr(this.f8531ri, i);
        m11063ri(true);
    }

    public void setInnerBorderColor(int i) {
        this.xha = i;
        invalidate();
    }

    public void setInnerBorderWidth(int i) {
        this.f8523di = C3583qd.m16589lr(this.f8531ri, i);
        m11056ka();
        invalidate();
    }

    public void setMaskColor(int i) {
        this.f8519aw = i;
        invalidate();
    }
}
