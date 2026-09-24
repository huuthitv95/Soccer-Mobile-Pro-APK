package com.bytedance.sdk.component.p168ri;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.WebView;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class jbs {

    /* JADX INFO: renamed from: aw */
    boolean f7721aw;

    /* JADX INFO: renamed from: di */
    boolean f7723di;

    /* JADX INFO: renamed from: fi */
    Context f7724fi;
    InterfaceC2694co jbs;

    /* JADX INFO: renamed from: ka */
    xha f7726ka;

    /* JADX INFO: renamed from: lr */
    AbstractC2703ri f7727lr;

    /* JADX INFO: renamed from: mj */
    InterfaceC2704sf f7728mj;

    /* JADX INFO: renamed from: ri */
    WebView f7730ri;
    boolean xha;

    /* JADX INFO: renamed from: ik */
    String f7725ik = "IESJSBridge";

    /* JADX INFO: renamed from: qt */
    String f7729qt = "host";

    /* JADX INFO: renamed from: sf */
    final Set<String> f7731sf = new LinkedHashSet();

    /* JADX INFO: renamed from: co */
    final Set<String> f7722co = new LinkedHashSet();

    jbs() {
    }

    jbs(WebView webView) {
        this.f7730ri = webView;
    }

    /* JADX INFO: renamed from: lr */
    private void m10159lr() {
        if ((this.f7730ri == null && !this.f7721aw && this.f7727lr == null) || ((TextUtils.isEmpty(this.f7725ik) && this.f7730ri != null) || this.f7726ka == null)) {
            throw new IllegalArgumentException("Requested arguments aren't set properly when building JsBridge.");
        }
    }

    /* JADX INFO: renamed from: lr */
    public jbs m10160lr(boolean z) {
        this.xha = z;
        return this;
    }

    /* JADX INFO: renamed from: ri */
    public jbs m10161ri(InterfaceC2702qt interfaceC2702qt) {
        this.f7726ka = xha.m10192ri(interfaceC2702qt);
        return this;
    }

    /* JADX INFO: renamed from: ri */
    public jbs m10162ri(AbstractC2703ri abstractC2703ri) {
        this.f7727lr = abstractC2703ri;
        return this;
    }

    /* JADX INFO: renamed from: ri */
    public jbs m10163ri(String str) {
        this.f7725ik = str;
        return this;
    }

    /* JADX INFO: renamed from: ri */
    public jbs m10164ri(boolean z) {
        this.f7723di = z;
        return this;
    }

    /* JADX INFO: renamed from: ri */
    public C2705vr m10165ri() {
        m10159lr();
        return new C2705vr(this);
    }
}
