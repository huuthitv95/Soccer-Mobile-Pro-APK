package com.bytedance.adsdk.p065lr.xha;

/* JADX INFO: renamed from: com.bytedance.adsdk.lr.xha.ik */
/* JADX INFO: loaded from: classes3.dex */
public class C2165ik {

    /* JADX INFO: renamed from: lr */
    private float f5393lr;

    /* JADX INFO: renamed from: ri */
    private float f5394ri;

    public C2165ik() {
        this(1.0f, 1.0f);
    }

    public C2165ik(float f, float f2) {
        this.f5394ri = f;
        this.f5393lr = f2;
    }

    /* JADX INFO: renamed from: lr */
    public float m7202lr() {
        return this.f5393lr;
    }

    /* JADX INFO: renamed from: lr */
    public boolean m7203lr(float f, float f2) {
        return this.f5394ri == f && this.f5393lr == f2;
    }

    /* JADX INFO: renamed from: ri */
    public float m7204ri() {
        return this.f5394ri;
    }

    /* JADX INFO: renamed from: ri */
    public void m7205ri(float f, float f2) {
        this.f5394ri = f;
        this.f5393lr = f2;
    }

    public String toString() {
        return m7204ri() + "x" + m7202lr();
    }
}
