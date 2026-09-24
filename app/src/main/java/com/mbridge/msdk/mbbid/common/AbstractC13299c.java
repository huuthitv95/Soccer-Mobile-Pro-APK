package com.mbridge.msdk.mbbid.common;

/* JADX INFO: renamed from: com.mbridge.msdk.mbbid.common.c */
/* JADX INFO: compiled from: BidRequestParams.java */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC13299c {

    /* JADX INFO: renamed from: a */
    private String f36788a;

    /* JADX INFO: renamed from: b */
    private String f36789b;

    /* JADX INFO: renamed from: c */
    private String f36790c;

    public AbstractC13299c(String str, String str2) {
        this.f36788a = str;
        this.f36789b = str2;
    }

    public String getmFloorPrice() {
        return this.f36790c;
    }

    public String getmPlacementId() {
        return this.f36788a;
    }

    public String getmUnitId() {
        return this.f36789b;
    }

    public void setmFloorPrice(String str) {
        this.f36790c = str;
    }

    public void setmPlacementId(String str) {
        this.f36788a = str;
    }

    public void setmUnitId(String str) {
        this.f36789b = str;
    }

    public AbstractC13299c(String str, String str2, String str3) {
        this.f36788a = str;
        this.f36789b = str2;
        this.f36790c = str3;
    }
}
