package com.mbridge.msdk.config.component.wei;

import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.SslErrorHandler;
import android.webkit.ValueCallback;
import android.webkit.WebMessage;
import android.webkit.WebMessagePort;
import android.webkit.WebView;
import com.bykv.p028vk.openvk.preload.falconx.statistic.StatisticData;
import com.ironsource.C11744X3;
import com.mbridge.msdk.config.component.base.C12709a;
import com.mbridge.msdk.config.component.base.InterfaceC12712d;
import com.mbridge.msdk.config.component.common.util.C12770c;
import com.mbridge.msdk.config.component.wei.model.C12857a;
import com.mbridge.msdk.config.component.wei.monitor.C12858a;
import com.mbridge.msdk.config.component.wei.monitor.C12859b;
import com.mbridge.msdk.config.dynamic.baseview.webview.ComponentWebView;
import com.mbridge.msdk.config.dynamic.baseview.webview.listener.InterfaceC12891a;
import com.mbridge.msdk.config.dynamic.baseview.webview.util.C12892a;
import com.mbridge.msdk.config.dynamic.utils.C12902d;
import com.mbridge.msdk.config.dynamic.utils.C12903e;
import com.mbridge.msdk.foundation.same.threadpool.C13167a;
import com.mbridge.msdk.foundation.tools.C13219q0;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class WeiCpt extends C12709a implements InterfaceC12712d {

    /* JADX INFO: renamed from: m */
    ComponentWebView f34472m;

    /* JADX INFO: renamed from: n */
    boolean f34473n;

    /* JADX INFO: renamed from: o */
    boolean f34474o;

    /* JADX INFO: renamed from: p */
    C12859b f34475p;

    /* JADX INFO: renamed from: q */
    C12858a f34476q;

    /* JADX INFO: renamed from: r */
    WebMessagePort f34477r;

    /* JADX INFO: renamed from: h */
    final String f34467h = "1100001";

    /* JADX INFO: renamed from: i */
    final String f34468i = "1100002";

    /* JADX INFO: renamed from: j */
    final String f34469j = "1100003";

    /* JADX INFO: renamed from: k */
    final String f34470k = "1100004";

    /* JADX INFO: renamed from: l */
    final String f34471l = "SenderPortKey_";

    /* JADX INFO: renamed from: s */
    HashMap<String, WebMessagePort> f34478s = new HashMap<>();

    /* JADX INFO: renamed from: t */
    ConcurrentLinkedQueue<C12857a> f34479t = new ConcurrentLinkedQueue<>();

    /* JADX INFO: renamed from: com.mbridge.msdk.config.component.wei.WeiCpt$a */
    class C12854a implements InterfaceC12891a {
        C12854a() {
        }

        @Override // com.mbridge.msdk.config.dynamic.baseview.webview.listener.InterfaceC12891a
        public void onPageFinished(WebView webView, String str) {
            WeiCpt.this.m35841a(webView);
            WeiCpt weiCpt = WeiCpt.this;
            if (weiCpt.f34473n || weiCpt.f34474o) {
                return;
            }
            weiCpt.f34474o = true;
            weiCpt.m34829a(weiCpt.m34827a("905003", new HashMap()));
        }

        @Override // com.mbridge.msdk.config.dynamic.baseview.webview.listener.InterfaceC12891a
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            WeiCpt.this.f34476q.m35868b(webView);
            WeiCpt.this.f34476q.m35867a(webView);
            WeiCpt weiCpt = WeiCpt.this;
            weiCpt.m34829a(weiCpt.m34827a("905002", new HashMap()));
        }

        @Override // com.mbridge.msdk.config.dynamic.baseview.webview.listener.InterfaceC12891a
        public void onProgressChanged(WebView webView, int i) {
        }

        @Override // com.mbridge.msdk.config.dynamic.baseview.webview.listener.InterfaceC12891a
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            WeiCpt weiCpt = WeiCpt.this;
            if (weiCpt.f34474o || weiCpt.f34473n) {
                return;
            }
            weiCpt.f34473n = true;
            weiCpt.m34831a("905004", String.valueOf(i), str);
        }

        @Override // com.mbridge.msdk.config.dynamic.baseview.webview.listener.InterfaceC12891a
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        }

        @Override // com.mbridge.msdk.config.dynamic.baseview.webview.listener.InterfaceC12891a
        public void onRenderProcessGone(WebView webView) {
            WeiCpt.this.m34831a("905005", "1100003", "WebView did crash");
        }

        @Override // com.mbridge.msdk.config.dynamic.baseview.webview.listener.InterfaceC12891a
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            HashMap map = new HashMap();
            map.put(C12770c.m35209b(StatisticData.ERROR_CODE_NOT_FOUND), "redirect");
            HashMap map2 = new HashMap();
            map2.put(C12770c.m35209b("url"), str);
            map.put(C12770c.m35209b("data"), map2);
            HashMap map3 = new HashMap();
            map3.put(C12770c.m35209b("js_interaction"), map);
            WeiCpt weiCpt = WeiCpt.this;
            weiCpt.m34829a(weiCpt.m34827a("905006", map3));
            return false;
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.config.component.wei.WeiCpt$b */
    class C12855b extends WebMessagePort.WebMessageCallback {
        C12855b() {
        }

        @Override // android.webkit.WebMessagePort.WebMessageCallback
        public void onMessage(WebMessagePort webMessagePort, WebMessage webMessage) {
            WeiCpt.this.m35847a(webMessage);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.config.component.wei.WeiCpt$c */
    class RunnableC12856c implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ WebMessagePort f34482a;

        RunnableC12856c(WebMessagePort webMessagePort) {
            this.f34482a = webMessagePort;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f34482a.close();
        }
    }

    /* JADX INFO: renamed from: c */
    private void m35845c(C12857a c12857a) {
        this.f34476q = new C12858a();
        this.f34475p = new C12859b(c12857a.m35850a());
        this.f34472m.setWebViewEventListener(new C12854a());
        if (c12857a.m35865i()) {
            this.f34475p.m35870a(this.f34472m);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m35846c(String str) {
    }

    @Override // com.mbridge.msdk.config.component.base.C12709a
    /* JADX INFO: renamed from: b */
    protected synchronized void mo34834b(Map<String, Object> map) {
        this.f33808f = "905001";
        C12857a c12857a = new C12857a(map);
        this.f34479t.add(c12857a);
        ViewGroup viewGroupM34837e = m34837e();
        if (viewGroupM34837e == null) {
            return;
        }
        if (TextUtils.isEmpty(c12857a.m35864h())) {
            this.f34472m = (ComponentWebView) C12902d.m36155a(viewGroupM34837e, ComponentWebView.class);
        } else {
            View viewFindViewWithTag = viewGroupM34837e.findViewWithTag(c12857a.m35864h());
            if (viewFindViewWithTag instanceof WebView) {
                this.f34472m = (ComponentWebView) viewFindViewWithTag;
            }
        }
    }

    @Override // com.mbridge.msdk.config.component.base.C12709a
    /* JADX INFO: renamed from: d */
    public void mo34836d() {
        super.mo34836d();
        if (this.f34472m != null) {
            while (!this.f34479t.isEmpty()) {
                final C12857a c12857aPoll = this.f34479t.poll();
                if (c12857aPoll != null) {
                    C13167a.m37544c().post(new Runnable() { // from class: com.mbridge.msdk.config.component.wei.WeiCpt$$ExternalSyntheticLambda1
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f$0.m35843a(c12857aPoll);
                        }
                    });
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void m35843a(C12857a c12857a) {
        if (!TextUtils.isEmpty(c12857a.m35854b())) {
            if (C12770c.m35209b("320").equals(c12857a.m35854b())) {
                m35845c(c12857a);
                m35844b(c12857a);
            } else if (C12770c.m35209b("322").equals(c12857a.m35854b())) {
                this.f34472m.reload();
            } else if (C12770c.m35209b("319").equals(c12857a.m35854b())) {
                if (this.f34472m.getVisibility() != 0) {
                    this.f34472m.setVisibility(0);
                }
            } else if (C12770c.m35209b("325").equals(c12857a.m35854b())) {
                this.f34472m.setVisibility(8);
            } else if (C12770c.m35209b("321").equals(c12857a.m35854b())) {
                String strM36038a = C12892a.m36038a(c12857a.m35856c());
                if (!TextUtils.isEmpty(strM36038a)) {
                    m35849d(strM36038a);
                }
            } else if (C12770c.m35209b("307").equals(c12857a.m35854b())) {
                if (this.f34472m.getParent() != null && (this.f34472m.getParent() instanceof ViewGroup)) {
                    ((ViewGroup) this.f34472m.getParent()).removeView(this.f34472m);
                }
            } else if (C12770c.m35209b("323").equals(c12857a.m35854b())) {
                if (this.f34472m.canGoForward()) {
                    this.f34472m.goForward();
                }
            } else if (C12770c.m35209b("324").equals(c12857a.m35854b()) && this.f34472m.canGoBack()) {
                this.f34472m.goBack();
            }
        }
        if (c12857a.m35860e() == null || c12857a.m35860e().isEmpty()) {
            return;
        }
        m35848a(this.f34472m, c12857a.m35860e());
    }

    /* JADX INFO: renamed from: d */
    public void m35849d(String str) {
        try {
            ComponentWebView componentWebView = this.f34472m;
            if (componentWebView != null && !componentWebView.isDestroyed()) {
                this.f34472m.evaluateJavascript(str, new ValueCallback() { // from class: com.mbridge.msdk.config.component.wei.WeiCpt$$ExternalSyntheticLambda0
                    @Override // android.webkit.ValueCallback
                    public final void onReceiveValue(Object obj) {
                        WeiCpt.m35846c((String) obj);
                    }
                });
            }
        } catch (Throwable th) {
            C13219q0.m37816b("WeiCpt", th.getMessage());
        }
    }

    /* JADX INFO: renamed from: b */
    private void m35844b(C12857a c12857a) {
        if (TextUtils.isEmpty(c12857a.m35863g()) && TextUtils.isEmpty(c12857a.m35858d())) {
            if (this.f34472m.hasXmlUrl()) {
                this.f34472m.loadXMLUrl();
                return;
            } else {
                m34831a("905004", "1100001", "Input parameter error");
                return;
            }
        }
        if (!TextUtils.isEmpty(c12857a.m35863g())) {
            String strM35862f = c12857a.m35862f();
            if (TextUtils.isEmpty(strM35862f)) {
                this.f34472m.loadUrl(c12857a.m35863g());
                return;
            } else {
                this.f34472m.loadUrl(strM35862f);
                return;
            }
        }
        if (TextUtils.isEmpty(c12857a.m35858d())) {
            return;
        }
        this.f34472m.loadDataWithBaseURL("", c12857a.m35858d(), "text/html", "UTF-8", null);
    }

    @Override // com.mbridge.msdk.config.component.base.InterfaceC12712d
    /* JADX INFO: renamed from: a */
    public boolean mo34848a(Map<?, ?> map) {
        String strValueOf;
        if (map != null && !map.isEmpty()) {
            try {
                Object obj = this.f33803a.get(C12770c.m35209b("16"));
                String str = "";
                if (obj instanceof Map) {
                    Object obj2 = ((Map) obj).get(C12770c.m35209b("116"));
                    Object obj3 = ((Map) obj).get(C12770c.m35209b("125"));
                    String strValueOf2 = obj2 instanceof String ? String.valueOf(obj2) : "";
                    strValueOf = obj3 instanceof String ? String.valueOf(obj3) : "";
                    str = strValueOf2;
                } else {
                    strValueOf = "";
                }
                Object obj4 = map.get(C12770c.m35209b("16"));
                if (obj4 instanceof Map) {
                    Object obj5 = ((Map) obj4).get(C12770c.m35209b("116"));
                    Object obj6 = ((Map) obj4).get(C12770c.m35209b("125"));
                    if (obj5 instanceof String) {
                        String str2 = (String) obj5;
                        if (!TextUtils.isEmpty(str2)) {
                            return str2.equals(str);
                        }
                    }
                    if (obj6 instanceof String) {
                        String str3 = (String) obj6;
                        return !TextUtils.isEmpty(str3) && str3.hashCode() == strValueOf.hashCode();
                    }
                }
            } catch (Throwable th) {
                C13219q0.m37817b("WeiCpt", th.getMessage(), th);
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m35841a(WebView webView) {
        WebMessagePort[] webMessagePortArrCreateWebMessageChannel = webView.createWebMessageChannel();
        this.f34477r = webMessagePortArrCreateWebMessageChannel[0];
        webView.postWebMessage(new WebMessage("port_ready", new WebMessagePort[]{webMessagePortArrCreateWebMessageChannel[1]}), Uri.EMPTY);
        this.f34477r.setWebMessageCallback(new C12855b());
    }

    /* JADX INFO: renamed from: a */
    public void m35847a(WebMessage webMessage) {
        if (webMessage == null) {
            return;
        }
        String data = webMessage.getData();
        if (TextUtils.isEmpty(data)) {
            return;
        }
        try {
            Map<String, Object> mapM36162a = new C12903e().m36162a(data);
            String strValueOf = String.valueOf(mapM36162a.get(C12770c.m35209b("action")));
            String str = "SenderPortKey_" + System.currentTimeMillis() + "_" + strValueOf;
            WebMessagePort[] ports = webMessage.getPorts();
            if (ports != null && ports.length > 0) {
                this.f34478s.put(str, ports[0]);
            }
            Map<String, Object> map = new HashMap<>();
            map.put(C11744X3.i.f26336K, this.f34472m);
            map.put("superview", this.f34472m.getParent());
            HashMap map2 = new HashMap();
            map2.put(C12770c.m35209b("action"), strValueOf);
            map2.put(C12770c.m35209b("reply_name"), str);
            Object obj = mapM36162a.get(C12770c.m35209b("data"));
            String strM35209b = C12770c.m35209b("data");
            if (obj == null) {
                obj = "";
            }
            map2.put(strM35209b, obj);
            map2.put(C12770c.m35209b("type"), "mv");
            map.put(C12770c.m35209b("js_interaction"), map2);
            map.put(C12770c.m35209b("click_x"), String.valueOf(this.f34472m.getxInScreen()));
            map.put(C12770c.m35209b("click_y"), String.valueOf(this.f34472m.getyInScreen()));
            map.put(C12770c.m35209b("click_time"), String.valueOf(this.f34472m.getClickTimeStamp()));
            m34829a(m34827a("905006", map));
        } catch (Throwable th) {
            C13219q0.m37817b("WeiCpt", th.getMessage(), th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x009e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:0x0099 A[SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public void m35848a(WebView webView, List<Map<String, Object>> list) {
        WebMessage webMessage;
        WebMessagePort webMessagePort;
        WebMessagePort webMessagePort2;
        for (Map<String, Object> map : list) {
            try {
                String strValueOf = String.valueOf(map.get(C12770c.m35209b(StatisticData.ERROR_CODE_NOT_FOUND)));
                Map<String, Object> mapM35203a = C12770c.m35203a(map);
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                if (mapM35203a.containsKey(C12770c.m35209b("128"))) {
                    try {
                        jSONObject2 = new JSONObject((Map) mapM35203a.get(C12770c.m35209b("128")));
                    } catch (Exception e) {
                        C13219q0.m37817b("WeiCpt", e.getMessage(), e);
                    }
                    jSONObject.put(C12770c.m35209b("action"), strValueOf);
                    jSONObject.put(C12770c.m35209b("data"), jSONObject2);
                    webMessage = new WebMessage(jSONObject.toString());
                    if (!this.f34478s.containsKey(strValueOf) && (webMessagePort2 = this.f34478s.get(strValueOf)) != null) {
                        webMessagePort2.postMessage(webMessage);
                        this.f34478s.remove(strValueOf);
                        this.f34472m.postDelayed(new RunnableC12856c(webMessagePort2), 3000L);
                        return;
                    } else {
                        webMessagePort = this.f34477r;
                        if (webMessagePort != null) {
                            webMessagePort.postMessage(webMessage);
                        } else {
                            webView.postWebMessage(webMessage, Uri.EMPTY);
                        }
                    }
                } else {
                    jSONObject.put(C12770c.m35209b("action"), strValueOf);
                    jSONObject.put(C12770c.m35209b("data"), jSONObject2);
                    webMessage = new WebMessage(jSONObject.toString());
                    if (!this.f34478s.containsKey(strValueOf)) {
                    }
                    webMessagePort = this.f34477r;
                    if (webMessagePort != null) {
                        webMessagePort.postMessage(webMessage);
                    } else {
                        webView.postWebMessage(webMessage, Uri.EMPTY);
                    }
                }
            } catch (Throwable th) {
                C13219q0.m37817b("WeiCpt", th.getMessage(), th);
            }
        }
    }
}
