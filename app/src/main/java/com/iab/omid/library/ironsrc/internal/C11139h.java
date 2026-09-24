package com.iab.omid.library.ironsrc.internal;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import com.iab.omid.library.ironsrc.adsession.ErrorType;
import com.iab.omid.library.ironsrc.utils.C11152d;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.iab.omid.library.ironsrc.internal.h */
/* JADX INFO: loaded from: classes6.dex */
public class C11139h {

    /* JADX INFO: renamed from: a */
    private static C11139h f23260a = new C11139h();

    /* JADX INFO: renamed from: com.iab.omid.library.ironsrc.internal.h$a */
    class a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ WebView f23261a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f23262b;

        a(WebView webView, String str) {
            this.f23261a = webView;
            this.f23262b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            C11139h.this.m24279c(this.f23261a, this.f23262b);
        }
    }

    private C11139h() {
    }

    /* JADX INFO: renamed from: a */
    public static final C11139h m24263a() {
        return f23260a;
    }

    /* JADX INFO: renamed from: a */
    public void m24264a(WebView webView, String str) {
        m24271a(webView, "finishSession", str);
    }

    /* JADX INFO: renamed from: a */
    public void m24265a(WebView webView, String str, float f) {
        m24271a(webView, "setDeviceVolume", Float.valueOf(f), str);
    }

    /* JADX INFO: renamed from: a */
    public void m24266a(WebView webView, String str, ErrorType errorType, String str2) {
        m24271a(webView, "error", errorType.toString(), str2, str);
    }

    /* JADX INFO: renamed from: a */
    public void m24267a(WebView webView, String str, String str2) {
        m24271a(webView, "setDeviceLockState", str2);
    }

    /* JADX INFO: renamed from: a */
    public void m24268a(WebView webView, String str, String str2, JSONObject jSONObject) {
        m24271a(webView, "publishMediaEvent", str2, jSONObject, str);
    }

    /* JADX INFO: renamed from: a */
    public void m24269a(WebView webView, String str, JSONObject jSONObject) {
        m24271a(webView, "init", jSONObject, str);
    }

    /* JADX INFO: renamed from: a */
    public void m24270a(WebView webView, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        m24271a(webView, "startSession", str, jSONObject, jSONObject2, jSONObject3);
    }

    /* JADX INFO: renamed from: a */
    void m24271a(WebView webView, String str, Object... objArr) {
        if (webView == null) {
            C11152d.m24356a("The WebView is null for " + str);
            return;
        }
        StringBuilder sb = new StringBuilder(128);
        sb.append("if(window.omidBridge!==undefined){omidBridge.");
        sb.append(str);
        sb.append("(");
        m24274a(sb, objArr);
        sb.append(")}");
        m24272a(webView, sb);
    }

    /* JADX INFO: renamed from: a */
    void m24272a(WebView webView, StringBuilder sb) {
        String string = sb.toString();
        Handler handler = webView.getHandler();
        if (handler == null || Looper.myLooper() == handler.getLooper()) {
            m24279c(webView, string);
        } else {
            handler.post(new a(webView, string));
        }
    }

    /* JADX INFO: renamed from: a */
    public void m24273a(WebView webView, JSONObject jSONObject) {
        m24271a(webView, "setLastActivity", jSONObject);
    }

    /* JADX INFO: renamed from: a */
    void m24274a(StringBuilder sb, Object[] objArr) {
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
    public void m24275b(WebView webView, String str) {
        m24271a(webView, "publishImpressionEvent", str);
    }

    /* JADX INFO: renamed from: b */
    public void m24276b(WebView webView, String str, String str2) {
        m24271a(webView, "setNativeViewHierarchy", str2, str);
    }

    /* JADX INFO: renamed from: b */
    public void m24277b(WebView webView, String str, JSONObject jSONObject) {
        m24271a(webView, "publishLoadedEvent", jSONObject, str);
    }

    /* JADX INFO: renamed from: c */
    public void m24278c(WebView webView, String str, String str2) {
        m24271a(webView, "setState", str2, str);
    }

    /* JADX INFO: renamed from: c */
    public boolean m24279c(WebView webView, String str) {
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
    public void m24280d(WebView webView, String str, String str2) {
        if (str == null || TextUtils.isEmpty(str2)) {
            return;
        }
        m24279c(webView, "(function() {this.omidVerificationProperties = this.omidVerificationProperties || {};Object.defineProperty(this.omidVerificationProperties, 'injectionId', {get: function() {var currentScript = document && document.currentScript;return currentScript && currentScript.getAttribute('data-injection-id');}, configurable: true});var script = document.createElement('script');script.setAttribute(\"type\",\"text/javascript\");script.setAttribute(\"src\",\"%SCRIPT_SRC%\");script.setAttribute(\"data-injection-id\",\"%INJECTION_ID%\");document.body.appendChild(script);})();".replace("%SCRIPT_SRC%", str).replace("%INJECTION_ID%", str2));
    }
}
