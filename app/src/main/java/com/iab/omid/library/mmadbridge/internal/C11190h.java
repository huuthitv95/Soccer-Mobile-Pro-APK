package com.iab.omid.library.mmadbridge.internal;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import com.iab.omid.library.mmadbridge.adsession.ErrorType;
import com.iab.omid.library.mmadbridge.utils.C11203d;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.iab.omid.library.mmadbridge.internal.h */
/* JADX INFO: loaded from: classes6.dex */
public class C11190h {

    /* JADX INFO: renamed from: a */
    private static C11190h f23395a = new C11190h();

    /* JADX INFO: renamed from: com.iab.omid.library.mmadbridge.internal.h$a */
    class a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ WebView f23396a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f23397b;

        a(WebView webView, String str) {
            this.f23396a = webView;
            this.f23397b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            C11190h.this.m24532c(this.f23396a, this.f23397b);
        }
    }

    private C11190h() {
    }

    /* JADX INFO: renamed from: a */
    public static final C11190h m24516a() {
        return f23395a;
    }

    /* JADX INFO: renamed from: a */
    public void m24517a(WebView webView, String str) {
        m24524a(webView, "finishSession", str);
    }

    /* JADX INFO: renamed from: a */
    public void m24518a(WebView webView, String str, float f) {
        m24524a(webView, "setDeviceVolume", Float.valueOf(f), str);
    }

    /* JADX INFO: renamed from: a */
    public void m24519a(WebView webView, String str, ErrorType errorType, String str2) {
        m24524a(webView, "error", errorType.toString(), str2, str);
    }

    /* JADX INFO: renamed from: a */
    public void m24520a(WebView webView, String str, String str2) {
        m24524a(webView, "setDeviceLockState", str2);
    }

    /* JADX INFO: renamed from: a */
    public void m24521a(WebView webView, String str, String str2, JSONObject jSONObject) {
        m24524a(webView, "publishMediaEvent", str2, jSONObject, str);
    }

    /* JADX INFO: renamed from: a */
    public void m24522a(WebView webView, String str, JSONObject jSONObject) {
        m24524a(webView, "init", jSONObject, str);
    }

    /* JADX INFO: renamed from: a */
    public void m24523a(WebView webView, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        m24524a(webView, "startSession", str, jSONObject, jSONObject2, jSONObject3);
    }

    /* JADX INFO: renamed from: a */
    void m24524a(WebView webView, String str, Object... objArr) {
        if (webView == null) {
            C11203d.m24609a("The WebView is null for " + str);
            return;
        }
        StringBuilder sb = new StringBuilder(128);
        sb.append("if(window.omidBridge!==undefined){omidBridge.");
        sb.append(str);
        sb.append("(");
        m24527a(sb, objArr);
        sb.append(")}");
        m24525a(webView, sb);
    }

    /* JADX INFO: renamed from: a */
    void m24525a(WebView webView, StringBuilder sb) {
        String string = sb.toString();
        Handler handler = webView.getHandler();
        if (handler == null || Looper.myLooper() == handler.getLooper()) {
            m24532c(webView, string);
        } else {
            handler.post(new a(webView, string));
        }
    }

    /* JADX INFO: renamed from: a */
    public void m24526a(WebView webView, JSONObject jSONObject) {
        m24524a(webView, "setLastActivity", jSONObject);
    }

    /* JADX INFO: renamed from: a */
    void m24527a(StringBuilder sb, Object[] objArr) {
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
    public void m24528b(WebView webView, String str) {
        m24524a(webView, "publishImpressionEvent", str);
    }

    /* JADX INFO: renamed from: b */
    public void m24529b(WebView webView, String str, String str2) {
        m24524a(webView, "setNativeViewHierarchy", str2, str);
    }

    /* JADX INFO: renamed from: b */
    public void m24530b(WebView webView, String str, JSONObject jSONObject) {
        m24524a(webView, "publishLoadedEvent", jSONObject, str);
    }

    /* JADX INFO: renamed from: c */
    public void m24531c(WebView webView, String str, String str2) {
        m24524a(webView, "setState", str2, str);
    }

    /* JADX INFO: renamed from: c */
    public boolean m24532c(WebView webView, String str) {
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
    public void m24533d(WebView webView, String str, String str2) {
        if (str == null || TextUtils.isEmpty(str2)) {
            return;
        }
        m24532c(webView, "(function() {this.omidVerificationProperties = this.omidVerificationProperties || {};Object.defineProperty(this.omidVerificationProperties, 'injectionId', {get: function() {var currentScript = document && document.currentScript;return currentScript && currentScript.getAttribute('data-injection-id');}, configurable: true});var script = document.createElement('script');script.setAttribute(\"type\",\"text/javascript\");script.setAttribute(\"src\",\"%SCRIPT_SRC%\");script.setAttribute(\"data-injection-id\",\"%INJECTION_ID%\");document.body.appendChild(script);})();".replace("%SCRIPT_SRC%", str).replace("%INJECTION_ID%", str2));
    }
}
