package com.mbridge.msdk.videocommon.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.foundation.tools.C13229v0;
import com.mbridge.msdk.widget.MBImageView;

/* JADX INFO: loaded from: classes7.dex */
public class RoundImageView extends MBImageView {

    /* JADX INFO: renamed from: c */
    private int f41158c;

    /* JADX INFO: renamed from: d */
    private int f41159d;

    /* JADX INFO: renamed from: e */
    private Paint f41160e;

    /* JADX INFO: renamed from: f */
    private int f41161f;

    /* JADX INFO: renamed from: g */
    private Matrix f41162g;

    /* JADX INFO: renamed from: h */
    private BitmapShader f41163h;

    /* JADX INFO: renamed from: i */
    private int f41164i;

    /* JADX INFO: renamed from: j */
    private RectF f41165j;

    public RoundImageView(Context context) {
        super(context);
        this.f41162g = new Matrix();
        Paint paint = new Paint();
        this.f41160e = paint;
        paint.setAntiAlias(true);
        this.f41159d = (int) TypedValue.applyDimension(1, 5.0f, getResources().getDisplayMetrics());
        this.f41158c = 1;
    }

    public RoundImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f41162g = new Matrix();
        Paint paint = new Paint();
        this.f41160e = paint;
        paint.setAntiAlias(true);
        this.f41159d = (int) TypedValue.applyDimension(1, 5.0f, getResources().getDisplayMetrics());
        this.f41158c = 1;
    }

    public RoundImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f41162g = new Matrix();
        Paint paint = new Paint();
        this.f41160e = paint;
        paint.setAntiAlias(true);
        this.f41159d = (int) TypedValue.applyDimension(1, 5.0f, getResources().getDisplayMetrics());
        this.f41158c = 1;
    }

    /* JADX INFO: renamed from: a */
    private Bitmap m42766a(Drawable drawable) {
        try {
            if (drawable instanceof BitmapDrawable) {
                return ((BitmapDrawable) drawable).getBitmap();
            }
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_4444);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            drawable.draw(canvas);
            return bitmapCreateBitmap;
        } catch (Throwable th) {
            C13219q0.m37816b("View", th.getMessage());
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    private void m42767b() {
        Bitmap bitmapM42766a;
        try {
            Drawable drawable = getDrawable();
            if (drawable == null || (bitmapM42766a = m42766a(drawable)) == null || bitmapM42766a.isRecycled()) {
                return;
            }
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.f41163h = new BitmapShader(bitmapM42766a, tileMode, tileMode);
            int i = this.f41158c;
            float fMax = 1.0f;
            if (i == 0) {
                fMax = (this.f41164i * 1.0f) / Math.min(bitmapM42766a.getWidth(), bitmapM42766a.getHeight());
            } else if (i == 1) {
                fMax = Math.max((getWidth() * 1.0f) / bitmapM42766a.getWidth(), (getHeight() * 1.0f) / bitmapM42766a.getHeight());
            }
            this.f41162g.setScale(fMax, fMax);
            this.f41163h.setLocalMatrix(this.f41162g);
            this.f41160e.setShader(this.f41163h);
        } catch (Throwable th) {
            C13219q0.m37816b("RoundImageView", th.getMessage());
        }
    }

    @Override // com.mbridge.msdk.widget.MBImageView, android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        try {
            if (getDrawable() == null) {
                return;
            }
            m42767b();
            if (this.f41158c != 1) {
                float f = this.f41161f;
                canvas.drawCircle(f, f, f, this.f41160e);
            } else {
                RectF rectF = this.f41165j;
                float f2 = this.f41159d;
                canvas.drawRoundRect(rectF, f2, f2, this.f41160e);
            }
        } catch (Throwable th) {
            C13219q0.m37816b("RoundImageView", th.getMessage());
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f41158c == 0) {
            int iMin = Math.min(getMeasuredWidth(), getMeasuredHeight());
            this.f41164i = iMin;
            this.f41161f = iMin / 2;
            setMeasuredDimension(iMin, iMin);
        }
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        super.onRestoreInstanceState(bundle.getParcelable("state_instance"));
        this.f41158c = bundle.getInt("state_type");
        this.f41159d = bundle.getInt("state_border_radius");
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("state_instance", super.onSaveInstanceState());
        bundle.putInt("state_type", this.f41158c);
        bundle.putInt("state_border_radius", this.f41159d);
        return bundle;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.f41158c == 1) {
            this.f41165j = new RectF(0.0f, 0.0f, getWidth(), getHeight());
        }
    }

    public void setBorderRadius(int i) {
        int iM37876a = C13229v0.m37876a(getContext(), i);
        if (this.f41159d != iM37876a) {
            this.f41159d = iM37876a;
            invalidate();
        }
    }

    public void setType(int i) {
        if (this.f41158c != i) {
            this.f41158c = i;
            if (i != 1 && i != 0) {
                this.f41158c = 0;
            }
            requestLayout();
        }
    }
}
