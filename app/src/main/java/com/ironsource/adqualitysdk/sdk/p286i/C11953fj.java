package com.ironsource.adqualitysdk.sdk.p286i;

import android.text.TextUtils;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.fj */
/* JADX INFO: loaded from: classes6.dex */
public final class C11953fj extends AbstractC11961fr {

    /* JADX INFO: renamed from: ﻐ */
    private static long f28868 = 0;

    /* JADX INFO: renamed from: ﻛ */
    private static char f28869 = 4581;

    /* JADX INFO: renamed from: ｋ */
    private static int f28870 = 0;

    /* JADX INFO: renamed from: ﾇ */
    private static int f28871 = 1;

    /* JADX INFO: renamed from: ﾒ */
    private static int f28872;

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11961fr
    /* JADX INFO: renamed from: ｋ */
    public final C11908ds mo30195(C11907dr c11907dr, C11877co c11877co) {
        int i = 2 % 2;
        C11908ds c11908ds = new C11908ds(null);
        c11908ds.m30058();
        int i2 = f28871 + 51;
        f28870 = i2 % 128;
        int i3 = i2 % 2;
        return c11908ds;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = f28870 + 57;
        f28871 = i2 % 128;
        int i3 = i2 % 2;
        String strIntern = m30194("\u209eὊ蕡뙰鈤岭«쓂礶", (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1), "\u0000\u0000\u0000\u0000", TextUtils.getTrimmedLength("") - 548652079, "톫䰻믟颩").intern();
        int i4 = f28871 + 69;
        f28870 = i4 % 128;
        int i5 = i4 % 2;
        return strIntern;
    }

    /* JADX INFO: renamed from: ﾒ */
    private static String m30194(String str, char c, String str2, int i, String str3) {
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
                cArr6[C12051j.f29511] = (char) (((((long) (cArr4[i3] ^ cArr3[C12051j.f29511])) ^ f28868) ^ ((long) f28872)) ^ ((long) f28869));
                C12051j.f29511++;
            }
            str4 = new String(cArr6);
        }
        return str4;
    }
}
