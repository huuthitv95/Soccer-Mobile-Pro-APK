package com.ironsource.adqualitysdk.sdk.p286i;

import android.util.TypedValue;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ey */
/* JADX INFO: loaded from: classes6.dex */
public final class C11941ey extends AbstractC11929em {

    /* JADX INFO: renamed from: ﻛ */
    private static int f28840 = 0;

    /* JADX INFO: renamed from: ﾇ */
    private static long f28841 = 8004949490253909809L;

    /* JADX INFO: renamed from: ﾒ */
    private static int f28842 = 1;

    public C11941ey(AbstractC11919ec abstractC11919ec, AbstractC11919ec abstractC11919ec2, C11904do c11904do) {
        super(abstractC11919ec, abstractC11919ec2, c11904do);
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11928el
    /* JADX INFO: renamed from: ﻐ */
    final boolean mo30173(int i) {
        int i2 = 2 % 2;
        int i3 = f28842 + 115;
        int i4 = i3 % 128;
        f28840 = i4;
        int i5 = i3 % 2;
        if (i >= 0) {
            return false;
        }
        int i6 = i4 + 5;
        f28842 = i6 % 128;
        int i7 = i6 % 2;
        return true;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11922ef
    /* JADX INFO: renamed from: ﾒ */
    public final String mo30164() {
        int i = 2 % 2;
        int i2 = f28840 + 77;
        f28842 = i2 % 128;
        int i3 = i2 % 2;
        String strIntern = m30187("\ue47e\ue442䩱㻙營", (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1).intern();
        int i4 = f28840 + 57;
        f28842 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 22 / 0;
        }
        return strIntern;
    }

    /* JADX INFO: renamed from: ﾇ */
    private static String m30187(String str, int i) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (C11943f.f28848) {
            char[] cArrM30189 = C11943f.m30189(f28841, cArr, i);
            C11943f.f28846 = 4;
            while (C11943f.f28846 < cArrM30189.length) {
                C11943f.f28847 = C11943f.f28846 - 4;
                cArrM30189[C11943f.f28846] = (char) (((long) (cArrM30189[C11943f.f28846] ^ cArrM30189[C11943f.f28846 % 4])) ^ (((long) C11943f.f28847) * f28841));
                C11943f.f28846++;
            }
            str2 = new String(cArrM30189, 4, cArrM30189.length - 4);
        }
        return str2;
    }
}
