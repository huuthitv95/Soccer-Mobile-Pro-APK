package com.applovin.impl;

import android.os.Bundle;
import android.text.TextUtils;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.C1768p;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.applovin.impl.j */
/* JADX INFO: loaded from: classes3.dex */
public class C1585j implements AppLovinCommunicatorSubscriber {

    /* JADX INFO: renamed from: a */
    private final C1748l f1860a;

    /* JADX INFO: renamed from: b */
    private final Object f1861b = new Object();

    /* JADX INFO: renamed from: c */
    private final LinkedHashMap f1862c = new a();

    /* JADX INFO: renamed from: d */
    private final Set f1863d = Collections.synchronizedSet(new HashSet());

    /* JADX INFO: renamed from: com.applovin.impl.j$a */
    class a extends LinkedHashMap {
        a() {
        }

        @Override // java.util.LinkedHashMap
        protected boolean removeEldestEntry(Map.Entry entry) {
            return size() > 16;
        }
    }

    /* JADX INFO: renamed from: com.applovin.impl.j$b */
    /* JADX INFO: loaded from: classes9.dex */
    public interface b {
        void onCreativeIdGenerated(String str, String str2);
    }

    public C1585j(C1748l c1748l) {
        this.f1860a = c1748l;
        if (m2944c()) {
            AppLovinCommunicator.getInstance(C1748l.m4756p()).subscribe(this, "safedk_ad_info");
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m2940a() {
        return m2943b("getSdkKey");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void m2941a(b bVar, String str, String str2) {
        this.f1860a.m4782Q();
        if (C1768p.m5160a()) {
            this.f1860a.m4782Q().m5171a("AdReviewManager", "Notifying Ad Review creative id generated for listener: " + bVar);
        }
        bVar.onCreativeIdGenerated(str, str2);
    }

    /* JADX INFO: renamed from: b */
    public static String m2942b() {
        return m2943b("getVersion");
    }

    /* JADX INFO: renamed from: b */
    private static String m2943b(String str) {
        Class<?> cls;
        try {
            try {
                cls = Class.forName("com.applovin.quality.AppLovinQualityService");
            } catch (Throwable unused) {
                cls = Class.forName("com.safedk.android.SafeDK");
            }
            return (String) cls.getMethod(str, null).invoke(null, null);
        } catch (Throwable unused2) {
            return "";
        }
    }

    /* JADX INFO: renamed from: c */
    public static boolean m2944c() {
        return StringUtils.isValidString(m2942b());
    }

    /* JADX INFO: renamed from: a */
    public Bundle m2945a(String str) {
        Bundle bundle;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (this.f1861b) {
            bundle = (Bundle) this.f1862c.get(str);
        }
        this.f1860a.m4782Q();
        if (C1768p.m5160a()) {
            this.f1860a.m4782Q().m5171a("AdReviewManager", "Retrieved ad info (" + bundle + ") for serve id: " + str);
        }
        return bundle;
    }

    /* JADX INFO: renamed from: a */
    public void m2946a(b bVar) {
        this.f1863d.add(bVar);
    }

    /* JADX INFO: renamed from: b */
    public void m2947b(b bVar) {
        this.f1863d.remove(bVar);
    }

    /* JADX INFO: renamed from: c */
    public void m2948c(String str) {
        this.f1860a.m4782Q();
        if (C1768p.m5160a()) {
            this.f1860a.m4782Q().m5171a("AdReviewManager", "Removing ad info for serve id: " + str);
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (this.f1861b) {
            this.f1862c.remove(str);
        }
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return "j";
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if ("safedk_ad_info".equals(appLovinCommunicatorMessage.getTopic())) {
            Bundle bundle = appLovinCommunicatorMessage.getMessageData().getBundle("public");
            if (bundle == null) {
                this.f1860a.m4782Q();
                if (C1768p.m5160a()) {
                    this.f1860a.m4782Q().m5178k("AdReviewManager", "Received SafeDK ad info without public data");
                    return;
                }
                return;
            }
            Bundle bundle2 = appLovinCommunicatorMessage.getMessageData().getBundle("private");
            if (bundle2 == null) {
                this.f1860a.m4782Q();
                if (C1768p.m5160a()) {
                    this.f1860a.m4782Q().m5178k("AdReviewManager", "Received SafeDK ad info without private data");
                    return;
                }
                return;
            }
            if (MaxAdFormat.formatFromString(bundle2.getString(FirebaseAnalytics.Param.AD_FORMAT)) == null) {
                this.f1860a.m4782Q();
                if (C1768p.m5160a()) {
                    this.f1860a.m4782Q().m5178k("AdReviewManager", "Received SafeDK ad info without ad format");
                    return;
                }
                return;
            }
            final String string = bundle2.getString("id");
            if (TextUtils.isEmpty(string)) {
                this.f1860a.m4782Q();
                if (C1768p.m5160a()) {
                    this.f1860a.m4782Q().m5178k("AdReviewManager", "Received SafeDK ad info without serve id");
                    return;
                }
                return;
            }
            synchronized (this.f1861b) {
                this.f1860a.m4782Q();
                if (C1768p.m5160a()) {
                    this.f1860a.m4782Q().m5171a("AdReviewManager", "Storing current SafeDK ad info for serve id: " + string + ", public data: " + bundle);
                }
                this.f1862c.put(string, bundle);
            }
            final String string2 = bundle.getString("ad_review_creative_id");
            this.f1860a.m4782Q();
            if (C1768p.m5160a()) {
                this.f1860a.m4782Q().m5171a("AdReviewManager", "Received SafeDK ad info with Ad Review creative id: " + string2);
            }
            if (!StringUtils.isValidString(string2) || this.f1863d.isEmpty()) {
                return;
            }
            HashSet<b> hashSet = new HashSet(this.f1863d);
            this.f1860a.m4782Q();
            if (C1768p.m5160a()) {
                this.f1860a.m4782Q().m5171a("AdReviewManager", "Notifying listeners: " + this.f1863d);
            }
            for (final b bVar : hashSet) {
                this.f1860a.m4853s0().m2604a((AbstractRunnableC1601k5) new C1788u6(this.f1860a, "creativeIdGenerated", new Runnable() { // from class: com.applovin.impl.j$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m2941a(bVar, string, string2);
                    }
                }), C1552f6.b.OTHER);
            }
        }
    }
}
