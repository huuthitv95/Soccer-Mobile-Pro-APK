package p000a.p001a.p002a;

import android.net.Uri;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.gadsme.nativeplugin.Plugin;
import com.gadsme.nativeplugin.WebTexture;
import java.io.ByteArrayInputStream;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: a.a.a.c */
/* JADX INFO: loaded from: classes.dex */
public class C0003c extends WebViewClient {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ WebTexture f2a;

    public C0003c(WebTexture webTexture) {
        this.f2a = webTexture;
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        boolean z;
        boolean z2;
        boolean z3;
        super.onPageFinished(webView, str);
        synchronized (this.f2a) {
            z = this.f2a.f21778d;
            z2 = this.f2a.f21781g;
            z3 = this.f2a.f21797w;
        }
        if (z || z2 || z3) {
            return;
        }
        synchronized (this.f2a) {
            if (WebTexture.isRemoteDebugEnabled()) {
                WebTexture.remoteDebugLog("WEBVIEW", "isLoadOrError=true (onPageFinished())");
            }
            this.f2a.f21797w = true;
            this.f2a.f21778d = true;
        }
        Plugin.SendMessage("WebTexture", this.f2a.f21796v, "pageLoaded");
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i, String str, String str2) {
        boolean z;
        boolean z2;
        String str3;
        super.onReceivedError(webView, i, str, str2);
        synchronized (this.f2a) {
            z = this.f2a.f21780f;
            z2 = this.f2a.f21797w;
        }
        if (z || z2) {
            return;
        }
        synchronized (this.f2a) {
            this.f2a.f21780f = true;
            str3 = this.f2a.f21782h;
        }
        if (str3 == null || !str3.equals(str2)) {
            return;
        }
        synchronized (this.f2a) {
            if (WebTexture.isRemoteDebugEnabled()) {
                WebTexture.remoteDebugLog("WEBVIEW", "isLoadOrError=true (onReceivedError() 1)");
            }
            this.f2a.f21797w = true;
            this.f2a.f21781g = true;
        }
        Plugin.SendMessage("WebTexture", this.f2a.f21796v, "pageError");
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        if (WebTexture.f21766H == null || !webResourceRequest.getUrl().toString().endsWith("mraid.js")) {
            return super.shouldInterceptRequest(webView, webResourceRequest);
        }
        WebTexture webTexture = this.f2a;
        if (webTexture.f21770A) {
            return new WebResourceResponse("text/javascript", "UTF-8", new ByteArrayInputStream("".getBytes(Charset.forName("UTF-8"))));
        }
        webTexture.f21770A = true;
        return new WebResourceResponse("text/javascript", "UTF-8", new ByteArrayInputStream(WebTexture.f21766H.getBytes(Charset.forName("UTF-8"))));
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        boolean z;
        String string = webResourceRequest.getUrl().toString();
        synchronized (this.f2a) {
            z = this.f2a.f21778d;
        }
        if (string == null) {
            return false;
        }
        WebTexture webTexture = this.f2a;
        if (webTexture.f21784j && z) {
            return WebTexture.m22098a(webTexture, string);
        }
        return false;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        boolean z;
        synchronized (this.f2a) {
            z = this.f2a.f21778d;
        }
        if (str == null) {
            return false;
        }
        WebTexture webTexture = this.f2a;
        if (webTexture.f21784j && z) {
            return WebTexture.m22098a(webTexture, str);
        }
        return false;
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        boolean z;
        boolean z2;
        Uri url;
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        synchronized (this.f2a) {
            z = this.f2a.f21780f;
            z2 = this.f2a.f21797w;
        }
        if (z || z2) {
            return;
        }
        synchronized (this.f2a) {
            if (WebTexture.isRemoteDebugEnabled()) {
                WebTexture.remoteDebugLog("WEBVIEW", "isLoadOrError=true (onReceivedError() 2)");
            }
            this.f2a.f21797w = true;
            this.f2a.f21780f = true;
        }
        if (this.f2a.f21782h == null || (url = webResourceRequest.getUrl()) == null || !this.f2a.f21782h.equals(url.toString())) {
            return;
        }
        this.f2a.f21781g = true;
        Plugin.SendMessage("WebTexture", this.f2a.f21796v, "pageError");
    }
}
