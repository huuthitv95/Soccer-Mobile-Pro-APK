package com.ironsource.adqualitysdk.sdk.p286i;

import com.google.android.exoplayer2.C9415C;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.bg */
/* JADX INFO: loaded from: classes6.dex */
public final class C11842bg extends AbstractC11840be {

    /* JADX INFO: renamed from: ﻛ */
    private static char[] f27610 = {'!', 'A', 'G', 'I', 'D', 'D', 'H'};

    /* JADX INFO: renamed from: ﾇ */
    private static int f27611 = 1;

    /* JADX INFO: renamed from: ﾒ */
    private static int f27612;

    public C11842bg(String str) {
        super(str);
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be
    /* JADX INFO: renamed from: ﾇ */
    public final String mo28809() {
        int i = 2 % 2;
        int i2 = f27611 + 91;
        f27612 = i2 % 128;
        int i3 = i2 % 2;
        String strIntern = m28839(new int[]{0, 7, 0, 4}, "\u0000\u0001\u0001\u0001\u0001\u0001\u0001", true).intern();
        int i4 = f27611 + 53;
        f27612 = i4 % 128;
        if (i4 % 2 == 0) {
            return strIntern;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be
    /* JADX INFO: renamed from: ﾇ */
    final Class mo28808(String str) {
        int i = 2 % 2;
        int i2 = f27611 + 57;
        int i3 = i2 % 128;
        f27612 = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            super.hashCode();
            throw null;
        }
        int i4 = i3 + 107;
        f27611 = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be
    /* JADX INFO: renamed from: ｋ */
    final Map<String, AbstractC11840be.b> mo28807() {
        int i = 2 % 2;
        HashMap map = new HashMap();
        int i2 = f27612 + 81;
        f27611 = i2 % 128;
        int i3 = i2 % 2;
        return map;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be
    /* JADX INFO: renamed from: ﻏ */
    public final boolean mo28821() {
        int i = 2 % 2;
        int i2 = f27611;
        int i3 = i2 + 3;
        f27612 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 31;
        f27612 = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be
    /* JADX INFO: renamed from: ﱡ */
    public final boolean mo28829() {
        int i = 2 % 2;
        int i2 = f27611 + 7;
        int i3 = i2 % 128;
        f27612 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 11;
        f27611 = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    /* JADX INFO: renamed from: ﾒ */
    private static String m28839(int[] iArr, String str, boolean z) throws UnsupportedEncodingException {
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
            System.arraycopy(f27610, i, cArr, 0, i2);
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
