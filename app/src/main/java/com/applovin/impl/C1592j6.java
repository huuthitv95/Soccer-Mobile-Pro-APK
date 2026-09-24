package com.applovin.impl;

import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.C1768p;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdLoadListener;
import com.applovin.impl.sdk.nativeAd.C1761b;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import com.mbridge.msdk.foundation.entity.AbstractC13068b;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.applovin.impl.j6 */
/* JADX INFO: loaded from: classes3.dex */
public class C1592j6 extends AbstractRunnableC1601k5 {

    /* JADX INFO: renamed from: g */
    private final JSONObject f1896g;

    /* JADX INFO: renamed from: h */
    private final AppLovinNativeAdLoadListener f1897h;

    public C1592j6(JSONObject jSONObject, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener, C1748l c1748l) {
        super("TaskProcessNativeAdResponse", c1748l);
        this.f1896g = jSONObject;
        this.f1897h = appLovinNativeAdLoadListener;
    }

    @Override // java.lang.Runnable
    public void run() {
        JSONArray jSONArray = JsonUtils.getJSONArray(this.f1896g, AbstractC13068b.JSON_KEY_ADS, new JSONArray());
        if (jSONArray.length() > 0) {
            if (C1768p.m5160a()) {
                this.f1971c.m5171a(this.f1970b, "Processing ad...");
            }
            this.f1969a.m4853s0().m2603a(new C1761b(JsonUtils.getJSONObject(jSONArray, 0, new JSONObject()), this.f1896g, this.f1897h, this.f1969a));
            return;
        }
        if (C1768p.m5160a()) {
            this.f1971c.m5178k(this.f1970b, "No ads were returned from the server");
        }
        AbstractC1701q7.m4056a("native_native", MaxAdFormat.NATIVE, this.f1896g, this.f1969a);
        this.f1897h.onNativeAdLoadFailed(AppLovinError.NO_FILL);
    }
}
