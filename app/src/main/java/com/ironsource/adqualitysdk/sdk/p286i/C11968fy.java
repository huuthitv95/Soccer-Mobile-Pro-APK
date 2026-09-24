package com.ironsource.adqualitysdk.sdk.p286i;

import android.view.ViewConfiguration;
import com.ironsource.adqualitysdk.sdk.IronSourceAdQuality;
import com.vungle.ads.internal.protos.Sdk;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.fy */
/* JADX INFO: loaded from: classes6.dex */
public final class C11968fy extends AbstractC11980gj {

    /* JADX INFO: renamed from: ﻐ */
    private static int f28953 = 0;

    /* JADX INFO: renamed from: ﻛ */
    private static int[] f28954 = {1626620892, 2095818466, 419982561, -866026078, 1032908029, -401369163, -1168899634, 1263888232, 280122369, 1134492212, -1357509313, -1521847591, -1081333751, 474129300, 2136932477, 1360362261, -1751334344, 1373899945};

    /* JADX INFO: renamed from: ﾒ */
    private static int f28955 = 1;

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11980gj
    /* JADX INFO: renamed from: ﾇ */
    public final String mo30211() {
        int i = 2 % 2;
        int i2 = f28955 + 13;
        f28953 = i2 % 128;
        String strIntern = (i2 % 2 != 0 ? m30217(new int[]{24090783, 498696342, 1409697475, 1311833352, 1448490380, 617878911, -1823898907, -110316677, -1048041460, -1205822352, -383247776, -736573614, -1240721746, -990148601, -1240721746, -990148601, -1380253708, 128231495, -1995948173, -807330233, 1330567084, 84942633, 1155604629, 1575105438, 930736451, 711885306}, 114 >> (ViewConfiguration.getLongPressTimeout() << 93)) : m30217(new int[]{24090783, 498696342, 1409697475, 1311833352, 1448490380, 617878911, -1823898907, -110316677, -1048041460, -1205822352, -383247776, -736573614, -1240721746, -990148601, -1240721746, -990148601, -1380253708, 128231495, -1995948173, -807330233, 1330567084, 84942633, 1155604629, 1575105438, 930736451, 711885306}, (ViewConfiguration.getLongPressTimeout() >> 16) + 51)).intern();
        int i3 = f28953 + 33;
        f28955 = i3 % 128;
        int i4 = i3 % 2;
        return strIntern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11980gj
    /* JADX INFO: renamed from: ﾒ */
    public final Class mo30212() {
        int i = 2 % 2;
        int i2 = f28953;
        int i3 = i2 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
        f28955 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
        f28955 = i5 % 128;
        int i6 = i5 % 2;
        return IronSourceAdQuality.class;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11980gj
    /* JADX INFO: renamed from: ｋ */
    public final AbstractC11840be mo30210() {
        int i = 2 % 2;
        C11839bd c11839bd = new C11839bd(mo30209());
        int i2 = f28953 + 79;
        f28955 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 65 / 0;
        }
        return c11839bd;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11980gj
    /* JADX INFO: renamed from: ﻛ */
    public final String mo30209() {
        int i = 2 % 2;
        int i2 = f28953 + 39;
        f28955 = i2 % 128;
        int[] iArr = {535763224, 1530187004, -2120473275, -1745500067, 1246525058, 964558559, 452736030, -1248049864};
        return (i2 % 2 == 0 ? m30217(iArr, 54 >>> (ViewConfiguration.getTapTimeout() / 102)) : m30217(iArr, 14 - (ViewConfiguration.getTapTimeout() >> 16))).intern();
    }

    /* JADX INFO: renamed from: ﻐ */
    private static String m30217(int[] iArr, int i) {
        String str;
        synchronized (C11835b.f27464) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) f28954.clone();
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
