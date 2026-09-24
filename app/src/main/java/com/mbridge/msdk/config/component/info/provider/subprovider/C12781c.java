package com.mbridge.msdk.config.component.info.provider.subprovider;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Build;
import android.os.SystemClock;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.facebook.share.internal.MessengerShareContentUtility;
import com.google.android.gms.common.GoogleApiAvailability;
import com.ironsource.C11540L6;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.tools.C13207k0;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.foundation.tools.C13229v0;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.mbridge.msdk.config.component.info.provider.subprovider.c */
/* JADX INFO: compiled from: NormalDeviceInfoProvider.java */
/* JADX INFO: loaded from: classes5.dex */
public class C12781c {

    /* JADX INFO: renamed from: a */
    static String f34051a = "NormalDeviceInfoProvider";

    /* JADX INFO: renamed from: a */
    public String m35270a() {
        return Build.BRAND;
    }

    /* JADX INFO: renamed from: b */
    public int m35273b(Context context) {
        if (context == null) {
            return -1;
        }
        try {
            return context.getApplicationInfo().targetSdkVersion;
        } catch (Exception e) {
            C13219q0.m37816b(f34051a, e.getMessage());
            return -1;
        }
    }

    /* JADX INFO: renamed from: c */
    public int m35275c(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (Exception e) {
            C13219q0.m37817b(f34051a, e.getMessage(), e);
            return -1;
        }
    }

    /* JADX INFO: renamed from: d */
    public String m35277d() {
        return Build.MANUFACTURER;
    }

    /* JADX INFO: renamed from: f */
    public String m35282f() {
        return Build.MODEL;
    }

    /* JADX INFO: renamed from: g */
    public String m35283g() {
        return Build.VERSION.RELEASE;
    }

    /* JADX INFO: renamed from: h */
    public int m35285h() {
        return Build.VERSION.SDK_INT;
    }

    /* JADX INFO: renamed from: i */
    public Map<String, String> m35288i(Context context) {
        if (context == null) {
            return null;
        }
        try {
            String simOperator = ((TelephonyManager) context.getSystemService("phone")).getSimOperator();
            if (TextUtils.isEmpty(simOperator)) {
                return null;
            }
            String strSubstring = simOperator.substring(0, Math.min(3, simOperator.length()));
            String strSubstring2 = simOperator.substring(Math.min(3, simOperator.length()));
            HashMap map = new HashMap();
            map.put("mcc", strSubstring);
            map.put("mnc", strSubstring2);
            return map;
        } catch (Exception e) {
            C13219q0.m37817b(f34051a, e.getMessage(), e);
            return null;
        }
    }

    /* JADX INFO: renamed from: k */
    public String m35292k(Context context) {
        if (context == null) {
            return "";
        }
        try {
            return String.valueOf(Settings.System.getInt(context.getContentResolver(), "screen_brightness"));
        } catch (Exception unused) {
            return "0";
        }
    }

    /* JADX INFO: renamed from: m */
    public int m35295m(Context context) {
        if (context == null) {
            return 0;
        }
        try {
            return (context.getResources() == null || context.getResources().getConfiguration() == null || (context.getResources().getConfiguration().screenLayout & 15) < 3) ? 0 : 1;
        } catch (Throwable th) {
            C13219q0.m37817b(f34051a, th.getMessage(), th);
            return 0;
        }
    }

    /* JADX INFO: renamed from: n */
    public int m35298n(Context context) {
        return C13229v0.m37915c(context, "com.tencent.mm") ? 1 : 0;
    }

    /* JADX INFO: renamed from: o */
    public int m35299o() {
        return C13229v0.m37932g() ? 1 : 0;
    }

    /* JADX INFO: renamed from: f */
    public int m35281f(Context context) {
        if (context == null) {
            return 0;
        }
        try {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            Integer num = m35284g(context).get("height");
            return num == null ? displayMetrics.heightPixels : num.intValue();
        } catch (Exception e) {
            C13219q0.m37817b(f34051a, e.getMessage(), e);
            return 0;
        }
    }

    /* JADX INFO: renamed from: g */
    public HashMap<String, Integer> m35284g(Context context) {
        HashMap<String, Integer> map = new HashMap<>();
        if (context != null) {
            try {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                if (context instanceof Activity) {
                    ((Activity) context).getWindowManager().getDefaultDisplay().getRealMetrics(displayMetrics);
                } else {
                    ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRealMetrics(displayMetrics);
                }
                map.put("height", Integer.valueOf(displayMetrics.heightPixels));
                map.put("width", Integer.valueOf(displayMetrics.widthPixels));
                return map;
            } catch (Exception e) {
                C13219q0.m37817b(f34051a, e.getMessage(), e);
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: h */
    public int m35286h(Context context) {
        if (context == null) {
            return 0;
        }
        try {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            Integer num = m35284g(context).get("width");
            return num == null ? displayMetrics.widthPixels : num.intValue();
        } catch (Exception e) {
            C13219q0.m37817b(f34051a, e.getMessage(), e);
            return 0;
        }
    }

    /* JADX INFO: renamed from: j */
    public int m35289j() {
        try {
            return Settings.Secure.getInt(C13008c.m36588n().m36542d().getContentResolver(), "install_non_market_apps", 0);
        } catch (Throwable th) {
            C13219q0.m37817b(f34051a, th.getMessage(), th);
            return 0;
        }
    }

    /* JADX INFO: renamed from: n */
    public int m35297n() {
        try {
            return GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(C13008c.m36588n().m36542d());
        } catch (Throwable th) {
            C13219q0.m37817b(f34051a, th.getMessage(), th);
            return -1;
        }
    }

    /* JADX INFO: renamed from: e */
    public String m35279e(Context context) {
        try {
            return ((TelephonyManager) context.getSystemService("phone")).getSimOperatorName();
        } catch (Exception e) {
            C13219q0.m37817b(f34051a, e.getMessage(), e);
            return "";
        }
    }

    /* JADX INFO: renamed from: a */
    public String m35272a(Context context, String str) {
        try {
            return (TextUtils.isEmpty(str) || context == null) ? "" : context.getPackageManager().getInstallerPackageName(str);
        } catch (Exception e) {
            C13219q0.m37817b(f34051a, e.getMessage(), e);
            return "";
        }
    }

    /* JADX INFO: renamed from: b */
    public long m35274b() {
        try {
            return System.currentTimeMillis() - SystemClock.elapsedRealtime();
        } catch (Exception unused) {
            return 0L;
        }
    }

    /* JADX INFO: renamed from: c */
    public String m35276c() {
        String str;
        String string;
        JSONObject jSONObject = new JSONObject();
        try {
            Class<?> cls = Class.forName("com.huawei.system.BuildEx");
            str = (String) cls.getMethod("getOsBrand", null).invoke(cls, null);
        } catch (Throwable th) {
            C13219q0.m37816b(f34051a, th.getMessage());
            str = null;
        }
        try {
            if (!TextUtils.isEmpty(str) && str.equals("harmony")) {
                jSONObject.put("osType", str);
                try {
                    Class<?> cls2 = Class.forName("ohos.system.version.SystemVersion");
                    jSONObject.put("version", (String) cls2.getMethod("getVersion", null).invoke(cls2, null));
                } catch (Throwable th2) {
                    C13219q0.m37816b(f34051a, th2.getMessage());
                }
                try {
                    jSONObject.put("pure_state", Settings.Secure.getInt(C13008c.m36588n().m36542d().getContentResolver(), "pure_mode_state", -1));
                } catch (Throwable th3) {
                    C13219q0.m37816b(f34051a, th3.getMessage());
                }
                string = jSONObject.toString();
                if (!TextUtils.isEmpty(string)) {
                    string = C13207k0.m37713b(string);
                }
            } else {
                string = "android";
            }
            return string;
        } catch (Throwable th4) {
            C13219q0.m37816b(f34051a, th4.getMessage());
            return null;
        }
    }

    /* JADX INFO: renamed from: l */
    public String m35294l(Context context) {
        String string;
        if (context == null) {
            return "";
        }
        try {
            string = Settings.System.getString(context.getContentResolver(), "time_12_24");
        } catch (Throwable th) {
            C13219q0.m37817b(f34051a, th.getMessage(), th);
            string = "";
        }
        return TextUtils.isEmpty(string) ? "" : string;
    }

    /* JADX INFO: renamed from: d */
    public String m35278d(Context context) {
        if (context == null) {
            return "";
        }
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (Exception e) {
            C13219q0.m37817b(f34051a, e.getMessage(), e);
            return "";
        }
    }

    /* JADX INFO: renamed from: e */
    public Map<String, Object> m35280e() {
        try {
            Context contextM36542d = C13008c.m36588n().m36542d();
            if (contextM36542d == null) {
                return null;
            }
            ActivityManager activityManager = (ActivityManager) contextM36542d.getSystemService("activity");
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            long j = memoryInfo.totalMem;
            long j2 = memoryInfo.availMem;
            HashMap map = new HashMap();
            map.put("totalMem", Long.valueOf((j / 1024) / 1024));
            map.put(C11540L6.f25022w, Long.valueOf((j2 / 1024) / 1024));
            return map;
        } catch (Throwable th) {
            C13219q0.m37817b(f34051a, th.getMessage(), th);
            return null;
        }
    }

    /* JADX INFO: renamed from: k */
    public int m35291k() {
        return C13229v0.m37923e();
    }

    /* JADX INFO: renamed from: m */
    public HashMap<String, Object> m35296m() {
        HashMap<String, Object> map = new HashMap<>();
        try {
            Context contextM36542d = C13008c.m36588n().m36542d();
            if (contextM36542d == null) {
                map.put("available", 0);
                return map;
            }
            PackageManager packageManager = contextM36542d.getPackageManager();
            if (packageManager == null) {
                map.put("available", 0);
                return map;
            }
            boolean z = packageManager.getApplicationInfo("com.android.vending", 0).enabled;
            PackageInfo packageInfo = packageManager.getPackageInfo("com.android.vending", 0);
            map.put("available", Integer.valueOf(z ? 1 : 2));
            map.put("versionName", packageInfo.versionName);
            map.put("versionCode", Integer.valueOf(packageInfo.versionCode));
            return map;
        } catch (Throwable th) {
            C13219q0.m37817b(f34051a, th.getMessage(), th);
            return map;
        }
    }

    /* JADX INFO: renamed from: a */
    public String m35271a(Context context) {
        Locale locale;
        if (context != null) {
            try {
                if (context.getResources() != null && context.getResources().getConfiguration() != null && (locale = context.getResources().getConfiguration().locale) != null) {
                    return locale.toLanguageTag();
                }
            } catch (Throwable th) {
                C13219q0.m37814a(f34051a, th.getMessage(), th);
            }
        }
        return "en-US";
    }

    /* JADX INFO: renamed from: j */
    public int m35290j(Context context) {
        Configuration configuration;
        if (context != null) {
            try {
                return (context.getResources() == null || (configuration = context.getResources().getConfiguration()) == null || configuration.orientation != 2) ? 1 : 2;
            } catch (Throwable th) {
                C13219q0.m37817b(f34051a, th.getMessage(), th);
            }
        }
        return 1;
    }

    /* JADX INFO: renamed from: l */
    public int m35293l() {
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

    /* JADX INFO: renamed from: i */
    public String m35287i() {
        try {
            return Arrays.asList(Build.SUPPORTED_ABIS).toString();
        } catch (Throwable th) {
            C13219q0.m37817b(f34051a, th.getMessage(), th);
            return "";
        }
    }

    /* JADX INFO: renamed from: a */
    public int m35269a(String str) {
        return C13229v0.m37928f(str);
    }
}
