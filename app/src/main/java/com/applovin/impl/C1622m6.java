package com.applovin.impl;

import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.C1768p;
import com.applovin.impl.sdk.p025ad.C1735a;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.sdk.AppLovinAdLoadListener;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.applovin.impl.m6 */
/* JADX INFO: loaded from: classes3.dex */
public class C1622m6 extends AbstractRunnableC1601k5 {

    /* JADX INFO: renamed from: g */
    private final JSONObject f2068g;

    /* JADX INFO: renamed from: h */
    private final JSONObject f2069h;

    /* JADX INFO: renamed from: i */
    private final AppLovinAdLoadListener f2070i;

    public C1622m6(JSONObject jSONObject, JSONObject jSONObject2, AppLovinAdLoadListener appLovinAdLoadListener, C1748l c1748l) {
        super("TaskRenderAppLovinAd", c1748l);
        this.f2068g = jSONObject;
        this.f2069h = jSONObject2;
        this.f2070i = appLovinAdLoadListener;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (C1768p.m5160a()) {
            this.f1971c.m5171a(this.f1970b, "Rendering ad...");
        }
        C1735a c1735a = new C1735a(this.f2068g, this.f2069h, this.f1969a);
        boolean zBooleanValue = JsonUtils.getBoolean(this.f2068g, "gs_load_immediately", Boolean.FALSE).booleanValue();
        boolean zBooleanValue2 = JsonUtils.getBoolean(this.f2068g, "vs_load_immediately", Boolean.TRUE).booleanValue();
        C1672o5 c1672o5 = new C1672o5(c1735a, this.f1969a, this.f2070i);
        c1672o5.m3755c(zBooleanValue2);
        c1672o5.m3754b(zBooleanValue);
        this.f1969a.m4853s0().m2604a((AbstractRunnableC1601k5) c1672o5, C1552f6.b.CACHING);
    }
}
