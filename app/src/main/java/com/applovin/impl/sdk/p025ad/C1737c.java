package com.applovin.impl.sdk.p025ad;

import com.applovin.impl.AbstractC1570h4;
import com.applovin.impl.C1781u;
import com.applovin.impl.sdk.C1748l;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.applovin.impl.sdk.ad.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C1737c extends AppLovinAdImpl {

    /* JADX INFO: renamed from: d */
    private AppLovinAd f2926d;

    /* JADX INFO: renamed from: e */
    private final C1781u f2927e;

    public C1737c(C1781u c1781u, C1748l c1748l) {
        super(new JSONObject(), new JSONObject(), c1748l);
        this.f2927e = c1781u;
    }

    /* JADX INFO: renamed from: d */
    private AppLovinAd m4575d() {
        return (AppLovinAd) this.sdk.m4836j().m4645f(this.f2927e);
    }

    /* JADX INFO: renamed from: e */
    private String m4576e() {
        C1781u adZone = getAdZone();
        if (adZone == null || adZone.m5267i()) {
            return null;
        }
        return adZone.m5264e();
    }

    /* JADX INFO: renamed from: a */
    public void m4577a(AppLovinAd appLovinAd) {
        this.f2926d = appLovinAd;
    }

    /* JADX INFO: renamed from: c */
    public AppLovinAd m4578c() {
        AppLovinAd appLovinAd = this.f2926d;
        return appLovinAd != null ? appLovinAd : m4575d();
    }

    @Override // com.applovin.impl.sdk.p025ad.AppLovinAdImpl
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1737c.class != obj.getClass()) {
            return false;
        }
        AppLovinAd appLovinAdM4578c = m4578c();
        return appLovinAdM4578c != null ? appLovinAdM4578c.equals(obj) : super.equals(obj);
    }

    /* JADX INFO: renamed from: f */
    public AppLovinAd m4579f() {
        return this.f2926d;
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.InterfaceC1560g4
    public AbstractC1570h4 getAdEventTracker() {
        return null;
    }

    @Override // com.applovin.impl.sdk.p025ad.AppLovinAdImpl, com.applovin.impl.sdk.AppLovinAdBase
    public long getAdIdNumber() {
        AppLovinAd appLovinAdM4578c = m4578c();
        if (appLovinAdM4578c instanceof AppLovinAdImpl) {
            return ((AppLovinAdImpl) appLovinAdM4578c).getAdIdNumber();
        }
        return 0L;
    }

    @Override // com.applovin.impl.sdk.p025ad.AppLovinAdImpl
    public C1781u getAdZone() {
        AppLovinAdImpl appLovinAdImpl = (AppLovinAdImpl) m4578c();
        return appLovinAdImpl != null ? appLovinAdImpl.getAdZone() : this.f2927e;
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase
    public long getCreatedAtMillis() {
        AppLovinAd appLovinAdM4578c = m4578c();
        if (appLovinAdM4578c instanceof AppLovinAdImpl) {
            return ((AppLovinAdImpl) appLovinAdM4578c).getCreatedAtMillis();
        }
        return 0L;
    }

    @Override // com.applovin.impl.sdk.p025ad.AppLovinAdImpl
    public String getMediationServeId() {
        AppLovinAd appLovinAdM4578c = m4578c();
        if (appLovinAdM4578c instanceof AppLovinAdImpl) {
            return ((AppLovinAdImpl) appLovinAdM4578c).getMediationServeId();
        }
        return null;
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.InterfaceC1560g4
    public String getOpenMeasurementContentUrl() {
        return null;
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.InterfaceC1560g4
    public String getOpenMeasurementCustomReferenceData() {
        return null;
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.InterfaceC1560g4
    public List getOpenMeasurementVerificationScriptResources() {
        return null;
    }

    @Override // com.applovin.impl.sdk.p025ad.AppLovinAdImpl
    public JSONObject getOriginalFullResponse() {
        AppLovinAd appLovinAdM4578c = m4578c();
        if (appLovinAdM4578c instanceof AppLovinAdImpl) {
            return ((AppLovinAdImpl) appLovinAdM4578c).getOriginalFullResponse();
        }
        return null;
    }

    @Override // com.applovin.impl.sdk.p025ad.AppLovinAdImpl, com.applovin.sdk.AppLovinAd
    public AppLovinAdSize getSize() {
        return getAdZone().m5265f();
    }

    @Override // com.applovin.impl.sdk.p025ad.AppLovinAdImpl, com.applovin.sdk.AppLovinAd
    public AppLovinAdType getType() {
        return getAdZone().m5266g();
    }

    @Override // com.applovin.impl.sdk.p025ad.AppLovinAdImpl, com.applovin.sdk.AppLovinAd
    public String getZoneId() {
        if (this.f2927e.m5267i()) {
            return null;
        }
        return this.f2927e.m5264e();
    }

    @Override // com.applovin.impl.sdk.p025ad.AppLovinAdImpl
    public int hashCode() {
        AppLovinAd appLovinAdM4578c = m4578c();
        return appLovinAdM4578c != null ? appLovinAdM4578c.hashCode() : super.hashCode();
    }

    @Override // com.applovin.impl.sdk.p025ad.AppLovinAdImpl
    public boolean isExpired() {
        AppLovinAdImpl appLovinAdImpl = (AppLovinAdImpl) m4578c();
        return appLovinAdImpl != null && appLovinAdImpl.isExpired();
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.InterfaceC1560g4
    public boolean isOpenMeasurementEnabled() {
        return false;
    }

    @Override // com.applovin.impl.sdk.p025ad.AppLovinAdImpl
    public boolean isVideoAd() {
        AppLovinAd appLovinAdM4578c = m4578c();
        return (appLovinAdM4578c instanceof AppLovinAdImpl) && ((AppLovinAdImpl) appLovinAdM4578c).isVideoAd();
    }

    @Override // com.applovin.impl.sdk.p025ad.AppLovinAdImpl
    public String toString() {
        return "AppLovinAd{ #" + getAdIdNumber() + ", adType=" + getType() + ", adSize=" + getSize() + ", zoneId='" + m4576e() + "'}";
    }
}
