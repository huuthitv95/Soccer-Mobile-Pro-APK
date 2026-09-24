package com.facebook.ads.redexgen.core;

import android.net.Uri;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.Map;
import kotlin.p300io.encoding.Base64;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.kG */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C7115kG extends AbstractC5686Mt {
    public static byte[] A02;
    public static final String A03;
    public final Uri A00;
    public final Map<String, String> A01;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 87);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{52, 54, 45, 51, 54, 45, 56, Base64.padSymbol, -32, -27, -36, -47};
    }

    static {
        A01();
        A03 = C7115kG.class.getSimpleName();
    }

    public C7115kG(C6902gi c6902gi, InterfaceC6192VA interfaceC6192VA, String str, Uri uri, Map<String, String> mExtraData) {
        super(c6902gi, interfaceC6192VA, str);
        this.A00 = uri;
        this.A01 = mExtraData;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC5686Mt
    public final EnumC5683Mq A0G(String str) {
        EnumC6194VC enumC6194VC = EnumC6194VC.A05;
        String queryParameter = this.A00.getQueryParameter(A00(0, 8, 109));
        if (!TextUtils.isEmpty(queryParameter)) {
            try {
                enumC6194VC = EnumC6194VC.values()[Integer.valueOf(queryParameter).intValue()];
            } catch (Exception unused) {
            }
        }
        this.A02.ABq(this.A03, this.A01, this.A00.getQueryParameter(A00(8, 4, 21)), enumC6194VC);
        return EnumC5683Mq.A09;
    }
}
