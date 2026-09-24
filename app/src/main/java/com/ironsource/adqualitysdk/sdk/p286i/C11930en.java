package com.ironsource.adqualitysdk.sdk.p286i;

import android.view.ViewConfiguration;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.en */
/* JADX INFO: loaded from: classes6.dex */
public final class C11930en extends AbstractC11922ef {

    /* JADX INFO: renamed from: ﻐ */
    private static int f28807 = 0;

    /* JADX INFO: renamed from: ﻛ */
    private static long f28808 = -3177138630618034185L;

    /* JADX INFO: renamed from: ﾇ */
    private static int f28809 = 1;

    public C11930en(AbstractC11919ec abstractC11919ec, AbstractC11919ec abstractC11919ec2, C11904do c11904do) {
        super(abstractC11919ec, abstractC11919ec2, c11904do);
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11919ec
    /* JADX INFO: renamed from: ﾇ */
    public final C11908ds mo30123(C11907dr c11907dr, C11877co c11877co) {
        return new C11908ds(Boolean.valueOf(m30162().m30156(c11907dr, c11877co).m30065() && m30163().m30156(c11907dr, c11877co).m30065()));
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11922ef
    /* JADX INFO: renamed from: ﾒ */
    public final String mo30164() {
        int i = 2 % 2;
        int i2 = f28807 + 13;
        f28809 = i2 % 128;
        int i3 = i2 % 2;
        String strIntern = m30177("撛砽栩撽焹㟬", (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1).intern();
        int i4 = f28807 + 37;
        f28809 = i4 % 128;
        int i5 = i4 % 2;
        return strIntern;
    }

    /* JADX INFO: renamed from: ﻛ */
    private static String m30177(String str, int i) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (C11943f.f28848) {
            char[] cArrM30189 = C11943f.m30189(f28808, cArr, i);
            C11943f.f28846 = 4;
            while (C11943f.f28846 < cArrM30189.length) {
                C11943f.f28847 = C11943f.f28846 - 4;
                cArrM30189[C11943f.f28846] = (char) (((long) (cArrM30189[C11943f.f28846] ^ cArrM30189[C11943f.f28846 % 4])) ^ (((long) C11943f.f28847) * f28808));
                C11943f.f28846++;
            }
            str2 = new String(cArrM30189, 4, cArrM30189.length - 4);
        }
        return str2;
    }
}
