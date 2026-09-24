package com.mbridge.msdk.config.dynamic.baseview.webview;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.mbridge.msdk.config.dynamic.baseview.cusview.XMLView;
import com.mbridge.msdk.config.dynamic.baseview.inter.InterfaceC12875a;
import com.mbridge.msdk.config.dynamic.baseview.webview.client.C12889a;
import com.mbridge.msdk.config.dynamic.baseview.webview.client.C12890b;
import com.mbridge.msdk.config.dynamic.baseview.webview.listener.InterfaceC12891a;
import com.mbridge.msdk.config.dynamic.utils.C12902d;
import com.mbridge.msdk.config.dynamic.utils.C12904f;
import com.mbridge.msdk.foundation.tools.C13219q0;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class ComponentWebView extends WebView implements InterfaceC12875a {

    /* JADX INFO: renamed from: a */
    private final String f34683a;

    /* JADX INFO: renamed from: b */
    private C12890b f34684b;

    /* JADX INFO: renamed from: c */
    private C12889a f34685c;

    /* JADX INFO: renamed from: d */
    private boolean f34686d;

    /* JADX INFO: renamed from: e */
    private XMLView f34687e;

    /* JADX INFO: renamed from: f */
    private float f34688f;

    /* JADX INFO: renamed from: g */
    private float f34689g;

    /* JADX INFO: renamed from: h */
    private long f34690h;

    /* JADX INFO: renamed from: i */
    private String f34691i;

    public ComponentWebView(Context context) {
        super(context);
        this.f34683a = "ComponentWebView";
        this.f34690h = -1L;
        m36033a();
    }

    /* JADX INFO: renamed from: a */
    private void m36033a() {
        m36035b();
        C12890b c12890b = new C12890b();
        this.f34684b = c12890b;
        setWebViewClient(c12890b);
        C12889a c12889a = new C12889a();
        this.f34685c = c12889a;
        setWebChromeClient(c12889a);
    }

    /* JADX INFO: renamed from: b */
    private void m36035b() {
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        WebSettings settings = getSettings();
        settings.setUserAgentString(settings.getUserAgentString() + " WindVane/3.0.2");
        settings.setJavaScriptEnabled(true);
        settings.setCacheMode(-1);
        settings.setAllowFileAccess(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setDomStorageEnabled(true);
        settings.setSupportZoom(false);
        settings.setBuiltInZoomControls(true);
        settings.setDisplayZoomControls(false);
        settings.setSavePassword(false);
        settings.setDatabaseEnabled(true);
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        settings.setRenderPriority(WebSettings.RenderPriority.HIGH);
        if (Build.VERSION.SDK_INT >= 26) {
            settings.setSafeBrowsingEnabled(false);
        }
        settings.setMediaPlaybackRequiresUserGesture(false);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setMixedContentMode(0);
        settings.setDatabaseEnabled(true);
        String path = getContext().getDir("database", 0).getPath();
        settings.setDatabasePath(path);
        settings.setGeolocationEnabled(true);
        settings.setGeolocationDatabasePath(path);
    }

    @Override // android.webkit.WebView
    public void destroy() {
        if (this.f34686d) {
            return;
        }
        try {
            this.f34686d = true;
            setVisibility(8);
            removeAllViews();
            setDownloadListener(null);
            destroy();
        } catch (Throwable th) {
            C13219q0.m37816b("ComponentWebView", th.getMessage());
        }
    }

    public long getClickTimeStamp() {
        return this.f34690h;
    }

    public float getxInScreen() {
        return this.f34688f;
    }

    public float getyInScreen() {
        return this.f34689g;
    }

    public boolean hasXmlUrl() {
        return !TextUtils.isEmpty(this.f34691i);
    }

    public boolean isDestroyed() {
        return this.f34686d;
    }

    public void loadXMLUrl() {
        if (TextUtils.isEmpty(this.f34691i)) {
            return;
        }
        loadUrl(this.f34691i);
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f34687e = C12902d.m36156a((View) this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        destroy();
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        try {
            if (motionEvent.getAction() == 0) {
                this.f34688f = motionEvent.getRawX();
                this.f34689g = motionEvent.getRawY();
                this.f34690h = System.currentTimeMillis();
            }
        } catch (Exception e) {
            C13219q0.m37816b("ComponentWebView", "处理触摸事件异常: " + e.getMessage());
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setViewClickListener() {
        setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.config.dynamic.baseview.webview.ComponentWebView$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.m36034a(view);
            }
        });
    }

    public void setWebViewEventListener(InterfaceC12891a interfaceC12891a) {
        C12890b c12890b = this.f34684b;
        if (c12890b != null) {
            c12890b.m36037a(interfaceC12891a);
        }
        C12889a c12889a = this.f34685c;
        if (c12889a != null) {
            c12889a.m36036a(interfaceC12891a);
        }
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.inter.InterfaceC12875a
    public void setXmlData(Map<String, Object> map) {
        if (map == null) {
            return;
        }
        try {
            String strValueOf = String.valueOf(map.get("clickable"));
            if (!TextUtils.isEmpty(strValueOf) && strValueOf.equals("true")) {
                setViewClickListener();
            }
            Object obj = map.get("data");
            if (obj instanceof String) {
                setXmlUrl(String.valueOf(obj));
            }
        } catch (Exception e) {
            C13219q0.m37816b("ComponentWebView", "setXmlData异常: " + e.getMessage());
        }
    }

    public void setXmlUrl(String str) {
        this.f34691i = str;
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.inter.InterfaceC12875a
    public void updateBindData(String str, Object obj) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void m36034a(View view) {
        XMLView xMLView = this.f34687e;
        if (xMLView != null) {
            xMLView.updateTouchView(view);
        }
        C12904f.m36164a(this.f34687e, view.getTag(), null);
    }

    public ComponentWebView(Context context, AttributeSet attributeSet) {
        super(context);
        this.f34683a = "ComponentWebView";
        this.f34690h = -1L;
        m36033a();
    }

    public ComponentWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f34683a = "ComponentWebView";
        this.f34690h = -1L;
        m36033a();
    }

    public ComponentWebView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f34683a = "ComponentWebView";
        this.f34690h = -1L;
        m36033a();
    }
}
