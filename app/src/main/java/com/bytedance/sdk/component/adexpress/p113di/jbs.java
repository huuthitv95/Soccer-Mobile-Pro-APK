package com.bytedance.sdk.component.adexpress.p113di;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public class jbs extends View {

    /* JADX INFO: renamed from: di */
    private int f6298di;

    /* JADX INFO: renamed from: fi */
    private Paint f6299fi;

    /* JADX INFO: renamed from: ik */
    private final RectF f6300ik;

    /* JADX INFO: renamed from: ka */
    private Paint f6301ka;

    /* JADX INFO: renamed from: lr */
    private int f6302lr;

    /* JADX INFO: renamed from: mj */
    private int f6303mj;

    /* JADX INFO: renamed from: ri */
    private int f6304ri;
    private Paint xha;

    public jbs(Context context) {
        super(context);
        this.f6300ik = new RectF();
        m8233ri();
    }

    /* JADX INFO: renamed from: ri */
    private void m8233ri() {
        Paint paint = new Paint();
        this.f6301ka = paint;
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.xha = paint2;
        paint2.setAntiAlias(true);
        Paint paint3 = new Paint();
        this.f6299fi = paint3;
        paint3.setAntiAlias(true);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = this.f6300ik;
        int i = this.f6298di;
        canvas.drawRoundRect(rectF, i, i, this.f6299fi);
        RectF rectF2 = this.f6300ik;
        int i2 = this.f6298di;
        canvas.drawRoundRect(rectF2, i2, i2, this.f6301ka);
        int i3 = this.f6304ri;
        int i4 = this.f6302lr;
        canvas.drawLine(i3 * 0.3f, i4 * 0.3f, i3 * 0.7f, i4 * 0.7f, this.xha);
        int i5 = this.f6304ri;
        int i6 = this.f6302lr;
        canvas.drawLine(i5 * 0.7f, i6 * 0.3f, i5 * 0.3f, i6 * 0.7f, this.xha);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f6304ri = i;
        this.f6302lr = i2;
        RectF rectF = this.f6300ik;
        int i5 = this.f6303mj;
        rectF.set(i5, i5, i - i5, i2 - i5);
    }

    public void setBgColor(int i) {
        this.f6299fi.setStyle(Paint.Style.FILL);
        this.f6299fi.setColor(i);
    }

    public void setDislikeColor(int i) {
        this.xha.setColor(i);
    }

    public void setDislikeWidth(int i) {
        this.xha.setStrokeWidth(i);
    }

    public void setRadius(int i) {
        this.f6298di = i;
    }

    public void setStrokeColor(int i) {
        this.f6301ka.setStyle(Paint.Style.STROKE);
        this.f6301ka.setColor(i);
    }

    public void setStrokeWidth(int i) {
        this.f6301ka.setStrokeWidth(i);
        this.f6303mj = i;
    }
}
