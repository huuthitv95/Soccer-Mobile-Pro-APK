package com.ironsource.adqualitysdk.sdk.p286i;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C11943f {

    /* JADX INFO: renamed from: ﻛ */
    public static int f28846;

    /* JADX INFO: renamed from: ﾇ */
    public static int f28847;

    /* JADX INFO: renamed from: ﾒ */
    public static final Object f28848 = new Object();

    /* JADX INFO: renamed from: ﾇ */
    public static char[] m30189(long j, char[] cArr, int i) {
        int length = cArr.length;
        char[] cArr2 = new char[length];
        int i2 = 0;
        int i3 = 4;
        for (int i4 = 0; i4 < cArr.length; i4++) {
            if ((((j >>> i4) & 1) != i || i2 >= 4) && i3 < length) {
                cArr2[i3] = cArr[i4];
                i3++;
            } else {
                cArr2[i2] = cArr[i4];
                i2++;
            }
        }
        return cArr2;
    }
}
