package com.ironsource.adqualitysdk.sdk.p286i;

import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import com.bytedance.sdk.openadsdk.api.init.PAGSdk;
import com.google.android.exoplayer2.C9415C;
import java.io.UnsupportedEncodingException;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.gd */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC11974gd extends AbstractC11980gj {

    /* JADX INFO: renamed from: ﻛ */
    private static int f28979 = 1;

    /* JADX INFO: renamed from: ｋ */
    private static char[] f28980 = {57122, 3457, 31300, 42765, 38340, 49849, 12158, 7211, 19173};

    /* JADX INFO: renamed from: ﾇ */
    private static long f28981 = 7218223706108711608L;

    /* JADX INFO: renamed from: ﾒ */
    private static int f28982;

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.gd$c */
    public static class c extends AbstractC11974gd {

        /* JADX INFO: renamed from: ﱡ */
        private static int f28983 = 1;

        /* JADX INFO: renamed from: ﻐ */
        private static int f28984 = 0;

        /* JADX INFO: renamed from: ﻛ */
        private static int f28985 = 298;

        /* JADX INFO: renamed from: ｋ */
        private static char[] f28986 = {397, 409, 407, 344, 396, 419, 414, 399, 398, 395, 408, 413, 405, 410, 382, 363, 381};

        /* JADX INFO: renamed from: ﾇ */
        private static boolean f28987 = true;

        /* JADX INFO: renamed from: ﾒ */
        private static boolean f28988 = true;

        @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11980gj
        /* JADX INFO: renamed from: ﾇ */
        public final String mo30211() {
            int i = 2 % 2;
            int i2 = f28983 + 107;
            f28984 = i2 % 128;
            int i3 = i2 % 2;
            String strIntern = m30223(null, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 126, null, "\u008d\u0089\u0091\u0089\u0090\u008f\u008f\u0084\u008d\u0089\u008c\u0089\u008a\u008b\u0088\u008e\u0082\u0084\u008d\u0089\u008c\u0084\u0088\u0081\u008b\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern();
            int i4 = f28983 + 79;
            f28984 = i4 % 128;
            int i5 = i4 % 2;
            return strIntern;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11980gj
        /* JADX INFO: renamed from: ﾒ */
        public final Class mo30212() {
            int i = 2 % 2;
            int i2 = f28984 + 55;
            f28983 = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 12 / 0;
            }
            return TTAdSdk.class;
        }

        /* JADX INFO: renamed from: ﾒ */
        private static String m30223(String str, int i, int[] iArr, String str2) throws UnsupportedEncodingException {
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
                char[] cArr2 = f28986;
                int i2 = f28985;
                if (f28988) {
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
                if (f28987) {
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

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.gd$d */
    public static class d extends AbstractC11974gd {

        /* JADX INFO: renamed from: ﻐ */
        private static int[] f28989 = {-201676291, 1293053107, -232113698, -1302681922, 354444990, -527203436, -642211459, -1586969300, -838494944, 401196765, 483432108, 382136953, 1874254422, -1023938973, -791247473, -482039417, 697875757, 1587359194};

        /* JADX INFO: renamed from: ﻛ */
        private static int f28990 = 0;

        /* JADX INFO: renamed from: ｋ */
        private static int f28991 = 1;

        @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11980gj
        /* JADX INFO: renamed from: ﾇ */
        public final String mo30211() {
            int i = 2 % 2;
            int i2 = f28990 + 93;
            f28991 = i2 % 128;
            int i3 = i2 % 2;
            String strIntern = m30224(new int[]{1092842173, -255052237, -481812513, -1358786170, 1899099673, 1870450294, -946981290, 1372712656, 489118737, 956432400, -1634654098, -1350845717, 1864126352, -2081384907, -703640949, -1096274205, -1721380638, -1820302718, 1626726405, 723850386, 359869534, -1903229775}, 42 - ExpandableListView.getPackedPositionChild(0L)).intern();
            int i4 = f28991 + 85;
            f28990 = i4 % 128;
            int i5 = i4 % 2;
            return strIntern;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11980gj
        /* JADX INFO: renamed from: ﾒ */
        public final Class mo30212() {
            int i = 2 % 2;
            int i2 = f28991 + 83;
            int i3 = i2 % 128;
            f28990 = i3;
            if (i2 % 2 != 0) {
                Object obj = null;
                super.hashCode();
                throw null;
            }
            int i4 = i3 + 59;
            f28991 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 54 / 0;
            }
            return PAGSdk.class;
        }

        /* JADX INFO: renamed from: ﾒ */
        private static String m30224(int[] iArr, int i) {
            String str;
            synchronized (C11835b.f27464) {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f28989.clone();
                C11835b.f27462 = 0;
                while (C11835b.f27462 < iArr.length) {
                    cArr[0] = (char) (iArr[C11835b.f27462] >> 16);
                    cArr[1] = (char) iArr[C11835b.f27462];
                    cArr[2] = (char) (iArr[C11835b.f27462 + 1] >> 16);
                    cArr[3] = (char) iArr[C11835b.f27462 + 1];
                    C11835b.f27463 = (cArr[0] << 16) + cArr[1];
                    C11835b.f27461 = (cArr[2] << 16) + cArr[3];
                    C11835b.m28718(iArr2);
                    for (int i2 = 0; i2 < 16; i2++) {
                        int i3 = C11835b.f27463 ^ iArr2[i2];
                        C11835b.f27463 = i3;
                        C11835b.f27461 = C11835b.m28717(i3) ^ C11835b.f27461;
                        int i4 = C11835b.f27463;
                        C11835b.f27463 = C11835b.f27461;
                        C11835b.f27461 = i4;
                    }
                    int i5 = C11835b.f27463;
                    C11835b.f27463 = C11835b.f27461;
                    C11835b.f27461 = i5;
                    C11835b.f27461 = i5 ^ iArr2[16];
                    C11835b.f27463 ^= iArr2[17];
                    int i6 = C11835b.f27463;
                    int i7 = C11835b.f27461;
                    cArr[0] = (char) (C11835b.f27463 >>> 16);
                    cArr[1] = (char) C11835b.f27463;
                    cArr[2] = (char) (C11835b.f27461 >>> 16);
                    cArr[3] = (char) C11835b.f27461;
                    C11835b.m28718(iArr2);
                    cArr2[C11835b.f27462 << 1] = cArr[0];
                    cArr2[(C11835b.f27462 << 1) + 1] = cArr[1];
                    cArr2[(C11835b.f27462 << 1) + 2] = cArr[2];
                    cArr2[(C11835b.f27462 << 1) + 3] = cArr[3];
                    C11835b.f27462 += 2;
                }
                str = new String(cArr2, 0, i);
            }
            return str;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11980gj
    /* JADX INFO: renamed from: ｋ */
    public final AbstractC11840be mo30210() {
        int i = 2 % 2;
        C11844bi c11844bi = new C11844bi(mo30209());
        int i2 = f28982 + 37;
        f28979 = i2 % 128;
        int i3 = i2 % 2;
        return c11844bi;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11980gj
    /* JADX INFO: renamed from: ﻛ */
    public final String mo30209() {
        int i = 2 % 2;
        int i2 = f28979 + 37;
        f28982 = i2 % 128;
        int i3 = i2 % 2;
        long zoomControlsTimeout = ViewConfiguration.getZoomControlsTimeout();
        String strIntern = (i3 != 0 ? m30222(1 << (zoomControlsTimeout > 0L ? 1 : (zoomControlsTimeout == 0L ? 0 : -1)), (char) (57153 - ((byte) KeyEvent.getModifierMetaStateMask())), 30 % (ViewConfiguration.getKeyRepeatDelay() - 84)) : m30222(1 - (zoomControlsTimeout > 0L ? 1 : (zoomControlsTimeout == 0L ? 0 : -1)), (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 57153), 9 - (ViewConfiguration.getKeyRepeatDelay() >> 16))).intern();
        int i4 = f28979 + 113;
        f28982 = i4 % 128;
        int i5 = i4 % 2;
        return strIntern;
    }

    /* JADX INFO: renamed from: ﻐ */
    private static String m30222(int i, char c2, int i2) {
        String str;
        synchronized (C11862c.f28047) {
            char[] cArr = new char[i2];
            C11862c.f28048 = 0;
            while (C11862c.f28048 < i2) {
                cArr[C11862c.f28048] = (char) ((((long) f28980[C11862c.f28048 + i]) ^ (((long) C11862c.f28048) * f28981)) ^ ((long) c2));
                C11862c.f28048++;
            }
            str = new String(cArr);
        }
        return str;
    }
}
