package com.mbridge.msdk.foundation.tools;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: renamed from: com.mbridge.msdk.foundation.tools.j0 */
/* JADX INFO: compiled from: SameBase64Decoder.java */
/* JADX INFO: loaded from: classes6.dex */
public class C13205j0 {

    /* JADX INFO: renamed from: a */
    public static final char[] f36311a;

    /* JADX INFO: renamed from: b */
    public static final int[] f36312b;

    static {
        char[] charArray = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".toCharArray();
        f36311a = charArray;
        int[] iArr = new int[256];
        f36312b = iArr;
        Arrays.fill(iArr, -1);
        int length = charArray.length;
        for (int i = 0; i < length; i++) {
            f36312b[f36311a[i]] = i;
        }
        f36312b[61] = 0;
    }

    /* JADX INFO: renamed from: a */
    public static String m37710a(String str) {
        byte[] bArrM37711b = m37711b(str);
        return (bArrM37711b == null || bArrM37711b.length == 0) ? "" : new String(bArrM37711b, StandardCharsets.UTF_8);
    }

    /* JADX INFO: renamed from: b */
    public static byte[] m37711b(String str) {
        int i;
        int i2;
        int length = str.length();
        if (length == 0) {
            return new byte[0];
        }
        int i3 = length - 1;
        int i4 = 0;
        while (i4 < i3 && f36312b[str.charAt(i4) & 255] < 0) {
            i4++;
        }
        while (i3 > 0 && f36312b[str.charAt(i3) & 255] < 0) {
            i3--;
        }
        if (str.charAt(i3) == '=') {
            i = str.charAt(i3 + (-1)) == '=' ? 2 : 1;
        } else {
            i = 0;
        }
        int i5 = (i3 - i4) + 1;
        if (length > 76) {
            i2 = (str.charAt(76) == '\r' ? i5 / 78 : 0) << 1;
        } else {
            i2 = 0;
        }
        int i6 = (((i5 - i2) * 6) >> 3) - i;
        byte[] bArr = new byte[i6];
        int i7 = (i6 / 3) * 3;
        int i8 = 0;
        int i9 = 0;
        while (i8 < i7) {
            int[] iArr = f36312b;
            int i10 = i4 + 4;
            int i11 = iArr[str.charAt(i4 + 3)] | (iArr[str.charAt(i4 + 1)] << 12) | (iArr[str.charAt(i4)] << 18) | (iArr[str.charAt(i4 + 2)] << 6);
            bArr[i8] = (byte) (i11 >> 16);
            int i12 = i8 + 2;
            bArr[i8 + 1] = (byte) (i11 >> 8);
            i8 += 3;
            bArr[i12] = (byte) i11;
            if (i2 <= 0 || (i9 = i9 + 1) != 19) {
                i4 = i10;
            } else {
                i4 += 6;
                i9 = 0;
            }
        }
        if (i8 < i6) {
            int i13 = 0;
            int i14 = 0;
            while (i4 <= i3 - i) {
                i13 |= f36312b[str.charAt(i4)] << (18 - (i14 * 6));
                i14++;
                i4++;
            }
            int i15 = 16;
            while (i8 < i6) {
                bArr[i8] = (byte) (i13 >> i15);
                i15 -= 8;
                i8++;
            }
        }
        return bArr;
    }
}
