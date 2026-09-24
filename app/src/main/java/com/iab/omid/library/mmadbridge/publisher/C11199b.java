package com.iab.omid.library.mmadbridge.publisher;

import android.os.Handler;
import android.util.Log;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.iab.omid.library.mmadbridge.adsession.AdSessionContext;
import com.iab.omid.library.mmadbridge.adsession.C11175a;
import com.iab.omid.library.mmadbridge.adsession.VerificationScriptResource;
import com.iab.omid.library.mmadbridge.internal.C11189g;
import com.iab.omid.library.mmadbridge.internal.C11190h;
import com.iab.omid.library.mmadbridge.utils.C11202c;
import com.iab.omid.library.mmadbridge.utils.C11205f;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.iab.omid.library.mmadbridge.publisher.b */
/* JADX INFO: loaded from: classes6.dex */
public class C11199b extends AdSessionStatePublisher {

    /* JADX INFO: renamed from: g */
    private WebView f23424g;

    /* JADX INFO: renamed from: h */
    private Long f23425h;

    /* JADX INFO: renamed from: i */
    private final Map<String, VerificationScriptResource> f23426i;

    /* JADX INFO: renamed from: j */
    private final String f23427j;

    /* JADX INFO: renamed from: com.iab.omid.library.mmadbridge.publisher.b$a */
    class a extends WebViewClient {
        a() {
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            Log.w("NativeBridge", "WebView renderer gone: " + renderProcessGoneDetail.toString() + "for WebView: " + webView);
            if (C11199b.this.getWebView() == webView) {
                Log.w("NativeBridge", "Deallocating the Native bridge as it is unusable. No further events will be generated for this session.");
                C11199b.this.m24556a((WebView) null);
            }
            webView.destroy();
            return true;
        }
    }

    /* JADX INFO: renamed from: com.iab.omid.library.mmadbridge.publisher.b$b */
    class b implements Runnable {

        /* JADX INFO: renamed from: a */
        private final WebView f23429a;

        b() {
            this.f23429a = C11199b.this.f23424g;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f23429a.destroy();
        }
    }

    public C11199b(String str, Map<String, VerificationScriptResource> map, String str2) {
        super(str);
        this.f23425h = null;
        this.f23426i = map;
        this.f23427j = str2;
    }

    @Override // com.iab.omid.library.mmadbridge.publisher.AdSessionStatePublisher
    /* JADX INFO: renamed from: a */
    public void mo24560a(C11175a c11175a, AdSessionContext adSessionContext) {
        JSONObject jSONObject = new JSONObject();
        Map<String, VerificationScriptResource> injectedResourcesMap = adSessionContext.getInjectedResourcesMap();
        for (String str : injectedResourcesMap.keySet()) {
            C11202c.m24595a(jSONObject, str, injectedResourcesMap.get(str).toJsonObject());
        }
        m24561a(c11175a, adSessionContext, jSONObject);
    }

    @Override // com.iab.omid.library.mmadbridge.publisher.AdSessionStatePublisher
    /* JADX INFO: renamed from: b */
    public void mo24569b() {
        super.mo24569b();
        new Handler().postDelayed(new b(), Math.max(4000 - (this.f23425h == null ? 4000L : TimeUnit.MILLISECONDS.convert(C11205f.m24615b() - this.f23425h.longValue(), TimeUnit.NANOSECONDS)), 2000L));
        this.f23424g = null;
    }

    @Override // com.iab.omid.library.mmadbridge.publisher.AdSessionStatePublisher
    /* JADX INFO: renamed from: i */
    public void mo24578i() {
        super.mo24578i();
        m24580j();
    }

    /* JADX INFO: renamed from: j */
    void m24580j() {
        WebView webView = new WebView(C11189g.m24513b().m24514a());
        this.f23424g = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f23424g.getSettings().setAllowContentAccess(false);
        this.f23424g.getSettings().setAllowFileAccess(false);
        this.f23424g.setWebViewClient(new a());
        m24556a(this.f23424g);
        C11190h.m24516a().m24532c(this.f23424g, this.f23427j);
        for (String str : this.f23426i.keySet()) {
            C11190h.m24516a().m24533d(this.f23424g, this.f23426i.get(str).getResourceUrl().toExternalForm(), str);
        }
        this.f23425h = Long.valueOf(C11205f.m24615b());
    }
}
