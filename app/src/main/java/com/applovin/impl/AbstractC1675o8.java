package com.applovin.impl;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.C1768p;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.applovin.impl.o8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1675o8 {

    /* JADX INFO: renamed from: a */
    private static String f2479a;

    /* JADX INFO: renamed from: d */
    private static int f2482d;

    /* JADX INFO: renamed from: e */
    private static String f2483e;

    /* JADX INFO: renamed from: f */
    private static String f2484f;

    /* JADX INFO: renamed from: b */
    private static final Object f2480b = new Object();

    /* JADX INFO: renamed from: c */
    private static final AtomicBoolean f2481c = new AtomicBoolean();

    /* JADX INFO: renamed from: g */
    private static final AtomicBoolean f2485g = new AtomicBoolean();

    static {
        C1748l c1748l = C1748l.f3003E0;
        if (c1748l != null && ((Boolean) c1748l.m4801a(C1831z4.f3944h4)).booleanValue() && m3777e()) {
            f2479a = (String) C1521c5.m2201a(C1511b5.f1155M, "", C1748l.m4756p());
        } else {
            f2479a = "";
            C1521c5.m2207b(C1511b5.f1155M, (Object) null, C1748l.m4756p());
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m3769a() {
        String str;
        synchronized (f2480b) {
            str = f2479a;
        }
        return str;
    }

    /* JADX INFO: renamed from: a */
    public static void m3770a(final C1748l c1748l) {
        if (f2481c.getAndSet(true)) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.o8$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC1675o8.m3776d(c1748l);
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public static String m3771b() {
        return f2484f;
    }

    /* JADX INFO: renamed from: b */
    public static void m3772b(C1748l c1748l) {
        if (f2485g.getAndSet(true)) {
            return;
        }
        PackageInfo packageInfoM3773c = m3773c(c1748l);
        if (packageInfoM3773c != null) {
            f2482d = packageInfoM3773c.versionCode;
            f2483e = packageInfoM3773c.versionName;
            f2484f = packageInfoM3773c.packageName;
        } else {
            c1748l.m4782Q();
            if (C1768p.m5160a()) {
                c1748l.m4782Q().m5174b("WebViewDataCollector", "Failed to get WebView package info");
            }
        }
    }

    /* JADX INFO: renamed from: c */
    private static PackageInfo m3773c(C1748l c1748l) {
        PackageManager packageManager = C1748l.m4756p().getPackageManager();
        if (AbstractC1677p0.m3811e()) {
            return WebView.getCurrentWebViewPackage();
        }
        Iterator it = c1748l.m4821c(C1831z4.f4039s4).iterator();
        while (it.hasNext()) {
            try {
                return packageManager.getPackageInfo((String) it.next(), 0);
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static String m3774c() {
        return f2483e;
    }

    /* JADX INFO: renamed from: d */
    public static int m3775d() {
        return f2482d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m3776d(C1748l c1748l) {
        try {
            synchronized (f2480b) {
                String defaultUserAgent = WebSettings.getDefaultUserAgent(C1748l.m4756p());
                if (!TextUtils.isEmpty(defaultUserAgent)) {
                    f2479a = defaultUserAgent;
                    C1521c5.m2207b(C1511b5.f1155M, f2479a, C1748l.m4756p());
                } else {
                    c1748l.m4782Q();
                    if (C1768p.m5160a()) {
                        c1748l.m4782Q().m5174b("WebViewDataCollector", "Collected invalid user agent");
                    }
                    c1748l.m4764E().m2677a(C1548f2.f1540i1, "collectedInvalidUserAgent");
                }
            }
        } catch (Throwable th) {
            c1748l.m4782Q();
            if (C1768p.m5160a()) {
                c1748l.m4782Q().m5172a("WebViewDataCollector", "Failed to collect user agent", th);
            }
            c1748l.m4764E().m4329a("WebViewDataCollector", "collectUserAgent", th);
        }
    }

    /* JADX INFO: renamed from: e */
    private static boolean m3777e() {
        boolean zIsValidString;
        synchronized (f2480b) {
            zIsValidString = StringUtils.isValidString((String) C1521c5.m2201a(C1511b5.f1155M, "", C1748l.m4756p()));
        }
        return zIsValidString;
    }
}
