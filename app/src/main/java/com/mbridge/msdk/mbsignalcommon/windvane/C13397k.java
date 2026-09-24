package com.mbridge.msdk.mbsignalcommon.windvane;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.ironsource.C11341A5;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.same.image.C13099a;
import com.mbridge.msdk.foundation.same.image.C13100b;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.mbsignalcommon.base.C13349b;

/* JADX INFO: renamed from: com.mbridge.msdk.mbsignalcommon.windvane.k */
/* JADX INFO: compiled from: WindVaneWebViewClient.java */
/* JADX INFO: loaded from: classes6.dex */
public class C13397k extends C13349b {

    /* JADX INFO: renamed from: c */
    protected String f37196c = null;

    /* JADX INFO: renamed from: d */
    private int f37197d = 0;

    /* JADX INFO: renamed from: e */
    private InterfaceC13389c f37198e;

    /* JADX INFO: renamed from: a */
    private WebResourceResponse m38744a(String str) {
        try {
            if (TextUtils.isEmpty(str) || !C13395i.m38741e(str)) {
                return null;
            }
            C13219q0.m37818c("WindVaneWebViewClient", "is image " + str);
            Bitmap bitmapM37156b = C13100b.m37152a(C13008c.m36588n().m36542d()).m37156b(str);
            C13219q0.m37818c("WindVaneWebViewClient", "find image from cache " + str);
            if (bitmapM37156b == null || bitmapM37156b.isRecycled()) {
                return null;
            }
            return new WebResourceResponse(C13395i.m38738b(str), C11341A5.f23802O, C13099a.m37151a(bitmapM37156b));
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        this.f37196c = str;
        InterfaceC13389c interfaceC13389c = this.f37198e;
        if (interfaceC13389c != null) {
            interfaceC13389c.onPageStarted(webView, str, bitmap);
        }
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        WebResourceResponse webResourceResponseM38744a = m38744a(str);
        if (webResourceResponseM38744a == null) {
            return super.shouldInterceptRequest(webView, str);
        }
        C13219q0.m37818c("WindVaneWebViewClient", "find WebResourceResponse url is " + str);
        return webResourceResponseM38744a;
    }
}
