package com.bytedance.adsdk.p065lr;

/* JADX INFO: renamed from: com.bytedance.adsdk.lr.lr */
/* JADX INFO: loaded from: classes3.dex */
class C2122lr {

    /* JADX INFO: renamed from: ri */
    static final int[] f5118ri = new int[0];

    /* JADX INFO: renamed from: lr */
    static final long[] f5117lr = new long[0];

    /* JADX INFO: renamed from: ik */
    static final Object[] f5116ik = new Object[0];

    /* JADX INFO: renamed from: ri */
    static int m7013ri(int[] iArr, int i, int i2) {
        int i3 = i - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            int i6 = iArr[i5];
            if (i6 < i2) {
                i4 = i5 + 1;
            } else {
                if (i6 <= i2) {
                    return i5;
                }
                i3 = i5 - 1;
            }
        }
        return ~i4;
    }
}
