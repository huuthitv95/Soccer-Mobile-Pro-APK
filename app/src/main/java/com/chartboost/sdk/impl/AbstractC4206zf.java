package com.chartboost.sdk.impl;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.zf */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4206zf {
    /* JADX INFO: renamed from: a */
    public static final int m20149a(float f) {
        if (f == 0.0f) {
            return 0;
        }
        double d = f;
        if (d < 0.25d) {
            return 1;
        }
        if (d < 0.5d) {
            return 2;
        }
        if (d < 0.75d) {
            return 3;
        }
        return f < 1.0f ? 4 : 5;
    }
}
