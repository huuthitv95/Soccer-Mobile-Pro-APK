package com.iab.omid.library.chartboost.internal;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import com.iab.omid.library.chartboost.adsession.ErrorType;
import com.iab.omid.library.chartboost.utils.C11049d;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.iab.omid.library.chartboost.internal.h */
/* JADX INFO: loaded from: classes6.dex */
public class C11036h {

    /* JADX INFO: renamed from: a */
    private static C11036h f22990a = new C11036h();

    /* JADX INFO: renamed from: com.iab.omid.library.chartboost.internal.h$a */
    class a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ WebView f22991a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f22992b;

        a(WebView webView, String str) {
            this.f22991a = webView;
            this.f22992b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            C11036h.this.m23769c(this.f22991a, this.f22992b);
        }
    }

    private C11036h() {
    }

    /* JADX INFO: renamed from: a */
    public static final C11036h m23753a() {
        return f22990a;
    }

    /* JADX INFO: renamed from: a */
    public void m23754a(WebView webView, String str) {
        m23761a(webView, "finishSession", str);
    }

    /* JADX INFO: renamed from: a */
    public void m23755a(WebView webView, String str, float f) {
        m23761a(webView, "setDeviceVolume", Float.valueOf(f), str);
    }

    /* JADX INFO: renamed from: a */
    public void m23756a(WebView webView, String str, ErrorType errorType, String str2) {
        m23761a(webView, "error", errorType.toString(), str2, str);
    }

    /* JADX INFO: renamed from: a */
    public void m23757a(WebView webView, String str, String str2) {
        m23761a(webView, "setDeviceLockState", str2);
    }

    /* JADX INFO: renamed from: a */
    public void m23758a(WebView webView, String str, String str2, JSONObject jSONObject) {
        m23761a(webView, "publishMediaEvent", str2, jSONObject, str);
    }

    /* JADX INFO: renamed from: a */
    public void m23759a(WebView webView, String str, JSONObject jSONObject) {
        m23761a(webView, "init", jSONObject, str);
    }

    /* JADX INFO: renamed from: a */
    public void m23760a(WebView webView, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        m23761a(webView, "startSession", str, jSONObject, jSONObject2, jSONObject3);
    }

    /* JADX INFO: renamed from: a */
    void m23761a(WebView webView, String str, Object... objArr) {
        if (webView == null) {
            C11049d.m23847a("The WebView is null for " + str);
            return;
        }
        StringBuilder sb = new StringBuilder(128);
        sb.append("if(window.omidBridge!==undefined){omidBridge.");
        sb.append(str);
        sb.append("(");
        m23764a(sb, objArr);
        sb.append(")}");
        m23762a(webView, sb);
    }

    /* JADX INFO: renamed from: a */
    void m23762a(WebView webView, StringBuilder sb) {
        String string = sb.toString();
        Handler handler = webView.getHandler();
        if (handler == null) {
            handler = new Handler(Looper.getMainLooper());
        }
        if (Looper.myLooper() == handler.getLooper()) {
            m23769c(webView, string);
        } else {
            handler.post(new a(webView, string));
        }
    }

    /* JADX INFO: renamed from: a */
    public void m23763a(WebView webView, JSONObject jSONObject) {
        m23761a(webView, "setLastActivity", jSONObject);
    }

    /* JADX INFO: renamed from: a */
    void m23764a(StringBuilder sb, Object[] objArr) {
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
    public void m23765b(WebView webView, String str) {
        m23761a(webView, "publishImpressionEvent", str);
    }

    /* JADX INFO: renamed from: b */
    public void m23766b(WebView webView, String str, String str2) {
        m23761a(webView, "setNativeViewHierarchy", str2, str);
    }

    /* JADX INFO: renamed from: b */
    public void m23767b(WebView webView, String str, JSONObject jSONObject) {
        m23761a(webView, "publishLoadedEvent", jSONObject, str);
    }

    /* JADX INFO: renamed from: c */
    public void m23768c(WebView webView, String str, String str2) {
        m23761a(webView, "setState", str2, str);
    }

    /* JADX INFO: renamed from: c */
    public boolean m23769c(WebView webView, String str) {
        if (webView != null && !TextUtils.isEmpty(str)) {
            try {
                try {
                    webView.evaluateJavascript(str, null);
                    return true;
                } catch (IllegalStateException unused) {
                    webView.loadUrl("javascript: " + str);
                    return true;
                }
            } catch (Exception e) {
                C11049d.m23849b("Unable to inject javascript: " + e.getMessage());
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public void m23770d(WebView webView, String str, String str2) {
        if (str == null || TextUtils.isEmpty(str2)) {
            return;
        }
        m23769c(webView, "(function() {this.omidVerificationProperties = this.omidVerificationProperties || {};Object.defineProperty(this.omidVerificationProperties, 'injectionId', {get: function() {var currentScript = document && document.currentScript;return currentScript && currentScript.getAttribute('data-injection-id');}, configurable: true});var script = document.createElement('script');script.setAttribute(\"type\",\"text/javascript\");script.setAttribute(\"src\",\"%SCRIPT_SRC%\");script.setAttribute(\"data-injection-id\",\"%INJECTION_ID%\");document.body.appendChild(script);})();".replace("%SCRIPT_SRC%", str).replace("%INJECTION_ID%", str2));
    }
}
