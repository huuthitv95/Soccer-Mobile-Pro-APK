package com.facebook.ads.redexgen.core;

import com.google.common.base.Ascii;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.go */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C6908go extends AbstractRunnableC6279Wc {
    public static byte[] A02;
    public final /* synthetic */ C6907gn A00;
    public final /* synthetic */ AtomicBoolean A01;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 78);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{Ascii.f22500SO, 44, 46, 51, 48, -21, 49, 44, 52, 55, -7, -110, -80, -78, -73, -76, 111, -62, -60, -78, -78, -76, -62, -62, 125};
    }

    public C6908go(C6907gn c6907gn, AtomicBoolean atomicBoolean) {
        this.A00 = c6907gn;
        this.A01 = atomicBoolean;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC6279Wc
    public final void A07() {
        if (this.A00.A00 != null) {
            if (this.A01.get()) {
                this.A00.A02.A0I(EnumC6199VH.A0H);
                C6059T0.A02(this.A00.A02.A04, this.A00.A01, C6059T0.A00, A00(11, 14, 1), this.A00.A02.A00);
                this.A00.A02.A0U();
                this.A00.A00.ADT();
                return;
            }
            this.A00.A02.A0I(EnumC6199VH.A0G);
            C6059T0.A02(this.A00.A02.A04, this.A00.A01, C6059T0.A04, A00(0, 11, Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE), this.A00.A02.A00);
            this.A00.A02.A0V();
            this.A00.A00.ADL();
        }
    }
}
