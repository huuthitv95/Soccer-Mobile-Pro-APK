package com.mbridge.msdk.config.component.wei.monitor;

import android.webkit.WebView;
import com.iab.omid.library.mmadbridge.adsession.AdSession;

/* JADX INFO: renamed from: com.mbridge.msdk.config.component.wei.monitor.b */
/* JADX INFO: compiled from: OMSDKWebMonitor.java */
/* JADX INFO: loaded from: classes5.dex */
public class C12859b {

    /* JADX INFO: renamed from: a */
    AdSession f34494a;

    public C12859b(AdSession adSession) {
        this.f34494a = adSession;
    }

    /* JADX INFO: renamed from: a */
    public void m35870a(WebView webView) {
        this.f34494a.registerAdView(webView);
    }
}
