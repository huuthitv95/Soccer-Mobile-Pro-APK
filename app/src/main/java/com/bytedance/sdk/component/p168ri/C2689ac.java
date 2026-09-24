package com.bytedance.sdk.component.p168ri;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;

/* JADX INFO: renamed from: com.bytedance.sdk.component.ri.ac */
/* JADX INFO: loaded from: classes3.dex */
public class C2689ac extends AbstractC2703ri {

    /* JADX INFO: renamed from: qt */
    static final /* synthetic */ boolean f7683qt = true;
    protected WebView jbs;

    /* JADX INFO: renamed from: mj */
    protected String f7684mj;

    /* JADX INFO: renamed from: ri */
    private void m10103ri(String str, final String str2) {
        if (this.f7736di || TextUtils.isEmpty(str2)) {
            return;
        }
        Runnable runnable = new Runnable() { // from class: com.bytedance.sdk.component.ri.ac.1
            @Override // java.lang.Runnable
            public void run() {
                if (C2689ac.this.f7736di) {
                    return;
                }
                try {
                    C2689ac.this.jbs.evaluateJavascript(str2, null);
                } catch (Throwable unused) {
                }
            }
        };
        if (Looper.myLooper() != Looper.getMainLooper()) {
            this.f7739ka.post(runnable);
        } else {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: ik */
    protected void mo10104ik() {
        if (!f7683qt && this.jbs == null) {
            throw new AssertionError();
        }
        this.jbs.addJavascriptInterface(this, this.f7684mj);
    }

    @Override // com.bytedance.sdk.component.p168ri.AbstractC2703ri
    @JavascriptInterface
    public void invokeMethod(String str) {
        super.invokeMethod(str);
    }

    /* JADX INFO: renamed from: ka */
    protected void mo10105ka() {
        this.jbs.removeJavascriptInterface(this.f7684mj);
    }

    @Override // com.bytedance.sdk.component.p168ri.AbstractC2703ri
    /* JADX INFO: renamed from: lr */
    protected void mo10106lr() {
        super.mo10106lr();
        mo10105ka();
    }

    @Override // com.bytedance.sdk.component.p168ri.AbstractC2703ri
    /* JADX INFO: renamed from: lr */
    protected void mo10107lr(jbs jbsVar) {
        this.jbs = jbsVar.f7730ri;
        this.f7684mj = jbsVar.f7725ik;
        if (jbsVar.f7721aw) {
            return;
        }
        mo10104ik();
    }

    @Override // com.bytedance.sdk.component.p168ri.AbstractC2703ri
    /* JADX INFO: renamed from: ri */
    protected Context mo10108ri(jbs jbsVar) {
        if (jbsVar.f7724fi != null) {
            return jbsVar.f7724fi;
        }
        if (jbsVar.f7730ri != null) {
            return jbsVar.f7730ri.getContext();
        }
        throw new IllegalStateException("WebView cannot be null!");
    }

    @Override // com.bytedance.sdk.component.p168ri.AbstractC2703ri
    /* JADX INFO: renamed from: ri */
    protected String mo10109ri() {
        return this.jbs.getUrl();
    }

    @Override // com.bytedance.sdk.component.p168ri.AbstractC2703ri
    /* JADX INFO: renamed from: ri */
    protected void mo10110ri(String str) {
        m10103ri(str, "javascript:" + this.f7684mj + "._handleMessageFromToutiao(" + str + ")");
    }

    @Override // com.bytedance.sdk.component.p168ri.AbstractC2703ri
    /* JADX INFO: renamed from: ri */
    protected void mo10111ri(String str, bgr bgrVar) {
        if (bgrVar == null || TextUtils.isEmpty(bgrVar.f7693mj)) {
            super.mo10111ri(str, bgrVar);
            return;
        }
        String str2 = bgrVar.f7693mj;
        m10103ri(str, String.format("javascript:(function(){   const iframe = document.querySelector(atob('%s'));   if (iframe && iframe.contentWindow) {        iframe.contentWindow.postMessage(%s, atob('%s'));   }})()", Base64.encodeToString(String.format("iframe[src=\"%s\"", str2).getBytes(), 2), str, Base64.encodeToString(str2.getBytes(), 2)));
    }
}
