package com.facebook.ads.redexgen.core;

import com.google.common.base.Ascii;
import com.google.common.collect.ElementTypesAreNonnullByDefault;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.nJ */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
@ElementTypesAreNonnullByDefault
public abstract class AbstractC7289nJ {
    public static byte[] A00;

    static {
        A02();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 87);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{96, 35, 33, 46, 46, 47, 52, 96, 34, 37, 96, 46, 37, 39, 33, 52, 41, 54, 37, 96, 34, 53, 52, 96, 55, 33, 51, 122, 96, 43, 120, 99, 122, 122, 0, 1, 78, Ascii.f22490CR, Ascii.f22499SI, 2, 2, Ascii.f22494GS, 78, Ascii.SUB, 1, 78, 0, Ascii.f22503VT, Ascii.SYN, Ascii.SUB, 70, 71, 78, Ascii.f22494GS, 7, 0, Ascii.f22490CR, Ascii.f22503VT, 78, Ascii.SUB, 6, Ascii.f22503VT, 78, 2, Ascii.f22499SI, Ascii.f22494GS, Ascii.SUB, 78, Ascii.f22490CR, Ascii.f22499SI, 2, 2, 78, Ascii.SUB, 1, 78, Ascii.f22493FS, Ascii.f22503VT, 3, 1, Ascii.CAN, Ascii.f22503VT, 70, 71, 10, 17, 8, 8, 68, Ascii.f22499SI, 1, Ascii.f22494GS, 68, Ascii.f22490CR, 10, 68, 1, 10, Ascii.DLE, Ascii.SYN, Ascii.f22494GS, 94, 68, 10, 17, 8, 8, 89, Ascii.f22502US, 4, Ascii.f22494GS, Ascii.f22494GS, 81, 7, Ascii.DLE, Ascii.f22494GS, 4, Ascii.DC4, 81, Ascii.CAN, Ascii.f22502US, 81, Ascii.DC4, Ascii.f22502US, 5, 3, 8, 75, 81};
    }

    public static int A00(int value, String name) {
        if (value >= 0) {
            return value;
        }
        throw new IllegalArgumentException(name + A01(0, 29, 23) + value);
    }

    public static void A03(Object key, Object value) {
        if (key != null) {
            if (value != null) {
                return;
            } else {
                throw new NullPointerException(A01(108, 21, 38) + key + A01(29, 5, 65));
            }
        }
        throw new NullPointerException(A01(84, 24, 51) + value);
    }

    public static void A04(boolean canRemove) {
        AbstractC7142ki.A0F(canRemove, A01(34, 50, 57));
    }
}
