package com.ironsource.adqualitysdk.sdk.p286i;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C11835b {

    /* JADX INFO: renamed from: ﻐ */
    public static int f27461;

    /* JADX INFO: renamed from: ﻛ */
    public static int f27462;

    /* JADX INFO: renamed from: ﾇ */
    public static int f27463;

    /* JADX INFO: renamed from: ﾒ */
    public static final Object f27464 = new Object();

    /* JADX INFO: renamed from: ﻐ */
    public static void m28718(int[] iArr) {
        for (int i = 0; i < iArr.length / 2; i++) {
            int i2 = iArr[i];
            iArr[i] = iArr[(iArr.length - i) - 1];
            iArr[(iArr.length - i) - 1] = i2;
        }
    }

    /* JADX INFO: renamed from: ﻐ */
    public static int m28717(int i) {
        C11808a c11808a = C11808a.f26876;
        return ((c11808a.f26879[0][i >>> 24] + c11808a.f26879[1][(i >>> 16) & 255]) ^ c11808a.f26879[2][(i >>> 8) & 255]) + c11808a.f26879[3][i & 255];
    }
}
