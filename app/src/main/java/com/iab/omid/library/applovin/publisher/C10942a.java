package com.iab.omid.library.applovin.publisher;

import android.webkit.WebView;

/* JADX INFO: renamed from: com.iab.omid.library.applovin.publisher.a */
/* JADX INFO: loaded from: classes6.dex */
public class C10942a extends AdSessionStatePublisher {
    public C10942a(String str, WebView webView) {
        super(str);
        if (webView != null && !webView.getSettings().getJavaScriptEnabled()) {
            webView.getSettings().setJavaScriptEnabled(true);
        }
        m23293a(webView);
    }
}
