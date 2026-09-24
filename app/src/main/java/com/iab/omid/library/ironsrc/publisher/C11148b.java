package com.iab.omid.library.ironsrc.publisher;

import android.os.Handler;
import android.util.Log;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.iab.omid.library.ironsrc.adsession.AdSessionContext;
import com.iab.omid.library.ironsrc.adsession.C11124a;
import com.iab.omid.library.ironsrc.adsession.VerificationScriptResource;
import com.iab.omid.library.ironsrc.internal.C11138g;
import com.iab.omid.library.ironsrc.internal.C11139h;
import com.iab.omid.library.ironsrc.utils.C11151c;
import com.iab.omid.library.ironsrc.utils.C11154f;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.iab.omid.library.ironsrc.publisher.b */
/* JADX INFO: loaded from: classes6.dex */
public class C11148b extends AdSessionStatePublisher {

    /* JADX INFO: renamed from: g */
    private WebView f23289g;

    /* JADX INFO: renamed from: h */
    private Long f23290h;

    /* JADX INFO: renamed from: i */
    private final Map<String, VerificationScriptResource> f23291i;

    /* JADX INFO: renamed from: j */
    private final String f23292j;

    /* JADX INFO: renamed from: com.iab.omid.library.ironsrc.publisher.b$a */
    class a extends WebViewClient {
        a() {
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            Log.w("NativeBridge", "WebView renderer gone: " + renderProcessGoneDetail.toString() + "for WebView: " + webView);
            if (C11148b.this.getWebView() == webView) {
                Log.w("NativeBridge", "Deallocating the Native bridge as it is unusable. No further events will be generated for this session.");
                C11148b.this.m24303a((WebView) null);
            }
            webView.destroy();
            return true;
        }
    }

    /* JADX INFO: renamed from: com.iab.omid.library.ironsrc.publisher.b$b */
    class b implements Runnable {

        /* JADX INFO: renamed from: a */
        private final WebView f23294a;

        b() {
            this.f23294a = C11148b.this.f23289g;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f23294a.destroy();
        }
    }

    public C11148b(String str, Map<String, VerificationScriptResource> map, String str2) {
        super(str);
        this.f23290h = null;
        this.f23291i = map;
        this.f23292j = str2;
    }

    @Override // com.iab.omid.library.ironsrc.publisher.AdSessionStatePublisher
    /* JADX INFO: renamed from: a */
    public void mo24307a(C11124a c11124a, AdSessionContext adSessionContext) {
        JSONObject jSONObject = new JSONObject();
        Map<String, VerificationScriptResource> injectedResourcesMap = adSessionContext.getInjectedResourcesMap();
        for (String str : injectedResourcesMap.keySet()) {
            C11151c.m24342a(jSONObject, str, injectedResourcesMap.get(str).toJsonObject());
        }
        m24308a(c11124a, adSessionContext, jSONObject);
    }

    @Override // com.iab.omid.library.ironsrc.publisher.AdSessionStatePublisher
    /* JADX INFO: renamed from: b */
    public void mo24316b() {
        super.mo24316b();
        new Handler().postDelayed(new b(), Math.max(4000 - (this.f23290h == null ? 4000L : TimeUnit.MILLISECONDS.convert(C11154f.m24362b() - this.f23290h.longValue(), TimeUnit.NANOSECONDS)), 2000L));
        this.f23289g = null;
    }

    @Override // com.iab.omid.library.ironsrc.publisher.AdSessionStatePublisher
    /* JADX INFO: renamed from: i */
    public void mo24325i() {
        super.mo24325i();
        m24327j();
    }

    /* JADX INFO: renamed from: j */
    void m24327j() {
        WebView webView = new WebView(C11138g.m24260b().m24261a());
        this.f23289g = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f23289g.getSettings().setAllowContentAccess(false);
        this.f23289g.getSettings().setAllowFileAccess(false);
        this.f23289g.setWebViewClient(new a());
        m24303a(this.f23289g);
        C11139h.m24263a().m24279c(this.f23289g, this.f23292j);
        for (String str : this.f23291i.keySet()) {
            C11139h.m24263a().m24280d(this.f23289g, this.f23291i.get(str).getResourceUrl().toExternalForm(), str);
        }
        this.f23290h = Long.valueOf(C11154f.m24362b());
    }
}
