package com.facebook.ads.redexgen.core;

import androidx.media3.common.PlaybackException;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.hl */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C6966hl implements InterfaceC5897QM {
    public static byte[] A01;
    public final /* synthetic */ C47457M A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) + PlaybackException.ERROR_CODE_SKIP_LIMIT_REACHED);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-10, 0, -9};
    }

    public C6966hl(C47457M c47457m) {
        this.A00 = c47457m;
    }

    private final void A02(C5898QN c5898qn) {
        throw new NullPointerException(A00(0, 3, 40));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5897QM
    public final void ADg(C5898QN c5898qn) {
        A02(c5898qn);
        throw null;
    }
}
