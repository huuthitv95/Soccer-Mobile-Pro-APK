package com.facebook.ads.redexgen.core;

import com.google.common.base.Ascii;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.BX */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C4986BX extends Exception {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 81);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{52, 19, Ascii.ESC, Ascii.f22498RS, Ascii.ETB, Ascii.SYN, 82, 6, Ascii.f22494GS, 82, 3, 7, Ascii.ETB, 0, Ascii.f22503VT, 82, 7, Ascii.f22493FS, Ascii.SYN, Ascii.ETB, 0, Ascii.f22498RS, Ascii.f22503VT, Ascii.ESC, Ascii.f22493FS, Ascii.NAK, 82, Ascii.f22502US, Ascii.ETB, Ascii.SYN, Ascii.ESC, 19, 82, 17, Ascii.f22494GS, Ascii.SYN, Ascii.ETB, 17, 1};
    }

    public C4986BX(Throwable th) {
        super(A00(0, 39, 35), th);
    }
}
