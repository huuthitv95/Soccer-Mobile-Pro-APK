package com.applovin.impl.sdk;

import android.text.TextUtils;
import android.util.Log;
import com.applovin.impl.C1811x2;
import com.applovin.impl.C1831z4;
import com.ironsource.C11744X3;

/* JADX INFO: renamed from: com.applovin.impl.sdk.p */
/* JADX INFO: loaded from: classes3.dex */
public class C1768p {

    /* JADX INFO: renamed from: b */
    private static boolean f3252b;

    /* JADX INFO: renamed from: a */
    private final C1748l f3253a;

    C1768p(C1748l c1748l) {
        this.f3253a = c1748l;
        m5158a("SDK Session Begin");
    }

    /* JADX INFO: renamed from: a */
    private void m5158a(String str) {
        C1811x2 c1811x2 = new C1811x2();
        c1811x2.m5564a().m5570a(str).m5564a();
        m5166g("AppLovinSdk", c1811x2.toString());
    }

    /* JADX INFO: renamed from: a */
    public static void m5159a(boolean z) {
        f3252b = z;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m5160a() {
        return m5161a(C1748l.f3003E0);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m5161a(C1748l c1748l) {
        return c1748l != null && c1748l.m4849q0().m1880c();
    }

    /* JADX INFO: renamed from: b */
    public static void m5162b(String str, String str2, Throwable th) {
        C1748l c1748l = C1748l.f3003E0;
        if (c1748l == null) {
            return;
        }
        c1748l.m4782Q();
        if (m5160a()) {
            C1748l.f3003E0.m4782Q().m5172a(str, str2, th);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m5163c(String str, String str2) {
        m5162b(str, str2, null);
    }

    /* JADX INFO: renamed from: c */
    public static void m5164c(String str, String str2, Throwable th) {
        if (!f3252b || m5160a()) {
            Log.e("AppLovinSdk", C11744X3.j.f26438d + str + "] " + str2, th);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m5165e(String str, String str2) {
        m5166g(str, str2);
    }

    /* JADX INFO: renamed from: g */
    public static void m5166g(String str, String str2) {
        if (!f3252b || m5160a()) {
            Log.d("AppLovinSdk", C11744X3.j.f26438d + str + "] " + str2);
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m5167h(String str, String str2) {
        m5164c(str, str2, null);
    }

    /* JADX INFO: renamed from: i */
    public static void m5168i(String str, String str2) {
        if (!f3252b || m5160a()) {
            Log.i("AppLovinSdk", C11744X3.j.f26438d + str + "] " + str2);
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m5169j(String str, String str2) {
        if (!f3252b || m5160a()) {
            Log.w("AppLovinSdk", C11744X3.j.f26438d + str + "] " + str2);
        }
    }

    /* JADX INFO: renamed from: l */
    public static void m5170l(String str, String str2) {
        C1748l c1748l = C1748l.f3003E0;
        if (c1748l == null) {
            return;
        }
        c1748l.m4782Q();
        if (m5160a()) {
            C1748l.f3003E0.m4782Q().m5178k(str, str2);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m5171a(String str, String str2) {
        Log.d("AppLovinSdk", C11744X3.j.f26438d + str + "] " + str2);
    }

    /* JADX INFO: renamed from: a */
    public void m5172a(String str, String str2, Throwable th) {
        Log.e("AppLovinSdk", C11744X3.j.f26438d + str + "] " + str2, th);
    }

    /* JADX INFO: renamed from: a */
    public void m5173a(String str, Throwable th) {
        for (Throwable th2 : th.getSuppressed()) {
            m5174b(str, th2.toString());
        }
    }

    /* JADX INFO: renamed from: b */
    public void m5174b(String str, String str2) {
        m5172a(str, str2, null);
    }

    /* JADX INFO: renamed from: d */
    public void m5175d(String str, String str2) {
        Log.i("AppLovinSdk", C11744X3.j.f26438d + str + "] " + str2);
    }

    /* JADX INFO: renamed from: d */
    public void m5176d(String str, String str2, Throwable th) {
        Log.w("AppLovinSdk", C11744X3.j.f26438d + str + "] " + str2, th);
    }

    /* JADX INFO: renamed from: f */
    public void m5177f(String str, String str2) {
        int iIntValue;
        if (m5161a(this.f3253a) && !TextUtils.isEmpty(str2) && (iIntValue = ((Integer) this.f3253a.m4801a(C1831z4.f4026r)).intValue()) > 0) {
            int length = str2.length();
            int i = ((length + iIntValue) - 1) / iIntValue;
            for (int i2 = 0; i2 < i; i2++) {
                int i3 = i2 * iIntValue;
                m5171a(str, str2.substring(i3, Math.min(length, i3 + iIntValue)));
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public void m5178k(String str, String str2) {
        m5176d(str, str2, null);
    }
}
