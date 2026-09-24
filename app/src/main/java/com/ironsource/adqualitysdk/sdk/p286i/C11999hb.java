package com.ironsource.adqualitysdk.sdk.p286i;

import android.os.Process;
import android.text.TextUtils;
import com.google.android.exoplayer2.C9415C;
import com.vungle.ads.internal.protos.Sdk;
import com.yandex.mobile.ads.common.MobileAds;
import java.io.UnsupportedEncodingException;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.hb */
/* JADX INFO: loaded from: classes6.dex */
public final class C11999hb extends AbstractC11980gj {

    /* JADX INFO: renamed from: ﱟ */
    private static int f29111 = 1;

    /* JADX INFO: renamed from: ﻐ */
    private static int f29112 = 0;

    /* JADX INFO: renamed from: ﻛ */
    private static int f29113 = 23;

    /* JADX INFO: renamed from: ｋ */
    private static boolean f29114 = true;

    /* JADX INFO: renamed from: ﾇ */
    private static char[] f29115 = {'z', 134, 132, 'E', 144, 'x', 133, AbstractJsonLexerKt.BEGIN_OBJ, '|', 143, 'y', 128, 131, 138, 'd', 'X'};

    /* JADX INFO: renamed from: ﾒ */
    private static boolean f29116 = true;

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11980gj
    /* JADX INFO: renamed from: ﾇ */
    public final String mo30211() {
        int i = 2 % 2;
        int i2 = f29112 + 17;
        f29111 = i2 % 128;
        String strIntern = m30254(null, i2 % 2 == 0 ? 23 >> TextUtils.lastIndexOf("", 'Y', 0, 1) : 126 - TextUtils.lastIndexOf("", '0', 0, 0), null, "\u008e\u0088\u0090\u0089\u008d\u008c\u008b\u0082\u008f\u0084\u0087\u0082\u0083\u0083\u0082\u0081\u0084\u008e\u0088\u0086\u0084\u0089\u008d\u008c\u008b\u0082\u0083\u0084\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern();
        int i3 = f29111 + 29;
        f29112 = i3 % 128;
        if (i3 % 2 == 0) {
            return strIntern;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11980gj
    /* JADX INFO: renamed from: ﾒ */
    public final Class mo30212() {
        int i = 2 % 2;
        int i2 = f29112 + 15;
        f29111 = i2 % 128;
        if (i2 % 2 != 0) {
            return MobileAds.class;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11980gj
    /* JADX INFO: renamed from: ｋ */
    public final AbstractC11840be mo30210() {
        int i = 2 % 2;
        C11873ck c11873ck = new C11873ck(mo30209());
        int i2 = f29112 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
        f29111 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 66 / 0;
        }
        return c11873ck;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11980gj
    /* JADX INFO: renamed from: ﻛ */
    public final String mo30209() {
        int i = 2 % 2;
        int i2 = f29111 + 3;
        f29112 = i2 % 128;
        int i3 = i2 % 2;
        String strIntern = m30254(null, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 126, null, "\u008a\u0089\u0088\u0087\u0086\u0085").intern();
        int i4 = f29111 + 17;
        f29112 = i4 % 128;
        if (i4 % 2 == 0) {
            return strIntern;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ */
    private static String m30254(String str, int i, int[] iArr, String str2) throws UnsupportedEncodingException {
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
            char[] cArr2 = f29115;
            int i2 = f29113;
            if (f29114) {
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
            if (f29116) {
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
