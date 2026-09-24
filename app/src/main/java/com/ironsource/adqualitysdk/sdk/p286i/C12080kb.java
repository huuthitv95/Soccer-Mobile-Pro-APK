package com.ironsource.adqualitysdk.sdk.p286i;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.vungle.ads.internal.protos.Sdk;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.kb */
/* JADX INFO: loaded from: classes6.dex */
public final class C12080kb {

    /* JADX INFO: renamed from: ﻐ */
    private static WeakReference<C11833ay> f29794 = null;

    /* JADX INFO: renamed from: ﻛ */
    private static int f29795 = 0;

    /* JADX INFO: renamed from: ﾇ */
    private static long f29796 = 2445120410729481453L;

    /* JADX INFO: renamed from: ﾒ */
    private static int f29797 = 1;

    /* JADX INFO: renamed from: ﻛ */
    public static void m30838(C11833ay c11833ay) {
        int i = 2 % 2;
        f29794 = new WeakReference<>(c11833ay);
        int i2 = f29797 + 19;
        f29795 = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX INFO: renamed from: ﾒ */
    public static Throwable m30847(Throwable th) {
        int i = 2 % 2;
        while (th.getCause() != null) {
            int i2 = f29795 + 85;
            f29797 = i2 % 128;
            int i3 = i2 % 2;
            th = th.getCause();
            int i4 = f29797 + 49;
            f29795 = i4 % 128;
            int i5 = i4 % 2;
        }
        return th;
    }

    /* JADX INFO: renamed from: ﾇ */
    public static void m30845(String str, String str2, Throwable th, boolean z) {
        int i = 2 % 2;
        int i2 = f29797 + 91;
        f29795 = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                m30841(str, str2, th, z, true);
            } else {
                m30841(str, str2, th, z, false);
            }
            int i3 = f29797 + 37;
            f29795 = i3 % 128;
            int i4 = i3 % 2;
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: ﻛ */
    public static void m30841(String str, String str2, Throwable th, boolean z, boolean z2) {
        int i = 2 % 2;
        int i2 = f29797 + 75;
        f29795 = i2 % 128;
        int i3 = i2 % 2;
        try {
            m30846(str, str2, th, z, z2, false);
            int i4 = f29795 + 69;
            f29797 = i4 % 128;
            int i5 = i4 % 2;
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: ﾇ */
    public static void m30846(String str, String str2, Throwable th, boolean z, boolean z2, boolean z3) {
        int i = 2 % 2;
        int i2 = f29795 + 111;
        f29797 = i2 % 128;
        int i3 = i2 % 2;
        try {
            if (z) {
                C12085l.m30915(str, str2, z3);
                if (th != null) {
                    int i4 = f29795 + 37;
                    f29797 = i4 % 128;
                    C12085l.m30927(str, (i4 % 2 == 0 ? m30842("ウモ执晎\ue6ef\uab1f濠▹⍻着箳फ़", -TextUtils.indexOf((CharSequence) "", '%', 0)) : m30842("ウモ执晎\ue6ef\uab1f濠▹⍻着箳फ़", -TextUtils.indexOf((CharSequence) "", '0', 0))).intern(), th, z3);
                }
            } else {
                C12085l.m30927(str, str2, th, z3);
            }
            StringBuilder sb = new StringBuilder();
            sb.append(m30842("渼湨킠\udae1吿럫퍚㥏緭䡣윎ᗳ䤿糏", 1 - (Process.myTid() >> 22)).intern());
            sb.append(str);
            m30840(str, str2, sb.toString(), th, null, false, z2, z3);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: ﾒ */
    public static void m30848(String str, String str2, String str3, Throwable th, JSONObject jSONObject, boolean z) {
        int i = 2 % 2;
        int i2 = f29797 + 53;
        f29795 = i2 % 128;
        int i3 = i2 % 2;
        try {
            m30840(str, str2, str3, th, jSONObject, true, false, z);
            int i4 = f29797 + 53;
            f29795 = i4 % 128;
            int i5 = i4 % 2;
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: ｋ */
    public static void m30843(String str, String str2, String str3, Throwable th) {
        int i = 2 % 2;
        int i2 = f29797 + 53;
        f29795 = i2 % 128;
        int i3 = i2 % 2;
        try {
            m30849(str, str2, str3, th, false);
            int i4 = f29795 + 23;
            f29797 = i4 % 128;
            int i5 = i4 % 2;
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: ﾒ */
    private static void m30849(String str, String str2, String str3, Throwable th, boolean z) {
        int i = 2 % 2;
        int i2 = f29797 + 43;
        f29795 = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                m30840(str, str2, str3, th, null, true, false, true);
            } else {
                m30840(str, str2, str3, th, null, false, false, false);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: ﻛ */
    private static void m30840(String str, String str2, String str3, Throwable th, JSONObject jSONObject, boolean z, boolean z2, boolean z3) {
        int i = 2 % 2;
        if (z) {
            try {
                StringBuilder sb = new StringBuilder();
                sb.append(str3);
                sb.append(m30842("軉軳\uec9d\ude22Ἷ", 1 - Color.argb(0, 0, 0, 0)).intern());
                sb.append(str);
                str3 = sb.toString();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str2);
                sb2.append(m30842("霕霵뮀是㽅ϯ澖赇蓅⍄箁", 1 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)).intern());
                sb2.append(str3);
                sb2.append(m30842("泚泳蔥ใ\ue1d4", -Process.getGidForName("")).intern());
                C12085l.m30927(str, sb2.toString(), th, z3);
            } catch (Throwable unused) {
                return;
            }
        }
        String str4 = str3;
        C11833ay c11833ay = f29794.get();
        if (c11833ay != null) {
            int i2 = f29797 + 33;
            f29795 = i2 % 128;
            if (i2 % 2 != 0) {
                c11833ay.m28703(str, str2, str4, Log.getStackTraceString(th), jSONObject, z2);
                throw null;
            }
            c11833ay.m28703(str, str2, str4, Log.getStackTraceString(th), jSONObject, z2);
            int i3 = f29795 + 67;
            f29797 = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 3 / 5;
            }
        }
    }

    /* JADX INFO: renamed from: ﻛ */
    public static void m30839(String str, String str2, String str3, String str4) {
        int i = 2 % 2;
        int i2 = f29795 + 95;
        f29797 = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                m30844(str, str2, str3, str4);
                return;
            }
            m30844(str, str2, str3, str4);
            Object obj = null;
            super.hashCode();
            throw null;
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: ﾇ */
    private static void m30844(String str, String str2, String str3, String str4) {
        String string;
        int i = 2 % 2;
        try {
            if (TextUtils.isEmpty(str3)) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str3);
            sb.append(m30842("軉軳\uec9d\ude22Ἷ", 1 - (ViewConfiguration.getDoubleTapTimeout() >> 16)).intern());
            sb.append(str);
            String string2 = sb.toString();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m30842("侣俦롡\uecce㳾\udcff\ue566剗履⃠\uf137续梿ᑜ\uddac", 1 - (ViewConfiguration.getKeyRepeatDelay() >> 16)).intern());
            sb2.append(string2);
            sb2.append(m30842("饁饡䲨夤젬褖傐ޥ誐푮䓘⬌빝\ue094栉㽗ꉳ", Drawable.resolveOpacity(0, 0) + 1).intern());
            C12085l.m30915(str, sb2.toString(), false);
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str2);
            if (str4 != null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(m30842("❮❤ꇸ缕힙", -(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))).intern());
                sb4.append(str4);
                string = sb4.toString();
            } else {
                string = "";
                int i2 = f29797 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
                f29795 = i2 % 128;
                int i3 = i2 % 2;
            }
            sb3.append(string);
            C12085l.m30915(str, sb3.toString(), false);
            C11833ay c11833ay = f29794.get();
            if (c11833ay != null) {
                int i4 = f29795 + 59;
                f29797 = i4 % 128;
                if (i4 % 2 == 0) {
                    c11833ay.m28708(str, str2, string2, str4);
                    int i5 = 26 / 0;
                } else {
                    c11833ay.m28708(str, str2, string2, str4);
                }
                int i6 = f29797 + 99;
                f29795 = i6 % 128;
                int i7 = i6 % 2;
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: ｋ */
    private static String m30842(String str, int i) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (C11943f.f28848) {
            char[] cArrM30189 = C11943f.m30189(f29796, cArr, i);
            C11943f.f28846 = 4;
            while (C11943f.f28846 < cArrM30189.length) {
                C11943f.f28847 = C11943f.f28846 - 4;
                cArrM30189[C11943f.f28846] = (char) (((long) (cArrM30189[C11943f.f28846] ^ cArrM30189[C11943f.f28846 % 4])) ^ (((long) C11943f.f28847) * f29796));
                C11943f.f28846++;
            }
            str2 = new String(cArrM30189, 4, cArrM30189.length - 4);
        }
        return str2;
    }
}
