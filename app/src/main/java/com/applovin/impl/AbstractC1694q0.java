package com.applovin.impl;

import android.content.Context;
import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.C1768p;

/* JADX INFO: renamed from: com.applovin.impl.q0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1694q0 {

    /* JADX INFO: renamed from: a */
    private static final a f2588a = new a("Age Restricted User", C1511b5.f1178r);

    /* JADX INFO: renamed from: b */
    private static final a f2589b = new a("Has User Consent", C1511b5.f1177q);

    /* JADX INFO: renamed from: c */
    private static final a f2590c = new a("\"Do Not Sell\"", C1511b5.f1179s);

    /* JADX INFO: renamed from: com.applovin.impl.q0$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        private final String f2591a;

        /* JADX INFO: renamed from: b */
        private final C1511b5 f2592b;

        a(String str, C1511b5 c1511b5) {
            this.f2591a = str;
            this.f2592b = c1511b5;
        }

        /* JADX INFO: renamed from: a */
        public String m3957a() {
            return this.f2591a;
        }

        /* JADX INFO: renamed from: a */
        public String m3958a(Context context) {
            Boolean boolM3959b = m3959b(context);
            return boolM3959b != null ? boolM3959b.toString() : "No value set";
        }

        /* JADX INFO: renamed from: b */
        public Boolean m3959b(Context context) {
            if (context != null) {
                return (Boolean) C1521c5.m2201a(this.f2592b, (Object) null, context);
            }
            C1768p.m5167h("AppLovinSdk", "Failed to get value for key: " + this.f2592b);
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static a m3948a() {
        return f2590c;
    }

    /* JADX INFO: renamed from: a */
    public static String m3949a(Context context) {
        return m3950a(f2589b, context) + m3950a(f2590c, context);
    }

    /* JADX INFO: renamed from: a */
    private static String m3950a(a aVar, Context context) {
        return "\n" + aVar.f2591a + " - " + aVar.m3958a(context);
    }

    /* JADX INFO: renamed from: a */
    private static boolean m3951a(C1511b5 c1511b5, Boolean bool, Context context) {
        if (context == null) {
            C1768p.m5167h("AppLovinSdk", "Failed to update compliance value for key: " + c1511b5);
            return false;
        }
        try {
            Boolean bool2 = (Boolean) C1521c5.m2201a(c1511b5, (Object) null, context);
            C1521c5.m2207b(c1511b5, bool, context);
            return bool2 == null || bool2 != bool;
        } catch (Throwable th) {
            C1768p.m5164c("ComplianceManager", "Unable to update compliance", th);
            C1748l c1748l = C1748l.f3003E0;
            if (c1748l != null) {
                c1748l.m4764E().m4329a("ComplianceManager", "updateCompliance", th);
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m3952a(boolean z, Context context) {
        return m3951a(C1511b5.f1179s, Boolean.valueOf(z), context);
    }

    /* JADX INFO: renamed from: b */
    public static a m3953b() {
        return f2589b;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m3954b(boolean z, Context context) {
        return m3951a(C1511b5.f1177q, Boolean.valueOf(z), context);
    }

    /* JADX INFO: renamed from: c */
    public static a m3955c() {
        return f2588a;
    }
}
