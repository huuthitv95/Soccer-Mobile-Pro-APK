package com.applovin.impl;

import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdLoadListener;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.applovin.impl.b6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1512b6 extends AbstractC1778t5 {

    /* JADX INFO: renamed from: i */
    private final AppLovinNativeAdLoadListener f1189i;

    public AbstractC1512b6(C1781u c1781u, String str, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener, C1748l c1748l) {
        super(c1781u, str, c1748l);
        this.f1189i = appLovinNativeAdLoadListener;
    }

    @Override // com.applovin.impl.AbstractC1778t5
    /* JADX INFO: renamed from: a */
    protected AbstractRunnableC1601k5 mo1882a(JSONObject jSONObject) {
        return new C1592j6(jSONObject, this.f1189i, this.f1969a);
    }

    @Override // com.applovin.impl.AbstractC1778t5
    /* JADX INFO: renamed from: a */
    protected void mo1883a(int i, String str) {
        super.mo1883a(i, str);
        this.f1189i.onNativeAdLoadFailed(new AppLovinError(i, str));
    }

    @Override // com.applovin.impl.AbstractC1778t5
    /* JADX INFO: renamed from: e */
    protected String mo1884e() {
        return AbstractC1714s0.m4324d(this.f1969a);
    }

    @Override // com.applovin.impl.AbstractC1778t5
    /* JADX INFO: renamed from: f */
    protected String mo1885f() {
        return AbstractC1714s0.m4325e(this.f1969a);
    }
}
