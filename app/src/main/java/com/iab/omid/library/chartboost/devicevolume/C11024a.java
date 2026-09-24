package com.iab.omid.library.chartboost.devicevolume;

/* JADX INFO: renamed from: com.iab.omid.library.chartboost.devicevolume.a */
/* JADX INFO: loaded from: classes6.dex */
public class C11024a {
    /* JADX INFO: renamed from: a */
    public float m23702a(int i, int i2) {
        if (i2 <= 0 || i <= 0) {
            return 0.0f;
        }
        float f = i / i2;
        if (f > 1.0f) {
            return 1.0f;
        }
        return f;
    }
}
