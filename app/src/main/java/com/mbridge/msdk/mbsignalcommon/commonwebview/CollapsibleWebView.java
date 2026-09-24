package com.mbridge.msdk.mbsignalcommon.commonwebview;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.RelativeLayout;
import androidx.webkit.ProxyConfig;
import com.mbridge.msdk.foundation.tools.C13219q0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes6.dex */
public class CollapsibleWebView extends CommonWebView {

    /* JADX INFO: renamed from: v */
    private CopyOnWriteArrayList<CommonWebView.InterfaceC13365h> f37058v;

    /* JADX INFO: renamed from: w */
    private CopyOnWriteArrayList<CommonWebView.InterfaceC13365h> f37059w;

    /* JADX INFO: renamed from: x */
    private CopyOnWriteArrayList<InterfaceC13357e> f37060x;

    /* JADX INFO: renamed from: y */
    private String f37061y;

    /* JADX INFO: renamed from: z */
    private String f37062z;

    /* JADX INFO: renamed from: com.mbridge.msdk.mbsignalcommon.commonwebview.CollapsibleWebView$a */
    class ViewOnClickListenerC13353a implements View.OnClickListener {
        ViewOnClickListenerC13353a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CollapsibleWebView.this.hideToolBarButton("doCollapse");
            CollapsibleWebView.this.showToolBarButton("doSpand");
            CollapsibleWebView.this.m38620d();
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.mbsignalcommon.commonwebview.CollapsibleWebView$b */
    class ViewOnClickListenerC13354b implements View.OnClickListener {
        ViewOnClickListenerC13354b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CollapsibleWebView.this.hideToolBarButton("doSpand");
            CollapsibleWebView.this.showToolBarButton("doCollapse");
            CollapsibleWebView.this.m38621e();
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.mbsignalcommon.commonwebview.CollapsibleWebView$c */
    class C13355c implements CommonWebView.InterfaceC13366i {
        C13355c() {
        }

        @Override // com.mbridge.msdk.mbsignalcommon.commonwebview.CommonWebView.InterfaceC13366i
        /* JADX INFO: renamed from: a */
        public void mo38622a(String str) {
            CollapsibleWebView collapsibleWebView = CollapsibleWebView.this;
            collapsibleWebView.m38615b(collapsibleWebView.f37078j, str);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.mbsignalcommon.commonwebview.CollapsibleWebView$d */
    class C13356d extends WebViewClient {

        /* JADX INFO: renamed from: a */
        Boolean f37066a = Boolean.FALSE;

        /* JADX INFO: renamed from: b */
        String f37067b = "";

        C13356d() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            if (this.f37066a.booleanValue()) {
                return;
            }
            CollapsibleWebView.this.m38610a((View) webView, str);
            this.f37066a = Boolean.FALSE;
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.f37067b = str;
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            HashMap map = new HashMap();
            map.put("type", "error");
            map.put("url", str2);
            map.put("description", str);
            if (!this.f37066a.booleanValue() && this.f37067b.equals(str2)) {
                this.f37066a = Boolean.TRUE;
                CollapsibleWebView.this.m38616b(webView, map);
            }
            CollapsibleWebView.this.m38611a(webView, map);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            HashMap map = new HashMap();
            map.put("type", "ssl");
            map.put("url", sslError.getUrl());
            map.put("description", "ssl error");
            if (!this.f37066a.booleanValue()) {
                if (this.f37067b.equals(sslError.getUrl() + "")) {
                    this.f37066a = Boolean.TRUE;
                    CollapsibleWebView.this.m38616b(webView, map);
                }
            }
            CollapsibleWebView.this.m38611a(webView, map);
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            C13219q0.m37816b("CollapsibleWebView", "WebView called onRenderProcessGone");
            return true;
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            HashMap map = new HashMap();
            map.put("type", ProxyConfig.MATCH_HTTP);
            String str = webResourceRequest.getUrl() + "";
            map.put("url", str);
            map.put("statusCode", webResourceResponse.getStatusCode() + "");
            map.put("description", "http error");
            if (!this.f37066a.booleanValue() && (this.f37067b.equals(str) || TextUtils.isEmpty(this.f37067b))) {
                this.f37066a = Boolean.TRUE;
                CollapsibleWebView.this.m38616b(webView, map);
            }
            CollapsibleWebView.this.m38611a(webView, map);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.mbsignalcommon.commonwebview.CollapsibleWebView$e */
    public interface InterfaceC13357e {
        /* JADX INFO: renamed from: a */
        void mo38623a(View view, String str);

        /* JADX INFO: renamed from: a */
        void mo38624a(View view, Map<String, String> map);

        /* JADX INFO: renamed from: b */
        void mo38625b(View view, String str);

        /* JADX INFO: renamed from: b */
        void mo38626b(View view, Map<String, String> map);
    }

    public CollapsibleWebView(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public void m38620d() {
        Iterator<CommonWebView.InterfaceC13365h> it = this.f37058v.iterator();
        while (it.hasNext()) {
            it.next().mo38646a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public void m38621e() {
        Iterator<CommonWebView.InterfaceC13365h> it = this.f37059w.iterator();
        while (it.hasNext()) {
            it.next().mo38646a();
        }
    }

    private ToolBar.C13368b getCollapseButton() {
        return new ToolBar.C13368b("doCollapse").m38657a(false).m38656a("mbridge_arrow_down_white_blackbg").m38655a(new ViewOnClickListenerC13353a());
    }

    private ToolBar.C13368b getExpandButton() {
        return new ToolBar.C13368b("doSpand").m38656a("mbridge_arrow_up_black").m38655a(new ViewOnClickListenerC13354b());
    }

    public String getCollapseIconName() {
        return this.f37061y;
    }

    public String getExpandIconName() {
        return this.f37062z;
    }

    @Override // com.mbridge.msdk.mbsignalcommon.commonwebview.CommonWebView
    public void init() {
        super.init();
        this.f37058v = new CopyOnWriteArrayList<>();
        this.f37059w = new CopyOnWriteArrayList<>();
        this.f37060x = new CopyOnWriteArrayList<>();
        this.f37061y = "mbridge_arrow_down_white_blackbg";
        this.f37062z = "mbridge_arrow_up_white";
        useDeeplink();
        initWebViewListener();
        useProgressBar();
        ArrayList<ToolBar.C13368b> arrayList = new ArrayList<>();
        arrayList.add(getCollapseButton());
        arrayList.add(getExpandButton());
        useDefaultToolBar();
        useCustomizedToolBar(arrayList, true);
    }

    public void initWebViewListener() {
        setPageLoadTimtoutListener(new C13355c());
        setPageLoadTimtout(CommonWebView.DEFAULT_JUMP_TIMEOUT);
        addWebViewClient(new C13356d());
    }

    public void setCollapseIconName(String str) {
        this.f37061y = str;
    }

    public void setCollapseListener(CommonWebView.InterfaceC13365h interfaceC13365h) {
        this.f37058v.add(interfaceC13365h);
    }

    public void setCustomizedToolBarMarginWidthPixel(int i, int i2, int i3, int i4) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f37071c.getLayoutParams();
        layoutParams.setMargins(i, i2, i3, i4);
        this.f37071c.setLayoutParams(layoutParams);
    }

    public void setExpandIconName(String str) {
        this.f37062z = str;
    }

    public void setExpandListener(CommonWebView.InterfaceC13365h interfaceC13365h) {
        this.f37059w.add(interfaceC13365h);
    }

    public void setPageLoadListener(InterfaceC13357e interfaceC13357e) {
        this.f37060x.add(interfaceC13357e);
    }

    public CollapsibleWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public CollapsibleWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m38610a(View view, String str) {
        Iterator<InterfaceC13357e> it = this.f37060x.iterator();
        while (it.hasNext()) {
            it.next().mo38623a(view, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public void m38616b(View view, Map<String, String> map) {
        Iterator<InterfaceC13357e> it = this.f37060x.iterator();
        while (it.hasNext()) {
            it.next().mo38626b(view, map);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m38611a(View view, Map<String, String> map) {
        Iterator<InterfaceC13357e> it = this.f37060x.iterator();
        while (it.hasNext()) {
            it.next().mo38624a(view, map);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public void m38615b(View view, String str) {
        Iterator<InterfaceC13357e> it = this.f37060x.iterator();
        while (it.hasNext()) {
            it.next().mo38625b(view, str);
        }
    }
}
