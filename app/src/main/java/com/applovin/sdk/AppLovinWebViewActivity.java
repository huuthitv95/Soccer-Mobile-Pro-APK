package com.applovin.sdk;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.applovin.impl.AbstractC1564g8;
import com.applovin.impl.AbstractC1701q7;
import com.applovin.impl.AbstractC1795v4;
import com.applovin.impl.C1831z4;
import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.C1768p;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.google.ads.mediation.applovin.AppLovinMediationAdapter;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public class AppLovinWebViewActivity extends Activity {
    public static final String EVENT_DISMISSED_VIA_BACK_BUTTON = "dismissed_via_back_button";
    public static final String INTENT_EXTRA_KEY_IMMERSIVE_MODE_ON = "immersive_mode_on";
    public static final String INTENT_EXTRA_KEY_LOAD_URL = "load_url";
    public static final String INTENT_EXTRA_KEY_SDK_KEY = "sdk_key";
    public static final String URI_PATH_WEBVIEW_EVENT = "webview_event";

    /* JADX INFO: renamed from: a */
    private final AtomicBoolean f4228a = new AtomicBoolean();

    /* JADX INFO: renamed from: b */
    private String f4229b;

    /* JADX INFO: renamed from: c */
    private WebView f4230c;

    /* JADX INFO: renamed from: d */
    private EventListener f4231d;

    public interface EventListener {
        void onReceivedEvent(String str);
    }

    /* JADX INFO: renamed from: com.applovin.sdk.AppLovinWebViewActivity$a */
    class C1845a extends AbstractC1795v4 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C1748l f4232a;

        C1845a(C1748l c1748l) {
            this.f4232a = c1748l;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: a */
        public /* synthetic */ void m5819a(C1748l c1748l) {
            if (!((Boolean) c1748l.m4801a(C1831z4.f3852W5)).booleanValue() || !AppLovinWebViewActivity.this.f4228a.compareAndSet(false, true)) {
                AppLovinWebViewActivity.this.finish();
                return;
            }
            AppLovinWebViewActivity.this.m5814a(c1748l);
            if (StringUtils.isValidString(AppLovinWebViewActivity.this.f4229b)) {
                AppLovinWebViewActivity.this.f4230c.loadUrl(AppLovinWebViewActivity.this.f4229b);
            }
        }

        @Override // com.applovin.impl.AbstractC1795v4
        /* JADX INFO: renamed from: a */
        protected Map mo1977a() {
            return CollectionUtils.hashMap("name", "AppLovinWebViewActivity");
        }

        @Override // com.applovin.impl.AbstractC1795v4, android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            if (AppLovinWebViewActivity.this.f4230c == webView) {
                AppLovinWebViewActivity.this.f4230c.destroy();
                AppLovinWebViewActivity.this.f4230c = null;
                AppLovinWebViewActivity appLovinWebViewActivity = AppLovinWebViewActivity.this;
                final C1748l c1748l = this.f4232a;
                appLovinWebViewActivity.runOnUiThread(new Runnable() { // from class: com.applovin.sdk.AppLovinWebViewActivity$a$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m5819a(c1748l);
                    }
                });
            }
            return super.onRenderProcessGone(webView, renderProcessGoneDetail);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Uri uri = Uri.parse(str);
            String scheme = uri.getScheme();
            String host = uri.getHost();
            String path = uri.getPath();
            this.f4232a.m4782Q();
            if (C1768p.m5160a()) {
                this.f4232a.m4782Q().m5171a("AppLovinWebViewActivity", "Handling url load: " + str);
            }
            if (!"applovin".equalsIgnoreCase(scheme) || !AppLovinMediationAdapter.APPLOVIN_SDK_ERROR_DOMAIN.equalsIgnoreCase(host) || AppLovinWebViewActivity.this.f4231d == null) {
                return super.shouldOverrideUrlLoading(webView, str);
            }
            if (!path.endsWith(AppLovinWebViewActivity.URI_PATH_WEBVIEW_EVENT)) {
                return true;
            }
            Set<String> queryParameterNames = uri.getQueryParameterNames();
            String str2 = queryParameterNames.isEmpty() ? "" : (String) queryParameterNames.toArray()[0];
            if (!StringUtils.isValidString(str2)) {
                this.f4232a.m4782Q();
                if (!C1768p.m5160a()) {
                    return true;
                }
                this.f4232a.m4782Q().m5174b("AppLovinWebViewActivity", "Failed to parse WebView event parameter");
                return true;
            }
            String queryParameter = uri.getQueryParameter(str2);
            this.f4232a.m4782Q();
            if (C1768p.m5160a()) {
                this.f4232a.m4782Q().m5171a("AppLovinWebViewActivity", "Parsed WebView event parameter name: " + str2 + " and value: " + queryParameter);
            }
            AppLovinWebViewActivity.this.f4231d.onReceivedEvent(queryParameter);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m5814a(C1748l c1748l) {
        WebView webViewM4075b = AbstractC1701q7.m4075b(this, "WebView Activity");
        this.f4230c = webViewM4075b;
        if (webViewM4075b == null) {
            finish();
            return;
        }
        setContentView(webViewM4075b);
        WebSettings settings = this.f4230c.getSettings();
        settings.setSupportMultipleWindows(false);
        settings.setJavaScriptEnabled(true);
        this.f4230c.setVerticalScrollBarEnabled(true);
        this.f4230c.setHorizontalScrollBarEnabled(true);
        this.f4230c.setScrollBarStyle(33554432);
        this.f4230c.setWebViewClient(new C1845a(c1748l));
    }

    public void loadUrl(String str, EventListener eventListener) {
        this.f4231d = eventListener;
        this.f4229b = str;
        this.f4228a.set(false);
        WebView webView = this.f4230c;
        if (webView != null) {
            webView.loadUrl(str);
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        EventListener eventListener = this.f4231d;
        if (eventListener != null) {
            eventListener.onReceivedEvent(EVENT_DISMISSED_VIA_BACK_BUTTON);
        }
        super.onBackPressed();
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (TextUtils.isEmpty(getIntent().getStringExtra(INTENT_EXTRA_KEY_SDK_KEY))) {
            C1768p.m5167h("AppLovinWebViewActivity", "No SDK key specified");
            finish();
            return;
        }
        C1748l c1748lM5807a = AppLovinSdk.getInstance(getApplicationContext()).m5807a();
        AbstractC1564g8.m2754a(findViewById(android.R.id.content), c1748lM5807a);
        m5814a(c1748lM5807a);
        if (getIntent().getBooleanExtra(INTENT_EXTRA_KEY_IMMERSIVE_MODE_ON, false)) {
            getWindow().getDecorView().setSystemUiVisibility(5894);
        }
        String stringExtra = getIntent().getStringExtra(INTENT_EXTRA_KEY_LOAD_URL);
        if (StringUtils.isValidString(stringExtra)) {
            this.f4229b = stringExtra;
        }
        if (StringUtils.isValidString(this.f4229b)) {
            this.f4230c.loadUrl(this.f4229b);
        }
    }
}
