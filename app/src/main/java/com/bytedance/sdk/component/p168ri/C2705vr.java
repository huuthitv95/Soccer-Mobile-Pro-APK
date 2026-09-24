package com.bytedance.sdk.component.p168ri;

import android.webkit.WebView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: com.bytedance.sdk.component.ri.vr */
/* JADX INFO: loaded from: classes3.dex */
public class C2705vr {

    /* JADX INFO: renamed from: fi */
    private volatile boolean f7747fi;

    /* JADX INFO: renamed from: ik */
    private final jbs f7748ik;

    /* JADX INFO: renamed from: ka */
    private final List<InterfaceC2694co> f7749ka;

    /* JADX INFO: renamed from: lr */
    private final WebView f7750lr;

    /* JADX INFO: renamed from: ri */
    private final AbstractC2703ri f7751ri;

    C2705vr(jbs jbsVar) {
        ArrayList arrayList = new ArrayList();
        this.f7749ka = arrayList;
        this.f7747fi = false;
        this.f7748ik = jbsVar;
        if (jbsVar.f7730ri == null || jbsVar.f7727lr != null) {
            this.f7751ri = jbsVar.f7727lr;
        } else {
            this.f7751ri = new C2689ac();
        }
        this.f7751ri.m10176ik(jbsVar);
        this.f7750lr = jbsVar.f7730ri;
        arrayList.add(jbsVar.jbs);
        tan.m10182ri(jbsVar.xha);
    }

    /* JADX INFO: renamed from: lr */
    private void m10183lr() {
        if (this.f7747fi) {
            C2700mj.m10169ri(new IllegalStateException("JsBridge2 is already released!!!"));
        }
    }

    /* JADX INFO: renamed from: ri */
    public static jbs m10184ri(WebView webView) {
        return new jbs(webView);
    }

    /* JADX INFO: renamed from: ri */
    public C2705vr m10185ri(String str, AbstractC2697ik.lr lrVar) {
        return m10187ri(str, (String) null, lrVar);
    }

    /* JADX INFO: renamed from: ri */
    public C2705vr m10186ri(String str, AbstractC2698ka<?, ?> abstractC2698ka) {
        return m10188ri(str, (String) null, abstractC2698ka);
    }

    /* JADX INFO: renamed from: ri */
    public C2705vr m10187ri(String str, String str2, AbstractC2697ik.lr lrVar) {
        m10183lr();
        this.f7751ri.xha.m10144ri(str, lrVar);
        return this;
    }

    /* JADX INFO: renamed from: ri */
    public C2705vr m10188ri(String str, String str2, AbstractC2698ka<?, ?> abstractC2698ka) {
        m10183lr();
        this.f7751ri.xha.m10145ri(str, abstractC2698ka);
        return this;
    }

    /* JADX INFO: renamed from: ri */
    public C2705vr m10189ri(Set<String> set, AbstractC2701nr<?, ?> abstractC2701nr) {
        return m10190ri(set, (String) null, abstractC2701nr);
    }

    /* JADX INFO: renamed from: ri */
    public C2705vr m10190ri(Set<String> set, String str, AbstractC2701nr<?, ?> abstractC2701nr) {
        m10183lr();
        this.f7751ri.xha.m10146ri(set, abstractC2701nr);
        return this;
    }

    /* JADX INFO: renamed from: ri */
    public void m10191ri() {
        if (this.f7747fi) {
            return;
        }
        this.f7751ri.mo10106lr();
        this.f7747fi = true;
        Iterator<InterfaceC2694co> it = this.f7749ka.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }
}
