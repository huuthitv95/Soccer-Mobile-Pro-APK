package com.facebook.ads.redexgen.core;

import com.google.common.base.Ascii;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.El */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C5184El {
    public static byte[] A03;
    public final int A00;
    public final C7435pg A01;
    public final int[] A02;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 82);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{-11, 4, 3, -12, Ascii.NAK, Ascii.SYN, Ascii.f22491EM, Ascii.f22498RS, Ascii.f22491EM, 36, Ascii.f22491EM, Ascii.f22502US, Ascii.f22498RS, 3, 43, 46, 50, 55, -34, 50, 48, Ascii.f22502US, 33, 41, 49, -34, Ascii.f22502US, 48, 35, -34, 44, 45, 50, -34, Ascii.f22502US, 42, 42, 45, 53, 35, 34};
    }

    public C5184El(C7435pg c7435pg, int... iArr) {
        this(c7435pg, iArr, 0);
    }

    public C5184El(C7435pg c7435pg, int[] iArr, int i) {
        if (iArr.length == 0) {
            AbstractC45794g.A08(A00(0, 13, 94), A00(13, 28, 108), new IllegalArgumentException());
        }
        this.A01 = c7435pg;
        this.A02 = iArr;
        this.A00 = i;
    }
}
