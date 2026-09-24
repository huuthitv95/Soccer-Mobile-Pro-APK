package com.iab.omid.library.fyber.internal;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import com.iab.omid.library.fyber.adsession.ErrorType;
import com.iab.omid.library.fyber.utils.C11101d;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.iab.omid.library.fyber.internal.h */
/* JADX INFO: loaded from: classes6.dex */
public class C11088h {

    /* JADX INFO: renamed from: a */
    private static C11088h f23125a = new C11088h();

    /* JADX INFO: renamed from: com.iab.omid.library.fyber.internal.h$a */
    class a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ WebView f23126a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f23127b;

        a(WebView webView, String str) {
            this.f23126a = webView;
            this.f23127b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            C11088h.this.m24026c(this.f23126a, this.f23127b);
        }
    }

    private C11088h() {
    }

    /* JADX INFO: renamed from: a */
    public static final C11088h m24010a() {
        return f23125a;
    }

    /* JADX INFO: renamed from: a */
    public void m24011a(WebView webView, String str) {
        m24018a(webView, "finishSession", str);
    }

    /* JADX INFO: renamed from: a */
    public void m24012a(WebView webView, String str, float f) {
        m24018a(webView, "setDeviceVolume", Float.valueOf(f), str);
    }

    /* JADX INFO: renamed from: a */
    public void m24013a(WebView webView, String str, ErrorType errorType, String str2) {
        m24018a(webView, "error", errorType.toString(), str2, str);
    }

    /* JADX INFO: renamed from: a */
    public void m24014a(WebView webView, String str, String str2) {
        m24018a(webView, "setDeviceLockState", str2);
    }

    /* JADX INFO: renamed from: a */
    public void m24015a(WebView webView, String str, String str2, JSONObject jSONObject) {
        m24018a(webView, "publishMediaEvent", str2, jSONObject, str);
    }

    /* JADX INFO: renamed from: a */
    public void m24016a(WebView webView, String str, JSONObject jSONObject) {
        m24018a(webView, "init", jSONObject, str);
    }

    /* JADX INFO: renamed from: a */
    public void m24017a(WebView webView, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        m24018a(webView, "startSession", str, jSONObject, jSONObject2, jSONObject3);
    }

    /* JADX INFO: renamed from: a */
    void m24018a(WebView webView, String str, Object... objArr) {
        if (webView == null) {
            C11101d.m24103a("The WebView is null for " + str);
            return;
        }
        StringBuilder sb = new StringBuilder(128);
        sb.append("if(window.omidBridge!==undefined){omidBridge.");
        sb.append(str);
        sb.append("(");
        m24021a(sb, objArr);
        sb.append(")}");
        m24019a(webView, sb);
    }

    /* JADX INFO: renamed from: a */
    void m24019a(WebView webView, StringBuilder sb) {
        String string = sb.toString();
        Handler handler = webView.getHandler();
        if (handler == null || Looper.myLooper() == handler.getLooper()) {
            m24026c(webView, string);
        } else {
            handler.post(new a(webView, string));
        }
    }

    /* JADX INFO: renamed from: a */
    public void m24020a(WebView webView, JSONObject jSONObject) {
        m24018a(webView, "setLastActivity", jSONObject);
    }

    /* JADX INFO: renamed from: a */
    void m24021a(StringBuilder sb, Object[] objArr) {
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
    public void m24022b(WebView webView, String str) {
        m24018a(webView, "publishImpressionEvent", str);
    }

    /* JADX INFO: renamed from: b */
    public void m24023b(WebView webView, String str, String str2) {
        m24018a(webView, "setNativeViewHierarchy", str2, str);
    }

    /* JADX INFO: renamed from: b */
    public void m24024b(WebView webView, String str, JSONObject jSONObject) {
        m24018a(webView, "publishLoadedEvent", jSONObject, str);
    }

    /* JADX INFO: renamed from: c */
    public void m24025c(WebView webView, String str, String str2) {
        m24018a(webView, "setState", str2, str);
    }

    /* JADX INFO: renamed from: c */
    public boolean m24026c(WebView webView, String str) {
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
    public void m24027d(WebView webView, String str, String str2) {
        if (str == null || TextUtils.isEmpty(str2)) {
            return;
        }
        m24026c(webView, "(function() {this.omidVerificationProperties = this.omidVerificationProperties || {};Object.defineProperty(this.omidVerificationProperties, 'injectionId', {get: function() {var currentScript = document && document.currentScript;return currentScript && currentScript.getAttribute('data-injection-id');}, configurable: true});var script = document.createElement('script');script.setAttribute(\"type\",\"text/javascript\");script.setAttribute(\"src\",\"%SCRIPT_SRC%\");script.setAttribute(\"data-injection-id\",\"%INJECTION_ID%\");document.body.appendChild(script);})();".replace("%SCRIPT_SRC%", str).replace("%INJECTION_ID%", str2));
    }
}
