package com.applovin.impl;

import com.applovin.sdk.AppLovinSdkConfiguration;

/* JADX INFO: renamed from: com.applovin.impl.m0 */
/* JADX INFO: loaded from: classes3.dex */
public class C1616m0 {

    /* JADX INFO: renamed from: a */
    private final AppLovinSdkConfiguration.ConsentFlowUserGeography f2052a;

    public C1616m0(AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography) {
        this.f2052a = consentFlowUserGeography;
    }

    /* JADX INFO: renamed from: a */
    public AppLovinSdkConfiguration.ConsentFlowUserGeography m3167a() {
        return this.f2052a;
    }

    /* JADX INFO: renamed from: a */
    protected boolean m3168a(Object obj) {
        return obj instanceof C1616m0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1616m0)) {
            return false;
        }
        C1616m0 c1616m0 = (C1616m0) obj;
        if (!c1616m0.m3168a(this)) {
            return false;
        }
        AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeographyM3167a = m3167a();
        AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeographyM3167a2 = c1616m0.m3167a();
        return consentFlowUserGeographyM3167a != null ? consentFlowUserGeographyM3167a.equals(consentFlowUserGeographyM3167a2) : consentFlowUserGeographyM3167a2 == null;
    }

    public int hashCode() {
        AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeographyM3167a = m3167a();
        return (consentFlowUserGeographyM3167a == null ? 43 : consentFlowUserGeographyM3167a.hashCode()) + 59;
    }

    public String toString() {
        return "CmpAdapterParameters(debugUserGeography=" + m3167a() + ")";
    }
}
