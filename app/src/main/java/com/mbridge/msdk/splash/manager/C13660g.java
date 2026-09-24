package com.mbridge.msdk.splash.manager;

import android.net.http.SslError;
import android.text.TextUtils;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.mbsignalcommon.listener.C13377b;
import com.mbridge.msdk.splash.report.C13665a;
import com.mbridge.msdk.splash.signal.C13678b;
import com.mbridge.msdk.splash.signal.C13679c;
import com.mbridge.msdk.splash.view.MBSplashView;
import com.mbridge.msdk.splash.view.MBSplashWebview;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.mbridge.msdk.splash.manager.g */
/* JADX INFO: compiled from: WebViewRenderManager.java */
/* JADX INFO: loaded from: classes7.dex */
public class C13660g {

    /* JADX INFO: renamed from: a */
    private boolean f38299a;

    /* JADX INFO: renamed from: b */
    private boolean f38300b;

    /* JADX INFO: renamed from: com.mbridge.msdk.splash.manager.g$a */
    /* JADX INFO: compiled from: WebViewRenderManager.java */
    class a extends C13377b {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ c f38301a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ MBSplashView f38302b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ CampaignEx f38303c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ String f38304d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ long f38305e;

        a(c cVar, MBSplashView mBSplashView, CampaignEx campaignEx, String str, long j) {
            this.f38301a = cVar;
            this.f38302b = mBSplashView;
            this.f38303c = campaignEx;
            this.f38304d = str;
            this.f38305e = j;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.C13377b, com.mbridge.msdk.mbsignalcommon.windvane.InterfaceC13389c
        /* JADX INFO: renamed from: a */
        public void mo34467a(WebView webView, int i) {
            super.mo34467a(webView, i);
            c cVar = this.f38301a;
            if (cVar != null) {
                cVar.mo39941a(i);
            }
            if (i == 1) {
                C13660g.this.f38299a = true;
                this.f38302b.setH5Ready(true);
                C13665a.m40020a(C13008c.m36588n().m36542d(), this.f38303c, this.f38304d, "", this.f38305e, 1);
                C13665a.m40017a(1, "", this.f38304d, this.f38303c);
                return;
            }
            C13660g.this.f38299a = false;
            this.f38302b.setH5Ready(false);
            C13665a.m40017a(2, "readyState 2", this.f38304d, this.f38303c);
            C13665a.m40020a(C13008c.m36588n().m36542d(), this.f38303c, this.f38304d, "readyState 2", this.f38305e, 3);
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.C13377b, com.mbridge.msdk.mbsignalcommon.windvane.InterfaceC13389c
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            c cVar = this.f38301a;
            if (cVar != null) {
                cVar.mo39940a();
            }
            C13660g.this.f38300b = true;
            if (!this.f38303c.isHasMBTplMark()) {
                this.f38302b.setH5Ready(true);
                C13665a.m40017a(1, "", this.f38304d, this.f38303c);
                C13665a.m40020a(C13008c.m36588n().m36542d(), this.f38303c, this.f38304d, "", this.f38305e, 1);
            }
            C13679c.m40077a(webView);
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.C13377b, com.mbridge.msdk.mbsignalcommon.windvane.InterfaceC13389c
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            c cVar = this.f38301a;
            if (cVar != null) {
                cVar.onError(str);
            }
            C13660g.this.m39950b();
            this.f38302b.setH5Ready(false);
            C13665a.m40017a(2, "error code:" + i + str, this.f38304d, this.f38303c);
            C13665a.m40020a(C13008c.m36588n().m36542d(), this.f38303c, this.f38304d, "error code:" + i + str, this.f38305e, 3);
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.C13377b, com.mbridge.msdk.mbsignalcommon.windvane.InterfaceC13389c
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
            c cVar = this.f38301a;
            if (cVar != null) {
                cVar.onError(sslError.toString());
            }
            C13660g.this.m39950b();
            this.f38302b.setH5Ready(false);
            C13665a.m40017a(2, "error url:" + sslError.getUrl(), this.f38304d, this.f38303c);
            C13665a.m40020a(C13008c.m36588n().m36542d(), this.f38303c, this.f38304d, "error url:" + sslError.getUrl(), this.f38305e, 3);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.splash.manager.g$b */
    /* JADX INFO: compiled from: WebViewRenderManager.java */
    static class b {

        /* JADX INFO: renamed from: a */
        private static final C13660g f38307a = new C13660g(null);
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.splash.manager.g$c */
    /* JADX INFO: compiled from: WebViewRenderManager.java */
    public interface c {
        /* JADX INFO: renamed from: a */
        void mo39940a();

        /* JADX INFO: renamed from: a */
        void mo39941a(int i);

        void onError(String str);
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.splash.manager.g$d */
    /* JADX INFO: compiled from: WebViewRenderManager.java */
    public static class d {

        /* JADX INFO: renamed from: a */
        private String f38308a;

        /* JADX INFO: renamed from: b */
        private String f38309b;

        /* JADX INFO: renamed from: c */
        private CampaignEx f38310c;

        /* JADX INFO: renamed from: d */
        private String f38311d;

        /* JADX INFO: renamed from: e */
        private boolean f38312e;

        /* JADX INFO: renamed from: f */
        private int f38313f;

        /* JADX INFO: renamed from: a */
        public CampaignEx m39952a() {
            return this.f38310c;
        }

        /* JADX INFO: renamed from: a */
        public void m39953a(int i) {
            this.f38313f = i;
        }

        /* JADX INFO: renamed from: a */
        public void m39954a(CampaignEx campaignEx) {
            this.f38310c = campaignEx;
        }

        /* JADX INFO: renamed from: a */
        public void m39955a(String str) {
            this.f38311d = str;
        }

        /* JADX INFO: renamed from: a */
        public void m39956a(boolean z) {
            this.f38312e = z;
        }

        /* JADX INFO: renamed from: b */
        public int m39957b() {
            return this.f38313f;
        }

        /* JADX INFO: renamed from: b */
        public void m39958b(String str) {
            this.f38308a = str;
        }

        /* JADX INFO: renamed from: c */
        public String m39959c() {
            return this.f38311d;
        }

        /* JADX INFO: renamed from: c */
        public void m39960c(String str) {
            this.f38309b = str;
        }

        /* JADX INFO: renamed from: d */
        public String m39961d() {
            return this.f38308a;
        }

        /* JADX INFO: renamed from: e */
        public String m39962e() {
            return this.f38309b;
        }

        /* JADX INFO: renamed from: f */
        public boolean m39963f() {
            return this.f38312e;
        }
    }

    private C13660g() {
        this.f38299a = false;
        this.f38300b = false;
    }

    /* synthetic */ C13660g(a aVar) {
        this();
    }

    /* JADX INFO: renamed from: a */
    public static C13660g m39946a() {
        return b.f38307a;
    }

    /* JADX INFO: renamed from: a */
    public void m39949a(MBSplashView mBSplashView, d dVar, c cVar) {
        if (mBSplashView == null || dVar == null) {
            return;
        }
        String strM39962e = dVar.m39962e();
        String strM39961d = dVar.m39961d();
        CampaignEx campaignExM39952a = dVar.m39952a();
        String strM39959c = dVar.m39959c();
        boolean zM39963f = dVar.m39963f();
        int iM39957b = dVar.m39957b();
        MBSplashWebview splashWebview = mBSplashView.getSplashWebview();
        if (splashWebview == null) {
            return;
        }
        C13678b c13678b = new C13678b(mBSplashView.getContext(), strM39961d, strM39962e);
        ArrayList arrayList = new ArrayList();
        arrayList.add(campaignExM39952a);
        c13678b.m40067a(arrayList);
        c13678b.m40063a(zM39963f ? 1 : 0);
        c13678b.m40069b(iM39957b);
        mBSplashView.setSplashSignalCommunicationImpl(c13678b);
        String requestIdNotice = TextUtils.isEmpty(campaignExM39952a.getRequestId()) ? campaignExM39952a.getRequestIdNotice() : campaignExM39952a.getRequestId();
        String requestId = splashWebview.getRequestId();
        C13219q0.m37816b("WebViewRenderManager", "CampaignEx RequestId = " + requestIdNotice + " WebView RequestId = " + requestId);
        if (!TextUtils.isEmpty(requestId) && requestId.equals(requestIdNotice) && (this.f38299a || this.f38300b)) {
            mBSplashView.setH5Ready(true);
            if (cVar != null) {
                cVar.mo39941a(1);
                return;
            }
            return;
        }
        m39950b();
        splashWebview.setRequestId(requestIdNotice);
        C13665a.m40029b(strM39962e, campaignExM39952a);
        long jCurrentTimeMillis = System.currentTimeMillis();
        splashWebview.setWebViewListener(new a(cVar, mBSplashView, campaignExM39952a, strM39962e, jCurrentTimeMillis));
        if (!splashWebview.isDestoryed()) {
            splashWebview.loadUrl(strM39959c);
        } else {
            mBSplashView.setH5Ready(false);
            C13665a.m40020a(C13008c.m36588n().m36542d(), campaignExM39952a, strM39962e, "webview had destory", jCurrentTimeMillis, 3);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m39950b() {
        this.f38299a = false;
        this.f38300b = false;
    }
}
