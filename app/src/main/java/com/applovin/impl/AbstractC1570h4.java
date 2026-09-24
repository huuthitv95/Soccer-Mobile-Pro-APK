package com.applovin.impl;

import android.view.View;
import android.webkit.WebView;
import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.C1768p;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinSdkUtils;
import com.facebook.internal.security.CertificateUtil;
import com.iab.omid.library.applovin.adsession.AdEvents;
import com.iab.omid.library.applovin.adsession.AdSession;
import com.iab.omid.library.applovin.adsession.AdSessionConfiguration;
import com.iab.omid.library.applovin.adsession.AdSessionContext;
import com.iab.omid.library.applovin.adsession.ErrorType;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.applovin.impl.h4 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1570h4 {

    /* JADX INFO: renamed from: a */
    protected final AppLovinAdBase f1752a;

    /* JADX INFO: renamed from: b */
    protected final C1748l f1753b;

    /* JADX INFO: renamed from: c */
    protected final C1768p f1754c;

    /* JADX INFO: renamed from: d */
    protected final String f1755d;

    /* JADX INFO: renamed from: e */
    protected boolean f1756e;

    /* JADX INFO: renamed from: f */
    protected AdSession f1757f;

    /* JADX INFO: renamed from: g */
    protected AdEvents f1758g;

    public AbstractC1570h4(AppLovinAdBase appLovinAdBase) {
        this.f1752a = appLovinAdBase;
        this.f1753b = appLovinAdBase.getSdk();
        this.f1754c = appLovinAdBase.getSdk().m4782Q();
        String str = "AdEventTracker:" + appLovinAdBase.getAdIdNumber();
        if (StringUtils.isValidString(appLovinAdBase.getDspName())) {
            str = str + CertificateUtil.DELIMITER + appLovinAdBase.getDspName();
        }
        this.f1755d = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void m2794a(View view, List list) {
        this.f1757f.registerAdView(view);
        this.f1757f.removeAllFriendlyObstructions();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1590j4 c1590j4 = (C1590j4) it.next();
            if (c1590j4.m2989c() != null) {
                try {
                    this.f1757f.addFriendlyObstruction(c1590j4.m2989c(), c1590j4.m2988b(), c1590j4.m2987a());
                } catch (Throwable th) {
                    if (C1768p.m5160a()) {
                        this.f1754c.m5172a(this.f1755d, "Failed to add friendly obstruction (" + c1590j4 + ")", th);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void m2795a(String str) {
        this.f1757f.error(ErrorType.VIDEO, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void m2796a(String str, Runnable runnable) {
        try {
            if (this.f1756e) {
                if (C1768p.m5160a()) {
                    this.f1754c.m5171a(this.f1755d, "Running operation: " + str);
                }
                runnable.run();
            }
        } catch (Throwable th) {
            if (C1768p.m5160a()) {
                this.f1754c.m5172a(this.f1755d, "Failed to run operation: " + str, th);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public /* synthetic */ void m2797b() {
        this.f1756e = false;
        this.f1757f.finish();
        this.f1757f = null;
        this.f1758g = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public /* synthetic */ void m2798b(WebView webView) {
        AdSessionContext adSessionContextMo2802a;
        if (!this.f1752a.isOpenMeasurementEnabled()) {
            if (C1768p.m5160a()) {
                this.f1754c.m5175d(this.f1755d, "Skip starting session - Open Measurement disabled");
                return;
            }
            return;
        }
        if (this.f1757f != null) {
            if (C1768p.m5160a()) {
                this.f1754c.m5178k(this.f1755d, "Attempting to start session again for ad: " + this.f1752a);
                return;
            }
            return;
        }
        if (C1768p.m5160a()) {
            this.f1754c.m5171a(this.f1755d, "Starting session");
        }
        AdSessionConfiguration adSessionConfigurationMo2801a = mo2801a();
        if (adSessionConfigurationMo2801a == null || (adSessionContextMo2802a = mo2802a(webView)) == null) {
            return;
        }
        try {
            AdSession adSessionCreateAdSession = AdSession.createAdSession(adSessionConfigurationMo2801a, adSessionContextMo2802a);
            this.f1757f = adSessionCreateAdSession;
            try {
                this.f1758g = AdEvents.createAdEvents(adSessionCreateAdSession);
                mo2804a(this.f1757f);
                this.f1757f.start();
                this.f1756e = true;
                if (C1768p.m5160a()) {
                    this.f1754c.m5171a(this.f1755d, "Session started");
                }
            } catch (Throwable th) {
                if (C1768p.m5160a()) {
                    this.f1754c.m5172a(this.f1755d, "Failed to create ad events", th);
                }
            }
        } catch (Throwable th2) {
            if (C1768p.m5160a()) {
                this.f1754c.m5172a(this.f1755d, "Failed to create session", th2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public /* synthetic */ void m2799c() {
        this.f1758g.impressionOccurred();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public /* synthetic */ void m2800d() {
        this.f1758g.loaded();
    }

    /* JADX INFO: renamed from: a */
    protected abstract AdSessionConfiguration mo2801a();

    /* JADX INFO: renamed from: a */
    protected abstract AdSessionContext mo2802a(WebView webView);

    /* JADX INFO: renamed from: a */
    public void m2803a(View view) {
        m2805b(view, Collections.EMPTY_LIST);
    }

    /* JADX INFO: renamed from: a */
    protected void mo2804a(AdSession adSession) {
    }

    /* JADX INFO: renamed from: b */
    public void m2805b(final View view, final List list) {
        m2807b("update main view: " + view, new Runnable() { // from class: com.applovin.impl.h4$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m2794a(view, list);
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public void m2806b(final String str) {
        m2807b("track error", new Runnable() { // from class: com.applovin.impl.h4$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m2795a(str);
            }
        });
    }

    /* JADX INFO: renamed from: b */
    protected void m2807b(final String str, final Runnable runnable) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.h4$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m2796a(str, runnable);
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public void m2808c(final WebView webView) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.h4$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m2798b(webView);
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public void m2809e() {
        m2808c(null);
    }

    /* JADX INFO: renamed from: f */
    public void m2810f() {
        m2807b("stop session", new Runnable() { // from class: com.applovin.impl.h4$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m2797b();
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public void m2811g() {
        m2807b("track impression event", new Runnable() { // from class: com.applovin.impl.h4$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m2799c();
            }
        });
    }

    /* JADX INFO: renamed from: h */
    public void mo2812h() {
        m2807b("track loaded", new Runnable() { // from class: com.applovin.impl.h4$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m2800d();
            }
        });
    }
}
