package com.bytedance.sdk.component.adexpress.p113di;

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
import android.widget.ImageView;
import com.chartboost.sdk.impl.cc$$ExternalSyntheticApiModelOutline0;

/* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.di.ay */
/* JADX INFO: loaded from: classes3.dex */
public class C2367ay extends ImageView {

    /* JADX INFO: renamed from: ik */
    private int f6234ik;

    /* JADX INFO: renamed from: ka */
    private Matrix f6235ka;

    /* JADX INFO: renamed from: lr */
    private int f6236lr;

    /* JADX INFO: renamed from: ri */
    private Paint f6237ri;

    public C2367ay(Context context) {
        this(context, null);
    }

    public C2367ay(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C2367ay(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6236lr = 25;
        this.f6234ik = 25;
        Paint paint = new Paint();
        this.f6237ri = paint;
        paint.setAntiAlias(true);
        this.f6237ri.setFilterBitmap(true);
        this.f6235ka = new Matrix();
    }

    /* JADX INFO: renamed from: ri */
    private Bitmap m8196ri(Drawable drawable) {
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
        Drawable drawable = getDrawable();
        if (Build.VERSION.SDK_INT >= 28 && cc$$ExternalSyntheticApiModelOutline0.m17156m((Object) drawable)) {
            super.onDraw(canvas);
            return;
        }
        if (drawable == null) {
            super.onDraw(canvas);
            return;
        }
        Bitmap bitmapM8196ri = m8196ri(drawable);
        if (bitmapM8196ri == null) {
            super.onDraw(canvas);
            return;
        }
        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
        BitmapShader bitmapShader = new BitmapShader(bitmapM8196ri, tileMode, tileMode);
        float fMax = (bitmapM8196ri.getWidth() == getWidth() && bitmapM8196ri.getHeight() == getHeight()) ? 1.0f : Math.max((getWidth() * 1.0f) / bitmapM8196ri.getWidth(), (getHeight() * 1.0f) / bitmapM8196ri.getHeight());
        this.f6235ka.setScale(fMax, fMax);
        bitmapShader.setLocalMatrix(this.f6235ka);
        this.f6237ri.setShader(bitmapShader);
        canvas.drawRoundRect(new RectF(0.0f, 0.0f, getWidth(), getHeight()), this.f6236lr, this.f6234ik, this.f6237ri);
    }

    public void setXRound(int i) {
        this.f6236lr = i;
        postInvalidate();
    }

    public void setYRound(int i) {
        this.f6234ik = i;
        postInvalidate();
    }
}
