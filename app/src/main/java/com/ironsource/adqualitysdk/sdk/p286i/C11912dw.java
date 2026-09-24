package com.ironsource.adqualitysdk.sdk.p286i;

import android.view.ViewConfiguration;
import com.google.android.exoplayer2.C9415C;
import com.vungle.ads.internal.protos.Sdk;
import java.io.UnsupportedEncodingException;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.dw */
/* JADX INFO: loaded from: classes6.dex */
public final class C11912dw {

    /* JADX INFO: renamed from: ﮐ */
    private static int f28716 = 1;

    /* JADX INFO: renamed from: ﱟ */
    private static boolean f28717 = true;

    /* JADX INFO: renamed from: ﱡ */
    private static boolean f28718 = true;

    /* JADX INFO: renamed from: ﺙ */
    private static int f28719 = 0;

    /* JADX INFO: renamed from: ﻛ */
    private static char[] f28720 = {187};

    /* JADX INFO: renamed from: ﾇ */
    private static int f28721 = 129;

    /* JADX INFO: renamed from: ﻐ */
    private c f28722;

    /* JADX INFO: renamed from: ｋ */
    private String f28723;

    /* JADX INFO: renamed from: ﾒ */
    private int f28724;

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.dw$c */
    public enum c {
        f28733,
        f28736,
        f28732,
        f28735,
        f28734,
        f28727,
        f28730,
        f28728;


        /* JADX INFO: renamed from: ﭸ */
        private static int f28725 = 1;

        /* JADX INFO: renamed from: ﮉ */
        private static int f28726;

        /* JADX INFO: renamed from: ﻏ */
        private static long f28731;

        /* JADX INFO: renamed from: ﻛ */
        static void m30139() {
            f28731 = 520734095921113377L;
        }

        public static c valueOf(String str) {
            int i = 2 % 2;
            int i2 = f28726 + 73;
            f28725 = i2 % 128;
            int i3 = i2 % 2;
            c cVar = (c) Enum.valueOf(c.class, str);
            int i4 = f28725 + 49;
            f28726 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 97 / 0;
            }
            return cVar;
        }

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static c[] valuesCustom() {
            int i = 2 % 2;
            int i2 = f28725 + 45;
            f28726 = i2 % 128;
            int i3 = i2 % 2;
            c[] cVarArrValuesCustom = values();
            if (i3 == 0) {
                return (c[]) cVarArrValuesCustom.clone();
            }
            throw null;
        }

        static {
            m30139();
            int i = f28725 + 59;
            f28726 = i % 128;
            if (i % 2 != 0) {
                int i2 = 3 / 0;
            }
        }

        /* JADX INFO: renamed from: ｋ */
        private static String m30140(String str, int i) {
            String str2;
            Object charArray = str;
            if (str != null) {
                charArray = str.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            synchronized (C11997h.f29102) {
                C11997h.f29101 = i;
                char[] cArr2 = new char[cArr.length];
                C11997h.f29103 = 0;
                while (C11997h.f29103 < cArr.length) {
                    cArr2[C11997h.f29103] = (char) (((long) (cArr[C11997h.f29103] ^ (C11997h.f29103 * C11997h.f29101))) ^ f28731);
                    C11997h.f29103++;
                }
                str2 = new String(cArr2);
            }
            return str2;
        }
    }

    public C11912dw(c cVar, String str, int i) {
        this.f28722 = cVar;
        this.f28723 = str;
        this.f28724 = i;
    }

    /* JADX INFO: renamed from: ﻐ */
    public final c m30133() {
        int i = 2 % 2;
        int i2 = f28716 + 81;
        f28719 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.f28722;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ */
    public final String m30134() {
        int i = 2 % 2;
        int i2 = f28716 + 27;
        int i3 = i2 % 128;
        f28719 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.f28723;
        int i4 = i3 + 39;
        f28716 = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ */
    public final int m30135() {
        int i;
        int i2 = 2 % 2;
        int i3 = f28716 + 95;
        int i4 = i3 % 128;
        f28719 = i4;
        if (i3 % 2 != 0) {
            i = this.f28724;
            int i5 = 56 / 0;
        } else {
            i = this.f28724;
        }
        int i6 = i4 + 5;
        f28716 = i6 % 128;
        if (i6 % 2 != 0) {
            return i;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ */
    public final boolean m30137(String str) {
        int i = 2 % 2;
        int i2 = f28719 + 59;
        f28716 = i2 % 128;
        int i3 = i2 % 2;
        boolean zEquals = this.f28723.equals(str);
        int i4 = f28719 + 39;
        f28716 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 89 / 0;
        }
        return zEquals;
    }

    /* JADX INFO: renamed from: ﾒ */
    public final boolean m30138() {
        int i = 2 % 2;
        int i2 = f28719 + 61;
        f28716 = i2 % 128;
        int i3 = i2 % 2;
        if (m30136() || m30129() || m30132() || m30128()) {
            int i4 = f28719 + 97;
            f28716 = i4 % 128;
            int i5 = i4 % 2;
            return true;
        }
        int i6 = f28719 + 85;
        f28716 = i6 % 128;
        if (i6 % 2 != 0) {
            return false;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ */
    public final boolean m30136() {
        int i = 2 % 2;
        int i2 = f28716 + 25;
        f28719 = i2 % 128;
        if (i2 % 2 != 0) {
            m30133();
            c cVar = c.f28735;
            Object obj = null;
            super.hashCode();
            throw null;
        }
        if (m30133() != c.f28735) {
            return false;
        }
        int i3 = f28716 + 17;
        f28719 = i3 % 128;
        int i4 = i3 % 2;
        return true;
    }

    /* JADX INFO: renamed from: ﱟ */
    public final boolean m30129() {
        int i = 2 % 2;
        int i2 = f28716 + 89;
        f28719 = i2 % 128;
        int i3 = i2 % 2;
        if (m30133() == c.f28734) {
            return true;
        }
        int i4 = f28719 + 27;
        f28716 = i4 % 128;
        if (i4 % 2 != 0) {
            return false;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﻏ */
    public final boolean m30132() {
        int i = 2 % 2;
        int i2 = f28716 + 13;
        f28719 = i2 % 128;
        if (i2 % 2 != 0) {
            m30133();
            c cVar = c.f28727;
            Object obj = null;
            super.hashCode();
            throw null;
        }
        if (m30133() != c.f28727) {
            return false;
        }
        int i3 = f28719 + 41;
        f28716 = i3 % 128;
        int i4 = i3 % 2;
        return true;
    }

    /* JADX INFO: renamed from: ﮐ */
    public final boolean m30128() {
        int i = 2 % 2;
        int i2 = f28716 + 71;
        f28719 = i2 % 128;
        int i3 = i2 % 2;
        if (m30133() == c.f28730) {
            int i4 = f28716 + 105;
            f28719 = i4 % 128;
            int i5 = i4 % 2;
            return true;
        }
        int i6 = f28716 + 101;
        f28719 = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 79 / 0;
        }
        return false;
    }

    /* JADX INFO: renamed from: ﺙ */
    public final boolean m30131() {
        int i = 2 % 2;
        if (m30133() == c.f28732) {
            int i2 = f28719 + 1;
            f28716 = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        int i4 = f28716 + 59;
        f28719 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 97 / 0;
        }
        return false;
    }

    /* JADX INFO: renamed from: ﱡ */
    public final boolean m30130() {
        int i = 2 % 2;
        if (m30133() == c.f28728) {
            int i2 = f28716 + 5;
            f28719 = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        int i4 = f28716 + 113;
        f28719 = i4 % 128;
        if (i4 % 2 == 0) {
            return false;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﮉ */
    public final boolean m30127() {
        int i = 2 % 2;
        int i2 = f28716 + 105;
        f28719 = i2 % 128;
        int i3 = i2 % 2;
        if (m30133() != c.f28736) {
            return false;
        }
        int i4 = f28716 + 29;
        int i5 = i4 % 128;
        f28719 = i5;
        int i6 = i4 % 2;
        int i7 = i5 + 49;
        f28716 = i7 % 128;
        int i8 = i7 % 2;
        return true;
    }

    /* JADX INFO: renamed from: ﭖ */
    public final boolean m30126() {
        int i = 2 % 2;
        int i2 = f28716 + 101;
        f28719 = i2 % 128;
        int i3 = i2 % 2;
        if (m30133() == c.f28733) {
            int i4 = f28716 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
            f28719 = i4 % 128;
            int i5 = i4 % 2;
            return true;
        }
        int i6 = f28716 + 27;
        f28719 = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f28722);
        sb.append(m30125(null, (ViewConfiguration.getLongPressTimeout() >> 16) + 127, null, "\u0081").intern());
        sb.append(this.f28723);
        String string = sb.toString();
        int i2 = f28716 + 37;
        f28719 = i2 % 128;
        if (i2 % 2 == 0) {
            return string;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ */
    private static String m30125(String str, int i, int[] iArr, String str2) throws UnsupportedEncodingException {
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
            char[] cArr2 = f28720;
            int i2 = f28721;
            if (f28717) {
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
            if (f28718) {
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
