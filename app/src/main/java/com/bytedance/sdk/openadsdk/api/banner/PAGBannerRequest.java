package com.bytedance.sdk.openadsdk.api.banner;

import com.bytedance.sdk.openadsdk.api.PAGRequest;

/* JADX INFO: loaded from: classes3.dex */
public class PAGBannerRequest extends PAGRequest {

    /* JADX INFO: renamed from: ri */
    private PAGBannerSize f8539ri;

    public PAGBannerRequest(PAGBannerSize pAGBannerSize) {
        this.f8539ri = pAGBannerSize;
    }

    public PAGBannerSize getAdSize() {
        return this.f8539ri;
    }

    public void setAdSize(PAGBannerSize pAGBannerSize) {
        this.f8539ri = pAGBannerSize;
    }
}
