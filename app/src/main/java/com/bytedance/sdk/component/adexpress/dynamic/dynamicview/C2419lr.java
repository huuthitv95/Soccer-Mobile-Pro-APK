package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.GradientDrawable;

/* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lr */
/* JADX INFO: loaded from: classes3.dex */
public class C2419lr extends GradientDrawable {

    /* JADX INFO: renamed from: lr */
    private final Paint f6525lr;

    /* JADX INFO: renamed from: ri */
    protected Path f6526ri;

    public C2419lr() {
        this.f6526ri = new Path();
        Paint paint = new Paint(1);
        this.f6525lr = paint;
        paint.setColor(-1);
    }

    public C2419lr(GradientDrawable.Orientation orientation, int[] iArr) {
        super(orientation, iArr);
        this.f6526ri = new Path();
        Paint paint = new Paint(1);
        this.f6525lr = paint;
        paint.setColor(-1);
    }

    @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Path path = this.f6526ri;
        if (path == null || path.isEmpty()) {
            mo8349ri(canvas);
            return;
        }
        int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), this.f6525lr, 31);
        mo8349ri(canvas);
        this.f6525lr.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        canvas.drawPath(this.f6526ri, this.f6525lr);
        this.f6525lr.setXfermode(null);
        canvas.restoreToCount(iSaveLayer);
    }

    /* JADX INFO: renamed from: ri */
    public void m8348ri(int i, int i2, int i3, int i4) {
        this.f6526ri.addRect(i, i2, i3, i4, Path.Direction.CW);
        invalidateSelf();
    }

    /* JADX INFO: renamed from: ri */
    protected void mo8349ri(Canvas canvas) {
        super.draw(canvas);
    }
}
