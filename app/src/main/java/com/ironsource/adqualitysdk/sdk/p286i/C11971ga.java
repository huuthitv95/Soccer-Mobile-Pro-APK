package com.ironsource.adqualitysdk.sdk.p286i;

import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.ironsource.adqualitysdk.sdk.IronSourceAdQuality;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ga */
/* JADX INFO: loaded from: classes6.dex */
public final class C11971ga extends AbstractC11980gj {

    /* JADX INFO: renamed from: ﻏ */
    private static int f28967 = 1;

    /* JADX INFO: renamed from: ﻐ */
    private static char f28968 = 39935;

    /* JADX INFO: renamed from: ﻛ */
    private static char f28969 = 54082;

    /* JADX INFO: renamed from: ｋ */
    private static int f28970 = 0;

    /* JADX INFO: renamed from: ﾇ */
    private static char f28971 = 18200;

    /* JADX INFO: renamed from: ﾒ */
    private static char f28972 = 14342;

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11980gj
    /* JADX INFO: renamed from: ﾇ */
    public final String mo30211() {
        int i = 2 % 2;
        int i2 = f28970 + 3;
        f28967 = i2 % 128;
        String strIntern = m30219("\u175fᯨ丅ዾ读濼闳\ud90f\uee51భβ\uec43蚽쇝吟擄ꮻ軗៘ℾ╃ᡲ㜝㥽킚튯⃓뀭킚튯⃓뀭륃ᢥ闳\ud90fӔ锦β\uec43蚽쇝짘\uf1f0뤀ܤ\ud98e哌궝ป㯦戉", i2 % 2 == 0 ? 100 >>> (ViewConfiguration.getJumpTapTimeout() % 67) : 51 - (ViewConfiguration.getJumpTapTimeout() >> 16)).intern();
        int i3 = f28970 + 31;
        f28967 = i3 % 128;
        int i4 = i3 % 2;
        return strIntern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11980gj
    /* JADX INFO: renamed from: ﾒ */
    public final Class mo30212() {
        Class<IronSourceAdQuality> cls;
        int i = 2 % 2;
        int i2 = f28970;
        int i3 = i2 + 27;
        f28967 = i3 % 128;
        if (i3 % 2 == 0) {
            cls = IronSourceAdQuality.class;
            int i4 = 78 / 0;
        } else {
            cls = IronSourceAdQuality.class;
        }
        int i5 = i2 + 113;
        f28967 = i5 % 128;
        if (i5 % 2 != 0) {
            return cls;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11980gj
    /* JADX INFO: renamed from: ｋ */
    public final AbstractC11840be mo30210() {
        int i = 2 % 2;
        C11843bh c11843bh = new C11843bh(mo30209());
        int i2 = f28970 + 83;
        f28967 = i2 % 128;
        int i3 = i2 % 2;
        return c11843bh;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11980gj
    /* JADX INFO: renamed from: ﻛ */
    public final String mo30209() {
        int i = 2 % 2;
        int i2 = f28970 + 3;
        f28967 = i2 % 128;
        String strIntern = m30219("ꕪ쫸麴牗⮆楜쬰［낞ؽꁽࡺ", i2 % 2 == 0 ? MotionEvent.axisFromString("") * 41 : 10 - MotionEvent.axisFromString("")).intern();
        int i3 = f28967 + 99;
        f28970 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 99 / 0;
        }
        return strIntern;
    }

    /* JADX INFO: renamed from: ﾒ */
    private static String m30219(String str, int i) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (C12078k.f29776) {
            char[] cArr2 = new char[cArr.length];
            C12078k.f29775 = 0;
            char[] cArr3 = new char[2];
            while (C12078k.f29775 < cArr.length) {
                cArr3[0] = cArr[C12078k.f29775];
                cArr3[1] = cArr[C12078k.f29775 + 1];
                int i2 = 58224;
                for (int i3 = 0; i3 < 16; i3++) {
                    char c = cArr3[1];
                    char c2 = cArr3[0];
                    char c3 = (char) (c - (((c2 + i2) ^ ((c2 << 4) + f28971)) ^ ((c2 >>> 5) + f28972)));
                    cArr3[1] = c3;
                    cArr3[0] = (char) (c2 - (((c3 >>> 5) + f28969) ^ ((c3 + i2) ^ ((c3 << 4) + f28968))));
                    i2 -= 40503;
                }
                cArr2[C12078k.f29775] = cArr3[0];
                cArr2[C12078k.f29775 + 1] = cArr3[1];
                C12078k.f29775 += 2;
            }
            str2 = new String(cArr2, 0, i);
        }
        return str2;
    }
}
