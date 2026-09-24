package com.facebook.ads.redexgen.core;

import java.io.IOException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.HF */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC5337HF {
    public static String[] A00 = {"o6dy0jxWVFoVpdfIHLQ5kJFOMlq1Sn1Q", "79oj", "9g10QGOLUMPWkkbPiEKlPZ6GdmncXBXa", "6fmIgIVXmOYY3cUB7ZYAXnWSgE20TitB", "v6a7Yb3DANDL70kkwlzLnkI1heNzynkm", "eDdjZQkAYxVEYJ3d9Q78IvgSo191T7ve", "sHmXnPOOobIrXpWrquJBTDw1maWJKk3u", "k0vF7vRBeJQaOBXZ"};

    public static int A00(C45944v c45944v, int i) {
        switch (i) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i - 2);
            case 6:
                return c45944v.A0I() + 1;
            case 7:
                int iA0M = c45944v.A0M();
                String[] strArr = A00;
                if (strArr[6].charAt(23) != strArr[4].charAt(23)) {
                    throw new RuntimeException();
                }
                A00[7] = "hcXiJWofr5Txci555yuma5X";
                return iA0M + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i - 8);
            default:
                return -1;
        }
    }

    public static long A01(InterfaceC7263ms interfaceC7263ms, C5341HJ c5341hj) throws IOException {
        interfaceC7263ms.AIl();
        boolean z = true;
        interfaceC7263ms.A47(1);
        byte[] bArr = new byte[1];
        interfaceC7263ms.AGt(bArr, 0, 1);
        if ((bArr[0] & 1) != 1) {
            z = false;
        }
        interfaceC7263ms.A47(2);
        int i = z ? 7 : 6;
        C45944v c45944v = new C45944v(i);
        c45944v.A0e(AbstractC5333HB.A00(interfaceC7263ms, c45944v.A0l(), 0, i));
        interfaceC7263ms.AIl();
        C5336HE c5336he = new C5336HE();
        boolean isBlockSizeVariable = A08(c45944v, c5341hj, z, c5336he);
        if (isBlockSizeVariable) {
            return c5336he.A00;
        }
        throw C44963K.A01(null, null);
    }

    public static boolean A02(int i, C5341HJ c5341hj) {
        if (i == 0) {
            return true;
        }
        int i2 = c5341hj.A01;
        if (A00[7].length() == 8) {
            throw new RuntimeException();
        }
        A00[0] = "dnyA5Em4Vekc9hKZNMMqKWCBR5ivXppC";
        return i == i2;
    }

    public static boolean A03(int i, C5341HJ c5341hj) {
        if (i <= 7) {
            return i == c5341hj.A02 - 1;
        }
        if (A00[3].charAt(10) != 'Y') {
            throw new RuntimeException();
        }
        A00[3] = "e0AkGTV6jhYRPjlSs9AVJSXBXenCNngQ";
        return i <= 10 && c5341hj.A02 == 2;
    }

    public static boolean A04(C45944v c45944v, int i) {
        int iA0I = c45944v.A0I();
        int crc = c45944v.A09();
        return iA0I == AbstractC46115C.A0J(c45944v.A0l(), i, crc + (-1), 0);
    }

    public static boolean A05(C45944v c45944v, C5341HJ c5341hj, int i) {
        int iA00 = A00(c45944v, i);
        if (iA00 != -1) {
            int blockSizeSamples = c5341hj.A03;
            if (iA00 <= blockSizeSamples) {
                return true;
            }
        }
        return false;
    }

    public static boolean A06(C45944v c45944v, C5341HJ c5341hj, int i) {
        int sampleRate = c5341hj.A07;
        if (i == 0) {
            return true;
        }
        if (i <= 11) {
            return i == c5341hj.A08;
        }
        if (i == 12) {
            return c45944v.A0I() * 1000 == sampleRate;
        }
        if (i > 14) {
            return false;
        }
        int expectedSampleRate = c45944v.A0M();
        if (i == 14) {
            expectedSampleRate *= 10;
        }
        return expectedSampleRate == sampleRate;
    }

    public static boolean A07(C45944v c45944v, C5341HJ c5341hj, int i, C5336HE c5336he) {
        int iA09 = c45944v.A09();
        long jA0Q = c45944v.A0Q();
        long frameHeaderBytes = jA0Q >>> 16;
        if (frameHeaderBytes != i) {
            return false;
        }
        int blockSizeKey = (int) ((jA0Q >> 8) & 15);
        long frameHeaderBytes2 = jA0Q >> 1;
        int frameStartPosition = (int) (frameHeaderBytes2 & 7);
        return A03((int) ((jA0Q >> 4) & 15), c5341hj) && A02(frameStartPosition, c5341hj) && !(((jA0Q & 1) > 1L ? 1 : ((jA0Q & 1) == 1L ? 0 : -1)) == 0) && A08(c45944v, c5341hj, (((jA0Q >>> 16) & 1) > 1L ? 1 : (((jA0Q >>> 16) & 1) == 1L ? 0 : -1)) == 0, c5336he) && A05(c45944v, c5341hj, (int) ((jA0Q >> 12) & 15)) && A06(c45944v, c5341hj, blockSizeKey) && A04(c45944v, iA09);
    }

    public static boolean A08(C45944v c45944v, C5341HJ c5341hj, boolean z, C5336HE c5336he) {
        long utf8Value;
        try {
            long jA0S = c45944v.A0S();
            if (z) {
                utf8Value = jA0S;
            } else {
                long utf8Value2 = c5341hj.A03;
                utf8Value = utf8Value2 * jA0S;
            }
            c5336he.A00 = utf8Value;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static boolean A09(InterfaceC7263ms interfaceC7263ms, C5341HJ c5341hj, int i, C5336HE c5336he) throws IOException {
        long jA8i = interfaceC7263ms.A8i();
        byte[] bArr = new byte[2];
        interfaceC7263ms.AGt(bArr, 0, 2);
        if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i) {
            interfaceC7263ms.AIl();
            interfaceC7263ms.A47((int) (jA8i - interfaceC7263ms.A8n()));
            return false;
        }
        C45944v c45944v = new C45944v(16);
        System.arraycopy(bArr, 0, c45944v.A0l(), 0, 2);
        byte[] frameStartBytes = c45944v.A0l();
        c45944v.A0e(AbstractC5333HB.A00(interfaceC7263ms, frameStartBytes, 2, 14));
        interfaceC7263ms.AIl();
        interfaceC7263ms.A47((int) (jA8i - interfaceC7263ms.A8n()));
        return A07(c45944v, c5341hj, i, c5336he);
    }
}
