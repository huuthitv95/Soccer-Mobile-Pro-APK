package com.iab.omid.library.bytedance2.publisher;

import android.os.Handler;
import android.util.Log;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.iab.omid.library.bytedance2.adsession.AdSessionContext;
import com.iab.omid.library.bytedance2.adsession.C10970a;
import com.iab.omid.library.bytedance2.adsession.VerificationScriptResource;
import com.iab.omid.library.bytedance2.internal.C10984g;
import com.iab.omid.library.bytedance2.internal.C10985h;
import com.iab.omid.library.bytedance2.utils.C10996c;
import com.iab.omid.library.bytedance2.utils.C10999f;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.iab.omid.library.bytedance2.publisher.b */
/* JADX INFO: loaded from: classes6.dex */
public class C10993b extends AdSessionStatePublisher {

    /* JADX INFO: renamed from: g */
    private WebView f22879g;

    /* JADX INFO: renamed from: h */
    private Long f22880h;

    /* JADX INFO: renamed from: i */
    private final Map<String, VerificationScriptResource> f22881i;

    /* JADX INFO: renamed from: j */
    private final String f22882j;

    /* JADX INFO: renamed from: com.iab.omid.library.bytedance2.publisher.b$a */
    class a extends WebViewClient {
        a() {
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            Log.w("NativeBridge", "WebView renderer gone: " + renderProcessGoneDetail.toString() + "for WebView: " + webView);
            if (C10993b.this.getWebView() == webView) {
                Log.w("NativeBridge", "Deallocating the Native bridge as it is unusable. No further events will be generated for this session.");
                C10993b.this.m23539a((WebView) null);
            }
            webView.destroy();
            return true;
        }
    }

    /* JADX INFO: renamed from: com.iab.omid.library.bytedance2.publisher.b$b */
    class b implements Runnable {

        /* JADX INFO: renamed from: a */
        private final WebView f22884a;

        b() {
            this.f22884a = C10993b.this.f22879g;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f22884a.destroy();
        }
    }

    public C10993b(String str, Map<String, VerificationScriptResource> map, String str2) {
        super(str);
        this.f22880h = null;
        this.f22881i = map;
        this.f22882j = str2;
    }

    @Override // com.iab.omid.library.bytedance2.publisher.AdSessionStatePublisher
    /* JADX INFO: renamed from: a */
    public void mo23543a(C10970a c10970a, AdSessionContext adSessionContext) {
        JSONObject jSONObject = new JSONObject();
        Map<String, VerificationScriptResource> injectedResourcesMap = adSessionContext.getInjectedResourcesMap();
        for (String str : injectedResourcesMap.keySet()) {
            C10996c.m23577a(jSONObject, str, injectedResourcesMap.get(str).toJsonObject());
        }
        m23544a(c10970a, adSessionContext, jSONObject);
    }

    @Override // com.iab.omid.library.bytedance2.publisher.AdSessionStatePublisher
    /* JADX INFO: renamed from: b */
    public void mo23552b() {
        super.mo23552b();
        new Handler().postDelayed(new b(), Math.max(4000 - (this.f22880h == null ? 4000L : TimeUnit.MILLISECONDS.convert(C10999f.m23596b() - this.f22880h.longValue(), TimeUnit.NANOSECONDS)), 2000L));
        this.f22879g = null;
    }

    @Override // com.iab.omid.library.bytedance2.publisher.AdSessionStatePublisher
    /* JADX INFO: renamed from: i */
    public void mo23560i() {
        super.mo23560i();
        m23562j();
    }

    /* JADX INFO: renamed from: j */
    void m23562j() {
        WebView webView = new WebView(C10984g.m23503b().m23504a());
        this.f22879g = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f22879g.getSettings().setAllowContentAccess(false);
        this.f22879g.getSettings().setAllowFileAccess(false);
        this.f22879g.setWebViewClient(new a());
        m23539a(this.f22879g);
        C10985h.m23506a().m23522c(this.f22879g, this.f22882j);
        for (String str : this.f22881i.keySet()) {
            C10985h.m23506a().m23521c(this.f22879g, this.f22881i.get(str).getResourceUrl().toExternalForm(), str);
        }
        this.f22880h = Long.valueOf(C10999f.m23596b());
    }
}
