package com.iab.omid.library.unity3d.publisher;

import android.os.Handler;
import android.util.Log;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.iab.omid.library.unity3d.adsession.AdSessionContext;
import com.iab.omid.library.unity3d.adsession.C11224a;
import com.iab.omid.library.unity3d.adsession.VerificationScriptResource;
import com.iab.omid.library.unity3d.internal.C11237f;
import com.iab.omid.library.unity3d.internal.C11238g;
import com.iab.omid.library.unity3d.utils.C11249c;
import com.iab.omid.library.unity3d.utils.C11252f;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.iab.omid.library.unity3d.publisher.b */
/* JADX INFO: loaded from: classes6.dex */
public class C11246b extends AdSessionStatePublisher {

    /* JADX INFO: renamed from: g */
    private WebView f23553g;

    /* JADX INFO: renamed from: h */
    private Long f23554h;

    /* JADX INFO: renamed from: i */
    private final Map<String, VerificationScriptResource> f23555i;

    /* JADX INFO: renamed from: j */
    private final String f23556j;

    /* JADX INFO: renamed from: com.iab.omid.library.unity3d.publisher.b$a */
    class a extends WebViewClient {
        a() {
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            Log.w("NativeBridge", "WebView renderer gone: " + renderProcessGoneDetail.toString() + "for WebView: " + webView);
            if (C11246b.this.getWebView() == webView) {
                Log.w("NativeBridge", "Deallocating the Native bridge as it is unusable. No further events will be generated for this session.");
                C11246b.this.m24798a((WebView) null);
            }
            webView.destroy();
            return true;
        }
    }

    /* JADX INFO: renamed from: com.iab.omid.library.unity3d.publisher.b$b */
    class b implements Runnable {

        /* JADX INFO: renamed from: a */
        private final WebView f23558a;

        b() {
            this.f23558a = C11246b.this.f23553g;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f23558a.destroy();
        }
    }

    public C11246b(String str, Map<String, VerificationScriptResource> map, String str2) {
        super(str);
        this.f23554h = null;
        this.f23555i = map;
        this.f23556j = str2;
    }

    @Override // com.iab.omid.library.unity3d.publisher.AdSessionStatePublisher
    /* JADX INFO: renamed from: a */
    public void mo24802a(C11224a c11224a, AdSessionContext adSessionContext) {
        JSONObject jSONObject = new JSONObject();
        Map<String, VerificationScriptResource> injectedResourcesMap = adSessionContext.getInjectedResourcesMap();
        for (String str : injectedResourcesMap.keySet()) {
            C11249c.m24836a(jSONObject, str, injectedResourcesMap.get(str).toJsonObject());
        }
        m24803a(c11224a, adSessionContext, jSONObject);
    }

    @Override // com.iab.omid.library.unity3d.publisher.AdSessionStatePublisher
    /* JADX INFO: renamed from: b */
    public void mo24811b() {
        super.mo24811b();
        new Handler().postDelayed(new b(), Math.max(4000 - (this.f23554h == null ? 4000L : TimeUnit.MILLISECONDS.convert(C11252f.m24854b() - this.f23554h.longValue(), TimeUnit.NANOSECONDS)), 2000L));
        this.f23553g = null;
    }

    @Override // com.iab.omid.library.unity3d.publisher.AdSessionStatePublisher
    /* JADX INFO: renamed from: i */
    public void mo24819i() {
        super.mo24819i();
        m24821j();
    }

    /* JADX INFO: renamed from: j */
    void m24821j() {
        WebView webView = new WebView(C11237f.m24762b().m24763a());
        this.f23553g = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f23553g.getSettings().setAllowContentAccess(false);
        this.f23553g.getSettings().setAllowFileAccess(false);
        this.f23553g.setWebViewClient(new a());
        m24798a(this.f23553g);
        C11238g.m24765a().m24781c(this.f23553g, this.f23556j);
        for (String str : this.f23555i.keySet()) {
            C11238g.m24765a().m24780c(this.f23553g, this.f23555i.get(str).getResourceUrl().toExternalForm(), str);
        }
        this.f23554h = Long.valueOf(C11252f.m24854b());
    }
}
