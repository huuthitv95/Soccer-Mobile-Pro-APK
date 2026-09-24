package com.ironsource.adqualitysdk.sdk.p286i;

import android.os.SystemClock;
import android.view.ViewConfiguration;
import com.applovin.sdk.AppLovinSdk;
import com.vungle.ads.internal.protos.Sdk;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.gb */
/* JADX INFO: loaded from: classes6.dex */
public final class C11972gb extends AbstractC11980gj {

    /* JADX INFO: renamed from: ﻐ */
    private static int[] f28973 = {519955492, -1009608729, 983436620, 875271742, -530781014, -2126528917, -118202158, -1013706281, -1922165139, 1848799565, -1193198556, 1473172451, 1463603414, 127080584, -1210650015, 78185745, -1638289179, 1487012519};

    /* JADX INFO: renamed from: ﾇ */
    private static int f28974 = 0;

    /* JADX INFO: renamed from: ﾒ */
    private static int f28975 = 1;

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11980gj
    /* JADX INFO: renamed from: ﾇ */
    public final String mo30211() {
        int i = 2 % 2;
        int i2 = f28974 + 11;
        f28975 = i2 % 128;
        String strIntern = (i2 % 2 == 0 ? m30220(new int[]{-235737374, 405370611, -1766135294, -105598347, 486727090, -49513463, -733880059, -1008230716, -905602204, -375564456, 1344801931, 197897397, 744345696, -1449515727}, 31 - (ViewConfiguration.getWindowTouchSlop() >>> 53)) : m30220(new int[]{-235737374, 405370611, -1766135294, -105598347, 486727090, -49513463, -733880059, -1008230716, -905602204, -375564456, 1344801931, 197897397, 744345696, -1449515727}, (ViewConfiguration.getWindowTouchSlop() >> 8) + 28)).intern();
        int i3 = f28974 + 65;
        f28975 = i3 % 128;
        int i4 = i3 % 2;
        return strIntern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11980gj
    /* JADX INFO: renamed from: ﾒ */
    public final Class mo30212() {
        int i = 2 % 2;
        int i2 = f28974 + 13;
        int i3 = i2 % 128;
        f28975 = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            super.hashCode();
            throw null;
        }
        int i4 = i3 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
        f28974 = i4 % 128;
        int i5 = i4 % 2;
        return AppLovinSdk.class;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11980gj
    /* JADX INFO: renamed from: ｋ */
    public final AbstractC11840be mo30210() {
        int i = 2 % 2;
        C11846bk c11846bk = new C11846bk(mo30209());
        int i2 = f28974 + 59;
        f28975 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 3 / 0;
        }
        return c11846bk;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11980gj
    /* JADX INFO: renamed from: ﻛ */
    public final String mo30209() {
        int i = 2 % 2;
        int i2 = f28974 + 21;
        f28975 = i2 % 128;
        int i3 = i2 % 2;
        String strIntern = m30220(new int[]{-1766135294, -105598347, 486727090, -49513463}, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 7).intern();
        int i4 = f28975 + 75;
        f28974 = i4 % 128;
        if (i4 % 2 == 0) {
            return strIntern;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ｋ */
    private static String m30220(int[] iArr, int i) {
        String str;
        synchronized (C11835b.f27464) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) f28973.clone();
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
