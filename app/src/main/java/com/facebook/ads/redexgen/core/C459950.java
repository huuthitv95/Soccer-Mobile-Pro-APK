package com.facebook.ads.redexgen.core;

import android.view.Surface;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.50 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C459950 {
    public static byte[] A04;
    public static String[] A05 = {"rYnPbEfuSaTBbvatyKmqENn8mgRSZdek", "ofstc3luVQLhDPNdocOCjRxToKRzk7nB", "Fnbmz9sIEw5y7N9QBLdBg", "MRjsdls7eSgWLCoo8pA3j", "UfW8AgM42njlyNRr2q7EB3IdvayipkgN", "kcxrVmXx561a0K31f6UYVe0sWhenvrT2", "", "AcILJL5UwW37jf1DZrUjVyU1aBx980VR"};
    public final int A00;
    public final int A01;
    public final int A02;
    public final Surface A03;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 33);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{66, 95, 68, 72, 67, 89, 76, 89, 68, 66, 67, 105, 72, 74, 95, 72, 72, 94, Ascii.f22490CR, SignedBytes.MAX_POWER_OF_TWO, 88, 94, 89, Ascii.f22490CR, 79, 72, Ascii.f22490CR, Ascii.f22494GS, 1, Ascii.f22490CR, Ascii.DC4, Ascii.f22494GS, 1, Ascii.f22490CR, Ascii.f22493FS, Ascii.NAK, Ascii.f22494GS, 1, Ascii.f22490CR, 66, 95, Ascii.f22490CR, Ascii.f22502US, Ascii.SUB, Ascii.f22494GS};
    }

    static {
        A01();
    }

    public C459950(Surface surface, int i, int i2) {
        this(surface, i, i2, 0);
    }

    public C459950(Surface surface, int i, int i2, int i3) {
        AbstractC45353y.A09(i3 == 0 || i3 == 90 || i3 == 180 || i3 == 270, A00(0, 45, 12));
        this.A03 = surface;
        this.A02 = i;
        this.A00 = i2;
        this.A01 = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C459950)) {
            return false;
        }
        C459950 c459950 = (C459950) obj;
        if (this.A02 == c459950.A02 && this.A00 == c459950.A00) {
            int i = this.A01;
            int i2 = c459950.A01;
            if (A05[7].charAt(29) == 'q') {
                throw new RuntimeException();
            }
            String[] strArr = A05;
            strArr[2] = "IfmXZsmHB8xObc4DA1o6c";
            strArr[3] = "9bmF1UX1T4riDJeOAx7tH";
            if (i == i2 && this.A03.equals(c459950.A03)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int result = this.A03.hashCode();
        int i = result * 31;
        int result2 = this.A02;
        int result3 = (((i + result2) * 31) + this.A00) * 31;
        int result4 = this.A01;
        return result3 + result4;
    }
}
