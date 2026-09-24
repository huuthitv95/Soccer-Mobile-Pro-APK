package com.facebook.ads.redexgen.core;

import com.google.common.base.Ascii;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bD */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public enum EnumC6562bD {
    A05(0),
    A04(1),
    A03(2);

    public static byte[] A01;
    public int A00;

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 120);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{78, 67, 76, 70, 81, 65, 67, 82, 71, 56, 39, 58, 60, 58, 41, 33, 60, Ascii.SYN, Ascii.f22490CR, Ascii.DLE, 19, 6, 0, 10, 5, 10, 6, 7};
    }

    static {
        A02();
    }

    EnumC6562bD(int i) {
        this.A00 = i;
    }

    public static EnumC6562bD A00(int i) {
        for (EnumC6562bD enumC6562bD : values()) {
            if (enumC6562bD.A00 == i) {
                return enumC6562bD;
            }
        }
        return A04;
    }

    public final int A04() {
        return this.A00;
    }
}
