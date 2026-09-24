package com.mbridge.msdk.splash.view;

import android.graphics.Bitmap;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.mbridge.msdk.click.utils.C12704a;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.mbsignalcommon.base.C13349b;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.setting.util.C13645a;
import com.mbridge.msdk.splash.middle.InterfaceC13661a;
import com.mbridge.msdk.splash.signal.C13678b;

/* JADX INFO: renamed from: com.mbridge.msdk.splash.view.a */
/* JADX INFO: compiled from: SplashWebViewClient.java */
/* JADX INFO: loaded from: classes7.dex */
public class C13701a extends C13349b {

    /* JADX INFO: renamed from: c */
    private final String f38524c = "SplashWebViewClient";

    /* JADX INFO: renamed from: d */
    InterfaceC13661a f38525d;

    /* JADX INFO: renamed from: com.mbridge.msdk.splash.view.a$a */
    /* JADX INFO: compiled from: SplashWebViewClient.java */
    class a implements ValueCallback<String> {
        a() {
        }

        @Override // android.webkit.ValueCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onReceiveValue(String str) {
        }
    }

    /* JADX INFO: renamed from: a */
    public void m40139a(InterfaceC13661a interfaceC13661a) {
        if (interfaceC13661a != null) {
            this.f38525d = interfaceC13661a;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        try {
            webView.evaluateJavascript("javascript:" + C13645a.m39758a().m39764b(), new a());
        } catch (Throwable th) {
            C13219q0.m37817b("SplashWebViewClient", "onPageStarted", th);
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.base.C13349b, android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        try {
            WindVaneWebView windVaneWebView = (WindVaneWebView) webView;
            if (System.currentTimeMillis() - windVaneWebView.lastTouchTime > C12704a.f33795d && C12704a.m34808a(((C13678b) windVaneWebView.getObject()).m40068b().get(0), windVaneWebView.getUrl(), C12704a.f33793b)) {
                return false;
            }
            InterfaceC13661a interfaceC13661a = this.f38525d;
            if (interfaceC13661a == null) {
                return true;
            }
            interfaceC13661a.mo39873a(false, str);
            return true;
        } catch (Throwable th) {
            C13219q0.m37817b("SplashWebViewClient", "shouldOverrideUrlLoading", th);
            return false;
        }
    }
}
