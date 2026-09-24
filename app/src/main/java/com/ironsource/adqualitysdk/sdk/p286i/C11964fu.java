package com.ironsource.adqualitysdk.sdk.p286i;

import android.media.AudioTrack;
import android.view.View;
import com.google.android.exoplayer2.C9415C;
import com.ironsource.adqualitysdk.sdk.IronSourceAdQuality;
import com.vungle.ads.internal.protos.Sdk;
import java.io.UnsupportedEncodingException;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.fu */
/* JADX INFO: loaded from: classes6.dex */
public final class C11964fu extends AbstractC11980gj {

    /* JADX INFO: renamed from: ﺙ */
    private static int f28929 = 1;

    /* JADX INFO: renamed from: ﻐ */
    private static int f28930 = 266;

    /* JADX INFO: renamed from: ﻛ */
    private static char[] f28931 = {365, 377, 375, 312, 371, 380, 376, 381, 383, 367, 363, 366, 379, 374, 382, 387, 373, 339, 349, 331, 347, 370, 384};

    /* JADX INFO: renamed from: ｋ */
    private static boolean f28932 = true;

    /* JADX INFO: renamed from: ﾇ */
    private static int f28933 = 0;

    /* JADX INFO: renamed from: ﾒ */
    private static boolean f28934 = true;

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11980gj
    /* JADX INFO: renamed from: ﾇ */
    public final String mo30211() {
        int i = 2 % 2;
        int i2 = f28929 + 87;
        f28933 = i2 % 128;
        int i3 = i2 % 2;
        String strIntern = m30208(null, 127 - View.resolveSizeAndState(0, 0, 0), null, "\u0090\u008f\u0085\u008e\u008b\u0089\u0095\u008c\u0094\u008a\u0081\u0086\u0089\u0082\u0093\u0087\u0082\u0086\u0092\u0084\u0091\u008c\u0088\u0084\u0091\u008c\u0088\u0090\u008f\u0085\u008e\u008b\u0089\u008d\u008c\u008b\u0084\u008a\u0081\u0086\u0089\u0082\u0088\u0087\u0082\u0086\u0085\u0084\u0083\u0082\u0081").intern();
        int i4 = f28929 + 49;
        f28933 = i4 % 128;
        int i5 = i4 % 2;
        return strIntern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11980gj
    /* JADX INFO: renamed from: ﾒ */
    public final Class mo30212() {
        int i = 2 % 2;
        int i2 = f28929 + 37;
        f28933 = i2 % 128;
        if (i2 % 2 == 0) {
            return IronSourceAdQuality.class;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11980gj
    /* JADX INFO: renamed from: ｋ */
    public final AbstractC11840be mo30210() {
        int i = 2 % 2;
        C11841bf c11841bf = new C11841bf(mo30209());
        int i2 = f28933 + 35;
        f28929 = i2 % 128;
        int i3 = i2 % 2;
        return c11841bf;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11980gj
    /* JADX INFO: renamed from: ﻛ */
    public final String mo30209() {
        int i = 2 % 2;
        int i2 = f28929 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
        f28933 = i2 % 128;
        int i3 = i2 % 2;
        String strIntern = m30208(null, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 127, null, "\u0097\u008f\u0081\u0097\u008c\u008b\u008c\u008a\u0086\u008b\u0096\u0088\u008d\u008c\u008b").intern();
        int i4 = f28933 + 57;
        f28929 = i4 % 128;
        int i5 = i4 % 2;
        return strIntern;
    }

    /* JADX INFO: renamed from: ﻛ */
    private static String m30208(String str, int i, int[] iArr, String str2) throws UnsupportedEncodingException {
        Object bytes = str2;
        if (str2 != null) {
            bytes = str2.getBytes(C9415C.ISO88591_NAME);
        }
        byte[] bArr = (byte[]) bytes;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (C12088o.f29838) {
            char[] cArr2 = f28931;
            int i2 = f28930;
            if (f28932) {
                int length = bArr.length;
                C12088o.f29839 = length;
                char[] cArr3 = new char[length];
                C12088o.f29840 = 0;
                while (C12088o.f29840 < C12088o.f29839) {
                    cArr3[C12088o.f29840] = (char) (cArr2[bArr[(C12088o.f29839 - 1) - C12088o.f29840] + i] - i2);
                    C12088o.f29840++;
                }
                return new String(cArr3);
            }
            if (f28934) {
                int length2 = cArr.length;
                C12088o.f29839 = length2;
                char[] cArr4 = new char[length2];
                C12088o.f29840 = 0;
                while (C12088o.f29840 < C12088o.f29839) {
                    cArr4[C12088o.f29840] = (char) (cArr2[cArr[(C12088o.f29839 - 1) - C12088o.f29840] - i] - i2);
                    C12088o.f29840++;
                }
                return new String(cArr4);
            }
            int length3 = iArr.length;
            C12088o.f29839 = length3;
            char[] cArr5 = new char[length3];
            C12088o.f29840 = 0;
            while (C12088o.f29840 < C12088o.f29839) {
                cArr5[C12088o.f29840] = (char) (cArr2[iArr[(C12088o.f29839 - 1) - C12088o.f29840] - i] - i2);
                C12088o.f29840++;
            }
            return new String(cArr5);
        }
    }
}
