package com.ironsource.adqualitysdk.sdk.p286i;

import android.os.Process;
import com.vungle.ads.internal.protos.Sdk;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.er */
/* JADX INFO: loaded from: classes6.dex */
public final class C11934er extends AbstractC11929em {

    /* JADX INFO: renamed from: ｋ */
    private static int f28820 = 1;

    /* JADX INFO: renamed from: ﾇ */
    private static int f28821 = 0;

    /* JADX INFO: renamed from: ﾒ */
    private static long f28822 = 171003558131324562L;

    public C11934er(AbstractC11919ec abstractC11919ec, AbstractC11919ec abstractC11919ec2, C11904do c11904do) {
        super(abstractC11919ec, abstractC11919ec2, c11904do);
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11928el
    /* JADX INFO: renamed from: ﻐ */
    final boolean mo30173(int i) {
        int i2 = 2 % 2;
        int i3 = f28820 + 31;
        int i4 = i3 % 128;
        f28821 = i4;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (i <= 0) {
            return false;
        }
        int i5 = i4 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
        f28820 = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11922ef
    /* JADX INFO: renamed from: ﾒ */
    public final String mo30164() {
        int i = 2 % 2;
        int i2 = f28821 + 101;
        f28820 = i2 % 128;
        String strIntern = m30182("驇驹\udca9軮ⱗ", i2 % 2 == 0 ? Process.myTid() / 111 : Process.myTid() >> 22).intern();
        int i3 = f28820 + 67;
        f28821 = i3 % 128;
        int i4 = i3 % 2;
        return strIntern;
    }

    /* JADX INFO: renamed from: ﻐ */
    private static String m30182(String str, int i) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (C11943f.f28848) {
            char[] cArrM30189 = C11943f.m30189(f28822, cArr, i);
            C11943f.f28846 = 4;
            while (C11943f.f28846 < cArrM30189.length) {
                C11943f.f28847 = C11943f.f28846 - 4;
                cArrM30189[C11943f.f28846] = (char) (((long) (cArrM30189[C11943f.f28846] ^ cArrM30189[C11943f.f28846 % 4])) ^ (((long) C11943f.f28847) * f28822));
                C11943f.f28846++;
            }
            str2 = new String(cArrM30189, 4, cArrM30189.length - 4);
        }
        return str2;
    }
}
