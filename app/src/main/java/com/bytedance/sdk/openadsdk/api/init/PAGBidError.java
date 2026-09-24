package com.bytedance.sdk.openadsdk.api.init;

/* JADX INFO: loaded from: classes3.dex */
public class PAGBidError {

    /* JADX INFO: renamed from: lr */
    private String f8548lr;

    /* JADX INFO: renamed from: ri */
    private int f8549ri;

    public PAGBidError(int i, String str) {
        this.f8549ri = i;
        this.f8548lr = str;
    }

    public int getCode() {
        return this.f8549ri;
    }

    public String getMessage() {
        return this.f8548lr;
    }
}
