package com.ironsource.adqualitysdk.sdk.p286i;

import android.text.TextUtils;
import com.vungle.ads.internal.protos.Sdk;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.es */
/* JADX INFO: loaded from: classes6.dex */
public final class C11935es extends AbstractC11929em {

    /* JADX INFO: renamed from: ｋ */
    private static int f28823 = 1;

    /* JADX INFO: renamed from: ﾇ */
    private static long f28824 = 1063470664077733196L;

    /* JADX INFO: renamed from: ﾒ */
    private static int f28825;

    public C11935es(AbstractC11919ec abstractC11919ec, AbstractC11919ec abstractC11919ec2, C11904do c11904do) {
        super(abstractC11919ec, abstractC11919ec2, c11904do);
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11928el
    /* JADX INFO: renamed from: ﻐ */
    final boolean mo30173(int i) {
        int i2 = 2 % 2;
        int i3 = f28823 + 79;
        int i4 = i3 % 128;
        f28825 = i4;
        if (i3 % 2 != 0) {
            Object obj = null;
            super.hashCode();
            throw null;
        }
        if (i < 0) {
            return false;
        }
        int i5 = i4 + 41;
        f28823 = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i4 + 115;
        f28823 = i7 % 128;
        int i8 = i7 % 2;
        return true;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11922ef
    /* JADX INFO: renamed from: ﾒ */
    public final String mo30164() {
        int i = 2 % 2;
        int i2 = f28823 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
        f28825 = i2 % 128;
        int i3 = i2 % 2;
        String strIntern = m30183("╛䖴╥ꣅ⯗錐", TextUtils.getOffsetAfter("", 0)).intern();
        int i4 = f28823 + 75;
        f28825 = i4 % 128;
        if (i4 % 2 == 0) {
            return strIntern;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ */
    private static String m30183(String str, int i) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (C11943f.f28848) {
            char[] cArrM30189 = C11943f.m30189(f28824, cArr, i);
            C11943f.f28846 = 4;
            while (C11943f.f28846 < cArrM30189.length) {
                C11943f.f28847 = C11943f.f28846 - 4;
                cArrM30189[C11943f.f28846] = (char) (((long) (cArrM30189[C11943f.f28846] ^ cArrM30189[C11943f.f28846 % 4])) ^ (((long) C11943f.f28847) * f28824));
                C11943f.f28846++;
            }
            str2 = new String(cArrM30189, 4, cArrM30189.length - 4);
        }
        return str2;
    }
}
