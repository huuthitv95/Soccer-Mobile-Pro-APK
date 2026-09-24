package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.NinePatchDrawable;
import com.bytedance.sdk.openadsdk.core.p217di.C3193ka;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.widget.ri */
/* JADX INFO: loaded from: classes3.dex */
public class C3346ri extends C3193ka {

    /* JADX INFO: renamed from: lr */
    private int f11774lr;

    /* JADX INFO: renamed from: ri */
    private int f11775ri;

    public C3346ri(Context context) {
        super(context);
        this.f11775ri = 0;
        this.f11774lr = 0;
    }

    private Paint getPaint() {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        paint.setDither(true);
        return paint;
    }

    private int getRadius() {
        if (this.f11775ri == 0) {
            this.f11775ri = getWidth();
        }
        if (this.f11774lr == 0) {
            this.f11774lr = getHeight();
        }
        int i = this.f11775ri;
        int i2 = this.f11774lr;
        if (i >= i2) {
            i = i2;
        }
        return i / 2;
    }

    /* JADX INFO: renamed from: lr */
    private boolean m15034lr() {
        if (getDrawable().getClass() != NinePatchDrawable.class) {
            return (getDrawable() instanceof BitmapDrawable) && ((BitmapDrawable) getDrawable()).getBitmap() == null;
        }
        return true;
    }

    /* JADX INFO: renamed from: ri */
    private Bitmap m15035ri(Bitmap bitmap, int i) {
        Bitmap bitmapCreateBitmap;
        int i2 = i * 2;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (height > width) {
            bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, (height - width) / 2, width, width);
        } else {
            bitmapCreateBitmap = height < width ? Bitmap.createBitmap(bitmap, (width - height) / 2, 0, height, height) : null;
        }
        if (bitmapCreateBitmap != null) {
            bitmap = bitmapCreateBitmap;
        }
        if (bitmap.getWidth() != i2 || bitmap.getHeight() != i2) {
            bitmap = Bitmap.createScaledBitmap(bitmap, i2, i2, true);
        }
        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap2);
        Paint paint = getPaint();
        Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        canvas.drawARGB(0, 0, 0, 0);
        canvas.drawCircle(bitmap.getWidth() / 2, bitmap.getHeight() / 2, bitmap.getWidth() / 2, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, rect, rect, paint);
        return bitmapCreateBitmap2;
    }

    /* JADX INFO: renamed from: ri */
    private boolean m15036ri() {
        return getDrawable() == null || getWidth() == 0 || getHeight() == 0;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        Bitmap bitmapCopy;
        Bitmap bitmapM15035ri;
        if (m15036ri()) {
            return;
        }
        measure(0, 0);
        if (m15034lr()) {
            return;
        }
        try {
            bitmapCopy = ((BitmapDrawable) getDrawable()).getBitmap().copy(Bitmap.Config.ARGB_8888, true);
        } catch (Throwable unused) {
            bitmapCopy = null;
        }
        if (bitmapCopy == null) {
            super.onDraw(canvas);
            return;
        }
        int radius = getRadius();
        try {
            bitmapM15035ri = m15035ri(bitmapCopy, radius);
        } catch (Throwable unused2) {
            bitmapM15035ri = null;
        }
        if (bitmapM15035ri == null) {
            super.onDraw(canvas);
        } else {
            canvas.drawBitmap(bitmapM15035ri, (this.f11775ri / 2) - radius, (this.f11774lr / 2) - radius, (Paint) null);
        }
    }
}
