package com.ironsource.adqualitysdk.sdk.p286i;

import com.google.android.exoplayer2.C9415C;
import com.ironsource.C11341A5;
import com.vungle.ads.internal.protos.Sdk;
import java.io.UnsupportedEncodingException;
import jp.maio.sdk.android.MaioAds;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.gr */
/* JADX INFO: loaded from: classes6.dex */
public final class C11988gr extends AbstractC11980gj {

    /* JADX INFO: renamed from: ﻐ */
    private static int f29052 = 0;

    /* JADX INFO: renamed from: ｋ */
    private static int f29053 = 1;

    /* JADX INFO: renamed from: ﾇ */
    private static char[] f29054 = {'5', 'm', 'O', 'M', 'g', 'e', 'l', 'N', 'P', 'k', 'g', 'L', 'G', 'g', 'i', 'k', 'p', 'l', 'f', 'I', C11341A5.f23808U, 'W', 'e', 'l', 'X', 'R', 'k', 't', 226, 224, 231};

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11980gj
    /* JADX INFO: renamed from: ﾇ */
    public final String mo30211() {
        int i = 2 % 2;
        int i2 = f29053 + 113;
        f29052 = i2 % 128;
        String strIntern = (i2 % 2 != 0 ? m30240(new int[]{0, 27, 0, 0}, "\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0001", false) : m30240(new int[]{0, 27, 0, 0}, "\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0001", false)).intern();
        int i3 = f29052 + 99;
        f29053 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 22 / 0;
        }
        return strIntern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11980gj
    /* JADX INFO: renamed from: ﾒ */
    public final Class mo30212() {
        int i = 2 % 2;
        int i2 = f29052 + 11;
        int i3 = i2 % 128;
        f29053 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 25;
        f29052 = i5 % 128;
        int i6 = i5 % 2;
        return MaioAds.class;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11980gj
    /* JADX INFO: renamed from: ｋ */
    public final AbstractC11840be mo30210() {
        int i = 2 % 2;
        C11857bv c11857bv = new C11857bv(mo30209());
        int i2 = f29052 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
        f29053 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 11 / 0;
        }
        return c11857bv;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11980gj
    /* JADX INFO: renamed from: ﻛ */
    public final String mo30209() {
        int i = 2 % 2;
        int i2 = f29053 + 41;
        f29052 = i2 % 128;
        String strIntern = (i2 % 2 != 0 ? m30240(new int[]{27, 4, Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE, 0}, "\u0000\u0000\u0000\u0000", true) : m30240(new int[]{27, 4, Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE, 0}, "\u0000\u0000\u0000\u0000", false)).intern();
        int i3 = f29053 + 9;
        f29052 = i3 % 128;
        int i4 = i3 % 2;
        return strIntern;
    }

    /* JADX INFO: renamed from: ﻛ */
    private static String m30240(int[] iArr, String str, boolean z) throws UnsupportedEncodingException {
        String str2;
        Object bytes = str;
        if (str != null) {
            bytes = str.getBytes(C9415C.ISO88591_NAME);
        }
        byte[] bArr = (byte[]) bytes;
        synchronized (C12024i.f29270) {
            int i = iArr[0];
            int i2 = iArr[1];
            int i3 = iArr[2];
            int i4 = iArr[3];
            char[] cArr = new char[i2];
            System.arraycopy(f29054, i, cArr, 0, i2);
            if (bArr != null) {
                char[] cArr2 = new char[i2];
                C12024i.f29269 = 0;
                char c = 0;
                while (C12024i.f29269 < i2) {
                    if (bArr[C12024i.f29269] == 1) {
                        cArr2[C12024i.f29269] = (char) (((cArr[C12024i.f29269] << 1) + 1) - c);
                    } else {
                        cArr2[C12024i.f29269] = (char) ((cArr[C12024i.f29269] << 1) - c);
                    }
                    c = cArr2[C12024i.f29269];
                    C12024i.f29269++;
                }
                cArr = cArr2;
            }
            if (i4 > 0) {
                char[] cArr3 = new char[i2];
                System.arraycopy(cArr, 0, cArr3, 0, i2);
                int i5 = i2 - i4;
                System.arraycopy(cArr3, 0, cArr, i5, i4);
                System.arraycopy(cArr3, i4, cArr, 0, i5);
            }
            if (z) {
                char[] cArr4 = new char[i2];
                C12024i.f29269 = 0;
                while (C12024i.f29269 < i2) {
                    cArr4[C12024i.f29269] = cArr[(i2 - C12024i.f29269) - 1];
                    C12024i.f29269++;
                }
                cArr = cArr4;
            }
            if (i3 > 0) {
                C12024i.f29269 = 0;
                while (C12024i.f29269 < i2) {
                    cArr[C12024i.f29269] = (char) (cArr[C12024i.f29269] - iArr[2]);
                    C12024i.f29269++;
                }
            }
            str2 = new String(cArr);
        }
        return str2;
    }
}
