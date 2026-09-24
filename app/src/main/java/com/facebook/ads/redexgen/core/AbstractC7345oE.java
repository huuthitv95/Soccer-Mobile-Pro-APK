package com.facebook.ads.redexgen.core;

import com.google.common.base.Ascii;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.oE */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC7345oE implements InterfaceC46565v {
    public static byte[] A00;
    public static final boolean A01;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 32);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{32, 39, 53, 35, 35, 36, 54, 47, 58, Ascii.SYN, Ascii.SUB, 1, Ascii.DC4, Ascii.NAK};
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0038  */
    static {
        boolean z;
        A01();
        if (A00(8, 6, 91).equals(AbstractC46115C.A05)) {
            if (!A00(4, 4, 66).equals(AbstractC46115C.A06)) {
                if (!A00(0, 4, 65).equals(AbstractC46115C.A06)) {
                    z = false;
                }
            }
            z = true;
        } else {
            z = false;
        }
        A01 = z;
    }
}
