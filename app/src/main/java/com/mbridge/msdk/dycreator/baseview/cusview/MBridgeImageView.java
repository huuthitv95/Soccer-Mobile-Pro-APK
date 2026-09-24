package com.mbridge.msdk.dycreator.baseview.cusview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Xfermode;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.mbridge.msdk.foundation.tools.C13219q0;

/* JADX INFO: loaded from: classes5.dex */
public class MBridgeImageView extends ImageView {

    /* JADX INFO: renamed from: a */
    private Xfermode f35056a;

    /* JADX INFO: renamed from: b */
    private int f35057b;

    /* JADX INFO: renamed from: c */
    private int f35058c;

    /* JADX INFO: renamed from: d */
    private int f35059d;

    /* JADX INFO: renamed from: e */
    private int f35060e;

    /* JADX INFO: renamed from: f */
    private int f35061f;

    /* JADX INFO: renamed from: g */
    private int f35062g;

    /* JADX INFO: renamed from: h */
    private int f35063h;

    /* JADX INFO: renamed from: i */
    private int f35064i;

    /* JADX INFO: renamed from: j */
    private int f35065j;

    /* JADX INFO: renamed from: k */
    private float[] f35066k;

    /* JADX INFO: renamed from: l */
    private float[] f35067l;

    /* JADX INFO: renamed from: m */
    private RectF f35068m;

    /* JADX INFO: renamed from: n */
    private RectF f35069n;

    /* JADX INFO: renamed from: o */
    private boolean f35070o;

    /* JADX INFO: renamed from: p */
    private boolean f35071p;

    /* JADX INFO: renamed from: q */
    private Path f35072q;

    /* JADX INFO: renamed from: r */
    private Paint f35073r;

    public MBridgeImageView(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: a */
    private void m36251a(Canvas canvas) {
        m36252a(canvas, this.f35064i, this.f35065j, this.f35069n, this.f35066k);
    }

    /* JADX INFO: renamed from: b */
    private void m36253b() {
        int i;
        int i2;
        int i3;
        try {
            if (this.f35066k == null || this.f35067l == null) {
                return;
            }
            int i4 = 0;
            while (true) {
                i = 2;
                if (i4 >= 2) {
                    break;
                }
                float[] fArr = this.f35066k;
                float f = this.f35060e;
                fArr[i4] = f;
                this.f35067l[i4] = f - (this.f35064i / 2.0f);
                i4++;
            }
            while (true) {
                i2 = 4;
                if (i >= 4) {
                    break;
                }
                float[] fArr2 = this.f35066k;
                float f2 = this.f35061f;
                fArr2[i] = f2;
                this.f35067l[i] = f2 - (this.f35064i / 2.0f);
                i++;
            }
            while (true) {
                if (i2 >= 6) {
                    break;
                }
                float[] fArr3 = this.f35066k;
                float f3 = this.f35062g;
                fArr3[i2] = f3;
                this.f35067l[i2] = f3 - (this.f35064i / 2.0f);
                i2++;
            }
            for (i3 = 6; i3 < 8; i3++) {
                float[] fArr4 = this.f35066k;
                float f4 = this.f35063h;
                fArr4[i3] = f4;
                this.f35067l[i3] = f4 - (this.f35064i / 2.0f);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: c */
    private void m36254c() {
        RectF rectF = this.f35069n;
        if (rectF != null) {
            float f = this.f35064i / 2.0f;
            rectF.set(f, f, this.f35057b - f, this.f35058c - f);
        }
    }

    /* JADX INFO: renamed from: d */
    private void m36255d() {
        RectF rectF = this.f35068m;
        if (rectF != null) {
            rectF.set(0.0f, 0.0f, this.f35057b, this.f35058c);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        if (canvas == null) {
            return;
        }
        try {
            canvas.saveLayer(this.f35068m, null, 31);
            int i = this.f35057b;
            int i2 = this.f35064i * 2;
            float f = (i - i2) * 1.0f;
            float f2 = i;
            int i3 = this.f35058c;
            float f3 = i3;
            canvas.scale(f / f2, ((i3 - i2) * 1.0f) / f3, f2 / 2.0f, f3 / 2.0f);
            super.onDraw(canvas);
            Paint paint = this.f35073r;
            if (paint != null) {
                paint.reset();
                this.f35073r.setAntiAlias(true);
                this.f35073r.setStyle(Paint.Style.FILL);
                this.f35073r.setXfermode(this.f35056a);
            }
            Path path = this.f35072q;
            if (path != null) {
                path.reset();
                this.f35072q.addRoundRect(this.f35068m, this.f35067l, Path.Direction.CCW);
            }
            canvas.drawPath(this.f35072q, this.f35073r);
            Paint paint2 = this.f35073r;
            if (paint2 != null) {
                paint2.setXfermode(null);
            }
            canvas.restore();
            if (this.f35070o) {
                m36251a(canvas);
            }
        } catch (Exception e) {
            C13219q0.m37813a("MBridgeImageView", e.getMessage());
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f35057b = i;
        this.f35058c = i2;
        if (this.f35071p) {
            m36253b();
        } else {
            m36249a();
        }
        m36254c();
        m36255d();
    }

    public void setBorder(int i, int i2, int i3) {
        this.f35070o = true;
        this.f35064i = i2;
        this.f35065j = i3;
        this.f35059d = i;
    }

    public void setCornerRadius(int i) {
        this.f35059d = i;
    }

    public void setCustomBorder(int i, int i2, int i3, int i4, int i5, int i6) {
        this.f35070o = true;
        this.f35071p = true;
        this.f35064i = i5;
        this.f35065j = i6;
        this.f35060e = i;
        this.f35062g = i3;
        this.f35061f = i2;
        this.f35063h = i4;
    }

    public MBridgeImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: renamed from: a */
    private void m36252a(Canvas canvas, int i, int i2, RectF rectF, float[] fArr) {
        try {
            m36250a(i, i2);
            Path path = this.f35072q;
            if (path != null) {
                path.addRoundRect(rectF, fArr, Path.Direction.CCW);
            }
            if (canvas != null) {
                canvas.drawPath(this.f35072q, this.f35073r);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public MBridgeImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f35072q = new Path();
        this.f35073r = new Paint();
        this.f35066k = new float[8];
        this.f35067l = new float[8];
        this.f35069n = new RectF();
        this.f35068m = new RectF();
        this.f35056a = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);
    }

    /* JADX INFO: renamed from: a */
    private void m36250a(int i, int i2) {
        Path path = this.f35072q;
        if (path != null) {
            path.reset();
        }
        Paint paint = this.f35073r;
        if (paint != null) {
            paint.setStrokeWidth(i);
            this.f35073r.setColor(i2);
            this.f35073r.setStyle(Paint.Style.STROKE);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m36249a() {
        if (this.f35066k == null || this.f35067l == null) {
            return;
        }
        int i = 0;
        while (true) {
            try {
                float[] fArr = this.f35066k;
                if (i >= fArr.length) {
                    return;
                }
                float f = this.f35059d;
                fArr[i] = f;
                this.f35067l[i] = f - (this.f35064i / 2.0f);
                i++;
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }
        }
    }
}
