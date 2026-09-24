package com.ironsource.adqualitysdk.sdk.p286i;

import android.os.Process;
import android.text.TextUtils;
import com.amazon.device.ads.DTBAdRequest;
import com.vungle.ads.internal.protos.Sdk;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.fz */
/* JADX INFO: loaded from: classes6.dex */
public final class C11969fz extends AbstractC11980gj {

    /* JADX INFO: renamed from: ﻐ */
    private static int f28956 = 0;

    /* JADX INFO: renamed from: ﻛ */
    private static long f28957 = -5223121619429292363L;

    /* JADX INFO: renamed from: ﾒ */
    private static int f28958 = 1;

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11980gj
    /* JADX INFO: renamed from: ﾇ */
    public final String mo30211() {
        int i = 2 % 2;
        int i2 = f28956 + 75;
        f28958 = i2 % 128;
        int i3 = i2 % 2;
        String strIntern = m30218("凩冊ⴴ⯮瓻ꦂ秼붳䭜\u0cd0岤蜋搮ᄇ㟇\ue021ǰ穳⥴쵺㫜弟ఠ횉ힾꇃ\ue731㎕\uf153諘\udafd᳇\uea40\uefc4붸昌蜺\uf015", -TextUtils.lastIndexOf("", '0', 0)).intern();
        int i4 = f28956 + 69;
        f28958 = i4 % 128;
        if (i4 % 2 != 0) {
            return strIntern;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11980gj
    /* JADX INFO: renamed from: ﾒ */
    public final Class mo30212() {
        int i = 2 % 2;
        int i2 = f28956;
        int i3 = i2 + 107;
        f28958 = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            super.hashCode();
            throw null;
        }
        int i4 = i2 + 25;
        f28958 = i4 % 128;
        if (i4 % 2 != 0) {
            return DTBAdRequest.class;
        }
        super.hashCode();
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11980gj
    /* JADX INFO: renamed from: ｋ */
    public final AbstractC11840be mo30210() {
        int i = 2 % 2;
        C11845bj c11845bj = new C11845bj(mo30209());
        int i2 = f28958 + 35;
        f28956 = i2 % 128;
        if (i2 % 2 == 0) {
            return c11845bj;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11980gj
    /* JADX INFO: renamed from: ﻛ */
    public final String mo30209() {
        int i = 2 % 2;
        int i2 = f28958 + 17;
        f28956 = i2 % 128;
        int i3 = i2 % 2;
        String strIntern = m30218("߸ޙ魺鶢\udf1e鈰툕處ᵃ몝\uf741벳㈣", -Process.getGidForName("")).intern();
        int i4 = f28956 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
        f28958 = i4 % 128;
        int i5 = i4 % 2;
        return strIntern;
    }

    /* JADX INFO: renamed from: ﻐ */
    private static String m30218(String str, int i) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (C11943f.f28848) {
            char[] cArrM30189 = C11943f.m30189(f28957, cArr, i);
            C11943f.f28846 = 4;
            while (C11943f.f28846 < cArrM30189.length) {
                C11943f.f28847 = C11943f.f28846 - 4;
                cArrM30189[C11943f.f28846] = (char) (((long) (cArrM30189[C11943f.f28846] ^ cArrM30189[C11943f.f28846 % 4])) ^ (((long) C11943f.f28847) * f28957));
                C11943f.f28846++;
            }
            str2 = new String(cArrM30189, 4, cArrM30189.length - 4);
        }
        return str2;
    }
}
