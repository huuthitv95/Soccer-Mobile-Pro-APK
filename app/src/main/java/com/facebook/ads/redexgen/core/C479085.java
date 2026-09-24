package com.facebook.ads.redexgen.core;

import android.net.Uri;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.85 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C479085 extends AbstractC7116kH {
    public static byte[] A02;
    public Map<String, String> A00;
    public final Uri A01;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 77);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{36, 33, 38, 35};
    }

    public C479085(C6902gi c6902gi, InterfaceC6192VA interfaceC6192VA, String str, Uri uri, Map<String, String> mExtraData) {
        super(c6902gi, interfaceC6192VA, str, null, true, true);
        this.A01 = uri;
        this.A00 = mExtraData;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC7116kH
    public final EnumC5683Mq A0H() {
        A0J(this.A00, null);
        return EnumC5683Mq.A09;
    }

    public final Uri A0M() {
        String uri = this.A01.getQueryParameter(A00(0, 4, 5));
        if (uri == null) {
            uri = A00(0, 0, Sdk.SDKError.Reason.TPAT_ERROR_VALUE);
        }
        return AbstractC6312XB.A00(uri);
    }
}
