package com.ironsource.adqualitysdk.sdk.p286i;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.os.SystemClock;
import android.view.ViewConfiguration;
import com.ironsource.adqualitysdk.sdk.ISAdQualityAdType;
import com.ironsource.adqualitysdk.sdk.IronSourceAdQuality;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.cr */
/* JADX INFO: loaded from: classes6.dex */
public final class C11880cr extends C11886cx {

    /* JADX INFO: renamed from: ﻐ */
    private static int f28343 = 1;

    /* JADX INFO: renamed from: ﻛ */
    private static int f28344 = 146;

    /* JADX INFO: renamed from: ｋ */
    private static int f28345;

    /* JADX INFO: renamed from: ﻐ */
    public static Object m29771(C11877co c11877co, List<Object> list) {
        int i = 2 % 2;
        int i2 = f28345 + 87;
        f28343 = i2 % 128;
        c11877co.m29674((String) (i2 % 2 == 0 ? m29851(list, 1, String.class) : m29851(list, 0, String.class)), (JSONObject) m29851(list, 1, JSONObject.class));
        return null;
    }

    /* JADX INFO: renamed from: ﾒ */
    public final Object m29786(final C11877co c11877co, List<Object> list, final C11907dr c11907dr) {
        final C11906dq c11906dq;
        int i = 2 % 2;
        int i2 = f28343 + 85;
        f28345 = i2 % 128;
        if (i2 % 2 == 0 ? (c11906dq = (C11906dq) m29851(list, 0, C11906dq.class)) != null : (c11906dq = (C11906dq) m29851(list, 1, C11906dq.class)) != null) {
            c11877co.m29673(new InterfaceC12040ip() { // from class: com.ironsource.adqualitysdk.sdk.i.cr.3
                @Override // com.ironsource.adqualitysdk.sdk.p286i.InterfaceC12040ip
                /* JADX INFO: renamed from: ﻛ */
                public final JSONObject mo28677(String str, JSONObject jSONObject) {
                    return (JSONObject) c11906dq.m30048(c11907dr, c11877co, Arrays.asList(str, jSONObject)).m30066();
                }
            });
        }
        int i3 = f28345 + 75;
        f28343 = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            return null;
        }
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ */
    public static Object m29783(C11877co c11877co) {
        int i = 2 % 2;
        int i2 = f28345 + 27;
        f28343 = i2 % 128;
        int i3 = i2 % 2;
        C11878cp c11878cpM29676 = c11877co.m29676();
        if (i3 == 0) {
            int i4 = 53 / 0;
        }
        return c11878cpM29676;
    }

    /* JADX INFO: renamed from: ﾇ */
    public static Object m29780(C11877co c11877co) {
        int i = 2 % 2;
        int i2 = f28345 + 93;
        f28343 = i2 % 128;
        if (i2 % 2 == 0) {
            c11877co.m29671();
            Object obj = null;
            super.hashCode();
            throw null;
        }
        Context contextM29671 = c11877co.m29671();
        int i3 = f28345 + 69;
        f28343 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 2 / 0;
        }
        return contextM29671;
    }

    /* JADX INFO: renamed from: ﾒ */
    public static long m29782() {
        int i = 2 % 2;
        int i2 = f28343 + 3;
        f28345 = i2 % 128;
        if (i2 % 2 != 0) {
            C12072ju.m30752();
            throw null;
        }
        long jM30752 = C12072ju.m30752();
        int i3 = f28345 + 83;
        f28343 = i3 % 128;
        int i4 = i3 % 2;
        return jM30752;
    }

    /* JADX INFO: renamed from: ｋ */
    public static JSONObject m29778() {
        int i = 2 % 2;
        int i2 = f28343 + 61;
        f28345 = i2 % 128;
        if (i2 % 2 != 0) {
            C12034ij c12034ijM29755 = m29755();
            int i3 = 4 / 0;
            return C12077jz.m30811(c12034ijM29755.m30516(), c12034ijM29755.m30513(), c12034ijM29755.m30514(), c12034ijM29755.m30515());
        }
        C12034ij c12034ijM29756 = m29755();
        return C12077jz.m30811(c12034ijM29756.m30516(), c12034ijM29756.m30513(), c12034ijM29756.m30514(), c12034ijM29756.m30515());
    }

    /* JADX INFO: renamed from: ﾇ */
    public static long m29779() {
        int i = 2 % 2;
        int i2 = f28345 + 55;
        f28343 = i2 % 128;
        if (i2 % 2 != 0) {
            long jM30514 = m29755().m30514();
            int i3 = f28343 + 31;
            f28345 = i3 % 128;
            int i4 = i3 % 2;
            return jM30514;
        }
        m29755().m30514();
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ */
    public static Activity m29773() {
        Activity activityMo30664;
        int i = 2 % 2;
        int i2 = f28343 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
        f28345 = i2 % 128;
        if (i2 % 2 != 0) {
            activityMo30664 = AbstractC12058jg.m30663().mo30664();
            int i3 = 30 / 0;
        } else {
            activityMo30664 = AbstractC12058jg.m30663().mo30664();
        }
        int i4 = f28343 + 19;
        f28345 = i4 % 128;
        int i5 = i4 % 2;
        return activityMo30664;
    }

    /* JADX INFO: renamed from: ﻐ */
    public static C11896dg m29770() {
        int i = 2 % 2;
        C11896dg c11896dg = new C11896dg();
        int i2 = f28345 + 73;
        f28343 = i2 % 128;
        int i3 = i2 % 2;
        return c11896dg;
    }

    /* JADX INFO: renamed from: ﮐ */
    public static C11899dj m29762() {
        int i = 2 % 2;
        C11899dj c11899dj = new C11899dj();
        int i2 = f28343 + 59;
        f28345 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 92 / 0;
        }
        return c11899dj;
    }

    /* JADX INFO: renamed from: ﻏ */
    public static C11900dk m29768() {
        int i = 2 % 2;
        C11900dk c11900dk = new C11900dk();
        int i2 = f28345 + 21;
        f28343 = i2 % 128;
        if (i2 % 2 != 0) {
            return c11900dk;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﺙ */
    public static C11898di m29766() {
        int i = 2 % 2;
        C11898di c11898di = new C11898di();
        int i2 = f28343 + 51;
        f28345 = i2 % 128;
        int i3 = i2 % 2;
        return c11898di;
    }

    /* JADX INFO: renamed from: ｋ */
    public static String m29776(C11877co c11877co) {
        int i = 2 % 2;
        int i2 = f28343 + 67;
        f28345 = i2 % 128;
        int i3 = i2 % 2;
        String strM29737 = c11877co.m29676().m29737();
        int i4 = f28343 + 11;
        f28345 = i4 % 128;
        if (i4 % 2 == 0) {
            return strM29737;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ */
    public static String m29772(C11877co c11877co) {
        int i = 2 % 2;
        int i2 = f28343 + 51;
        f28345 = i2 % 128;
        int i3 = i2 % 2;
        String strM29736 = c11877co.m29676().m29736();
        int i4 = f28343 + 67;
        f28345 = i4 % 128;
        int i5 = i4 % 2;
        return strM29736;
    }

    /* JADX INFO: renamed from: ﱡ */
    public static String m29765() {
        int i = 2 % 2;
        int i2 = f28345 + 93;
        f28343 = i2 % 128;
        int i3 = i2 % 2;
        String sDKVersion = IronSourceAdQuality.getSDKVersion();
        int i4 = f28343 + 99;
        f28345 = i4 % 128;
        if (i4 % 2 == 0) {
            return sDKVersion;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﱟ */
    public static JSONObject m29764() {
        int i = 2 % 2;
        int i2 = f28345 + 37;
        f28343 = i2 % 128;
        int i3 = i2 % 2;
        JSONObject jSONObjectM30816 = C12077jz.m30816(AbstractC11823ao.m28472().m28507());
        int i4 = f28345 + 95;
        f28343 = i4 % 128;
        int i5 = i4 % 2;
        return jSONObjectM30816;
    }

    /* JADX INFO: renamed from: ｋ */
    public final Object m29785(List<Object> list) {
        int i = 2 % 2;
        String str = (String) m29851(list, 0, String.class);
        List<Object> list2 = m29854(list, 1);
        C11831aw c11831awM30999 = C12092s.m30994().m30999();
        if (c11831awM30999 != null) {
            int i2 = f28345 + 45;
            f28343 = i2 % 128;
            if (i2 % 2 == 0) {
                c11831awM30999.m28664(str, list2);
                int i3 = 96 / 0;
            } else {
                c11831awM30999.m28664(str, list2);
            }
        }
        int i4 = f28343 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
        f28345 = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    /* JADX INFO: renamed from: ﻛ */
    public static JSONObject m29775(C11877co c11877co) {
        int i = 2 % 2;
        int i2 = f28343 + 51;
        f28345 = i2 % 128;
        if (i2 % 2 != 0) {
            c11877co.m29667();
            Object obj = null;
            super.hashCode();
            throw null;
        }
        JSONObject jSONObjectM29667 = c11877co.m29667();
        int i3 = f28345 + 91;
        f28343 = i3 % 128;
        int i4 = i3 % 2;
        return jSONObjectM29667;
    }

    /* JADX INFO: renamed from: ﻏ */
    public static String m29769(C11877co c11877co) {
        int i = 2 % 2;
        int i2 = f28343 + 107;
        f28345 = i2 % 128;
        int i3 = i2 % 2;
        C11878cp c11878cpM29676 = c11877co.m29676();
        if (i3 == 0) {
            return c11878cpM29676.m29742();
        }
        c11878cpM29676.m29742();
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ */
    public static Object m29774(List<Object> list) {
        int i = 2 % 2;
        int i2 = f28345 + 85;
        f28343 = i2 % 128;
        int i3 = i2 % 2;
        C12085l.m30923(m29777("\u0003\u000e\u000b\u0016\u001b\ufff5￦￭￣\u0006\ufff3\u0017", (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 11, false, 8 - (ViewConfiguration.getDoubleTapTimeout() >> 16), Color.red(0) + 240).intern(), (String) m29851(list, 0, String.class));
        int i4 = f28345 + 57;
        f28343 = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    /* JADX INFO: renamed from: ﭸ */
    public static boolean m29759() {
        int i = 2 % 2;
        int i2 = f28343 + 37;
        f28345 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            AbstractC11823ao.m28472().mo28491();
            super.hashCode();
            throw null;
        }
        boolean zMo28491 = AbstractC11823ao.m28472().mo28491();
        int i3 = f28345 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
        f28343 = i3 % 128;
        if (i3 % 2 != 0) {
            return zMo28491;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ */
    public static String m29781(List<Object> list) {
        int i = 2 % 2;
        int i2 = f28345 + 5;
        f28343 = i2 % 128;
        int i3 = i2 % 2;
        String lowerCase = ISAdQualityAdType.fromInt(((Integer) m29851(list, 0, Integer.class)).intValue()).name().toLowerCase();
        int i4 = f28345 + 49;
        f28343 = i4 % 128;
        int i5 = i4 % 2;
        return lowerCase;
    }

    /* JADX INFO: renamed from: ﱟ */
    public static String m29763(C11877co c11877co) {
        int i = 2 % 2;
        int i2 = f28343 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
        f28345 = i2 % 128;
        int i3 = i2 % 2;
        C11878cp c11878cpM29676 = c11877co.m29676();
        if (i3 != 0) {
            c11878cpM29676.m29740();
            Object obj = null;
            super.hashCode();
            throw null;
        }
        String strM29740 = c11878cpM29676.m29740();
        int i4 = f28343 + 65;
        f28345 = i4 % 128;
        int i5 = i4 % 2;
        return strM29740;
    }

    /* JADX INFO: renamed from: ﺙ */
    public static String m29767(C11877co c11877co) {
        int i = 2 % 2;
        int i2 = f28343 + 67;
        f28345 = i2 % 128;
        int i3 = i2 % 2;
        String strM30353 = c11877co.m29679().m30353();
        int i4 = f28343 + 79;
        f28345 = i4 % 128;
        int i5 = i4 % 2;
        return strM30353;
    }

    /* JADX INFO: renamed from: ﭴ */
    public static boolean m29758() {
        int i = 2 % 2;
        int i2 = f28343 + 67;
        f28345 = i2 % 128;
        int i3 = i2 % 2;
        boolean zMo28505 = AbstractC11823ao.m28472().mo28505();
        if (i3 != 0) {
            int i4 = 56 / 0;
        }
        return zMo28505;
    }

    /* JADX INFO: renamed from: ﭖ */
    public static double m29757() {
        int i = 2 % 2;
        int i2 = f28345 + 27;
        f28343 = i2 % 128;
        int i3 = i2 % 2;
        AbstractC11823ao abstractC11823aoM28472 = AbstractC11823ao.m28472();
        if (i3 != 0) {
            return abstractC11823aoM28472.mo28489();
        }
        abstractC11823aoM28472.mo28489();
        throw null;
    }

    /* JADX INFO: renamed from: ﮉ */
    public static JSONObject m29760() {
        int i = 2 % 2;
        int i2 = f28343 + 71;
        f28345 = i2 % 128;
        if (i2 % 2 != 0) {
            AbstractC11823ao.m28472().mo28486().m28507();
            throw null;
        }
        JSONObject jSONObjectM28507 = AbstractC11823ao.m28472().mo28486().m28507();
        int i3 = f28345 + 45;
        f28343 = i3 % 128;
        int i4 = i3 % 2;
        return jSONObjectM28507;
    }

    /* JADX INFO: renamed from: ﮌ */
    public static String m29761() {
        int i = 2 % 2;
        int i2 = f28343 + 17;
        f28345 = i2 % 128;
        int i3 = i2 % 2;
        C11825aq c11825aqMo28486 = AbstractC11823ao.m28472().mo28486();
        if (i3 == 0) {
            return c11825aqMo28486.m28555();
        }
        c11825aqMo28486.m28555();
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: סּ */
    public static JSONObject m29756() {
        int i = 2 % 2;
        int i2 = f28343 + 55;
        f28345 = i2 % 128;
        int i3 = i2 % 2;
        JSONObject jSONObjectM28557 = AbstractC11823ao.m28472().mo28486().m28557();
        int i4 = f28343 + 85;
        f28345 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 51 / 0;
        }
        return jSONObjectM28557;
    }

    /* JADX INFO: renamed from: ﾒ */
    public static Object m29784(List<Object> list) {
        int i = 2 % 2;
        int i2 = f28345 + 41;
        f28343 = i2 % 128;
        int i3 = i2 % 2;
        Object objM28556 = AbstractC11823ao.m28472().mo28486().m28556((String) m29851(list, 0, String.class));
        int i4 = f28343 + 79;
        f28345 = i4 % 128;
        int i5 = i4 % 2;
        return objM28556;
    }

    /* JADX INFO: renamed from: טּ */
    private static C12034ij m29755() {
        int i = 2 % 2;
        int i2 = f28345 + 111;
        f28343 = i2 % 128;
        int i3 = i2 % 2;
        C12034ij c12034ijM30694 = C12060ji.m30687().m30694();
        int i4 = f28343 + 81;
        f28345 = i4 % 128;
        if (i4 % 2 == 0) {
            return c12034ijM30694;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ｋ */
    private static String m29777(String str, int i, boolean z, int i2, int i3) {
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
                cArr2[i4] = (char) (cArr2[i4] - f28344);
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
