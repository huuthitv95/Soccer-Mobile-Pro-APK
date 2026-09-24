package com.ironsource.adqualitysdk.sdk.p286i;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import com.ironsource.mediationsdk.IronSource;
import com.vungle.ads.internal.protos.Sdk;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.gq */
/* JADX INFO: loaded from: classes6.dex */
public final class C11987gq extends AbstractC11980gj {

    /* JADX INFO: renamed from: ﻐ */
    private static int f29048 = 0;

    /* JADX INFO: renamed from: ﻛ */
    private static char[] f29049 = {'c', 'o', 'm', '.', 'i', 'r', 'n', 's', AbstractJsonLexerKt.UNICODE_ESC, 'e', 'd', 'a', 't', 'k', 'I', 'S'};

    /* JADX INFO: renamed from: ｋ */
    private static char f29050 = 4;

    /* JADX INFO: renamed from: ﾇ */
    private static int f29051 = 1;

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11980gj
    /* JADX INFO: renamed from: ﾇ */
    public final String mo30211() {
        int iIndexOf;
        int size;
        int i = 2 % 2;
        int i2 = f29051 + 7;
        f29048 = i2 % 128;
        if (i2 % 2 != 0) {
            iIndexOf = TextUtils.indexOf("", "") + 92;
            size = 116 >>> View.MeasureSpec.getSize(0);
        } else {
            iIndexOf = TextUtils.indexOf("", "") + 38;
            size = 22 - View.MeasureSpec.getSize(0);
        }
        return m30239("\u0001\u0002\u0003\u0000\u0005\u0006\u0002\u0005\u0005\u0003\t\u0004\u0001\b\u0000\u0003\n\u000b\u0007\b\u0000\b\u0002\u0005\u0006\u000b\u000f\u0001\r\u0006\u0002\u0005\r\u0003\t\u0004\u0001\b", iIndexOf, (byte) size).intern();
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11980gj
    /* JADX INFO: renamed from: ﾒ */
    public final Class mo30212() {
        int i = 2 % 2;
        int i2 = f29048 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
        int i3 = i2 % 128;
        f29051 = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            super.hashCode();
            throw null;
        }
        int i4 = i3 + 23;
        f29048 = i4 % 128;
        if (i4 % 2 == 0) {
            return IronSource.class;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11980gj
    /* JADX INFO: renamed from: ｋ */
    public final AbstractC11840be mo30210() {
        int i = 2 % 2;
        C11856bu c11856bu = new C11856bu(mo30209());
        int i2 = f29048 + 73;
        f29051 = i2 % 128;
        if (i2 % 2 != 0) {
            return c11856bu;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11980gj
    /* JADX INFO: renamed from: ﻛ */
    public final String mo30209() {
        int iIndexOf;
        int iGreen;
        int i = 2 % 2;
        int i2 = f29051 + 35;
        f29048 = i2 % 128;
        if (i2 % 2 != 0) {
            iIndexOf = TextUtils.indexOf("", "", 0, 0) * 46;
            iGreen = 10 >>> Color.green(1);
        } else {
            iIndexOf = TextUtils.indexOf("", "", 0, 0) + 10;
            iGreen = 88 - Color.green(0);
        }
        String strIntern = m30239("\u0005\u0006\u0002\u0005\u0005\u0003\t\u0004\u0001\b", iIndexOf, (byte) iGreen).intern();
        int i3 = f29051 + 17;
        f29048 = i3 % 128;
        int i4 = i3 % 2;
        return strIntern;
    }

    /* JADX INFO: renamed from: ﾒ */
    private static String m30239(String str, int i, byte b) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (C11970g.f28961) {
            char[] cArr2 = f29049;
            char c = f29050;
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
