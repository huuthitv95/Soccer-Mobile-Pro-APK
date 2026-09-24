package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import com.bytedance.sdk.openadsdk.core.p217di.C3195mj;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.widget.vr */
/* JADX INFO: loaded from: classes3.dex */
public class C3356vr extends C3195mj {

    /* JADX INFO: renamed from: ik */
    private int f11867ik;

    /* JADX INFO: renamed from: lr */
    private RectF f11868lr;

    /* JADX INFO: renamed from: ri */
    private Paint f11869ri;

    public C3356vr(Context context) {
        this(context, null);
    }

    public C3356vr(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C3356vr(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f11867ik = 0;
        m15115ri();
    }

    /* JADX INFO: renamed from: ri */
    private void m15115ri() {
        setTextColor(-1);
        Paint paint = new Paint();
        this.f11869ri = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f11869ri.setColor(Color.parseColor("#99333333"));
        this.f11869ri.setAntiAlias(true);
        this.f11869ri.setStrokeWidth(0.0f);
        this.f11868lr = new RectF();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        RectF rectF = this.f11868lr;
        canvas.drawRoundRect(rectF, rectF.bottom / 2.0f, this.f11868lr.bottom / 2.0f, this.f11869ri);
        canvas.translate((this.f11868lr.right / 2.0f) - (getPaint().measureText(getText().toString()) / 2.0f), 0.0f);
        super.onDraw(canvas);
    }

    @Override // com.bytedance.sdk.openadsdk.core.p217di.C3195mj, android.widget.TextView, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (measuredWidth <= 0 || measuredHeight <= 0) {
            this.f11868lr.set(0.0f, 0.0f, 0.0f, 0.0f);
            return;
        }
        int iMeasureText = (int) getPaint().measureText("00");
        this.f11867ik = iMeasureText;
        if (measuredWidth < iMeasureText) {
            measuredWidth = iMeasureText;
        }
        int i3 = measuredWidth + ((measuredHeight / 2) * 2);
        setMeasuredDimension(i3, measuredHeight);
        this.f11868lr.set(0.0f, 0.0f, i3, measuredHeight);
    }
}
