package com.iab.omid.library.chartboost.publisher;

import android.os.Handler;
import android.util.Log;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.iab.omid.library.chartboost.adsession.AdSessionContext;
import com.iab.omid.library.chartboost.adsession.C11021a;
import com.iab.omid.library.chartboost.adsession.VerificationScriptResource;
import com.iab.omid.library.chartboost.internal.C11035g;
import com.iab.omid.library.chartboost.internal.C11036h;
import com.iab.omid.library.chartboost.utils.C11048c;
import com.iab.omid.library.chartboost.utils.C11051f;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.iab.omid.library.chartboost.publisher.b */
/* JADX INFO: loaded from: classes6.dex */
public class C11045b extends AdSessionStatePublisher {

    /* JADX INFO: renamed from: g */
    private WebView f23019g;

    /* JADX INFO: renamed from: h */
    private Long f23020h;

    /* JADX INFO: renamed from: i */
    private final Map<String, VerificationScriptResource> f23021i;

    /* JADX INFO: renamed from: j */
    private final String f23022j;

    /* JADX INFO: renamed from: com.iab.omid.library.chartboost.publisher.b$a */
    class a extends WebViewClient {
        a() {
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            Log.w("NativeBridge", "WebView renderer gone: " + renderProcessGoneDetail.toString() + "for WebView: " + webView);
            if (C11045b.this.getWebView() == webView) {
                Log.w("NativeBridge", "Deallocating the Native bridge as it is unusable. No further events will be generated for this session.");
                C11045b.this.m23793a((WebView) null);
            }
            webView.destroy();
            return true;
        }
    }

    /* JADX INFO: renamed from: com.iab.omid.library.chartboost.publisher.b$b */
    class b implements Runnable {

        /* JADX INFO: renamed from: a */
        private final WebView f23024a;

        b() {
            this.f23024a = C11045b.this.f23019g;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f23024a.destroy();
        }
    }

    public C11045b(String str, Map<String, VerificationScriptResource> map, String str2) {
        super(str);
        this.f23020h = null;
        this.f23021i = map;
        this.f23022j = str2;
    }

    @Override // com.iab.omid.library.chartboost.publisher.AdSessionStatePublisher
    /* JADX INFO: renamed from: a */
    public void mo23797a(C11021a c11021a, AdSessionContext adSessionContext) {
        JSONObject jSONObject = new JSONObject();
        Map<String, VerificationScriptResource> injectedResourcesMap = adSessionContext.getInjectedResourcesMap();
        for (String str : injectedResourcesMap.keySet()) {
            C11048c.m23833a(jSONObject, str, injectedResourcesMap.get(str).toJsonObject());
        }
        m23798a(c11021a, adSessionContext, jSONObject);
    }

    @Override // com.iab.omid.library.chartboost.publisher.AdSessionStatePublisher
    /* JADX INFO: renamed from: b */
    public void mo23806b() {
        super.mo23806b();
        new Handler().postDelayed(new b(), Math.max(4000 - (this.f23020h == null ? 4000L : TimeUnit.MILLISECONDS.convert(C11051f.m23853b() - this.f23020h.longValue(), TimeUnit.NANOSECONDS)), 2000L));
        this.f23019g = null;
    }

    @Override // com.iab.omid.library.chartboost.publisher.AdSessionStatePublisher
    /* JADX INFO: renamed from: i */
    public void mo23815i() {
        super.mo23815i();
        m23818j();
    }

    /* JADX INFO: renamed from: j */
    void m23818j() {
        WebView webView = new WebView(C11035g.m23750b().m23751a());
        this.f23019g = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f23019g.getSettings().setAllowContentAccess(false);
        this.f23019g.getSettings().setAllowFileAccess(false);
        this.f23019g.setWebViewClient(new a());
        m23793a(this.f23019g);
        C11036h.m23753a().m23769c(this.f23019g, this.f23022j);
        for (String str : this.f23021i.keySet()) {
            C11036h.m23753a().m23770d(this.f23019g, this.f23021i.get(str).getResourceUrl().toExternalForm(), str);
        }
        this.f23020h = Long.valueOf(C11051f.m23853b());
    }
}
