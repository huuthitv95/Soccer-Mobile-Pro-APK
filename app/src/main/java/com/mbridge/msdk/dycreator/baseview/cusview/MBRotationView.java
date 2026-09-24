package com.mbridge.msdk.dycreator.baseview.cusview;

import android.content.Context;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes5.dex */
public class MBRotationView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    private Camera f35015a;

    /* JADX INFO: renamed from: b */
    private Matrix f35016b;

    /* JADX INFO: renamed from: c */
    private int f35017c;

    /* JADX INFO: renamed from: d */
    private int f35018d;

    /* JADX INFO: renamed from: e */
    private int f35019e;

    /* JADX INFO: renamed from: f */
    private int f35020f;

    /* JADX INFO: renamed from: g */
    private int f35021g;

    /* JADX INFO: renamed from: h */
    private int f35022h;

    /* JADX INFO: renamed from: i */
    private int f35023i;

    /* JADX INFO: renamed from: j */
    private int f35024j;

    /* JADX INFO: renamed from: k */
    private float f35025k;

    /* JADX INFO: renamed from: l */
    private float f35026l;

    /* JADX INFO: renamed from: m */
    private boolean f35027m;

    /* JADX INFO: renamed from: n */
    private boolean f35028n;

    /* JADX INFO: renamed from: o */
    private boolean f35029o;

    /* JADX INFO: renamed from: p */
    Runnable f35030p;

    public MBRotationView(Context context) {
        super(context);
        this.f35019e = 40;
        this.f35020f = 20;
        this.f35021g = 0;
        this.f35022h = 0;
        this.f35024j = 0;
        this.f35025k = 0.5f;
        this.f35026l = 0.9f;
        this.f35027m = true;
        this.f35028n = false;
        this.f35029o = false;
        this.f35030p = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBRotationView.1
            @Override // java.lang.Runnable
            public void run() {
                MBRotationView.this.m36235b();
            }
        };
        m36229a();
    }

    /* JADX INFO: renamed from: b */
    private void m36238b(Canvas canvas) {
        int height = getHeight() / 2;
        int i = ((this.f35021g * this.f35017c) / 2) / this.f35019e;
        m36233a(canvas, i, height, 0);
        m36233a(canvas, i, height, 1);
        if (Math.abs(this.f35021g) > this.f35019e / 2) {
            m36233a(canvas, i, height, 3);
            m36233a(canvas, i, height, 2);
        } else {
            m36233a(canvas, i, height, 2);
            m36233a(canvas, i, height, 3);
        }
    }

    /* JADX INFO: renamed from: c */
    private int m36240c(int i) {
        int i2;
        int i3;
        int i4;
        if (i == 0) {
            i2 = this.f35029o ? this.f35022h - 2 : this.f35022h + 2;
        } else if (i != 1) {
            if (i != 2) {
                i2 = i != 3 ? 0 : this.f35022h;
            } else if (this.f35029o) {
                i3 = this.f35022h;
                i2 = i3 - 1;
            } else {
                i4 = this.f35022h;
                i2 = i4 + 1;
            }
        } else if (this.f35029o) {
            i4 = this.f35022h;
            i2 = i4 + 1;
        } else {
            i3 = this.f35022h;
            i2 = i3 - 1;
        }
        int childCount = i2 % getChildCount();
        return childCount >= 0 ? childCount : childCount + getChildCount();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        if (getChildCount() == 0) {
            return;
        }
        if (this.f35028n) {
            m36238b(canvas);
        } else {
            m36232a(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        float f = i5;
        float f2 = this.f35025k;
        int i6 = (int) (((1.0f - f2) * f) / 2.0f);
        int i7 = i4 - i2;
        float f3 = i7;
        float f4 = this.f35026l;
        int i8 = (int) (((1.0f - f4) * f3) / 2.0f);
        this.f35017c = (int) (f3 * f4);
        this.f35018d = (int) (f * f2);
        int childCount = getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            childAt.layout(i6, i8, i5 - i6, i7 - i8);
            childAt.setClickable(true);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            int i10 = layoutParams.width;
            int i11 = this.f35018d;
            if (i10 != i11) {
                layoutParams.width = i11;
                layoutParams.height = this.f35017c;
                childAt.setLayoutParams(layoutParams);
            }
        }
    }

    public void setAutoscroll(boolean z) {
        if (z) {
            postDelayed(this.f35030p, 1000 / this.f35020f);
        }
        this.f35027m = z;
    }

    public void setHeightRatio(float f) {
        this.f35026l = f;
    }

    public void setRotateV(boolean z) {
        this.f35028n = z;
        invalidate();
    }

    public void setWidthRatio(float f) {
        this.f35025k = f;
    }

    /* JADX INFO: renamed from: a */
    private void m36229a() {
        this.f35015a = new Camera();
        this.f35016b = new Matrix();
        setWillNotDraw(false);
    }

    /* JADX INFO: renamed from: a */
    private void m36232a(Canvas canvas) {
        int width = getWidth() / 2;
        int i = ((this.f35021g * this.f35018d) / 2) / this.f35019e;
        m36239b(canvas, i, width, 0);
        m36239b(canvas, i, width, 1);
        if (Math.abs(this.f35021g) > this.f35019e / 2) {
            m36239b(canvas, i, width, 3);
            m36239b(canvas, i, width, 2);
        } else {
            m36239b(canvas, i, width, 2);
            m36239b(canvas, i, width, 3);
        }
    }

    /* JADX INFO: renamed from: b */
    private void m36237b(int i, int i2, int i3) {
        float f = (-i) / 2.0f;
        if (i3 == 0) {
            this.f35015a.translate(0.0f, f, 0.0f);
            float f2 = -i2;
            this.f35015a.rotateX(f2);
            this.f35015a.translate(0.0f, f, 0.0f);
            this.f35015a.translate(0.0f, f, 0.0f);
            this.f35015a.rotateX(f2);
            this.f35015a.translate(0.0f, f, 0.0f);
            return;
        }
        if (i3 == 1) {
            this.f35015a.translate(0.0f, f, 0.0f);
            this.f35015a.rotateX(i2);
            this.f35015a.translate(0.0f, f, 0.0f);
        } else if (i3 != 2) {
            if (i3 != 3) {
                return;
            }
            this.f35015a.rotateX(0.0f);
        } else {
            this.f35015a.translate(0.0f, f, 0.0f);
            this.f35015a.rotateX(-i2);
            this.f35015a.translate(0.0f, f, 0.0f);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m36233a(Canvas canvas, int i, int i2, int i3) {
        canvas.save();
        this.f35015a.save();
        this.f35016b.reset();
        float f = i;
        this.f35015a.translate(0.0f, f, 0.0f);
        this.f35015a.rotateX(this.f35021g);
        this.f35015a.translate(0.0f, f, 0.0f);
        if (i == 0) {
            if (this.f35029o) {
                m36237b(this.f35017c, this.f35019e, i3);
            } else {
                m36237b(-this.f35017c, -this.f35019e, i3);
            }
        } else if (i > 0) {
            m36237b(this.f35017c, this.f35019e, i3);
        } else if (i < 0) {
            m36237b(-this.f35017c, -this.f35019e, i3);
        }
        this.f35015a.getMatrix(this.f35016b);
        this.f35015a.restore();
        this.f35016b.preTranslate((-getWidth()) / 2, -i2);
        this.f35016b.postTranslate(getWidth() / 2, i2);
        canvas.concat(this.f35016b);
        View childAt = getChildAt(m36240c(i3));
        if (childAt != null) {
            drawChild(canvas, childAt, 0L);
        }
        canvas.restore();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public void m36235b() {
        if (getChildCount() == 0) {
            return;
        }
        int i = this.f35021g - 1;
        this.f35021g = i;
        this.f35023i = this.f35022h;
        m36230a(i);
        if (this.f35027m) {
            postDelayed(this.f35030p, 1000 / this.f35020f);
        }
    }

    /* JADX INFO: renamed from: b */
    private void m36239b(Canvas canvas, int i, int i2, int i3) {
        canvas.save();
        this.f35015a.save();
        this.f35016b.reset();
        float f = i;
        this.f35015a.translate(f, 0.0f, 0.0f);
        this.f35015a.rotateY(this.f35021g);
        this.f35015a.translate(f, 0.0f, 0.0f);
        if (i == 0) {
            if (this.f35029o) {
                m36231a(this.f35018d, this.f35019e, i3);
            } else {
                m36231a(-this.f35018d, -this.f35019e, i3);
            }
        } else if (i > 0) {
            m36231a(this.f35018d, this.f35019e, i3);
        } else if (i < 0) {
            m36231a(-this.f35018d, -this.f35019e, i3);
        }
        this.f35015a.getMatrix(this.f35016b);
        this.f35015a.restore();
        this.f35016b.preTranslate(-i2, (-getHeight()) / 2);
        this.f35016b.postTranslate(i2, getHeight() / 2);
        canvas.concat(this.f35016b);
        View childAt = getChildAt(m36240c(i3));
        if (childAt != null) {
            drawChild(canvas, childAt, 0L);
        }
        canvas.restore();
    }

    /* JADX INFO: renamed from: a */
    private void m36230a(int i) {
        int i2 = this.f35019e;
        int i3 = this.f35023i - (i / i2);
        this.f35021g = i % i2;
        m36236b(i3);
        invalidate();
    }

    /* JADX INFO: renamed from: a */
    private void m36231a(int i, int i2, int i3) {
        if (i3 == 0) {
            float f = (-i) / 2;
            this.f35015a.translate(f, 0.0f, 0.0f);
            float f2 = -i2;
            this.f35015a.rotateY(f2);
            this.f35015a.translate(f, 0.0f, 0.0f);
            this.f35015a.translate(f, 0.0f, 0.0f);
            this.f35015a.rotateY(f2);
            this.f35015a.translate(f, 0.0f, 0.0f);
            return;
        }
        if (i3 == 1) {
            float f3 = i / 2;
            this.f35015a.translate(f3, 0.0f, 0.0f);
            this.f35015a.rotateY(i2);
            this.f35015a.translate(f3, 0.0f, 0.0f);
            return;
        }
        if (i3 != 2) {
            if (i3 != 3) {
                return;
            }
            this.f35015a.rotateY(0.0f);
        } else {
            float f4 = (-i) / 2;
            this.f35015a.translate(f4, 0.0f, 0.0f);
            this.f35015a.rotateY(-i2);
            this.f35015a.translate(f4, 0.0f, 0.0f);
        }
    }

    /* JADX INFO: renamed from: b */
    private void m36236b(int i) {
        int iM36240c;
        this.f35022h = i;
        if (Math.abs(this.f35021g) > this.f35019e / 2) {
            iM36240c = m36240c(2);
        } else {
            iM36240c = m36240c(3);
        }
        if (this.f35024j != iM36240c) {
            this.f35024j = iM36240c;
        }
    }

    public MBRotationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f35019e = 40;
        this.f35020f = 20;
        this.f35021g = 0;
        this.f35022h = 0;
        this.f35024j = 0;
        this.f35025k = 0.5f;
        this.f35026l = 0.9f;
        this.f35027m = true;
        this.f35028n = false;
        this.f35029o = false;
        this.f35030p = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBRotationView.1
            @Override // java.lang.Runnable
            public void run() {
                MBRotationView.this.m36235b();
            }
        };
        m36229a();
    }

    public MBRotationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f35019e = 40;
        this.f35020f = 20;
        this.f35021g = 0;
        this.f35022h = 0;
        this.f35024j = 0;
        this.f35025k = 0.5f;
        this.f35026l = 0.9f;
        this.f35027m = true;
        this.f35028n = false;
        this.f35029o = false;
        this.f35030p = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBRotationView.1
            @Override // java.lang.Runnable
            public void run() {
                MBRotationView.this.m36235b();
            }
        };
        m36229a();
    }
}
