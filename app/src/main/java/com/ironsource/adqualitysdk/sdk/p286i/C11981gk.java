package com.ironsource.adqualitysdk.sdk.p286i;

import android.graphics.Color;
import android.text.TextUtils;
import com.inmobi.sdk.InMobiSdk;
import com.vungle.ads.internal.protos.Sdk;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.gk */
/* JADX INFO: loaded from: classes6.dex */
public final class C11981gk extends AbstractC11980gj {

    /* JADX INFO: renamed from: ﻛ */
    private static long f29020 = 6448437279653504504L;

    /* JADX INFO: renamed from: ｋ */
    private static int f29021 = 1;

    /* JADX INFO: renamed from: ﾒ */
    private static int f29022;

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11980gj
    /* JADX INFO: renamed from: ﾇ */
    public final String mo30211() {
        int i = 2 % 2;
        int i2 = f29021 + 15;
        f29022 = i2 % 128;
        String strIntern = m30232("▛죂＿\ue229郅蜿ꩫ壄伲牬悄ᜬ㩠⣂\udf70쉊\uf0c6\ue710詭룕꼵剒䃒眰", i2 % 2 != 0 ? Color.green(1) * 60757 : Color.green(0) + 60757).intern();
        int i3 = f29021 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
        f29022 = i3 % 128;
        int i4 = i3 % 2;
        return strIntern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11980gj
    /* JADX INFO: renamed from: ﾒ */
    public final Class mo30212() {
        int i = 2 % 2;
        int i2 = f29021 + 7;
        f29022 = i2 % 128;
        if (i2 % 2 == 0) {
            return InMobiSdk.class;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11980gj
    /* JADX INFO: renamed from: ｋ */
    public final AbstractC11840be mo30210() {
        int i = 2 % 2;
        C11851bp c11851bp = new C11851bp(mo30209());
        int i2 = f29022 + 61;
        f29021 = i2 % 128;
        int i3 = i2 % 2;
        return c11851bp;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11980gj
    /* JADX INFO: renamed from: ﻛ */
    public final String mo30209() {
        int i = 2 % 2;
        int i2 = f29022 + 103;
        f29021 = i2 % 128;
        int i3 = i2 % 2;
        String strIntern = m30232("░볫ᝯ\ue9e0䁮\udae0", TextUtils.indexOf("", "", 0) + 39293).intern();
        int i4 = f29022 + 33;
        f29021 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 50 / 0;
        }
        return strIntern;
    }

    /* JADX INFO: renamed from: ﾇ */
    private static String m30232(String str, int i) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (C11997h.f29102) {
            C11997h.f29101 = i;
            char[] cArr2 = new char[cArr.length];
            C11997h.f29103 = 0;
            while (C11997h.f29103 < cArr.length) {
                cArr2[C11997h.f29103] = (char) (((long) (cArr[C11997h.f29103] ^ (C11997h.f29103 * C11997h.f29101))) ^ f29020);
                C11997h.f29103++;
            }
            str2 = new String(cArr2);
        }
        return str2;
    }
}
