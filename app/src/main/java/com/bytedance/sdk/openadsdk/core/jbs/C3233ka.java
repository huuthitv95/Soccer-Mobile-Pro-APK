package com.bytedance.sdk.openadsdk.core.jbs;

import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.core.widget.p228ri.C3349ik;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.jbs.ka */
/* JADX INFO: loaded from: classes3.dex */
public class C3233ka {

    /* JADX INFO: renamed from: ik */
    private static volatile C3233ka f10861ik;

    /* JADX INFO: renamed from: lr */
    private static int f10862lr;

    /* JADX INFO: renamed from: ri */
    private final List<C3230fi> f10863ri = new ArrayList();

    /* JADX INFO: renamed from: ri */
    public static C3233ka m13677ri() {
        if (f10861ik == null) {
            synchronized (C3233ka.class) {
                if (f10861ik == null) {
                    f10861ik = new C3233ka();
                }
            }
        }
        return f10861ik;
    }

    /* JADX INFO: renamed from: ik */
    public int m13678ik() {
        return this.f10863ri.size();
    }

    /* JADX INFO: renamed from: ik */
    public void m13679ik(C3230fi c3230fi) {
        if (c3230fi == null || c3230fi.getWebView() == null) {
            return;
        }
        if (c3230fi.getParent() != null) {
            ((ViewGroup) c3230fi.getParent()).removeView(c3230fi);
        }
        try {
            c3230fi.removeAllViews();
            c3230fi.xha();
            c3230fi.setWebChromeClient(null);
            c3230fi.setWebViewClient(null);
            c3230fi.setDownloadListener(null);
            c3230fi.setDefaultTextEncodingName("UTF-8");
            c3230fi.setAllowFileAccess(false);
            c3230fi.setJavaScriptEnabled(true);
            c3230fi.setCacheMode(-1);
            c3230fi.setDatabaseEnabled(true);
            c3230fi.setSupportZoom(false);
            c3230fi.getWebView().setLayerType(0, null);
            c3230fi.setBackgroundColor(0);
            c3230fi.getWebView().setHorizontalScrollBarEnabled(false);
            c3230fi.getWebView().setHorizontalScrollbarOverlay(false);
            c3230fi.getWebView().setVerticalScrollBarEnabled(false);
            c3230fi.getWebView().setVerticalScrollbarOverlay(false);
            C3349ik.m15079ri(c3230fi);
            c3230fi.bgr();
            c3230fi.setMixedContentMode(0);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: lr */
    public C3230fi m13680lr() {
        C3230fi c3230fiRemove;
        if (m13678ik() > 0 && (c3230fiRemove = this.f10863ri.remove(0)) != null) {
            return c3230fiRemove;
        }
        return null;
    }

    /* JADX INFO: renamed from: lr */
    public void m13681lr(C3230fi c3230fi) {
        if (c3230fi != null) {
            if (this.f10863ri.size() >= f10862lr) {
                c3230fi.slm();
            } else {
                if (this.f10863ri.contains(c3230fi)) {
                    return;
                }
                m13679ik(c3230fi);
                this.f10863ri.add(c3230fi);
            }
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m13682ri(C3230fi c3230fi) {
        if (c3230fi != null) {
            m13681lr(c3230fi);
        }
    }
}
