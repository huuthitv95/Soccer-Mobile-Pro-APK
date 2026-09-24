package com.mbridge.msdk.mbsignalcommon.commonwebview;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.webkit.ProxyConfig;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.mbridge.msdk.click.C12684c;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.foundation.tools.C13227u0;
import com.mbridge.msdk.foundation.tools.C13229v0;
import com.mbridge.msdk.foundation.webview.ProgressBar;
import com.mbridge.msdk.mbsignalcommon.base.BaseWebView;
import com.mbridge.msdk.mbsignalcommon.base.C13349b;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public class CommonWebView extends LinearLayout {
    public static int DEFAULT_JUMP_TIMEOUT = 10000;

    /* JADX INFO: renamed from: a */
    private int f37069a;

    /* JADX INFO: renamed from: b */
    private int f37070b;

    /* JADX INFO: renamed from: c */
    protected ToolBar f37071c;

    /* JADX INFO: renamed from: d */
    protected ToolBar f37072d;

    /* JADX INFO: renamed from: e */
    protected ProgressBar f37073e;

    /* JADX INFO: renamed from: f */
    private RelativeLayout f37074f;

    /* JADX INFO: renamed from: g */
    private View.OnClickListener f37075g;

    /* JADX INFO: renamed from: h */
    private C13370b f37076h;

    /* JADX INFO: renamed from: i */
    private C13369a f37077i;

    /* JADX INFO: renamed from: j */
    protected BaseWebView f37078j;

    /* JADX INFO: renamed from: k */
    private View.OnClickListener f37079k;

    /* JADX INFO: renamed from: l */
    private View.OnClickListener f37080l;

    /* JADX INFO: renamed from: m */
    private View.OnClickListener f37081m;

    /* JADX INFO: renamed from: n */
    private View.OnClickListener f37082n;

    /* JADX INFO: renamed from: o */
    private Handler f37083o;

    /* JADX INFO: renamed from: p */
    private int f37084p;

    /* JADX INFO: renamed from: q */
    private WebViewClient f37085q;

    /* JADX INFO: renamed from: r */
    private String f37086r;

    /* JADX INFO: renamed from: s */
    private InterfaceC13366i f37087s;

    /* JADX INFO: renamed from: t */
    private boolean f37088t;

    /* JADX INFO: renamed from: u */
    private final Runnable f37089u;

    /* JADX INFO: renamed from: com.mbridge.msdk.mbsignalcommon.commonwebview.CommonWebView$a */
    class RunnableC13358a implements Runnable {
        RunnableC13358a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C13219q0.m37816b("CommonWebView", "webview js!！超时上限：" + CommonWebView.this.f37084p + "ms");
            if (CommonWebView.this.f37087s != null) {
                CommonWebView.this.f37088t = false;
                CommonWebView.this.f37087s.mo38622a(CommonWebView.this.f37086r);
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.mbsignalcommon.commonwebview.CommonWebView$b */
    class C13359b extends WebViewClient {
        C13359b() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            C13219q0.m37818c("CommonWebView", "newProgress! 开始! = " + str);
            CommonWebView.this.f37073e.setVisible(true);
            CommonWebView.this.f37073e.setProgressState(5);
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            if (webView != null) {
                try {
                    ViewGroup viewGroup = (ViewGroup) webView.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(webView);
                    }
                    if (webView instanceof WindVaneWebView) {
                        ((WindVaneWebView) webView).release();
                    } else {
                        webView.destroy();
                    }
                } catch (Throwable th) {
                    C13219q0.m37816b("CommonWebView", th.getMessage());
                }
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.mbsignalcommon.commonwebview.CommonWebView$c */
    class C13360c extends WebChromeClient {

        /* JADX INFO: renamed from: com.mbridge.msdk.mbsignalcommon.commonwebview.CommonWebView$c$a */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                CommonWebView.this.f37073e.setVisible(false);
            }
        }

        C13360c() {
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i) {
            C13219q0.m37818c("CommonWebView", "newProgress! = " + i);
            if (i == 100) {
                CommonWebView.this.f37073e.setProgressState(7);
                new Handler().postDelayed(new a(), 200L);
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.mbsignalcommon.commonwebview.CommonWebView$d */
    class ViewOnClickListenerC13361d implements View.OnClickListener {
        ViewOnClickListenerC13361d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            BaseWebView baseWebView = CommonWebView.this.f37078j;
            if (baseWebView != null) {
                baseWebView.stopLoading();
                String str = (String) view.getTag();
                if (TextUtils.equals(str, ToolBar.BACKWARD)) {
                    CommonWebView.this.f37072d.getItem(ToolBar.FORWARD).setEnabled(true);
                    if (CommonWebView.this.f37078j.canGoBack()) {
                        CommonWebView.this.f37078j.goBack();
                    }
                    CommonWebView.this.f37072d.getItem(ToolBar.BACKWARD).setEnabled(CommonWebView.this.f37078j.canGoBack());
                    if (CommonWebView.this.f37079k != null) {
                        CommonWebView.this.f37079k.onClick(view);
                        return;
                    }
                    return;
                }
                if (TextUtils.equals(str, ToolBar.FORWARD)) {
                    CommonWebView.this.f37072d.getItem(ToolBar.BACKWARD).setEnabled(true);
                    if (CommonWebView.this.f37078j.canGoForward()) {
                        CommonWebView.this.f37078j.goForward();
                    }
                    CommonWebView.this.f37072d.getItem(ToolBar.FORWARD).setEnabled(CommonWebView.this.f37078j.canGoForward());
                    if (CommonWebView.this.f37080l != null) {
                        CommonWebView.this.f37080l.onClick(view);
                        return;
                    }
                    return;
                }
                if (TextUtils.equals(str, ToolBar.REFRESH)) {
                    CommonWebView.this.f37072d.getItem(ToolBar.BACKWARD).setEnabled(CommonWebView.this.f37078j.canGoBack());
                    CommonWebView.this.f37072d.getItem(ToolBar.FORWARD).setEnabled(CommonWebView.this.f37078j.canGoForward());
                    CommonWebView.this.f37078j.reload();
                    if (CommonWebView.this.f37081m != null) {
                        CommonWebView.this.f37081m.onClick(view);
                        return;
                    }
                    return;
                }
                if (TextUtils.equals(str, ToolBar.EXITS)) {
                    if (CommonWebView.this.f37075g != null) {
                        CommonWebView.this.f37075g.onClick(view);
                    }
                } else if (TextUtils.equals(str, ToolBar.OPEN_BY_BROWSER)) {
                    if (CommonWebView.this.f37082n != null) {
                        CommonWebView.this.f37082n.onClick(view);
                    }
                    C12684c.m34659c(CommonWebView.this.getContext(), CommonWebView.this.f37078j.getUrl());
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.mbsignalcommon.commonwebview.CommonWebView$e */
    class C13362e extends WebViewClient {
        C13362e() {
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            CommonWebView.this.f37072d.getItem(ToolBar.BACKWARD).setEnabled(true);
            CommonWebView.this.f37072d.getItem(ToolBar.FORWARD).setEnabled(false);
            return false;
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.mbsignalcommon.commonwebview.CommonWebView$f */
    class C13363f extends WebViewClient {
        C13363f() {
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (C13227u0.a.m37868b(str)) {
                C13227u0.a.m37866a(CommonWebView.this.getContext(), str, null);
            }
            return CommonWebView.this.m38631a(webView, str);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.mbsignalcommon.commonwebview.CommonWebView$g */
    class C13364g extends WebViewClient {
        C13364g() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            CommonWebView.this.f37088t = false;
            CommonWebView.this.m38629a();
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            CommonWebView.this.f37086r = str;
            if (CommonWebView.this.f37088t) {
                return;
            }
            CommonWebView.this.f37088t = true;
            CommonWebView.this.m38636c();
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            CommonWebView.this.f37088t = false;
            CommonWebView.this.m38629a();
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            CommonWebView.this.f37086r = str;
            if (CommonWebView.this.f37088t) {
                CommonWebView.this.m38629a();
            }
            CommonWebView.this.f37088t = true;
            CommonWebView.this.m38636c();
            return false;
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.mbsignalcommon.commonwebview.CommonWebView$h */
    public interface InterfaceC13365h {
        /* JADX INFO: renamed from: a */
        void mo38646a();
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.mbsignalcommon.commonwebview.CommonWebView$i */
    public interface InterfaceC13366i {
        /* JADX INFO: renamed from: a */
        void mo38622a(String str);
    }

    public CommonWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f37089u = new RunnableC13358a();
        init();
    }

    public void addWebChromeClient(WebChromeClient webChromeClient) {
        this.f37077i.m38658a(webChromeClient);
    }

    public void addWebViewClient(WebViewClient webViewClient) {
        this.f37076h.m38660a(webViewClient);
    }

    public View findToolBarButton(String str) {
        ToolBar toolBar;
        ToolBar toolBar2 = this.f37071c;
        View item = toolBar2 != null ? toolBar2.getItem(str) : null;
        return (item != null || (toolBar = this.f37072d) == null) ? item : toolBar.getItem(str);
    }

    public String getUrl() {
        BaseWebView baseWebView = this.f37078j;
        return baseWebView == null ? "" : baseWebView.getUrl();
    }

    public WebView getWebView() {
        return this.f37078j;
    }

    public void hideCustomizedToolBar() {
        ToolBar toolBar = this.f37071c;
        if (toolBar != null) {
            toolBar.setVisibility(8);
        }
    }

    public void hideDefaultToolBar() {
        ToolBar toolBar = this.f37072d;
        if (toolBar != null) {
            toolBar.setVisibility(8);
        }
    }

    public void hideToolBarButton(String str) {
        View viewFindToolBarButton = findToolBarButton(str);
        if (viewFindToolBarButton != null) {
            viewFindToolBarButton.setVisibility(8);
        }
    }

    public void hideToolBarTitle() {
        this.f37071c.hideTitle();
    }

    public void init() {
        setOrientation(1);
        setGravity(17);
        this.f37074f = new RelativeLayout(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        layoutParams.weight = 1.0f;
        addView(this.f37074f, layoutParams);
        this.f37069a = C13229v0.m37876a(getContext(), 40.0f);
        this.f37070b = C13229v0.m37876a(getContext(), 40.0f);
        this.f37076h = new C13370b();
        this.f37077i = new C13369a();
        initWebview();
    }

    public void initWebview() {
        try {
            if (this.f37078j == null) {
                this.f37078j = new BaseWebView(getContext());
            }
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(10);
            this.f37078j.setLayoutParams(layoutParams);
            BaseWebView baseWebView = this.f37078j;
            C13349b c13349b = baseWebView.mWebViewClient;
            baseWebView.setWebViewClient(this.f37076h);
            this.f37078j.setWebChromeClient(this.f37077i);
            addWebViewClient(c13349b);
        } catch (Throwable th) {
            C13219q0.m37817b("CommonWebView", "webview is error", th);
        }
        this.f37074f.addView(this.f37078j);
    }

    public void loadUrl(String str) {
        this.f37078j.loadUrl(str);
        if (this.f37085q != null) {
            m38636c();
        }
    }

    public void onBackwardClicked(View.OnClickListener onClickListener) {
        this.f37079k = onClickListener;
    }

    public void onForwardClicked(View.OnClickListener onClickListener) {
        this.f37080l = onClickListener;
    }

    public void onOpenByBrowserClicked(View.OnClickListener onClickListener) {
        this.f37082n = onClickListener;
    }

    public void onRefreshClicked(View.OnClickListener onClickListener) {
        this.f37081m = onClickListener;
    }

    public void removeWebChromeClient(WebChromeClient webChromeClient) {
        this.f37077i.m38659b(webChromeClient);
    }

    public void removeWebViewClient(WebViewClient webViewClient) {
        this.f37076h.m38661b(webViewClient);
    }

    public void setCustomizedToolBarFloating() {
        ((ViewGroup) this.f37071c.getParent()).removeView(this.f37071c);
        this.f37074f.addView(this.f37071c);
    }

    public void setCustomizedToolBarUnfloating() {
        ((ViewGroup) this.f37071c.getParent()).removeView(this.f37071c);
        addView(this.f37071c, 0);
    }

    public void setExitsClickListener(View.OnClickListener onClickListener) {
        this.f37075g = onClickListener;
    }

    public void setPageLoadTimtout(int i) {
        this.f37084p = i;
        if (this.f37083o == null) {
            this.f37083o = new Handler(Looper.getMainLooper());
        }
        if (this.f37085q == null) {
            C13364g c13364g = new C13364g();
            this.f37085q = c13364g;
            addWebViewClient(c13364g);
        }
    }

    public void setPageLoadTimtoutListener(InterfaceC13366i interfaceC13366i) {
        this.f37087s = interfaceC13366i;
    }

    public void setToolBarTitle(String str, int i) {
        this.f37071c.setTitle(str, i);
    }

    public void setWebChromeClient(WebChromeClient webChromeClient) {
        addWebChromeClient(webChromeClient);
    }

    public void setWebViewClient(WebViewClient webViewClient) {
        addWebViewClient(webViewClient);
    }

    public void showCustomizedToolBar() {
        ToolBar toolBar = this.f37071c;
        if (toolBar != null) {
            toolBar.setVisibility(0);
        }
    }

    public void showDefaultToolBar() {
        ToolBar toolBar = this.f37072d;
        if (toolBar != null) {
            toolBar.setVisibility(0);
        }
    }

    public void showToolBarButton(String str) {
        View viewFindToolBarButton = findToolBarButton(str);
        if (viewFindToolBarButton != null) {
            viewFindToolBarButton.setVisibility(0);
        }
    }

    public void showToolBarTitle() {
        this.f37071c.showTitle();
    }

    public void useCustomizedToolBar(ArrayList<ToolBar.C13368b> arrayList, boolean z) {
        m38630a(arrayList, z);
    }

    public void useDeeplink() {
        addWebViewClient(new C13363f());
    }

    public void useDefaultToolBar() {
        m38635b();
    }

    public void useProgressBar() {
        ProgressBar progressBar = new ProgressBar(getContext());
        this.f37073e = progressBar;
        progressBar.setLayoutParams(new LinearLayout.LayoutParams(-1, 4));
        addWebViewClient(new C13359b());
        addWebChromeClient(new C13360c());
        addView(this.f37073e);
        this.f37073e.initResource(true);
    }

    /* JADX INFO: renamed from: b */
    private void m38635b() {
        if (this.f37072d != null) {
            return;
        }
        this.f37072d = new ToolBar(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, this.f37070b);
        layoutParams.bottomMargin = 0;
        this.f37072d.setLayoutParams(layoutParams);
        this.f37072d.setBackgroundColor(-1);
        this.f37072d.setOnItemClickListener(new ViewOnClickListenerC13361d());
        addWebViewClient(new C13362e());
        addView(this.f37072d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public void m38636c() {
        this.f37083o.postDelayed(this.f37089u, this.f37084p);
    }

    public void setToolBarTitle(String str) {
        this.f37071c.setTitle(str);
    }

    public void useCustomizedToolBar(ArrayList<ToolBar.C13368b> arrayList) {
        m38630a(arrayList, false);
    }

    /* JADX INFO: renamed from: a */
    private void m38630a(ArrayList<ToolBar.C13368b> arrayList, boolean z) {
        if (this.f37071c != null) {
            return;
        }
        ToolBar.C13367a c13367a = new ToolBar.C13367a();
        c13367a.m38653a(40);
        c13367a.m38654b(80);
        ToolBar toolBar = new ToolBar(getContext(), c13367a, arrayList);
        this.f37071c = toolBar;
        toolBar.setBackgroundColor(Color.argb(153, 255, 255, 255));
        if (z) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, this.f37069a);
            layoutParams.addRule(10);
            this.f37071c.setLayoutParams(layoutParams);
            this.f37074f.addView(this.f37071c);
            return;
        }
        this.f37071c.setLayoutParams(new LinearLayout.LayoutParams(-1, this.f37069a));
        addView(this.f37071c, 0);
    }

    public CommonWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f37089u = new RunnableC13358a();
        init();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public boolean m38631a(WebView webView, String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            Uri uri = Uri.parse(str);
            if (!uri.getScheme().equals(ProxyConfig.MATCH_HTTP) && !uri.getScheme().equals("https")) {
                if (uri.getScheme().equals(SDKConstants.PARAM_INTENT)) {
                    Intent uri2 = Intent.parseUri(str, 1);
                    try {
                        String str2 = uri2.getPackage();
                        if (!TextUtils.isEmpty(str2) && getContext().getPackageManager().getLaunchIntentForPackage(str2) != null) {
                            uri2.setComponent(null);
                            uri2.setSelector(null);
                            uri2.setFlags(268435456);
                            getContext().startActivity(uri2);
                            return true;
                        }
                        try {
                            String stringExtra = uri2.getStringExtra("browser_fallback_url");
                            if (!TextUtils.isEmpty(stringExtra)) {
                                Uri uri3 = Uri.parse(str);
                                if (!uri3.getScheme().equals(ProxyConfig.MATCH_HTTP) && !uri3.getScheme().equals("https")) {
                                    str = stringExtra;
                                }
                                webView.loadUrl(stringExtra);
                                return false;
                            }
                        } catch (Throwable th) {
                            C13219q0.m37816b("CommonWebView", th.getMessage());
                        }
                    } catch (Throwable th2) {
                        C13219q0.m37816b("CommonWebView", th2.getMessage());
                    }
                    C13219q0.m37816b("CommonWebView", th.getMessage());
                    return false;
                }
                if (C12684c.m34660d(getContext(), str)) {
                    C13219q0.m37816b("CommonWebView", "openDeepLink");
                    return true;
                }
                if (!TextUtils.isEmpty(str)) {
                    return !(str.startsWith(ProxyConfig.MATCH_HTTP) || str.startsWith("https"));
                }
            }
            return false;
        } catch (Throwable th3) {
            C13219q0.m37816b("CommonWebView", th3.getMessage());
            return false;
        }
    }

    public CommonWebView(Context context) {
        super(context);
        this.f37089u = new RunnableC13358a();
        init();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m38629a() {
        this.f37083o.removeCallbacks(this.f37089u);
    }
}
