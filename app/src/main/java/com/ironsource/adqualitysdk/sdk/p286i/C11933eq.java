package com.ironsource.adqualitysdk.sdk.p286i;

import android.os.SystemClock;
import com.vungle.ads.internal.protos.Sdk;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.eq */
/* JADX INFO: loaded from: classes6.dex */
public final class C11933eq extends AbstractC11928el {

    /* JADX INFO: renamed from: ｋ */
    private static long f28817 = 2240082090965649151L;

    /* JADX INFO: renamed from: ﾇ */
    private static int f28818 = 0;

    /* JADX INFO: renamed from: ﾒ */
    private static int f28819 = 1;

    public C11933eq(AbstractC11919ec abstractC11919ec, AbstractC11919ec abstractC11919ec2, C11904do c11904do) {
        super(abstractC11919ec, abstractC11919ec2, c11904do);
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11928el
    /* JADX INFO: renamed from: ﻐ */
    final boolean mo30173(int i) {
        int i2 = 2 % 2;
        int i3 = f28819;
        int i4 = i3 + 19;
        f28818 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
        if (i == 0) {
            return true;
        }
        int i5 = i3 + 115;
        f28818 = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11928el
    /* JADX INFO: renamed from: ﻐ */
    final boolean mo30175(String str, String str2) {
        int i = 2 % 2;
        int i2 = f28818 + 89;
        f28819 = i2 % 128;
        int i3 = i2 % 2;
        boolean zEquals = str.equals(str2);
        if (i3 == 0) {
            int i4 = 98 / 0;
        }
        int i5 = f28818 + 87;
        f28819 = i5 % 128;
        int i6 = i5 % 2;
        return zEquals;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11928el
    /* JADX INFO: renamed from: ﻐ */
    final boolean mo30174(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = f28819 + 23;
        int i3 = i2 % 128;
        f28818 = i3;
        int i4 = i2 % 2;
        if (obj != obj2) {
            return false;
        }
        int i5 = i3 + 15;
        f28819 = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11922ef
    /* JADX INFO: renamed from: ﾒ */
    public final String mo30164() {
        int i = 2 % 2;
        int i2 = f28819 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
        f28818 = i2 % 128;
        return (i2 % 2 != 0 ? m30181("웂蛙", 16970 % (SystemClock.uptimeMillis() > 1L ? 1 : (SystemClock.uptimeMillis() == 1L ? 0 : -1))) : m30181("웂蛙", (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 16410)).intern();
    }

    /* JADX INFO: renamed from: ﻐ */
    private static String m30181(String str, int i) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (C11997h.f29102) {
            C11997h.f29101 = i;
            char[] cArr2 = new char[cArr.length];
            C11997h.f29103 = 0;
            while (C11997h.f29103 < cArr.length) {
                cArr2[C11997h.f29103] = (char) (((long) (cArr[C11997h.f29103] ^ (C11997h.f29103 * C11997h.f29101))) ^ f28817);
                C11997h.f29103++;
            }
            str2 = new String(cArr2);
        }
        return str2;
    }
}
