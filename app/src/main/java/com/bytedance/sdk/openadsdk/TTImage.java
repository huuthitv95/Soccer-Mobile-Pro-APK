package com.bytedance.sdk.openadsdk;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/* JADX INFO: loaded from: classes3.dex */
public class TTImage {

    /* JADX INFO: renamed from: ik */
    private final String f7920ik;

    /* JADX INFO: renamed from: ka */
    private double f7921ka;

    /* JADX INFO: renamed from: lr */
    private final int f7922lr;

    /* JADX INFO: renamed from: ri */
    private final int f7923ri;

    public TTImage(int i, int i2, String str) {
        this(i, i2, str, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
    }

    public TTImage(int i, int i2, String str, double d) {
        this.f7923ri = i;
        this.f7922lr = i2;
        this.f7920ik = str;
        this.f7921ka = d;
    }

    public double getDuration() {
        return this.f7921ka;
    }

    public int getHeight() {
        return this.f7923ri;
    }

    public String getImageUrl() {
        return this.f7920ik;
    }

    public int getWidth() {
        return this.f7922lr;
    }

    public boolean isValid() {
        String str;
        return this.f7923ri > 0 && this.f7922lr > 0 && (str = this.f7920ik) != null && str.length() > 0;
    }
}
