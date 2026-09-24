package com.bytedance.adsdk.p065lr.p066di;

import android.graphics.Path;
import android.graphics.PointF;
import com.bytedance.adsdk.p065lr.p068ik.C2087ri;
import com.bytedance.adsdk.p065lr.p068ik.p070lr.bgr;

/* JADX INFO: renamed from: com.bytedance.adsdk.lr.di.fi */
/* JADX INFO: loaded from: classes3.dex */
public class C2018fi {

    /* JADX INFO: renamed from: ri */
    private static final PointF f4744ri = new PointF();

    /* JADX INFO: renamed from: ik */
    public static boolean m6557ik(float f, float f2, float f3) {
        return f >= f2 && f <= f3;
    }

    /* JADX INFO: renamed from: lr */
    public static float m6558lr(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f3, f));
    }

    /* JADX INFO: renamed from: lr */
    private static int m6559lr(int i, int i2) {
        int i3 = i / i2;
        return (((i ^ i2) >= 0) || i % i2 == 0) ? i3 : i3 - 1;
    }

    /* JADX INFO: renamed from: ri */
    public static float m6560ri(float f, float f2, float f3) {
        return f + (f3 * (f2 - f));
    }

    /* JADX INFO: renamed from: ri */
    static int m6561ri(float f, float f2) {
        return m6562ri((int) f, (int) f2);
    }

    /* JADX INFO: renamed from: ri */
    private static int m6562ri(int i, int i2) {
        return i - (i2 * m6559lr(i, i2));
    }

    /* JADX INFO: renamed from: ri */
    public static int m6563ri(int i, int i2, float f) {
        return (int) (i + (f * (i2 - i)));
    }

    /* JADX INFO: renamed from: ri */
    public static int m6564ri(int i, int i2, int i3) {
        return Math.max(i2, Math.min(i3, i));
    }

    /* JADX INFO: renamed from: ri */
    public static PointF m6565ri(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    /* JADX INFO: renamed from: ri */
    public static void m6566ri(bgr bgrVar, Path path) {
        Path path2;
        path.reset();
        PointF pointFM6805ri = bgrVar.m6805ri();
        path.moveTo(pointFM6805ri.x, pointFM6805ri.y);
        f4744ri.set(pointFM6805ri.x, pointFM6805ri.y);
        int i = 0;
        while (i < bgrVar.m6803ik().size()) {
            C2087ri c2087ri = bgrVar.m6803ik().get(i);
            PointF pointFM6899ri = c2087ri.m6899ri();
            PointF pointFM6897lr = c2087ri.m6897lr();
            PointF pointFM6895ik = c2087ri.m6895ik();
            PointF pointF = f4744ri;
            if (pointFM6899ri.equals(pointF) && pointFM6897lr.equals(pointFM6895ik)) {
                path.lineTo(pointFM6895ik.x, pointFM6895ik.y);
                path2 = path;
            } else {
                path2 = path;
                path2.cubicTo(pointFM6899ri.x, pointFM6899ri.y, pointFM6897lr.x, pointFM6897lr.y, pointFM6895ik.x, pointFM6895ik.y);
            }
            pointF.set(pointFM6895ik.x, pointFM6895ik.y);
            i++;
            path = path2;
        }
        Path path3 = path;
        if (bgrVar.m6804lr()) {
            path3.close();
        }
    }
}
