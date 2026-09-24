package com.iab.omid.library.fyber.publisher;

import android.webkit.WebView;

/* JADX INFO: renamed from: com.iab.omid.library.fyber.publisher.a */
/* JADX INFO: loaded from: classes6.dex */
public class C11096a extends AdSessionStatePublisher {
    public C11096a(String str, WebView webView) {
        super(str);
        if (webView != null && !webView.getSettings().getJavaScriptEnabled()) {
            webView.getSettings().setJavaScriptEnabled(true);
        }
        m24050a(webView);
    }
}
