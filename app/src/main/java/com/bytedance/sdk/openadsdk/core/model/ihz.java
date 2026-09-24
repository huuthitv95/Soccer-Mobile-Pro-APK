package com.bytedance.sdk.openadsdk.core.model;

/* JADX INFO: loaded from: classes3.dex */
public class ihz {

    /* JADX INFO: renamed from: ri */
    private long f11289ri = 10000;

    /* JADX INFO: renamed from: lr */
    private long f11288lr = 10000;

    /* JADX INFO: renamed from: ik */
    private long f11286ik = 10;

    /* JADX INFO: renamed from: ka */
    private long f11287ka = 20;

    /* JADX INFO: renamed from: fi */
    private String f11285fi = "";

    /* JADX INFO: renamed from: fi */
    public String m14162fi() {
        return this.f11285fi;
    }

    /* JADX INFO: renamed from: ik */
    public long m14163ik() {
        return this.f11286ik;
    }

    /* JADX INFO: renamed from: ik */
    public void m14164ik(long j) {
        if (j <= 0) {
            this.f11286ik = 10L;
        } else {
            this.f11286ik = j;
        }
    }

    /* JADX INFO: renamed from: ka */
    public long m14165ka() {
        return this.f11287ka;
    }

    /* JADX INFO: renamed from: ka */
    public void m14166ka(long j) {
        if (j < 0) {
            this.f11287ka = 20L;
        } else {
            this.f11287ka = j;
        }
    }

    /* JADX INFO: renamed from: lr */
    public long m14167lr() {
        return this.f11288lr;
    }

    /* JADX INFO: renamed from: lr */
    public void m14168lr(long j) {
        if (j < 0) {
            this.f11288lr = 20L;
        } else {
            this.f11288lr = j;
        }
    }

    /* JADX INFO: renamed from: ri */
    public long m14169ri() {
        return this.f11289ri;
    }

    /* JADX INFO: renamed from: ri */
    public void m14170ri(long j) {
        if (j <= 0) {
            this.f11289ri = 10L;
        } else {
            this.f11289ri = j;
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m14171ri(String str) {
        this.f11285fi = str;
    }
}
