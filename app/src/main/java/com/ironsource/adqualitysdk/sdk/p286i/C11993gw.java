package com.ironsource.adqualitysdk.sdk.p286i;

import android.graphics.ImageFormat;
import android.view.ViewConfiguration;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import tv.superawesome.sdk.publisher.AwesomeAds;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.gw */
/* JADX INFO: loaded from: classes6.dex */
public final class C11993gw extends AbstractC11980gj {

    /* JADX INFO: renamed from: ﻐ */
    private static int f29079 = 0;

    /* JADX INFO: renamed from: ﻛ */
    private static char f29080 = 5;

    /* JADX INFO: renamed from: ｋ */
    private static int f29081 = 1;

    /* JADX INFO: renamed from: ﾒ */
    private static char[] f29082 = {'t', 'v', '.', 's', AbstractJsonLexerKt.UNICODE_ESC, 'p', 'e', 'r', 'a', 'w', 'o', 'm', 'd', 'k', 'b', 'l', 'i', 'h', 'A', 'x', 'y', 'z', AbstractJsonLexerKt.BEGIN_OBJ, '|', AbstractJsonLexerKt.END_OBJ};

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11980gj
    /* JADX INFO: renamed from: ﾇ */
    public final String mo30211() {
        int keyRepeatTimeout;
        byte keyRepeatDelay;
        int i = 2 % 2;
        int i2 = f29081 + 13;
        f29079 = i2 % 128;
        if (i2 % 2 != 0) {
            keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 99) * 24;
            keyRepeatDelay = (byte) (56 % (ViewConfiguration.getKeyRepeatDelay() * 116));
        } else {
            keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 40;
            keyRepeatDelay = (byte) (96 - (ViewConfiguration.getKeyRepeatDelay() >> 16));
        }
        return m30246("\u0001\u0002\u0003\u0004\u0000\t\u0007\b\t\u0005\b\u0001\u000b\f\u0007\u0001\u0002\r\f\u0003\t\u0000\n\u0013\u0012\u0001\u0010\u0007\f\u0007\u0013\b\b\u0001\u000b\f\b\u0010\r\u0002", keyRepeatTimeout, keyRepeatDelay).intern();
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11980gj
    /* JADX INFO: renamed from: ﾒ */
    public final Class mo30212() {
        int i = 2 % 2;
        int i2 = f29079;
        int i3 = i2 + 45;
        f29081 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 69;
        f29081 = i5 % 128;
        int i6 = i5 % 2;
        return AwesomeAds.class;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11980gj
    /* JADX INFO: renamed from: ｋ */
    public final AbstractC11840be mo30210() {
        int i = 2 % 2;
        C11868cf c11868cf = new C11868cf(mo30209());
        int i2 = f29079 + 33;
        f29081 = i2 % 128;
        int i3 = i2 % 2;
        return c11868cf;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11980gj
    /* JADX INFO: renamed from: ﻛ */
    public final String mo30209() {
        int i = 2 % 2;
        int i2 = f29081 + 69;
        f29079 = i2 % 128;
        int i3 = i2 % 2;
        String strIntern = m30246("\u0004\u0000\u0006\u0007\b\t\u0005\u0007\u0000\r\u0010\u000b", 12 - (ViewConfiguration.getJumpTapTimeout() >> 16), (byte) (ImageFormat.getBitsPerPixel(0) + 28)).intern();
        int i4 = f29081 + 29;
        f29079 = i4 % 128;
        int i5 = i4 % 2;
        return strIntern;
    }

    /* JADX INFO: renamed from: ｋ */
    private static String m30246(String str, int i, byte b) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (C11970g.f28961) {
            char[] cArr2 = f29082;
            char c = f29080;
            char[] cArr3 = new char[i];
            if (i % 2 != 0) {
                i--;
                cArr3[i] = (char) (cArr[i] - b);
            }
            if (i > 1) {
                C11970g.f28962 = 0;
                while (C11970g.f28962 < i) {
                    C11970g.f28964 = cArr[C11970g.f28962];
                    C11970g.f28965 = cArr[C11970g.f28962 + 1];
                    if (C11970g.f28964 == C11970g.f28965) {
                        cArr3[C11970g.f28962] = (char) (C11970g.f28964 - b);
                        cArr3[C11970g.f28962 + 1] = (char) (C11970g.f28965 - b);
                    } else {
                        C11970g.f28963 = C11970g.f28964 / c;
                        C11970g.f28959 = C11970g.f28964 % c;
                        C11970g.f28966 = C11970g.f28965 / c;
                        C11970g.f28960 = C11970g.f28965 % c;
                        if (C11970g.f28959 == C11970g.f28960) {
                            C11970g.f28963 = ((C11970g.f28963 + c) - 1) % c;
                            C11970g.f28966 = ((C11970g.f28966 + c) - 1) % c;
                            int i2 = (C11970g.f28963 * c) + C11970g.f28959;
                            int i3 = (C11970g.f28966 * c) + C11970g.f28960;
                            cArr3[C11970g.f28962] = cArr2[i2];
                            cArr3[C11970g.f28962 + 1] = cArr2[i3];
                        } else if (C11970g.f28963 == C11970g.f28966) {
                            C11970g.f28959 = ((C11970g.f28959 + c) - 1) % c;
                            C11970g.f28960 = ((C11970g.f28960 + c) - 1) % c;
                            int i4 = (C11970g.f28963 * c) + C11970g.f28959;
                            int i5 = (C11970g.f28966 * c) + C11970g.f28960;
                            cArr3[C11970g.f28962] = cArr2[i4];
                            cArr3[C11970g.f28962 + 1] = cArr2[i5];
                        } else {
                            int i6 = (C11970g.f28963 * c) + C11970g.f28960;
                            int i7 = (C11970g.f28966 * c) + C11970g.f28959;
                            cArr3[C11970g.f28962] = cArr2[i6];
                            cArr3[C11970g.f28962 + 1] = cArr2[i7];
                        }
                    }
                    C11970g.f28962 += 2;
                }
            }
            str2 = new String(cArr3);
        }
        return str2;
    }
}
