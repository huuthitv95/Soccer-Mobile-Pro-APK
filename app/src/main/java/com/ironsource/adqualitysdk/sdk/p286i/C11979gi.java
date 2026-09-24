package com.ironsource.adqualitysdk.sdk.p286i;

import android.text.TextUtils;
import android.view.ViewConfiguration;
import com.google.android.exoplayer2.C9415C;
import com.hyprmx.android.sdk.placement.PlacementType;
import java.io.UnsupportedEncodingException;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.gi */
/* JADX INFO: loaded from: classes6.dex */
public final class C11979gi extends AbstractC11980gj {

    /* JADX INFO: renamed from: ﺙ */
    private static int f29011 = 1;

    /* JADX INFO: renamed from: ﻐ */
    private static int f29012 = 0;

    /* JADX INFO: renamed from: ﻛ */
    private static int f29013 = 159;

    /* JADX INFO: renamed from: ｋ */
    private static char[] f29014 = {258, 270, 268, 205, 263, 280, 271, 273, 279, 256, 269, 259, 264, 274, 266, 267, 260, 275, 239, 243};

    /* JADX INFO: renamed from: ﾇ */
    private static boolean f29015 = true;

    /* JADX INFO: renamed from: ﾒ */
    private static boolean f29016 = true;

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11980gj
    /* JADX INFO: renamed from: ﾇ */
    public final String mo30211() {
        int i = 2 % 2;
        int i2 = f29011 + 73;
        f29012 = i2 % 128;
        String strIntern = m30229(null, i2 % 2 != 0 ? TextUtils.indexOf((CharSequence) "", '\f', 1, 1) + 33 : 126 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), null, "\u0091\u0087\u0086\u0094\u0092\u008b\u0091\u0083\u0091\u0081\u008a\u0090\u0093\u0084\u0092\u008b\u0091\u0083\u0091\u0081\u008a\u0090\u0087\u0084\u008f\u008c\u008e\u0084\u008c\u008d\u0082\u0088\u008c\u008b\u008a\u0084\u0089\u0083\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern();
        int i3 = f29011 + 31;
        f29012 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 38 / 0;
        }
        return strIntern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11980gj
    /* JADX INFO: renamed from: ﾒ */
    public final Class mo30212() {
        int i = 2 % 2;
        int i2 = f29011;
        int i3 = i2 + 89;
        f29012 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 69;
        f29012 = i5 % 128;
        int i6 = i5 % 2;
        return PlacementType.class;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11980gj
    /* JADX INFO: renamed from: ｋ */
    public final AbstractC11840be mo30210() {
        int i = 2 % 2;
        C11849bn c11849bn = new C11849bn(mo30209());
        int i2 = f29012 + 37;
        f29011 = i2 % 128;
        int i3 = i2 % 2;
        return c11849bn;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11980gj
    /* JADX INFO: renamed from: ﻛ */
    public final String mo30209() {
        int i = 2 % 2;
        int i2 = f29012 + 15;
        f29011 = i2 % 128;
        String strIntern = m30229(null, i2 % 2 == 0 ? 16 << (ViewConfiguration.getWindowTouchSlop() >>> 34) : (ViewConfiguration.getWindowTouchSlop() >> 8) + 127, null, "\u0089\u0083\u0088\u0087\u0086\u0085").intern();
        int i3 = f29011 + 91;
        f29012 = i3 % 128;
        if (i3 % 2 == 0) {
            return strIntern;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ */
    private static String m30229(String str, int i, int[] iArr, String str2) throws UnsupportedEncodingException {
        Object bytes = str2;
        if (str2 != null) {
            bytes = str2.getBytes(C9415C.ISO88591_NAME);
        }
        byte[] bArr = (byte[]) bytes;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (C12088o.f29838) {
            char[] cArr2 = f29014;
            int i2 = f29013;
            if (f29016) {
                int length = bArr.length;
                C12088o.f29839 = length;
                char[] cArr3 = new char[length];
                C12088o.f29840 = 0;
                while (C12088o.f29840 < C12088o.f29839) {
                    cArr3[C12088o.f29840] = (char) (cArr2[bArr[(C12088o.f29839 - 1) - C12088o.f29840] + i] - i2);
                    C12088o.f29840++;
                }
                return new String(cArr3);
            }
            if (f29015) {
                int length2 = cArr.length;
                C12088o.f29839 = length2;
                char[] cArr4 = new char[length2];
                C12088o.f29840 = 0;
                while (C12088o.f29840 < C12088o.f29839) {
                    cArr4[C12088o.f29840] = (char) (cArr2[cArr[(C12088o.f29839 - 1) - C12088o.f29840] - i] - i2);
                    C12088o.f29840++;
                }
                return new String(cArr4);
            }
            int length3 = iArr.length;
            C12088o.f29839 = length3;
            char[] cArr5 = new char[length3];
            C12088o.f29840 = 0;
            while (C12088o.f29840 < C12088o.f29839) {
                cArr5[C12088o.f29840] = (char) (cArr2[iArr[(C12088o.f29839 - 1) - C12088o.f29840] - i] - i2);
                C12088o.f29840++;
            }
            return new String(cArr5);
        }
    }
}
