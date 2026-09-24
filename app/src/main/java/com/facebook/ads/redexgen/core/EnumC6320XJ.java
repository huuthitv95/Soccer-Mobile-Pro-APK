package com.facebook.ads.redexgen.core;

import com.google.common.base.Ascii;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.XJ */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public enum EnumC6320XJ {
    A04,
    A03,
    A02;

    public static byte[] A00;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 44);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{99, 100, 99, 126, 99, 107, 102, 99, 112, 111, 110, Ascii.DC2, Ascii.NAK, Ascii.DC2, Ascii.f22499SI, Ascii.DC2, Ascii.SUB, Ascii.ETB, Ascii.DC2, 1, Ascii.DC2, Ascii.NAK, Ascii.f22493FS, Ascii.CAN, Ascii.f22491EM, 2, 9, Ascii.f22502US, Ascii.CAN, Ascii.f22502US, 2, Ascii.f22502US, Ascii.ETB, Ascii.SUB, Ascii.f22502US, Ascii.f22492FF, 19, Ascii.DC2};
    }

    static {
        A01();
    }
}
