package com.mbridge.msdk.mbsignalcommon.base;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.mbridge.msdk.foundation.tools.C13219q0;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes6.dex */
public class BaseWebView extends WebView {

    /* JADX INFO: renamed from: a */
    protected Context f37040a;

    /* JADX INFO: renamed from: b */
    private View.OnTouchListener f37041b;

    /* JADX INFO: renamed from: c */
    private View.OnTouchListener f37042c;
    public long lastTouchTime;
    public C13349b mWebViewClient;

    /* JADX INFO: renamed from: com.mbridge.msdk.mbsignalcommon.base.BaseWebView$a */
    class ViewOnTouchListenerC13347a implements View.OnTouchListener {
        ViewOnTouchListenerC13347a() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                BaseWebView.this.lastTouchTime = System.currentTimeMillis();
            }
            if (BaseWebView.this.f37041b != null) {
                return BaseWebView.this.f37041b.onTouch(view, motionEvent);
            }
            return false;
        }
    }

    public BaseWebView(Context context) {
        super(context);
        this.lastTouchTime = 0L;
        this.f37042c = new ViewOnTouchListenerC13347a();
        this.f37040a = context;
        mo38604a();
    }

    @Override // android.webkit.WebView
    public void reload() {
        super.reload();
    }

    public void setFilter(InterfaceC13348a interfaceC13348a) {
        C13349b c13349b = this.mWebViewClient;
        if (c13349b == null || !(c13349b instanceof C13349b)) {
            return;
        }
        c13349b.m38607a(interfaceC13348a);
    }

    @Override // android.view.View
    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.f37041b = onTouchListener;
    }

    public void setTransparent() {
        setLayerType(1, null);
        setBackgroundColor(0);
    }

    @Override // android.webkit.WebView
    public void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        if (webViewClient instanceof C13349b) {
            this.mWebViewClient = (C13349b) webViewClient;
        }
    }

    /* JADX INFO: renamed from: a */
    protected void mo38604a() {
        if (this.mWebViewClient == null) {
            C13349b c13349b = new C13349b();
            this.mWebViewClient = c13349b;
            setWebViewClient(c13349b);
        }
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        WebSettings settings = getSettings();
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
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                settings.setSafeBrowsingEnabled(false);
            }
        } catch (Throwable th) {
            C13219q0.m37816b("BaseWebView", th.getMessage());
        }
        settings.setMediaPlaybackRequiresUserGesture(false);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        try {
            settings.setMixedContentMode(0);
        } catch (Exception e) {
            C13219q0.m37816b("BaseWebView", e.getMessage());
        }
        settings.setDatabaseEnabled(true);
        String path = this.f37040a.getDir("database", 0).getPath();
        settings.setDatabasePath(path);
        settings.setGeolocationEnabled(true);
        settings.setGeolocationDatabasePath(path);
        try {
            Method declaredMethod = WebSettings.class.getDeclaredMethod("setDisplayZoomControls", Boolean.TYPE);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(settings, Boolean.FALSE);
        } catch (Exception e2) {
            C13219q0.m37816b("BaseWebView", e2.getMessage());
        }
        super.setOnTouchListener(this.f37042c);
    }

    public BaseWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.lastTouchTime = 0L;
        this.f37042c = new ViewOnTouchListenerC13347a();
        this.f37040a = context;
        mo38604a();
    }

    public BaseWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.lastTouchTime = 0L;
        this.f37042c = new ViewOnTouchListenerC13347a();
        this.f37040a = context;
        mo38604a();
    }
}
