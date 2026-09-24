package com.facebook.ads.redexgen.core;

import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Mt */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC5686Mt {
    public static byte[] A04;
    public InterfaceC5684Mr A00;
    public final C6902gi A01;
    public final InterfaceC6192VA A02;
    public final String A03;

    static {
        A0D();
    }

    public static String A0B(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0D() {
        A04 = new byte[]{84, 69, 69, 106, 84, 81, 108, 105, 110, 107, 95, 99, 108, 105, 99, 107, 112, 102, 115, 100, 111, 88, 102, 105, 99, 88, 101, 117, 104, 112, 116, 98};
    }

    public abstract EnumC5683Mq A0G(String str);

    public AbstractC5686Mt(C6902gi c6902gi, InterfaceC6192VA interfaceC6192VA, String str) {
        this.A01 = c6902gi;
        this.A02 = interfaceC6192VA;
        this.A03 = str;
    }

    public static String A0A() {
        return A0B(16, 16, Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE);
    }

    public static String A0C(AbstractC5686Mt abstractC5686Mt) {
        if (abstractC5686Mt instanceof C478984) {
            return A0B(6, 10, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE);
        }
        return A0B(0, 6, 79);
    }

    public final InterfaceC5684Mr A0E() {
        return this.A00;
    }

    public final void A0F(InterfaceC5684Mr interfaceC5684Mr) {
        this.A00 = interfaceC5684Mr;
    }
}
