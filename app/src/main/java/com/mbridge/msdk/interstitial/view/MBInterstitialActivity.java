package com.mbridge.msdk.interstitial.view;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.net.http.SslError;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.AdError;
import com.ironsource.C11744X3;
import com.mbridge.msdk.activity.MBBaseActivity;
import com.mbridge.msdk.click.C12682a;
import com.mbridge.msdk.click.C12684c;
import com.mbridge.msdk.click.retry.C12701a;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.controller.C13009d;
import com.mbridge.msdk.foundation.entity.C13080n;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.feedback.C13084b;
import com.mbridge.msdk.foundation.feedback.InterfaceC13083a;
import com.mbridge.msdk.foundation.p289db.C13017g;
import com.mbridge.msdk.foundation.p289db.C13020j;
import com.mbridge.msdk.foundation.same.buffer.C13091b;
import com.mbridge.msdk.foundation.same.report.C13145g;
import com.mbridge.msdk.foundation.same.report.C13146h;
import com.mbridge.msdk.foundation.same.threadpool.C13167a;
import com.mbridge.msdk.foundation.same.webview.C13168a;
import com.mbridge.msdk.foundation.tools.C13182a1;
import com.mbridge.msdk.foundation.tools.C13203i0;
import com.mbridge.msdk.foundation.tools.C13211m0;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.foundation.tools.C13229v0;
import com.mbridge.msdk.interstitial.cache.C13249a;
import com.mbridge.msdk.interstitial.controller.C13250a;
import com.mbridge.msdk.mbsignalcommon.listener.C13377b;
import com.mbridge.msdk.mbsignalcommon.mraid.C13380a;
import com.mbridge.msdk.mbsignalcommon.mraid.C13382c;
import com.mbridge.msdk.mbsignalcommon.mraid.C13383d;
import com.mbridge.msdk.mbsignalcommon.mraid.InterfaceC13381b;
import com.mbridge.msdk.mbsignalcommon.windvane.C13392f;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.NativeListener;
import com.mbridge.msdk.setting.C13636h;
import com.mbridge.msdk.setting.C13640l;
import com.unity3d.ads.BuildConfig;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class MBInterstitialActivity extends MBBaseActivity implements InterfaceC13381b {
    public static final String INTENT_CAMAPIGN = "campaign";
    public static final String INTENT_UNIT_ID = "unitId";
    public static final long WATI_JS_INVOKE = 2000;
    public static final long WEB_LOAD_TIME = 15000;

    /* JADX INFO: renamed from: i */
    private CampaignEx f36532i;

    /* JADX INFO: renamed from: j */
    private WindVaneWebView f36533j;

    /* JADX INFO: renamed from: k */
    private ImageView f36534k;

    /* JADX INFO: renamed from: l */
    private C13250a.d f36535l;

    /* JADX INFO: renamed from: m */
    private boolean f36536m;
    public ProgressBar mProgressBar;
    public String mUnitid;

    /* JADX INFO: renamed from: n */
    private C13383d f36537n;

    /* JADX INFO: renamed from: o */
    private long f36538o;

    /* JADX INFO: renamed from: p */
    private boolean f36539p;

    /* JADX INFO: renamed from: q */
    private boolean f36540q;

    /* JADX INFO: renamed from: u */
    private C12682a f36544u;

    /* JADX INFO: renamed from: g */
    private boolean f36530g = false;

    /* JADX INFO: renamed from: h */
    private boolean f36531h = false;
    public boolean mIsMBPage = false;

    /* JADX INFO: renamed from: r */
    private Handler f36541r = new HandlerC13261f();

    /* JADX INFO: renamed from: s */
    Runnable f36542s = new RunnableC13265j();

    /* JADX INFO: renamed from: t */
    Runnable f36543t = new RunnableC13266k();

    /* JADX INFO: renamed from: com.mbridge.msdk.interstitial.view.MBInterstitialActivity$a */
    class RunnableC13256a implements Runnable {
        RunnableC13256a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ProgressBar progressBar = MBInterstitialActivity.this.mProgressBar;
            if (progressBar != null) {
                progressBar.setVisibility(0);
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.interstitial.view.MBInterstitialActivity$b */
    class RunnableC13257b implements Runnable {
        RunnableC13257b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ProgressBar progressBar = MBInterstitialActivity.this.mProgressBar;
            if (progressBar != null) {
                progressBar.setVisibility(8);
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.interstitial.view.MBInterstitialActivity$c */
    class C13258c implements NativeListener.NativeTrackingListener {
        C13258c() {
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDismissLoading(Campaign campaign) {
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDownloadFinish(Campaign campaign) {
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDownloadProgress(int i) {
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDownloadStart(Campaign campaign) {
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onFinishRedirection(Campaign campaign, String str) {
            try {
                MBInterstitialActivity.this.hideLoading();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public boolean onInterceptDefaultLoadingDialog() {
            return false;
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onRedirectionFailed(Campaign campaign, String str) {
            MBInterstitialActivity.this.hideLoading();
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onShowLoading(Campaign campaign) {
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onStartRedirection(Campaign campaign, String str) {
            try {
                MBInterstitialActivity.this.showLoading();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.interstitial.view.MBInterstitialActivity$d */
    class RunnableC13259d implements Runnable {
        RunnableC13259d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C13380a.m38682a().m38691b(MBInterstitialActivity.this.f36533j, MBInterstitialActivity.this.f36533j.getLeft(), MBInterstitialActivity.this.f36533j.getTop(), MBInterstitialActivity.this.f36533j.getWidth(), MBInterstitialActivity.this.f36533j.getHeight());
            C13380a.m38682a().m38687a(MBInterstitialActivity.this.f36533j, MBInterstitialActivity.this.f36533j.getLeft(), MBInterstitialActivity.this.f36533j.getTop(), MBInterstitialActivity.this.f36533j.getWidth(), MBInterstitialActivity.this.f36533j.getHeight());
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.interstitial.view.MBInterstitialActivity$e */
    class RunnableC13260e implements Runnable {
        RunnableC13260e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C13020j.m36706a(C13017g.m36693a(MBInterstitialActivity.this)).m36709b(MBInterstitialActivity.this.f36532i.getId());
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.interstitial.view.MBInterstitialActivity$f */
    class HandlerC13261f extends Handler {
        HandlerC13261f() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.interstitial.view.MBInterstitialActivity$h */
    class ViewOnClickListenerC13263h implements View.OnClickListener {
        ViewOnClickListenerC13263h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MBInterstitialActivity.this.finish();
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.interstitial.view.MBInterstitialActivity$i */
    class C13264i extends C13377b {
        C13264i() {
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.C13377b, com.mbridge.msdk.mbsignalcommon.windvane.InterfaceC13389c
        /* JADX INFO: renamed from: a */
        public void mo34467a(WebView webView, int i) {
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.C13377b, com.mbridge.msdk.mbsignalcommon.windvane.InterfaceC13389c
        /* JADX INFO: renamed from: b */
        public void mo38121b(WebView webView, int i) {
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.C13377b, com.mbridge.msdk.mbsignalcommon.windvane.InterfaceC13389c
        public void onPageFinished(WebView webView, String str) {
            try {
                if (MBInterstitialActivity.this.f36536m) {
                    return;
                }
                MBInterstitialActivity.this.m38095a(1, "");
                MBInterstitialActivity mBInterstitialActivity = MBInterstitialActivity.this;
                if (mBInterstitialActivity.f36542s != null && mBInterstitialActivity.f36541r != null) {
                    MBInterstitialActivity.this.f36541r.removeCallbacks(MBInterstitialActivity.this.f36542s);
                }
                if (MBInterstitialActivity.this.f36535l != null) {
                    MBInterstitialActivity.this.f36535l.m38076c();
                }
                MBInterstitialActivity mBInterstitialActivity2 = MBInterstitialActivity.this;
                if (!mBInterstitialActivity2.mIsMBPage) {
                    mBInterstitialActivity2.f36541r.postDelayed(MBInterstitialActivity.this.f36543t, 2000L);
                }
                MBInterstitialActivity.this.m38112i();
            } catch (Exception e) {
                e.printStackTrace();
                if (MBInterstitialActivity.this.f36535l != null) {
                    MBInterstitialActivity.this.f36535l.m38074a("load page failed");
                }
            }
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.C13377b, com.mbridge.msdk.mbsignalcommon.windvane.InterfaceC13389c
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.C13377b, com.mbridge.msdk.mbsignalcommon.windvane.InterfaceC13389c
        public void onProgressChanged(WebView webView, int i) {
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.C13377b, com.mbridge.msdk.mbsignalcommon.windvane.InterfaceC13389c
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            try {
                MBInterstitialActivity.this.f36536m = true;
                if (MBInterstitialActivity.this.f36535l != null) {
                    MBInterstitialActivity.this.f36535l.m38074a(str);
                }
                MBInterstitialActivity.this.m38095a(3, str);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.C13377b, com.mbridge.msdk.mbsignalcommon.windvane.InterfaceC13389c
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            MBInterstitialActivity.this.f36536m = true;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.C13377b, com.mbridge.msdk.mbsignalcommon.windvane.InterfaceC13389c
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            return true;
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.interstitial.view.MBInterstitialActivity$j */
    class RunnableC13265j implements Runnable {
        RunnableC13265j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (MBInterstitialActivity.this.f36531h) {
                return;
            }
            MBInterstitialActivity.this.f36530g = true;
            if (MBInterstitialActivity.this.f36535l != null) {
                MBInterstitialActivity.this.f36535l.m38074a("load page timeout");
                if (MBInterstitialActivity.this.f36533j != null) {
                    MBInterstitialActivity.this.f36533j.setVisibility(8);
                    MBInterstitialActivity.this.f36533j.setWebViewListener(null);
                    MBInterstitialActivity.this.f36533j.release();
                }
                MBInterstitialActivity.this.hideLoading();
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.interstitial.view.MBInterstitialActivity$k */
    class RunnableC13266k implements Runnable {
        RunnableC13266k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MBInterstitialActivity mBInterstitialActivity = MBInterstitialActivity.this;
            if (mBInterstitialActivity.mIsMBPage) {
                return;
            }
            if (mBInterstitialActivity.f36532i != null && MBInterstitialActivity.this.f36532i.isMraid()) {
                MBInterstitialActivity.this.m38119m();
            }
            C13249a.m38034a().m38037a(MBInterstitialActivity.this.f36532i, MBInterstitialActivity.this.mUnitid);
            if (MBInterstitialActivity.this.f36530g) {
                return;
            }
            MBInterstitialActivity.this.f36531h = true;
            MBInterstitialActivity.this.hideLoading();
            MBInterstitialActivity.this.showWebView();
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.interstitial.view.MBInterstitialActivity$l */
    class C13267l implements C13383d.b {
        C13267l() {
        }

        @Override // com.mbridge.msdk.mbsignalcommon.mraid.C13383d.b
        /* JADX INFO: renamed from: a */
        public void mo38122a(double d) {
            C13380a.m38682a().m38685a(MBInterstitialActivity.this.f36533j, d);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.interstitial.view.MBInterstitialActivity$m */
    class RunnableC13268m implements Runnable {
        RunnableC13268m() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (MBInterstitialActivity.this.f36533j != null && MBInterstitialActivity.this.f36532i != null) {
                    MBInterstitialActivity.this.f36533j.setVisibility(0);
                    if (MBInterstitialActivity.this.f36532i.isMraid()) {
                        MBInterstitialActivity.this.m38116k();
                    }
                    MBInterstitialActivity.this.m38115j();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.interstitial.view.MBInterstitialActivity$n */
    class RunnableC13269n implements Runnable {
        RunnableC13269n() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (MBInterstitialActivity.this.f36533j != null) {
                MBInterstitialActivity.this.f36533j.setVisibility(8);
            }
        }
    }

    /* JADX INFO: renamed from: l */
    private void m38118l() {
        C13146h c13146h = new C13146h(getApplicationContext());
        CampaignEx campaignEx = this.f36532i;
        if (campaignEx != null) {
            c13146h.m37372b(campaignEx.getRequestId(), this.f36532i.getRequestIdNotice(), this.f36532i.getId(), this.mUnitid, C13382c.m38701b(this.f36532i.getId()), this.f36532i.isBidCampaign());
            C13382c.m38699a(this.f36532i.getId());
            this.f36539p = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public void m38119m() {
        List<String> pv_urls;
        try {
            C13008c.m36588n().m36527a(this);
            if (!TextUtils.isEmpty(this.f36532i.getImpressionURL())) {
                Context contextM36542d = C13008c.m36588n().m36542d();
                CampaignEx campaignEx = this.f36532i;
                C12682a.m34606a(contextM36542d, campaignEx, this.mUnitid, campaignEx.getImpressionURL(), false, true, C12701a.f33766m);
            }
            if (!TextUtils.isEmpty(this.f36532i.getOnlyImpressionURL())) {
                Context contextM36542d2 = C13008c.m36588n().m36542d();
                CampaignEx campaignEx2 = this.f36532i;
                C12682a.m34606a(contextM36542d2, campaignEx2, this.mUnitid, campaignEx2.getOnlyImpressionURL(), false, true, C12701a.f33767n);
            }
            C13091b.m37104a(this.mUnitid, this.f36532i, "interstitial");
            RunnableC13260e runnableC13260e = new RunnableC13260e();
            if (C13009d.m36589a().m36605e()) {
                C13167a.m37543b().execute(runnableC13260e);
            } else {
                runnableC13260e.run();
            }
            CampaignEx campaignEx3 = this.f36532i;
            if (campaignEx3 == null || (pv_urls = campaignEx3.getPv_urls()) == null || pv_urls.size() <= 0) {
                return;
            }
            Iterator<String> it = pv_urls.iterator();
            while (it.hasNext()) {
                C12682a.m34605a(C13008c.m36588n().m36542d(), this.f36532i, this.mUnitid, it.next(), false, true);
            }
        } catch (Throwable th) {
            C13219q0.m37813a("MBInterstitialActivity", th.getMessage());
        }
    }

    /* JADX INFO: renamed from: n */
    private void m38120n() {
        CampaignEx campaignEx;
        this.f36534k.setOnClickListener(new ViewOnClickListenerC13263h());
        if (this.f36533j == null || (campaignEx = this.f36532i) == null) {
            return;
        }
        C13168a c13168a = new C13168a(campaignEx);
        c13168a.m37548a(this.f36532i.getAppName());
        this.f36533j.setCampaignId(this.f36532i.getId());
        this.f36533j.setDownloadListener(c13168a);
    }

    public void clickTracking() {
        try {
            if (this.f36532i != null && !C13182a1.m37596a(this.mUnitid)) {
                onIntersClick();
                C12682a c12682a = new C12682a(getApplicationContext(), this.mUnitid);
                this.f36544u = c12682a;
                c12682a.m34636a(new C13258c());
                this.f36544u.m34633a(this.f36532i);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.InterfaceC13381b
    public void close() {
        finish();
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.InterfaceC13381b
    public void expand(String str, boolean z) {
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        if (!this.f36539p) {
            m38118l();
        }
        if (this.f36540q) {
            return;
        }
        reportPlayableClosed();
    }

    public C13640l getIntersUnitSetting() {
        try {
            if (TextUtils.isEmpty(this.mUnitid)) {
                return null;
            }
            C13640l c13640lM39720e = C13636h.m39706b().m39720e(C13008c.m36588n().m36533b(), this.mUnitid);
            return c13640lM39720e == null ? C13640l.m39752h(this.mUnitid) : c13640lM39720e;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.InterfaceC13381b
    public CampaignEx getMraidCampaign() {
        return this.f36532i;
    }

    public void goneWebView() {
        try {
            runOnUiThread(new RunnableC13269n());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void hideLoading() {
        try {
            runOnUiThread(new RunnableC13257b());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void initView() {
        this.f36533j = (WindVaneWebView) findViewById(C13203i0.m37707a(getApplicationContext(), "mbridge_interstitial_wv", "id"));
        this.mProgressBar = (ProgressBar) findViewById(C13203i0.m37707a(getApplicationContext(), "mbridge_interstitial_pb", "id"));
        this.f36534k = (ImageView) findViewById(C13203i0.m37707a(getApplicationContext(), "mbridge_interstitial_iv_close", "id"));
    }

    @Override // com.mbridge.msdk.activity.MBBaseActivity
    public void onBackDispatched() {
    }

    @Override // com.mbridge.msdk.activity.MBBaseActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            int iM37707a = C13203i0.m37707a(getApplicationContext(), "mbridge_interstitial_activity", "layout");
            try {
                if (!C13203i0.m37709a(iM37707a)) {
                    m38108g();
                    m38107f();
                    C13250a.d dVar = this.f36535l;
                    if (dVar != null) {
                        dVar.m38074a("not found resource");
                    }
                    finish();
                    return;
                }
                setContentView(iM37707a);
                initView();
                m38105e();
                C13008c.m36588n().m36527a(this);
                C13084b.m37036b().m37045a(this.mUnitid, this, (ViewGroup) null, (ViewGroup.LayoutParams) null, new C13262g());
                this.f36532i.setCampaignUnitId(this.mUnitid);
                C13084b.m37036b().m37046a(this.mUnitid, this.f36532i);
                return;
            } catch (Exception e) {
                e = e;
            }
        } catch (Exception e2) {
            e = e2;
        }
        e.printStackTrace();
    }

    @Override // com.mbridge.msdk.activity.MBBaseActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        try {
            C13250a.d dVar = this.f36535l;
            if (dVar != null) {
                dVar.m38075b();
            }
            C12682a c12682a = this.f36544u;
            if (c12682a != null) {
                c12682a.m34638a(false);
                this.f36544u.m34636a((NativeListener.NativeTrackingListener) null);
                this.f36544u.m34640c();
            }
            C13383d c13383d = this.f36537n;
            if (c13383d != null) {
                c13383d.m38706d();
            }
            if (!this.f36539p) {
                m38118l();
            }
            if (C13250a.f36499r != null && !TextUtils.isEmpty(this.mUnitid)) {
                C13250a.f36499r.remove(this.mUnitid);
            }
            this.f36535l = null;
            C13084b.m37036b().m37054d(this.mUnitid);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void onIntersClick() {
        try {
            C13250a.d dVar = this.f36535l;
            if (dVar != null) {
                dVar.m38073a();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        CampaignEx campaignEx = this.f36532i;
        if (campaignEx == null || !campaignEx.isMraid()) {
            return;
        }
        C13380a.m38682a().m38694c(this.f36533j, "false");
    }

    @Override // com.mbridge.msdk.activity.MBBaseActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        CampaignEx campaignEx = this.f36532i;
        if (campaignEx == null || !campaignEx.isMraid()) {
            return;
        }
        C13380a.m38682a().m38694c(this.f36533j, "true");
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.InterfaceC13381b
    public void open(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f36532i.setClickURL(str);
            m38097a(str);
        }
        this.f36532i.setClickTempSource(2);
        this.f36532i.setClickType(2);
        this.f36532i.setTriggerClickSource(2);
        clickTracking();
    }

    public void reportPlayableClosed() {
        if (this.f36532i != null) {
            C13080n c13080n = new C13080n("2000061", this.f36532i.getId(), this.f36532i.getRequestId(), this.f36532i.getRequestIdNotice(), this.mUnitid, C13211m0.m37770s(C13008c.m36588n().m36542d()));
            c13080n.m36961b(this.f36532i.isMraid() ? C13080n.f35733N : C13080n.f35734O);
            C13145g.m37361b(c13080n, C13008c.m36588n().m36542d(), this.mUnitid);
            this.f36540q = true;
        }
    }

    @Override // com.mbridge.msdk.activity.MBBaseActivity
    public void setTopControllerPadding(int i, int i2, int i3, int i4, int i5) {
        int iM37876a = C13229v0.m37876a(this, 10.0f);
        if (i2 <= 0) {
            i2 = iM37876a;
        }
        if (i3 <= 0) {
            i3 = iM37876a;
        }
        if (i4 <= 0) {
            i4 = iM37876a;
        }
        if (i5 <= 0) {
            i5 = iM37876a;
        }
        if (this.f36534k != null) {
            int iM37876a2 = C13229v0.m37876a(this, 25.0f);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iM37876a2, iM37876a2);
            layoutParams.addRule(11);
            layoutParams.setMargins(i2, i4, i3, i5);
            this.f36534k.setLayoutParams(layoutParams);
        }
    }

    public void showLoading() {
        try {
            runOnUiThread(new RunnableC13256a());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void showWebView() {
        runOnUiThread(new RunnableC13268m());
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.InterfaceC13381b
    public void unload() {
        close();
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.InterfaceC13381b
    public void useCustomClose(boolean z) {
        if (z) {
            this.f36534k.setImageDrawable(new ColorDrawable(0));
        } else {
            this.f36534k.setImageResource(C13203i0.m37707a(getApplicationContext(), "mbridge_interstitial_close", "drawable"));
        }
    }

    /* JADX INFO: renamed from: e */
    private void m38105e() {
        m38108g();
        m38120n();
        m38107f();
        m38110h();
    }

    /* JADX INFO: renamed from: f */
    private void m38107f() {
        try {
            if (C13250a.f36499r == null || TextUtils.isEmpty(this.mUnitid) || !C13250a.f36499r.containsKey(this.mUnitid)) {
                return;
            }
            this.f36535l = C13250a.f36499r.get(this.mUnitid);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: g */
    private void m38108g() {
        Intent intent = getIntent();
        if (intent != null) {
            this.mUnitid = intent.getStringExtra("unitId");
            this.f36532i = (CampaignEx) intent.getSerializableExtra("campaign");
        }
        CampaignEx campaignEx = this.f36532i;
        if (campaignEx != null && campaignEx.isMraid()) {
            C13383d c13383d = new C13383d(this);
            this.f36537n = c13383d;
            c13383d.m38705c();
            this.f36537n.m38703a(new C13267l());
        }
        CampaignEx campaignEx2 = this.f36532i;
        if (campaignEx2 != null) {
            C12684c.m34654a(this, campaignEx2.getMaitve(), this.f36532i.getMaitve_src());
        }
    }

    /* JADX INFO: renamed from: h */
    private void m38110h() {
        try {
            CampaignEx campaignEx = this.f36532i;
            if (campaignEx == null || (TextUtils.isEmpty(campaignEx.getHtmlUrl()) && !this.f36532i.isMraid())) {
                C13250a.d dVar = this.f36535l;
                if (dVar != null) {
                    dVar.m38074a("htmlurl is null");
                    return;
                }
                return;
            }
            C13219q0.m37818c("MBInterstitialActivity", "url:" + this.f36532i.getHtmlUrl());
            goneWebView();
            this.f36533j.setWebViewListener(new C13264i());
            String htmlUrl = this.f36532i.getHtmlUrl();
            if (this.f36532i.isMraid()) {
                File file = new File(this.f36532i.getMraid());
                if (file.exists() && file.isFile() && file.canRead()) {
                    htmlUrl = "file:////" + this.f36532i.getMraid();
                }
            }
            this.f36538o = System.currentTimeMillis();
            this.f36533j.loadUrl(htmlUrl);
            this.f36541r.postDelayed(this.f36542s, 15000L);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public void m38112i() {
        String str;
        CampaignEx campaignEx = this.f36532i;
        if (campaignEx == null || !campaignEx.isMraid()) {
            return;
        }
        int i = getResources().getConfiguration().orientation;
        if (i == 0) {
            str = AdError.UNDEFINED_DOMAIN;
        } else if (i != 1) {
            str = i != 2 ? "UNDEFINED" : C11744X3.i.f26320C;
        } else {
            str = C11744X3.i.f26322D;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("orientation", str);
            jSONObject.put("locked", "true");
        } catch (Exception e) {
            e.printStackTrace();
        }
        float fM37760n = C13211m0.m37760n(this);
        float fM37757m = C13211m0.m37757m(this);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        float f = displayMetrics.widthPixels;
        float f2 = displayMetrics.heightPixels;
        HashMap map = new HashMap();
        map.put("placementType", "Interstitial");
        map.put("state", BuildConfig.FLAVOR);
        map.put("viewable", "true");
        map.put("currentAppOrientation", jSONObject);
        C13380a.m38682a().m38690b(this.f36533j, fM37760n, fM37757m);
        C13380a.m38682a().m38686a(this.f36533j, f, f2);
        C13380a.m38682a().m38689a(this.f36533j, map);
        C13380a.m38682a().m38685a(this.f36533j, this.f36537n.m38702a());
        C13380a.m38682a().m38684a(this.f36533j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public void m38115j() {
        CampaignEx campaignEx = this.f36532i;
        if (campaignEx == null || !campaignEx.isMraid()) {
            return;
        }
        this.f36533j.post(new RunnableC13259d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public void m38116k() {
        try {
            C13080n c13080n = new C13080n();
            c13080n.m36990n(this.f36532i.getRequestId());
            c13080n.m36992o(this.f36532i.getRequestIdNotice());
            c13080n.m36962b(this.f36532i.getId());
            c13080n.m36961b(this.f36532i.isMraid() ? C13080n.f35733N : C13080n.f35734O);
            C13145g.m37364d(c13080n, getApplicationContext(), this.mUnitid);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m38095a(int i, String str) {
        CampaignEx campaignEx = this.f36532i;
        if (campaignEx == null || !campaignEx.isMraid()) {
            return;
        }
        C13080n c13080n = new C13080n();
        c13080n.m36990n(this.f36532i.getRequestId());
        c13080n.m36992o(this.f36532i.getRequestIdNotice());
        c13080n.m36962b(this.f36532i.getId());
        c13080n.m36968d(i);
        c13080n.m36972e(String.valueOf(System.currentTimeMillis() - this.f36538o));
        c13080n.m36976g("");
        c13080n.m36988m(str);
        c13080n.m36959a(CampaignEx.CLICKMODE_ON);
        c13080n.m36961b(this.f36532i.isMraid() ? C13080n.f35733N : C13080n.f35734O);
        C13145g.m37362b(c13080n, this.mUnitid, this.f36532i);
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.interstitial.view.MBInterstitialActivity$g */
    class C13262g implements InterfaceC13083a {
        C13262g() {
        }

        @Override // com.mbridge.msdk.foundation.feedback.InterfaceC13083a
        /* JADX INFO: renamed from: a */
        public void mo34411a() {
            String string;
            MBInterstitialActivity.this.onPause();
            try {
                JSONObject jSONObject = new JSONObject();
                if (C13008c.m36588n().m36542d() != null) {
                    jSONObject.put("status", 1);
                }
                string = jSONObject.toString();
            } catch (Throwable th) {
                C13219q0.m37817b("MBInterstitialActivity", th.getMessage(), th);
                string = "";
            }
            C13392f.m38726a().m38728a((WebView) MBInterstitialActivity.this.f36533j, "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
        }

        @Override // com.mbridge.msdk.foundation.feedback.InterfaceC13083a
        public void close() {
            String string;
            MBInterstitialActivity.this.onResume();
            try {
                JSONObject jSONObject = new JSONObject();
                if (C13008c.m36588n().m36542d() != null) {
                    jSONObject.put("status", 2);
                }
                string = jSONObject.toString();
            } catch (Throwable th) {
                C13219q0.m37817b("MBInterstitialActivity", th.getMessage(), th);
                string = "";
            }
            C13392f.m38726a().m38728a((WebView) MBInterstitialActivity.this.f36533j, "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
        }

        @Override // com.mbridge.msdk.foundation.feedback.InterfaceC13083a
        /* JADX INFO: renamed from: a */
        public void mo34412a(String str) {
            String string;
            MBInterstitialActivity.this.onResume();
            try {
                JSONObject jSONObject = new JSONObject();
                if (C13008c.m36588n().m36542d() != null) {
                    jSONObject.put("status", 2);
                }
                string = jSONObject.toString();
            } catch (Throwable th) {
                C13219q0.m37817b("MBInterstitialActivity", th.getMessage(), th);
                string = "";
            }
            C13392f.m38726a().m38728a((WebView) MBInterstitialActivity.this.f36533j, "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
        }
    }

    /* JADX INFO: renamed from: a */
    private void m38097a(String str) {
        CampaignEx mraidCampaign = getMraidCampaign();
        if (mraidCampaign != null) {
            new C13146h(getApplicationContext()).m37371a(mraidCampaign.getRequestId(), mraidCampaign.getRequestIdNotice(), mraidCampaign.getId(), this.mUnitid, str, mraidCampaign.isBidCampaign());
        }
    }
}
