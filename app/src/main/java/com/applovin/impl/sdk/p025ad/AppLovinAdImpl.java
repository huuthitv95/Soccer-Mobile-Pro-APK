package com.applovin.impl.sdk.p025ad;

import com.applovin.impl.C1591j5;
import com.applovin.impl.C1781u;
import com.applovin.impl.C1831z4;
import com.applovin.impl.InterfaceC1783u1;
import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.C1768p;
import com.applovin.mediation.AppLovinUtils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public abstract class AppLovinAdImpl extends AppLovinAdBase implements AppLovinAd, InterfaceC1783u1 {

    /* JADX INFO: renamed from: a */
    private C1781u f2889a;

    /* JADX INFO: renamed from: b */
    private boolean f2890b;

    /* JADX INFO: renamed from: c */
    private C1737c f2891c;

    protected AppLovinAdImpl(JSONObject jSONObject, JSONObject jSONObject2, C1748l c1748l) {
        super(jSONObject, jSONObject2, c1748l);
    }

    /* JADX INFO: renamed from: b */
    private long m4432b() {
        return getLongFromAdObject("ad_expiration_ms", ((Long) this.sdk.m4801a(C1831z4.f3914e1)).longValue());
    }

    public boolean canExpire() {
        return getSize() == AppLovinAdSize.INTERSTITIAL && m4432b() > 0;
    }

    public boolean equals(Object obj) {
        AppLovinAd appLovinAdM4578c;
        if ((obj instanceof C1737c) && (appLovinAdM4578c = ((C1737c) obj).m4578c()) != null) {
            obj = appLovinAdM4578c;
        }
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && getAdIdNumber() == ((AppLovinAdImpl) obj).getAdIdNumber();
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase
    public long getAdIdNumber() {
        return getLongFromAdObject("ad_id", -1L);
    }

    public C1781u getAdZone() {
        C1781u c1781u = this.f2889a;
        if (c1781u != null) {
            if (c1781u.m5265f() != null && this.f2889a.m5266g() != null) {
                return this.f2889a;
            }
            if (getSize() == null && getType() == null) {
                return this.f2889a;
            }
        }
        C1781u c1781uM5251a = C1781u.m5251a(getSize(), getType(), getStringFromFullResponse(AppLovinUtils.ServerParameterKeys.ZONE_ID, null), getBooleanFromFullResponse("is_bidding", false), getBooleanFromFullResponse("is_direct_sold", false));
        this.f2889a = c1781uM5251a;
        return c1781uM5251a;
    }

    public C1737c getDummyAd() {
        return this.f2891c;
    }

    public String getMediationServeId() {
        return getStringFromFullResponse("event_id", null);
    }

    public abstract JSONObject getOriginalFullResponse();

    public String getRawFullResponse() {
        String string;
        C1591j5 c1591j5 = this.synchronizedFullResponse;
        if (c1591j5 != null) {
            return c1591j5.toString();
        }
        synchronized (this.fullResponseLock) {
            string = this.fullResponse.toString();
        }
        return string;
    }

    @Override // com.applovin.sdk.AppLovinAd
    public AppLovinAdSize getSize() {
        return AppLovinAdSize.fromString(getStringFromFullResponse("ad_size", null));
    }

    @Override // com.applovin.impl.InterfaceC1783u1
    public long getTimeToLiveMillis() {
        if (!canExpire()) {
            return Long.MAX_VALUE;
        }
        return m4432b() - (System.currentTimeMillis() - getCreatedAtMillis());
    }

    @Override // com.applovin.sdk.AppLovinAd
    public AppLovinAdType getType() {
        return AppLovinAdType.fromString(getStringFromFullResponse("ad_type", null));
    }

    @Override // com.applovin.sdk.AppLovinAd
    public String getZoneId() {
        if (getAdZone().m5267i()) {
            return null;
        }
        return getStringFromFullResponse(AppLovinUtils.ServerParameterKeys.ZONE_ID, null);
    }

    public boolean hasShown() {
        return getBooleanFromAdObject("shown", Boolean.FALSE);
    }

    public boolean hasVideoUrl() {
        this.sdk.m4782Q();
        if (!C1768p.m5160a()) {
            return false;
        }
        this.sdk.m4782Q().m5174b("AppLovinAd", "Attempting to invoke hasVideoUrl() from base ad class");
        return false;
    }

    public int hashCode() {
        return (int) getAdIdNumber();
    }

    public boolean isExpired() {
        return this.f2890b;
    }

    public boolean isVideoAd() {
        return this.adObject.has("is_video_ad") ? getBooleanFromAdObject("is_video_ad", Boolean.FALSE) : hasVideoUrl();
    }

    public void setDummyAd(C1737c c1737c) {
        this.f2891c = c1737c;
    }

    @Override // com.applovin.impl.InterfaceC1783u1
    public void setExpired() {
        this.f2890b = true;
    }

    public void setHasShown(boolean z) {
        try {
            C1591j5 c1591j5 = this.synchronizedAdObject;
            if (c1591j5 != null) {
                c1591j5.m3002a("shown", (Object) Boolean.valueOf(z));
                return;
            }
            synchronized (this.adObjectLock) {
                this.adObject.put("shown", z);
            }
        } catch (Throwable unused) {
        }
    }

    public String toString() {
        return "AppLovinAd{adIdNumber=" + getAdIdNumber() + ", zoneId=\"" + getZoneId() + "\"}";
    }
}
