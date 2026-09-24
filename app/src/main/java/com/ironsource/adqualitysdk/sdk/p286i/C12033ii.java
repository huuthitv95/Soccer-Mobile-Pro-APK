package com.ironsource.adqualitysdk.sdk.p286i;

import android.content.Context;
import android.content.SharedPreferences;
import android.provider.Settings;
import android.text.TextUtils;
import com.google.android.exoplayer2.C9415C;
import com.vungle.ads.internal.protos.Sdk;
import java.io.UnsupportedEncodingException;
import java.util.UUID;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ii */
/* JADX INFO: loaded from: classes6.dex */
public final class C12033ii {

    /* JADX INFO: renamed from: ﻛ */
    private static char[] f29347 = {'2', 'f', 'd', 'a', 'f', 'l', 'p', 'k', 'i', 'g', '9', 'k', 'l', 's', 'k', 'd', AbstractJsonLexerKt.BEGIN_LIST, AbstractJsonLexerKt.END_LIST, 'd', 'i', 'k', 'd', 'Z', 'a', 'k', 'e', 'e', 'k', 'k', 'i', 'h', 'd', 'l', '^', 'N', 'O', 'H', 'E', 'M', 'K', '0', '7', 'X', 'z', 271, 300, 266, 264, 298, 306, 304, 303, 305, 303, 303, 300, 265, 265, 304, 305, 308, 298, 256, 237, 255, 268, 282, 279, 268, 274, 278, 273, 271, 269, 246, 266, 299, 305, 306, 299, 265, 272, 275, 272, 303, 302, 310, 312, 287, '1', 'c', 'I', 'R', 'p', 'L', 'I', 'k', 'p', 'q', 's', '7', 'i', 'k', 'i', 'j', 'l', 'd', 'f', 'f', 'k', 'q', 'o', 'n', 'l', 'f', 'G', 'J', 'f'};

    /* JADX INFO: renamed from: ﾇ */
    private static int f29348 = 0;

    /* JADX INFO: renamed from: ﾒ */
    private static int f29349 = 1;

    /* JADX INFO: renamed from: ﾒ */
    public static void m30512(String str, String str2) {
        int i = 2 % 2;
        int i2 = f29349 + 55;
        f29348 = i2 % 128;
        int i3 = i2 % 2;
        C12085l.m30909(str, str2);
        if (i3 != 0) {
            throw null;
        }
        int i4 = f29348 + 47;
        f29349 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: renamed from: ﾇ */
    private static void m30511(String str, String str2) {
        int i = 2 % 2;
        int i2 = f29349 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
        f29348 = i2 % 128;
        int i3 = i2 % 2;
        C12085l.m30929(str, str2);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ */
    public static String m30510(Context context) throws UnsupportedEncodingException {
        String strIntern;
        String strM30509;
        int i = 2 % 2;
        String string = Settings.Secure.getString(context.getApplicationContext().getContentResolver(), m30509(new int[]{0, 10, 0, 0}, "\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001", true).intern());
        if (string == null) {
            int i2 = f29348 + 75;
            f29349 = i2 % 128;
            if (i2 % 2 == 0) {
                strIntern = m30509(new int[]{10, 33, 0, 23}, "\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001", false).intern();
                strM30509 = m30509(new int[]{43, 46, 198, 0}, "\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0000", false);
            } else {
                strIntern = m30509(new int[]{10, 33, 0, 23}, "\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001", false).intern();
                strM30509 = m30509(new int[]{43, 46, 198, 0}, "\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0000", true);
            }
            m30511(strIntern, strM30509.intern());
            string = m30508(context);
        }
        int i3 = f29349 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
        f29348 = i3 % 128;
        int i4 = i3 % 2;
        return string;
    }

    /* JADX INFO: renamed from: ﻛ */
    private static String m30508(Context context) throws UnsupportedEncodingException {
        String string;
        SharedPreferences.Editor editorEdit;
        String strM30509;
        int i = 2 % 2;
        SharedPreferences sharedPreferences = context.getSharedPreferences(m30509(new int[]{89, 11, 0, 0}, "\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001", true).intern(), 0);
        String string2 = sharedPreferences.getString(m30509(new int[]{100, 18, 0, 9}, "\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0000", false).intern(), null);
        if (TextUtils.isEmpty(string2)) {
            int i2 = f29348 + 11;
            f29349 = i2 % 128;
            if (i2 % 2 == 0) {
                string = UUID.randomUUID().toString();
                editorEdit = sharedPreferences.edit();
                strM30509 = m30509(new int[]{100, 18, 0, 9}, "\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0000", false);
            } else {
                string = UUID.randomUUID().toString();
                editorEdit = sharedPreferences.edit();
                strM30509 = m30509(new int[]{100, 18, 0, 9}, "\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0000", false);
            }
            editorEdit.putString(strM30509.intern(), string).commit();
            string2 = string;
        }
        int i3 = f29349 + 35;
        f29348 = i3 % 128;
        int i4 = i3 % 2;
        return string2;
    }

    /* JADX INFO: renamed from: ﻛ */
    private static String m30509(int[] iArr, String str, boolean z) throws UnsupportedEncodingException {
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
            System.arraycopy(f29347, i, cArr, 0, i2);
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
