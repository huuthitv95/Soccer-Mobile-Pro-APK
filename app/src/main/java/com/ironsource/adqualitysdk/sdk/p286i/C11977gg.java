package com.ironsource.adqualitysdk.sdk.p286i;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import io.bidmachine.BidMachine;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.gg */
/* JADX INFO: loaded from: classes6.dex */
public final class C11977gg extends AbstractC11980gj {

    /* JADX INFO: renamed from: ﻐ */
    private static long f29002 = 0;

    /* JADX INFO: renamed from: ﻛ */
    private static int f29003 = 0;

    /* JADX INFO: renamed from: ｋ */
    private static int f29004 = 1;

    /* JADX INFO: renamed from: ﾇ */
    private static int f29005 = 0;

    /* JADX INFO: renamed from: ﾒ */
    private static char f29006 = 27865;

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11980gj
    /* JADX INFO: renamed from: ﾇ */
    public final String mo30211() {
        int i = 2 % 2;
        int i2 = f29004 + 23;
        f29003 = i2 % 128;
        int i3 = i2 % 2 != 0 ? 1 : 0;
        return m30227("Ᾰ﹏聹䨛ᢠ\u1776뷜桓쿕킝ꛫ⋂\uf371\udc20\uded9鉳\u19cb뭵率츬ⶴ뭒霒咭", (char) Color.blue(i3), "\u0000\u0000\u0000\u0000", Color.green(i3), "뀙짓뻯㋮").intern();
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11980gj
    /* JADX INFO: renamed from: ﾒ */
    public final Class mo30212() {
        int i = 2 % 2;
        int i2 = f29003 + 75;
        f29004 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 83 / 0;
        }
        return BidMachine.class;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11980gj
    /* JADX INFO: renamed from: ｋ */
    public final AbstractC11840be mo30210() {
        int i = 2 % 2;
        C11847bl c11847bl = new C11847bl(mo30209());
        int i2 = f29003 + 17;
        f29004 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 89 / 0;
        }
        return c11847bl;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11980gj
    /* JADX INFO: renamed from: ﻛ */
    public final String mo30209() {
        char cLastIndexOf;
        int scrollDefaultDelay;
        int i = 2 % 2;
        int i2 = f29003 + 103;
        f29004 = i2 % 128;
        if (i2 % 2 == 0) {
            cLastIndexOf = (char) ((-1) % TextUtils.lastIndexOf("", '`', 0, 1));
            scrollDefaultDelay = ViewConfiguration.getScrollDefaultDelay() % 5;
        } else {
            cLastIndexOf = (char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0));
            scrollDefaultDelay = ViewConfiguration.getScrollDefaultDelay() >> 16;
        }
        String strIntern = m30227("﵃줢꼽峬擞ៃ锪굯풒ⰴ", cLastIndexOf, "\u0000\u0000\u0000\u0000", scrollDefaultDelay, "ӏ퐣ᢋ唡").intern();
        int i3 = f29003 + 1;
        f29004 = i3 % 128;
        int i4 = i3 % 2;
        return strIntern;
    }

    /* JADX INFO: renamed from: ﾇ */
    private static String m30227(String str, char c, String str2, int i, String str3) {
        String str4;
        Object charArray = str3;
        if (str3 != null) {
            charArray = str3.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        Object charArray2 = str2;
        if (str2 != null) {
            charArray2 = str2.toCharArray();
        }
        char[] cArr2 = (char[]) charArray2;
        Object charArray3 = str;
        if (str != null) {
            charArray3 = str.toCharArray();
        }
        char[] cArr3 = (char[]) charArray3;
        synchronized (C12051j.f29510) {
            char[] cArr4 = (char[]) cArr.clone();
            char[] cArr5 = (char[]) cArr2.clone();
            cArr4[0] = (char) (c ^ cArr4[0]);
            cArr5[2] = (char) (cArr5[2] + ((char) i));
            int length = cArr3.length;
            char[] cArr6 = new char[length];
            C12051j.f29511 = 0;
            while (C12051j.f29511 < length) {
                int i2 = (C12051j.f29511 + 2) % 4;
                int i3 = (C12051j.f29511 + 3) % 4;
                C12051j.f29509 = (char) (((cArr4[C12051j.f29511 % 4] * 32718) + cArr5[i2]) % 65535);
                cArr5[i3] = (char) (((cArr4[i3] * 32718) + cArr5[i2]) / 65535);
                cArr4[i3] = C12051j.f29509;
                cArr6[C12051j.f29511] = (char) (((((long) (cArr4[i3] ^ cArr3[C12051j.f29511])) ^ f29002) ^ ((long) f29005)) ^ ((long) f29006));
                C12051j.f29511++;
            }
            str4 = new String(cArr6);
        }
        return str4;
    }
}
