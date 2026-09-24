package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.qW */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C7484qW {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 86);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{49, 53, 46, 54, 51, 52, 116, 48, 44, 55, 116, 60, 47, 52, 57, 46, 51, 53, 52, 41, 116};
    }

    public final String A02(InterfaceC4925AY interfaceC4925AY) {
        String string = interfaceC4925AY.getClass().getGenericInterfaces()[0].toString();
        String strA00 = A00(0, 21, 12);
        return string.startsWith(strA00) ? string.substring(strA00.length()) : string;
    }

    public final String A03(AbstractC44061o abstractC44061o) {
        return A02(abstractC44061o);
    }
}
