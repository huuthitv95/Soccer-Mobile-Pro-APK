package com.facebook.ads.redexgen.core;

import android.net.Uri;
import com.google.common.base.Ascii;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Mj */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract /* synthetic */ class AbstractC5676Mj {
    public static byte[] A00;

    static {
        A03();
    }

    public static String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 53);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{9, Ascii.f22493FS, 19, 3, Ascii.DLE, 9, Ascii.DC2, 17, 36, Ascii.ESC, Ascii.f22503VT, Ascii.f22498RS, 17, Ascii.DLE, Ascii.NAK, Ascii.f22498RS};
    }

    public static long A00(InterfaceC5677Mk interfaceC5677Mk) {
        return interfaceC5677Mk.A6h(A02(0, 7, 111), -1L);
    }

    public static Uri A01(InterfaceC5677Mk interfaceC5677Mk) {
        String strA6j = interfaceC5677Mk.A6j(A02(7, 9, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE), null);
        if (strA6j == null) {
            return null;
        }
        return Uri.parse(strA6j);
    }
}
