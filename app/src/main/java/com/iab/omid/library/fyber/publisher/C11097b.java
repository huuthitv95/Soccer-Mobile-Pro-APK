package com.iab.omid.library.fyber.publisher;

import android.os.Handler;
import android.util.Log;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.iab.omid.library.fyber.adsession.AdSessionContext;
import com.iab.omid.library.fyber.adsession.C11073a;
import com.iab.omid.library.fyber.adsession.VerificationScriptResource;
import com.iab.omid.library.fyber.internal.C11087g;
import com.iab.omid.library.fyber.internal.C11088h;
import com.iab.omid.library.fyber.utils.C11100c;
import com.iab.omid.library.fyber.utils.C11103f;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.iab.omid.library.fyber.publisher.b */
/* JADX INFO: loaded from: classes6.dex */
public class C11097b extends AdSessionStatePublisher {

    /* JADX INFO: renamed from: g */
    private WebView f23154g;

    /* JADX INFO: renamed from: h */
    private Long f23155h;

    /* JADX INFO: renamed from: i */
    private final Map<String, VerificationScriptResource> f23156i;

    /* JADX INFO: renamed from: j */
    private final String f23157j;

    /* JADX INFO: renamed from: com.iab.omid.library.fyber.publisher.b$a */
    class a extends WebViewClient {
        a() {
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            Log.w("NativeBridge", "WebView renderer gone: " + renderProcessGoneDetail.toString() + "for WebView: " + webView);
            if (C11097b.this.getWebView() == webView) {
                Log.w("NativeBridge", "Deallocating the Native bridge as it is unusable. No further events will be generated for this session.");
                C11097b.this.m24050a((WebView) null);
            }
            webView.destroy();
            return true;
        }
    }

    /* JADX INFO: renamed from: com.iab.omid.library.fyber.publisher.b$b */
    class b implements Runnable {

        /* JADX INFO: renamed from: a */
        private final WebView f23159a;

        b() {
            this.f23159a = C11097b.this.f23154g;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f23159a.destroy();
        }
    }

    public C11097b(String str, Map<String, VerificationScriptResource> map, String str2) {
        super(str);
        this.f23155h = null;
        this.f23156i = map;
        this.f23157j = str2;
    }

    @Override // com.iab.omid.library.fyber.publisher.AdSessionStatePublisher
    /* JADX INFO: renamed from: a */
    public void mo24054a(C11073a c11073a, AdSessionContext adSessionContext) {
        JSONObject jSONObject = new JSONObject();
        Map<String, VerificationScriptResource> injectedResourcesMap = adSessionContext.getInjectedResourcesMap();
        for (String str : injectedResourcesMap.keySet()) {
            C11100c.m24089a(jSONObject, str, injectedResourcesMap.get(str).toJsonObject());
        }
        m24055a(c11073a, adSessionContext, jSONObject);
    }

    @Override // com.iab.omid.library.fyber.publisher.AdSessionStatePublisher
    /* JADX INFO: renamed from: b */
    public void mo24063b() {
        super.mo24063b();
        new Handler().postDelayed(new b(), Math.max(4000 - (this.f23155h == null ? 4000L : TimeUnit.MILLISECONDS.convert(C11103f.m24109b() - this.f23155h.longValue(), TimeUnit.NANOSECONDS)), 2000L));
        this.f23154g = null;
    }

    @Override // com.iab.omid.library.fyber.publisher.AdSessionStatePublisher
    /* JADX INFO: renamed from: i */
    public void mo24072i() {
        super.mo24072i();
        m24074j();
    }

    /* JADX INFO: renamed from: j */
    void m24074j() {
        WebView webView = new WebView(C11087g.m24007b().m24008a());
        this.f23154g = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f23154g.getSettings().setAllowContentAccess(false);
        this.f23154g.getSettings().setAllowFileAccess(false);
        this.f23154g.setWebViewClient(new a());
        m24050a(this.f23154g);
        C11088h.m24010a().m24026c(this.f23154g, this.f23157j);
        for (String str : this.f23156i.keySet()) {
            C11088h.m24010a().m24027d(this.f23154g, this.f23156i.get(str).getResourceUrl().toExternalForm(), str);
        }
        this.f23155h = Long.valueOf(C11103f.m24109b());
    }
}
