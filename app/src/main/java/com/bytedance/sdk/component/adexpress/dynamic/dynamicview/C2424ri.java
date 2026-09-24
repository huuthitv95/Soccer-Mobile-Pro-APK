package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;

/* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ri */
/* JADX INFO: loaded from: classes3.dex */
public class C2424ri extends C2419lr {

    /* JADX INFO: renamed from: ik */
    private final Bitmap f6531ik;

    /* JADX INFO: renamed from: lr */
    private final Rect f6533lr = new Rect();

    /* JADX INFO: renamed from: ka */
    private final Paint f6532ka = new Paint(1);

    public C2424ri(Bitmap bitmap, C2419lr c2419lr) {
        this.f6531ik = bitmap;
        if (c2419lr != null) {
            this.f6526ri = c2419lr.f6526ri;
        }
    }

    @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        int iHeight = rect.height();
        int iWidth = rect.width();
        int width = this.f6531ik.getWidth();
        int height = this.f6531ik.getHeight();
        this.f6533lr.set(0, 0, width, height);
        if (height >= iHeight && width >= iWidth) {
            if (width > iWidth) {
                this.f6533lr.left = (width - iWidth) / 2;
                Rect rect2 = this.f6533lr;
                rect2.right = rect2.left + iWidth;
            }
            if (height > iHeight) {
                this.f6533lr.top = (height - iHeight) / 2;
                Rect rect3 = this.f6533lr;
                rect3.bottom = rect3.top + iHeight;
                return;
            }
            return;
        }
        float f = iHeight;
        float f2 = f * 1.0f;
        float f3 = height;
        float f4 = f2 / f3;
        float f5 = iWidth;
        float f6 = 1.0f * f5;
        float f7 = width;
        if (Math.max(f4, f6 / f7) > f4) {
            int i = (int) ((f2 / f5) * f7);
            this.f6533lr.top = (height - i) / 2;
            Rect rect4 = this.f6533lr;
            rect4.bottom = rect4.top + i;
            return;
        }
        int i2 = (int) ((f6 / f) * f3);
        this.f6533lr.left = (width - i2) / 2;
        Rect rect5 = this.f6533lr;
        rect5.right = rect5.left + i2;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.C2419lr
    /* JADX INFO: renamed from: ri */
    protected void mo8349ri(Canvas canvas) {
        canvas.drawBitmap(this.f6531ik, this.f6533lr, getBounds(), this.f6532ka);
    }
}
