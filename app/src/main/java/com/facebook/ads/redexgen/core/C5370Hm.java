package com.facebook.ads.redexgen.core;

import androidx.media3.common.PlaybackException;
import com.google.common.base.Ascii;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Hm */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C5370Hm extends AbstractRunnableC6279Wc {
    public static byte[] A02;
    public final /* synthetic */ C460455 A00;
    public final /* synthetic */ C45474A A01;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) + PlaybackException.ERROR_CODE_SKIP_LIMIT_REACHED);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{Ascii.NAK, 72, 57, 57, 56, 69, 60, 65, 58, -13, 60, 65, 55, 56, 57, 60, 65, 60, 71, 56, 63, 76};
    }

    public C5370Hm(C460455 c460455, C45474A c45474a) {
        this.A00 = c460455;
        this.A01 = c45474a;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC6279Wc
    public final void A07() {
        if (this.A00.A0b.getState() == EnumC6844fm.A02 && this.A00.A0b.getCurrentPositionInMillis() == A00()) {
            this.A00.A0s(A00(0, 22, 104));
        }
    }
}
