package com.iab.omid.library.vungle.internal;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import com.iab.omid.library.vungle.adsession.ErrorType;
import com.iab.omid.library.vungle.utils.C11313d;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.iab.omid.library.vungle.internal.h */
/* JADX INFO: loaded from: classes6.dex */
public class C11297h {

    /* JADX INFO: renamed from: a */
    private static C11297h f23683a = new C11297h();

    /* JADX INFO: renamed from: com.iab.omid.library.vungle.internal.h$a */
    class a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ WebView f23684a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f23685b;

        a(WebView webView, String str) {
            this.f23684a = webView;
            this.f23685b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            C11297h.this.m25049c(this.f23684a, this.f23685b);
        }
    }

    private C11297h() {
    }

    /* JADX INFO: renamed from: a */
    public static final C11297h m25032a() {
        return f23683a;
    }

    /* JADX INFO: renamed from: a */
    public void m25033a(WebView webView, String str) {
        m25040a(webView, "finishSession", str);
    }

    /* JADX INFO: renamed from: a */
    public void m25034a(WebView webView, String str, float f) {
        m25040a(webView, "setDeviceVolume", Float.valueOf(f), str);
    }

    /* JADX INFO: renamed from: a */
    public void m25035a(WebView webView, String str, ErrorType errorType, String str2) {
        m25040a(webView, "error", errorType.toString(), str2, str);
    }

    /* JADX INFO: renamed from: a */
    public void m25036a(WebView webView, String str, String str2) {
        m25040a(webView, "setDeviceLockState", str2);
    }

    /* JADX INFO: renamed from: a */
    public void m25037a(WebView webView, String str, String str2, JSONObject jSONObject) {
        m25040a(webView, "publishMediaEvent", str2, jSONObject, str);
    }

    /* JADX INFO: renamed from: a */
    public void m25038a(WebView webView, String str, JSONObject jSONObject) {
        m25040a(webView, "init", jSONObject, str);
    }

    /* JADX INFO: renamed from: a */
    public void m25039a(WebView webView, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        m25040a(webView, "startSession", str, jSONObject, jSONObject2, jSONObject3);
    }

    /* JADX INFO: renamed from: a */
    void m25040a(WebView webView, String str, Object... objArr) {
        if (webView == null) {
            C11313d.m25149c("The WebView is null for " + str);
            return;
        }
        StringBuilder sb = new StringBuilder(128);
        sb.append("if(window.omidBridge!==undefined){omidBridge.");
        sb.append(str);
        sb.append("(");
        m25043a(sb, objArr);
        sb.append(")}");
        m25041a(webView, sb);
    }

    /* JADX INFO: renamed from: a */
    void m25041a(WebView webView, StringBuilder sb) {
        String string = sb.toString();
        Handler handler = webView.getHandler();
        if (handler == null) {
            handler = new Handler(Looper.getMainLooper());
        }
        if (Looper.myLooper() == handler.getLooper()) {
            m25049c(webView, string);
        } else {
            handler.post(new a(webView, string));
        }
    }

    /* JADX INFO: renamed from: a */
    public void m25042a(WebView webView, JSONObject jSONObject) {
        m25040a(webView, "setLastActivity", jSONObject);
    }

    /* JADX INFO: renamed from: a */
    void m25043a(StringBuilder sb, Object[] objArr) {
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
    public void m25044b(WebView webView, String str) {
        m25040a(webView, "publishImpressionEvent", str);
    }

    /* JADX INFO: renamed from: b */
    public void m25045b(WebView webView, String str, String str2) {
        m25040a(webView, "setNativeViewHierarchy", str2, str);
    }

    /* JADX INFO: renamed from: b */
    public void m25046b(WebView webView, String str, JSONObject jSONObject) {
        m25040a(webView, "publishLoadedEvent", jSONObject, str);
    }

    /* JADX INFO: renamed from: b */
    public void m25047b(WebView webView, JSONObject jSONObject) {
        m25040a(webView, "setSupportedAttestations", jSONObject);
    }

    /* JADX INFO: renamed from: c */
    public void m25048c(WebView webView, String str, String str2) {
        m25040a(webView, "setState", str2, str);
    }

    /* JADX INFO: renamed from: c */
    public boolean m25049c(WebView webView, String str) {
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
                C11313d.m25150d("Unable to inject javascript: " + e.getMessage());
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public void m25050d(WebView webView, String str, String str2) {
        if (str == null || TextUtils.isEmpty(str2)) {
            return;
        }
        m25049c(webView, "(function() {this.omidVerificationProperties = this.omidVerificationProperties || {};Object.defineProperty(this.omidVerificationProperties, 'injectionId', {get: function() {var currentScript = document && document.currentScript;return currentScript && currentScript.getAttribute('data-injection-id');}, configurable: true});var script = document.createElement('script');script.setAttribute(\"type\",\"text/javascript\");script.setAttribute(\"src\",\"%SCRIPT_SRC%\");script.setAttribute(\"data-injection-id\",\"%INJECTION_ID%\");document.body.appendChild(script);})();".replace("%SCRIPT_SRC%", str).replace("%INJECTION_ID%", str2));
    }
}
