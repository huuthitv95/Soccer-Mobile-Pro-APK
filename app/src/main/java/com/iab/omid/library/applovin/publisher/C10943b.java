package com.iab.omid.library.applovin.publisher;

import android.os.Handler;
import android.util.Log;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.iab.omid.library.applovin.adsession.AdSessionContext;
import com.iab.omid.library.applovin.adsession.C10919a;
import com.iab.omid.library.applovin.adsession.VerificationScriptResource;
import com.iab.omid.library.applovin.internal.C10933g;
import com.iab.omid.library.applovin.internal.C10934h;
import com.iab.omid.library.applovin.utils.C10946c;
import com.iab.omid.library.applovin.utils.C10949f;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.iab.omid.library.applovin.publisher.b */
/* JADX INFO: loaded from: classes6.dex */
public class C10943b extends AdSessionStatePublisher {

    /* JADX INFO: renamed from: g */
    private WebView f22749g;

    /* JADX INFO: renamed from: h */
    private Long f22750h;

    /* JADX INFO: renamed from: i */
    private final Map<String, VerificationScriptResource> f22751i;

    /* JADX INFO: renamed from: j */
    private final String f22752j;

    /* JADX INFO: renamed from: com.iab.omid.library.applovin.publisher.b$a */
    class a extends WebViewClient {
        a() {
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            Log.w("NativeBridge", "WebView renderer gone: " + renderProcessGoneDetail.toString() + "for WebView: " + webView);
            if (C10943b.this.getWebView() == webView) {
                Log.w("NativeBridge", "Deallocating the Native bridge as it is unusable. No further events will be generated for this session.");
                C10943b.this.m23293a((WebView) null);
            }
            webView.destroy();
            return true;
        }
    }

    /* JADX INFO: renamed from: com.iab.omid.library.applovin.publisher.b$b */
    class b implements Runnable {

        /* JADX INFO: renamed from: a */
        private final WebView f22754a;

        b() {
            this.f22754a = C10943b.this.f22749g;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f22754a.destroy();
        }
    }

    public C10943b(String str, Map<String, VerificationScriptResource> map, String str2) {
        super(str);
        this.f22750h = null;
        this.f22751i = map;
        this.f22752j = str2;
    }

    @Override // com.iab.omid.library.applovin.publisher.AdSessionStatePublisher
    /* JADX INFO: renamed from: a */
    public void mo23297a(C10919a c10919a, AdSessionContext adSessionContext) {
        JSONObject jSONObject = new JSONObject();
        Map<String, VerificationScriptResource> injectedResourcesMap = adSessionContext.getInjectedResourcesMap();
        for (String str : injectedResourcesMap.keySet()) {
            C10946c.m23332a(jSONObject, str, injectedResourcesMap.get(str).toJsonObject());
        }
        m23298a(c10919a, adSessionContext, jSONObject);
    }

    @Override // com.iab.omid.library.applovin.publisher.AdSessionStatePublisher
    /* JADX INFO: renamed from: b */
    public void mo23306b() {
        super.mo23306b();
        new Handler().postDelayed(new b(), Math.max(4000 - (this.f22750h == null ? 4000L : TimeUnit.MILLISECONDS.convert(C10949f.m23352b() - this.f22750h.longValue(), TimeUnit.NANOSECONDS)), 2000L));
        this.f22749g = null;
    }

    @Override // com.iab.omid.library.applovin.publisher.AdSessionStatePublisher
    /* JADX INFO: renamed from: i */
    public void mo23315i() {
        super.mo23315i();
        m23317j();
    }

    /* JADX INFO: renamed from: j */
    void m23317j() {
        WebView webView = new WebView(C10933g.m23250b().m23251a());
        this.f22749g = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f22749g.getSettings().setAllowContentAccess(false);
        this.f22749g.getSettings().setAllowFileAccess(false);
        this.f22749g.setWebViewClient(new a());
        m23293a(this.f22749g);
        C10934h.m23253a().m23269c(this.f22749g, this.f22752j);
        for (String str : this.f22751i.keySet()) {
            C10934h.m23253a().m23270d(this.f22749g, this.f22751i.get(str).getResourceUrl().toExternalForm(), str);
        }
        this.f22750h = Long.valueOf(C10949f.m23352b());
    }
}
