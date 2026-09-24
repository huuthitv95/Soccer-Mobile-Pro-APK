package com.applovin.impl;

import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.C1768p;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.google.android.gms.measurement.AppMeasurement;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.applovin.impl.v4 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC1795v4 extends WebViewClient {
    /* JADX INFO: renamed from: a */
    protected abstract Map mo1977a();

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        HashMap<String, String> mapHashMap = CollectionUtils.hashMap("top_main_method", "onRenderProcessGone");
        mapHashMap.putAll(mo1977a());
        if (AbstractC1677p0.m3811e()) {
            mapHashMap.put("source", renderProcessGoneDetail.didCrash() ? AppMeasurement.CRASH_ORIGIN : "non_crash");
            mapHashMap.put("details", "renderer_priority_at_exit=" + renderProcessGoneDetail.rendererPriorityAtExit());
        }
        C1748l c1748l = C1748l.f3003E0;
        if (c1748l != null) {
            C1748l.f3003E0.m4764E().m2681a(C1548f2.f1540i1, mapHashMap, ((Long) c1748l.m4801a(C1831z4.f4046t3)).longValue());
        }
        C1768p.m5166g("RenderProcessGoneHandlingWebViewClient", "onRenderProcessGone() handled");
        return true;
    }
}
