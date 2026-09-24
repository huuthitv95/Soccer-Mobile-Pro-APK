package com.applovin.impl.mediation;

import android.os.Bundle;
import com.applovin.impl.AbstractC1482a3;
import com.applovin.impl.C1551f5;
import com.applovin.impl.C1619m3;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.parameters.MaxAdapterInitializationParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterSignalCollectionParameters;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class MaxAdapterParametersImpl implements MaxAdapterResponseParameters, MaxAdapterSignalCollectionParameters, MaxAdapterInitializationParameters {

    /* JADX INFO: renamed from: a */
    private String f2090a;

    /* JADX INFO: renamed from: b */
    private Map f2091b;

    /* JADX INFO: renamed from: c */
    private Bundle f2092c;

    /* JADX INFO: renamed from: d */
    private Bundle f2093d;

    /* JADX INFO: renamed from: e */
    private Boolean f2094e;

    /* JADX INFO: renamed from: f */
    private Boolean f2095f;

    /* JADX INFO: renamed from: g */
    private String f2096g;

    /* JADX INFO: renamed from: h */
    private boolean f2097h;

    /* JADX INFO: renamed from: i */
    private String f2098i;

    /* JADX INFO: renamed from: j */
    private String f2099j;

    /* JADX INFO: renamed from: k */
    private long f2100k;

    /* JADX INFO: renamed from: l */
    private MaxAdFormat f2101l;

    private MaxAdapterParametersImpl() {
    }

    /* JADX INFO: renamed from: a */
    static MaxAdapterParametersImpl m3247a(AbstractC1482a3 abstractC1482a3) {
        MaxAdapterParametersImpl maxAdapterParametersImplM3249a = m3249a((C1619m3) abstractC1482a3);
        maxAdapterParametersImplM3249a.f2098i = abstractC1482a3.m1834U();
        maxAdapterParametersImplM3249a.f2099j = abstractC1482a3.m1819E();
        maxAdapterParametersImplM3249a.f2100k = abstractC1482a3.m1818D();
        return maxAdapterParametersImplM3249a;
    }

    /* JADX INFO: renamed from: a */
    static MaxAdapterParametersImpl m3248a(C1551f5 c1551f5, String str, MaxAdFormat maxAdFormat) {
        MaxAdapterParametersImpl maxAdapterParametersImplM3249a = m3249a(c1551f5);
        maxAdapterParametersImplM3249a.f2090a = str;
        maxAdapterParametersImplM3249a.f2101l = maxAdFormat;
        return maxAdapterParametersImplM3249a;
    }

    /* JADX INFO: renamed from: a */
    static MaxAdapterParametersImpl m3249a(C1619m3 c1619m3) {
        MaxAdapterParametersImpl maxAdapterParametersImpl = new MaxAdapterParametersImpl();
        maxAdapterParametersImpl.f2090a = c1619m3.getAdUnitId();
        maxAdapterParametersImpl.f2094e = c1619m3.m3218n();
        maxAdapterParametersImpl.f2095f = c1619m3.m3219o();
        maxAdapterParametersImpl.f2096g = c1619m3.m3205d();
        maxAdapterParametersImpl.f2091b = c1619m3.m3214i();
        maxAdapterParametersImpl.f2092c = c1619m3.m3216l();
        maxAdapterParametersImpl.f2093d = c1619m3.m3209f();
        maxAdapterParametersImpl.f2097h = c1619m3.m3220p();
        return maxAdapterParametersImpl;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterSignalCollectionParameters
    public MaxAdFormat getAdFormat() {
        return this.f2101l;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public String getAdUnitId() {
        return this.f2090a;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters
    public long getBidExpirationMillis() {
        return this.f2100k;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters
    public String getBidResponse() {
        return this.f2099j;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public String getConsentString() {
        return this.f2096g;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public Bundle getCustomParameters() {
        return this.f2093d;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public Map<String, Object> getLocalExtraParameters() {
        return this.f2091b;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public Bundle getServerParameters() {
        return this.f2092c;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters
    public String getThirdPartyAdPlacementId() {
        return this.f2098i;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public Boolean hasUserConsent() {
        return this.f2094e;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public Boolean isAgeRestrictedUser() {
        return null;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public Boolean isDoNotSell() {
        return this.f2095f;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public boolean isTesting() {
        return this.f2097h;
    }
}
