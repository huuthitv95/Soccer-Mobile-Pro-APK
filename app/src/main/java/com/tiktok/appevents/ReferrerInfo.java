package com.tiktok.appevents;

/* JADX INFO: loaded from: classes9.dex */
public class ReferrerInfo {
    private String googleInstallReferrer;
    private long gpReferrerClickTs;
    private long gpReferrerInstallTs;

    public ReferrerInfo(String googleInstallReferrer, long gpReferrerInstallTs, long gpReferrerClickTs) {
        this.googleInstallReferrer = googleInstallReferrer;
        this.gpReferrerInstallTs = gpReferrerInstallTs;
        this.gpReferrerClickTs = gpReferrerClickTs;
    }

    public String getGoogleInstallReferrer() {
        return this.googleInstallReferrer;
    }

    public long getGpReferrerClickTs() {
        return this.gpReferrerClickTs;
    }

    public long getGpReferrerInstallTs() {
        return this.gpReferrerInstallTs;
    }

    public void setGoogleInstallReferrer(String googleInstallReferrer) {
        this.googleInstallReferrer = googleInstallReferrer;
    }

    public void setGpReferrerClickTs(long gpReferrerClickTs) {
        this.gpReferrerClickTs = gpReferrerClickTs;
    }

    public void setGpReferrerInstallTs(long gpReferrerInstallTs) {
        this.gpReferrerInstallTs = gpReferrerInstallTs;
    }
}
