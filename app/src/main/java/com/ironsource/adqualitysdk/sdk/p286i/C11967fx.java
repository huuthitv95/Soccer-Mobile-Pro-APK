package com.ironsource.adqualitysdk.sdk.p286i;

import android.graphics.drawable.Drawable;
import android.os.Process;
import com.google.android.gms.ads.MobileAds;
import com.vungle.ads.internal.protos.Sdk;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.fx */
/* JADX INFO: loaded from: classes6.dex */
public final class C11967fx extends AbstractC11980gj {

    /* JADX INFO: renamed from: ｋ */
    private static int[] f28950 = {909286452, 589478196, -1713024992, 1895910930, -175291743, -1488147649, 691748322, -1199132054, 814662370, -391769405, -495852439, -1656497573, 1990084991, 931356297, 1398646689, -1050303948, 1686634289, 842378388};

    /* JADX INFO: renamed from: ﾇ */
    private static int f28951 = 1;

    /* JADX INFO: renamed from: ﾒ */
    private static int f28952;

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11980gj
    /* JADX INFO: renamed from: ﾇ */
    public final String mo30211() {
        int i = 2 % 2;
        int i2 = f28951 + 49;
        f28952 = i2 % 128;
        int i3 = i2 % 2;
        String strIntern = m30216(new int[]{962535798, 1251776315, -622175470, 399504212, 808583705, 1725582367, 2127658456, 1239271031, 1511045001, 1277969077, -981462683, -729446364, 111702581, 346350475, -136847129, 1992787728, 1117529845, -2128336440}, Drawable.resolveOpacity(0, 0) + 36).intern();
        int i4 = f28952 + 19;
        f28951 = i4 % 128;
        int i5 = i4 % 2;
        return strIntern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11980gj
    /* JADX INFO: renamed from: ﾒ */
    public final Class mo30212() {
        Class<MobileAds> cls;
        int i = 2 % 2;
        int i2 = f28951;
        int i3 = i2 + 51;
        f28952 = i3 % 128;
        if (i3 % 2 != 0) {
            cls = MobileAds.class;
            int i4 = 32 / 0;
        } else {
            cls = MobileAds.class;
        }
        int i5 = i2 + 69;
        f28952 = i5 % 128;
        if (i5 % 2 == 0) {
            return cls;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11980gj
    /* JADX INFO: renamed from: ｋ */
    public final AbstractC11840be mo30210() {
        int i = 2 % 2;
        int i2 = f28952 + 101;
        f28951 = i2 % 128;
        int i3 = i2 % 2;
        if (!m30215()) {
            return new C11838bc(mo30209());
        }
        C11838bc.c cVar = new C11838bc.c(mo30209());
        int i4 = f28951 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
        f28952 = i4 % 128;
        int i5 = i4 % 2;
        return cVar;
    }

    /* JADX INFO: renamed from: ﻏ */
    private static boolean m30215() {
        int i = 2 % 2;
        int i2 = f28952 + 45;
        f28951 = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                if (!Prode.m28198()) {
                    Class.forName(m30216(new int[]{962535798, 1251776315, -622175470, 399504212, 808583705, 1725582367, 2127658456, 1239271031, 1511045001, 1277969077, -981462683, -729446364, 343782028, -908386238, 443594716, 1678015332, -925897493, -1009869123, -920522732, -247389904}, Drawable.resolveOpacity(0, 0) + 38).intern());
                    return true;
                }
                int i3 = f28951 + 61;
                f28952 = i3 % 128;
                int i4 = i3 % 2;
                return true;
            }
            Prode.m28198();
            Object obj = null;
            super.hashCode();
            throw null;
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11980gj
    /* JADX INFO: renamed from: ﻛ */
    public final String mo30209() {
        int i = 2 % 2;
        int i2 = f28951 + 29;
        f28952 = i2 % 128;
        int i3 = i2 % 2;
        String strIntern = m30216(new int[]{-504641687, -1207110771, 1768078069, -1440043280}, 4 - Process.getGidForName("")).intern();
        int i4 = f28951 + 13;
        f28952 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 89 / 0;
        }
        return strIntern;
    }

    /* JADX INFO: renamed from: ﾇ */
    private static String m30216(int[] iArr, int i) {
        String str;
        synchronized (C11835b.f27464) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) f28950.clone();
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
