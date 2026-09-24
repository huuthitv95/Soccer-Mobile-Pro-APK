package com.mbridge.msdk.foundation.tools;

import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.chartboost.sdk.privacy.model.COPPA;
import com.facebook.share.internal.MessengerShareContentUtility;
import com.google.firebase.crashlytics.internal.common.IdManager;
import com.ironsource.C11540L6;
import com.ironsource.C11794a2;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.controller.authoritycontroller.C13006c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.C13088a;
import com.mbridge.msdk.foundation.same.threadpool.C13167a;
import com.mbridge.msdk.out.MBConfiguration;
import com.mbridge.msdk.util.C13885c;
import java.lang.reflect.Constructor;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.mbridge.msdk.foundation.tools.m0 */
/* JADX INFO: compiled from: SameDiTool.java */
/* JADX INFO: loaded from: classes6.dex */
public class C13211m0 extends C13228v {

    /* JADX INFO: renamed from: A */
    private static int f36320A = 0;

    /* JADX INFO: renamed from: B */
    private static String f36321B = "";

    /* JADX INFO: renamed from: C */
    private static Object f36322C = null;

    /* JADX INFO: renamed from: D */
    private static int f36323D = 0;

    /* JADX INFO: renamed from: E */
    private static int f36324E = 0;

    /* JADX INFO: renamed from: F */
    private static long f36325F = -1;

    /* JADX INFO: renamed from: G */
    private static long f36326G = -1;

    /* JADX INFO: renamed from: H */
    private static String f36327H = "";

    /* JADX INFO: renamed from: I */
    private static String f36328I = "";

    /* JADX INFO: renamed from: J */
    private static String f36329J = "";

    /* JADX INFO: renamed from: j */
    private static String f36330j = "";

    /* JADX INFO: renamed from: k */
    private static String f36331k = "";

    /* JADX INFO: renamed from: l */
    private static int f36332l = -1;

    /* JADX INFO: renamed from: m */
    private static String f36333m = "";

    /* JADX INFO: renamed from: n */
    private static int f36334n = -1;

    /* JADX INFO: renamed from: o */
    private static int f36335o = 0;

    /* JADX INFO: renamed from: p */
    private static String f36336p = "";

    /* JADX INFO: renamed from: q */
    private static int f36337q = -1;

    /* JADX INFO: renamed from: r */
    private static String f36338r = "";

    /* JADX INFO: renamed from: s */
    private static String f36339s = "";

    /* JADX INFO: renamed from: t */
    private static volatile int f36340t = -1;

    /* JADX INFO: renamed from: u */
    private static String f36341u = "";

    /* JADX INFO: renamed from: v */
    private static String f36342v = "";

    /* JADX INFO: renamed from: w */
    private static int f36343w = 0;

    /* JADX INFO: renamed from: x */
    private static String f36344x = "";

    /* JADX INFO: renamed from: y */
    private static String f36345y = "";

    /* JADX INFO: renamed from: z */
    private static int f36346z = -1;

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.tools.m0$a */
    /* JADX INFO: compiled from: SameDiTool.java */
    class a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Context f36347a;

        a(Context context) {
            this.f36347a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            C13198g.m37688c(this.f36347a);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.tools.m0$b */
    /* JADX INFO: compiled from: SameDiTool.java */
    class b implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Context f36348a;

        b(Context context) {
            this.f36348a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            String defaultUserAgent;
            try {
                defaultUserAgent = WebSettings.getDefaultUserAgent(this.f36348a);
            } catch (Throwable unused) {
                defaultUserAgent = null;
            }
            try {
                if (TextUtils.isEmpty(defaultUserAgent) || defaultUserAgent.equals(C13211m0.f36345y)) {
                    return;
                }
                String unused2 = C13211m0.f36345y = defaultUserAgent;
                C13211m0.m37730H(this.f36348a);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.tools.m0$c */
    /* JADX INFO: compiled from: SameDiTool.java */
    class c implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Context f36349a;

        c(Context context) {
            this.f36349a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) this.f36349a.getSystemService("connectivity");
                if (connectivityManager != null && C13088a.f35884z) {
                    NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                    if (activeNetworkInfo == null) {
                        int unused = C13211m0.f36340t = 0;
                        return;
                    }
                    if (activeNetworkInfo.getType() == 1) {
                        int unused2 = C13211m0.f36340t = 9;
                        return;
                    }
                    TelephonyManager telephonyManager = (TelephonyManager) this.f36349a.getSystemService("phone");
                    if (telephonyManager == null) {
                        int unused3 = C13211m0.f36340t = 0;
                    } else {
                        int unused4 = C13211m0.f36340t = C13211m0.m37737c(telephonyManager.getNetworkType());
                    }
                }
            } catch (Exception unused5) {
                int unused6 = C13211m0.f36340t = 0;
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.tools.m0$d */
    /* JADX INFO: compiled from: SameDiTool.java */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                String unused = C13211m0.f36344x = TimeZone.getDefault().getDisplayName(false, 0, Locale.ENGLISH);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.tools.m0$e */
    /* JADX INFO: compiled from: SameDiTool.java */
    class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                C13885c.m41423a();
            } catch (Exception e) {
                C13219q0.m37816b("SameDiTool", e.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.tools.m0$f */
    /* JADX INFO: compiled from: SameDiTool.java */
    class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Context contextM36542d = C13008c.m36588n().m36542d();
                if (contextM36542d != null) {
                    ActivityManager activityManager = (ActivityManager) contextM36542d.getSystemService("activity");
                    ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                    activityManager.getMemoryInfo(memoryInfo);
                    long unused = C13211m0.f36326G = memoryInfo.totalMem;
                    long unused2 = C13211m0.f36325F = memoryInfo.availMem;
                }
            } catch (Throwable th) {
                C13219q0.m37816b("SameDiTool", th.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: A */
    private static void m37716A(Context context) {
        try {
            new Thread(new b(context)).start();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: B */
    public static int m37717B() {
        try {
            if (C13229v0.m37937i()) {
                return 1;
            }
            return C13229v0.m37940j() ? 2 : 0;
        } catch (Exception e2) {
            C13219q0.m37816b("SameDiTool", e2.getMessage());
            return 0;
        }
    }

    /* JADX INFO: renamed from: C */
    public static int m37719C() {
        return f36346z;
    }

    /* JADX INFO: renamed from: D */
    public static void m37722D(Context context) {
        try {
            C13228v.m37872e(context);
            m37764p();
            m37767r();
            m37772t(context);
            m37720C(context);
            m37718B(context);
            m37728G(context);
            m37762o();
            m37771t();
            m37763p(context);
            m37781y();
            C13088a.f35836B = false;
            C13088a.f35884z = C13229v0.m37910b("android.permission.ACCESS_NETWORK_STATE", context);
            m37780x(context);
            m37758m();
            C13198g.m37684b();
            m37745g();
        } catch (Throwable th) {
            C13219q0.m37816b("SameDiTool", th.getMessage());
        }
    }

    /* JADX INFO: renamed from: E */
    public static int m37723E() {
        return f36337q;
    }

    /* JADX INFO: renamed from: F */
    public static boolean m37726F(Context context) {
        return (context.getResources().getConfiguration().screenLayout & 15) >= 3;
    }

    /* JADX INFO: renamed from: G */
    public static int m37728G(Context context) {
        Configuration configuration;
        return (context == null || context.getResources() == null || (configuration = context.getResources().getConfiguration()) == null || configuration.orientation != 2) ? 1 : 2;
    }

    /* JADX INFO: renamed from: H */
    private static void m37729H() {
        String str = Build.VERSION.RELEASE;
        String strM37762o = m37762o();
        String str2 = Build.DISPLAY;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(strM37762o)) {
            f36345y = "Mozilla/5.0 (Linux; Android 4.0.4; Galaxy Nexus Build/IMM76B) AppleWebKit/535.19 (KHTML, like Gecko) Chrome/18.0.1025.133 Mobile Safari/535.19";
            return;
        }
        StringBuilder sb = new StringBuilder("Mozilla/5.0 (Linux; Android ");
        sb.append(str);
        sb.append("; ");
        sb.append(strM37762o);
        sb.append(" Build/");
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        sb.append(str2);
        sb.append(") AppleWebKit/535.19 (KHTML, like Gecko) Chrome/18.0.1025.133 Mobile Safari/535.19");
        f36345y = sb.toString();
    }

    /* JADX INFO: renamed from: c */
    public static int m37737c(int i) {
        switch (i) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
            case 16:
                return 2;
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
            case 17:
                return 3;
            case 13:
            case 18:
            case 19:
                return 4;
            case 20:
                return 5;
            default:
                return 0;
        }
    }

    /* JADX INFO: renamed from: d */
    public static Object m37739d(String str) {
        if (f36322C == null) {
            f36322C = C13229v0.m37931g(str);
        }
        return f36322C;
    }

    /* JADX INFO: renamed from: e */
    public static int m37741e(String str) {
        if (f36324E == 0) {
            f36324E = C13229v0.m37928f(str);
        }
        return f36324E;
    }

    /* JADX INFO: renamed from: g */
    public static void m37746g(Context context) {
        try {
            c cVar = new c(context);
            if (C13167a.m37545d().getActiveCount() < 1) {
                C13167a.m37545d().execute(cVar);
            }
        } catch (Throwable th) {
            C13219q0.m37816b("SameDiTool", th.getMessage());
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m37748h(Context context) {
        if (context == null) {
            return;
        }
        try {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                C13198g.m37688c(context);
            } else {
                new Handler(context.getMainLooper()).post(new a(context));
            }
        } catch (Exception e2) {
            C13219q0.m37817b("SameDiTool", "", e2);
        }
    }

    /* JADX INFO: renamed from: i */
    public static String m37749i() {
        if (TextUtils.isEmpty(f36345y)) {
            m37755l(C13008c.m36588n().m36542d());
        }
        return f36345y;
    }

    /* JADX INFO: renamed from: j */
    public static String m37751j() {
        C13006c.m36583m().m36584c(MBridgeConstans.AUTHORITY_GENERAL_DATA);
        return "";
    }

    /* JADX INFO: renamed from: k */
    public static String m37753k(Context context) {
        try {
            if (!C13006c.m36583m().m36584c(MBridgeConstans.AUTHORITY_OTHER) || context == null) {
                return C11794a2.f26725f;
            }
            AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
            String str = new DecimalFormat(IdManager.DEFAULT_VERSION_NAME).format((audioManager != null ? audioManager.getStreamVolume(3) : -1) / (audioManager != null ? audioManager.getStreamMaxVolume(3) : -1));
            return TextUtils.isEmpty(str) ? C11794a2.f26725f : str;
        } catch (Throwable th) {
            C13219q0.m37816b("SameDiTool", th.getMessage());
            return C11794a2.f26725f;
        }
    }

    /* JADX INFO: renamed from: l */
    public static String m37755l(Context context) {
        if (!C13006c.m36583m().m36584c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            return null;
        }
        m37750i(context);
        try {
            if (Looper.myLooper() != Looper.getMainLooper() || MBridgeConstans.DNT_GUA_ON_UI) {
                if (TextUtils.isEmpty(f36345y)) {
                    m37729H();
                }
                m37716A(context);
            } else if (TextUtils.isEmpty(f36345y)) {
                try {
                    f36345y = WebSettings.getDefaultUserAgent(context);
                } catch (Throwable unused) {
                }
                if (TextUtils.isEmpty(f36345y)) {
                    try {
                        Constructor declaredConstructor = WebSettings.class.getDeclaredConstructor(Context.class, WebView.class);
                        declaredConstructor.setAccessible(true);
                        f36345y = ((WebSettings) declaredConstructor.newInstance(context, null)).getUserAgentString();
                        declaredConstructor.setAccessible(false);
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                    if (TextUtils.isEmpty(f36345y)) {
                        try {
                            f36345y = new WebView(context).getSettings().getUserAgentString();
                        } catch (Throwable th2) {
                            th2.printStackTrace();
                        }
                    }
                    if (TextUtils.isEmpty(f36345y)) {
                        m37729H();
                    }
                }
            } else {
                m37716A(context);
            }
        } catch (Throwable th3) {
            C13219q0.m37817b("SameDiTool", th3.getMessage(), th3);
        }
        m37730H(context);
        return f36345y;
    }

    /* JADX INFO: renamed from: m */
    public static int m37757m(Context context) {
        if (!C13006c.m36583m().m36584c(MBridgeConstans.AUTHORITY_GENERAL_DATA) || context == null) {
            return 0;
        }
        try {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            HashMap mapM37776v = m37776v(context);
            return mapM37776v.get("height") == null ? displayMetrics.heightPixels : ((Integer) mapM37776v.get("height")).intValue();
        } catch (Exception e2) {
            e2.printStackTrace();
            return 0;
        }
    }

    /* JADX INFO: renamed from: n */
    public static int m37760n(Context context) {
        if (!C13006c.m36583m().m36584c(MBridgeConstans.AUTHORITY_GENERAL_DATA) || context == null) {
            return 0;
        }
        try {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            HashMap mapM37776v = m37776v(context);
            return mapM37776v.get("width") == null ? displayMetrics.widthPixels : ((Integer) mapM37776v.get("width")).intValue();
        } catch (Exception e2) {
            e2.printStackTrace();
            return 0;
        }
    }

    /* JADX INFO: renamed from: o */
    public static String m37762o() {
        return !C13006c.m36583m().m36584c(MBridgeConstans.AUTHORITY_GENERAL_DATA) ? "" : Build.MODEL;
    }

    /* JADX INFO: renamed from: p */
    public static String m37763p(Context context) {
        Locale locale;
        if (!C13006c.m36583m().m36584c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            return "";
        }
        if (TextUtils.isEmpty(f36336p)) {
            if (context == null) {
                return "en-US";
            }
            try {
                if (context.getResources() == null || context.getResources().getConfiguration() == null || (locale = context.getResources().getConfiguration().locale) == null) {
                    return "en-US";
                }
                String languageTag = locale.toLanguageTag();
                f36336p = languageTag;
                return languageTag;
            } catch (Throwable th) {
                C13219q0.m37813a("SameDiTool", th.getMessage());
                f36336p = "en-US";
            }
        }
        return f36336p;
    }

    /* JADX INFO: renamed from: q */
    public static String m37766q(Context context) {
        try {
            if (!C13006c.m36583m().m36584c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                f36338r = "";
            } else if (TextUtils.isEmpty(f36338r)) {
                if (context == null) {
                    f36338r = "";
                    return "";
                }
                String simOperator = ((TelephonyManager) context.getSystemService("phone")).getSimOperator();
                if (C13229v0.m37941j(simOperator)) {
                    f36338r = simOperator.substring(0, Math.min(3, simOperator.length()));
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            f36338r = "";
        }
        return f36338r;
    }

    /* JADX INFO: renamed from: r */
    public static String m37768r(Context context) {
        try {
            if (!C13006c.m36583m().m36584c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                f36339s = "";
            } else if (TextUtils.isEmpty(f36339s)) {
                if (context == null) {
                    f36339s = "";
                    return f36338r;
                }
                String simOperator = ((TelephonyManager) context.getSystemService("phone")).getSimOperator();
                if (C13229v0.m37941j(simOperator)) {
                    f36339s = simOperator.substring(Math.min(3, simOperator.length()));
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            f36339s = "";
        }
        return f36339s;
    }

    /* JADX INFO: renamed from: s */
    public static int m37770s(Context context) {
        try {
            Context contextM36542d = C13008c.m36588n().m36542d();
            if (!C13006c.m36583m().m36584c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                return f36340t;
            }
            if (contextM36542d == null) {
                return f36340t;
            }
            if (f36340t != -1) {
                m37746g(contextM36542d);
                return f36340t;
            }
            f36340t = 0;
            return f36340t;
        } catch (Exception e2) {
            C13219q0.m37817b("SameDiTool", e2.getMessage(), e2);
            f36340t = 0;
            return f36340t;
        }
    }

    /* JADX INFO: renamed from: t */
    public static String m37772t(Context context) {
        if (context == null) {
            return f36342v;
        }
        try {
            if (!TextUtils.isEmpty(f36342v)) {
                return f36342v;
            }
            String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).packageName;
            f36342v = str;
            return str;
        } catch (Exception e2) {
            e2.printStackTrace();
            return "";
        }
    }

    /* JADX INFO: renamed from: u */
    public static String m37774u() {
        if (!C13006c.m36583m().m36584c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            return "";
        }
        return Build.MANUFACTURER + " " + Build.MODEL;
    }

    /* JADX INFO: renamed from: v */
    public static HashMap m37776v(Context context) {
        HashMap map = new HashMap();
        if (context != null) {
            try {
                Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
                DisplayMetrics displayMetrics = new DisplayMetrics();
                defaultDisplay.getRealMetrics(displayMetrics);
                map.put("height", Integer.valueOf(displayMetrics.heightPixels));
                map.put("width", Integer.valueOf(displayMetrics.widthPixels));
                return map;
            } catch (Exception e2) {
                C13219q0.m37817b("SameDiTool", e2.getMessage(), e2);
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: w */
    public static String m37777w() {
        try {
            if (TextUtils.isEmpty(f36328I)) {
                Context contextM36542d = C13008c.m36588n().m36542d();
                long jM37714a = C13209l0.m37714a();
                String strM37752j = m37752j(contextM36542d);
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("1", strM37752j);
                    jSONObject.put("2", String.valueOf(f36326G));
                    jSONObject.put(ExifInterface.GPS_MEASUREMENT_3D, String.valueOf(jM37714a));
                    jSONObject.put("4", "");
                    jSONObject.put(CampaignEx.CLICKMODE_ON, "");
                } catch (Exception e2) {
                    C13219q0.m37816b("SameDiTool", e2.getMessage());
                }
                String strM37593b = C13180a.m37593b(jSONObject.toString());
                f36328I = strM37593b;
                if (strM37593b == null) {
                    f36328I = "";
                }
            }
        } catch (Exception e3) {
            C13219q0.m37816b("SameDiTool", e3.getMessage());
        }
        return f36328I;
    }

    /* JADX INFO: renamed from: x */
    public static int m37779x() {
        if (!C13006c.m36583m().m36584c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            return 0;
        }
        long j = f36326G;
        if (j > 0) {
            return Long.valueOf((j / 1000) / 1000).intValue();
        }
        return -1;
    }

    /* JADX INFO: renamed from: y */
    public static String m37782y(Context context) {
        if (!C13006c.m36583m().m36584c(MBridgeConstans.AUTHORITY_GENERAL_DATA) || context == null) {
            return "";
        }
        try {
            return Settings.System.getString(context.getContentResolver(), "time_12_24");
        } catch (Exception e2) {
            C13219q0.m37817b("SameDiTool", e2.getMessage(), e2);
            return "";
        } catch (Throwable th) {
            C13219q0.m37817b("SameDiTool", th.getMessage(), th);
            return "";
        }
    }

    /* JADX INFO: renamed from: z */
    public static String m37784z(Context context) {
        return (C13006c.m36583m().m36584c(MBridgeConstans.AUTHORITY_GENERAL_DATA) && context != null) ? String.valueOf(f36326G) : "";
    }

    /* JADX INFO: renamed from: C */
    public static String m37720C(Context context) {
        if (context == null) {
            return f36321B;
        }
        try {
            if (!TextUtils.isEmpty(f36321B)) {
                return f36321B;
            }
            String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            f36321B = str;
            return str;
        } catch (Exception e2) {
            e2.printStackTrace();
            return "";
        }
    }

    /* JADX INFO: renamed from: E */
    public static int m37724E(Context context) {
        if (f36332l == -1) {
            f36332l = C13229v0.m37915c(context, "com.tencent.mm") ? 1 : 0;
        }
        return f36332l;
    }

    /* JADX INFO: renamed from: F */
    public static int m37725F() {
        if (!C13006c.m36583m().m36584c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            return -1;
        }
        String str = Build.FINGERPRINT;
        if (!str.startsWith(MessengerShareContentUtility.TEMPLATE_GENERIC_TYPE) && !str.startsWith("unknown")) {
            String str2 = Build.MODEL;
            if (!str2.contains("google_sdk") && !str2.contains("Emulator") && !str2.contains("Android SDK built for x86") && !Build.MANUFACTURER.contains("Genymotion") && ((!Build.BRAND.startsWith(MessengerShareContentUtility.TEMPLATE_GENERIC_TYPE) || !Build.DEVICE.startsWith(MessengerShareContentUtility.TEMPLATE_GENERIC_TYPE)) && !"google_sdk".equals(Build.PRODUCT))) {
                String str3 = Build.HARDWARE;
                if (!str3.equals("goldfish") && !str3.equals("vbox86") && !str3.contains("qemu")) {
                    return 0;
                }
            }
        }
        return 1;
    }

    /* JADX INFO: renamed from: a */
    public static String m37732a(Context context, int i) {
        TelephonyManager telephonyManager;
        if (i != 0 && i != 9) {
            try {
                return (!C13088a.f35884z || (telephonyManager = (TelephonyManager) context.getSystemService("phone")) == null) ? "" : String.valueOf(telephonyManager.getNetworkType());
            } catch (Throwable th) {
                C13219q0.m37817b("SameDiTool", th.getMessage(), th);
            }
        }
        return "";
    }

    /* JADX INFO: renamed from: f */
    public static void m37744f(String str) {
        f36329J = str;
    }

    /* JADX INFO: renamed from: j */
    public static String m37752j(Context context) {
        try {
            if (C13006c.m36583m().m36584c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                if (TextUtils.isEmpty(f36331k)) {
                    f36331k = ((TelephonyManager) context.getSystemService("phone")).getSimOperatorName();
                }
            } else {
                f36331k = "";
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            f36331k = "";
        }
        return f36331k;
    }

    /* JADX INFO: renamed from: d */
    public static void m37740d(int i) {
        f36337q = i;
    }

    /* JADX INFO: renamed from: i */
    private static void m37750i(Context context) {
        if (TextUtils.isEmpty(f36345y)) {
            try {
                f36345y = C13235y0.m37956a(context, "mbridge_ua", "").toString();
            } catch (Throwable th) {
                C13219q0.m37817b("SameDiTool", th.getMessage(), th);
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public static float m37761o(Context context) {
        Resources resources;
        try {
            if (C13006c.m36583m().m36584c(MBridgeConstans.AUTHORITY_OTHER) && context != null && (resources = context.getResources()) != null) {
                return resources.getConfiguration().fontScale;
            }
        } catch (Throwable th) {
            C13219q0.m37816b("SameDiTool", th.getMessage());
        }
        return -1.0f;
    }

    /* JADX INFO: renamed from: u */
    public static int m37773u(Context context) {
        try {
            if (C13006c.m36583m().m36584c(MBridgeConstans.AUTHORITY_OTHER) && context != null) {
                return ((PowerManager) context.getSystemService("power")).isPowerSaveMode() ? 1 : 0;
            }
            return -1;
        } catch (Throwable th) {
            C13219q0.m37816b("SameDiTool", th.getMessage());
            return -1;
        }
    }

    /* JADX INFO: renamed from: x */
    public static int m37780x(Context context) {
        if (context == null) {
            return f36343w;
        }
        if (f36343w == 0) {
            try {
                f36343w = context.getApplicationInfo().targetSdkVersion;
            } catch (Exception e2) {
                C13219q0.m37816b("SameDiTool", e2.getMessage());
            }
        }
        return f36343w;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static void m37730H(Context context) {
        try {
            C13235y0.m37957b(context, "mbridge_ua", f36345y);
        } catch (Throwable th) {
            C13219q0.m37817b("SameDiTool", th.getMessage(), th);
        }
    }

    /* JADX INFO: renamed from: G */
    public static int m37727G() {
        if (f36334n == -1) {
            f36334n = C13229v0.m37932g() ? 1 : 0;
        }
        return f36334n;
    }

    /* JADX INFO: renamed from: z */
    public static String m37783z() {
        if (!C13006c.m36583m().m36584c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            return "";
        }
        if (TextUtils.isEmpty(f36327H)) {
            long j = f36326G;
            if (j > 0) {
                f36327H = Math.ceil(Float.valueOf(j / 1.0737418E9f).doubleValue()) + "GB";
            }
        }
        return f36327H;
    }

    /* JADX INFO: renamed from: m */
    public static String m37758m() {
        String str;
        if (!TextUtils.isEmpty(f36333m)) {
            return f36333m;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            Class<?> cls = Class.forName("com.huawei.system.BuildEx");
            str = (String) cls.getMethod("getOsBrand", null).invoke(cls, null);
        } catch (Throwable th) {
            C13219q0.m37816b("SameDiTool", th.getMessage());
            str = null;
        }
        try {
            if (!TextUtils.isEmpty(str) && str.equals("harmony")) {
                jSONObject.put("osType", str);
                try {
                    Class<?> cls2 = Class.forName("ohos.system.version.SystemVersion");
                    jSONObject.put("version", (String) cls2.getMethod("getVersion", null).invoke(cls2, null));
                } catch (Throwable th2) {
                    C13219q0.m37816b("SameDiTool", th2.getMessage());
                }
                try {
                    jSONObject.put("pure_state", Settings.Secure.getInt(C13008c.m36588n().m36542d().getContentResolver(), "pure_mode_state", -1));
                } catch (Throwable th3) {
                    C13219q0.m37816b("SameDiTool", th3.getMessage());
                }
                String string = jSONObject.toString();
                if (!TextUtils.isEmpty(string)) {
                    string = C13207k0.m37713b(string);
                }
                f36333m = string;
            } else {
                f36333m = "android";
            }
        } catch (Throwable th4) {
            C13219q0.m37816b("SameDiTool", th4.getMessage());
        }
        return f36333m;
    }

    /* JADX INFO: renamed from: n */
    public static int m37759n() {
        if (C13006c.m36583m().m36584c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            return Build.VERSION.SDK_INT;
        }
        return -1;
    }

    /* JADX INFO: renamed from: B */
    public static int m37718B(Context context) {
        if (context == null) {
            return f36320A;
        }
        int i = f36320A;
        if (i != 0) {
            return i;
        }
        try {
            int i2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
            f36320A = i2;
            return i2;
        } catch (Exception e2) {
            e2.printStackTrace();
            return -1;
        }
    }

    /* JADX INFO: renamed from: h */
    public static int m37747h() {
        try {
            if (!C13006c.m36583m().m36584c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                return 0;
            }
            long j = f36325F;
            if (j > 0) {
                return Long.valueOf((j / 1000) / 1000).intValue();
            }
            return -1;
        } catch (Throwable th) {
            C13219q0.m37817b("SameDiTool", th.getMessage(), th);
            return -1;
        }
    }

    /* JADX INFO: renamed from: t */
    public static String m37771t() {
        if (!C13006c.m36583m().m36584c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            return "";
        }
        return Build.BRAND;
    }

    /* JADX INFO: renamed from: a */
    public static String m37733a(String str, Context context) {
        try {
            if (!TextUtils.isEmpty(f36330j)) {
                return f36330j;
            }
            if (!TextUtils.isEmpty(str) && context != null) {
                f36330j = context.getPackageManager().getInstallerPackageName(str);
                C13219q0.m37813a("SameDiTool", "PKGSource:" + f36330j);
            }
            return f36330j;
        } catch (Exception e2) {
            C13219q0.m37817b("SameDiTool", e2.getMessage(), e2);
        }
    }

    /* JADX INFO: renamed from: k */
    public static Map<String, String> m37754k() {
        Context contextM36542d = C13008c.m36588n().m36542d();
        HashMap map = new HashMap();
        map.put(C11540L6.f24899B, m37762o());
        map.put("brand", m37771t());
        map.put("screen_size", m37760n(contextM36542d) + "x" + m37757m(contextM36542d));
        map.put("network_type", String.valueOf(f36340t));
        map.put("useragent", f36345y);
        map.put("language", m37763p(contextM36542d));
        map.put("os_version", m37767r());
        map.put("timezone", m37781y());
        map.put(COPPA.COPPA_STANDARD, String.valueOf(C13006c.m36583m().m36573c()));
        map.put(C11540L6.f24917H, "1");
        map.put(C11540L6.f24947V0, C13198g.m37689d());
        map.put("gaid2", C13198g.f36292b);
        map.put("package_name", m37772t(contextM36542d));
        map.put("app_version_name", m37720C(contextM36542d));
        map.put("app_version_code", String.valueOf(m37718B(contextM36542d)));
        map.put("pkg_source", m37733a(m37772t(contextM36542d), contextM36542d));
        map.put("version_flag", "1");
        map.put("dyview_type", "1");
        map.put("unknown_source", String.valueOf(m37719C()));
        map.put("sdk_version", MBConfiguration.SDK_VERSION);
        map.put("mcc", m37766q(contextM36542d));
        map.put("mnc", m37768r(contextM36542d));
        map.put("withGP", String.valueOf(m37723E()));
        map.put("has_wx", String.valueOf(m37724E(contextM36542d)));
        map.put("opensdk_ver", String.valueOf(m37721D()));
        map.put("adid_litmit", String.valueOf(C13198g.m37679a()));
        map.put("orientation", String.valueOf(m37728G(contextM36542d)));
        map.put("network_str", m37732a(contextM36542d, m37770s(contextM36542d)));
        map.put("brt", m37778w(contextM36542d));
        map.put("dmf", String.valueOf(f36325F));
        map.put("dmt", String.valueOf(f36326G));
        map.put("font", String.valueOf(m37761o(contextM36542d)));
        map.put("fw_type", "2");
        map.put(CmcdData.Factory.STREAMING_FORMAT_HLS, String.valueOf(C13225t0.m37852c()));
        map.put(CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT, String.valueOf(C13225t0.m37848a()));
        map.put(C11540L6.f24955Z0, String.valueOf(m37773u(contextM36542d)));
        map.put("simu", String.valueOf(m37725F()));
        map.put("target_os_version", String.valueOf(m37780x(contextM36542d)));
        map.put(C11540L6.f24981i0, m37753k(contextM36542d));
        map.put("ui_orientation", String.valueOf(m37728G(contextM36542d)));
        map.put("tun", String.valueOf(m37715A()));
        map.put("gp_version", m37775v());
        map.put("os_api_version", String.valueOf(m37759n()));
        map.put("manufacturer", m37765q());
        map.put("weChatSupportApi", String.valueOf(m37741e("")));
        map.put("hasWXOpenSDK", String.valueOf(m37727G()));
        map.put("az_aid_info_origin", C13198g.m37690e());
        return map;
    }

    /* JADX INFO: renamed from: D */
    public static int m37721D() {
        if (f36323D == 0) {
            f36323D = C13229v0.m37923e();
        }
        return f36323D;
    }

    /* JADX INFO: renamed from: y */
    public static String m37781y() {
        try {
            if (!C13006c.m36583m().m36584c(MBridgeConstans.AUTHORITY_OTHER)) {
                return "";
            }
            if (TextUtils.isEmpty(f36344x)) {
                new Thread(new d()).start();
                return f36344x;
            }
        } catch (Throwable th) {
            C13219q0.m37817b("SameDiTool", th.getMessage(), th);
        }
        return f36344x;
    }

    /* JADX INFO: renamed from: q */
    public static String m37765q() {
        if (!C13006c.m36583m().m36584c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            return "";
        }
        return Build.MANUFACTURER;
    }

    /* JADX INFO: renamed from: r */
    public static String m37767r() {
        if (!C13006c.m36583m().m36584c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            return "";
        }
        if (TextUtils.isEmpty(f36341u)) {
            f36341u = m37769s() + "";
        }
        return f36341u;
    }

    /* JADX INFO: renamed from: v */
    public static String m37775v() {
        return f36329J;
    }

    /* JADX INFO: renamed from: s */
    public static int m37769s() {
        try {
            return Build.VERSION.SDK_INT;
        } catch (Exception e2) {
            e2.printStackTrace();
            return 0;
        }
    }

    /* JADX INFO: renamed from: A */
    public static int m37715A() {
        try {
            if (!C13223s0.m37831a().m37842a("v_a_d_p", false)) {
                return 0;
            }
            if (C13229v0.m37937i()) {
                f36335o = 1;
            } else if (C13229v0.m37940j()) {
                f36335o = 2;
            } else {
                f36335o = 0;
            }
        } catch (Exception e2) {
            f36335o = 0;
            C13219q0.m37816b("SameDiTool", e2.getMessage());
        }
        return f36335o;
    }

    /* JADX INFO: renamed from: w */
    public static String m37778w(Context context) {
        if (!C13006c.m36583m().m36584c(MBridgeConstans.AUTHORITY_GENERAL_DATA) || context == null) {
            return "";
        }
        try {
            return String.valueOf(Settings.System.getInt(context.getContentResolver(), "screen_brightness"));
        } catch (Exception unused) {
            return "0";
        }
    }

    /* JADX INFO: renamed from: p */
    private static void m37764p() {
        try {
            C13167a.m37546e().execute(new f());
        } catch (Throwable th) {
            C13219q0.m37816b("SameDiTool", th.getMessage());
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m37745g() {
        try {
            C13167a.m37546e().execute(new e());
        } catch (Throwable th) {
            C13219q0.m37816b("SameDiTool", th.getMessage());
        }
    }

    /* JADX INFO: renamed from: l */
    public static void m37756l() {
        try {
            Object objM37956a = C13235y0.m37956a(C13008c.m36588n().m36542d(), MBridgeConstans.SP_GA_ID, "");
            Object objM37956a2 = C13235y0.m37956a(C13008c.m36588n().m36542d(), MBridgeConstans.SP_GA_ID_LIMIT, 0);
            if (objM37956a instanceof String) {
                String str = (String) objM37956a;
                if (!TextUtils.isEmpty(str)) {
                    C13198g.m37683a(str);
                }
                if (objM37956a2 instanceof Integer) {
                    C13198g.m37680a(((Integer) objM37956a2).intValue());
                }
            }
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                C13219q0.m37816b("SameDiTool", e2.getMessage());
            }
        }
    }
}
