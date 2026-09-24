package com.bytedance.sdk.openadsdk.api.model;

/* JADX INFO: loaded from: classes3.dex */
public class PAGErrorModel {

    /* JADX INFO: renamed from: lr */
    private final String f8575lr;

    /* JADX INFO: renamed from: ri */
    private final int f8576ri;

    public PAGErrorModel(int i, String str) {
        this.f8576ri = i;
        this.f8575lr = str;
    }

    public int getErrorCode() {
        return this.f8576ri;
    }

    public String getErrorMessage() {
        return this.f8575lr;
    }
}
