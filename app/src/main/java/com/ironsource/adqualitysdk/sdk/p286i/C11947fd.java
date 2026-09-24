package com.ironsource.adqualitysdk.sdk.p286i;

import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import androidx.media3.common.PlaybackException;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.fd */
/* JADX INFO: loaded from: classes6.dex */
public final class C11947fd extends AbstractC11927ek {

    /* JADX INFO: renamed from: ﺙ */
    private static int f28860 = 0;

    /* JADX INFO: renamed from: ﻏ */
    private static int f28861 = 1;

    /* JADX INFO: renamed from: ﻐ */
    private static int f28862 = -61983608;

    /* JADX INFO: renamed from: ﻛ */
    private static int f28863 = 107;

    /* JADX INFO: renamed from: ｋ */
    private static int f28864 = 350308739;

    /* JADX INFO: renamed from: ﾇ */
    private static byte[] f28865 = {0};

    /* JADX INFO: renamed from: ﾒ */
    private static short[] f28866;

    public C11947fd(AbstractC11919ec abstractC11919ec, AbstractC11919ec abstractC11919ec2, C11904do c11904do) {
        super(abstractC11919ec, abstractC11919ec2, c11904do);
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11927ek
    /* JADX INFO: renamed from: ﾇ */
    public final Number mo30172(Number number, Number number2) {
        int i = 2 % 2;
        int i2 = f28860;
        int i3 = i2 + 25;
        f28861 = i3 % 128;
        int i4 = i3 % 2;
        if (!(number instanceof Double)) {
            int i5 = i2 + 91;
            f28861 = i5 % 128;
            if (i5 % 2 == 0) {
                boolean z = number2 instanceof Double;
                throw null;
            }
            if (!(number2 instanceof Double)) {
                if (!(number instanceof Long)) {
                    int i6 = i2 + 53;
                    f28861 = i6 % 128;
                    int i7 = i6 % 2;
                    if (!(number2 instanceof Long)) {
                        return Integer.valueOf(number.intValue() * number2.intValue());
                    }
                }
                return Long.valueOf(number.longValue() * number2.longValue());
            }
        }
        return Double.valueOf(number.doubleValue() * number2.doubleValue());
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11922ef
    /* JADX INFO: renamed from: ﾒ */
    public final String mo30164() {
        int i = 2 % 2;
        int i2 = f28860 + 115;
        f28861 = i2 % 128;
        int i3 = i2 % 2;
        String strIntern = m30193((-350308739) - Gravity.getAbsoluteGravity(0, 0), (short) (23 - TextUtils.indexOf("", "", 0, 0)), 61983650 - TextUtils.getOffsetBefore("", 0), (byte) (Color.rgb(0, 0, 0) + 16777216), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + PlaybackException.ERROR_CODE_SKIP_LIMIT_REACHED).intern();
        int i4 = f28861 + 95;
        f28860 = i4 % 128;
        if (i4 % 2 == 0) {
            return strIntern;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ */
    private static String m30193(int i, short s, int i2, byte b, int i3) {
        String string;
        synchronized (C12086m.f29832) {
            StringBuilder sb = new StringBuilder();
            int i4 = f28863;
            int i5 = i3 + i4;
            int i6 = i5 == -1 ? 1 : 0;
            if (i6 != 0) {
                byte[] bArr = f28865;
                if (bArr != null) {
                    i5 = (byte) (bArr[f28864 + i] + i4);
                } else {
                    i5 = (short) (f28866[f28864 + i] + i4);
                }
            }
            if (i5 > 0) {
                C12086m.f29836 = ((i + i5) - 2) + f28864 + i6;
                C12086m.f29833 = b;
                C12086m.f29837 = (char) (i2 + f28862);
                sb.append(C12086m.f29837);
                C12086m.f29834 = C12086m.f29837;
                C12086m.f29835 = 1;
                while (C12086m.f29835 < i5) {
                    byte[] bArr2 = f28865;
                    if (bArr2 != null) {
                        int i7 = C12086m.f29836;
                        C12086m.f29836 = i7 - 1;
                        C12086m.f29837 = (char) (C12086m.f29834 + (((byte) (bArr2[i7] + s)) ^ C12086m.f29833));
                    } else {
                        short[] sArr = f28866;
                        int i8 = C12086m.f29836;
                        C12086m.f29836 = i8 - 1;
                        C12086m.f29837 = (char) (C12086m.f29834 + (((short) (sArr[i8] + s)) ^ C12086m.f29833));
                    }
                    sb.append(C12086m.f29837);
                    C12086m.f29834 = C12086m.f29837;
                    C12086m.f29835++;
                }
            }
            string = sb.toString();
        }
        return string;
    }
}
