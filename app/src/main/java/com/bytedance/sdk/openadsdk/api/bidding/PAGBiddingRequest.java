package com.bytedance.sdk.openadsdk.api.bidding;

import com.bytedance.sdk.openadsdk.api.banner.PAGBannerSize;

/* JADX INFO: loaded from: classes3.dex */
public class PAGBiddingRequest {

    /* JADX INFO: renamed from: ri */
    private PAGBannerSize f8546ri = null;

    /* JADX INFO: renamed from: lr */
    private String f8545lr = null;

    /* JADX INFO: renamed from: ik */
    private String f8544ik = null;

    public String getAdxId() {
        return this.f8544ik;
    }

    public PAGBannerSize getBannerSize() {
        return this.f8546ri;
    }

    public String getSlotId() {
        return this.f8545lr;
    }

    public void setAdxId(String str) {
        this.f8544ik = str;
    }

    public void setBannerSize(PAGBannerSize pAGBannerSize) {
        this.f8546ri = pAGBannerSize;
    }

    public void setSlotId(String str) {
        this.f8545lr = str;
    }
}
