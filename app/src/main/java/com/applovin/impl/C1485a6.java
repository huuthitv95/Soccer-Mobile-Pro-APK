package com.applovin.impl;

import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.C1748l;
import com.applovin.sdk.AppLovinAdLoadListener;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.applovin.impl.a6 */
/* JADX INFO: loaded from: classes3.dex */
public class C1485a6 extends AbstractC1778t5 {

    /* JADX INFO: renamed from: i */
    private final AppLovinAdLoadListener f1013i;

    public C1485a6(C1781u c1781u, AppLovinAdLoadListener appLovinAdLoadListener, C1748l c1748l) {
        this(c1781u, appLovinAdLoadListener, "TaskFetchNextAd", c1748l);
    }

    public C1485a6(C1781u c1781u, AppLovinAdLoadListener appLovinAdLoadListener, String str, C1748l c1748l) {
        super(c1781u, str, c1748l);
        this.f1013i = appLovinAdLoadListener;
    }

    @Override // com.applovin.impl.AbstractC1778t5
    /* JADX INFO: renamed from: a */
    protected AbstractRunnableC1601k5 mo1882a(JSONObject jSONObject) {
        return new C1562g6(jSONObject, this.f3386g, this.f1013i, this.f1969a);
    }

    @Override // com.applovin.impl.AbstractC1778t5
    /* JADX INFO: renamed from: a */
    protected void mo1883a(int i, String str) {
        super.mo1883a(i, str);
        AppLovinAdLoadListener appLovinAdLoadListener = this.f1013i;
        if (!(appLovinAdLoadListener instanceof InterfaceC1669o2)) {
            appLovinAdLoadListener.failedToReceiveAd(i);
        } else {
            ((InterfaceC1669o2) this.f1013i).failedToReceiveAdV2(new AppLovinError(i, str));
        }
    }

    @Override // com.applovin.impl.AbstractC1778t5
    /* JADX INFO: renamed from: e */
    protected String mo1884e() {
        return AbstractC1714s0.m4308a(this.f1969a);
    }

    @Override // com.applovin.impl.AbstractC1778t5
    /* JADX INFO: renamed from: f */
    protected String mo1885f() {
        return AbstractC1714s0.m4319b(this.f1969a);
    }
}
