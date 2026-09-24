package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Si */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C6041Si {
    public static InterfaceC6042Sj A00;
    public static boolean A01;
    public static byte[] A02;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 18);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{-91, -88, -79, -90, -85, -80, -92, -75, -82};
    }

    static {
        A02();
        A01 = false;
        A00 = null;
    }

    public static void A01() {
        synchronized (C6041Si.class) {
            if (A00 == null) {
                return;
            }
            C6099Te c6099Te = new C6099Te(A00.AIb());
            c6099Te.A05(1);
            C6898ge c6898geA00 = AbstractC6066T7.A00();
            if (c6898geA00 != null) {
                c6898geA00.A08().ABC(A00(0, 9, 49), 3401, c6099Te);
            }
            A00.reset();
        }
    }

    public static void A03(long j) {
        if (j > 0) {
            A00 = new C6911gr();
            new C6043Sk(j);
        }
    }
}
