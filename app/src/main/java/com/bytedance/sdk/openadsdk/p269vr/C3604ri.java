package com.bytedance.sdk.openadsdk.p269vr;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.vr.ri */
/* JADX INFO: loaded from: classes3.dex */
public class C3604ri extends View {

    /* JADX INFO: renamed from: ik */
    private float f13352ik;

    /* JADX INFO: renamed from: lr */
    private float f13353lr;

    /* JADX INFO: renamed from: ri */
    private final Paint f13354ri;

    public C3604ri(Context context) {
        super(context);
        setBackgroundColor(Color.parseColor("#8A8A8A"));
        Paint paint = new Paint();
        this.f13354ri = paint;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeCap(Paint.Cap.ROUND);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f = this.f13352ik;
        if (f > 0.0f) {
            float f2 = this.f13353lr;
            canvas.drawLine(0.0f, f2, f, f2, this.f13354ri);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        float f = i2;
        this.f13353lr = (1.0f * f) / 2.0f;
        this.f13354ri.setStrokeWidth(f);
    }

    public void setProgress(float f) {
        this.f13352ik = getWidth() * f;
        invalidate();
    }
}
