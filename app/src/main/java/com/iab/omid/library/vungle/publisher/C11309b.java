package com.iab.omid.library.vungle.publisher;

import android.content.Context;
import android.os.Handler;
import android.util.Log;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.iab.omid.library.vungle.adsession.AdSessionContext;
import com.iab.omid.library.vungle.adsession.C11271a;
import com.iab.omid.library.vungle.adsession.VerificationScriptResource;
import com.iab.omid.library.vungle.attestation.C11274c;
import com.iab.omid.library.vungle.attestation.C11278g;
import com.iab.omid.library.vungle.internal.C11296g;
import com.iab.omid.library.vungle.internal.C11297h;
import com.iab.omid.library.vungle.utils.C11312c;
import com.iab.omid.library.vungle.utils.C11315f;
import com.iab.omid.library.vungle.webviewclient.C11333a;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.iab.omid.library.vungle.publisher.b */
/* JADX INFO: loaded from: classes6.dex */
public class C11309b extends AdSessionStatePublisher {

    /* JADX INFO: renamed from: g */
    private WebView f23716g;

    /* JADX INFO: renamed from: h */
    private Long f23717h;

    /* JADX INFO: renamed from: i */
    private final Map<String, VerificationScriptResource> f23718i;

    /* JADX INFO: renamed from: j */
    private final String f23719j;

    /* JADX INFO: renamed from: com.iab.omid.library.vungle.publisher.b$a */
    class a extends WebViewClient {
        a() {
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            return C11309b.this.m25110a(webView, renderProcessGoneDetail);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            return C11333a.m25234a(webResourceRequest.getUrl().toString());
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            return C11333a.m25234a(str);
        }
    }

    /* JADX INFO: renamed from: com.iab.omid.library.vungle.publisher.b$b */
    class b extends WebViewClient {
        b() {
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            return C11309b.this.m25110a(webView, renderProcessGoneDetail);
        }
    }

    /* JADX INFO: renamed from: com.iab.omid.library.vungle.publisher.b$c */
    class c implements Runnable {

        /* JADX INFO: renamed from: a */
        private final WebView f23722a;

        c() {
            this.f23722a = C11309b.this.f23716g;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f23722a.destroy();
        }
    }

    public C11309b(String str, Map<String, VerificationScriptResource> map, String str2) {
        super(str);
        this.f23717h = null;
        this.f23718i = map;
        this.f23719j = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public boolean m25110a(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        Log.w("NativeBridge", "WebView renderer gone: " + renderProcessGoneDetail.toString() + " for WebView: " + webView);
        if (getWebView() == webView) {
            Log.w("NativeBridge", "Deallocating the Native bridge as it is unusable. No further events will be generated for this session.");
            m25084a((WebView) null);
        }
        if (webView == null) {
            return true;
        }
        webView.destroy();
        return true;
    }

    /* JADX INFO: renamed from: a */
    private boolean m25112a(boolean z, Context context) {
        return !z && C11274c.m24951a(context).m24955b();
    }

    /* JADX INFO: renamed from: c */
    private WebViewClient m25113c(boolean z) {
        return z ? m25115k() : m25114j();
    }

    /* JADX INFO: renamed from: j */
    private WebViewClient m25114j() {
        return new b();
    }

    /* JADX INFO: renamed from: k */
    private WebViewClient m25115k() {
        return new a();
    }

    @Override // com.iab.omid.library.vungle.publisher.AdSessionStatePublisher
    /* JADX INFO: renamed from: a */
    public void mo25088a(C11271a c11271a, AdSessionContext adSessionContext) {
        JSONObject jSONObject = new JSONObject();
        Map<String, VerificationScriptResource> injectedResourcesMap = adSessionContext.getInjectedResourcesMap();
        for (String str : injectedResourcesMap.keySet()) {
            C11312c.m25131a(jSONObject, str, injectedResourcesMap.get(str).toJsonObject());
        }
        m25089a(c11271a, adSessionContext, jSONObject);
    }

    @Override // com.iab.omid.library.vungle.publisher.AdSessionStatePublisher
    /* JADX INFO: renamed from: b */
    public void mo25096b() {
        super.mo25096b();
        new Handler().postDelayed(new c(), Math.max(4000 - (this.f23717h == null ? 4000L : TimeUnit.MILLISECONDS.convert(C11315f.m25154b() - this.f23717h.longValue(), TimeUnit.NANOSECONDS)), 2000L));
        this.f23716g = null;
    }

    @Override // com.iab.omid.library.vungle.publisher.AdSessionStatePublisher
    /* JADX INFO: renamed from: i */
    public void mo25107i() {
        super.mo25107i();
        m25116l();
    }

    /* JADX INFO: renamed from: l */
    void m25116l() {
        Context contextM25030a = C11296g.m25029b().m25030a();
        WebView webView = new WebView(contextM25030a);
        this.f23716g = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f23716g.getSettings().setAllowContentAccess(false);
        this.f23716g.getSettings().setAllowFileAccess(false);
        this.f23716g.setWebViewClient(m25113c(m25112a(C11278g.m24960a(this.f23716g), contextM25030a)));
        m25084a(this.f23716g);
        C11297h.m25032a().m25049c(this.f23716g, this.f23719j);
        for (String str : this.f23718i.keySet()) {
            C11297h.m25032a().m25050d(this.f23716g, this.f23718i.get(str).getResourceUrl().toExternalForm(), str);
        }
        this.f23717h = Long.valueOf(C11315f.m25154b());
    }
}
