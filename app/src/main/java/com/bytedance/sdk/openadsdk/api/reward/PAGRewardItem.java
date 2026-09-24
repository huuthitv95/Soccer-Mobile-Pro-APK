package com.bytedance.sdk.openadsdk.api.reward;

/* JADX INFO: loaded from: classes3.dex */
public class PAGRewardItem {

    /* JADX INFO: renamed from: lr */
    private final String f8606lr;

    /* JADX INFO: renamed from: ri */
    private final int f8607ri;

    public PAGRewardItem(int i, String str) {
        this.f8607ri = i;
        this.f8606lr = str;
    }

    public int getRewardAmount() {
        return this.f8607ri;
    }

    public String getRewardName() {
        return this.f8606lr;
    }
}
