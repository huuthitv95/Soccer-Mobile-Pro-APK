package com.ironsource.adqualitysdk.sdk.p286i;

import com.google.common.base.Ascii;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.p300io.encoding.Base64;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.if */
/* JADX INFO: loaded from: classes6.dex */
public class C12030if {

    /* JADX INFO: renamed from: ﱟ */
    private static int f29305 = 1;

    /* JADX INFO: renamed from: ﻐ */
    private static int f29306;

    /* JADX INFO: renamed from: ﻛ */
    private static final byte[] f29307;

    /* JADX INFO: renamed from: ｋ */
    private static /* synthetic */ boolean f29308;

    /* JADX INFO: renamed from: ﾇ */
    private static final byte[] f29309;

    /* JADX INFO: renamed from: ﾒ */
    private static int[] f29310;

    /* JADX INFO: renamed from: ﻐ */
    static void m30478() {
        f29310 = new int[]{1015010547, 1131366905, -855694311, -147607026, 269998831, 978353891, -1708672086, 247378653, 1603668467, -318527289, -74464496, -1284968024, 2067083435, -966313127, -1424406812, 1536274771, 2025412292, 1126305103};
    }

    static {
        m30478();
        int i = f29306 + 1;
        f29305 = i % 128;
        int i2 = i % 2;
        int i3 = 2 % 2;
        f29308 = true;
        f29307 = new byte[]{65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
        f29309 = new byte[]{-9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 62, -9, -9, -9, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, Base64.padSymbol, -9, -9, -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, Ascii.f22503VT, Ascii.f22492FF, Ascii.f22490CR, Ascii.f22500SO, Ascii.f22499SI, Ascii.DLE, 17, Ascii.DC2, 19, Ascii.DC4, Ascii.NAK, Ascii.SYN, Ascii.ETB, Ascii.CAN, Ascii.f22491EM, -9, -9, -9, -9, -9, -9, Ascii.SUB, Ascii.ESC, Ascii.f22493FS, Ascii.f22494GS, Ascii.f22498RS, Ascii.f22502US, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -9, -9, -9, -9, -9};
    }

    private C12030if() {
    }

    /* JADX INFO: renamed from: ﻛ */
    private static byte[] m30481(byte[] bArr, int i, int i2, byte[] bArr2, int i3, byte[] bArr3) {
        int i4;
        int i5 = 2 % 2;
        int i6 = 0;
        if (i2 > 0) {
            int i7 = f29306 + 43;
            f29305 = i7 % 128;
            i4 = i7 % 2 == 0 ? (bArr[i] >> 66) / 68 : (bArr[i] << Ascii.CAN) >>> 8;
        } else {
            i4 = 0;
        }
        int i8 = i4 | (i2 > 1 ? (bArr[i + 1] << Ascii.CAN) >>> 16 : 0);
        if (i2 > 2) {
            int i9 = f29305 + 71;
            f29306 = i9 % 128;
            i6 = i9 % 2 != 0 ? (bArr[i / 2] * 99) % 114 : (bArr[i + 2] << Ascii.CAN) >>> 24;
        }
        int i10 = i8 | i6;
        if (i2 == 1) {
            bArr2[i3] = bArr3[i10 >>> 18];
            bArr2[i3 + 1] = bArr3[(i10 >>> 12) & 63];
            bArr2[i3 + 2] = Base64.padSymbol;
            bArr2[i3 + 3] = Base64.padSymbol;
            return bArr2;
        }
        if (i2 == 2) {
            bArr2[i3] = bArr3[i10 >>> 18];
            bArr2[i3 + 1] = bArr3[(i10 >>> 12) & 63];
            bArr2[i3 + 2] = bArr3[(i10 >>> 6) & 63];
            bArr2[i3 + 3] = Base64.padSymbol;
            return bArr2;
        }
        if (i2 != 3) {
            return bArr2;
        }
        bArr2[i3] = bArr3[i10 >>> 18];
        bArr2[i3 + 1] = bArr3[(i10 >>> 12) & 63];
        bArr2[i3 + 2] = bArr3[(i10 >>> 6) & 63];
        bArr2[i3 + 3] = bArr3[i10 & 63];
        int i11 = f29306 + 99;
        f29305 = i11 % 128;
        if (i11 % 2 != 0) {
            return bArr2;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ */
    public static String m30484(byte[] bArr) {
        int i = 2 % 2;
        int i2 = f29305 + 47;
        f29306 = i2 % 128;
        int i3 = i2 % 2;
        String strM30485 = m30485(bArr, bArr.length, f29307);
        int i4 = f29306 + 97;
        f29305 = i4 % 128;
        int i5 = i4 % 2;
        return strM30485;
    }

    /* JADX INFO: renamed from: ﾒ */
    private static String m30485(byte[] bArr, int i, byte[] bArr2) {
        int i2 = 2 % 2;
        byte[] bArrM30479 = m30479(bArr, 0, i, bArr2);
        String str = new String(bArrM30479, 0, bArrM30479.length);
        int i3 = f29305 + 31;
        f29306 = i3 % 128;
        int i4 = i3 % 2;
        return str;
    }

    /* JADX INFO: renamed from: ﻐ */
    private static byte[] m30479(byte[] bArr, int i, int i2, byte[] bArr2) {
        int i3 = 2 % 2;
        int i4 = ((i2 + 2) / 3) << 2;
        int i5 = i4 + (i4 / Integer.MAX_VALUE);
        byte[] bArr3 = new byte[i5];
        int i6 = i2 - 2;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (i7 < i6) {
            int i10 = ((bArr[i7] << Ascii.CAN) >>> 8) | ((bArr[i7 + 1] << Ascii.CAN) >>> 16) | ((bArr[i7 + 2] << Ascii.CAN) >>> 24);
            bArr3[i8] = bArr2[i10 >>> 18];
            int i11 = i8 + 1;
            bArr3[i11] = bArr2[(i10 >>> 12) & 63];
            bArr3[i8 + 2] = bArr2[(i10 >>> 6) & 63];
            bArr3[i8 + 3] = bArr2[i10 & 63];
            i9 += 4;
            if (i9 == Integer.MAX_VALUE) {
                int i12 = f29305 + 15;
                f29306 = i12 % 128;
                if (i12 % 2 != 0) {
                    bArr3[i8 >>> 5] = 57;
                    i8 += Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
                } else {
                    bArr3[i8 + 4] = 10;
                    i8 = i11;
                }
                i9 = 0;
            }
            i7 += 3;
            i8 += 4;
        }
        if (i7 < i2) {
            m30481(bArr, i7, i2 - i7, bArr3, i8, bArr2);
            if (i9 + 4 == Integer.MAX_VALUE) {
                int i13 = f29306 + 1;
                int i14 = i13 % 128;
                f29305 = i14;
                int i15 = i13 % 2;
                bArr3[i8 + 4] = 10;
                i8++;
                int i16 = i14 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
                f29306 = i16 % 128;
                int i17 = i16 % 2;
            }
            i8 += 4;
        }
        if ((!f29308) && i8 != i5) {
            throw new AssertionError();
        }
        return bArr3;
    }

    /* JADX INFO: renamed from: ｋ */
    private static int m30482(byte[] bArr, byte[] bArr2, int i, byte[] bArr3) {
        int i2 = 2 % 2;
        int i3 = f29306;
        int i4 = i3 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
        f29305 = i4 % 128;
        if (i4 % 2 != 0 ? bArr[2] == 61 : bArr[3] == 42) {
            bArr2[i] = (byte) ((((bArr3[bArr[1]] << Ascii.CAN) >>> 12) | ((bArr3[bArr[0]] << Ascii.CAN) >>> 6)) >>> 16);
            return 1;
        }
        byte b = bArr[3];
        if (b != 61) {
            int i5 = ((bArr3[bArr[2]] << Ascii.CAN) >>> 18) | ((bArr3[bArr[0]] << Ascii.CAN) >>> 6) | ((bArr3[bArr[1]] << Ascii.CAN) >>> 12) | ((bArr3[b] << Ascii.CAN) >>> 24);
            bArr2[i] = (byte) (i5 >> 16);
            bArr2[i + 1] = (byte) (i5 >> 8);
            bArr2[i + 2] = (byte) i5;
            return 3;
        }
        int i6 = i3 + 81;
        f29305 = i6 % 128;
        int i7 = i6 % 2;
        int i8 = ((bArr3[bArr[2]] << Ascii.CAN) >>> 18) | ((bArr3[bArr[0]] << Ascii.CAN) >>> 6) | ((bArr3[bArr[1]] << Ascii.CAN) >>> 12);
        bArr2[i] = (byte) (i8 >>> 16);
        bArr2[i + 1] = (byte) (i8 >>> 8);
        return 2;
    }

    /* JADX INFO: renamed from: ﾒ */
    public static byte[] m30486(String str) throws C12029ie {
        int i = 2 % 2;
        int i2 = f29306 + 57;
        f29305 = i2 % 128;
        int i3 = i2 % 2;
        byte[] bytes = str.getBytes();
        byte[] bArrM30487 = m30487(bytes, bytes.length);
        int i4 = f29306 + 93;
        f29305 = i4 % 128;
        if (i4 % 2 != 0) {
            return bArrM30487;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ */
    private static byte[] m30487(byte[] bArr, int i) throws C12029ie {
        int i2 = 2 % 2;
        int i3 = f29305 + 95;
        f29306 = i3 % 128;
        int i4 = i3 % 2;
        byte[] bArrM30480 = m30480(bArr, 0, i, f29309);
        int i5 = f29306 + 107;
        f29305 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 66 / 0;
        }
        return bArrM30480;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0050  */
    /* JADX WARN: Code duplicated, block: B:23:0x0060  */
    /* JADX WARN: Code duplicated, block: B:27:0x006c  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:43:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:44:0x0110  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0075, code lost:
    
        if (r6 <= 1) goto L32;
     */
    /* JADX INFO: renamed from: ﻛ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static byte[] m30480(byte[] r18, int r19, int r20, byte[] r21) throws com.ironsource.adqualitysdk.sdk.p286i.C12029ie {
        /*
            Method dump skipped, instruction units count: 718
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.p286i.C12030if.m30480(byte[], int, int, byte[]):byte[]");
    }

    /* JADX INFO: renamed from: ｋ */
    private static String m30483(int[] iArr, int i) {
        String str;
        synchronized (C11835b.f27464) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) f29310.clone();
            C11835b.f27462 = 0;
            while (C11835b.f27462 < iArr.length) {
                cArr[0] = (char) (iArr[C11835b.f27462] >> 16);
                cArr[1] = (char) iArr[C11835b.f27462];
                cArr[2] = (char) (iArr[C11835b.f27462 + 1] >> 16);
                cArr[3] = (char) iArr[C11835b.f27462 + 1];
                C11835b.f27463 = (cArr[0] << 16) + cArr[1];
                C11835b.f27461 = (cArr[2] << 16) + cArr[3];
                C11835b.m28718(iArr2);
                for (int i2 = 0; i2 < 16; i2++) {
                    int i3 = C11835b.f27463 ^ iArr2[i2];
                    C11835b.f27463 = i3;
                    C11835b.f27461 = C11835b.m28717(i3) ^ C11835b.f27461;
                    int i4 = C11835b.f27463;
                    C11835b.f27463 = C11835b.f27461;
                    C11835b.f27461 = i4;
                }
                int i5 = C11835b.f27463;
                C11835b.f27463 = C11835b.f27461;
                C11835b.f27461 = i5;
                C11835b.f27461 = i5 ^ iArr2[16];
                C11835b.f27463 ^= iArr2[17];
                int i6 = C11835b.f27463;
                int i7 = C11835b.f27461;
                cArr[0] = (char) (C11835b.f27463 >>> 16);
                cArr[1] = (char) C11835b.f27463;
                cArr[2] = (char) (C11835b.f27461 >>> 16);
                cArr[3] = (char) C11835b.f27461;
                C11835b.m28718(iArr2);
                cArr2[C11835b.f27462 << 1] = cArr[0];
                cArr2[(C11835b.f27462 << 1) + 1] = cArr[1];
                cArr2[(C11835b.f27462 << 1) + 2] = cArr[2];
                cArr2[(C11835b.f27462 << 1) + 3] = cArr[3];
                C11835b.f27462 += 2;
            }
            str = new String(cArr2, 0, i);
        }
        return str;
    }
}
