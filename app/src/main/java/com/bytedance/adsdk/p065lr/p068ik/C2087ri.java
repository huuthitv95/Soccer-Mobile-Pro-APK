package com.bytedance.adsdk.p065lr.p068ik;

import android.graphics.PointF;

/* JADX INFO: renamed from: com.bytedance.adsdk.lr.ik.ri */
/* JADX INFO: loaded from: classes3.dex */
public class C2087ri {

    /* JADX INFO: renamed from: ik */
    private final PointF f5032ik;

    /* JADX INFO: renamed from: lr */
    private final PointF f5033lr;

    /* JADX INFO: renamed from: ri */
    private final PointF f5034ri;

    public C2087ri() {
        this.f5034ri = new PointF();
        this.f5033lr = new PointF();
        this.f5032ik = new PointF();
    }

    public C2087ri(PointF pointF, PointF pointF2, PointF pointF3) {
        this.f5034ri = pointF;
        this.f5033lr = pointF2;
        this.f5032ik = pointF3;
    }

    /* JADX INFO: renamed from: ik */
    public PointF m6895ik() {
        return this.f5032ik;
    }

    /* JADX INFO: renamed from: ik */
    public void m6896ik(float f, float f2) {
        this.f5032ik.set(f, f2);
    }

    /* JADX INFO: renamed from: lr */
    public PointF m6897lr() {
        return this.f5033lr;
    }

    /* JADX INFO: renamed from: lr */
    public void m6898lr(float f, float f2) {
        this.f5033lr.set(f, f2);
    }

    /* JADX INFO: renamed from: ri */
    public PointF m6899ri() {
        return this.f5034ri;
    }

    /* JADX INFO: renamed from: ri */
    public void m6900ri(float f, float f2) {
        this.f5034ri.set(f, f2);
    }

    public String toString() {
        return String.format("v=%.2f,%.2f cp1=%.2f,%.2f cp2=%.2f,%.2f", Float.valueOf(this.f5032ik.x), Float.valueOf(this.f5032ik.y), Float.valueOf(this.f5034ri.x), Float.valueOf(this.f5034ri.y), Float.valueOf(this.f5033lr.x), Float.valueOf(this.f5033lr.y));
    }
}
