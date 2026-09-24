package com.mbridge.msdk.video.p291bt.module;

import android.content.Context;
import android.content.res.Configuration;
import android.net.http.SslError;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.View;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.ironsource.C11744X3;
import com.mbridge.msdk.click.C12682a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.C13146h;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.foundation.tools.C13227u0;
import com.mbridge.msdk.mbsignalcommon.base.C13350c;
import com.mbridge.msdk.mbsignalcommon.listener.C13376a;
import com.mbridge.msdk.mbsignalcommon.windvane.C13392f;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.util.C13884b;
import com.mbridge.msdk.video.p291bt.component.C13893d;
import com.mbridge.msdk.video.signal.impl.C14191k;
import com.mbridge.msdk.videocommon.setting.C14223c;
import com.tiktok.appevents.edp.TTEDPEventConstants;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class MBridgeBTWebView extends MBridgeBTWebViewDiff {

    /* JADX INFO: renamed from: p */
    private String f39906p;

    /* JADX INFO: renamed from: q */
    private String f39907q;

    /* JADX INFO: renamed from: r */
    private String f39908r;

    /* JADX INFO: renamed from: s */
    private boolean f39909s;

    /* JADX INFO: renamed from: t */
    private ImageView f39910t;

    /* JADX INFO: renamed from: u */
    private boolean f39911u;

    /* JADX INFO: renamed from: v */
    private C14223c f39912v;

    /* JADX INFO: renamed from: w */
    private List<CampaignEx> f39913w;

    /* JADX INFO: renamed from: x */
    private WebView f39914x;

    /* JADX INFO: renamed from: com.mbridge.msdk.video.bt.module.MBridgeBTWebView$a */
    class C13926a extends C13376a {
        C13926a() {
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.C13376a, com.mbridge.msdk.mbsignalcommon.windvane.InterfaceC13389c
        /* JADX INFO: renamed from: a */
        public void mo34467a(WebView webView, int i) {
            super.mo34467a(webView, i);
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.C13376a
        /* JADX INFO: renamed from: a */
        public void mo38672a(Object obj) {
            super.mo38672a(obj);
            try {
                C14191k c14191k = MBridgeBTWebView.this.jsCommon;
                String strEncodeToString = "";
                String strMo42216c = c14191k != null ? c14191k.mo42216c() : "";
                if (TextUtils.isEmpty(strMo42216c)) {
                    C13219q0.m37813a("RVWindVaneWebView", "getEndScreenInfo failed");
                } else {
                    strEncodeToString = Base64.encodeToString(strMo42216c.getBytes(), 2);
                    C13219q0.m37813a("RVWindVaneWebView", "getEndScreenInfo success");
                }
                C13392f.m38726a().m38731b(obj, strEncodeToString);
            } catch (Throwable th) {
                C13219q0.m37813a("RVWindVaneWebView", th.getMessage());
            }
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.C13376a, com.mbridge.msdk.mbsignalcommon.windvane.InterfaceC13389c
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            if (MBridgeBTWebView.this.f39914x != null) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("id", MBridgeBTWebView.this.f39714d);
                    jSONObject.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, BTBaseView.f39709n);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("id", MBridgeBTWebView.this.f39714d);
                    jSONObject2.put("result", 1);
                    jSONObject.put("data", jSONObject2);
                    C13392f.m38726a().m38728a(MBridgeBTWebView.this.f39914x, "onWebviewLoad", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                } catch (Exception e) {
                    C13893d.m41513c().m41456a(MBridgeBTWebView.this.f39914x, e.getMessage());
                    C13219q0.m37813a("RVWindVaneWebView", e.getMessage());
                }
            }
            C13392f.m38726a().m38727a(MBridgeBTWebView.this.webView);
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.C13376a, com.mbridge.msdk.mbsignalcommon.windvane.InterfaceC13389c
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            if (MBridgeBTWebView.this.f39914x != null) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("id", MBridgeBTWebView.this.f39714d);
                    jSONObject.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, BTBaseView.f39709n);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("id", MBridgeBTWebView.this.f39714d);
                    jSONObject2.put("result", 2);
                    jSONObject2.put("error", str);
                    jSONObject.put("data", jSONObject2);
                    C13392f.m38726a().m38728a(MBridgeBTWebView.this.f39914x, "onWebviewLoad", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                } catch (Exception e) {
                    C13893d.m41513c().m41456a(MBridgeBTWebView.this.f39914x, e.getMessage());
                    C13219q0.m37813a("RVWindVaneWebView", e.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.C13376a, com.mbridge.msdk.mbsignalcommon.windvane.InterfaceC13389c
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
            if (MBridgeBTWebView.this.f39914x != null) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("id", MBridgeBTWebView.this.f39714d);
                    jSONObject.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, BTBaseView.f39709n);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("id", MBridgeBTWebView.this.f39714d);
                    jSONObject2.put("result", 2);
                    jSONObject2.put("error", sslError.toString());
                    jSONObject.put("data", jSONObject2);
                    C13392f.m38726a().m38728a(MBridgeBTWebView.this.f39914x, "onWebviewLoad", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                } catch (Exception e) {
                    C13893d.m41513c().m41456a(MBridgeBTWebView.this.f39914x, e.getMessage());
                    C13219q0.m37813a("RVWindVaneWebView", e.getMessage());
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.bt.module.MBridgeBTWebView$b */
    class ViewOnClickListenerC13927b implements View.OnClickListener {
        ViewOnClickListenerC13927b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (MBridgeBTWebView.this.f39914x != null) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, BTBaseView.f39709n);
                    jSONObject.put("id", MBridgeBTWebView.this.f39714d);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("x", String.valueOf(view.getX()));
                    jSONObject2.put("y", String.valueOf(view.getY()));
                    jSONObject.put("data", jSONObject2);
                    C13392f.m38726a().m38728a(MBridgeBTWebView.this.f39914x, "onClicked", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                } catch (Exception unused) {
                    C13893d.m41513c().m41457a(MBridgeBTWebView.this.f39914x, "onClicked", MBridgeBTWebView.this.f39714d);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.bt.module.MBridgeBTWebView$c */
    class ViewOnClickListenerC13928c implements View.OnClickListener {
        ViewOnClickListenerC13928c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MBridgeBTWebView.this.close();
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.bt.module.MBridgeBTWebView$d */
    class RunnableC13929d implements Runnable {
        RunnableC13929d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                WindVaneWebView windVaneWebView = MBridgeBTWebView.this.webView;
                if (windVaneWebView != null) {
                    windVaneWebView.clearWebView();
                    MBridgeBTWebView.this.webView.release();
                }
                MBridgeBTWebView.this.f39906p = null;
                MBridgeBTWebView.this.f39907q = null;
                MBridgeBTWebView.this.f39908r = null;
                if (MBridgeBTWebView.this.f39914x != null) {
                    MBridgeBTWebView.this.f39914x = null;
                }
            } catch (Throwable th) {
                C13219q0.m37813a(BTBaseView.TAG, th.getMessage());
            }
        }
    }

    public MBridgeBTWebView(Context context) {
        super(context);
        this.f39909s = false;
        this.f39911u = false;
    }

    public MBridgeBTWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f39909s = false;
        this.f39911u = false;
    }

    private void setIntentFilter(C13350c c13350c) {
        WindVaneWebView windVaneWebView = this.webView;
        if (windVaneWebView != null) {
            windVaneWebView.setFilter(c13350c);
        }
    }

    public void broadcast(String str, JSONObject jSONObject) {
        if (this.webView != null) {
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, BTBaseView.f39709n);
                jSONObject2.put("id", this.f39714d);
                jSONObject2.put(C11744X3.i.f26373j0, str);
                jSONObject2.put("data", jSONObject);
                C13392f.m38726a().m38728a((WebView) this.webView, "broadcast", Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
            } catch (Exception unused) {
                C13893d.m41513c().m41457a((WebView) this.webView, "broadcast", this.f39714d);
            }
        }
    }

    @Override // com.mbridge.msdk.video.p291bt.module.MBridgeBTWebViewDiff, com.mbridge.msdk.mbsignalcommon.mraid.InterfaceC13381b
    public void close() {
        WebView webView = this.f39914x;
        if (webView != null) {
            BTBaseView.m41515a(webView, "onPlayerCloseBtnClicked", this.f39714d);
        }
    }

    @Override // com.mbridge.msdk.video.p291bt.module.MBridgeBTWebViewDiff, com.mbridge.msdk.mbsignalcommon.mraid.InterfaceC13381b
    public void expand(String str, boolean z) {
    }

    public List<CampaignEx> getCampaigns() {
        return this.f39913w;
    }

    public String getFilePath() {
        return this.f39907q;
    }

    public String getFileURL() {
        return this.f39906p;
    }

    public String getHtml() {
        return this.f39908r;
    }

    @Override // com.mbridge.msdk.video.p291bt.module.MBridgeBTWebViewDiff, com.mbridge.msdk.mbsignalcommon.mraid.InterfaceC13381b
    public CampaignEx getMraidCampaign() {
        return this.f39712b;
    }

    public C14223c getRewardUnitSetting() {
        return this.f39912v;
    }

    public WindVaneWebView getWebView() {
        return this.webView;
    }

    @Override // com.mbridge.msdk.video.p291bt.module.BTBaseView
    public void init(Context context) {
        WindVaneWebView windVaneWebView = new WindVaneWebView(context);
        this.webView = windVaneWebView;
        windVaneWebView.setBackgroundColor(0);
        this.webView.setVisibility(0);
        C14191k c14191k = new C14191k(null, this.f39712b, this.f39913w);
        this.jsCommon = c14191k;
        c14191k.setUnitId(this.f39713c);
        if (C13884b.m41421a()) {
            setChinaAlertInstallState(this.jsCommon);
        }
        this.webView.setObject(this.jsCommon);
        this.webView.setMraidObject(this);
        this.webView.setWebViewListener(new C13926a());
        addView(this.webView, new FrameLayout.LayoutParams(-1, -1));
        setOnClickListener(new ViewOnClickListenerC13927b());
        try {
            ImageView imageView = new ImageView(getContext());
            this.f39910t = imageView;
            imageView.setImageResource(findDrawable("mbridge_reward_close"));
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(96, 96);
            layoutParams.gravity = 8388661;
            layoutParams.setMargins(30, 30, 30, 30);
            this.f39910t.setLayoutParams(layoutParams);
            this.f39910t.setVisibility(this.f39909s ? 4 : 8);
            CampaignEx campaignEx = this.f39712b;
            if (campaignEx != null && campaignEx.isMraid()) {
                this.f39910t.setVisibility(4);
            }
            this.f39910t.setOnClickListener(new ViewOnClickListenerC13928c());
            addView(this.f39910t);
        } catch (Throwable th) {
            C13219q0.m37813a(BTBaseView.TAG, th.getMessage());
        }
    }

    public void onBackPressed() {
        if (this.webView != null) {
            C13893d.m41513c().m41457a((WebView) this.webView, "onSystemBackPressed", this.f39714d);
        }
    }

    @Override // com.mbridge.msdk.video.p291bt.module.BTBaseView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        if (this.webView != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                if (configuration.orientation == 2) {
                    jSONObject.put("orientation", C11744X3.i.f26320C);
                } else {
                    jSONObject.put("orientation", C11744X3.i.f26322D);
                }
                jSONObject.put("instanceId", this.f39714d);
                C13392f.m38726a().m38728a((WebView) this.webView, "orientation", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override // com.mbridge.msdk.video.p291bt.module.BTBaseView
    public void onDestory() {
        if (this.f39911u) {
            return;
        }
        this.f39911u = true;
        try {
            if (this.webView != null) {
                C13893d.m41513c().m41457a((WebView) this.webView, "onSystemDestory", this.f39714d);
            }
            new Handler(Looper.getMainLooper()).postDelayed(new RunnableC13929d(), 500L);
            setOnClickListener(null);
            removeAllViews();
        } catch (Throwable th) {
            C13219q0.m37813a(BTBaseView.TAG, th.getMessage());
        }
    }

    @Override // com.mbridge.msdk.out.BaseTrackingListener
    public void onFinishRedirection(Campaign campaign, String str) {
        C13227u0.m37860a(campaign, this);
    }

    @Override // com.mbridge.msdk.out.BaseTrackingListener
    public void onRedirectionFailed(Campaign campaign, String str) {
        C13227u0.m37860a(campaign, this);
    }

    @Override // com.mbridge.msdk.out.BaseTrackingListener
    public void onStartRedirection(Campaign campaign, String str) {
        C13227u0.m37863b(campaign, this);
    }

    @Override // com.mbridge.msdk.video.p291bt.module.MBridgeBTWebViewDiff, com.mbridge.msdk.mbsignalcommon.mraid.InterfaceC13381b
    public void open(String str) {
        try {
            String clickURL = this.f39712b.getClickURL();
            if (!TextUtils.isEmpty(str)) {
                this.f39712b.setClickURL(str);
                reportOpen(str);
            }
            this.f39712b.setClickTempSource(2);
            this.f39712b.setClickType(2);
            this.f39712b.setTriggerClickSource(2);
            C12682a c12682a = new C12682a(getContext(), this.f39713c);
            c12682a.m34632a(this);
            c12682a.m34633a(this.f39712b);
            this.f39712b.setClickURL(clickURL);
        } catch (Throwable th) {
            C13219q0.m37816b(BTBaseView.TAG, th.getMessage());
        }
    }

    public void preload() {
        if (!TextUtils.isEmpty(this.f39906p)) {
            this.webView.loadUrl(this.f39906p);
        } else if (!TextUtils.isEmpty(this.f39907q)) {
            this.webView.loadUrl(this.f39907q);
        } else {
            if (TextUtils.isEmpty(this.f39908r)) {
                return;
            }
            this.webView.loadDataWithBaseURL("", this.f39908r, "text/html", "UTF-8", null);
        }
    }

    @Override // com.mbridge.msdk.video.p291bt.module.MBridgeBTWebViewDiff
    public void reportOpen(String str) {
        try {
            CampaignEx mraidCampaign = getMraidCampaign();
            if (mraidCampaign != null) {
                new C13146h(getContext()).m37371a(mraidCampaign.getRequestId(), mraidCampaign.getRequestIdNotice(), mraidCampaign.getId(), this.f39713c, str, this.f39712b.isBidCampaign());
            }
        } catch (Throwable th) {
            C13219q0.m37813a(BTBaseView.TAG, th.getMessage());
        }
    }

    public void setCampaigns(List<CampaignEx> list) {
        this.f39913w = list;
    }

    public void setCreateWebView(WebView webView) {
        this.f39914x = webView;
    }

    public void setFilePath(String str) {
        this.f39907q = str;
    }

    public void setFileURL(String str) {
        this.f39906p = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        boolean zContains = str.contains("play.google.com");
        setWebviewClickable(!zContains);
        if (zContains) {
            setIntentFilter(new C13350c());
        }
    }

    public void setHtml(String str) {
        this.f39908r = str;
    }

    @Override // com.mbridge.msdk.video.p291bt.module.BTBaseView
    public void setRewardUnitSetting(C14223c c14223c) {
        this.f39912v = c14223c;
    }

    public void setTempTypeForMetrics(int i) {
        WindVaneWebView windVaneWebView = this.webView;
        if (windVaneWebView != null) {
            windVaneWebView.setTempTypeForMetrics(i);
        }
    }

    public void setWebViewLocalRequestId(String str) {
        WindVaneWebView windVaneWebView = this.webView;
        if (windVaneWebView != null) {
            windVaneWebView.setLocalRequestId(str);
        }
    }

    public void setWebViewRid(String str) {
        WindVaneWebView windVaneWebView = this.webView;
        if (windVaneWebView != null) {
            windVaneWebView.setRid(str);
        }
    }

    public void setWebviewClickable(boolean z) {
        WindVaneWebView windVaneWebView = this.webView;
        if (windVaneWebView != null) {
            windVaneWebView.setClickable(z);
        }
    }

    @Override // com.mbridge.msdk.video.p291bt.module.MBridgeBTWebViewDiff, com.mbridge.msdk.mbsignalcommon.mraid.InterfaceC13381b
    public void unload() {
        close();
    }

    @Override // com.mbridge.msdk.video.p291bt.module.MBridgeBTWebViewDiff, com.mbridge.msdk.mbsignalcommon.mraid.InterfaceC13381b
    public void useCustomClose(boolean z) {
        try {
            this.f39910t.setVisibility(z ? 4 : 0);
        } catch (Throwable th) {
            C13219q0.m37816b(BTBaseView.TAG, th.getMessage());
        }
    }

    public boolean webviewGoBack() {
        WindVaneWebView windVaneWebView = this.webView;
        if (windVaneWebView == null || !windVaneWebView.canGoBack()) {
            return false;
        }
        this.webView.goBack();
        return true;
    }

    public boolean webviewGoForward() {
        WindVaneWebView windVaneWebView = this.webView;
        if (windVaneWebView == null || !windVaneWebView.canGoForward()) {
            return false;
        }
        this.webView.goForward();
        return true;
    }

    public void webviewLoad(int i) {
        if (this.jsCommon == null) {
            this.jsCommon = new C14191k(null, this.f39712b, this.f39913w);
        }
        CampaignEx campaignEx = this.f39712b;
        if (campaignEx != null) {
            this.jsCommon.m42377c(campaignEx);
        } else {
            List<CampaignEx> list = this.f39913w;
            if (list != null && list.size() > 0) {
                this.jsCommon.m42375a(this.f39913w);
                if (this.f39913w.size() == 1) {
                    this.jsCommon.m42377c(this.f39913w.get(0));
                }
            }
        }
        C14223c c14223c = this.f39912v;
        if (c14223c != null) {
            this.jsCommon.setRewardUnitSetting(c14223c);
        }
        this.jsCommon.setUnitId(this.f39713c);
        this.jsCommon.m42378c(this.f39714d);
        if (C13884b.m41421a()) {
            setChinaAlertInstallState(this.jsCommon);
        }
        if (i == 1) {
            this.jsCommon.m42383r();
        }
        WindVaneWebView windVaneWebView = this.webView;
        if (windVaneWebView != null) {
            windVaneWebView.setObject(this.jsCommon);
        }
        CampaignEx campaignEx2 = this.f39712b;
        if (campaignEx2 != null && campaignEx2.isMraid()) {
            this.f39910t.setVisibility(4);
        }
        preload();
    }

    public boolean webviewReload() {
        WindVaneWebView windVaneWebView = this.webView;
        if (windVaneWebView == null) {
            return false;
        }
        windVaneWebView.reload();
        return true;
    }
}
