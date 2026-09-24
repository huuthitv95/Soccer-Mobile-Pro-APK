package com.bytedance.sdk.openadsdk.api.nativeAd;

/* JADX INFO: loaded from: classes3.dex */
public class PAGImageItem {

    /* JADX INFO: renamed from: ik */
    private final String f8577ik;

    /* JADX INFO: renamed from: ka */
    private float f8578ka;

    /* JADX INFO: renamed from: lr */
    private final int f8579lr;

    /* JADX INFO: renamed from: ri */
    private final int f8580ri;

    public PAGImageItem(int i, int i2, String str) {
        this(i, i2, str, 0.0f);
    }

    public PAGImageItem(int i, int i2, String str, float f) {
        this.f8580ri = i;
        this.f8579lr = i2;
        this.f8577ik = str;
        this.f8578ka = f;
    }

    public float getDuration() {
        return this.f8578ka;
    }

    public int getHeight() {
        return this.f8580ri;
    }

    public String getImageUrl() {
        return this.f8577ik;
    }

    public int getWidth() {
        return this.f8579lr;
    }
}
