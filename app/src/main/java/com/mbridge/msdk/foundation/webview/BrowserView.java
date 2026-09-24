package com.mbridge.msdk.foundation.webview;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.LinearLayout;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.webview.C13168a;
import com.mbridge.msdk.foundation.tools.C13211m0;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.foundation.tools.C13229v0;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes6.dex */
public class BrowserView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    private CampaignEx f36413a;

    /* JADX INFO: renamed from: b */
    private String f36414b;

    /* JADX INFO: renamed from: c */
    private InterfaceC13242e f36415c;

    /* JADX INFO: renamed from: d */
    private WebView f36416d;

    /* JADX INFO: renamed from: e */
    private ProgressBar f36417e;

    /* JADX INFO: renamed from: f */
    private ToolBar f36418f;

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.webview.BrowserView$a */
    class ViewOnClickListenerC13238a implements View.OnClickListener {
        ViewOnClickListenerC13238a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (BrowserView.this.f36416d != null) {
                BrowserView.this.f36416d.stopLoading();
            }
            String str = (String) view.getTag();
            boolean z = false;
            if (TextUtils.equals(str, com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar.BACKWARD)) {
                BrowserView.this.f36418f.getItem(com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar.FORWARD).setEnabled(true);
                if (BrowserView.this.f36416d != null && BrowserView.this.f36416d.canGoBack()) {
                    BrowserView.this.f36416d.goBack();
                }
                View item = BrowserView.this.f36418f.getItem(com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar.BACKWARD);
                if (BrowserView.this.f36416d != null && BrowserView.this.f36416d.canGoBack()) {
                    z = true;
                }
                item.setEnabled(z);
                return;
            }
            if (TextUtils.equals(str, com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar.FORWARD)) {
                BrowserView.this.f36418f.getItem(com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar.BACKWARD).setEnabled(true);
                if (BrowserView.this.f36416d != null && BrowserView.this.f36416d.canGoForward()) {
                    BrowserView.this.f36416d.goForward();
                }
                View item2 = BrowserView.this.f36418f.getItem(com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar.FORWARD);
                if (BrowserView.this.f36416d != null && BrowserView.this.f36416d.canGoForward()) {
                    z = true;
                }
                item2.setEnabled(z);
                return;
            }
            if (!TextUtils.equals(str, com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar.REFRESH)) {
                if (!TextUtils.equals(str, com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar.EXITS) || BrowserView.this.f36415c == null) {
                    return;
                }
                BrowserView.this.f36415c.mo34364a();
                return;
            }
            BrowserView.this.f36418f.getItem(com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar.BACKWARD).setEnabled(BrowserView.this.f36416d != null && BrowserView.this.f36416d.canGoBack());
            View item3 = BrowserView.this.f36418f.getItem(com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar.FORWARD);
            if (BrowserView.this.f36416d != null && BrowserView.this.f36416d.canGoForward()) {
                z = true;
            }
            item3.setEnabled(z);
            if (BrowserView.this.f36416d != null) {
                BrowserView.this.f36416d.loadUrl(BrowserView.this.f36414b);
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.webview.BrowserView$b */
    class C13239b extends WebViewClient {
        C13239b() {
        }

        @Override // android.webkit.WebViewClient
        public void onLoadResource(WebView webView, String str) {
            super.onLoadResource(webView, str);
            C13219q0.m37818c("BrowserView", "onLoadResource 开始! = " + str);
            if (BrowserView.this.f36415c != null) {
                BrowserView.this.f36415c.mo34365a(webView, str);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            if (BrowserView.this.f36415c != null) {
                BrowserView.this.f36415c.onPageFinished(webView, str);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            C13219q0.m37818c("BrowserView", "开始! = " + str);
            BrowserView.this.f36414b = str;
            if (BrowserView.this.f36415c != null) {
                BrowserView.this.f36415c.onPageStarted(webView, str, bitmap);
            }
            BrowserView.this.f36417e.setVisible(true);
            BrowserView.this.f36417e.setProgressState(5);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            if (BrowserView.this.f36415c != null) {
                BrowserView.this.f36415c.onReceivedError(webView, i, str, str2);
            }
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            if (webView != null) {
                try {
                    ViewGroup viewGroup = (ViewGroup) webView.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(webView);
                    }
                    webView.destroy();
                } catch (Throwable th) {
                    C13219q0.m37816b("BrowserView", th.getMessage());
                    return true;
                }
            }
            if (BrowserView.this.f36415c != null) {
                BrowserView.this.f36415c.mo34364a();
            }
            return true;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            C13219q0.m37818c("BrowserView", "js大跳! = " + str);
            BrowserView.this.f36418f.getItem(com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar.BACKWARD).setEnabled(true);
            BrowserView.this.f36418f.getItem(com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar.FORWARD).setEnabled(false);
            if (BrowserView.this.f36415c != null) {
                return BrowserView.this.f36415c.shouldOverrideUrlLoading(webView, str);
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.webview.BrowserView$c */
    class C13240c extends WebChromeClient {

        /* JADX INFO: renamed from: com.mbridge.msdk.foundation.webview.BrowserView$c$a */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                BrowserView.this.f36417e.setVisible(false);
            }
        }

        C13240c() {
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i) {
            if (i == 100) {
                BrowserView.this.f36417e.setProgressState(7);
                new Handler().postDelayed(new a(), 200L);
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.webview.BrowserView$d */
    class C13241d extends WebChromeClient {

        /* JADX INFO: renamed from: com.mbridge.msdk.foundation.webview.BrowserView$d$a */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                BrowserView.this.f36417e.setVisible(false);
            }
        }

        C13241d() {
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i) {
            if (i == 100) {
                BrowserView.this.f36417e.setProgressState(7);
                new Handler().postDelayed(new a(), 200L);
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.webview.BrowserView$e */
    public interface InterfaceC13242e {
        /* JADX INFO: renamed from: a */
        void mo34364a();

        /* JADX INFO: renamed from: a */
        void mo34365a(WebView webView, String str);

        void onPageFinished(WebView webView, String str);

        void onPageStarted(WebView webView, String str, Bitmap bitmap);

        void onReceivedError(WebView webView, int i, String str, String str2);

        boolean shouldOverrideUrlLoading(WebView webView, String str);
    }

    public BrowserView(Context context, CampaignEx campaignEx) {
        super(context);
        this.f36413a = campaignEx;
        init();
    }

    private WebView getWebView() {
        WebView webView = new WebView(getContext());
        try {
            WebSettings settings = webView.getSettings();
            settings.setJavaScriptEnabled(true);
            settings.setCacheMode(-1);
            settings.setAllowFileAccess(true);
            settings.setBuiltInZoomControls(true);
            settings.setJavaScriptCanOpenWindowsAutomatically(true);
            settings.setDomStorageEnabled(true);
            settings.setSupportZoom(false);
            settings.setSavePassword(false);
            settings.setDatabaseEnabled(true);
            settings.setUseWideViewPort(true);
            settings.setLoadWithOverviewMode(true);
            settings.setRenderPriority(WebSettings.RenderPriority.HIGH);
            if (Build.VERSION.SDK_INT >= 26) {
                try {
                    settings.setSafeBrowsingEnabled(false);
                } catch (Throwable th) {
                    C13219q0.m37816b("BrowserView", th.getMessage());
                }
                settings.setMediaPlaybackRequiresUserGesture(false);
                settings.setAllowFileAccessFromFileURLs(false);
                settings.setAllowUniversalAccessFromFileURLs(false);
                try {
                    settings.setMixedContentMode(0);
                } catch (Exception e) {
                    C13219q0.m37816b("BrowserView", e.getMessage());
                }
                settings.setDatabaseEnabled(true);
                String path = getContext().getDir("database", 0).getPath();
                settings.setDatabasePath(path);
                settings.setGeolocationEnabled(true);
                settings.setGeolocationDatabasePath(path);
                try {
                    Method declaredMethod = WebSettings.class.getDeclaredMethod("setDisplayZoomControls", Boolean.TYPE);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(settings, Boolean.FALSE);
                } catch (Exception e2) {
                    C13219q0.m37816b("BrowserView", e2.getMessage());
                }
            } else {
                settings.setMediaPlaybackRequiresUserGesture(false);
                settings.setAllowFileAccessFromFileURLs(false);
                settings.setAllowUniversalAccessFromFileURLs(false);
                settings.setMixedContentMode(0);
                settings.setDatabaseEnabled(true);
                String path2 = getContext().getDir("database", 0).getPath();
                settings.setDatabasePath(path2);
                settings.setGeolocationEnabled(true);
                settings.setGeolocationDatabasePath(path2);
                Method declaredMethod2 = WebSettings.class.getDeclaredMethod("setDisplayZoomControls", Boolean.TYPE);
                declaredMethod2.setAccessible(true);
                declaredMethod2.invoke(settings, Boolean.FALSE);
            }
        } catch (Throwable th2) {
            C13219q0.m37816b("BrowserView", th2.getMessage());
        }
        webView.setDownloadListener(new C13168a(this.f36413a));
        webView.setWebViewClient(new C13239b());
        webView.setWebChromeClient(C13211m0.m37769s() <= 10 ? new C13240c() : new C13241d());
        return webView;
    }

    public void destroy() {
        try {
            WebView webView = this.f36416d;
            if (webView != null) {
                webView.setWebViewClient(null);
                this.f36416d.destroy();
                this.f36416d = null;
                removeAllViews();
            }
        } catch (Throwable th) {
            C13219q0.m37816b("BrowserView", th.getMessage());
        }
    }

    public void init() {
        setOrientation(1);
        setGravity(17);
        m37970a();
        this.f36417e.initResource(true);
        this.f36418f.getItem(com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar.BACKWARD).setEnabled(false);
        this.f36418f.getItem(com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar.FORWARD).setEnabled(false);
        this.f36418f.setOnItemClickListener(new ViewOnClickListenerC13238a());
    }

    public void loadUrl(String str) {
        WebView webView = this.f36416d;
        if (webView != null) {
            webView.loadUrl(str);
        }
    }

    public void setListener(InterfaceC13242e interfaceC13242e) {
        this.f36415c = interfaceC13242e;
    }

    public void setWebView(WebView webView) {
        this.f36416d = webView;
    }

    /* JADX INFO: renamed from: a */
    private void m37970a() {
        ProgressBar progressBar = new ProgressBar(getContext());
        this.f36417e = progressBar;
        progressBar.setLayoutParams(new LinearLayout.LayoutParams(-1, 4));
        try {
            if (this.f36416d == null) {
                this.f36416d = getWebView();
            }
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
            layoutParams.weight = 1.0f;
            this.f36416d.setLayoutParams(layoutParams);
        } catch (Throwable th) {
            C13219q0.m37817b("BrowserView", "webview is error", th);
        }
        this.f36418f = new ToolBar(getContext());
        this.f36418f.setLayoutParams(new LinearLayout.LayoutParams(-1, C13229v0.m37876a(getContext(), 40.0f)));
        this.f36418f.setBackgroundColor(-1);
        addView(this.f36417e);
        WebView webView = this.f36416d;
        if (webView != null) {
            addView(webView);
        }
        addView(this.f36418f);
    }

    public BrowserView(Context context) {
        super(context);
        init();
    }

    public BrowserView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }
}
