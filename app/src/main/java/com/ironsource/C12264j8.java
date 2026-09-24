package com.ironsource;

import android.content.Context;
import android.content.Intent;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.view.ViewGroup;
import android.webkit.JavascriptInterface;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.controller.InterfaceC12502k;
import com.ironsource.sdk.controller.OpenUrlActivity;
import com.ironsource.sdk.utils.Logger;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.j8 */
/* JADX INFO: loaded from: classes6.dex */
public class C12264j8 implements InterfaceC11434F8 {

    /* JADX INFO: renamed from: g */
    private static final String f30669g = "loadWithUrl | webView is not null";

    /* JADX INFO: renamed from: h */
    private static final String f30670h = "j8";

    /* JADX INFO: renamed from: i */
    private static final String f30671i = "file://";

    /* JADX INFO: renamed from: a */
    private final String f30672a;

    /* JADX INFO: renamed from: b */
    private String f30673b;

    /* JADX INFO: renamed from: c */
    private WebView f30674c;

    /* JADX INFO: renamed from: d */
    private C12228h8 f30675d;

    /* JADX INFO: renamed from: e */
    private C12130c8 f30676e;

    /* JADX INFO: renamed from: f */
    private Context f30677f;

    /* JADX INFO: renamed from: com.ironsource.j8$a */
    class a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f30678a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ JSONObject f30679b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ String f30680c;

        a(String str, JSONObject jSONObject, String str2) {
            this.f30678a = str;
            this.f30679b = jSONObject;
            this.f30680c = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C12264j8.this.f30674c != null) {
                C12547u8.m33895a(C11703Ud.f25978q, new C12422p8().m33061a(C11341A5.f23788A, C12264j8.f30669g).m33062a());
            }
            try {
                C12264j8.this.m31860b(this.f30678a);
                C12264j8.this.f30674c.loadUrl(C12264j8.this.m31859a(this.f30679b.getString("urlForWebView")));
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("adViewId", C12264j8.this.f30672a);
                C12264j8.this.f30675d.m31603a(this.f30680c, jSONObject);
            } catch (Exception e) {
                C12317m4.m32153d().m32155a(e);
                C12264j8.this.m31866b(this.f30678a, e.getMessage());
                C12547u8.m33895a(C11703Ud.f25978q, new C12422p8().m33061a(C11341A5.f23788A, e.getMessage()).m33062a());
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.j8$b */
    class b implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f30682a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f30683b;

        b(String str, String str2) {
            this.f30682a = str;
            this.f30683b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                WebView webView = C12264j8.this.f30674c;
                if (webView != null) {
                    webView.destroy();
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("adViewId", C12264j8.this.f30672a);
                C12228h8 c12228h8 = C12264j8.this.f30675d;
                if (c12228h8 != null) {
                    c12228h8.m31603a(this.f30682a, jSONObject);
                    C12264j8.this.f30675d.m31606b();
                }
                C12264j8 c12264j8 = C12264j8.this;
                c12264j8.f30675d = null;
                c12264j8.f30677f = null;
            } catch (Exception e) {
                C12317m4.m32153d().m32155a(e);
                Log.e(C12264j8.f30670h, "performCleanup | could not destroy ISNAdView webView ID: " + C12264j8.this.f30672a);
                C12547u8.m33895a(C11703Ud.f25979r, new C12422p8().m33061a(C11341A5.f23788A, e.getMessage()).m33062a());
                C12264j8.this.m31866b(this.f30683b, e.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.j8$c */
    class c implements InterfaceC11434F8.a {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f30685a;

        c(String str) {
            this.f30685a = str;
        }

        @Override // com.ironsource.InterfaceC11434F8.a
        /* JADX INFO: renamed from: a */
        public void mo25789a(String str) {
            Logger.m33642i(C12264j8.f30670h, "ISNAdViewWebPresenter | WebViewClient | reportOnError: " + str);
            C12264j8.this.m31866b(this.f30685a, str);
        }

        @Override // com.ironsource.InterfaceC11434F8.a
        /* JADX INFO: renamed from: b */
        public void mo25790b(String str) {
            Logger.m33642i(C12264j8.f30670h, "ISNAdViewWebPresenter | WebViewClient | onRenderProcessGone: " + str);
            try {
                ((ViewGroup) C12264j8.this.f30674c.getParent()).removeView(C12264j8.this.f30674c);
            } catch (Exception e) {
                C12317m4.m32153d().m32155a(e);
                IronLog.INTERNAL.error(e.toString());
            }
            C12264j8.this.m31863d();
        }
    }

    /* JADX INFO: renamed from: com.ironsource.j8$d */
    private class d extends WebChromeClient {
        private d() {
        }

        @Override // android.webkit.WebChromeClient
        public boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
            WebView webView2 = new WebView(webView.getContext());
            webView2.setWebChromeClient(C12264j8.this.new d());
            webView2.setWebViewClient(new e());
            ((WebView.WebViewTransport) message.obj).setWebView(webView2);
            message.sendToTarget();
            Logger.m33642i("onCreateWindow", "onCreateWindow");
            return true;
        }
    }

    /* JADX INFO: renamed from: com.ironsource.j8$e */
    private class e extends WebViewClient {
        private e() {
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            Logger.m33640e(C12264j8.f30670h, "Chromium process crashed - detail.didCrash(): " + renderProcessGoneDetail.didCrash());
            return true;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Context context = webView.getContext();
            Intent intentM33348a = new OpenUrlActivity.C12491e(new InterfaceC12502k.c()).m33350a(str).m33352b(false).m33348a(context);
            intentM33348a.addFlags(268435456);
            context.startActivity(intentM33348a);
            return true;
        }
    }

    public C12264j8(InterfaceC12192f8 interfaceC12192f8, Context context, String str, C12130c8 c12130c8) {
        this.f30677f = context;
        C12228h8 c12228h8 = new C12228h8();
        this.f30675d = c12228h8;
        c12228h8.m31612g(str);
        this.f30672a = str;
        this.f30675d.m31599a(interfaceC12192f8);
        this.f30676e = c12130c8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public synchronized void m31863d() {
        mo25784a("", "");
    }

    /* JADX INFO: renamed from: a */
    public String m31864a() {
        return this.f30672a;
    }

    /* JADX INFO: renamed from: b */
    public C12228h8 m31865b() {
        return this.f30675d;
    }

    /* JADX INFO: renamed from: c */
    public C12130c8 m31867c() {
        return this.f30676e;
    }

    /* JADX INFO: renamed from: e */
    public void m31868e(String str) {
        this.f30673b = str;
    }

    @Override // com.ironsource.InterfaceC11434F8
    public WebView getPresentingView() {
        return this.f30674c;
    }

    @JavascriptInterface
    public void handleMessageFromAd(String str) {
        this.f30675d.m31608c(str);
    }

    /* JADX INFO: renamed from: d */
    private String m31862d(String str) {
        String strSubstring = str.substring(str.indexOf(RemoteSettings.FORWARD_SLASH_STRING) + 1);
        return strSubstring.substring(strSubstring.indexOf(RemoteSettings.FORWARD_SLASH_STRING));
    }

    @Override // com.ironsource.InterfaceC11434F8
    /* JADX INFO: renamed from: a */
    public void mo25786a(JSONObject jSONObject, String str, String str2) {
        try {
            this.f30675d.m31610e(str);
        } catch (Exception e2) {
            C12317m4.m32153d().m32155a(e2);
            Logger.m33642i(f30670h, "sendHandleGetViewVisibility fail with reason: " + e2.getMessage());
        }
    }

    @Override // com.ironsource.InterfaceC11434F8
    /* JADX INFO: renamed from: b */
    public void mo25787b(JSONObject jSONObject, String str, String str2) {
        C11613P7.f25510a.m27224d(new a(str2, jSONObject, str));
    }

    @Override // com.ironsource.InterfaceC11434F8
    /* JADX INFO: renamed from: c */
    public void mo25788c(JSONObject jSONObject, String str, String str2) throws JSONException {
        try {
            this.f30675d.m31602a(jSONObject.getString("params"), str, str2);
        } catch (Exception e2) {
            C12317m4.m32153d().m32155a(e2);
            Logger.m33642i(f30670h, "sendMessageToAd fail message: " + e2.getMessage());
            throw e2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public void m31860b(String str) {
        Logger.m33642i(f30670h, "ISNAdViewWebPresenter | createWebView");
        WebView webView = new WebView(this.f30677f);
        this.f30674c = webView;
        webView.addJavascriptInterface(new C12210g8(this), C12148d8.f30221e);
        this.f30674c.setWebViewClient(new C12246i8(new c(str)));
        this.f30674c.setWebChromeClient(new d());
        C11604Og.m26778a(this.f30674c);
        this.f30675d.m31598a(this.f30674c);
    }

    @Override // com.ironsource.InterfaceC11434F8
    /* JADX INFO: renamed from: a */
    public synchronized void mo25784a(String str, String str2) {
        if (this.f30677f == null) {
            return;
        }
        Logger.m33642i(f30670h, "performCleanup");
        C11613P7.f25510a.m27224d(new b(str, str2));
    }

    /* JADX INFO: renamed from: c */
    private boolean m31861c(String str) {
        return str.startsWith(".");
    }

    @Override // com.ironsource.InterfaceC11434F8
    /* JADX INFO: renamed from: a */
    public void mo25785a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            m31866b(str3, C11744X3.c.f26194D);
            return;
        }
        Logger.m33642i(f30670h, "trying to perform WebView Action: " + str);
        try {
            if (str.equals("onPause")) {
                this.f30674c.onPause();
                this.f30675d.m31611f(str2);
            } else if (str.equals("onResume")) {
                this.f30674c.onResume();
                this.f30675d.m31611f(str2);
            } else {
                m31866b(str3, C11744X3.c.f26193C);
            }
        } catch (Exception e2) {
            C12317m4.m32153d().m32155a(e2);
            m31866b(str3, C11744X3.c.f26195E);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public String m31859a(String str) {
        if (!m31861c(str)) {
            return str;
        }
        return "file://" + this.f30673b + m31862d(str);
    }

    /* JADX INFO: renamed from: b */
    public void m31866b(String str, String str2) {
        C12228h8 c12228h8 = this.f30675d;
        if (c12228h8 != null) {
            c12228h8.m31601a(str, str2);
        }
    }
}
