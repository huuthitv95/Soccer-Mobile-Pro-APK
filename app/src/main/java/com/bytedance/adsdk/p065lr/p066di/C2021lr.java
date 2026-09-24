package com.bytedance.adsdk.p065lr.p066di;

/* JADX INFO: renamed from: com.bytedance.adsdk.lr.di.lr */
/* JADX INFO: loaded from: classes3.dex */
public class C2021lr {
    /* JADX INFO: renamed from: lr */
    private static float m6587lr(float f) {
        return f <= 0.04045f ? f / 12.92f : (float) Math.pow((f + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    /* JADX INFO: renamed from: ri */
    private static float m6588ri(float f) {
        return f <= 0.0031308f ? f * 12.92f : (float) ((Math.pow(f, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
    }

    /* JADX INFO: renamed from: ri */
    public static int m6589ri(float f, int i, int i2) {
        if (i == i2) {
            return i;
        }
        float f2 = ((i >> 24) & 255) / 255.0f;
        float fM6587lr = m6587lr(((i >> 16) & 255) / 255.0f);
        float fM6587lr2 = m6587lr(((i >> 8) & 255) / 255.0f);
        float fM6587lr3 = m6587lr((i & 255) / 255.0f);
        float fM6587lr4 = m6587lr(((i2 >> 16) & 255) / 255.0f);
        float f3 = f2 + (((((i2 >> 24) & 255) / 255.0f) - f2) * f);
        float fM6587lr5 = fM6587lr2 + ((m6587lr(((i2 >> 8) & 255) / 255.0f) - fM6587lr2) * f);
        float fM6587lr6 = fM6587lr3 + (f * (m6587lr((i2 & 255) / 255.0f) - fM6587lr3));
        return (Math.round(m6588ri(fM6587lr + ((fM6587lr4 - fM6587lr) * f)) * 255.0f) << 16) | (Math.round(f3 * 255.0f) << 24) | (Math.round(m6588ri(fM6587lr5) * 255.0f) << 8) | Math.round(m6588ri(fM6587lr6) * 255.0f);
    }
}
