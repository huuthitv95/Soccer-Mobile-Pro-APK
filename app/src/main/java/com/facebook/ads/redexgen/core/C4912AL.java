package com.facebook.ads.redexgen.core;

import com.google.common.base.Ascii;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.AL */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C4912AL extends C7398p5 {
    public static byte[] A01;
    public final String A00;

    static {
        A02();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 87);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{-11, Ascii.SUB, 34, Ascii.f22490CR, Ascii.CAN, Ascii.NAK, Ascii.DLE, -52, Ascii.f22499SI, Ascii.ESC, Ascii.SUB, 32, 17, Ascii.SUB, 32, -52, 32, 37, Ascii.f22493FS, 17, -26, -52};
    }

    public C4912AL(String str, C46435i c46435i) {
        super(A01(0, 22, 85) + str, c46435i, 2003, 1);
        this.A00 = str;
    }
}
