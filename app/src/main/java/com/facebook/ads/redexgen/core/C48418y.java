package com.facebook.ads.redexgen.core;

import com.google.common.base.Ascii;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.8y */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C48418y extends Exception {
    public static byte[] A03;
    public final int A00;
    public final C7472qI A01;
    public final boolean A02;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 74);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{-26, Ascii.SUB, 9, Ascii.f22500SO, Ascii.DC4, -7, Ascii.ETB, 6, 8, Ascii.DLE, -59, Ascii.f22493FS, Ascii.ETB, Ascii.f22500SO, Ascii.f22491EM, 10, -59, Ascii.f22503VT, 6, Ascii.f22500SO, 17, 10, 9, -33, -59};
    }

    public C48418y(int i, C7472qI c7472qI, boolean z) {
        super(A00(0, 25, 91) + i);
        this.A02 = z;
        this.A00 = i;
        this.A01 = c7472qI;
    }
}
