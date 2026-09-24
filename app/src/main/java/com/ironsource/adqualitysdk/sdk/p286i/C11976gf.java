package com.ironsource.adqualitysdk.sdk.p286i;

import android.view.ViewConfiguration;
import com.fyber.FairBid;
import com.vungle.ads.internal.protos.Sdk;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.gf */
/* JADX INFO: loaded from: classes6.dex */
public final class C11976gf extends AbstractC11980gj {

    /* JADX INFO: renamed from: ﻐ */
    private static int f28999 = 0;

    /* JADX INFO: renamed from: ﻛ */
    private static int f29000 = 1;

    /* JADX INFO: renamed from: ｋ */
    private static long f29001 = -2651844396521959229L;

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11980gj
    /* JADX INFO: renamed from: ﾇ */
    public final String mo30211() {
        int i = 2 % 2;
        int i2 = f28999 + 99;
        f29000 = i2 % 128;
        int i3 = i2 % 2;
        String strIntern = m30226("킠䆟\uf2c8捴鑩Յ랓⣃天쨦筻\ued93Ỏ輦⁋兗쎗", 37171 - (ViewConfiguration.getWindowTouchSlop() >> 8)).intern();
        int i4 = f29000 + 3;
        f28999 = i4 % 128;
        int i5 = i4 % 2;
        return strIntern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11980gj
    /* JADX INFO: renamed from: ﾒ */
    public final Class mo30212() {
        Class<FairBid> cls;
        int i = 2 % 2;
        int i2 = f28999;
        int i3 = i2 + 69;
        f29000 = i3 % 128;
        if (i3 % 2 == 0) {
            cls = FairBid.class;
            int i4 = 66 / 0;
        } else {
            cls = FairBid.class;
        }
        int i5 = i2 + 13;
        f29000 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 8 / 0;
        }
        return cls;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11980gj
    /* JADX INFO: renamed from: ｋ */
    public final AbstractC11840be mo30210() {
        int i = 2 % 2;
        C11853br c11853br = new C11853br(mo30209());
        int i2 = f28999 + 27;
        f29000 = i2 % 128;
        int i3 = i2 % 2;
        return c11853br;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11980gj
    /* JADX INFO: renamed from: ﻛ */
    public final String mo30209() {
        int i = 2 % 2;
        int i2 = f29000 + 61;
        f28999 = i2 % 128;
        int i3 = i2 % 2;
        String strIntern = m30226("킥\u05eb稸꽪薅難⼑", 54601 - (ViewConfiguration.getTapTimeout() >> 16)).intern();
        int i4 = f28999 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
        f29000 = i4 % 128;
        if (i4 % 2 != 0) {
            return strIntern;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ */
    private static String m30226(String str, int i) {
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
                cArr2[C11997h.f29103] = (char) (((long) (cArr[C11997h.f29103] ^ (C11997h.f29103 * C11997h.f29101))) ^ f29001);
                C11997h.f29103++;
            }
            str2 = new String(cArr2);
        }
        return str2;
    }
}
