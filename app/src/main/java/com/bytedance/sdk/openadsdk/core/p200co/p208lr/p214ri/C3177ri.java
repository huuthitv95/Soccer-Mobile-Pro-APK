package com.bytedance.sdk.openadsdk.core.p200co.p208lr.p214ri;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.bytedance.adsdk.ugeno.jbs.p095di.C2271ri;
import com.facebook.internal.security.CertificateUtil;
import com.google.android.material.timepicker.TimeModel;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.co.lr.ri.ri */
/* JADX INFO: loaded from: classes3.dex */
class C3177ri extends View {

    /* JADX INFO: renamed from: ac */
    private ValueAnimator[] f10457ac;

    /* JADX INFO: renamed from: aw */
    private Matrix f10458aw;

    /* JADX INFO: renamed from: ay */
    private final RectF f10459ay;
    private String[] bgr;
    private lr[] bnj;

    /* JADX INFO: renamed from: bu */
    private boolean[] f10460bu;

    /* JADX INFO: renamed from: co */
    private Camera f10461co;

    /* JADX INFO: renamed from: di */
    private float f10462di;

    /* JADX INFO: renamed from: dw */
    private final Path f10463dw;
    private Paint dzy;

    /* JADX INFO: renamed from: fe */
    private float f10464fe;
    private float feb;

    /* JADX INFO: renamed from: fi */
    private int f10465fi;

    /* JADX INFO: renamed from: fr */
    private final RectF f10466fr;
    private final Path hcw;

    /* JADX INFO: renamed from: ig */
    private int f10467ig;
    private final RectF igq;
    private float[] ihz;

    /* JADX INFO: renamed from: ik */
    private int f10468ik;
    private C2271ri jbs;

    /* JADX INFO: renamed from: jc */
    private int f10469jc;

    /* JADX INFO: renamed from: ka */
    private int f10470ka;

    /* JADX INFO: renamed from: kt */
    private float f10471kt;

    /* JADX INFO: renamed from: lr */
    private int f10472lr;

    /* JADX INFO: renamed from: mj */
    private Paint f10473mj;

    /* JADX INFO: renamed from: nr */
    private boolean[] f10474nr;

    /* JADX INFO: renamed from: oh */
    private final float[] f10475oh;
    private final Path ory;

    /* JADX INFO: renamed from: pv */
    private long f10476pv;

    /* JADX INFO: renamed from: qd */
    private int f10477qd;

    /* JADX INFO: renamed from: qt */
    private Handler f10478qt;

    /* JADX INFO: renamed from: ri */
    private int f10479ri;

    /* JADX INFO: renamed from: sf */
    private String[] f10480sf;
    private ri[] siy;
    private float[] slm;
    private int srn;

    /* JADX INFO: renamed from: su */
    private final RectF f10481su;

    /* JADX INFO: renamed from: ta */
    private float f10482ta;
    private ValueAnimator[] tan;
    private float tnn;

    /* JADX INFO: renamed from: uq */
    private float[] f10483uq;

    /* JADX INFO: renamed from: vr */
    private float[] f10484vr;
    private final Runnable whw;
    private final AccelerateDecelerateInterpolator wjv;

    /* JADX INFO: renamed from: xd */
    private final float[] f10485xd;
    private C3176lr xha;

    /* JADX INFO: renamed from: zf */
    private final Path f10486zf;
    private float zyn;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.co.lr.ri.ri$lr */
    private static class lr implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: lr */
        private final C3177ri f10488lr;

        /* JADX INFO: renamed from: ri */
        private final int f10489ri;

        public lr(C3177ri c3177ri, int i) {
            this.f10488lr = c3177ri;
            this.f10489ri = i;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f10488lr.f10460bu[this.f10489ri] = false;
            this.f10488lr.f10457ac[this.f10489ri].start();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.co.lr.ri.ri$ri */
    private static class ri implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: lr */
        private final C3177ri f10490lr;

        /* JADX INFO: renamed from: ri */
        private final int f10491ri;

        public ri(C3177ri c3177ri, int i) {
            this.f10490lr = c3177ri;
            this.f10491ri = i;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f10490lr.f10474nr[this.f10491ri] = false;
            this.f10490lr.f10480sf[this.f10491ri] = this.f10490lr.bgr[this.f10491ri];
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    public C3177ri(Context context) {
        super(context);
        this.f10478qt = new Handler(Looper.getMainLooper());
        this.f10480sf = new String[3];
        this.f10461co = new Camera();
        this.f10458aw = new Matrix();
        this.bgr = new String[3];
        this.f10484vr = new float[3];
        this.slm = new float[3];
        this.f10460bu = new boolean[3];
        this.f10474nr = new boolean[3];
        this.tan = new ValueAnimator[3];
        this.f10457ac = new ValueAnimator[3];
        this.ihz = new float[3];
        this.f10483uq = new float[3];
        this.wjv = new AccelerateDecelerateInterpolator();
        this.f10459ay = new RectF();
        this.f10466fr = new RectF();
        this.f10481su = new RectF();
        this.igq = new RectF();
        this.f10486zf = new Path();
        this.f10463dw = new Path();
        this.ory = new Path();
        this.hcw = new Path();
        this.f10475oh = new float[8];
        this.f10485xd = new float[8];
        this.f10476pv = 0L;
        this.whw = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.co.lr.ri.ri.1
            @Override // java.lang.Runnable
            public void run() {
                C3177ri.m13249ri(C3177ri.this);
                C3177ri.this.invalidate();
                if (C3177ri.this.f10479ri > 0) {
                    C3177ri.this.f10478qt.postDelayed(this, 1000L);
                } else {
                    C3177ri.this.f10478qt.removeCallbacks(this);
                    C3177ri.this.m13255lr();
                }
            }
        };
        m13244ka();
        m13240fi();
        m13243ik();
    }

    /* JADX INFO: renamed from: fi */
    private void m13240fi() {
        if (this.jbs == null) {
            C2271ri c2271ri = new C2271ri(getContext());
            this.jbs = c2271ri;
            this.dzy = c2271ri.getPaint();
        }
    }

    /* JADX INFO: renamed from: ik */
    private void m13243ik() {
        this.bnj = new lr[3];
        this.siy = new ri[3];
        for (int i = 0; i < 3; i++) {
            this.bnj[i] = new lr(this, i);
            this.siy[i] = new ri(this, i);
        }
    }

    /* JADX INFO: renamed from: ka */
    private void m13244ka() {
        Paint paint = new Paint();
        this.f10473mj = paint;
        paint.setColor(this.f10472lr);
        this.f10473mj.setAntiAlias(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: lr */
    public /* synthetic */ void m13247lr(int i, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f10484vr[i] = fFloatValue;
        this.ihz[i] = 1.0f - (fFloatValue / (-90.0f));
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.f10476pv >= 16) {
            invalidate();
            this.f10476pv = jCurrentTimeMillis;
        }
    }

    /* JADX INFO: renamed from: ri */
    static /* synthetic */ int m13249ri(C3177ri c3177ri) {
        int i = c3177ri.f10479ri;
        c3177ri.f10479ri = i - 1;
        return i;
    }

    /* JADX INFO: renamed from: ri */
    private void m13250ri(int i, int i2, int i3) {
        String str = this.f10480sf[0];
        String str2 = String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Integer.valueOf(i));
        if (!str2.equals(str) && !this.f10460bu[0] && !this.f10474nr[0] && str != null) {
            m13252ri(0, str, str2);
        }
        String str3 = this.f10480sf[1];
        String str4 = String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Integer.valueOf(i2));
        if (!str4.equals(str3) && !this.f10460bu[1] && !this.f10474nr[1] && str3 != null) {
            m13252ri(1, str3, str4);
        }
        String str5 = this.f10480sf[2];
        String str6 = String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Integer.valueOf(i3));
        if (!str6.equals(str5) && !this.f10460bu[2] && !this.f10474nr[2] && str5 != null) {
            m13252ri(2, str5, str6);
        }
        String[] strArr = this.f10480sf;
        if (strArr[0] == null) {
            strArr[0] = str2;
        }
        if (strArr[1] == null) {
            strArr[1] = str4;
        }
        if (strArr[2] == null) {
            strArr[2] = str6;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ri */
    public /* synthetic */ void m13251ri(int i, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.slm[i] = fFloatValue;
        this.f10483uq[i] = (fFloatValue + 90.0f) / 90.0f;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.f10476pv >= 16) {
            invalidate();
            this.f10476pv = jCurrentTimeMillis;
        }
    }

    /* JADX INFO: renamed from: ri */
    private void m13252ri(final int i, String str, String str2) {
        this.f10480sf[i] = str;
        this.bgr[i] = str2;
        this.f10460bu[i] = true;
        this.f10474nr[i] = true;
        this.f10484vr[i] = 0.0f;
        this.slm[i] = 90.0f;
        this.ihz[i] = 1.0f;
        this.f10483uq[i] = 0.0f;
        ValueAnimator[] valueAnimatorArr = this.tan;
        ValueAnimator valueAnimator = valueAnimatorArr[i];
        if (valueAnimator == null) {
            valueAnimatorArr[i] = ValueAnimator.ofFloat(0.0f, -90.0f);
            this.tan[i].setDuration(250L);
            this.tan[i].setInterpolator(this.wjv);
            this.tan[i].addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.core.co.lr.ri.ri$$ExternalSyntheticLambda0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    this.f$0.m13247lr(i, valueAnimator2);
                }
            });
            this.tan[i].addListener(this.bnj[i]);
        } else {
            valueAnimator.setFloatValues(0.0f, -90.0f);
        }
        ValueAnimator[] valueAnimatorArr2 = this.f10457ac;
        ValueAnimator valueAnimator2 = valueAnimatorArr2[i];
        if (valueAnimator2 == null) {
            valueAnimatorArr2[i] = ValueAnimator.ofFloat(-90.0f, 0.0f);
            this.f10457ac[i].setDuration(250L);
            this.f10457ac[i].setInterpolator(this.wjv);
            this.f10457ac[i].addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.core.co.lr.ri.ri$$ExternalSyntheticLambda1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                    this.f$0.m13251ri(i, valueAnimator3);
                }
            });
            this.f10457ac[i].addListener(this.siy[i]);
        } else {
            valueAnimator2.setFloatValues(-90.0f, 0.0f);
        }
        if (this.tan[i].isRunning()) {
            this.tan[i].cancel();
        }
        if (this.f10457ac[i].isRunning()) {
            this.f10457ac[i].cancel();
        }
        this.tan[i].start();
    }

    /* JADX INFO: renamed from: ri */
    private void m13253ri(Canvas canvas, float f, float f2) {
        canvas.drawText(CertificateUtil.DELIMITER, f, f2 - ((this.dzy.descent() + this.dzy.ascent()) / 2.0f), this.dzy);
    }

    /* JADX INFO: renamed from: ri */
    private void m13254ri(Canvas canvas, float f, float f2, float f3, float f4, String str, int i) {
        this.f10466fr.set(f, f2, f3 + f, f4 + f2);
        float fCenterY = this.f10466fr.centerY();
        float fCenterY2 = this.f10466fr.centerY() - ((this.jbs.getPaint().descent() + this.jbs.getPaint().ascent()) / 2.0f);
        this.f10481su.set(this.f10466fr.left, this.f10466fr.top, this.f10466fr.right, fCenterY);
        this.f10486zf.reset();
        this.f10486zf.addRoundRect(this.f10481su, this.f10475oh, Path.Direction.CW);
        this.f10473mj.setColor(this.f10472lr);
        canvas.drawPath(this.f10486zf, this.f10473mj);
        this.dzy.setTextAlign(Paint.Align.CENTER);
        canvas.drawText(str, this.f10466fr.centerX(), fCenterY2, this.dzy);
        this.igq.set(this.f10466fr.left, fCenterY, this.f10466fr.right, this.f10466fr.bottom);
        this.f10463dw.reset();
        this.f10463dw.addRoundRect(this.igq, this.f10485xd, Path.Direction.CW);
        this.f10473mj.setColor(this.f10468ik);
        canvas.drawPath(this.f10463dw, this.f10473mj);
        canvas.drawText(str, this.f10466fr.centerX(), fCenterY2, this.jbs.getPaint());
        boolean z = this.f10460bu[i];
        if (z || this.f10474nr[i]) {
            if (z) {
                canvas.save();
                this.f10458aw.reset();
                this.f10461co.save();
                this.f10461co.rotateX(this.f10484vr[i]);
                this.f10461co.getMatrix(this.f10458aw);
                this.f10458aw.preTranslate(-this.f10466fr.centerX(), -fCenterY);
                this.f10458aw.postTranslate(this.f10466fr.centerX(), fCenterY);
                canvas.concat(this.f10458aw);
                this.ory.reset();
                this.ory.addRoundRect(this.f10481su, this.f10475oh, Path.Direction.CW);
                this.f10473mj.setColor(this.f10472lr);
                canvas.drawPath(this.ory, this.f10473mj);
                int alpha = this.dzy.getAlpha();
                this.dzy.setAlpha((int) (this.ihz[i] * 255.0f));
                canvas.drawText(this.f10480sf[i], this.f10466fr.centerX(), fCenterY2, this.dzy);
                this.dzy.setAlpha(alpha);
                this.f10461co.restore();
                canvas.restore();
            }
            if (this.f10474nr[i]) {
                canvas.save();
                this.f10458aw.reset();
                this.f10461co.save();
                this.f10461co.rotateX(this.slm[i]);
                this.f10461co.getMatrix(this.f10458aw);
                this.f10458aw.preTranslate(-this.f10466fr.centerX(), -fCenterY);
                this.f10458aw.postTranslate(this.f10466fr.centerX(), fCenterY);
                canvas.concat(this.f10458aw);
                this.hcw.reset();
                this.hcw.addRoundRect(this.igq, this.f10485xd, Path.Direction.CW);
                this.f10473mj.setColor(this.f10468ik);
                canvas.drawPath(this.hcw, this.f10473mj);
                int alpha2 = this.dzy.getAlpha();
                this.dzy.setAlpha((int) (this.f10483uq[i] * 255.0f));
                canvas.drawText(this.bgr[i], this.f10466fr.centerX(), fCenterY2, this.dzy);
                this.dzy.setAlpha(alpha2);
                this.f10461co.restore();
                canvas.restore();
            }
        }
    }

    /* JADX INFO: renamed from: lr */
    public void m13255lr() {
        for (int i = 0; i < 3; i++) {
            ValueAnimator valueAnimator = this.tan[i];
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.tan[i].cancel();
            }
            ValueAnimator valueAnimator2 = this.f10457ac[i];
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.f10457ac[i].cancel();
            }
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f10470ka <= 0 || this.f10465fi <= 0) {
            return;
        }
        this.f10459ay.set((getWidth() - this.f10470ka) / 2.0f, (getHeight() - this.f10465fi) / 2.0f, (getWidth() + this.f10470ka) / 2.0f, (getHeight() + this.f10465fi) / 2.0f);
        RectF rectF = this.f10459ay;
        float f = this.f10462di;
        canvas.drawRoundRect(rectF, f, f, this.f10473mj);
        int i = this.f10479ri;
        this.f10467ig = i / 3600;
        int i2 = i % 3600;
        this.f10477qd = i2;
        this.srn = i2 / 60;
        this.f10469jc = i2 % 60;
        this.f10471kt = this.f10470ka;
        this.feb = this.f10465fi;
        float width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        this.zyn = width;
        float f2 = this.f10471kt * 3.0f;
        this.tnn = f2;
        float f3 = width - f2;
        this.f10464fe = f3;
        this.f10482ta = f3 > 0.0f ? f3 / 2.0f : 10.0f;
        m13250ri(this.f10467ig, this.srn, this.f10469jc);
        float paddingLeft = getPaddingLeft();
        float fCenterY = this.f10459ay.centerY();
        float f4 = this.feb;
        m13254ri(canvas, paddingLeft, fCenterY - (f4 / 2.0f), this.f10471kt, f4, String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Integer.valueOf(this.f10467ig)), 0);
        float paddingLeft2 = this.f10482ta + getPaddingLeft() + this.f10471kt;
        float fCenterY2 = this.f10459ay.centerY();
        float f5 = this.feb;
        m13254ri(canvas, paddingLeft2, fCenterY2 - (f5 / 2.0f), this.f10471kt, f5, String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Integer.valueOf(this.srn)), 1);
        float paddingLeft3 = ((this.f10471kt + this.f10482ta) * 2.0f) + getPaddingLeft();
        float fCenterY3 = this.f10459ay.centerY();
        float f6 = this.feb;
        m13254ri(canvas, paddingLeft3, fCenterY3 - (f6 / 2.0f), this.f10471kt, f6, String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Integer.valueOf(this.f10469jc)), 2);
        m13253ri(canvas, getPaddingLeft() + this.f10471kt + (this.f10482ta / 2.0f), this.f10459ay.centerY());
        m13253ri(canvas, getPaddingLeft() + (this.f10471kt * 2.0f) + ((this.f10482ta * 3.0f) / 2.0f), this.f10459ay.centerY());
        C3176lr c3176lr = this.xha;
        if (c3176lr != null) {
            c3176lr.mo7738ri(canvas);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        C3176lr c3176lr = this.xha;
        if (c3176lr == null) {
            super.onMeasure(i, i2);
            return;
        }
        int[] iArrRi = c3176lr.mo7740ri(i, i2);
        if (this.f10465fi > 0) {
            int mode = View.MeasureSpec.getMode(iArrRi[1]);
            int size = View.MeasureSpec.getSize(iArrRi[1]);
            if (mode == 0 || size > this.f10465fi) {
                iArrRi[1] = View.MeasureSpec.makeMeasureSpec(this.f10465fi, 1073741824);
            }
        }
        super.onMeasure(iArrRi[0], iArrRi[1]);
    }

    /* JADX INFO: renamed from: ri */
    public C2271ri m13256ri() {
        return this.jbs;
    }

    /* JADX INFO: renamed from: ri */
    public void m13257ri(int i, int i2, int i3, int i4, int i5, float f) {
        int iMin = Math.min(i, 360060);
        this.f10472lr = i2;
        this.f10468ik = i3;
        this.f10470ka = i4;
        this.f10465fi = i5;
        this.f10462di = f;
        this.f10479ri = iMin;
        this.f10478qt.post(this.whw);
        Paint paint = this.f10473mj;
        if (paint != null) {
            paint.setColor(this.f10472lr);
        }
        float[] fArr = this.f10475oh;
        float f2 = this.f10462di;
        fArr[3] = f2;
        fArr[2] = f2;
        fArr[1] = f2;
        fArr[0] = f2;
        fArr[7] = 0.0f;
        fArr[6] = 0.0f;
        fArr[5] = 0.0f;
        fArr[4] = 0.0f;
        float[] fArr2 = this.f10485xd;
        fArr2[3] = 0.0f;
        fArr2[2] = 0.0f;
        fArr2[1] = 0.0f;
        fArr2[0] = 0.0f;
        fArr2[7] = f2;
        fArr2[6] = f2;
        fArr2[5] = f2;
        fArr2[4] = f2;
        invalidate();
    }

    /* JADX INFO: renamed from: ri */
    public void m13258ri(C2271ri c2271ri) {
        this.jbs = c2271ri;
    }

    /* JADX INFO: renamed from: ri */
    public void m13259ri(C3176lr c3176lr) {
        this.xha = c3176lr;
    }
}
