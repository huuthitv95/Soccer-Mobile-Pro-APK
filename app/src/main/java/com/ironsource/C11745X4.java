package com.ironsource;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.media.AudioManager;
import android.os.Build;
import android.os.Environment;
import android.os.PowerManager;
import android.os.StatFs;
import android.provider.Settings;
import android.support.v4.media.session.PlaybackStateCompat;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import android.webkit.WebSettings;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.logger.IronLog;
import java.io.File;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.UUID;

/* JADX INFO: renamed from: com.ironsource.X4 */
/* JADX INFO: loaded from: classes6.dex */
public class C11745X4 implements InterfaceC12582w7, InterfaceC12582w7.a {

    /* JADX INFO: renamed from: A */
    private static final String f26479A = "browser_user_agent";

    /* JADX INFO: renamed from: B */
    private static final String f26480B = "browser_user_agent_time";

    /* JADX INFO: renamed from: C */
    private static final String f26481C = "IABTCF_gdprApplies";

    /* JADX INFO: renamed from: D */
    private static final String f26482D = "IABTCF_TCString";

    /* JADX INFO: renamed from: E */
    private static final String f26483E = "IABTCF_AddtlConsent";

    /* JADX INFO: renamed from: j */
    private static final String f26484j = "android";

    /* JADX INFO: renamed from: k */
    private static final String f26485k = "com.google.android.gms.permission.AD_ID";

    /* JADX INFO: renamed from: l */
    private static final String f26486l = "com.google.android.gms.ads.identifier.AdvertisingIdClient";

    /* JADX INFO: renamed from: m */
    private static final String f26487m = "com.google.android.gms.appset.AppSet";

    /* JADX INFO: renamed from: n */
    private static final String f26488n = "com.google.android.gms.tasks.OnSuccessListener";

    /* JADX INFO: renamed from: o */
    private static final String f26489o = "getAdvertisingIdInfo";

    /* JADX INFO: renamed from: p */
    private static final String f26490p = "getClient";

    /* JADX INFO: renamed from: q */
    private static final String f26491q = "getAppSetIdInfo";

    /* JADX INFO: renamed from: r */
    private static final String f26492r = "addOnSuccessListener";

    /* JADX INFO: renamed from: s */
    private static final String f26493s = "getId";

    /* JADX INFO: renamed from: t */
    private static final String f26494t = "isLimitAdTrackingEnabled";

    /* JADX INFO: renamed from: u */
    private static final String f26495u = "Mediation_Shared_Preferences";

    /* JADX INFO: renamed from: v */
    private static final String f26496v = "supersonic_shared_preferen";

    /* JADX INFO: renamed from: w */
    private static final String f26497w = "cachedUUID";

    /* JADX INFO: renamed from: x */
    private static final String f26498x = "auid";

    /* JADX INFO: renamed from: y */
    private static final String f26499y = "unityads-installinfo";

    /* JADX INFO: renamed from: z */
    private static final String f26500z = "unityads-idfi";

    /* JADX INFO: renamed from: b */
    private String f26501b = null;

    /* JADX INFO: renamed from: c */
    private String f26502c = null;

    /* JADX INFO: renamed from: d */
    private String f26503d = null;

    /* JADX INFO: renamed from: e */
    private String f26504e = "";

    /* JADX INFO: renamed from: f */
    private boolean f26505f = false;

    /* JADX INFO: renamed from: g */
    private String f26506g = "";

    /* JADX INFO: renamed from: h */
    private volatile String f26507h;

    /* JADX INFO: renamed from: i */
    private volatile String f26508i;

    /* JADX INFO: renamed from: com.ironsource.X4$a */
    class a implements InvocationHandler {
        a() {
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            Object obj2;
            if (objArr != null) {
                try {
                    if (objArr.length > 0 && (obj2 = objArr[0]) != null) {
                        String string = obj2.getClass().getMethod(C11745X4.f26493s, null).invoke(objArr[0], null).toString();
                        if (!TextUtils.isEmpty(string)) {
                            C11745X4.this.f26506g = string;
                        }
                    }
                } catch (Exception e) {
                    C12317m4.m32153d().m32155a(e);
                }
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: O */
    private String m27859O(Context context) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException {
        Object objM27861Q = m27861Q(context);
        return objM27861Q.getClass().getMethod(f26493s, null).invoke(objM27861Q, null).toString();
    }

    /* JADX INFO: renamed from: P */
    private void m27860P(Context context) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException {
        Class<?> cls = Class.forName(f26487m);
        Object objInvoke = cls.getMethod(f26490p, Context.class).invoke(cls, context);
        Object objInvoke2 = objInvoke.getClass().getMethod(f26491q, null).invoke(objInvoke, null);
        Class<?> cls2 = Class.forName(f26488n);
        objInvoke2.getClass().getMethod(f26492r, cls2).invoke(objInvoke2, Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), new Class[]{cls2}, new a()));
    }

    /* JADX INFO: renamed from: Q */
    private Object m27861Q(Context context) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException {
        Class<?> cls = Class.forName(f26486l);
        return cls.getMethod(f26489o, Context.class).invoke(cls, context);
    }

    /* JADX INFO: renamed from: R */
    private String m27862R(Context context) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException {
        Object objM27861Q = m27861Q(context);
        return String.valueOf(((Boolean) objM27861Q.getClass().getMethod("isLimitAdTrackingEnabled", null).invoke(objM27861Q, null)).booleanValue());
    }

    /* JADX INFO: renamed from: S */
    private String m27863S(Context context) {
        try {
            return C12114ba.m31191a(context, f26495u, f26479A, "");
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.INTERNAL.error(e.toString());
            return "";
        }
    }

    /* JADX INFO: renamed from: T */
    private long m27864T(Context context) {
        try {
            return Long.parseLong(C12114ba.m31191a(context, f26495u, f26480B, String.valueOf(-1L)));
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.INTERNAL.error(e.toString());
            return -1L;
        }
    }

    @Override // com.ironsource.InterfaceC12582w7
    /* JADX INFO: renamed from: A */
    public int mo27869A(Context context) {
        return context.getResources().getConfiguration().orientation;
    }

    @Override // com.ironsource.InterfaceC12582w7
    /* JADX INFO: renamed from: B */
    public String mo27870B(Context context) {
        return context.getResources().getConfiguration().locale.getCountry();
    }

    @Override // com.ironsource.InterfaceC12582w7
    /* JADX INFO: renamed from: C */
    public File mo27871C(Context context) {
        return context.getCacheDir();
    }

    @Override // com.ironsource.InterfaceC12582w7
    /* JADX INFO: renamed from: D */
    public boolean mo27872D(Context context) {
        Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        int intExtra = intentRegisterReceiver != null ? intentRegisterReceiver.getIntExtra("status", -1) : -1;
        return intExtra == 2 || intExtra == 5;
    }

    @Override // com.ironsource.InterfaceC12582w7
    /* JADX INFO: renamed from: E */
    public int mo27873E(Context context) {
        Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver != null) {
            return intentRegisterReceiver.getIntExtra("plugged", -1);
        }
        return -1;
    }

    @Override // com.ironsource.InterfaceC12582w7
    /* JADX INFO: renamed from: F */
    public float mo27874F(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        try {
            return audioManager.getStreamVolume(3) / audioManager.getStreamMaxVolume(3);
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.INTERNAL.error(e.toString());
            return -1.0f;
        }
    }

    @Override // com.ironsource.InterfaceC12582w7
    /* JADX INFO: renamed from: G */
    public String mo27875G(Context context) {
        try {
            return C12114ba.m31190a(context, f26483E, (String) null);
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            return null;
        }
    }

    @Override // com.ironsource.InterfaceC12582w7
    /* JADX INFO: renamed from: H */
    public String mo27876H(Context context) {
        TelephonyManager telephonyManager;
        return (context == null || (telephonyManager = (TelephonyManager) context.getSystemService("phone")) == null) ? "" : telephonyManager.getNetworkCountryIso();
    }

    @Override // com.ironsource.InterfaceC12582w7
    /* JADX INFO: renamed from: I */
    public List<ApplicationInfo> mo27877I(Context context) {
        return context.getPackageManager().getInstalledApplications(0);
    }

    @Override // com.ironsource.InterfaceC12582w7
    /* JADX INFO: renamed from: J */
    public String mo27878J(Context context) {
        C11694U4 c11694u4 = C11694U4.f25873a;
        if (c11694u4.m27585b()) {
            try {
                if (!c11694u4.m27583a()) {
                    return m27859O(context);
                }
                if (this.f26508i != null) {
                    return this.f26508i;
                }
                String strM27859O = m27859O(context);
                if (!TextUtils.isEmpty(strM27859O)) {
                    this.f26508i = strM27859O;
                }
                return strM27859O;
            } catch (Exception e) {
                C12317m4.m32153d().m32155a(e);
            }
        }
        return null;
    }

    @Override // com.ironsource.InterfaceC12582w7
    /* JADX INFO: renamed from: L */
    public int mo27880L(Context context) {
        return ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation();
    }

    @Override // com.ironsource.InterfaceC12582w7
    /* JADX INFO: renamed from: M */
    public String mo27881M(Context context) {
        try {
            ResolveInfo resolveInfoResolveActivity = context.getPackageManager().resolveActivity(new Intent("android.intent.action.MAIN").addCategory("android.intent.category.HOME"), 65536);
            if (resolveInfoResolveActivity != null) {
                return resolveInfoResolveActivity.activityInfo.packageName;
            }
            return null;
        } catch (Throwable th) {
            C12317m4.m32153d().m32155a(th);
            return null;
        }
    }

    @Override // com.ironsource.InterfaceC12582w7
    /* JADX INFO: renamed from: N */
    public int mo27882N(Context context) {
        if (context instanceof Activity) {
            return ((Activity) context).getRequestedOrientation();
        }
        return -1;
    }

    @Override // com.ironsource.InterfaceC12582w7
    /* JADX INFO: renamed from: a */
    public long mo27883a() {
        return Calendar.getInstance(TimeZone.getDefault()).getTime().getTime();
    }

    @Override // com.ironsource.InterfaceC12582w7
    /* JADX INFO: renamed from: b */
    public boolean mo27891b(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            if (displayMetrics.widthPixels / displayMetrics.density >= 600.0f) {
                return true;
            }
        }
        return false;
    }

    @Override // com.ironsource.InterfaceC12582w7
    /* JADX INFO: renamed from: c */
    public Long mo27893c(ActivityManager.MemoryInfo memoryInfo) {
        if (memoryInfo == null) {
            return null;
        }
        return Long.valueOf(memoryInfo.availMem);
    }

    @Override // com.ironsource.InterfaceC12582w7
    /* JADX INFO: renamed from: d */
    public String mo27895d() {
        String id = TimeZone.getDefault().getID();
        return id != null ? id : "";
    }

    @Override // com.ironsource.InterfaceC12582w7
    /* JADX INFO: renamed from: e */
    public int mo27897e() {
        return Build.VERSION.SDK_INT;
    }

    @Override // com.ironsource.InterfaceC12582w7
    /* JADX INFO: renamed from: f */
    public boolean mo27900f(Context context) {
        try {
            return Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0;
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.INTERNAL.error(e.toString());
            return false;
        }
    }

    @Override // com.ironsource.InterfaceC12582w7
    /* JADX INFO: renamed from: g */
    public File mo27902g(Context context) {
        return context.getExternalFilesDir(null);
    }

    @Override // com.ironsource.InterfaceC12582w7
    /* JADX INFO: renamed from: h */
    public long mo27903h() {
        return m27865a(Environment.getDataDirectory());
    }

    @Override // com.ironsource.InterfaceC12582w7
    /* JADX INFO: renamed from: i */
    public boolean mo27906i(Context context) {
        try {
            return Settings.Global.getInt(context.getContentResolver(), "stay_on_while_plugged_in", 0) != 0;
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.INTERNAL.error(e.toString());
            return false;
        }
    }

    @Override // com.ironsource.InterfaceC12582w7
    /* JADX INFO: renamed from: j */
    public boolean mo27908j() {
        try {
            return "mounted".equals(Environment.getExternalStorageState()) && Environment.isExternalStorageRemovable();
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            return false;
        }
    }

    @Override // com.ironsource.InterfaceC12582w7
    /* JADX INFO: renamed from: k */
    public int mo27909k() {
        return Resources.getSystem().getDisplayMetrics().widthPixels;
    }

    @Override // com.ironsource.InterfaceC12582w7
    /* JADX INFO: renamed from: l */
    public String mo27912l() {
        return Build.MODEL;
    }

    @Override // com.ironsource.InterfaceC12582w7
    /* JADX INFO: renamed from: m */
    public int mo27913m() {
        return -(TimeZone.getDefault().getOffset(mo27883a()) / 60000);
    }

    @Override // com.ironsource.InterfaceC12582w7
    /* JADX INFO: renamed from: n */
    public String mo27915n(Context context) {
        if (context == null) {
            return "";
        }
        int iMo27882N = mo27882N(context);
        if (iMo27882N == 0) {
            return C11744X3.i.f26320C;
        }
        if (iMo27882N == 1) {
            return C11744X3.i.f26322D;
        }
        if (iMo27882N == 11) {
            return C11744X3.i.f26320C;
        }
        if (iMo27882N == 12) {
            return C11744X3.i.f26322D;
        }
        switch (iMo27882N) {
            case 6:
            case 8:
                return C11744X3.i.f26320C;
            case 7:
            case 9:
                return C11744X3.i.f26322D;
            default:
                return "none";
        }
    }

    @Override // com.ironsource.InterfaceC12582w7
    /* JADX INFO: renamed from: o */
    public ActivityManager.MemoryInfo mo27918o(Context context) {
        if (context == null || !C11455Gb.m25891U().mo25846h().mo32177d()) {
            return null;
        }
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        if (activityManager == null) {
            return null;
        }
        activityManager.getMemoryInfo(memoryInfo);
        return memoryInfo;
    }

    @Override // com.ironsource.InterfaceC12582w7
    /* JADX INFO: renamed from: p */
    public boolean mo27920p() {
        return m27868b("su");
    }

    @Override // com.ironsource.InterfaceC12582w7
    /* JADX INFO: renamed from: q */
    public String mo27921q() {
        return Build.MANUFACTURER;
    }

    @Override // com.ironsource.InterfaceC12582w7
    /* JADX INFO: renamed from: r */
    public long mo27924r(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        if (activityManager == null) {
            return -1L;
        }
        activityManager.getMemoryInfo(memoryInfo);
        return memoryInfo.totalMem;
    }

    @Override // com.ironsource.InterfaceC12582w7
    /* JADX INFO: renamed from: s */
    public String mo27926s(Context context) {
        return mo27891b(context) ? "Tablet" : "Phone";
    }

    @Override // com.ironsource.InterfaceC12582w7
    /* JADX INFO: renamed from: t */
    public String mo27928t() {
        try {
            return System.getProperty("os.arch");
        } catch (SecurityException e) {
            IronLog.INTERNAL.error(e.getMessage());
            return null;
        }
    }

    @Override // com.ironsource.InterfaceC12582w7
    /* JADX INFO: renamed from: u */
    public int mo27929u(Context context) {
        if (context != null) {
            return Settings.System.getInt(context.getContentResolver(), "screen_brightness", -1);
        }
        return -1;
    }

    @Override // com.ironsource.InterfaceC12582w7
    /* JADX INFO: renamed from: v */
    public String mo27930v(Context context) {
        TelephonyManager telephonyManager;
        return (context == null || (telephonyManager = (TelephonyManager) context.getSystemService("phone")) == null) ? "" : telephonyManager.getNetworkOperatorName();
    }

    @Override // com.ironsource.InterfaceC12582w7
    /* JADX INFO: renamed from: w */
    public String mo27931w(Context context) {
        try {
            return C12114ba.m31190a(context, "IABTCF_TCString", (String) null);
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            return null;
        }
    }

    @Override // com.ironsource.InterfaceC12582w7
    /* JADX INFO: renamed from: x */
    public boolean mo27932x(Context context) {
        return Settings.System.getInt(context.getContentResolver(), "accelerometer_rotation", 0) != 1;
    }

    @Override // com.ironsource.InterfaceC12582w7
    /* JADX INFO: renamed from: y */
    public String mo27933y(Context context) {
        return Locale.getDefault().toString();
    }

    @Override // com.ironsource.InterfaceC12582w7
    /* JADX INFO: renamed from: K */
    public boolean mo27879K(Context context) {
        try {
            return ((PowerManager) context.getSystemService("power")).isPowerSaveMode();
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.INTERNAL.error(e.toString());
            return false;
        }
    }

    @Override // com.ironsource.InterfaceC12582w7
    /* JADX INFO: renamed from: c */
    public int mo27892c() {
        return Resources.getSystem().getDisplayMetrics().heightPixels;
    }

    @Override // com.ironsource.InterfaceC12582w7
    /* JADX INFO: renamed from: e */
    public synchronized String mo27898e(Context context) {
        if (!TextUtils.isEmpty(this.f26502c)) {
            return this.f26502c;
        }
        if (context == null) {
            return "";
        }
        String strM31191a = C12114ba.m31191a(context, "supersonic_shared_preferen", "auid", "");
        this.f26502c = strM31191a;
        if (TextUtils.isEmpty(strM31191a)) {
            String string = UUID.randomUUID().toString();
            this.f26502c = string;
            C12114ba.m31193b(context, "supersonic_shared_preferen", "auid", string);
        }
        return this.f26502c;
    }

    @Override // com.ironsource.InterfaceC12582w7
    /* JADX INFO: renamed from: g */
    public long mo27901g() {
        if (mo27908j()) {
            return m27865a(Environment.getExternalStorageDirectory());
        }
        return 0L;
    }

    @Override // com.ironsource.InterfaceC12582w7
    /* JADX INFO: renamed from: l */
    public int mo27911l(Context context) {
        try {
            Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            int intExtra = intentRegisterReceiver != null ? intentRegisterReceiver.getIntExtra("level", -1) : 0;
            int intExtra2 = intentRegisterReceiver != null ? intentRegisterReceiver.getIntExtra("scale", -1) : 0;
            if (intExtra != -1 && intExtra2 != -1) {
                return (int) ((intExtra / intExtra2) * 100.0f);
            }
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.INTERNAL.error(e.toString());
        }
        return -1;
    }

    @Override // com.ironsource.InterfaceC12582w7
    /* JADX INFO: renamed from: m */
    public File mo27914m(Context context) {
        return context.getExternalCacheDir();
    }

    @Override // com.ironsource.InterfaceC12582w7
    /* JADX INFO: renamed from: p */
    public int mo27919p(Context context) {
        int iMo27880L = mo27880L(context);
        int iMo27869A = mo27869A(context);
        return (((iMo27880L == 0 || iMo27880L == 2) && iMo27869A == 2) || ((iMo27880L == 1 || iMo27880L == 3) && iMo27869A == 1)) ? 2 : 1;
    }

    @Override // com.ironsource.InterfaceC12582w7
    /* JADX INFO: renamed from: q */
    public boolean mo27922q(Context context) {
        return context.getResources().getConfiguration().getLayoutDirection() == 1;
    }

    @Override // com.ironsource.InterfaceC12582w7
    /* JADX INFO: renamed from: d */
    public String mo27896d(Context context) {
        return context.getResources().getConfiguration().locale.getLanguage();
    }

    @Override // com.ironsource.InterfaceC12582w7
    /* JADX INFO: renamed from: h */
    public boolean mo27904h(Context context) {
        try {
            for (String str : context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions) {
                if (str.equalsIgnoreCase(f26485k)) {
                    return true;
                }
            }
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
        }
        return false;
    }

    @Override // com.ironsource.InterfaceC12582w7
    /* JADX INFO: renamed from: k */
    public File mo27910k(Context context) {
        return context.getFilesDir();
    }

    @Override // com.ironsource.InterfaceC12582w7
    /* JADX INFO: renamed from: z */
    public String mo27934z(Context context) {
        if (!C11694U4.f25873a.m27587c()) {
            return "";
        }
        try {
            m27860P(context);
            return !TextUtils.isEmpty(this.f26506g) ? this.f26506g : "";
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            return "";
        }
    }

    @Override // com.ironsource.InterfaceC12582w7
    /* JADX INFO: renamed from: c */
    public String mo27894c(Context context) {
        try {
            if (C11694U4.f25873a.m27583a()) {
                if (this.f26507h == null) {
                    String strM27862R = m27862R(context);
                    if (!TextUtils.isEmpty(strM27862R)) {
                        this.f26507h = strM27862R;
                    }
                    return strM27862R;
                }
                return this.f26507h;
            }
            return m27862R(context);
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            return null;
        }
    }

    @Override // com.ironsource.InterfaceC12582w7
    /* JADX INFO: renamed from: t */
    public int mo27927t(Context context) {
        try {
            return C12114ba.m31187a(context, "IABTCF_gdprApplies", -1);
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            return -1;
        }
    }

    /* JADX INFO: renamed from: a */
    private long m27865a(File file) {
        StatFs statFs = new StatFs(file.getPath());
        return (statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong()) / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
    }

    @Override // com.ironsource.InterfaceC12582w7
    /* JADX INFO: renamed from: b */
    public Boolean mo27890b(ActivityManager.MemoryInfo memoryInfo) {
        if (memoryInfo == null) {
            return null;
        }
        return Boolean.valueOf(memoryInfo.lowMemory);
    }

    @Override // com.ironsource.InterfaceC12582w7
    /* JADX INFO: renamed from: f */
    public String mo27899f() {
        return "android";
    }

    @Override // com.ironsource.InterfaceC12582w7
    /* JADX INFO: renamed from: r */
    public float mo27923r() {
        return Resources.getSystem().getDisplayMetrics().density;
    }

    /* JADX INFO: renamed from: b */
    private boolean m27868b(String str) {
        try {
            String[] strArr = {"/sbin/", "/system/bin/", "/system/xbin/", "/data/local/xbin/", "/data/local/bin/", "/system/sd/xbin/", "/system/bin/failsafe/", "/data/local/"};
            for (int i = 0; i < 8; i++) {
                if (new File(strArr[i] + str).exists()) {
                    return true;
                }
            }
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
        }
        return false;
    }

    @Override // com.ironsource.InterfaceC12582w7
    /* JADX INFO: renamed from: o */
    public int mo27917o() {
        return mo27909k();
    }

    @Override // com.ironsource.InterfaceC12582w7
    /* JADX INFO: renamed from: s */
    public String mo27925s() {
        try {
            if (this.f26504e.isEmpty()) {
                return m27863S(ContextProvider.getInstance().getApplicationContext());
            }
            return this.f26504e;
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            return "";
        }
    }

    @Override // com.ironsource.InterfaceC12582w7
    /* JADX INFO: renamed from: i */
    public String mo27905i() {
        return Build.VERSION.RELEASE;
    }

    @Override // com.ironsource.InterfaceC12582w7
    /* JADX INFO: renamed from: j */
    public String mo27907j(Context context) {
        if (!TextUtils.isEmpty(this.f26503d)) {
            return this.f26503d;
        }
        if (context == null) {
            return null;
        }
        String strM31191a = C12114ba.m31191a(context, "unityads-installinfo", "unityads-idfi", (String) null);
        this.f26503d = strM31191a;
        return strM31191a;
    }

    @Override // com.ironsource.InterfaceC12582w7
    /* JADX INFO: renamed from: a */
    public Long mo27885a(ActivityManager.MemoryInfo memoryInfo) {
        if (memoryInfo == null) {
            return null;
        }
        return Long.valueOf(memoryInfo.threshold);
    }

    @Override // com.ironsource.InterfaceC12582w7
    /* JADX INFO: renamed from: a */
    public long mo27884a(String str) {
        return m27865a(new File(str));
    }

    @Override // com.ironsource.InterfaceC12582w7
    /* JADX INFO: renamed from: a */
    public boolean mo27888a(Activity activity) {
        int systemUiVisibility = activity.getWindow().getDecorView().getSystemUiVisibility();
        return (systemUiVisibility | 4096) == systemUiVisibility || (systemUiVisibility | 2048) == systemUiVisibility;
    }

    @Override // com.ironsource.InterfaceC12582w7
    /* JADX INFO: renamed from: a */
    public synchronized String mo27886a(Context context) {
        if (!TextUtils.isEmpty(this.f26501b)) {
            return this.f26501b;
        }
        if (C12114ba.m31192a(context, f26495u, InterfaceC12582w7.f32700a, true)) {
            String strM31191a = C12114ba.m31191a(context, f26495u, f26497w, "");
            if (TextUtils.isEmpty(strM31191a)) {
                String string = UUID.randomUUID().toString();
                this.f26501b = string;
                C12114ba.m31193b(context, f26495u, f26497w, string);
            } else {
                this.f26501b = strM31191a;
            }
        }
        return this.f26501b;
    }

    @Override // com.ironsource.InterfaceC12582w7
    /* JADX INFO: renamed from: n */
    public boolean mo27916n() {
        return this.f26505f;
    }

    @Override // com.ironsource.InterfaceC12582w7
    /* JADX INFO: renamed from: b */
    public int mo27889b() {
        return mo27892c();
    }

    /* JADX INFO: renamed from: b */
    private void m27867b(Context context, long j) {
        try {
            C12114ba.m31193b(context, f26495u, f26480B, String.valueOf(j));
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    @Override // com.ironsource.InterfaceC12582w7.a
    /* JADX INFO: renamed from: a */
    public void mo27887a(Context context, long j) {
        if (context != null) {
            if (!new C12138cg(new InterfaceC12400o4.a()).m31277a(m27864T(context), j)) {
                String strM27863S = m27863S(context);
                this.f26504e = strM27863S;
                this.f26505f = !strM27863S.isEmpty();
            }
            if (this.f26504e.isEmpty()) {
                try {
                    String defaultUserAgent = WebSettings.getDefaultUserAgent(context);
                    this.f26504e = defaultUserAgent;
                    m27866a(context, defaultUserAgent);
                    if (j > 0) {
                        m27867b(context, System.currentTimeMillis());
                    }
                } catch (Exception e) {
                    C12317m4.m32153d().m32155a(e);
                    IronLog.INTERNAL.error(e.toString());
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m27866a(Context context, String str) {
        try {
            C12114ba.m31193b(context, f26495u, f26479A, str);
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }
}
