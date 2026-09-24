package com.ironsource.adqualitysdk.sdk.p286i;

import android.util.Log;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import com.ironsource.adqualitysdk.sdk.ISAdQualityLogLevel;
import com.vungle.ads.internal.protos.Sdk;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.l */
/* JADX INFO: loaded from: classes6.dex */
public final class C12085l {

    /* JADX INFO: renamed from: ﻛ */
    private static int f29829 = 1;

    /* JADX INFO: renamed from: ｋ */
    private static int f29830 = 0;

    /* JADX INFO: renamed from: ﾇ */
    private static long f29831 = -1332387251218876432L;

    /* JADX INFO: renamed from: ﻛ */
    private static ISAdQualityLogLevel m30916() {
        int i = 2 % 2;
        int i2 = f29829 + 31;
        f29830 = i2 % 128;
        int i3 = i2 % 2;
        C12092s c12092sM30994 = C12092s.m30994();
        if (i3 == 0) {
            return c12092sM30994.m31003();
        }
        c12092sM30994.m31003();
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ */
    private static boolean m30928() {
        int i = 2 % 2;
        int i2 = f29830 + 89;
        f29829 = i2 % 128;
        if (i2 % 2 == 0) {
            C12092s.m30994().m31001();
            Object obj = null;
            super.hashCode();
            throw null;
        }
        boolean zM31001 = C12092s.m30994().m31001();
        int i3 = f29829 + 41;
        f29830 = i3 % 128;
        int i4 = i3 % 2;
        return zM31001;
    }

    /* JADX INFO: renamed from: ﻐ */
    public static void m30912(String str, String str2) {
        int i = 2 % 2;
        int i2 = f29830 + 115;
        f29829 = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        m30914(str, str2, (Throwable) null);
        int i4 = f29829 + 7;
        f29830 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ */
    public static void m30914(String str, String str2, Throwable th) {
        int i = 2 % 2;
        int i2 = f29830 + 79;
        f29829 = i2 % 128;
        int i3 = i2 % 2;
        m30925(str, str, str2, th, true);
        int i4 = f29830 + 81;
        f29829 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: renamed from: ﾒ */
    public static void m30929(String str, String str2) {
        int i = 2 % 2;
        int i2 = f29830 + 57;
        f29829 = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        m30922(str, str2, null);
        int i4 = f29830 + 93;
        f29829 = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ｋ */
    public static void m30922(String str, String str2, Throwable th) {
        int i = 2 % 2;
        int i2 = f29829 + 9;
        f29830 = i2 % 128;
        int i3 = i2 % 2;
        m30925(str, str, str2, th, false);
        int i4 = f29830 + 85;
        f29829 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: renamed from: ﻐ */
    public static void m30915(String str, String str2, boolean z) {
        int i = 2 % 2;
        int i2 = f29829 + 105;
        f29830 = i2 % 128;
        int i3 = i2 % 2;
        m30921(str, str, str2, z);
        if (i3 != 0) {
            int i4 = 33 / 0;
        }
        int i5 = f29830 + 23;
        f29829 = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX INFO: renamed from: ｋ */
    public static void m30921(String str, String str2, String str3, boolean z) {
        int i = 2 % 2;
        int i2 = f29829 + 39;
        f29830 = i2 % 128;
        int i3 = i2 % 2;
        m30925(str, str2, str3, null, z);
        int i4 = f29830 + 109;
        f29829 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: renamed from: ﾇ */
    public static void m30927(String str, String str2, Throwable th, boolean z) {
        int i = 2 % 2;
        int i2 = f29830 + 69;
        f29829 = i2 % 128;
        int i3 = i2 % 2;
        m30925(str, str, str2, th, z);
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ */
    private static void m30925(String str, String str2, String str3, Throwable th, boolean z) {
        int i = 2 % 2;
        int i2 = f29830 + 67;
        f29829 = i2 % 128;
        if (i2 % 2 != 0) {
            if (m30928()) {
                Log.e(m30919(str), str3, th);
                return;
            }
            if (z && m30916().shouldPrintLog(ISAdQualityLogLevel.ERROR)) {
                Log.e(m30919(str2), str3, th);
                int i3 = f29829 + 15;
                f29830 = i3 % 128;
                int i4 = i3 % 2;
                return;
            }
            return;
        }
        m30928();
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ */
    public static void m30923(String str, String str2) {
        int i = 2 % 2;
        int i2 = f29829 + 99;
        f29830 = i2 % 128;
        int i3 = i2 % 2;
        m30926(str, str, str2, true);
        int i4 = f29830 + 103;
        f29829 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: renamed from: ｋ */
    public static void m30920(String str, String str2) {
        int i = 2 % 2;
        int i2 = f29830 + 23;
        f29829 = i2 % 128;
        int i3 = i2 % 2;
        m30926(str, str, str2, false);
        int i4 = f29829 + 99;
        f29830 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ */
    private static void m30926(String str, String str2, String str3, boolean z) {
        int i = 2 % 2;
        if (!m30928()) {
            if (z && m30916().shouldPrintLog(ISAdQualityLogLevel.INFO)) {
                int i2 = f29830 + 77;
                f29829 = i2 % 128;
                if (i2 % 2 != 0) {
                    Log.i(m30919(str2), str3);
                    return;
                } else {
                    Log.i(m30919(str2), str3);
                    throw null;
                }
            }
            return;
        }
        int i3 = f29830 + 23;
        f29829 = i3 % 128;
        if (i3 % 2 != 0) {
            Log.i(m30919(str), str3);
        } else {
            Log.i(m30919(str), str3);
            int i4 = 38 / 0;
        }
    }

    /* JADX INFO: renamed from: ﻛ */
    public static void m30917(String str, String str2) {
        int i = 2 % 2;
        int i2 = f29829 + 57;
        f29830 = i2 % 128;
        int i3 = i2 % 2;
        m30930(str, str, str2, null);
        int i4 = f29830 + 103;
        f29829 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: renamed from: ﻐ */
    public static void m30913(String str, String str2, Object obj) {
        int i = 2 % 2;
        int i2 = f29830 + 31;
        f29829 = i2 % 128;
        int i3 = i2 % 2;
        m30930(str, str, str2, obj);
        if (i3 == 0) {
            int i4 = 6 / 0;
        }
    }

    /* JADX INFO: renamed from: ﾒ */
    private static void m30930(String str, String str2, String str3, Object obj) {
        int i = 2 % 2;
        int i2 = f29829 + 37;
        f29830 = i2 % 128;
        int i3 = i2 % 2;
        m30931(str, str2, str3, obj, true);
        int i4 = f29830 + 37;
        f29829 = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj2 = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﮐ */
    public static void m30909(String str, String str2) {
        int i = 2 % 2;
        int i2 = f29829 + 15;
        f29830 = i2 % 128;
        int i3 = i2 % 2;
        m30918(str, str2, null);
        if (i3 != 0) {
            throw null;
        }
        int i4 = f29829 + 3;
        f29830 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻛ */
    public static void m30918(String str, String str2, Object obj) {
        int i = 2 % 2;
        int i2 = f29830 + 15;
        f29829 = i2 % 128;
        int i3 = i2 % 2;
        m30931(str, str, str2, obj, false);
    }

    /* JADX INFO: renamed from: ﾒ */
    public static void m30931(String str, String str2, String str3, Object obj, boolean z) {
        int i = 2 % 2;
        int i2 = f29830 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
        f29829 = i2 % 128;
        int i3 = i2 % 2;
        if (obj != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(str3);
            sb.append(m30911("႔⚂滊䕰႞", ViewConfiguration.getDoubleTapTimeout() >> 16).intern());
            sb.append(obj.toString());
            str3 = sb.toString();
        }
        if (!m30928()) {
            if (z && m30916().shouldPrintLog(ISAdQualityLogLevel.DEBUG)) {
                int i4 = f29830 + 25;
                f29829 = i4 % 128;
                if (i4 % 2 == 0) {
                    Log.d(m30919(str2), str3);
                    throw null;
                }
                Log.d(m30919(str2), str3);
            }
            int i5 = f29830 + 67;
            f29829 = i5 % 128;
            int i6 = i5 % 2;
            return;
        }
        int i7 = f29829 + 101;
        f29830 = i7 % 128;
        int i8 = i7 % 2;
        Log.d(m30919(str), str3);
    }

    /* JADX INFO: renamed from: ﱟ */
    public static void m30910(String str, String str2) {
        int i = 2 % 2;
        int i2 = f29830 + 51;
        f29829 = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        m30924(str, str, str2);
        if (i3 == 0) {
            super.hashCode();
            throw null;
        }
        int i4 = f29830 + 103;
        f29829 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾇ */
    private static void m30924(String str, String str2, String str3) {
        int i = 2 % 2;
        int i2 = f29829 + 93;
        f29830 = i2 % 128;
        if (i2 % 2 == 0) {
            if (m30928()) {
                Log.v(m30919(str), str3);
                return;
            }
            if (!m30916().shouldPrintLog(ISAdQualityLogLevel.VERBOSE)) {
                return;
            }
            int i3 = f29830 + 47;
            f29829 = i3 % 128;
            int i4 = i3 % 2;
            Log.v(m30919(str2), str3);
            int i5 = f29830 + 111;
            f29829 = i5 % 128;
            int i6 = i5 % 2;
            return;
        }
        m30928();
        throw null;
    }

    /* JADX INFO: renamed from: ｋ */
    private static String m30919(String str) {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder();
        sb.append(m30911("લ㌞븥\uda99ૻ쒜冪㴧픡\ue4c1燰ᵻ땑萋ᅥ綈閖ꑿㅰ巨痞䖇킱배呈斎", (-1) - ((byte) KeyEvent.getModifierMetaStateMask())).intern());
        sb.append(str);
        String string = sb.toString();
        int i2 = f29829 + 59;
        f29830 = i2 % 128;
        int i3 = i2 % 2;
        return string;
    }

    /* JADX INFO: renamed from: ﻐ */
    private static String m30911(String str, int i) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (C11943f.f28848) {
            char[] cArrM30189 = C11943f.m30189(f29831, cArr, i);
            C11943f.f28846 = 4;
            while (C11943f.f28846 < cArrM30189.length) {
                C11943f.f28847 = C11943f.f28846 - 4;
                cArrM30189[C11943f.f28846] = (char) (((long) (cArrM30189[C11943f.f28846] ^ cArrM30189[C11943f.f28846 % 4])) ^ (((long) C11943f.f28847) * f29831));
                C11943f.f28846++;
            }
            str2 = new String(cArrM30189, 4, cArrM30189.length - 4);
        }
        return str2;
    }
}
