package com.bytedance.sdk.openadsdk.core.widget.p228ri;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.text.TextUtils;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.sdk.component.adexpress.p122fi.C2483fi;
import com.bytedance.sdk.component.jbs.C2634di;
import com.bytedance.sdk.component.utils.C2707ac;
import com.bytedance.sdk.component.utils.C2722lr;
import com.bytedance.sdk.component.utils.C2724nr;
import com.bytedance.sdk.openadsdk.activity.single.TTCeilingLandingPageActivity;
import com.bytedance.sdk.openadsdk.common.C2934fi;
import com.bytedance.sdk.openadsdk.core.bgr.p197ka.InterfaceC3118lr;
import com.bytedance.sdk.openadsdk.core.dzy;
import com.bytedance.sdk.openadsdk.core.model.C3273ac;
import com.bytedance.sdk.openadsdk.core.model.C3277co;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.ihz.p232ri.p234ri.C3372lr;
import com.bytedance.sdk.openadsdk.ihz.p232ri.p234ri.C3373ri;
import com.bytedance.sdk.openadsdk.p236ka.C3393aw;
import com.bytedance.sdk.openadsdk.p236ka.C3414ik;
import com.bytedance.sdk.openadsdk.p236ka.C3423lr;
import com.bytedance.sdk.openadsdk.slm.p260lr.C3527ri;
import com.bytedance.sdk.openadsdk.utils.C3571ig;
import com.bytedance.sdk.openadsdk.utils.tan;
import com.bytedance.sdk.openadsdk.wjv.C3606fi;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Stack;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.widget.ri.fi */
/* JADX INFO: loaded from: classes3.dex */
public class C3348fi extends C2634di.ri {
    private static final HashSet<String> ihz;

    /* JADX INFO: renamed from: ac */
    private wjv f11800ac;

    /* JADX INFO: renamed from: aw */
    private C2934fi f11801aw;
    private String bgr;

    /* JADX INFO: renamed from: bu */
    private TTCeilingLandingPageActivity.InterfaceC2775ri f11802bu;

    /* JADX INFO: renamed from: co */
    private boolean f11803co;

    /* JADX INFO: renamed from: di */
    protected C3393aw f11804di;

    /* JADX INFO: renamed from: fi */
    protected final String f11805fi;

    /* JADX INFO: renamed from: ik */
    protected final dzy f11806ik;
    protected boolean jbs;

    /* JADX INFO: renamed from: ka */
    protected final Context f11807ka;

    /* JADX INFO: renamed from: lr */
    private String f11808lr;

    /* JADX INFO: renamed from: mj */
    protected boolean f11809mj;

    /* JADX INFO: renamed from: nr */
    private InterfaceC3118lr f11810nr;

    /* JADX INFO: renamed from: qt */
    private C3277co f11811qt;

    /* JADX INFO: renamed from: ri */
    private final boolean f11812ri;

    /* JADX INFO: renamed from: sf */
    private Map<String, Object> f11813sf;
    private boolean slm;
    private JSONObject tan;

    /* JADX INFO: renamed from: vr */
    private final Stack<String> f11814vr;
    protected boolean xha;

    static {
        HashSet<String> hashSet = new HashSet<>();
        ihz = hashSet;
        hashSet.add("png");
        hashSet.add("ico");
        hashSet.add("jpg");
        hashSet.add("gif");
        hashSet.add("svg");
        hashSet.add("jpeg");
    }

    public C3348fi(Context context, dzy dzyVar, String str, C2934fi c2934fi, C3393aw c3393aw, boolean z) {
        this(context, dzyVar, str, c3393aw, z);
        this.f11801aw = c2934fi;
    }

    public C3348fi(Context context, dzy dzyVar, String str, C2934fi c2934fi, C3393aw c3393aw, boolean z, boolean z2, TTCeilingLandingPageActivity.InterfaceC2775ri interfaceC2775ri) {
        this(context, dzyVar, str, c2934fi, c3393aw, z);
        this.slm = z2;
        this.f11802bu = interfaceC2775ri;
    }

    public C3348fi(Context context, dzy dzyVar, String str, C3393aw c3393aw, boolean z) {
        this.xha = true;
        this.f11809mj = true;
        this.jbs = false;
        this.f11807ka = context;
        this.f11806ik = dzyVar;
        this.f11805fi = str;
        this.f11804di = c3393aw;
        this.f11812ri = z;
        this.f11814vr = new Stack<>();
    }

    /* JADX INFO: renamed from: fi */
    private boolean m15060fi(String str) {
        if (C3273ac.m13978qt(this.f11800ac)) {
            return TextUtils.equals(this.f11800ac.m14553wd(), str);
        }
        return false;
    }

    /* JADX INFO: renamed from: ka */
    public static String m15061ka(String str) {
        int iLastIndexOf;
        String strSubstring;
        if (str == null || (iLastIndexOf = str.lastIndexOf(46)) < 0 || iLastIndexOf == str.length() - 1 || (strSubstring = str.substring(iLastIndexOf)) == null || !ihz.contains(strSubstring.toLowerCase(Locale.getDefault()))) {
            return null;
        }
        return "image/".concat(String.valueOf(strSubstring));
    }

    /* JADX INFO: renamed from: ri */
    private void m15063ri(String str, String str2) {
        if ((m15060fi(str) || "market".equals(str)) && ((this.f11811qt != null || this.tan != null) && m15069lr(str2))) {
            m15066ik();
        }
        this.f11811qt = null;
        this.tan = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ri */
    public void m15064ri(final String str, final boolean z, final int i, final String str2, final String str3) {
        C3414ik.m15532ri(System.currentTimeMillis(), this.f11800ac, this.f11808lr, "lp_not_http_open", new C3527ri() { // from class: com.bytedance.sdk.openadsdk.core.widget.ri.fi.2
            @Override // com.bytedance.sdk.openadsdk.slm.p260lr.C3527ri, com.bytedance.sdk.openadsdk.slm.p260lr.InterfaceC3526lr
            /* JADX INFO: renamed from: ri */
            public JSONObject mo10798ri() {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("schema", str);
                    jSONObject.put("jump_url", str3);
                    jSONObject.put("success", z);
                    jSONObject.put("error_type", i);
                    jSONObject.put("error_reason", str2);
                    return jSONObject;
                } catch (Throwable unused) {
                    return null;
                }
            }
        });
    }

    /* JADX INFO: renamed from: ri */
    private boolean m15065ri(WebView webView, String str) {
        if (!C3571ig.m16453ka(this.f11800ac) || this.f11800ac.m14401fr() == null || webView == null) {
            return false;
        }
        int iM14207lr = this.f11800ac.m14401fr().m14207lr();
        int size = this.f11814vr.size();
        if (this.slm) {
            size++;
        }
        Integer.valueOf(iM14207lr);
        Integer.valueOf(size);
        if (size + 1 != iM14207lr) {
            return false;
        }
        com.bytedance.sdk.openadsdk.utils.wjv.m16675ri(this.f11807ka, str, this.f11800ac, C3423lr.ri.f12378ka, true);
        TTCeilingLandingPageActivity.InterfaceC2775ri interfaceC2775ri = this.f11802bu;
        if (interfaceC2775ri != null) {
            interfaceC2775ri.mo10593ri();
        }
        return true;
    }

    /* JADX INFO: renamed from: ik */
    public void m15066ik() {
        if (TextUtils.isEmpty(this.f11808lr) || !C3273ac.jbs(this.f11800ac) || this.f11803co) {
            return;
        }
        C3277co c3277co = this.f11811qt;
        if (c3277co != null) {
            C3414ik.m15563ri("click", this.f11800ac, c3277co, this.f11808lr, true, this.f11813sf, 1);
            this.f11803co = true;
            return;
        }
        JSONObject jSONObject = this.tan;
        if (jSONObject != null) {
            C3414ik.m15554ri(this.f11800ac, this.f11808lr, "click", jSONObject);
            this.f11803co = true;
        }
    }

    /* JADX INFO: renamed from: ik */
    public boolean m15067ik(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Uri uri = Uri.parse(str);
            if ("play.google.com".equals(uri.getHost())) {
                if (C3273ac.m13978qt(this.f11800ac) && this.tan == null && this.f11811qt == null) {
                    return true;
                }
                Intent intent = new Intent("android.intent.action.VIEW");
                if (!(this.f11807ka instanceof Activity)) {
                    intent.addFlags(268435456);
                }
                intent.setData(uri);
                intent.setPackage("com.android.vending");
                this.f11807ka.startActivity(intent);
                m15066ik();
                this.tan = null;
                this.f11811qt = null;
                return true;
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    /* JADX INFO: renamed from: lr */
    public C3393aw m15068lr() {
        return this.f11804di;
    }

    /* JADX INFO: renamed from: lr */
    public boolean m15069lr(String str) {
        String strM14069ik;
        String strM14077ri;
        if (this.f11807ka == null) {
            return false;
        }
        wjv wjvVar = this.f11800ac;
        if (wjvVar == null || wjvVar.tyz() == null) {
            strM14069ik = "";
            strM14077ri = "";
        } else {
            strM14069ik = this.f11800ac.tyz().m14069ik();
            strM14077ri = this.f11800ac.tyz().m14077ri();
        }
        Context context = this.f11807ka;
        wjv wjvVar2 = this.f11800ac;
        return C3373ri.m15260ri(context, str, wjvVar2, C3571ig.m16454lr(wjvVar2), null, true) || C3372lr.m15252ri(this.f11800ac, strM14069ik, this.f11807ka, this.f11808lr, (Map<String, Object>) null) || C3372lr.m15249ri(this.f11807ka, strM14077ri, strM14069ik, this.f11808lr, this.f11800ac);
    }

    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView webView, String str) {
        super.onLoadResource(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        C3393aw c3393aw = this.f11804di;
        if (c3393aw != null) {
            c3393aw.m15383ri(webView, str, this.f11812ri);
        }
        C2934fi c2934fi = this.f11801aw;
        if (c2934fi != null) {
            c2934fi.m11312lr(webView, str, this.f11812ri);
        }
        super.onPageFinished(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        WebView webView2;
        String str2;
        wjv wjvVar;
        super.onPageStarted(webView, str, bitmap);
        wjv wjvVar2 = this.f11800ac;
        int iM16469ri = (wjvVar2 != null && wjvVar2.evm() && C3606fi.m16710ri("opt_web_index", false)) ? C3571ig.m16469ri(webView) : -1;
        Integer.valueOf(iM16469ri);
        C3393aw c3393aw = this.f11804di;
        if (c3393aw != null) {
            webView2 = webView;
            str2 = str;
            c3393aw.m15382ri(webView2, str2, bitmap, this.f11812ri, iM16469ri);
        } else {
            webView2 = webView;
            str2 = str;
        }
        C2934fi c2934fi = this.f11801aw;
        if (c2934fi != null) {
            c2934fi.m11311ik(webView2, str2, this.f11812ri);
        }
        if (this.f11812ri && (wjvVar = this.f11800ac) != null && wjvVar.evm() && this.f11800ac.m14401fr().m14207lr() >= 2) {
            if (!TextUtils.isEmpty(str2) && !str2.equals(this.bgr)) {
                if (this.f11814vr.contains(str2)) {
                    while (!str2.equals(this.f11814vr.peek())) {
                        this.f11814vr.pop();
                    }
                } else {
                    this.f11814vr.push(str2);
                }
            }
            this.bgr = str2;
        }
        Boolean.valueOf(this.f11809mj);
        Boolean.valueOf(this.jbs);
        if (!this.f11809mj || this.jbs) {
            return;
        }
        this.jbs = true;
        C3349ik.m15077ri(this.f11807ka).m15081ri(true).m15080lr(webView2.getSettings().getBuiltInZoomControls()).m15082ri(webView2);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i, String str, String str2) {
        super.onReceivedError(webView, i, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        if (this.f11804di == null || webResourceError == null) {
            return;
        }
        Uri url = webResourceRequest.getUrl();
        String string = url != null ? url.toString() : "";
        Map<String, String> requestHeaders = webResourceRequest.getRequestHeaders();
        this.f11804di.m15381ri(webView, webResourceError.getErrorCode(), String.valueOf(webResourceError.getDescription()), string, requestHeaders.containsKey("accept") ? requestHeaders.get("accept") : "", webResourceRequest != null && webResourceRequest.isForMainFrame());
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        if (this.f11804di == null || webResourceResponse == null) {
            return;
        }
        Uri url = webResourceRequest.getUrl();
        String string = url != null ? url.toString() : "";
        Map<String, String> requestHeaders = webResourceRequest.getRequestHeaders();
        this.f11804di.m15381ri(webView, webResourceResponse.getStatusCode(), String.valueOf(webResourceResponse.getReasonPhrase()), string, requestHeaders.containsKey("accept") ? requestHeaders.get("accept") : "", webResourceRequest != null && webResourceRequest.isForMainFrame());
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        if (sslErrorHandler != null) {
            try {
                sslErrorHandler.cancel();
            } catch (Throwable unused) {
            }
        }
        if (this.f11804di != null) {
            int primaryError = 0;
            String strConcat = "SslError: unknown";
            String url = null;
            if (sslError != null) {
                try {
                    primaryError = sslError.getPrimaryError();
                    strConcat = "SslError: ".concat(String.valueOf(sslError));
                    url = sslError.getUrl();
                } catch (Throwable unused2) {
                }
            }
            String str = url;
            this.f11804di.m15381ri(webView, primaryError, strConcat, str, m15061ka(str), true);
        }
    }

    @Override // com.bytedance.sdk.component.jbs.C2634di.ri, android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        try {
            C2483fi.m8762ri().m8769lr();
        } catch (Exception unused) {
        }
        return super.onRenderProcessGone(webView, renderProcessGoneDetail);
    }

    /* JADX INFO: renamed from: ri */
    public void m15070ri(InterfaceC3118lr interfaceC3118lr) {
        this.f11810nr = interfaceC3118lr;
    }

    /* JADX INFO: renamed from: ri */
    public void m15071ri(C3277co c3277co) {
        this.f11811qt = c3277co;
    }

    /* JADX INFO: renamed from: ri */
    public void m15072ri(wjv wjvVar) {
        this.f11800ac = wjvVar;
    }

    /* JADX INFO: renamed from: ri */
    public void m15073ri(String str) {
        this.f11808lr = str;
    }

    /* JADX INFO: renamed from: ri */
    public void m15074ri(Map<String, Object> map) {
        this.f11813sf = map;
    }

    /* JADX INFO: renamed from: ri */
    public void m15075ri(JSONObject jSONObject) {
        this.tan = jSONObject;
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        C3393aw c3393aw = this.f11804di;
        if (c3393aw != null) {
            c3393aw.m15373lr(webView, str, this.f11812ri);
        }
        C2934fi c2934fi = this.f11801aw;
        if (c2934fi != null) {
            c2934fi.m11316ri(webView, str);
        }
        return super.shouldInterceptRequest(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, final String str) {
        C3348fi c3348fi;
        String str2;
        Intent uri;
        C3393aw c3393aw = this.f11804di;
        if (c3393aw != null) {
            c3393aw.m15390ri(str, this.f11812ri);
        }
        C2934fi c2934fi = this.f11801aw;
        if (c2934fi != null) {
            c2934fi.m11317ri(webView, str, this.f11812ri);
        }
        if (m15065ri(webView, str)) {
            return true;
        }
        wjv wjvVar = this.f11800ac;
        if (wjvVar != null && wjvVar.m14458nr() == 1 && ((C3372lr.m15253ri(str, this.f11800ac) || C3372lr.m15251ri(this.f11800ac, str)) && C3372lr.m15243lr(this.f11800ac, this.f11807ka, true))) {
            return true;
        }
        try {
            Uri uri2 = Uri.parse(str);
            final String lowerCase = uri2.getScheme().toLowerCase();
            if ("bytedance".equals(lowerCase)) {
                tan.m16660ri(uri2, this.f11806ik);
                return true;
            }
            if (m15067ik(str)) {
                return true;
            }
            if (C2724nr.m10260ri(str)) {
                str2 = str;
                return super.shouldOverrideUrlLoading(webView, str2);
            }
            if (C3273ac.m13978qt(this.f11800ac)) {
                m15063ri(lowerCase, str);
                return true;
            }
            try {
                if (str.startsWith("intent:")) {
                    uri = Intent.parseUri(str, 1);
                } else if (str.startsWith("android-app:")) {
                    uri = Intent.parseUri(str, 2);
                } else {
                    Intent intent = new Intent("android.intent.action.VIEW");
                    intent.setData(uri2);
                    uri = intent;
                }
                uri.addFlags(268435456);
                C2722lr.m10241ri(this.f11807ka, uri, new C2722lr.lr() { // from class: com.bytedance.sdk.openadsdk.core.widget.ri.fi.1
                    @Override // com.bytedance.sdk.component.utils.C2722lr.lr
                    /* JADX INFO: renamed from: ri */
                    public void mo10245ri() {
                        C3348fi.this.m15064ri(lowerCase, true, 0, "", str);
                    }

                    @Override // com.bytedance.sdk.component.utils.C2722lr.lr
                    /* JADX INFO: renamed from: ri */
                    public void mo10246ri(Throwable th) {
                        C3348fi.this.m15064ri(lowerCase, false, 2, th.getMessage(), str);
                    }
                });
                c3348fi = this;
                str2 = str;
            } catch (Throwable th) {
                C2707ac.m10206ri("WebChromeClient", "parseUri", th);
                c3348fi = this;
                str2 = str;
                try {
                    c3348fi.m15064ri(lowerCase, false, 1, th.getMessage(), str2);
                } catch (Throwable unused) {
                }
            }
            InterfaceC3118lr interfaceC3118lr = c3348fi.f11810nr;
            if (interfaceC3118lr != null) {
                interfaceC3118lr.mo10585zb();
            }
            return true;
        } catch (Throwable unused2) {
            c3348fi = this;
            str2 = str;
        }
        dzy dzyVar = c3348fi.f11806ik;
        if (dzyVar != null && dzyVar.m13410fi()) {
            return true;
        }
        return super.shouldOverrideUrlLoading(webView, str2);
    }
}
