package com.ironsource.adqualitysdk.sdk;

/* JADX INFO: loaded from: classes6.dex */
public class ISAdQualityCustomMediationRevenue {

    /* JADX INFO: renamed from: ﻐ */
    private final ISAdQualityMediationNetwork f26821;

    /* JADX INFO: renamed from: ﻛ */
    private final double f26822;

    /* JADX INFO: renamed from: ｋ */
    private final String f26823;

    /* JADX INFO: renamed from: ﾇ */
    private final ISAdQualityAdType f26824;

    /* synthetic */ ISAdQualityCustomMediationRevenue(ISAdQualityMediationNetwork iSAdQualityMediationNetwork, ISAdQualityAdType iSAdQualityAdType, double d, String str, byte b) {
        this(iSAdQualityMediationNetwork, iSAdQualityAdType, d, str);
    }

    private ISAdQualityCustomMediationRevenue(ISAdQualityMediationNetwork iSAdQualityMediationNetwork, ISAdQualityAdType iSAdQualityAdType, double d, String str) {
        this.f26821 = iSAdQualityMediationNetwork;
        this.f26824 = iSAdQualityAdType;
        this.f26822 = d;
        this.f26823 = str;
    }

    public ISAdQualityMediationNetwork getMediationNetwork() {
        return this.f26821;
    }

    public ISAdQualityAdType getAdType() {
        return this.f26824;
    }

    public double getRevenue() {
        return this.f26822;
    }

    public String getPlacement() {
        return this.f26823;
    }

    public static class Builder {

        /* JADX INFO: renamed from: ﻐ */
        private ISAdQualityMediationNetwork f26825 = ISAdQualityMediationNetwork.UNKNOWN;

        /* JADX INFO: renamed from: ｋ */
        private ISAdQualityAdType f26826 = ISAdQualityAdType.UNKNOWN;

        /* JADX INFO: renamed from: ﾇ */
        private double f26827;

        /* JADX INFO: renamed from: ﾒ */
        private String f26828;

        public Builder setMediationNetwork(ISAdQualityMediationNetwork iSAdQualityMediationNetwork) {
            this.f26825 = iSAdQualityMediationNetwork;
            return this;
        }

        public Builder setAdType(ISAdQualityAdType iSAdQualityAdType) {
            this.f26826 = iSAdQualityAdType;
            return this;
        }

        public Builder setRevenue(double d) {
            this.f26827 = d;
            return this;
        }

        public Builder setPlacement(String str) {
            this.f26828 = str;
            return this;
        }

        public ISAdQualityCustomMediationRevenue build() {
            return new ISAdQualityCustomMediationRevenue(this.f26825, this.f26826, this.f26827, this.f26828, (byte) 0);
        }
    }
}
