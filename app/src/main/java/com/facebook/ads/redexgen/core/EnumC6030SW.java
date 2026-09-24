package com.facebook.ads.redexgen.core;

import com.google.common.base.Ascii;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.SW */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public enum EnumC6030SW {
    A08,
    A04,
    A02,
    A06,
    A07,
    A05,
    A03,
    A09;

    public static byte[] A00;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 122);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{10, Ascii.f22499SI, Ascii.CAN, Ascii.f22503VT, 9, Ascii.SUB, -32, -51, -32, -6, -17, -32, -18, -17, 57, 53, 39, 52, -54, -53, -37, -61, -55, -49, 41, Ascii.f22493FS, Ascii.f22494GS, 35, Ascii.f22493FS, Ascii.SUB, 43, 32, 38, 37, 39, Ascii.f22491EM, 38, 42, Ascii.f22494GS, Ascii.ETB, Ascii.f22491EM, Ascii.f22493FS, 17, 10, Ascii.ESC, Ascii.f22500SO, Ascii.f22490CR, 40, Ascii.f22491EM, Ascii.ESC, Ascii.f22500SO, Ascii.f22499SI, Ascii.f22493FS, Ascii.f22502US, Ascii.DLE, Ascii.f22498RS, Ascii.f22502US};
    }

    static {
        A01();
    }
}
