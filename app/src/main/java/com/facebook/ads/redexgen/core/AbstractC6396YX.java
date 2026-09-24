package com.facebook.ads.redexgen.core;

import android.app.Activity;
import com.google.common.base.Ascii;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.YX */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC6396YX {
    public static byte[] A00;
    public static String[] A01 = {"fNLd7n7EkFNgLvt4vtbAtkfYXAQTEPRW", "T28d5tP6PdXMoXHWEuFSx", "qUncBokoif621v1GQ7gcKknRgizXPQsv", "IkdBxGtQCWxg3d0UA", "tTLCQWoYBdse5ixamGS9HTw2k7WXO8kY", "MyXxcbJBNTQUhn8S7mcX9rM3djOk", "ymwmgwOSW636xClV84tW2WEHiZAMdx7v", "xCAHRx5Y4"};

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            byte b = bArrCopyOfRange[i4];
            String[] strArr = A01;
            if (strArr[7].length() == strArr[1].length()) {
                throw new RuntimeException();
            }
            A01[0] = "dZQs1GEaNPWr5rijC2ubsciPbAft3PPF";
            bArrCopyOfRange[i4] = (byte) ((b - i3) - 117);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{Ascii.f22499SI, Ascii.f22490CR, Ascii.SYN, Ascii.f22490CR, Ascii.SUB, 17, Ascii.f22503VT};
    }

    static {
        A01();
    }

    public static void A02(Activity activity, int i, C6902gi c6902gi) {
        try {
            activity.setRequestedOrientation(i);
        } catch (IllegalStateException e) {
            c6902gi.A08().ABz(A00(0, 7, 51), AbstractC6098Td.A0H, new C6099Te(e));
        }
    }
}
