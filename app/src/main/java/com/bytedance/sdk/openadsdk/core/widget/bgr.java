package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import com.bytedance.sdk.openadsdk.core.p217di.C3193ka;

/* JADX INFO: loaded from: classes3.dex */
public class bgr extends C3193ka {

    /* JADX INFO: renamed from: lr */
    private RectF f11715lr;

    /* JADX INFO: renamed from: ri */
    private Paint f11716ri;

    public bgr(Context context) {
        super(context);
        m14997ri();
    }

    /* JADX INFO: renamed from: ri */
    private void m14997ri() {
        Paint paint = new Paint();
        this.f11716ri = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f11716ri.setColor(Color.parseColor("#99333333"));
        this.f11716ri.setAntiAlias(true);
        this.f11716ri.setStrokeWidth(0.0f);
        this.f11715lr = new RectF();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        RectF rectF = this.f11715lr;
        canvas.drawRoundRect(rectF, rectF.right / 2.0f, this.f11715lr.bottom / 2.0f, this.f11716ri);
        super.onDraw(canvas);
    }

    @Override // com.bytedance.sdk.openadsdk.core.p217di.C3193ka, android.widget.ImageView, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f11715lr.right == getMeasuredWidth() && this.f11715lr.bottom == getMeasuredHeight()) {
            return;
        }
        this.f11715lr.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
    }
}
