package com.ironsource.adqualitysdk.sdk.p286i;

import android.graphics.Bitmap;
import android.webkit.JsPromptResult;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.js */
/* JADX INFO: loaded from: classes6.dex */
public class C12070js implements InterfaceC12062jk {

    /* JADX INFO: renamed from: ﾒ */
    private static Map<WebView, C12070js> f29722 = new WeakHashMap();

    /* JADX INFO: renamed from: ﻛ */
    private Set<InterfaceC12062jk> f29723 = new HashSet();

    /* JADX INFO: renamed from: ｋ */
    private C12068jq f29724;

    /* JADX INFO: renamed from: ﾇ */
    private String f29725;

    /* JADX INFO: renamed from: ﾒ */
    public static C12070js m30734(WebView webView, String str) {
        C12070js c12070js = f29722.get(webView);
        if (c12070js != null) {
            return c12070js;
        }
        C12070js c12070js2 = new C12070js(webView, str);
        f29722.put(webView, c12070js2);
        return c12070js2;
    }

    private C12070js(WebView webView, String str) {
        this.f29725 = str;
        C12068jq c12068jq = new C12068jq(webView);
        this.f29724 = c12068jq;
        c12068jq.m30725(new AnonymousClass5());
        this.f29724.m30727(new AnonymousClass1());
    }

    /* JADX INFO: renamed from: ﾒ */
    public final void m30741() {
        this.f29724.m30725(new AnonymousClass5());
    }

    /* JADX INFO: renamed from: ｋ */
    public final void m30737() {
        this.f29724.m30727(new AnonymousClass1());
    }

    /* JADX INFO: renamed from: ﾇ */
    public final void m30740(InterfaceC12062jk interfaceC12062jk) {
        this.f29723.add(interfaceC12062jk);
    }

    /* JADX INFO: renamed from: ｋ */
    public final void m30738(InterfaceC12062jk interfaceC12062jk) {
        this.f29723.remove(interfaceC12062jk);
    }

    /* JADX INFO: renamed from: ﻛ */
    public final boolean m30736() {
        return this.f29724.m30726();
    }

    /* JADX INFO: renamed from: ﾇ */
    public final WebView m30739() {
        return this.f29724.m30728();
    }

    /* JADX INFO: renamed from: ﻐ */
    public final C11834az.b m30735() {
        return this.f29724.m30729();
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.InterfaceC12062jk
    /* JADX INFO: renamed from: ｋ */
    public final void mo28313(WebView webView) {
        for (InterfaceC12062jk interfaceC12062jk : new HashSet(this.f29723)) {
            if (interfaceC12062jk != null) {
                interfaceC12062jk.mo28313(webView);
            }
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.InterfaceC12062jk
    /* JADX INFO: renamed from: ﾇ */
    public final void mo28314(WebView webView, String str, String str2) {
        for (InterfaceC12062jk interfaceC12062jk : new HashSet(this.f29723)) {
            if (interfaceC12062jk != null) {
                interfaceC12062jk.mo28314(webView, str, str2);
            }
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.InterfaceC12062jk
    /* JADX INFO: renamed from: ﻐ */
    public final void mo28312(WebView webView, String str, boolean z) {
        for (InterfaceC12062jk interfaceC12062jk : new HashSet(this.f29723)) {
            if (interfaceC12062jk != null) {
                interfaceC12062jk.mo28312(webView, str, z);
            }
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.InterfaceC12062jk
    /* JADX INFO: renamed from: ﻐ */
    public final void mo28311(WebView webView, String str) {
        for (InterfaceC12062jk interfaceC12062jk : new HashSet(this.f29723)) {
            if (interfaceC12062jk != null) {
                interfaceC12062jk.mo28311(webView, str);
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.js$5, reason: invalid class name */
    final class AnonymousClass5 extends WebViewClient {

        /* JADX INFO: renamed from: ｋ */
        private boolean f29730 = false;

        /* JADX INFO: renamed from: ﻐ */
        private boolean f29728 = false;

        /* JADX INFO: renamed from: ﾇ */
        private String f29731 = null;

        AnonymousClass5() {
        }

        @Override // android.webkit.WebViewClient
        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            C12070js.this.mo28313(webView);
            this.f29730 = true;
        }

        @Override // android.webkit.WebViewClient
        public final void onPageFinished(WebView webView, String str) {
            C12070js.this.mo28313(webView);
            this.f29730 = false;
            this.f29728 = true;
            if (this.f29731 == null) {
                this.f29731 = webView.getOriginalUrl();
            }
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (m30742(webView, str)) {
                return true;
            }
            if (this.f29731 == null) {
                this.f29731 = webView.getOriginalUrl();
            }
            C12070js.this.mo28312(webView, str, m30743(webView));
            this.f29728 = true;
            this.f29730 = false;
            return false;
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            return shouldOverrideUrlLoading(webView, webResourceRequest.getUrl().toString());
        }

        /* JADX INFO: renamed from: ﻛ */
        private boolean m30743(WebView webView) {
            if (this.f29730 && this.f29728) {
                return true;
            }
            return (webView.getOriginalUrl() == null || this.f29731 == null || webView.getOriginalUrl().equals(this.f29731)) ? false : true;
        }

        /* JADX INFO: renamed from: ﻐ */
        private boolean m30742(WebView webView, String str) {
            if (!str.startsWith(C12070js.this.f29725)) {
                return false;
            }
            this.f29731 = webView.getOriginalUrl();
            String strSubstring = str.substring(C12070js.this.f29725.length());
            C12070js c12070js = C12070js.this;
            c12070js.mo28314(webView, c12070js.f29725, strSubstring);
            return true;
        }
    }

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.js$1, reason: invalid class name */
    final class AnonymousClass1 extends WebChromeClient {

        /* JADX INFO: renamed from: ﾒ */
        private boolean f29727 = false;

        AnonymousClass1() {
        }

        @Override // android.webkit.WebChromeClient
        public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
            C12070js.this.mo28311(webView, str2);
            return false;
        }

        @Override // android.webkit.WebChromeClient
        public final void onProgressChanged(WebView webView, int i) {
            if (i != 100 || this.f29727) {
                return;
            }
            this.f29727 = true;
            C12070js.this.mo28313(webView);
        }
    }
}
