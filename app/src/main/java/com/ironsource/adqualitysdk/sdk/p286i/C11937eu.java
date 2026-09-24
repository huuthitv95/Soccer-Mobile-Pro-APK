package com.ironsource.adqualitysdk.sdk.p286i;

import com.google.android.exoplayer2.C9415C;
import java.io.UnsupportedEncodingException;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.eu */
/* JADX INFO: loaded from: classes6.dex */
public final class C11937eu extends AbstractC11927ek {

    /* JADX INFO: renamed from: ﻛ */
    private static char[] f28827 = {18};

    /* JADX INFO: renamed from: ｋ */
    private static int f28828 = 1;

    /* JADX INFO: renamed from: ﾒ */
    private static int f28829;

    public C11937eu(AbstractC11919ec abstractC11919ec, AbstractC11919ec abstractC11919ec2, C11904do c11904do) {
        super(abstractC11919ec, abstractC11919ec2, c11904do);
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11927ek
    /* JADX INFO: renamed from: ﾇ */
    public final Number mo30172(Number number, Number number2) {
        int i = 2 % 2;
        Object obj = null;
        if ((number instanceof Double) || (number2 instanceof Double)) {
            Double dValueOf = Double.valueOf(number.doubleValue() % number2.doubleValue());
            int i2 = f28829 + 7;
            f28828 = i2 % 128;
            if (i2 % 2 != 0) {
                return dValueOf;
            }
            throw null;
        }
        if (!(number instanceof Long)) {
            int i3 = f28828 + 3;
            f28829 = i3 % 128;
            if (i3 % 2 != 0) {
                boolean z = number2 instanceof Long;
                super.hashCode();
                throw null;
            }
            if (!(number2 instanceof Long)) {
                return Integer.valueOf(number.intValue() % number2.intValue());
            }
        }
        return Long.valueOf(number.longValue() % number2.longValue());
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11922ef
    /* JADX INFO: renamed from: ﾒ */
    public final String mo30164() {
        int i = 2 % 2;
        int i2 = f28828 + 113;
        f28829 = i2 % 128;
        int i3 = i2 % 2;
        String strIntern = m30184(new int[]{0, 1, 0, 1}, "\u0001", true).intern();
        int i4 = f28829 + 83;
        f28828 = i4 % 128;
        int i5 = i4 % 2;
        return strIntern;
    }

    /* JADX INFO: renamed from: ﻐ */
    private static String m30184(int[] iArr, String str, boolean z) throws UnsupportedEncodingException {
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
            System.arraycopy(f28827, i, cArr, 0, i2);
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
