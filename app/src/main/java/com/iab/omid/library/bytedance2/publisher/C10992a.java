package com.iab.omid.library.bytedance2.publisher;

import android.webkit.WebView;

/* JADX INFO: renamed from: com.iab.omid.library.bytedance2.publisher.a */
/* JADX INFO: loaded from: classes6.dex */
public class C10992a extends AdSessionStatePublisher {
    public C10992a(String str, WebView webView) {
        super(str);
        if (webView != null && !webView.getSettings().getJavaScriptEnabled()) {
            webView.getSettings().setJavaScriptEnabled(true);
        }
        m23539a(webView);
    }
}
