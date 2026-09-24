package com.facebook.ads.redexgen.core;

import android.os.Handler;
import android.os.Looper;
import com.google.common.base.Ascii;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.5m */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C46475m extends AbstractC5145E8 {
    public static byte[] A01;
    public final /* synthetic */ C6677d4 A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 8);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{19, 4, 4, Ascii.f22491EM, 4};
    }

    public C46475m(C6677d4 c6677d4) {
        this.A00 = c6677d4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.AbstractC6143UN
    /* JADX INFO: renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final void A03(C5146E9 c5146e9) {
        new Handler(Looper.getMainLooper()).post(new RunnableC6675d2(this));
        this.A00.A0B.AGR(A00(0, 5, 126), this.A00.A03());
    }
}
