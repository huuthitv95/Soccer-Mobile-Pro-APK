package com.iab.omid.library.applovin.internal;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import com.iab.omid.library.applovin.adsession.ErrorType;
import com.iab.omid.library.applovin.utils.C10947d;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.iab.omid.library.applovin.internal.h */
/* JADX INFO: loaded from: classes6.dex */
public class C10934h {

    /* JADX INFO: renamed from: a */
    private static C10934h f22720a = new C10934h();

    /* JADX INFO: renamed from: com.iab.omid.library.applovin.internal.h$a */
    class a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ WebView f22721a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f22722b;

        a(WebView webView, String str) {
            this.f22721a = webView;
            this.f22722b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            C10934h.this.m23269c(this.f22721a, this.f22722b);
        }
    }

    private C10934h() {
    }

    /* JADX INFO: renamed from: a */
    public static final C10934h m23253a() {
        return f22720a;
    }

    /* JADX INFO: renamed from: a */
    public void m23254a(WebView webView, String str) {
        m23261a(webView, "finishSession", str);
    }

    /* JADX INFO: renamed from: a */
    public void m23255a(WebView webView, String str, float f) {
        m23261a(webView, "setDeviceVolume", Float.valueOf(f), str);
    }

    /* JADX INFO: renamed from: a */
    public void m23256a(WebView webView, String str, ErrorType errorType, String str2) {
        m23261a(webView, "error", errorType.toString(), str2, str);
    }

    /* JADX INFO: renamed from: a */
    public void m23257a(WebView webView, String str, String str2) {
        m23261a(webView, "setDeviceLockState", str2);
    }

    /* JADX INFO: renamed from: a */
    public void m23258a(WebView webView, String str, String str2, JSONObject jSONObject) {
        m23261a(webView, "publishMediaEvent", str2, jSONObject, str);
    }

    /* JADX INFO: renamed from: a */
    public void m23259a(WebView webView, String str, JSONObject jSONObject) {
        m23261a(webView, "init", jSONObject, str);
    }

    /* JADX INFO: renamed from: a */
    public void m23260a(WebView webView, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        m23261a(webView, "startSession", str, jSONObject, jSONObject2, jSONObject3);
    }

    /* JADX INFO: renamed from: a */
    void m23261a(WebView webView, String str, Object... objArr) {
        if (webView == null) {
            C10947d.m23346a("The WebView is null for " + str);
            return;
        }
        StringBuilder sb = new StringBuilder(128);
        sb.append("if(window.omidBridge!==undefined){omidBridge.");
        sb.append(str);
        sb.append("(");
        m23264a(sb, objArr);
        sb.append(")}");
        m23262a(webView, sb);
    }

    /* JADX INFO: renamed from: a */
    void m23262a(WebView webView, StringBuilder sb) {
        String string = sb.toString();
        Handler handler = webView.getHandler();
        if (handler == null || Looper.myLooper() == handler.getLooper()) {
            m23269c(webView, string);
        } else {
            handler.post(new a(webView, string));
        }
    }

    /* JADX INFO: renamed from: a */
    public void m23263a(WebView webView, JSONObject jSONObject) {
        m23261a(webView, "setLastActivity", jSONObject);
    }

    /* JADX INFO: renamed from: a */
    void m23264a(StringBuilder sb, Object[] objArr) {
        String string;
        if (objArr == null || objArr.length <= 0) {
            return;
        }
        for (Object obj : objArr) {
            if (obj == null) {
                string = AbstractJsonLexerKt.NULL;
            } else {
                if (obj instanceof String) {
                    string = obj.toString();
                    if (!string.startsWith("{")) {
                        sb.append('\"');
                        sb.append(string);
                        sb.append('\"');
                    }
                } else {
                    sb.append(obj);
                }
                sb.append(",");
            }
            sb.append(string);
            sb.append(",");
        }
        sb.setLength(sb.length() - 1);
    }

    /* JADX INFO: renamed from: b */
    public void m23265b(WebView webView, String str) {
        m23261a(webView, "publishImpressionEvent", str);
    }

    /* JADX INFO: renamed from: b */
    public void m23266b(WebView webView, String str, String str2) {
        m23261a(webView, "setNativeViewHierarchy", str2, str);
    }

    /* JADX INFO: renamed from: b */
    public void m23267b(WebView webView, String str, JSONObject jSONObject) {
        m23261a(webView, "publishLoadedEvent", jSONObject, str);
    }

    /* JADX INFO: renamed from: c */
    public void m23268c(WebView webView, String str, String str2) {
        m23261a(webView, "setState", str2, str);
    }

    /* JADX INFO: renamed from: c */
    public boolean m23269c(WebView webView, String str) {
        if (webView == null || TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            webView.evaluateJavascript(str, null);
            return true;
        } catch (IllegalStateException unused) {
            webView.loadUrl("javascript: " + str);
            return true;
        }
    }

    /* JADX INFO: renamed from: d */
    public void m23270d(WebView webView, String str, String str2) {
        if (str == null || TextUtils.isEmpty(str2)) {
            return;
        }
        m23269c(webView, "(function() {this.omidVerificationProperties = this.omidVerificationProperties || {};Object.defineProperty(this.omidVerificationProperties, 'injectionId', {get: function() {var currentScript = document && document.currentScript;return currentScript && currentScript.getAttribute('data-injection-id');}, configurable: true});var script = document.createElement('script');script.setAttribute(\"type\",\"text/javascript\");script.setAttribute(\"src\",\"%SCRIPT_SRC%\");script.setAttribute(\"data-injection-id\",\"%INJECTION_ID%\");document.body.appendChild(script);})();".replace("%SCRIPT_SRC%", str).replace("%INJECTION_ID%", str2));
    }
}
