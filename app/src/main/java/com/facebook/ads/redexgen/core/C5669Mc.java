package com.facebook.ads.redexgen.core;

import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Mc */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C5669Mc implements InterfaceC6324XN {
    public static byte[] A01;
    public final /* synthetic */ C5663MW A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 62);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{36, 48, 49, 42, 38, 41, 44, 38, 46};
    }

    public C5669Mc(C5663MW c5663mw) {
        this.A00 = c5663mw;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6324XN
    public final void ADS() {
        if (!this.A00.A0C && !this.A00.A0B) {
            this.A00.A0V(false, A00(0, 9, Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE));
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6324XN
    public final void AFV(float f) {
    }
}
