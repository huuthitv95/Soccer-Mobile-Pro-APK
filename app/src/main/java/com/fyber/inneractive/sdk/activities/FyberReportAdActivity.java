package com.fyber.inneractive.sdk.activities;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.fyber.inneractive.sdk.C7809R;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.flow.InterfaceC8123h;
import com.fyber.inneractive.sdk.util.AbstractC9149f1;
import com.fyber.inneractive.sdk.util.AbstractC9195v;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.RunnableC9175o0;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public class FyberReportAdActivity extends InneractiveBaseActivity {

    /* JADX INFO: renamed from: f */
    public static InterfaceC8123h f17455f;

    /* JADX INFO: renamed from: b */
    public WebView f17456b;

    /* JADX INFO: renamed from: c */
    public String f17457c;

    /* JADX INFO: renamed from: d */
    public String f17458d;

    /* JADX INFO: renamed from: e */
    public String f17459e;

    public static Intent createIntent(Context context, String str, String str2, Long l) {
        Intent intent = new Intent(context, (Class<?>) FyberReportAdActivity.class);
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        Bundle bundle = new Bundle();
        bundle.putString("advertiser_domain", str);
        bundle.putString("dsp_name", str2);
        bundle.putString("dsp_id", l != null ? Long.toString(l.longValue()) : null);
        intent.putExtras(bundle);
        return intent;
    }

    public static void disableWebviewZoomControls(WebView webView) {
        webView.getSettings().setSupportZoom(true);
        webView.getSettings().setBuiltInZoomControls(true);
        new RunnableC9175o0(webView).run();
    }

    public static InterfaceC8123h getAdReporter() {
        return f17455f;
    }

    public static void start(Context context, InterfaceC8123h interfaceC8123h, String str, String str2, Long l) {
        f17455f = interfaceC8123h;
        try {
            context.startActivity(createIntent(context, str, str2, l));
        } catch (Exception e) {
            IAlog.m21944a("failed starting fyber report ad activity", e, new Object[0]);
        }
    }

    /* JADX INFO: renamed from: a */
    public final FrameLayout m20323a() {
        WebView webView;
        FrameLayout frameLayout = new FrameLayout(this);
        try {
            webView = new WebView(IAConfigManager.f17654M.f17689u.m20436a());
            webView.setWebViewClient(new C7811a(this));
            webView.setId(C7809R.id.ia_inneractive_webview_report_ad);
            WebSettings settings = webView.getSettings();
            settings.setJavaScriptEnabled(true);
            settings.setSupportZoom(true);
            settings.setBuiltInZoomControls(true);
            settings.setUseWideViewPort(true);
            settings.setLoadWithOverviewMode(true);
            disableWebviewZoomControls(webView);
            HashMap map = new HashMap();
            if (!TextUtils.isEmpty(this.f17457c)) {
                map.put("advertiser_domain", this.f17457c);
            }
            if (!TextUtils.isEmpty(this.f17458d)) {
                map.put("dsp_name", this.f17458d);
            }
            if (!TextUtils.isEmpty(this.f17459e)) {
                map.put("dsp_id", this.f17459e);
            }
            webView.loadUrl(AbstractC9149f1.m21960a("https://cdn2.inner-active.mobi/client/fyber-i-icon/index.html", map));
        } catch (Exception unused) {
            IAlog.m21946b("failed creating webivew for report ad", new Object[0]);
            finish();
            webView = null;
        }
        this.f17456b = webView;
        frameLayout.addView(webView, -1, -1);
        return frameLayout;
    }

    public String getAdDomain() {
        return this.f17457c;
    }

    public String getAdNetwork() {
        return this.f17458d;
    }

    public String getAdNetworkId() {
        return this.f17459e;
    }

    @Override // com.fyber.inneractive.sdk.activities.InneractiveBaseActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        getWindow().requestFeature(2);
        getWindow().setFeatureInt(2, -1);
        getWindow().addFlags(1024);
        super.onCreate(bundle);
        if (getActionBar() != null) {
            getActionBar().hide();
        }
        try {
            Bundle extras = getIntent().getExtras();
            if (extras != null) {
                this.f17457c = extras.getString("advertiser_domain");
                this.f17458d = extras.getString("dsp_name");
                this.f17459e = extras.getString("dsp_id");
            }
            setContentView(m20323a());
        } catch (Exception e) {
            IAlog.m21944a("failed creating fyber report ad activity", e, new Object[0]);
            finish();
        }
    }

    @Override // com.fyber.inneractive.sdk.activities.InneractiveBaseActivity, android.app.Activity
    public void onDestroy() {
        WebView webView = this.f17456b;
        if (webView != null) {
            webView.removeAllViews();
            AbstractC9195v.m22027a(this.f17456b);
            this.f17456b.destroy();
            this.f17456b = null;
        }
        f17455f = null;
        super.onDestroy();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setVisible(false);
    }
}
