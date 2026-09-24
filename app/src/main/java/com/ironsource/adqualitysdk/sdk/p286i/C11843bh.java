package com.ironsource.adqualitysdk.sdk.p286i;

import android.os.Process;
import com.vungle.ads.internal.protos.Sdk;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.bh */
/* JADX INFO: loaded from: classes6.dex */
public final class C11843bh extends AbstractC11840be {

    /* JADX INFO: renamed from: ﻐ */
    private static int f27613 = 0;

    /* JADX INFO: renamed from: ﾇ */
    private static int f27614 = 1;

    /* JADX INFO: renamed from: ﾒ */
    private static long f27615 = -6074301744378840076L;

    public C11843bh(String str) {
        super(str);
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be
    /* JADX INFO: renamed from: ﾇ */
    public final String mo28809() {
        int i = 2 % 2;
        int i2 = f27613 + 63;
        f27614 = i2 % 128;
        int i3 = i2 % 2;
        String strIntern = m28840("쳐\uecf9첕䓠靃덉膭⍌蝸ꌜ\uf233", Process.myTid() >> 22).intern();
        int i4 = f27614 + 73;
        f27613 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 18 / 0;
        }
        return strIntern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be
    /* JADX INFO: renamed from: ﾇ */
    final Class mo28808(String str) {
        int i = 2 % 2;
        int i2 = f27614 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
        f27613 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 49 / 0;
        }
        return null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be
    /* JADX INFO: renamed from: ｋ */
    final Map<String, AbstractC11840be.b> mo28807() {
        int i = 2 % 2;
        HashMap map = new HashMap();
        int i2 = f27613 + 29;
        f27614 = i2 % 128;
        if (i2 % 2 != 0) {
            return map;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be
    /* JADX INFO: renamed from: ﻏ */
    public final boolean mo28821() {
        int i = 2 % 2;
        int i2 = f27614;
        int i3 = i2 + 5;
        f27613 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 83;
        f27613 = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be
    /* JADX INFO: renamed from: ﱡ */
    public final boolean mo28829() {
        int i = 2 % 2;
        int i2 = f27613 + 9;
        int i3 = i2 % 128;
        f27614 = i3;
        boolean z = i2 % 2 != 0;
        int i4 = i3 + 71;
        f27613 = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    /* JADX INFO: renamed from: ﾒ */
    private static String m28840(String str, int i) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (C11943f.f28848) {
            char[] cArrM30189 = C11943f.m30189(f27615, cArr, i);
            C11943f.f28846 = 4;
            while (C11943f.f28846 < cArrM30189.length) {
                C11943f.f28847 = C11943f.f28846 - 4;
                cArrM30189[C11943f.f28846] = (char) (((long) (cArrM30189[C11943f.f28846] ^ cArrM30189[C11943f.f28846 % 4])) ^ (((long) C11943f.f28847) * f27615));
                C11943f.f28846++;
            }
            str2 = new String(cArrM30189, 4, cArrM30189.length - 4);
        }
        return str2;
    }
}
