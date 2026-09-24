package com.bytedance.adsdk.p065lr.p066di;

/* JADX INFO: renamed from: com.bytedance.adsdk.lr.di.ka */
/* JADX INFO: loaded from: classes3.dex */
public class C2020ka {

    /* JADX INFO: renamed from: lr */
    private int f4754lr;

    /* JADX INFO: renamed from: ri */
    private float f4755ri;

    /* JADX INFO: renamed from: ri */
    public void m6586ri(float f) {
        float f2 = this.f4755ri + f;
        this.f4755ri = f2;
        int i = this.f4754lr + 1;
        this.f4754lr = i;
        if (i == Integer.MAX_VALUE) {
            this.f4755ri = f2 / 2.0f;
            this.f4754lr = i / 2;
        }
    }
}
