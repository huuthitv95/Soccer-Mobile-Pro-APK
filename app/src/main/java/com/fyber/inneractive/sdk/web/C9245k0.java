package com.fyber.inneractive.sdk.web;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.webkit.ProxyConfig;
import com.fyber.inneractive.sdk.util.AbstractC9186s;
import com.fyber.inneractive.sdk.util.AbstractC9195v;
import com.fyber.inneractive.sdk.util.C9147f;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.ByteArrayInputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.web.k0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9245k0 extends WebViewClient {

    /* JADX INFO: renamed from: a */
    public final boolean f21634a;

    /* JADX INFO: renamed from: b */
    public final int f21635b;

    /* JADX INFO: renamed from: c */
    public final int f21636c;

    /* JADX INFO: renamed from: d */
    public final int f21637d;

    /* JADX INFO: renamed from: e */
    public InterfaceC9241j f21638e;

    public C9245k0(InterfaceC9241j interfaceC9241j, boolean z, int i, int i2, int i3) {
        this.f21638e = interfaceC9241j;
        this.f21634a = z;
        this.f21635b = i;
        this.f21636c = i2;
        this.f21637d = i3;
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        super.onLoadResource(webView, str);
        IAlog.m21949e("Resources to load: %s", str);
        IAlog.m21948d("%s %s", "RESOURCES", str);
        InterfaceC9241j interfaceC9241j = this.f21638e;
        if (interfaceC9241j != null) {
            AbstractC9238i abstractC9238i = (AbstractC9238i) interfaceC9241j;
            if (TextUtils.isEmpty(str) || !str.startsWith("http://") || AbstractC9186s.m22012a()) {
                return;
            }
            IAlog.m21945a("%s Found a portential unsecure resource url: %s", IAlog.m21943a(abstractC9238i), str);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        IAlog.m21949e("onPageFinished - url: %s", str);
        InterfaceC9241j interfaceC9241j = this.f21638e;
        if (interfaceC9241j != null) {
            interfaceC9241j.mo22045a(webView);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        IAlog.m21949e("onPageStarted - url: %s", str);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        IAlog.m21949e("%sError: code = %d text = %s WebView = %s", IAlog.m21943a(this), Integer.valueOf(i), str, webView);
        super.onReceivedError(webView, i, str, str2);
        InterfaceC9241j interfaceC9241j = this.f21638e;
        if (interfaceC9241j != null) {
            interfaceC9241j.mo22048d();
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        IAlog.m21945a("onWebViewRenderProcessGone called for web view! %s", webView);
        if (webView != null) {
            AbstractC9195v.m22027a(webView);
            webView.destroy();
        }
        InterfaceC9241j interfaceC9241j = this.f21638e;
        if (interfaceC9241j != null) {
            interfaceC9241j.mo22044a();
        }
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        URL url;
        HttpURLConnection httpURLConnection;
        if (this.f21634a && webResourceRequest != null) {
            IAlog.m21949e("shouldInterceptRequest, method = %s", webResourceRequest.getMethod());
            C9219b1 c9219b1 = C9219b1.f21525c;
            int i = this.f21635b;
            int i2 = this.f21636c;
            int i3 = this.f21637d;
            c9219b1.getClass();
            WebResourceResponse webResourceResponse = null;
            if (webResourceRequest.getUrl() != null && webResourceRequest.getUrl().getScheme() != null && webResourceRequest.getUrl().getScheme().startsWith(ProxyConfig.MATCH_HTTP) && TextUtils.equals(webResourceRequest.getMethod(), "GET")) {
                C9222c1 c9222c1 = (C9222c1) c9219b1.f21526a.get(new C9225d1(webResourceRequest));
                if (c9222c1 != null) {
                    webResourceResponse = new WebResourceResponse(c9222c1.f21532c, c9222c1.f21533d, c9222c1.f21534e, c9222c1.f21535f, c9222c1.f21531b, new ByteArrayInputStream(c9222c1.f21530a));
                } else {
                    try {
                        url = new URL(webResourceRequest.getUrl().toString());
                    } catch (MalformedURLException unused) {
                        url = null;
                    }
                    if (url != null) {
                        ByteBuffer byteBufferAllocateDirect = (ByteBuffer) C9147f.f21448b.f21449a.poll();
                        if (byteBufferAllocateDirect == null) {
                            byteBufferAllocateDirect = ByteBuffer.allocateDirect(16384);
                        }
                        try {
                            httpURLConnection = (HttpURLConnection) url.openConnection();
                            try {
                                httpURLConnection.setRequestMethod(webResourceRequest.getMethod());
                                httpURLConnection.setInstanceFollowRedirects(false);
                                C9219b1.m22050a(webResourceRequest, httpURLConnection);
                            } catch (Throwable unused2) {
                            }
                        } catch (Throwable unused3) {
                            httpURLConnection = null;
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.setConnectTimeout(i);
                            httpURLConnection.setReadTimeout(i2);
                            C9222c1 c9222c1M22049a = null;
                            while (i3 > 0) {
                                try {
                                    c9222c1M22049a = C9219b1.m22049a(httpURLConnection, byteBufferAllocateDirect);
                                } catch (SocketTimeoutException | UnknownHostException unused4) {
                                } catch (Throwable unused5) {
                                    i3 = 0;
                                }
                                if (c9222c1M22049a != null) {
                                    break;
                                }
                                i3--;
                            }
                            if (c9222c1M22049a != null) {
                                try {
                                    if (c9222c1M22049a.m22051a()) {
                                        c9219b1.f21526a.put(new C9225d1(webResourceRequest), c9222c1M22049a);
                                    }
                                    WebResourceResponse webResourceResponse2 = new WebResourceResponse(c9222c1M22049a.f21532c, c9222c1M22049a.f21533d, c9222c1M22049a.f21534e, c9222c1M22049a.f21535f, c9222c1M22049a.f21531b, new ByteArrayInputStream(c9222c1M22049a.f21530a));
                                    httpURLConnection.disconnect();
                                    C9147f.f21448b.f21449a.offer(byteBufferAllocateDirect);
                                    webResourceResponse = webResourceResponse2;
                                } catch (Throwable unused6) {
                                    httpURLConnection.disconnect();
                                    C9147f.f21448b.f21449a.offer(byteBufferAllocateDirect);
                                }
                            } else {
                                httpURLConnection.disconnect();
                            }
                            C9147f.f21448b.f21449a.offer(byteBufferAllocateDirect);
                        }
                    }
                }
            }
            if (webResourceResponse != null) {
                return webResourceResponse;
            }
            IAlog.m21949e("shouldInterceptRequest did not intercept %s", webResourceRequest.getUrl());
        }
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        super.shouldOverrideUrlLoading(webView, str);
        InterfaceC9241j interfaceC9241j = this.f21638e;
        return interfaceC9241j != null && interfaceC9241j.mo21934a(webView, str);
    }
}
