package com.facebook.ads.redexgen.core;

import com.google.common.base.Ascii;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.rO */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public enum EnumC7524rO {
    A02,
    A03,
    A04;

    public static byte[] A00;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 98);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{79, 68, 87, 68, 83, 94, 83, 68, 70, 72, 82, 85, 68, 83, 68, 69, 115, 100, 102, 104, 114, 117, 100, 115, 100, 101, Ascii.f22500SO, Ascii.NAK, 9, Ascii.f22498RS, Ascii.f22493FS, Ascii.DC2, 8, Ascii.f22499SI, Ascii.f22498RS, 9, Ascii.f22498RS, Ascii.f22502US};
    }

    static {
        A01();
    }
}
