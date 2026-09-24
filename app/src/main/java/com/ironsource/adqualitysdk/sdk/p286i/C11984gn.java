package com.ironsource.adqualitysdk.sdk.p286i;

import android.text.TextUtils;
import android.util.TypedValue;
import com.my.target.common.MyTargetManager;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.gn */
/* JADX INFO: loaded from: classes6.dex */
public final class C11984gn extends AbstractC11980gj {

    /* JADX INFO: renamed from: ﻐ */
    private static int f29030 = 1;

    /* JADX INFO: renamed from: ﻛ */
    private static long f29031 = 0;

    /* JADX INFO: renamed from: ｋ */
    private static int f29032 = 0;

    /* JADX INFO: renamed from: ﾇ */
    private static int f29033 = 0;

    /* JADX INFO: renamed from: ﾒ */
    private static char f29034 = 4256;

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11980gj
    /* JADX INFO: renamed from: ﾇ */
    public final String mo30211() {
        char cIndexOf;
        char c;
        int i = 2 % 2;
        int i2 = f29030 + 51;
        f29033 = i2 % 128;
        if (i2 % 2 != 0) {
            cIndexOf = (char) TextUtils.indexOf("", "", 0, 1);
            c = 'j';
        } else {
            cIndexOf = (char) TextUtils.indexOf("", "", 0, 0);
            c = '0';
        }
        return m30235("\ue202톹Ʂ趚Ęךᆔ硹꺓슍尲⍉ᙯ\ued1b憨䦍臶藘Ⲋ덕졬ㇳ㜌㻎滛⡂ゎ厺㟥\ua636鿠\uecd2囷\uf654譪ꌤ", cIndexOf, "\u0000\u0000\u0000\u0000", (-1) - TextUtils.indexOf("", c, 0), "⦤ᬶ\uf4f6ࣞ").intern();
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11980gj
    /* JADX INFO: renamed from: ﾒ */
    public final Class mo30212() {
        int i = 2 % 2;
        int i2 = f29033 + 35;
        int i3 = i2 % 128;
        f29030 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 87;
        f29033 = i5 % 128;
        int i6 = i5 % 2;
        return MyTargetManager.class;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11980gj
    /* JADX INFO: renamed from: ｋ */
    public final AbstractC11840be mo30210() {
        int i = 2 % 2;
        C11864cb c11864cb = new C11864cb(mo30209());
        int i2 = f29030 + 3;
        f29033 = i2 % 128;
        if (i2 % 2 == 0) {
            return c11864cb;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11980gj
    /* JADX INFO: renamed from: ﻛ */
    public final String mo30209() {
        int i = 2 % 2;
        int i2 = f29030 + 49;
        f29033 = i2 % 128;
        String strIntern = m30235("癨⥔㊆콡鎨肛쿚됥", (char) ((i2 % 2 != 0 ? TypedValue.complexToFloat(1) : TypedValue.complexToFloat(0)) > 0.0f ? 1 : ((i2 % 2 != 0 ? TypedValue.complexToFloat(1) : TypedValue.complexToFloat(0)) == 0.0f ? 0 : -1)), "\u0000\u0000\u0000\u0000", TextUtils.indexOf("", "", 0), "怰煤䢮䴑").intern();
        int i3 = f29030 + 105;
        f29033 = i3 % 128;
        if (i3 % 2 == 0) {
            return strIntern;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ */
    private static String m30235(String str, char c, String str2, int i, String str3) {
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
                cArr6[C12051j.f29511] = (char) (((((long) (cArr4[i3] ^ cArr3[C12051j.f29511])) ^ f29031) ^ ((long) f29032)) ^ ((long) f29034));
                C12051j.f29511++;
            }
            str4 = new String(cArr6);
        }
        return str4;
    }
}
