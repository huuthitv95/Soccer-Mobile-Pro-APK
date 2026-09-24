package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.core.view.ViewCompat;

/* JADX INFO: loaded from: classes9.dex */
public class tan extends Drawable {

    /* JADX INFO: renamed from: ik */
    private int f6541ik;

    /* JADX INFO: renamed from: ka */
    private RectF f6542ka;

    /* JADX INFO: renamed from: lr */
    private int f6543lr;

    /* JADX INFO: renamed from: ri */
    private Paint f6544ri;

    public tan(int i, int i2) {
        this.f6541ik = i;
        this.f6543lr = i2;
        Paint paint = new Paint();
        this.f6544ri = paint;
        paint.setColor(0);
        this.f6544ri.setAntiAlias(true);
        this.f6544ri.setShadowLayer(i2, 0.0f, 0.0f, ViewCompat.MEASURED_STATE_MASK);
        this.f6544ri.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_ATOP));
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        RectF rectF = this.f6542ka;
        int i = this.f6541ik;
        canvas.drawRoundRect(rectF, i, i, this.f6544ri);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f6544ri.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        int i5 = this.f6543lr;
        this.f6542ka = new RectF(i + i5, i2 + i5, i3 - i5, i4 - i5);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f6544ri.setColorFilter(colorFilter);
    }
}
