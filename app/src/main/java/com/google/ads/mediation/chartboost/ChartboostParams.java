package com.google.ads.mediation.chartboost;

/* JADX INFO: loaded from: classes4.dex */
public class ChartboostParams {
    private String appId;
    private String appSignature;
    private String cbLocation = com.unity3d.ads.BuildConfig.FLAVOR;

    public String getAppId() {
        return this.appId;
    }

    public String getAppSignature() {
        return this.appSignature;
    }

    public String getLocation() {
        return this.cbLocation;
    }

    public void setAppId(String str) {
        this.appId = str;
    }

    public void setAppSignature(String str) {
        this.appSignature = str;
    }

    public void setLocation(String str) {
        this.cbLocation = str;
    }
}
