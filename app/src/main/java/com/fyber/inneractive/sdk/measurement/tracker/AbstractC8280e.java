package com.fyber.inneractive.sdk.measurement.tracker;

import android.webkit.WebView;
import com.fyber.inneractive.sdk.web.C9248m;
import com.iab.omid.library.fyber.adsession.AdEvents;
import com.iab.omid.library.fyber.adsession.AdSession;
import com.iab.omid.library.fyber.adsession.AdSessionConfiguration;
import com.iab.omid.library.fyber.adsession.AdSessionContext;
import com.iab.omid.library.fyber.adsession.Partner;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.measurement.tracker.e */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC8280e {

    /* JADX INFO: renamed from: a */
    public AdSession f18458a;

    /* JADX INFO: renamed from: b */
    public AdEvents f18459b;

    /* JADX INFO: renamed from: c */
    public boolean f18460c = false;

    /* JADX INFO: renamed from: d */
    public final Partner f18461d;

    /* JADX INFO: renamed from: e */
    public WebView f18462e;

    public AbstractC8280e(Partner partner, C9248m c9248m) {
        this.f18461d = partner;
        this.f18462e = c9248m;
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo20679a();

    /* JADX INFO: renamed from: a */
    public void mo20680a(C9248m c9248m) {
        AdSessionContext adSessionContextCreateHtmlAdSessionContext;
        try {
            AdSessionConfiguration adSessionConfigurationMo20681b = mo20681b();
            try {
                adSessionContextCreateHtmlAdSessionContext = AdSessionContext.createHtmlAdSessionContext(this.f18461d, c9248m, "", "");
            } catch (Throwable unused) {
                adSessionContextCreateHtmlAdSessionContext = null;
            }
            AdSession adSessionCreateAdSession = AdSession.createAdSession(adSessionConfigurationMo20681b, adSessionContextCreateHtmlAdSessionContext);
            this.f18458a = adSessionCreateAdSession;
            adSessionCreateAdSession.registerAdView(c9248m);
            this.f18458a.start();
        } catch (Throwable unused2) {
        }
    }

    /* JADX INFO: renamed from: b */
    public abstract AdSessionConfiguration mo20681b();

    /* JADX INFO: renamed from: c */
    public abstract void mo20682c();
}
