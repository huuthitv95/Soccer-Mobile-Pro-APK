package com.bytedance.adsdk.ugeno.yoga;

/* JADX INFO: loaded from: classes3.dex */
public class jbs {
    /* JADX INFO: renamed from: ri */
    public static long m8119ri(float f, float f2) {
        return ((long) Float.floatToRawIntBits(f2)) | (((long) Float.floatToRawIntBits(f)) << 32);
    }

    /* JADX INFO: renamed from: ri */
    public static long m8120ri(int i, int i2) {
        return m8119ri(i, i2);
    }
}
