package com.ironsource.adqualitysdk.sdk.p286i;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import com.mbridge.msdk.MBridgeSDK;
import com.mintegral.msdk.MIntegralSDK;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.go */
/* JADX INFO: loaded from: classes6.dex */
public final class C11985go {
    public C11985go() {
    }

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.go$a */
    public static class a extends AbstractC11980gj {

        /* JADX INFO: renamed from: ﱟ */
        private static int f29035 = 1;

        /* JADX INFO: renamed from: ﻐ */
        private static char f29036 = 21457;

        /* JADX INFO: renamed from: ﻛ */
        private static int f29037 = 0;

        /* JADX INFO: renamed from: ｋ */
        private static char f29038 = 22398;

        /* JADX INFO: renamed from: ﾇ */
        private static char f29039 = 44075;

        /* JADX INFO: renamed from: ﾒ */
        private static char f29040 = 44201;

        @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11980gj
        /* JADX INFO: renamed from: ﾇ */
        public final String mo30211() {
            int i = 2 % 2;
            int i2 = f29037 + 3;
            f29035 = i2 % 128;
            String strIntern = m30236("촇귔䝵痭䛹赉뗷ء\ue829ᯤꙂ\uead6Ọ\udb8c屓춷㻞囶帙\udb10퐻躁䣛\ue95e猯郤떮盨㾧ꨨ塓⺦", i2 % 2 == 0 ? Color.green(1) + 47 : 31 - Color.green(0)).intern();
            int i3 = f29035 + 111;
            f29037 = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 74 / 0;
            }
            return strIntern;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11980gj
        /* JADX INFO: renamed from: ﾒ */
        public final Class mo30212() {
            int i = 2 % 2;
            int i2 = f29037;
            int i3 = i2 + 77;
            f29035 = i3 % 128;
            if (i3 % 2 == 0) {
                Object obj = null;
                super.hashCode();
                throw null;
            }
            int i4 = i2 + 9;
            f29035 = i4 % 128;
            int i5 = i4 % 2;
            return MIntegralSDK.class;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11980gj
        /* JADX INFO: renamed from: ｋ */
        public final AbstractC11840be mo30210() {
            int i = 2 % 2;
            AbstractC11854bs.c cVar = new AbstractC11854bs.c(mo30209());
            int i2 = f29035 + 77;
            f29037 = i2 % 128;
            if (i2 % 2 == 0) {
                return cVar;
            }
            throw null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11980gj
        /* JADX INFO: renamed from: ﻛ */
        public final String mo30209() {
            int i = 2 % 2;
            int i2 = f29037 + 35;
            f29035 = i2 % 128;
            return m30236("䛹赉뗷ء\ue829ᯤꙂ\uead6\uf1d2偊", i2 % 2 == 0 ? 4 - View.resolveSize(0, 0) : 9 - View.resolveSize(0, 0)).intern();
        }

        /* JADX INFO: renamed from: ﾒ */
        private static String m30236(String str, int i) {
            String str2;
            Object charArray = str;
            if (str != null) {
                charArray = str.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            synchronized (C12078k.f29776) {
                char[] cArr2 = new char[cArr.length];
                C12078k.f29775 = 0;
                char[] cArr3 = new char[2];
                while (C12078k.f29775 < cArr.length) {
                    cArr3[0] = cArr[C12078k.f29775];
                    cArr3[1] = cArr[C12078k.f29775 + 1];
                    int i2 = 58224;
                    for (int i3 = 0; i3 < 16; i3++) {
                        char c = cArr3[1];
                        char c2 = cArr3[0];
                        char c3 = (char) (c - (((c2 + i2) ^ ((c2 << 4) + f29040)) ^ ((c2 >>> 5) + f29038)));
                        cArr3[1] = c3;
                        cArr3[0] = (char) (c2 - (((c3 >>> 5) + f29036) ^ ((c3 + i2) ^ ((c3 << 4) + f29039))));
                        i2 -= 40503;
                    }
                    cArr2[C12078k.f29775] = cArr3[0];
                    cArr2[C12078k.f29775 + 1] = cArr3[1];
                    C12078k.f29775 += 2;
                }
                str2 = new String(cArr2, 0, i);
            }
            return str2;
        }
    }

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.go$b */
    public static class b extends AbstractC11980gj {

        /* JADX INFO: renamed from: ﻐ */
        private static int f29041 = 171;

        /* JADX INFO: renamed from: ﻛ */
        private static int f29042 = 0;

        /* JADX INFO: renamed from: ｋ */
        private static int f29043 = 1;

        @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11980gj
        /* JADX INFO: renamed from: ﾇ */
        public final String mo30211() {
            int i = 2 % 2;
            int i2 = f29043 + 53;
            f29042 = i2 % 128;
            int i3 = i2 % 2;
            String strIntern = m30237("\u0011ￒ\u0011\u0006\u0016\r\b\u000b\tￒ\u0011\u0017\b\u000fￒ\ufff1￦\u0016\r\b\u000b\t\ufff7￨\uffef\u0007\u0013", Color.argb(0, 0, 0, 0) + 27, false, (ViewConfiguration.getPressedStateDuration() >> 16) + 25, 263 - TextUtils.indexOf("", "")).intern();
            int i4 = f29042 + 13;
            f29043 = i4 % 128;
            int i5 = i4 % 2;
            return strIntern;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11980gj
        /* JADX INFO: renamed from: ﾒ */
        public final Class mo30212() {
            int i = 2 % 2;
            int i2 = f29043;
            int i3 = i2 + 113;
            f29042 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 19;
            f29042 = i5 % 128;
            if (i5 % 2 == 0) {
                return MBridgeSDK.class;
            }
            Object obj = null;
            super.hashCode();
            throw null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11980gj
        /* JADX INFO: renamed from: ｋ */
        public final AbstractC11840be mo30210() {
            int i = 2 % 2;
            AbstractC11854bs.e eVar = new AbstractC11854bs.e(mo30209());
            int i2 = f29043 + 87;
            f29042 = i2 % 128;
            if (i2 % 2 == 0) {
                return eVar;
            }
            Object obj = null;
            super.hashCode();
            throw null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11980gj
        /* JADX INFO: renamed from: ﻛ */
        public final String mo30209() {
            int i = 2 % 2;
            int i2 = f29042 + 89;
            f29043 = i2 % 128;
            return (i2 % 2 == 0 ? m30237("￼\u0007\ufff6\u0001\u0002\ufffe\u0003\t\ufffa", 55 << TextUtils.indexOf("", ""), true, 5 >>> View.getDefaultSize(0, 1), 6902 >>> (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))) : m30237("￼\u0007\ufff6\u0001\u0002\ufffe\u0003\t\ufffa", TextUtils.indexOf("", "") + 9, false, 4 - View.getDefaultSize(0, 0), 279 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)))).intern();
        }

        /* JADX INFO: renamed from: ﾒ */
        private static String m30237(String str, int i, boolean z, int i2, int i3) {
            String str2;
            Object charArray = str;
            if (str != null) {
                charArray = str.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            synchronized (C11889d.f28479) {
                char[] cArr2 = new char[i];
                C11889d.f28481 = 0;
                while (C11889d.f28481 < i) {
                    C11889d.f28480 = cArr[C11889d.f28481];
                    cArr2[C11889d.f28481] = (char) (C11889d.f28480 + i3);
                    int i4 = C11889d.f28481;
                    cArr2[i4] = (char) (cArr2[i4] - f29041);
                    C11889d.f28481++;
                }
                if (i2 > 0) {
                    C11889d.f28478 = i2;
                    char[] cArr3 = new char[i];
                    System.arraycopy(cArr2, 0, cArr3, 0, i);
                    System.arraycopy(cArr3, 0, cArr2, i - C11889d.f28478, C11889d.f28478);
                    System.arraycopy(cArr3, C11889d.f28478, cArr2, 0, i - C11889d.f28478);
                }
                if (z) {
                    char[] cArr4 = new char[i];
                    C11889d.f28481 = 0;
                    while (C11889d.f28481 < i) {
                        cArr4[C11889d.f28481] = cArr2[(i - C11889d.f28481) - 1];
                        C11889d.f28481++;
                    }
                    cArr2 = cArr4;
                }
                str2 = new String(cArr2);
            }
            return str2;
        }
    }

    public C11985go(Context context) {
        context.getApplicationContext();
    }
}
