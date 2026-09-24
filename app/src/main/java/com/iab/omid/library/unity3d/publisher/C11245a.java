package com.iab.omid.library.unity3d.publisher;

import android.webkit.WebView;

/* JADX INFO: renamed from: com.iab.omid.library.unity3d.publisher.a */
/* JADX INFO: loaded from: classes6.dex */
public class C11245a extends AdSessionStatePublisher {
    public C11245a(String str, WebView webView) {
        super(str);
        if (webView != null && !webView.getSettings().getJavaScriptEnabled()) {
            webView.getSettings().setJavaScriptEnabled(true);
        }
        m24798a(webView);
    }
}
