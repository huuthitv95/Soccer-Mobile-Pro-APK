package com.mbridge.msdk.config.dynamic.baseview.webview.client;

import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.mbridge.msdk.config.dynamic.baseview.webview.listener.InterfaceC12891a;

/* JADX INFO: renamed from: com.mbridge.msdk.config.dynamic.baseview.webview.client.a */
/* JADX INFO: compiled from: MBWebChromeClient.java */
/* JADX INFO: loaded from: classes5.dex */
public class C12889a extends WebChromeClient {

    /* JADX INFO: renamed from: a */
    private final String f34692a = "MBWebChromeClient";

    /* JADX INFO: renamed from: b */
    private InterfaceC12891a f34693b;

    /* JADX INFO: renamed from: a */
    public void m36036a(InterfaceC12891a interfaceC12891a) {
        this.f34693b = interfaceC12891a;
    }

    @Override // android.webkit.WebChromeClient
    public void onProgressChanged(WebView webView, int i) {
        super.onProgressChanged(webView, i);
        InterfaceC12891a interfaceC12891a = this.f34693b;
        if (interfaceC12891a != null) {
            interfaceC12891a.onProgressChanged(webView, i);
        }
    }
}
