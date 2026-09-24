package com.applovin.impl;

import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.C1768p;
import com.applovin.impl.sdk.p025ad.AbstractC1736b;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinErrorCodes;
import com.google.android.gms.ads.AdError;
import com.mbridge.msdk.foundation.entity.AbstractC13068b;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.applovin.impl.g6 */
/* JADX INFO: loaded from: classes3.dex */
public class C1562g6 extends AbstractRunnableC1601k5 implements InterfaceC1669o2 {

    /* JADX INFO: renamed from: g */
    private final JSONObject f1718g;

    /* JADX INFO: renamed from: h */
    private final C1781u f1719h;

    /* JADX INFO: renamed from: i */
    private final AppLovinAdLoadListener f1720i;

    /* JADX INFO: renamed from: j */
    private final boolean f1721j;

    public C1562g6(JSONObject jSONObject, C1781u c1781u, AppLovinAdLoadListener appLovinAdLoadListener, C1748l c1748l) {
        this(jSONObject, c1781u, false, appLovinAdLoadListener, c1748l);
    }

    public C1562g6(JSONObject jSONObject, C1781u c1781u, boolean z, AppLovinAdLoadListener appLovinAdLoadListener, C1748l c1748l) {
        super("TaskProcessAdResponse", c1748l);
        if (jSONObject == null) {
            throw new IllegalArgumentException("No response specified");
        }
        if (c1781u == null) {
            throw new IllegalArgumentException("No zone specified");
        }
        this.f1718g = jSONObject;
        this.f1719h = c1781u;
        this.f1720i = appLovinAdLoadListener;
        this.f1721j = z;
    }

    /* JADX INFO: renamed from: a */
    private void m2740a(JSONObject jSONObject) {
        String string = JsonUtils.getString(jSONObject, "type", AdError.UNDEFINED_DOMAIN);
        if ("applovin".equalsIgnoreCase(string)) {
            if (C1768p.m5160a()) {
                this.f1971c.m5171a(this.f1970b, "Starting task for AppLovin ad...");
            }
            this.f1969a.m4853s0().m2603a(new C1622m6(jSONObject, this.f1718g, this, this.f1969a));
            return;
        }
        if ("vast".equalsIgnoreCase(string)) {
            if (C1768p.m5160a()) {
                this.f1971c.m5171a(this.f1970b, "Starting task for VAST ad...");
            }
            this.f1969a.m4853s0().m2603a(AbstractC1602k6.m3090a(jSONObject, this.f1718g, this, this.f1969a));
            return;
        }
        if (C1768p.m5160a()) {
            this.f1971c.m5174b(this.f1970b, "Unable to process ad of unknown type: " + string);
        }
        failedToReceiveAdV2(new AppLovinError(AppLovinErrorCodes.INVALID_RESPONSE, "Unknown ad type: " + string));
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void adReceived(AppLovinAd appLovinAd) {
        AppLovinAdLoadListener appLovinAdLoadListener = this.f1720i;
        if (appLovinAdLoadListener != null) {
            appLovinAdLoadListener.adReceived(appLovinAd);
        }
        if (this.f1721j || !(appLovinAd instanceof AbstractC1736b)) {
            return;
        }
        this.f1969a.m4830g().m2525a(C1548f2.f1464A, (AbstractC1736b) appLovinAd);
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void failedToReceiveAd(int i) {
        failedToReceiveAdV2(new AppLovinError(i, ""));
    }

    @Override // com.applovin.impl.InterfaceC1669o2
    public void failedToReceiveAdV2(AppLovinError appLovinError) {
        AppLovinAdLoadListener appLovinAdLoadListener = this.f1720i;
        if (appLovinAdLoadListener == null) {
            return;
        }
        if (appLovinAdLoadListener instanceof InterfaceC1669o2) {
            ((InterfaceC1669o2) appLovinAdLoadListener).failedToReceiveAdV2(appLovinError);
        } else {
            appLovinAdLoadListener.failedToReceiveAd(appLovinError.getCode());
        }
        if (this.f1721j) {
            return;
        }
        this.f1969a.m4830g().m2527a(C1548f2.f1466B, this.f1719h, appLovinError);
    }

    @Override // java.lang.Runnable
    public void run() {
        JSONArray jSONArray = JsonUtils.getJSONArray(this.f1718g, AbstractC13068b.JSON_KEY_ADS, new JSONArray());
        if (jSONArray.length() > 0) {
            if (C1768p.m5160a()) {
                this.f1971c.m5171a(this.f1970b, "Processing ad...");
            }
            m2740a(JsonUtils.getJSONObject(jSONArray, 0, new JSONObject()));
        } else {
            if (C1768p.m5160a()) {
                this.f1971c.m5178k(this.f1970b, "No ads were returned from the server");
            }
            AbstractC1701q7.m4056a(this.f1719h.m5264e(), this.f1719h.m5263d(), this.f1718g, this.f1969a);
            failedToReceiveAdV2(AppLovinError.NO_FILL);
        }
    }
}
