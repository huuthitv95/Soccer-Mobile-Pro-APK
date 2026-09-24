package com.bytedance.sdk.openadsdk.core.widget;

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
import android.os.Build;
import android.util.AttributeSet;
import com.bytedance.sdk.openadsdk.core.p217di.C3193ka;
import com.chartboost.sdk.impl.cc$$ExternalSyntheticApiModelOutline0;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.widget.bu */
/* JADX INFO: loaded from: classes3.dex */
public class C3335bu extends C3193ka {

    /* JADX INFO: renamed from: di */
    private BitmapShader f11717di;

    /* JADX INFO: renamed from: fi */
    private final RectF f11718fi;

    /* JADX INFO: renamed from: ik */
    private int f11719ik;

    /* JADX INFO: renamed from: ka */
    private final Matrix f11720ka;

    /* JADX INFO: renamed from: lr */
    private int f11721lr;

    /* JADX INFO: renamed from: ri */
    private final Paint f11722ri;

    public C3335bu(Context context) {
        this(context, null);
    }

    public C3335bu(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C3335bu(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f11721lr = 25;
        this.f11719ik = 25;
        this.f11718fi = new RectF();
        Paint paint = new Paint();
        this.f11722ri = paint;
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        this.f11720ka = new Matrix();
    }

    /* JADX INFO: renamed from: ri */
    private Bitmap m14998ri(Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        int width = drawable.getIntrinsicWidth() <= 0 ? getWidth() : drawable.getIntrinsicWidth();
        int height = drawable.getIntrinsicHeight() <= 0 ? getHeight() : drawable.getIntrinsicHeight();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, width, height);
        drawable.draw(canvas);
        return bitmapCreateBitmap;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        Bitmap bitmapM14998ri;
        Drawable drawable = getDrawable();
        if (drawable == null) {
            super.onDraw(canvas);
            return;
        }
        if (Build.VERSION.SDK_INT >= 28 && cc$$ExternalSyntheticApiModelOutline0.m17156m((Object) drawable)) {
            super.onDraw(canvas);
            return;
        }
        if (this.f11717di == null && (bitmapM14998ri = m14998ri(drawable)) != null) {
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            this.f11717di = new BitmapShader(bitmapM14998ri, tileMode, tileMode);
            float fMax = (bitmapM14998ri.getWidth() == getWidth() && bitmapM14998ri.getHeight() == getHeight()) ? 1.0f : Math.max((getWidth() * 1.0f) / bitmapM14998ri.getWidth(), (getHeight() * 1.0f) / bitmapM14998ri.getHeight());
            this.f11720ka.setScale(fMax, fMax);
            this.f11717di.setLocalMatrix(this.f11720ka);
        }
        BitmapShader bitmapShader = this.f11717di;
        if (bitmapShader == null) {
            super.onDraw(canvas);
        } else {
            this.f11722ri.setShader(bitmapShader);
            canvas.drawRoundRect(this.f11718fi, this.f11721lr, this.f11719ik, this.f11722ri);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f11718fi.set(0.0f, 0.0f, i, i2);
    }

    public void setXRound(int i) {
        this.f11721lr = i;
        postInvalidate();
    }

    public void setYRound(int i) {
        this.f11719ik = i;
        postInvalidate();
    }

    @Override // android.view.View
    public void unscheduleDrawable(Drawable drawable) {
        super.unscheduleDrawable(drawable);
        this.f11717di = null;
    }
}
