package com.ironsource.adqualitysdk.sdk.p286i;

import com.google.android.exoplayer2.C9415C;
import java.io.UnsupportedEncodingException;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.aq */
/* JADX INFO: loaded from: classes6.dex */
public final class C11825aq extends AbstractC11823ao.AnonymousClass3 {

    /* JADX INFO: renamed from: ｋ */
    private static int f27239 = 0;

    /* JADX INFO: renamed from: ﾇ */
    private static char[] f27240 = {AbstractJsonLexerKt.COLON, 't', 'l', 251, 250, 251, 240, 232, 249};

    /* JADX INFO: renamed from: ﾒ */
    private static int f27241 = 1;

    /* JADX INFO: renamed from: ﻛ */
    public final String m28555() {
        int i = 2 % 2;
        int i2 = f27239 + 49;
        f27241 = i2 % 128;
        int i3 = i2 % 2;
        String strOptString = m28507().optString(m28554(new int[]{0, 3, 0, 0}, "\u0000\u0000\u0001", true).intern());
        int i4 = f27239 + 109;
        f27241 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 99 / 0;
        }
        return strOptString;
    }

    /* JADX INFO: renamed from: ﾒ */
    public final Object m28556(String str) {
        int i = 2 % 2;
        int i2 = f27239 + 5;
        f27241 = i2 % 128;
        int i3 = i2 % 2;
        JSONObject jSONObjectM28557 = m28557();
        Object obj = null;
        if (jSONObjectM28557 == null) {
            int i4 = f27239 + 63;
            f27241 = i4 % 128;
            int i5 = i4 % 2;
            return null;
        }
        Object objOpt = jSONObjectM28557.opt(str);
        int i6 = f27241 + 85;
        f27239 = i6 % 128;
        if (i6 % 2 == 0) {
            return objOpt;
        }
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ */
    public final JSONObject m28557() {
        int i = 2 % 2;
        int i2 = f27241 + 35;
        f27239 = i2 % 128;
        int i3 = i2 % 2;
        JSONObject jSONObjectOptJSONObject = m28507().optJSONObject(m28554(new int[]{3, 6, 135, 1}, null, true).intern());
        int i4 = f27241 + 95;
        f27239 = i4 % 128;
        int i5 = i4 % 2;
        return jSONObjectOptJSONObject;
    }

    /* JADX INFO: renamed from: ｋ */
    private static String m28554(int[] iArr, String str, boolean z) throws UnsupportedEncodingException {
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
            System.arraycopy(f27240, i, cArr, 0, i2);
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
