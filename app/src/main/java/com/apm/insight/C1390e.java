package com.apm.insight;

import android.app.Application;
import android.content.Context;
import com.apm.insight.nativecrash.C1442b;
import com.apm.insight.runtime.C1465g;
import com.apm.insight.runtime.ConfigManager;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.apm.insight.e */
/* JADX INFO: compiled from: NpthBus.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C1390e {

    /* JADX INFO: renamed from: a */
    private static Context f509a = null;

    /* JADX INFO: renamed from: b */
    private static Application f510b = null;

    /* JADX INFO: renamed from: c */
    private static long f511c = 0;

    /* JADX INFO: renamed from: d */
    private static String f512d = "default";

    /* JADX INFO: renamed from: e */
    private static boolean f513e;

    /* JADX INFO: renamed from: f */
    private static C1442b f514f;

    /* JADX INFO: renamed from: i */
    private static volatile ConcurrentHashMap<Integer, String> f517i;

    /* JADX INFO: renamed from: n */
    private static volatile String f522n;

    /* JADX INFO: renamed from: g */
    private static ConfigManager f515g = new ConfigManager();

    /* JADX INFO: renamed from: h */
    private static C1373a f516h = new C1373a();

    /* JADX INFO: renamed from: j */
    private static C1465g f518j = null;

    /* JADX INFO: renamed from: k */
    private static volatile String f519k = null;

    /* JADX INFO: renamed from: l */
    private static Object f520l = new Object();

    /* JADX INFO: renamed from: m */
    private static volatile int f521m = 0;

    /* JADX INFO: renamed from: o */
    private static int f523o = 0;

    /* JADX INFO: renamed from: p */
    private static boolean f524p = true;

    /* JADX INFO: renamed from: q */
    private static boolean f525q = true;

    /* JADX INFO: renamed from: r */
    private static boolean f526r = false;

    /* JADX INFO: renamed from: s */
    private static boolean f527s = true;

    /* JADX INFO: renamed from: t */
    private static boolean f528t = true;

    /* JADX INFO: renamed from: u */
    private static boolean f529u = true;

    /* JADX INFO: renamed from: a */
    public static C1442b m1012a() {
        if (f514f == null) {
            f514f = C1465g.m1638a(f509a);
        }
        return f514f;
    }

    /* JADX INFO: renamed from: a */
    public static String m1013a(long j, CrashType crashType, boolean z, boolean z2) {
        StringBuilder sb = new StringBuilder();
        sb.append(j);
        sb.append("_");
        sb.append(crashType.getName());
        sb.append('_');
        sb.append(m1030f());
        sb.append('_');
        sb.append(z ? "oom_" : "normal_");
        sb.append(f511c);
        sb.append('_');
        sb.append(z2 ? "ignore_" : "normal_");
        sb.append(Long.toHexString(new Random().nextLong()));
        sb.append(RequestConfiguration.MAX_AD_CONTENT_RATING_G);
        return sb.toString();
    }

    /* JADX INFO: renamed from: a */
    static void m1014a(int i, String str) {
        if (f517i == null) {
            synchronized (C1390e.class) {
                if (f517i == null) {
                    f517i = new ConcurrentHashMap<>();
                }
            }
        }
        f517i.put(Integer.valueOf(i), str);
    }

    /* JADX INFO: renamed from: a */
    public static void m1015a(Application application) {
        if (application != null) {
            f510b = application;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m1016a(Application application, Context context) {
        if (f510b == null) {
            f511c = System.currentTimeMillis();
            f509a = context;
            f510b = application;
            f519k = Long.toHexString(new Random().nextLong()) + RequestConfiguration.MAX_AD_CONTENT_RATING_G;
        }
    }

    /* JADX INFO: renamed from: a */
    static void m1017a(Application application, Context context, ICommonParams iCommonParams) {
        m1016a(application, context);
        f514f = new C1442b(f509a, iCommonParams, m1012a());
    }

    /* JADX INFO: renamed from: a */
    public static void m1018a(C1442b c1442b) {
        f514f = c1442b;
    }

    /* JADX INFO: renamed from: a */
    static void m1019a(String str) {
        f512d = str;
    }

    /* JADX INFO: renamed from: a */
    public static void m1020a(boolean z) {
        f524p = z;
    }

    /* JADX INFO: renamed from: b */
    public static C1373a m1021b() {
        return f516h;
    }

    /* JADX INFO: renamed from: b */
    static void m1022b(int i, String str) {
        f521m = i;
        f522n = str;
    }

    /* JADX INFO: renamed from: b */
    public static void m1023b(boolean z) {
        f525q = z;
    }

    /* JADX INFO: renamed from: c */
    public static C1465g m1024c() {
        if (f518j == null) {
            synchronized (C1390e.class) {
                f518j = new C1465g();
            }
        }
        return f518j;
    }

    /* JADX INFO: renamed from: c */
    public static void m1025c(boolean z) {
        f526r = z;
    }

    /* JADX INFO: renamed from: d */
    public static void m1026d(boolean z) {
        f527s = z;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m1027d() {
        if (!f515g.isDebugMode()) {
            return false;
        }
        Object obj = m1012a().m1509a().get("channel");
        return (obj == null ? "unknown" : String.valueOf(obj)).contains("local_test");
    }

    /* JADX INFO: renamed from: e */
    public static String m1028e() {
        return m1030f() + '_' + Long.toHexString(new Random().nextLong()) + RequestConfiguration.MAX_AD_CONTENT_RATING_G;
    }

    /* JADX INFO: renamed from: e */
    public static void m1029e(boolean z) {
        f529u = z;
    }

    /* JADX INFO: renamed from: f */
    public static String m1030f() {
        if (f519k == null) {
            synchronized (f520l) {
                if (f519k == null) {
                    f519k = Long.toHexString(new Random().nextLong()) + "U";
                }
            }
        }
        return f519k;
    }

    /* JADX INFO: renamed from: f */
    public static void m1031f(boolean z) {
        f528t = z;
    }

    /* JADX INFO: renamed from: g */
    public static Context m1032g() {
        return f509a;
    }

    /* JADX INFO: renamed from: h */
    public static Application m1033h() {
        return f510b;
    }

    /* JADX INFO: renamed from: i */
    public static ConfigManager m1034i() {
        return f515g;
    }

    /* JADX INFO: renamed from: j */
    public static long m1035j() {
        return f511c;
    }

    /* JADX INFO: renamed from: k */
    public static String m1036k() {
        return f512d;
    }

    /* JADX INFO: renamed from: l */
    public static void m1037l() {
        f523o = 1;
    }

    /* JADX INFO: renamed from: m */
    public static int m1038m() {
        return f523o;
    }

    /* JADX INFO: renamed from: n */
    public static boolean m1039n() {
        return f513e;
    }

    /* JADX INFO: renamed from: o */
    static void m1040o() {
        f513e = true;
    }

    /* JADX INFO: renamed from: p */
    public static ConcurrentHashMap<Integer, String> m1041p() {
        return f517i;
    }

    /* JADX INFO: renamed from: q */
    public static int m1042q() {
        return f521m;
    }

    /* JADX INFO: renamed from: r */
    public static String m1043r() {
        return f522n;
    }

    /* JADX INFO: renamed from: s */
    public static boolean m1044s() {
        return f524p;
    }

    /* JADX INFO: renamed from: t */
    public static boolean m1045t() {
        return f525q;
    }

    /* JADX INFO: renamed from: u */
    public static boolean m1046u() {
        return f526r;
    }

    /* JADX INFO: renamed from: v */
    public static boolean m1047v() {
        return f527s;
    }

    /* JADX INFO: renamed from: w */
    public static boolean m1048w() {
        return f529u;
    }

    /* JADX INFO: renamed from: x */
    public static boolean m1049x() {
        return f528t;
    }
}
