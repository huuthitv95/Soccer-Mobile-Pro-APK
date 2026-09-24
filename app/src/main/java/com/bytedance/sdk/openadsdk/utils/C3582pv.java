package com.bytedance.sdk.openadsdk.utils;

import android.os.SystemClock;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.utils.pv */
/* JADX INFO: loaded from: classes3.dex */
public class C3582pv {

    /* JADX INFO: renamed from: lr */
    private long f13203lr;

    /* JADX INFO: renamed from: ri */
    public long f13204ri;

    private C3582pv(boolean z) {
        if (z) {
            m16569fi();
        }
    }

    /* JADX INFO: renamed from: ik */
    public static C3582pv m16566ik() {
        return new C3582pv(false);
    }

    /* JADX INFO: renamed from: lr */
    public static C3582pv m16567lr() {
        return new C3582pv(true);
    }

    /* JADX INFO: renamed from: di */
    public boolean m16568di() {
        return this.f13203lr > 0;
    }

    /* JADX INFO: renamed from: fi */
    public void m16569fi() {
        this.f13204ri = System.currentTimeMillis();
        this.f13203lr = SystemClock.elapsedRealtime();
    }

    /* JADX INFO: renamed from: ka */
    public long m16570ka() {
        return SystemClock.elapsedRealtime() - this.f13203lr;
    }

    /* JADX INFO: renamed from: ri */
    public long m16571ri() {
        return this.f13203lr;
    }

    /* JADX INFO: renamed from: ri */
    public long m16572ri(C3582pv c3582pv) {
        return Math.abs(c3582pv.f13203lr - this.f13203lr);
    }

    public String toString() {
        return String.valueOf(this.f13204ri);
    }
}
