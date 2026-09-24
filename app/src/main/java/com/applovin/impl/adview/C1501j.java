package com.applovin.impl.adview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;

/* JADX INFO: renamed from: com.applovin.impl.adview.j */
/* JADX INFO: loaded from: classes3.dex */
public final class C1501j extends AbstractC1496e {

    /* JADX INFO: renamed from: e */
    private static final Paint f1118e = new Paint(1);

    /* JADX INFO: renamed from: f */
    private static final Paint f1119f = new Paint(1);

    /* JADX INFO: renamed from: c */
    private final float[] f1120c;

    /* JADX INFO: renamed from: d */
    private Path f1121d;

    public C1501j(Context context) {
        super(context);
        this.f1120c = new float[]{30.0f, 30.0f, 50.0f, 50.0f, 30.0f, 70.0f, 55.0f, 30.0f, 75.0f, 50.0f, 55.0f, 70.0f};
        f1118e.setARGB(80, 0, 0, 0);
        Paint paint = f1119f;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
    }

    /* JADX INFO: renamed from: a */
    private void m2034a() {
        int i = 0;
        while (true) {
            float[] fArr = this.f1120c;
            if (i >= fArr.length) {
                Path path = new Path();
                this.f1121d = path;
                float[] fArr2 = this.f1120c;
                path.moveTo(fArr2[0], fArr2[1]);
                Path path2 = this.f1121d;
                float[] fArr3 = this.f1120c;
                path2.lineTo(fArr3[2], fArr3[3]);
                Path path3 = this.f1121d;
                float[] fArr4 = this.f1120c;
                path3.lineTo(fArr4[4], fArr4[5]);
                Path path4 = this.f1121d;
                float[] fArr5 = this.f1120c;
                path4.moveTo(fArr5[6], fArr5[7]);
                Path path5 = this.f1121d;
                float[] fArr6 = this.f1120c;
                path5.lineTo(fArr6[8], fArr6[9]);
                Path path6 = this.f1121d;
                float[] fArr7 = this.f1120c;
                path6.lineTo(fArr7[10], fArr7[11]);
                return;
            }
            fArr[i] = fArr[i] * 0.3f * this.f1098a;
            i++;
        }
    }

    @Override // com.applovin.impl.adview.AbstractC1496e
    /* JADX INFO: renamed from: a */
    public void mo2016a(int i) {
        setViewScale(i / 30.0f);
        m2034a();
    }

    protected float getCenter() {
        return getSize() / 2.0f;
    }

    protected float getStrokeWidth() {
        return this.f1098a * 2.0f;
    }

    @Override // com.applovin.impl.adview.AbstractC1496e
    public AbstractC1496e.a getStyle() {
        return AbstractC1496e.a.TRANSPARENT_SKIP;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float center = getCenter();
        canvas.drawCircle(center, center, center, f1118e);
        Paint paint = f1119f;
        paint.setStrokeWidth(getStrokeWidth());
        canvas.drawPath(this.f1121d, paint);
    }
}
