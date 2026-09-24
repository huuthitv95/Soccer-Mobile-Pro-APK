package com.ironsource.adqualitysdk.sdk.p286i;

import android.widget.ExpandableListView;
import com.google.android.exoplayer2.C9415C;
import java.io.UnsupportedEncodingException;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.fm */
/* JADX INFO: loaded from: classes6.dex */
public final class C11956fm extends AbstractC11961fr {

    /* JADX INFO: renamed from: ﺙ */
    private static int f28885 = 1;

    /* JADX INFO: renamed from: ﻐ */
    private static int f28886 = 233;

    /* JADX INFO: renamed from: ﻛ */
    private static boolean f28887 = true;

    /* JADX INFO: renamed from: ｋ */
    private static char[] f28888 = {331, 347, 334, 330, 340, 292};

    /* JADX INFO: renamed from: ﾇ */
    private static boolean f28889 = true;

    /* JADX INFO: renamed from: ﾒ */
    private static int f28890;

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11961fr
    /* JADX INFO: renamed from: ｋ */
    public final C11908ds mo30195(C11907dr c11907dr, C11877co c11877co) {
        int i = 2 % 2;
        C11908ds c11908ds = new C11908ds(null);
        c11908ds.m30059();
        int i2 = f28885 + 79;
        f28890 = i2 % 128;
        int i3 = i2 % 2;
        return c11908ds;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = f28890 + 41;
        f28885 = i2 % 128;
        int i3 = i2 % 2;
        String strIntern = m30200(null, ExpandableListView.getPackedPositionChild(0L) + 128, null, "\u0086\u0085\u0084\u0083\u0082\u0081").intern();
        int i4 = f28885 + 9;
        f28890 = i4 % 128;
        int i5 = i4 % 2;
        return strIntern;
    }

    /* JADX INFO: renamed from: ﾒ */
    private static String m30200(String str, int i, int[] iArr, String str2) throws UnsupportedEncodingException {
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
            char[] cArr2 = f28888;
            int i2 = f28886;
            if (f28887) {
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
            if (f28889) {
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
