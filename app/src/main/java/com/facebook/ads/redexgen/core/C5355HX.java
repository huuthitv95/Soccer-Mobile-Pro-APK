package com.facebook.ads.redexgen.core;

import com.google.common.base.Ascii;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.HX */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C5355HX {
    public static byte[] A02;
    public static String[] A03 = {"", "4aEfCmC", "2kTu4wHTiMw5FCYmIpZKoA3S7RkYvI9O", "", "w", "MqF3b2p", "5cCqnzmPstBPsSiWHPZbbxeHAyWMz3nO", "kSg1dz9TqTWY2puBAJqsQN0JUmM78NMM"};
    public final C5357HZ A00;
    public final C5357HZ A01;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 82);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{Ascii.ESC, Ascii.ETB, 123, 7};
    }

    static {
        A01();
    }

    public C5355HX(C5357HZ c5357hz) {
        this(c5357hz, c5357hz);
    }

    public C5355HX(C5357HZ c5357hz, C5357HZ c5357hz2) {
        this.A00 = (C5357HZ) AbstractC45353y.A01(c5357hz);
        this.A01 = (C5357HZ) AbstractC45353y.A01(c5357hz2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C5355HX c5355hx = (C5355HX) obj;
        if (A03[7].charAt(24) != 'U') {
            throw new RuntimeException();
        }
        A03[4] = "g";
        return this.A00.equals(c5355hx.A00) && this.A01.equals(c5355hx.A01);
    }

    public final int hashCode() {
        return (this.A00.hashCode() * 31) + this.A01.hashCode();
    }

    public final String toString() {
        String strA00;
        StringBuilder sbAppend = new StringBuilder().append(A00(2, 1, 114)).append(this.A00);
        if (!this.A00.equals(this.A01)) {
            strA00 = A00(0, 2, 101) + this.A01;
        } else {
            if (A03[0].length() != 0) {
                throw new RuntimeException();
            }
            A03[0] = "";
            strA00 = A00(0, 0, 76);
        }
        return sbAppend.append(strA00).append(A00(3, 1, 8)).toString();
    }
}
