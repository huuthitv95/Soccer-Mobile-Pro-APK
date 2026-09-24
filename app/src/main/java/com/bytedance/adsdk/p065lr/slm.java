package com.bytedance.adsdk.p065lr;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes3.dex */
class slm implements Interpolator {

    /* JADX INFO: renamed from: lr */
    private final float[] f5350lr;

    /* JADX INFO: renamed from: ri */
    private final float[] f5351ri;

    slm(float f, float f2, float f3, float f4) {
        this(m7171ri(f, f2, f3, f4));
    }

    slm(Path path) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int i = (int) (length / 0.002f);
        int i2 = i + 1;
        this.f5351ri = new float[i2];
        this.f5350lr = new float[i2];
        float[] fArr = new float[2];
        for (int i3 = 0; i3 < i2; i3++) {
            pathMeasure.getPosTan((i3 * length) / i, fArr, null);
            this.f5351ri[i3] = fArr[0];
            this.f5350lr[i3] = fArr[1];
        }
    }

    /* JADX INFO: renamed from: ri */
    private static Path m7171ri(float f, float f2, float f3, float f4) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.cubicTo(f, f2, f3, f4, 1.0f, 1.0f);
        return path;
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        if (f <= 0.0f) {
            return 0.0f;
        }
        if (f >= 1.0f) {
            return 1.0f;
        }
        int length = this.f5351ri.length - 1;
        int i = 0;
        while (length - i > 1) {
            int i2 = (i + length) / 2;
            if (f < this.f5351ri[i2]) {
                length = i2;
            } else {
                i = i2;
            }
        }
        float[] fArr = this.f5351ri;
        float f2 = fArr[length];
        float f3 = fArr[i];
        float f4 = f2 - f3;
        if (f4 == 0.0f) {
            return this.f5350lr[i];
        }
        float f5 = (f - f3) / f4;
        float[] fArr2 = this.f5350lr;
        float f6 = fArr2[i];
        return f6 + (f5 * (fArr2[length] - f6));
    }
}
