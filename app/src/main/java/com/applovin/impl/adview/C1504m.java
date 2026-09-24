package com.applovin.impl.adview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.core.view.ViewCompat;

/* JADX INFO: renamed from: com.applovin.impl.adview.m */
/* JADX INFO: loaded from: classes3.dex */
public final class C1504m extends AbstractC1496e {

    /* JADX INFO: renamed from: c */
    private static final Paint f1125c = new Paint(1);

    /* JADX INFO: renamed from: d */
    private static final Paint f1126d = new Paint(1);

    /* JADX INFO: renamed from: e */
    private static final Paint f1127e = new Paint(1);

    public C1504m(Context context) {
        super(context);
        f1125c.setColor(-1);
        f1126d.setColor(ViewCompat.MEASURED_STATE_MASK);
        Paint paint = f1127e;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
    }

    protected float getCenter() {
        return getSize() / 2.0f;
    }

    protected float getCrossOffset() {
        return this.f1098a * 10.0f;
    }

    protected float getInnerCircleOffset() {
        return this.f1098a * 2.0f;
    }

    protected float getInnerCircleRadius() {
        return getCenter() - getInnerCircleOffset();
    }

    protected float getStrokeWidth() {
        return this.f1098a * 3.0f;
    }

    @Override // com.applovin.impl.adview.AbstractC1496e
    public AbstractC1496e.a getStyle() {
        return AbstractC1496e.a.WHITE_ON_BLACK;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float center = getCenter();
        canvas.drawCircle(center, center, center, f1125c);
        canvas.drawCircle(center, center, getInnerCircleRadius(), f1126d);
        float crossOffset = getCrossOffset();
        float size = getSize() - crossOffset;
        Paint paint = f1127e;
        paint.setStrokeWidth(getStrokeWidth());
        canvas.drawLine(crossOffset, crossOffset, size, size, paint);
        canvas.drawLine(crossOffset, size, size, crossOffset, paint);
    }
}
