package com.mbridge.msdk.dycreator.baseview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.mbridge.msdk.foundation.tools.C13219q0;

/* JADX INFO: loaded from: classes5.dex */
public class MBRoundRectImageViewC extends MBImageView {

    /* JADX INFO: renamed from: d */
    private Paint f34943d;

    public MBRoundRectImageViewC(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f34943d = new Paint();
    }

    /* JADX INFO: renamed from: a */
    private Bitmap m36208a(Bitmap bitmap) {
        Bitmap bitmap2;
        if (bitmap == null || bitmap.isRecycled()) {
            return bitmap;
        }
        try {
            int width = getWidth();
            int height = getHeight();
            float width2 = width / bitmap.getWidth();
            float height2 = height / bitmap.getHeight();
            Matrix matrix = new Matrix();
            matrix.postScale(width2, height2);
            bitmap2 = bitmap;
            try {
                return Bitmap.createBitmap(bitmap2, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
            } catch (Exception e) {
                e = e;
                C13219q0.m37816b("MBRoundRectImageViewC", e.getMessage());
                return bitmap2;
            }
        } catch (Exception e2) {
            e = e2;
            bitmap2 = bitmap;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        try {
            Drawable drawable = getDrawable();
            if (drawable == null) {
                super.onDraw(canvas);
                return;
            }
            Bitmap bitmapM36208a = m36208a(((BitmapDrawable) drawable).getBitmap());
            if (bitmapM36208a != null && !bitmapM36208a.isRecycled()) {
                Bitmap bitmapM36209a = m36209a(bitmapM36208a, 30);
                if (bitmapM36209a != null && !bitmapM36209a.isRecycled()) {
                    Rect rect = new Rect(0, 0, bitmapM36209a.getWidth(), bitmapM36209a.getHeight());
                    this.f34943d.reset();
                    canvas.drawBitmap(bitmapM36209a, rect, rect, this.f34943d);
                    return;
                }
                super.onDraw(canvas);
                return;
            }
            super.onDraw(canvas);
        } catch (Exception e) {
            C13219q0.m37816b("MBRoundRectImageViewC", e.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    private Bitmap m36209a(Bitmap bitmap, int i) {
        if (bitmap != null && !bitmap.isRecycled()) {
            try {
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_4444);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                Paint paint = new Paint();
                paint.setAntiAlias(true);
                paint.setShader(bitmapShader);
                float f = i;
                canvas.drawRoundRect(new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight()), f, f, paint);
                return bitmapCreateBitmap;
            } catch (Exception e) {
                C13219q0.m37816b("MBRoundRectImageViewC", e.getMessage());
            }
        }
        return bitmap;
    }
}
