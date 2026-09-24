package com.bytedance.sdk.component.jbs;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: com.bytedance.sdk.component.jbs.fi */
/* JADX INFO: loaded from: classes3.dex */
public class C2635fi extends WebView {

    /* JADX INFO: renamed from: di */
    private AbstractViewOnTouchListenerC2636ik f7453di;

    /* JADX INFO: renamed from: fi */
    private boolean f7454fi;

    /* JADX INFO: renamed from: ik */
    private boolean f7455ik;

    /* JADX INFO: renamed from: ka */
    private boolean f7456ka;

    /* JADX INFO: renamed from: lr */
    private final HashSet<String> f7457lr;

    /* JADX INFO: renamed from: ri */
    public long f7458ri;

    public C2635fi(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7457lr = new HashSet<>();
        this.f7458ri = System.currentTimeMillis();
        m9792lr();
    }

    public C2635fi(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7457lr = new HashSet<>();
        this.f7458ri = System.currentTimeMillis();
        m9792lr();
    }

    /* JADX INFO: renamed from: lr */
    private void m9792lr() {
        WebSettings settings = getSettings();
        settings.setSupportZoom(false);
        settings.setDisplayZoomControls(false);
        settings.setBuiltInZoomControls(false);
        settings.setSupportMultipleWindows(false);
        settings.setAllowFileAccess(false);
        settings.setSavePassword(false);
        setWebViewClient(new C2634di.ri());
    }

    @Override // android.webkit.WebView
    public void addJavascriptInterface(Object obj, String str) {
        toString();
        if (this.f7455ik || this.f7454fi) {
            return;
        }
        super.addJavascriptInterface(obj, str);
        this.f7457lr.add(str);
    }

    @Override // android.webkit.WebView
    public void clearCache(boolean z) {
        if (this.f7455ik || this.f7454fi) {
            return;
        }
        super.clearCache(z);
    }

    @Override // android.webkit.WebView
    public void destroy() {
        toString();
        if (this.f7455ik) {
            return;
        }
        this.f7455ik = true;
        m9793ri();
        ViewParent parent = getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this);
        }
        super.destroy();
    }

    @Override // android.webkit.WebView
    public void evaluateJavascript(String str, ValueCallback<String> valueCallback) {
        if (!this.f7455ik && !this.f7454fi) {
            super.evaluateJavascript(str, valueCallback);
        } else if (valueCallback != null) {
            valueCallback.onReceiveValue("");
        }
    }

    @Override // android.webkit.WebView
    public void goBack() {
        if (this.f7455ik || this.f7454fi) {
            return;
        }
        super.goBack();
    }

    @Override // android.webkit.WebView
    public void goBackOrForward(int i) {
        if (this.f7455ik || this.f7454fi) {
            return;
        }
        super.goBackOrForward(i);
    }

    @Override // android.webkit.WebView
    public void goForward() {
        if (this.f7455ik || this.f7454fi) {
            return;
        }
        super.goForward();
    }

    @Override // android.webkit.WebView
    public void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        if (this.f7455ik || this.f7454fi) {
            return;
        }
        super.loadDataWithBaseURL(str, str2, str3, str4, str5);
    }

    @Override // android.webkit.WebView
    public void loadUrl(String str) {
        if (this.f7455ik || this.f7454fi) {
            return;
        }
        try {
            super.loadUrl(str);
        } catch (Exception | IncompatibleClassChangeError | NoClassDefFoundError unused) {
        }
    }

    @Override // android.webkit.WebView
    public void loadUrl(String str, Map<String, String> map) {
        if (this.f7455ik || this.f7454fi) {
            return;
        }
        try {
            super.loadUrl(str, map);
        } catch (Exception | IncompatibleClassChangeError | NoClassDefFoundError unused) {
        }
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        toString();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        toString();
        if (this.f7456ka) {
            destroy();
        }
    }

    @Override // android.webkit.WebView, android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.f7455ik || this.f7454fi) {
            return;
        }
        super.onDraw(canvas);
    }

    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        if (this.f7455ik || this.f7454fi) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(i, i2);
        }
    }

    @Override // android.webkit.WebView
    public void onPause() {
        if (this.f7455ik || this.f7454fi) {
            return;
        }
        try {
            super.onPause();
        } catch (Exception unused) {
        }
    }

    @Override // android.webkit.WebView
    public void onResume() {
        if (this.f7455ik || this.f7454fi) {
            return;
        }
        try {
            super.onResume();
        } catch (Exception unused) {
        }
    }

    @Override // android.webkit.WebView
    public void pauseTimers() {
        if (this.f7455ik || this.f7454fi) {
            return;
        }
        super.pauseTimers();
    }

    @Override // android.webkit.WebView
    public void reload() {
        if (this.f7455ik || this.f7454fi) {
            return;
        }
        super.reload();
    }

    @Override // android.webkit.WebView
    public void removeJavascriptInterface(String str) {
        if (this.f7455ik || this.f7454fi) {
            return;
        }
        super.removeJavascriptInterface(str);
        this.f7457lr.remove(str);
    }

    @Override // android.webkit.WebView
    public void resumeTimers() {
        if (this.f7455ik || this.f7454fi) {
            return;
        }
        super.resumeTimers();
    }

    /* JADX INFO: renamed from: ri */
    public void m9793ri() {
        if (this.f7455ik) {
            return;
        }
        setOnClickListener(null);
        setOnTouchListener(null);
        setOnScrollChangeListener(null);
        Iterator<String> it = this.f7457lr.iterator();
        while (it.hasNext()) {
            super.removeJavascriptInterface(it.next());
        }
        this.f7457lr.clear();
    }

    public void setDestroyOnDetached(boolean z) {
        this.f7456ka = z;
    }

    @Override // android.view.View
    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        AbstractViewOnTouchListenerC2636ik abstractViewOnTouchListenerC2636ik = this.f7453di;
        if (abstractViewOnTouchListenerC2636ik == null) {
            super.setOnTouchListener(onTouchListener);
        } else {
            abstractViewOnTouchListenerC2636ik.mo9794ri(onTouchListener);
            super.setOnTouchListener(this.f7453di);
        }
    }

    public void setRecycler(boolean z) {
        this.f7454fi = z;
    }

    public void setTouchListenerProxy(AbstractViewOnTouchListenerC2636ik abstractViewOnTouchListenerC2636ik) {
        this.f7453di = abstractViewOnTouchListenerC2636ik;
    }

    @Override // android.webkit.WebView
    public void stopLoading() {
        if (this.f7455ik || this.f7454fi) {
            return;
        }
        try {
            super.stopLoading();
        } catch (Exception unused) {
        }
    }
}
