package com.ironsource.adqualitysdk.sdk.p286i;

import android.os.Process;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.fn */
/* JADX INFO: loaded from: classes6.dex */
public final class C11957fn extends C11951fh<String> {

    /* JADX INFO: renamed from: ﻐ */
    private static char f28891 = 0;

    /* JADX INFO: renamed from: ﻛ */
    private static int f28892 = 1;

    /* JADX INFO: renamed from: ｋ */
    private static int f28893 = 570137165;

    /* JADX INFO: renamed from: ﾇ */
    private static int f28894;

    /* JADX INFO: renamed from: ﾒ */
    private static long f28895;

    public C11957fn(String str, C11904do c11904do) {
        super(C11914dy.m30142(str), c11904do);
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.C11951fh
    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder();
        sb.append(m30201("䣑", (char) (32723 - (ViewConfiguration.getPressedStateDuration() >> 16)), "\u0000\u0000\u0000\u0000", 1029546106 - Process.getGidForName(""), "篻嶠팽쥿").intern());
        sb.append(super.toString());
        sb.append(m30201("䣑", (char) (View.MeasureSpec.getMode(0) + 32723), "\u0000\u0000\u0000\u0000", 1029546107 - View.combineMeasuredStates(0, 0), "篻嶠팽쥿").intern());
        String string = sb.toString();
        int i2 = f28892 + 95;
        f28894 = i2 % 128;
        int i3 = i2 % 2;
        return string;
    }

    /* JADX INFO: renamed from: ﻐ */
    private static String m30201(String str, char c, String str2, int i, String str3) {
        String str4;
        Object charArray = str3;
        if (str3 != null) {
            charArray = str3.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        Object charArray2 = str2;
        if (str2 != null) {
            charArray2 = str2.toCharArray();
        }
        char[] cArr2 = (char[]) charArray2;
        Object charArray3 = str;
        if (str != null) {
            charArray3 = str.toCharArray();
        }
        char[] cArr3 = (char[]) charArray3;
        synchronized (C12051j.f29510) {
            char[] cArr4 = (char[]) cArr.clone();
            char[] cArr5 = (char[]) cArr2.clone();
            cArr4[0] = (char) (c ^ cArr4[0]);
            cArr5[2] = (char) (cArr5[2] + ((char) i));
            int length = cArr3.length;
            char[] cArr6 = new char[length];
            C12051j.f29511 = 0;
            while (C12051j.f29511 < length) {
                int i2 = (C12051j.f29511 + 2) % 4;
                int i3 = (C12051j.f29511 + 3) % 4;
                C12051j.f29509 = (char) (((cArr4[C12051j.f29511 % 4] * 32718) + cArr5[i2]) % 65535);
                cArr5[i3] = (char) (((cArr4[i3] * 32718) + cArr5[i2]) / 65535);
                cArr4[i3] = C12051j.f29509;
                cArr6[C12051j.f29511] = (char) (((((long) (cArr4[i3] ^ cArr3[C12051j.f29511])) ^ f28895) ^ ((long) f28893)) ^ ((long) f28891));
                C12051j.f29511++;
            }
            str4 = new String(cArr6);
        }
        return str4;
    }
}
