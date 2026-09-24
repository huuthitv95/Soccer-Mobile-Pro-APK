package com.iab.omid.library.ironsrc.publisher;

import android.webkit.WebView;

/* JADX INFO: renamed from: com.iab.omid.library.ironsrc.publisher.a */
/* JADX INFO: loaded from: classes6.dex */
public class C11147a extends AdSessionStatePublisher {
    public C11147a(String str, WebView webView) {
        super(str);
        if (webView != null && !webView.getSettings().getJavaScriptEnabled()) {
            webView.getSettings().setJavaScriptEnabled(true);
        }
        m24303a(webView);
    }
}
