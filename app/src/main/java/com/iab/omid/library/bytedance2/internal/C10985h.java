package com.iab.omid.library.bytedance2.internal;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import com.iab.omid.library.bytedance2.adsession.ErrorType;
import com.iab.omid.library.bytedance2.utils.C10997d;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.iab.omid.library.bytedance2.internal.h */
/* JADX INFO: loaded from: classes6.dex */
public class C10985h {

    /* JADX INFO: renamed from: a */
    private static C10985h f22855a = new C10985h();

    /* JADX INFO: renamed from: com.iab.omid.library.bytedance2.internal.h$a */
    class a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ WebView f22856a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f22857b;

        a(WebView webView, String str) {
            this.f22856a = webView;
            this.f22857b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            C10985h.this.m23522c(this.f22856a, this.f22857b);
        }
    }

    private C10985h() {
    }

    /* JADX INFO: renamed from: a */
    public static final C10985h m23506a() {
        return f22855a;
    }

    /* JADX INFO: renamed from: a */
    public void m23507a(WebView webView, String str) {
        m23514a(webView, "finishSession", str);
    }

    /* JADX INFO: renamed from: a */
    public void m23508a(WebView webView, String str, float f) {
        m23514a(webView, "setDeviceVolume", Float.valueOf(f), str);
    }

    /* JADX INFO: renamed from: a */
    public void m23509a(WebView webView, String str, ErrorType errorType, String str2) {
        m23514a(webView, "error", errorType.toString(), str2, str);
    }

    /* JADX INFO: renamed from: a */
    public void m23510a(WebView webView, String str, String str2) {
        m23514a(webView, "setNativeViewHierarchy", str2, str);
    }

    /* JADX INFO: renamed from: a */
    public void m23511a(WebView webView, String str, String str2, JSONObject jSONObject) {
        m23514a(webView, "publishMediaEvent", str2, jSONObject, str);
    }

    /* JADX INFO: renamed from: a */
    public void m23512a(WebView webView, String str, JSONObject jSONObject) {
        m23514a(webView, "init", jSONObject, str);
    }

    /* JADX INFO: renamed from: a */
    public void m23513a(WebView webView, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        m23514a(webView, "startSession", str, jSONObject, jSONObject2, jSONObject3);
    }

    /* JADX INFO: renamed from: a */
    void m23514a(WebView webView, String str, Object... objArr) {
        if (webView == null) {
            C10997d.m23590a("The WebView is null for ".concat(String.valueOf(str)));
            return;
        }
        StringBuilder sb = new StringBuilder(128);
        sb.append("if(window.omidBridge!==undefined){omidBridge.");
        sb.append(str);
        sb.append("(");
        m23517a(sb, objArr);
        sb.append(")}");
        m23515a(webView, sb);
    }

    /* JADX INFO: renamed from: a */
    void m23515a(WebView webView, StringBuilder sb) {
        String string = sb.toString();
        Handler handler = webView.getHandler();
        if (handler == null || Looper.myLooper() == handler.getLooper()) {
            m23522c(webView, string);
        } else {
            handler.post(new a(webView, string));
        }
    }

    /* JADX INFO: renamed from: a */
    public void m23516a(WebView webView, JSONObject jSONObject) {
        m23514a(webView, "setLastActivity", jSONObject);
    }

    /* JADX INFO: renamed from: a */
    void m23517a(StringBuilder sb, Object[] objArr) {
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
    public void m23518b(WebView webView, String str) {
        m23514a(webView, "publishImpressionEvent", str);
    }

    /* JADX INFO: renamed from: b */
    public void m23519b(WebView webView, String str, String str2) {
        m23514a(webView, "setState", str2, str);
    }

    /* JADX INFO: renamed from: b */
    public void m23520b(WebView webView, String str, JSONObject jSONObject) {
        m23514a(webView, "publishLoadedEvent", jSONObject, str);
    }

    /* JADX INFO: renamed from: c */
    public void m23521c(WebView webView, String str, String str2) {
        if (str == null || TextUtils.isEmpty(str2)) {
            return;
        }
        m23522c(webView, "(function() {this.omidVerificationProperties = this.omidVerificationProperties || {};Object.defineProperty(this.omidVerificationProperties, 'injectionId', {get: function() {var currentScript = document && document.currentScript;return currentScript && currentScript.getAttribute('data-injection-id');}, configurable: true});var script = document.createElement('script');script.setAttribute(\"type\",\"text/javascript\");script.setAttribute(\"src\",\"%SCRIPT_SRC%\");script.setAttribute(\"data-injection-id\",\"%INJECTION_ID%\");document.body.appendChild(script);})();".replace("%SCRIPT_SRC%", str).replace("%INJECTION_ID%", str2));
    }

    /* JADX INFO: renamed from: c */
    public boolean m23522c(WebView webView, String str) {
        if (webView == null || TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            webView.evaluateJavascript(str, null);
            return true;
        } catch (IllegalStateException unused) {
            webView.loadUrl("javascript: ".concat(String.valueOf(str)));
            return true;
        }
    }
}
