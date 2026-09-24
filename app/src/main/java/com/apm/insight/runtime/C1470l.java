package com.apm.insight.runtime;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.apm.insight.C1373a;
import com.apm.insight.C1386c;
import com.apm.insight.C1390e;
import com.apm.insight.CrashType;
import com.apm.insight.ICrashCallback;
import com.apm.insight.IOOMCallback;
import com.apm.insight.nativecrash.NativeImpl;
import com.apm.insight.p010a.C1374a;
import com.apm.insight.p011b.C1376a;
import com.apm.insight.p011b.C1378c;
import com.apm.insight.p011b.C1379d;
import com.apm.insight.p011b.C1381f;
import com.apm.insight.p011b.C1383h;
import com.apm.insight.p011b.C1384i;
import com.apm.insight.p013d.C1389a;
import com.apm.insight.p014e.C1391a;
import com.apm.insight.p017g.C1401a;
import com.apm.insight.p017g.C1404d;
import com.apm.insight.p019i.C1409b;
import com.apm.insight.p021k.C1418e;
import com.apm.insight.p021k.C1420g;
import com.apm.insight.p021k.C1423j;
import com.apm.insight.p021k.RunnableC1421h;
import com.apm.insight.p022l.C1425a;
import com.apm.insight.p022l.C1434j;
import com.apm.insight.runtime.p023a.C1453f;
import java.io.File;
import java.util.Map;

/* JADX INFO: renamed from: com.apm.insight.runtime.l */
/* JADX INFO: compiled from: NpthCore.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C1470l {

    /* JADX INFO: renamed from: a */
    private static boolean f871a;

    /* JADX INFO: renamed from: b */
    private static boolean f872b;

    /* JADX INFO: renamed from: c */
    private static boolean f873c;

    /* JADX INFO: renamed from: d */
    private static boolean f874d;

    /* JADX INFO: renamed from: e */
    private static boolean f875e;

    /* JADX INFO: renamed from: f */
    private static C1461c f876f = new C1461c();

    /* JADX INFO: renamed from: g */
    private static volatile boolean f877g = false;

    /* JADX INFO: renamed from: h */
    private static boolean f878h = false;

    /* JADX INFO: renamed from: a */
    public static C1461c m1660a() {
        return f876f;
    }

    /* JADX INFO: renamed from: a */
    public static void m1661a(long j) {
        NativeImpl.m1450a(j);
    }

    /* JADX INFO: renamed from: a */
    public static synchronized void m1662a(Application application, Context context) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (f871a) {
            return;
        }
        f871a = true;
        if (context == null || application == null) {
            throw new IllegalArgumentException("context or Application must be not null.");
        }
        C1390e.m1016a(application, context);
        if (C1390e.m1046u() && (m1682b(application) || m1686c(application))) {
            Log.e("apminsight", "Inner npth checked.");
            return;
        }
        C1401a c1401aM1147a = C1401a.m1147a();
        c1401aM1147a.m1162a(new C1409b(context));
        c1401aM1147a.m1165b(new C1404d(context));
        f872b = true;
        NativeImpl.m1454a();
        boolean zM1455a = NativeImpl.m1455a(context);
        f874d = zM1455a;
        if (!zM1455a) {
            f875e = true;
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            f877g = true;
            NativeImpl.m1472i();
        }
        C1471m.m1704a().m1736a(new Runnable() { // from class: com.apm.insight.runtime.l.2

            /* JADX INFO: renamed from: a */
            private /* synthetic */ boolean f881a = true;

            @Override // java.lang.Runnable
            public final void run() {
                if (!C1470l.f877g) {
                    new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.apm.insight.runtime.l.2.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            C1470l.m1703r();
                            NativeImpl.m1472i();
                        }
                    });
                }
                C1470l.m1689e(this.f881a);
            }
        }, 0L);
        C1373a.m861a((Object) ("Npth.init takes " + (SystemClock.uptimeMillis() - jUptimeMillis) + " ms."));
    }

    /* JADX INFO: renamed from: a */
    public static synchronized void m1663a(Context context) {
        Application applicationM1033h;
        if (C1390e.m1033h() != null) {
            applicationM1033h = C1390e.m1033h();
        } else if (context instanceof Application) {
            applicationM1033h = (Application) context;
            if (applicationM1033h.getBaseContext() == null) {
                throw new IllegalArgumentException("The Application passed in when init has not been attached, please pass a attachBaseContext as param and call Npth.setApplication(Application) before init.");
            }
        } else {
            try {
                applicationM1033h = (Application) context.getApplicationContext();
                if (applicationM1033h == null) {
                    throw new IllegalArgumentException("Can not get the Application instance since a baseContext was passed in when init, please call Npth.setApplication(Application) before init.");
                }
                if (applicationM1033h.getBaseContext() != null) {
                    context = applicationM1033h.getBaseContext();
                }
            } catch (Throwable unused) {
                throw new IllegalArgumentException("Can not get the Application instance since a baseContext was passed in when init, please call Npth.setApplication(Application) before init.");
            }
        }
        m1662a(applicationM1033h, context);
    }

    /* JADX INFO: renamed from: a */
    public static void m1664a(ICrashCallback iCrashCallback, CrashType crashType) {
        f876f.m1616a(iCrashCallback, crashType);
    }

    /* JADX INFO: renamed from: a */
    public static void m1665a(IOOMCallback iOOMCallback) {
        f876f.m1617a(iOOMCallback);
    }

    /* JADX INFO: renamed from: a */
    public static void m1666a(C1383h.a aVar) {
        C1466h.m1643a(aVar);
    }

    /* JADX INFO: renamed from: a */
    public static void m1667a(C1384i.a aVar) {
        C1390e.m1034i().setEncryptImpl$22f2d42e(aVar);
    }

    /* JADX INFO: renamed from: a */
    public static void m1668a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        C1389a.m1008a(str);
    }

    /* JADX INFO: renamed from: a */
    public static void m1669a(final String str, final C1383h.a aVar) {
        C1471m.m1704a().m1735a(new Runnable() { // from class: com.apm.insight.runtime.l.1
            @Override // java.lang.Runnable
            public final void run() {
                if (C1425a.m1292b(C1390e.m1032g())) {
                    C1379d.m939a(str, aVar);
                }
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static void m1670a(String str, C1384i.a aVar, C1384i.a aVar2) {
        if (TextUtils.isEmpty(str) || !new File(str).exists()) {
            return;
        }
        C1374a.m898a().m899a(str, aVar, aVar2);
    }

    /* JADX INFO: renamed from: a */
    public static void m1671a(String str, Map<? extends String, ? extends String> map, Map<String, String> map2, C1383h.a aVar) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        C1389a.m1009a(str, map, map2, aVar);
    }

    /* JADX INFO: renamed from: a */
    public static void m1672a(String str, Map<? extends String, ? extends String> map, Map<String, String> map2, Map<String, String> map3, C1383h.a aVar) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        C1389a.m1010a(str, map, map2, map3, aVar);
    }

    @Deprecated
    /* JADX INFO: renamed from: a */
    public static void m1673a(Throwable th) {
        if (C1390e.m1034i().isReportErrorEnable()) {
            C1401a.m1152a(th);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m1674a(boolean z) {
        C1390e.m1020a(z);
    }

    /* JADX INFO: renamed from: b */
    public static void m1675b(long j) {
        NativeImpl.m1458b(j);
    }

    /* JADX INFO: renamed from: b */
    public static void m1676b(ICrashCallback iCrashCallback, CrashType crashType) {
        f876f.m1619b(iCrashCallback, crashType);
    }

    /* JADX INFO: renamed from: b */
    public static void m1677b(IOOMCallback iOOMCallback) {
        f876f.m1620b(iOOMCallback);
    }

    /* JADX INFO: renamed from: b */
    public static void m1678b(C1383h.a aVar) {
        C1418e.m1236a(aVar);
    }

    @Deprecated
    /* JADX INFO: renamed from: b */
    public static void m1679b(String str) {
        if (C1390e.m1034i().isReportErrorEnable()) {
            C1401a.m1155c(str);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m1680b(boolean z) {
        C1390e.m1023b(z);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m1681b() {
        return f872b;
    }

    /* JADX INFO: renamed from: b */
    private static boolean m1682b(Context context) {
        try {
            return new File(C1434j.m1398j(context), "npth").exists();
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m1683c(String str) {
        NativeImpl.m1459b(str);
    }

    /* JADX INFO: renamed from: c */
    public static void m1684c(boolean z) {
        C1390e.m1025c(z);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m1685c() {
        return f873c;
    }

    /* JADX INFO: renamed from: c */
    private static boolean m1686c(Context context) {
        try {
            return new File(context.getApplicationInfo().nativeLibraryDir, "libapminsighta.so").exists();
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m1687d(boolean z) {
        C1390e.m1026d(z);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m1688d() {
        return f874d;
    }

    /* JADX INFO: renamed from: e */
    static /* synthetic */ void m1689e(boolean z) {
        Context contextM1032g = C1390e.m1032g();
        C1453f.m1608a();
        C1468j.m1651a();
        int iM1456b = NativeImpl.m1456b();
        NativeImpl.m1462d();
        if (f875e) {
            C1386c.m990a();
            C1376a.m903a("NativeLibraryLoad faild");
        } else if (iM1456b < 0) {
            C1386c.m990a();
            C1376a.m903a("createCallbackThread faild");
        }
        C1391a.m1050a().m1052a(contextM1032g);
        C1386c.m990a();
        RunnableC1421h.m1267a(contextM1032g);
        if (z) {
            C1381f.m945a(contextM1032g).m948c();
            f873c = z;
        }
        C1420g.m1254a().m1265b();
        NativeImpl.m1468g();
        C1423j.m1279d();
        NativeImpl.m1475k();
        C1472n.m1708a("afterNpthInitAsync", "noValue");
    }

    /* JADX INFO: renamed from: e */
    public static boolean m1690e() {
        return f871a;
    }

    /* JADX INFO: renamed from: f */
    public static void m1691f() {
        if (!f871a || f872b) {
            return;
        }
        Context contextM1032g = C1390e.m1032g();
        C1401a c1401aM1147a = C1401a.m1147a();
        c1401aM1147a.m1162a(new C1409b(contextM1032g));
        c1401aM1147a.m1165b(new C1404d(contextM1032g));
    }

    /* JADX INFO: renamed from: g */
    public static void m1692g() {
        if (f871a) {
            C1381f.m945a(C1390e.m1032g()).m948c();
            f873c = true;
        }
    }

    /* JADX INFO: renamed from: h */
    public static boolean m1693h() {
        if (f871a && !f874d) {
            boolean zM1455a = NativeImpl.m1455a(C1390e.m1032g());
            f874d = zM1455a;
            if (!zM1455a) {
                f875e = true;
            }
        }
        return f874d;
    }

    /* JADX INFO: renamed from: i */
    public static boolean m1694i() {
        return C1378c.m932c();
    }

    /* JADX INFO: renamed from: j */
    public static void m1695j() {
        if (f871a) {
            C1381f.m945a(C1390e.m1032g()).m949d();
            f873c = false;
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m1696k() {
        NativeImpl.m1461c();
    }

    /* JADX INFO: renamed from: l */
    public static boolean m1697l() {
        return C1401a.m1153b() || NativeImpl.m1465e();
    }

    /* JADX INFO: renamed from: m */
    public static boolean m1698m() {
        return C1401a.m1157c() || NativeImpl.m1465e();
    }

    /* JADX INFO: renamed from: n */
    public static boolean m1699n() {
        return C1401a.m1153b();
    }

    /* JADX INFO: renamed from: o */
    public static boolean m1700o() {
        return f878h;
    }

    /* JADX INFO: renamed from: p */
    public static void m1701p() {
        f878h = true;
    }

    /* JADX INFO: renamed from: r */
    static /* synthetic */ boolean m1703r() {
        f877g = true;
        return true;
    }
}
