package com.bytedance.sdk.openadsdk.core.model;

import android.text.TextUtils;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.model.nr */
/* JADX INFO: loaded from: classes3.dex */
public class C3286nr {

    /* JADX INFO: renamed from: di */
    private String f11310di;

    /* JADX INFO: renamed from: fi */
    private boolean f11311fi;

    /* JADX INFO: renamed from: ik */
    private int f11312ik;

    /* JADX INFO: renamed from: ka */
    private double f11313ka;

    /* JADX INFO: renamed from: lr */
    private int f11314lr;

    /* JADX INFO: renamed from: ri */
    private String f11315ri;

    /* JADX INFO: renamed from: di */
    public boolean m14213di() {
        return this.f11311fi;
    }

    /* JADX INFO: renamed from: fi */
    public boolean m14214fi() {
        return !TextUtils.isEmpty(this.f11315ri) && this.f11314lr > 0 && this.f11312ik > 0;
    }

    /* JADX INFO: renamed from: ik */
    public int m14215ik() {
        return this.f11312ik;
    }

    /* JADX INFO: renamed from: ka */
    public double m14216ka() {
        return this.f11313ka;
    }

    /* JADX INFO: renamed from: lr */
    public int m14217lr() {
        return this.f11314lr;
    }

    /* JADX INFO: renamed from: lr */
    public void m14218lr(int i) {
        this.f11312ik = i;
    }

    /* JADX INFO: renamed from: lr */
    public void m14219lr(String str) {
        this.f11310di = str;
    }

    /* JADX INFO: renamed from: ri */
    public String m14220ri() {
        return this.f11315ri;
    }

    /* JADX INFO: renamed from: ri */
    public void m14221ri(int i) {
        this.f11314lr = i;
    }

    /* JADX INFO: renamed from: ri */
    public void m14222ri(String str) {
        this.f11315ri = str;
    }

    /* JADX INFO: renamed from: ri */
    public void m14223ri(boolean z) {
        this.f11311fi = z;
    }

    public String xha() {
        return this.f11310di;
    }
}
