package com.bytedance.sdk.component.p130di.p131ri.p135ka.p136lr;

/* JADX INFO: renamed from: com.bytedance.sdk.component.di.ri.ka.lr.ri */
/* JADX INFO: loaded from: classes3.dex */
public class C2551ri {

    /* JADX INFO: renamed from: lr */
    private int f7068lr;

    /* JADX INFO: renamed from: ri */
    private int f7069ri;

    C2551ri(int i, int i2, long j) {
        if (i2 < i) {
            throw new IllegalStateException("atMostBatchSendCount should meet a condition (atMostBatchSendCount >= maxCacheCount)");
        }
        this.f7069ri = i;
        this.f7068lr = i2;
    }

    /* JADX INFO: renamed from: fi */
    public static C2551ri m9294fi() {
        return new C2551ri(3, 100, 172800000L);
    }

    /* JADX INFO: renamed from: ik */
    public static C2551ri m9295ik() {
        return new C2551ri(1, 100, 172800000L);
    }

    /* JADX INFO: renamed from: ka */
    public static C2551ri m9296ka() {
        return new C2551ri(1, 100, -1L);
    }

    /* JADX INFO: renamed from: lr */
    public int m9297lr() {
        return this.f7068lr;
    }

    /* JADX INFO: renamed from: ri */
    public int m9298ri() {
        return this.f7069ri;
    }
}
