package com.mbridge.msdk.click;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.common.net.HttpHeaders;
import com.ironsource.C11341A5;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.same.report.C13146h;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.setting.C13635g;
import com.mbridge.msdk.setting.C13636h;
import java.util.HashMap;

/* JADX INFO: renamed from: com.mbridge.msdk.click.o */
/* JADX INFO: compiled from: WebViewSpider.java */
/* JADX INFO: loaded from: classes4.dex */
public class C12698o {

    /* JADX INFO: renamed from: r */
    private static final String f33707r = "o";

    /* JADX INFO: renamed from: a */
    private int f33708a;

    /* JADX INFO: renamed from: b */
    private int f33709b;

    /* JADX INFO: renamed from: d */
    private C13635g f33711d;

    /* JADX INFO: renamed from: e */
    private f f33712e;

    /* JADX INFO: renamed from: f */
    private String f33713f;

    /* JADX INFO: renamed from: g */
    private String f33714g;

    /* JADX INFO: renamed from: h */
    private WebView f33715h;

    /* JADX INFO: renamed from: i */
    private boolean f33716i;

    /* JADX INFO: renamed from: j */
    private String f33717j;

    /* JADX INFO: renamed from: k */
    private int f33718k;

    /* JADX INFO: renamed from: m */
    private boolean f33720m;

    /* JADX INFO: renamed from: n */
    boolean f33721n;

    /* JADX INFO: renamed from: o */
    boolean f33722o;

    /* JADX INFO: renamed from: l */
    private boolean f33719l = false;

    /* JADX INFO: renamed from: p */
    private final Runnable f33723p = new d();

    /* JADX INFO: renamed from: q */
    private final Runnable f33724q = new e();

    /* JADX INFO: renamed from: c */
    private Handler f33710c = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: com.mbridge.msdk.click.o$a */
    /* JADX INFO: compiled from: WebViewSpider.java */
    class a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f33725a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f33726b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ Context f33727c;

        a(String str, String str2, Context context) {
            this.f33725a = str;
            this.f33726b = str2;
            this.f33727c = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            C12698o c12698o = C12698o.this;
            c12698o.m34719a(this.f33725a, this.f33726b, this.f33727c, c12698o.f33713f);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.click.o$b */
    /* JADX INFO: compiled from: WebViewSpider.java */
    class b extends WebViewClient {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f33729a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f33730b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ Context f33731c;

        b(String str, String str2, Context context) {
            this.f33729a = str;
            this.f33730b = str2;
            this.f33731c = context;
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            try {
                webView.loadUrl("javascript:window.navigator.vibrate([]);");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            try {
                webView.loadUrl("javascript:window.navigator.vibrate([]);");
                if (C12698o.this.f33720m) {
                    C12698o.this.f33718k = 0;
                    C12698o.this.m34730f();
                    return;
                }
                C12698o.this.f33722o = false;
                if (webView.getTag() == null) {
                    webView.setTag("has_first_started");
                } else {
                    C12698o.this.f33721n = true;
                }
                synchronized (C12698o.f33707r) {
                    C12698o.this.f33713f = str;
                    if (C12698o.this.f33712e == null || !C12698o.this.f33712e.mo34701a(str)) {
                        C12698o.this.m34734h();
                    } else {
                        C12698o.this.f33720m = true;
                        C12698o.this.m34730f();
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            synchronized (C12698o.f33707r) {
                C12698o.this.f33720m = true;
                C12698o.this.m34721b();
                C12698o.this.m34730f();
            }
            if (C12698o.this.f33712e != null) {
                C12698o.this.f33712e.mo34699a(i, webView.getUrl(), str, C12698o.this.f33717j);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            try {
                if (MBridgeConstans.IS_SP_CBT_CF && sslErrorHandler != null) {
                    sslErrorHandler.cancel();
                }
                if (TextUtils.isEmpty(this.f33729a) || TextUtils.isEmpty(this.f33730b)) {
                    return;
                }
                new C13146h(this.f33731c).m37369a(this.f33730b, this.f33729a, webView.getUrl());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            try {
                synchronized (C12698o.f33707r) {
                    C12698o.this.f33720m = true;
                    C12698o.this.m34721b();
                    C12698o.this.m34730f();
                }
                if (C12698o.this.f33712e != null) {
                    C12698o.this.f33712e.mo34699a(-1, webView.getUrl(), "WebView render process crash.", C12698o.this.f33717j);
                }
                if (webView != null) {
                    webView.destroy();
                }
                return true;
            } catch (Throwable th) {
                C13219q0.m37816b(C12698o.f33707r, th.getMessage());
                return true;
            }
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            synchronized (C12698o.f33707r) {
                C12698o c12698o = C12698o.this;
                c12698o.f33722o = true;
                c12698o.m34725c();
                if (C12698o.this.f33720m) {
                    C12698o.this.m34726d();
                    C12698o.this.m34730f();
                    return true;
                }
                C12698o.this.f33713f = str;
                if (C12698o.this.f33712e != null && C12698o.this.f33712e.mo34703c(str)) {
                    C12698o.this.f33720m = true;
                    C12698o.this.m34726d();
                    C12698o.this.m34730f();
                    return true;
                }
                if (C12698o.this.f33716i) {
                    HashMap map = new HashMap();
                    if (C12698o.this.f33715h.getUrl() != null) {
                        map.put(HttpHeaders.REFERER, C12698o.this.f33715h.getUrl());
                    }
                    C12698o.this.f33715h.loadUrl(str, map);
                } else {
                    C12698o.this.f33715h.loadUrl(str);
                }
                return true;
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.click.o$c */
    /* JADX INFO: compiled from: WebViewSpider.java */
    class c extends WebChromeClient {
        c() {
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
                try {
                    webView.loadUrl("javascript:window.navigator.vibrate([]);");
                    if (!C12698o.this.f33720m) {
                        C12698o c12698o = C12698o.this;
                        if (!c12698o.f33722o) {
                            c12698o.m34732g();
                        }
                    }
                    if (C12698o.this.f33712e != null) {
                        C12698o.this.f33712e.mo34702b(webView.getUrl());
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.click.o$d */
    /* JADX INFO: compiled from: WebViewSpider.java */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C12698o.this.f33719l = true;
            C12698o.this.f33718k = 1;
            C12698o.this.m34729e();
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.click.o$e */
    /* JADX INFO: compiled from: WebViewSpider.java */
    class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C12698o.this.f33719l = true;
            C12698o.this.f33718k = 2;
            C12698o.this.m34729e();
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.click.o$f */
    /* JADX INFO: compiled from: WebViewSpider.java */
    interface f {
        /* JADX INFO: renamed from: a */
        void mo34699a(int i, String str, String str2, String str3);

        /* JADX INFO: renamed from: a */
        void mo34700a(String str, boolean z, String str2);

        /* JADX INFO: renamed from: a */
        boolean mo34701a(String str);

        /* JADX INFO: renamed from: b */
        boolean mo34702b(String str);

        /* JADX INFO: renamed from: c */
        boolean mo34703c(String str);
    }

    public C12698o() {
        this.f33708a = 15000;
        this.f33709b = 3000;
        C13635g c13635gM39718d = C13636h.m39706b().m39718d(C13008c.m36588n().m36533b());
        this.f33711d = c13635gM39718d;
        if (c13635gM39718d == null) {
            this.f33711d = C13636h.m39706b().m39708a();
        }
        this.f33716i = this.f33711d.m39427M0();
        this.f33708a = (int) this.f33711d.m39562s0();
        this.f33709b = (int) this.f33711d.m39562s0();
    }

    /* JADX INFO: renamed from: a */
    private void m34716a(Context context, String str, String str2) {
        WebView webView = new WebView(context);
        this.f33715h = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f33715h.getSettings().setCacheMode(2);
        this.f33715h.getSettings().setLoadsImagesAutomatically(false);
        this.f33715h.setWebViewClient(new b(str2, str, context));
        this.f33715h.setWebChromeClient(new c());
    }

    /* JADX INFO: renamed from: a */
    private void m34718a(String str, String str2, Context context) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            m34719a(str, str2, context, this.f33713f);
        } else {
            this.f33710c.post(new a(str, str2, context));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m34719a(String str, String str2, Context context, String str3) {
        try {
            m34716a(context, str, str2);
            if (!TextUtils.isEmpty(this.f33714g)) {
                this.f33715h.getSettings().setDefaultTextEncodingName(C11341A5.f23802O);
                this.f33709b = 2000;
                this.f33708a = 2000;
                C13219q0.m37818c(f33707r, this.f33714g);
                this.f33715h.loadDataWithBaseURL(str3, this.f33714g, "*/*", C11341A5.f23802O, str3);
                return;
            }
            if (!this.f33716i) {
                this.f33715h.loadUrl(str3);
                return;
            }
            HashMap map = new HashMap();
            if (this.f33715h.getUrl() != null) {
                map.put(HttpHeaders.REFERER, this.f33715h.getUrl());
            }
            this.f33715h.loadUrl(str3, map);
        } catch (Throwable th) {
            try {
                f fVar = this.f33712e;
                if (fVar != null) {
                    fVar.mo34699a(0, this.f33713f, th.getMessage(), this.f33717j);
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public void m34721b() {
        m34725c();
        m34726d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public void m34725c() {
        this.f33710c.removeCallbacks(this.f33723p);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public void m34726d() {
        this.f33710c.removeCallbacks(this.f33724q);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public void m34729e() {
        synchronized (f33707r) {
            try {
                try {
                    m34721b();
                    this.f33715h.destroy();
                    f fVar = this.f33712e;
                    if (fVar != null) {
                        fVar.mo34700a(this.f33713f, this.f33719l, this.f33717j);
                    }
                } catch (Throwable th) {
                    C13219q0.m37816b(f33707r, th.getMessage());
                }
            } catch (Exception e2) {
                C13219q0.m37816b(f33707r, e2.getMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public void m34730f() {
        synchronized (f33707r) {
            try {
                m34721b();
                f fVar = this.f33712e;
                if (fVar != null) {
                    fVar.mo34700a(this.f33713f, this.f33719l, this.f33717j);
                }
            } catch (Exception e2) {
                C13219q0.m37816b(f33707r, e2.getMessage());
            } catch (Throwable th) {
                C13219q0.m37816b(f33707r, th.getMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public void m34732g() {
        m34725c();
        m34736i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public void m34734h() {
        m34726d();
        m34739j();
    }

    /* JADX INFO: renamed from: i */
    private void m34736i() {
        this.f33710c.postDelayed(this.f33723p, this.f33709b);
    }

    /* JADX INFO: renamed from: j */
    private void m34739j() {
        this.f33710c.postDelayed(this.f33724q, this.f33708a);
    }

    /* JADX INFO: renamed from: a */
    public void m34743a(String str, String str2, Context context, String str3, f fVar) {
        if (fVar == null) {
            throw new NullPointerException("OverrideUrlLoadingListener can not be null");
        }
        this.f33713f = str3;
        this.f33712e = fVar;
        m34718a(str, str2, context);
    }

    /* JADX INFO: renamed from: a */
    public void m34744a(String str, String str2, Context context, String str3, String str4, f fVar) {
        if (fVar == null) {
            throw new NullPointerException("OverrideUrlLoadingListener can not be null");
        }
        this.f33714g = str4;
        this.f33713f = str3;
        this.f33712e = fVar;
        m34718a(str, str2, context);
    }
}
