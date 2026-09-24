package com.iab.omid.library.unity3d.internal;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import com.iab.omid.library.unity3d.adsession.ErrorType;
import com.iab.omid.library.unity3d.utils.C11250d;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.iab.omid.library.unity3d.internal.g */
/* JADX INFO: loaded from: classes6.dex */
public class C11238g {

    /* JADX INFO: renamed from: a */
    private static C11238g f23529a = new C11238g();

    /* JADX INFO: renamed from: com.iab.omid.library.unity3d.internal.g$a */
    class a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ WebView f23530a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f23531b;

        a(WebView webView, String str) {
            this.f23530a = webView;
            this.f23531b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            C11238g.this.m24781c(this.f23530a, this.f23531b);
        }
    }

    private C11238g() {
    }

    /* JADX INFO: renamed from: a */
    public static final C11238g m24765a() {
        return f23529a;
    }

    /* JADX INFO: renamed from: a */
    public void m24766a(WebView webView, String str) {
        m24773a(webView, "finishSession", str);
    }

    /* JADX INFO: renamed from: a */
    public void m24767a(WebView webView, String str, float f) {
        m24773a(webView, "setDeviceVolume", Float.valueOf(f), str);
    }

    /* JADX INFO: renamed from: a */
    public void m24768a(WebView webView, String str, ErrorType errorType, String str2) {
        m24773a(webView, "error", errorType.toString(), str2, str);
    }

    /* JADX INFO: renamed from: a */
    public void m24769a(WebView webView, String str, String str2) {
        m24773a(webView, "setNativeViewHierarchy", str2, str);
    }

    /* JADX INFO: renamed from: a */
    public void m24770a(WebView webView, String str, String str2, JSONObject jSONObject) {
        m24773a(webView, "publishMediaEvent", str2, jSONObject, str);
    }

    /* JADX INFO: renamed from: a */
    public void m24771a(WebView webView, String str, JSONObject jSONObject) {
        m24773a(webView, "init", jSONObject, str);
    }

    /* JADX INFO: renamed from: a */
    public void m24772a(WebView webView, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        m24773a(webView, "startSession", str, jSONObject, jSONObject2, jSONObject3);
    }

    /* JADX INFO: renamed from: a */
    void m24773a(WebView webView, String str, Object... objArr) {
        if (webView == null) {
            C11250d.m24849a("The WebView is null for " + str);
            return;
        }
        StringBuilder sb = new StringBuilder(128);
        sb.append("if(window.omidBridge!==undefined){omidBridge.");
        sb.append(str);
        sb.append("(");
        m24776a(sb, objArr);
        sb.append(")}");
        m24774a(webView, sb);
    }

    /* JADX INFO: renamed from: a */
    void m24774a(WebView webView, StringBuilder sb) {
        String string = sb.toString();
        Handler handler = webView.getHandler();
        if (handler == null || Looper.myLooper() == handler.getLooper()) {
            m24781c(webView, string);
        } else {
            handler.post(new a(webView, string));
        }
    }

    /* JADX INFO: renamed from: a */
    public void m24775a(WebView webView, JSONObject jSONObject) {
        m24773a(webView, "setLastActivity", jSONObject);
    }

    /* JADX INFO: renamed from: a */
    void m24776a(StringBuilder sb, Object[] objArr) {
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
    public void m24777b(WebView webView, String str) {
        m24773a(webView, "publishImpressionEvent", str);
    }

    /* JADX INFO: renamed from: b */
    public void m24778b(WebView webView, String str, String str2) {
        m24773a(webView, "setState", str2, str);
    }

    /* JADX INFO: renamed from: b */
    public void m24779b(WebView webView, String str, JSONObject jSONObject) {
        m24773a(webView, "publishLoadedEvent", jSONObject, str);
    }

    /* JADX INFO: renamed from: c */
    public void m24780c(WebView webView, String str, String str2) {
        if (str == null || TextUtils.isEmpty(str2)) {
            return;
        }
        m24781c(webView, "(function() {this.omidVerificationProperties = this.omidVerificationProperties || {};Object.defineProperty(this.omidVerificationProperties, 'injectionId', {get: function() {var currentScript = document && document.currentScript;return currentScript && currentScript.getAttribute('data-injection-id');}, configurable: true});var script = document.createElement('script');script.setAttribute(\"type\",\"text/javascript\");script.setAttribute(\"src\",\"%SCRIPT_SRC%\");script.setAttribute(\"data-injection-id\",\"%INJECTION_ID%\");document.body.appendChild(script);})();".replace("%SCRIPT_SRC%", str).replace("%INJECTION_ID%", str2));
    }

    /* JADX INFO: renamed from: c */
    public boolean m24781c(WebView webView, String str) {
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
}
