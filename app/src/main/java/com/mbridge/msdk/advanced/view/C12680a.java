package com.mbridge.msdk.advanced.view;

import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.ValueCallback;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.webkit.ProxyConfig;
import com.facebook.share.internal.ShareConstants;
import com.google.common.net.HttpHeaders;
import com.ironsource.C11341A5;
import com.ironsource.C11744X3;
import com.mbridge.msdk.advanced.middle.C12661c;
import com.mbridge.msdk.advanced.middle.InterfaceC12659a;
import com.mbridge.msdk.advanced.signal.C12676b;
import com.mbridge.msdk.click.utils.C12704a;
import com.mbridge.msdk.foundation.same.directory.C13098e;
import com.mbridge.msdk.foundation.same.directory.EnumC13096c;
import com.mbridge.msdk.foundation.tools.C13207k0;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.mbsignalcommon.base.C13349b;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.setting.util.C13645a;
import com.vungle.ads.internal.model.AdPayload;
import java.io.FileInputStream;
import java.net.URLDecoder;
import java.util.HashMap;

/* JADX INFO: renamed from: com.mbridge.msdk.advanced.view.a */
/* JADX INFO: compiled from: NativeAdvancedWebViewClient.java */
/* JADX INFO: loaded from: classes4.dex */
public class C12680a extends C13349b {

    /* JADX INFO: renamed from: c */
    private final String f33607c = "NativeAdvancedWebViewClient";

    /* JADX INFO: renamed from: d */
    private final String f33608d;

    /* JADX INFO: renamed from: e */
    private final String f33609e;

    /* JADX INFO: renamed from: f */
    String f33610f;

    /* JADX INFO: renamed from: g */
    InterfaceC12659a f33611g;

    /* JADX INFO: renamed from: h */
    private C12661c f33612h;

    /* JADX INFO: renamed from: com.mbridge.msdk.advanced.view.a$a */
    /* JADX INFO: compiled from: NativeAdvancedWebViewClient.java */
    class a implements ValueCallback<String> {
        a() {
        }

        @Override // android.webkit.ValueCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onReceiveValue(String str) {
        }
    }

    public C12680a(String str, InterfaceC12659a interfaceC12659a, C12661c c12661c) {
        EnumC13096c enumC13096c = EnumC13096c.MBRIDGE_VC;
        this.f33608d = C13098e.m37149b(enumC13096c) != null ? C13098e.m37149b(enumC13096c) : C13207k0.m37712a("YkRXhr5AWBPfNgzuH7JQ+2Ha");
        this.f33609e = C13207k0.m37712a("Y+xgWkl2");
        this.f33610f = str;
        this.f33611g = interfaceC12659a;
        this.f33612h = c12661c;
    }

    /* JADX INFO: renamed from: a */
    private WebResourceResponse m34593a(WebView webView, String str) {
        if (!TextUtils.isEmpty(str) && this.f33612h != null) {
            try {
                String strM34504a = "";
                if (str.startsWith(C11744X3.i.f26356b) && str.startsWith(this.f33608d)) {
                    strM34504a = str.replace(AdPayload.FILE_SCHEME, "");
                }
                if (m34594a(str)) {
                    strM34504a = this.f33612h.m34504a(URLDecoder.decode(Uri.parse(str).getQueryParameter(ShareConstants.MEDIA_URI)));
                }
                if (!TextUtils.isEmpty(strM34504a) && m38609a(strM34504a, this.f33608d)) {
                    C13219q0.m37813a("NativeAdvancedWebViewClient", "replace url : " + strM34504a);
                    if (!strM34504a.contains("127.0.0.1") && !strM34504a.startsWith(ProxyConfig.MATCH_HTTP)) {
                        HashMap map = new HashMap();
                        map.put(HttpHeaders.ACCESS_CONTROL_ALLOW_ORIGIN, ProxyConfig.MATCH_ALL_SCHEMES);
                        WebResourceResponse webResourceResponse = new WebResourceResponse("video/mp4", C11341A5.f23802O, new FileInputStream(strM34504a));
                        webResourceResponse.setResponseHeaders(map);
                        return webResourceResponse;
                    }
                    return null;
                }
            } catch (Throwable th) {
                C13219q0.m37816b("NativeAdvancedWebViewClient", th.getMessage());
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    private boolean m34594a(String str) {
        Uri uri;
        String scheme;
        if (TextUtils.isEmpty(str) || (uri = Uri.parse(str)) == null || (scheme = uri.getScheme()) == null || TextUtils.isEmpty(scheme)) {
            return false;
        }
        return scheme.equals(this.f33609e) || scheme.equals("mb-h5");
    }

    /* JADX INFO: renamed from: b */
    public void m34595b() {
        if (this.f33612h != null) {
            this.f33612h = null;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        try {
            webView.evaluateJavascript("javascript:" + C13645a.m39758a().m39764b(), new a());
        } catch (Throwable th) {
            C13219q0.m37817b("NativeAdvancedWebViewClient", "onPageStarted", th);
        }
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        return m34593a(webView, webResourceRequest.getUrl().toString());
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return m34593a(webView, str);
    }

    @Override // com.mbridge.msdk.mbsignalcommon.base.C13349b, android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        try {
            try {
                WindVaneWebView windVaneWebView = (WindVaneWebView) webView;
                if (System.currentTimeMillis() - windVaneWebView.lastTouchTime > C12704a.f33795d && C12704a.m34808a(((C12676b) windVaneWebView.getObject()).m34579a().get(0), windVaneWebView.getUrl(), C12704a.f33793b)) {
                    return false;
                }
            } catch (Exception e) {
                C13219q0.m37816b("NativeAdvancedWebViewClient", e.getMessage());
            }
            C13219q0.m37816b("NativeAdvancedWebViewClient", "Use html to open url.");
            InterfaceC12659a interfaceC12659a = this.f33611g;
            if (interfaceC12659a == null) {
                return true;
            }
            interfaceC12659a.mo34410a(false, str);
            return true;
        } catch (Throwable th) {
            C13219q0.m37817b("NativeAdvancedWebViewClient", "shouldOverrideUrlLoading", th);
            return false;
        }
    }
}
