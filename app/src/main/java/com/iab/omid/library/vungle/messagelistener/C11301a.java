package com.iab.omid.library.vungle.messagelistener;

import android.net.Uri;
import android.webkit.WebView;
import androidx.webkit.JavaScriptReplyProxy;
import androidx.webkit.ProxyConfig;
import androidx.webkit.WebMessageCompat;
import androidx.webkit.WebViewCompat;
import androidx.webkit.WebViewFeature;
import com.iab.omid.library.vungle.utils.C11313d;
import com.iab.omid.library.vungle.utils.C11316g;
import com.iab.omid.library.vungle.utils.C11318i;
import java.util.Arrays;
import java.util.HashSet;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.iab.omid.library.vungle.messagelistener.a */
/* JADX INFO: loaded from: classes6.dex */
public class C11301a {

    /* JADX INFO: renamed from: c */
    private static final C11318i f23698c = new C11318i();

    /* JADX INFO: renamed from: a */
    private final WebView f23699a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC11302b f23700b;

    /* JADX INFO: renamed from: com.iab.omid.library.vungle.messagelistener.a$a */
    class a implements WebViewCompat.WebMessageListener {
        a() {
        }

        @Override // androidx.webkit.WebViewCompat.WebMessageListener
        public void onPostMessage(WebView webView, WebMessageCompat webMessageCompat, Uri uri, boolean z, JavaScriptReplyProxy javaScriptReplyProxy) {
            C11301a.this.m25067a(webMessageCompat.getData());
        }
    }

    public C11301a(WebView webView, InterfaceC11302b interfaceC11302b) {
        C11316g.m25159a(webView, "WebView is null");
        this.f23699a = webView;
        this.f23700b = interfaceC11302b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m25067a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f23700b.onMessageReceived(jSONObject.getString("method"), jSONObject.getJSONObject("data"));
        } catch (JSONException e) {
            C11313d.m25147a("Error parsing JS message", e);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m25068a() {
        try {
            if (!WebViewFeature.isFeatureSupported("WEB_MESSAGE_LISTENER")) {
                this.f23700b.onWebMessageListenerUnsupported();
                return;
            }
            try {
                m25069b();
                f23698c.m25177a(this.f23699a, this.f23700b.getListenerName(), new HashSet(Arrays.asList(ProxyConfig.MATCH_ALL_SCHEMES)), new a());
            } catch (Exception e) {
                C11313d.m25147a("Error adding WebView listener", e);
                this.f23700b.onWebMessageListenerUnsupported();
            }
        } catch (NoClassDefFoundError unused) {
            this.f23700b.onWebMessageListenerUnsupported();
        }
    }

    /* JADX INFO: renamed from: b */
    public void m25069b() {
        f23698c.m25176a(this.f23699a, this.f23700b.getListenerName());
    }
}
