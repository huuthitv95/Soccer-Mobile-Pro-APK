package com.ironsource.adqualitysdk.sdk.p286i;

import android.view.ViewConfiguration;
import com.smaato.sdk.core.SmaatoSdk;
import com.vungle.ads.internal.protos.Sdk;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.gt */
/* JADX INFO: loaded from: classes6.dex */
public final class C11990gt extends AbstractC11980gj {

    /* JADX INFO: renamed from: ﻐ */
    private static int[] f29062 = {-644661620, 614455355, 280731701, -226971858, -1592916877, 779523875, -976922640, -37377507, -1102774847, -1803777800, 897464313, 397930069, 2125422882, 71652828, -1750835336, 1799784682, -1490736416, 1482202171};

    /* JADX INFO: renamed from: ﻛ */
    private static int f29063 = 1;

    /* JADX INFO: renamed from: ﾇ */
    private static int f29064;

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11980gj
    /* JADX INFO: renamed from: ﾇ */
    public final String mo30211() {
        int i = 2 % 2;
        int i2 = f29064 + 21;
        f29063 = i2 % 128;
        return (i2 % 2 == 0 ? m30242(new int[]{1223712362, 2105146729, 1094484418, -1108322360, -494543828, 1037252144, -1597518057, 161749119, 1045996944, -2013592566, 840514203, 251156108, 2102084211, -372087841, 303749212, 1184733686}, (ViewConfiguration.getKeyRepeatDelay() + 47) * 79) : m30242(new int[]{1223712362, 2105146729, 1094484418, -1108322360, -494543828, 1037252144, -1597518057, 161749119, 1045996944, -2013592566, 840514203, 251156108, 2102084211, -372087841, 303749212, 1184733686}, 29 - (ViewConfiguration.getKeyRepeatDelay() >> 16))).intern();
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11980gj
    /* JADX INFO: renamed from: ﾒ */
    public final Class mo30212() {
        int i = 2 % 2;
        int i2 = f29063 + 103;
        int i3 = i2 % 128;
        f29064 = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        int i4 = i3 + 15;
        f29063 = i4 % 128;
        if (i4 % 2 != 0) {
            return SmaatoSdk.class;
        }
        super.hashCode();
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11980gj
    /* JADX INFO: renamed from: ｋ */
    public final AbstractC11840be mo30210() {
        int i = 2 % 2;
        C11860by c11860by = new C11860by(mo30209());
        int i2 = f29064 + 73;
        f29063 = i2 % 128;
        int i3 = i2 % 2;
        return c11860by;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11980gj
    /* JADX INFO: renamed from: ﻛ */
    public final String mo30209() {
        int i = 2 % 2;
        int i2 = f29063 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
        f29064 = i2 % 128;
        String strIntern = (i2 % 2 != 0 ? m30242(new int[]{1094484418, -1108322360, 187414905, 1540448947}, 17 >> (ViewConfiguration.getTapTimeout() + 124)) : m30242(new int[]{1094484418, -1108322360, 187414905, 1540448947}, (ViewConfiguration.getTapTimeout() >> 16) + 6)).intern();
        int i3 = f29064 + 9;
        f29063 = i3 % 128;
        int i4 = i3 % 2;
        return strIntern;
    }

    /* JADX INFO: renamed from: ﻐ */
    private static String m30242(int[] iArr, int i) {
        String str;
        synchronized (C11835b.f27464) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) f29062.clone();
            C11835b.f27462 = 0;
            while (C11835b.f27462 < iArr.length) {
                cArr[0] = (char) (iArr[C11835b.f27462] >> 16);
                cArr[1] = (char) iArr[C11835b.f27462];
                cArr[2] = (char) (iArr[C11835b.f27462 + 1] >> 16);
                cArr[3] = (char) iArr[C11835b.f27462 + 1];
                C11835b.f27463 = (cArr[0] << 16) + cArr[1];
                C11835b.f27461 = (cArr[2] << 16) + cArr[3];
                C11835b.m28718(iArr2);
                for (int i2 = 0; i2 < 16; i2++) {
                    int i3 = C11835b.f27463 ^ iArr2[i2];
                    C11835b.f27463 = i3;
                    C11835b.f27461 = C11835b.m28717(i3) ^ C11835b.f27461;
                    int i4 = C11835b.f27463;
                    C11835b.f27463 = C11835b.f27461;
                    C11835b.f27461 = i4;
                }
                int i5 = C11835b.f27463;
                C11835b.f27463 = C11835b.f27461;
                C11835b.f27461 = i5;
                C11835b.f27461 = i5 ^ iArr2[16];
                C11835b.f27463 ^= iArr2[17];
                int i6 = C11835b.f27463;
                int i7 = C11835b.f27461;
                cArr[0] = (char) (C11835b.f27463 >>> 16);
                cArr[1] = (char) C11835b.f27463;
                cArr[2] = (char) (C11835b.f27461 >>> 16);
                cArr[3] = (char) C11835b.f27461;
                C11835b.m28718(iArr2);
                cArr2[C11835b.f27462 << 1] = cArr[0];
                cArr2[(C11835b.f27462 << 1) + 1] = cArr[1];
                cArr2[(C11835b.f27462 << 1) + 2] = cArr[2];
                cArr2[(C11835b.f27462 << 1) + 3] = cArr[3];
                C11835b.f27462 += 2;
            }
            str = new String(cArr2, 0, i);
        }
        return str;
    }
}
