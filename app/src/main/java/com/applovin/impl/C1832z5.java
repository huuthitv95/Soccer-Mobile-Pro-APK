package com.applovin.impl;

import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdLoadListener;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.applovin.impl.z5 */
/* JADX INFO: loaded from: classes3.dex */
public class C1832z5 extends AbstractC1512b6 {

    /* JADX INFO: renamed from: j */
    private final C1595k f4100j;

    public C1832z5(C1595k c1595k, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener, C1748l c1748l) {
        super(C1781u.m5252a("adtoken_zone"), "TaskFetchNativeTokenAd", appLovinNativeAdLoadListener, c1748l);
        this.f4100j = c1595k;
    }

    @Override // com.applovin.impl.AbstractC1778t5
    /* JADX INFO: renamed from: h */
    protected Map mo2217h() {
        HashMap map = new HashMap(2);
        map.put("adtoken", this.f4100j.m3036b());
        map.put("adtoken_prefix", this.f4100j.m3038d());
        return map;
    }
}
