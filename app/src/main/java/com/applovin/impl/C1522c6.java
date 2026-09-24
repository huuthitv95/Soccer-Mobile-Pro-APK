package com.applovin.impl;

import com.applovin.impl.sdk.C1748l;
import com.applovin.sdk.AppLovinAdLoadListener;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.applovin.impl.c6 */
/* JADX INFO: loaded from: classes3.dex */
public class C1522c6 extends C1485a6 {

    /* JADX INFO: renamed from: j */
    private final C1595k f1286j;

    public C1522c6(C1595k c1595k, AppLovinAdLoadListener appLovinAdLoadListener, C1748l c1748l) {
        super(C1781u.m5252a("adtoken_zone"), appLovinAdLoadListener, "TaskFetchTokenAd", c1748l);
        this.f1286j = c1595k;
    }

    @Override // com.applovin.impl.AbstractC1778t5
    /* JADX INFO: renamed from: h */
    protected Map mo2217h() {
        HashMap map = new HashMap(2);
        map.put("adtoken", this.f1286j.m3036b());
        map.put("adtoken_prefix", this.f1286j.m3038d());
        return map;
    }
}
