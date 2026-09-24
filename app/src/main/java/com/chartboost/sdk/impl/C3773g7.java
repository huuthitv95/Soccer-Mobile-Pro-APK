package com.chartboost.sdk.impl;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.LocaleList;
import com.ironsource.C11744X3;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.g7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3773g7 {

    /* JADX INFO: renamed from: b */
    public static boolean f14287b;

    /* JADX INFO: renamed from: c */
    public static Application f14288c;

    /* JADX INFO: renamed from: d */
    public static C4021r6 f14289d;

    /* JADX INFO: renamed from: a */
    public static final C3773g7 f14286a = new C3773g7();

    /* JADX INFO: renamed from: e */
    public static String f14290e = "not available";

    /* JADX INFO: renamed from: f */
    public static String f14291f = "not available";

    /* JADX INFO: renamed from: g */
    public static String f14292g = "not available";

    /* JADX INFO: renamed from: h */
    public static String f14293h = "not available";

    /* JADX INFO: renamed from: i */
    public static String f14294i = "not available";

    /* JADX INFO: renamed from: j */
    public static String f14295j = "not available";

    /* JADX INFO: renamed from: k */
    public static String f14296k = "not available";

    /* JADX INFO: renamed from: l */
    public static String f14297l = "not available";

    /* JADX INFO: renamed from: m */
    public static String f14298m = "unknown";

    /* JADX INFO: renamed from: a */
    public final String m17772a(Context context) {
        try {
            PackageManager packageManager = context.getPackageManager();
            String packageName = context.getPackageName();
            if (packageManager != null && packageName != null) {
                PackageInfo packageInfo = Build.VERSION.SDK_INT >= 33 ? packageManager.getPackageInfo(packageName, PackageManager.PackageInfoFlags.of(0L)) : packageManager.getPackageInfo(packageName, 0);
                if (packageInfo != null) {
                    return packageInfo.versionName;
                }
            }
            return null;
        } catch (Exception e) {
            C4048sb.m19411b("Exception while retrieving appVersion: " + e.getMessage(), (Throwable) null, 2, (Object) null);
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m17773a() {
        if (f14287b) {
            return;
        }
        C4048sb.m19411b("EnvironmentManager not initialized. Call init() first.", (Throwable) null, 2, (Object) null);
    }

    /* JADX INFO: renamed from: a */
    public final void m17774a(Application app, C4021r6 dm) {
        Intrinsics.checkNotNullParameter(app, "app");
        Intrinsics.checkNotNullParameter(dm, "dm");
        if (f14287b) {
            return;
        }
        f14288c = app;
        f14289d = dm;
        try {
            String MANUFACTURER = Build.MANUFACTURER;
            Intrinsics.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
            f14290e = MANUFACTURER;
            String MODEL = Build.MODEL;
            Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
            f14291f = MODEL;
            f14292g = "Android " + Build.VERSION.RELEASE;
            f14293h = m17787n() ? "Amazon" : C11744X3.f26142d;
            String country = Locale.getDefault().getCountry();
            if (country == null) {
                country = "Cannot retrieve country";
            }
            f14294i = country;
            String strM17786m = m17786m();
            if (strM17786m == null) {
                strM17786m = "Cannot retrieve language";
            }
            f14295j = strM17786m;
            f14297l = C3907m3.m18627a();
            String strM17772a = m17772a(app);
            if (strM17772a == null) {
                strM17772a = "Unknown version";
            }
            f14296k = strM17772a;
        } catch (Exception e) {
            C4048sb.m19410b("Failed to initialize EnvironmentManager", e);
        }
        f14287b = true;
    }

    /* JADX INFO: renamed from: b */
    public final String m17775b() {
        m17773a();
        return f14296k;
    }

    /* JADX INFO: renamed from: c */
    public final Application m17776c() {
        return f14288c;
    }

    /* JADX INFO: renamed from: d */
    public final String m17777d() {
        m17773a();
        return f14294i;
    }

    /* JADX INFO: renamed from: e */
    public final String m17778e() {
        m17773a();
        return f14298m;
    }

    /* JADX INFO: renamed from: f */
    public final String m17779f() {
        m17773a();
        return f14295j;
    }

    /* JADX INFO: renamed from: g */
    public final String m17780g() {
        m17773a();
        return f14290e;
    }

    /* JADX INFO: renamed from: h */
    public final String m17781h() {
        m17773a();
        return f14291f;
    }

    /* JADX INFO: renamed from: i */
    public final String m17782i() {
        m17773a();
        return f14292g;
    }

    /* JADX INFO: renamed from: j */
    public final String m17783j() {
        m17773a();
        return f14293h;
    }

    /* JADX INFO: renamed from: k */
    public final String m17784k() {
        m17773a();
        return f14297l;
    }

    /* JADX INFO: renamed from: l */
    public final C4021r6 m17785l() {
        m17773a();
        return f14289d;
    }

    /* JADX INFO: renamed from: m */
    public final String m17786m() {
        if (Build.VERSION.SDK_INT < 24) {
            return Locale.getDefault().getLanguage();
        }
        try {
            return LocaleList.getDefault().get(0).getLanguage();
        } catch (Exception e) {
            C4048sb.m19407a("Cannot retrieve language", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: n */
    public final boolean m17787n() {
        return StringsKt.equals("Amazon", Build.MANUFACTURER, true);
    }

    /* JADX INFO: renamed from: o */
    public final boolean m17788o() {
        return f14287b;
    }
}
