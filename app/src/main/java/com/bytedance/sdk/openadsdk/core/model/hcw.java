package com.bytedance.sdk.openadsdk.core.model;

import com.bytedance.sdk.openadsdk.utils.C3582pv;

/* JADX INFO: loaded from: classes3.dex */
public class hcw {

    /* JADX INFO: renamed from: aw */
    private int f11263aw;

    /* JADX INFO: renamed from: co */
    private long f11264co;

    /* JADX INFO: renamed from: di */
    private long f11265di;

    /* JADX INFO: renamed from: fi */
    private long f11266fi;
    private long jbs;

    /* JADX INFO: renamed from: lr */
    public long f11269lr;

    /* JADX INFO: renamed from: mj */
    private long f11270mj;

    /* JADX INFO: renamed from: qt */
    private long f11271qt;

    /* JADX INFO: renamed from: ri */
    public boolean f11272ri;

    /* JADX INFO: renamed from: sf */
    private int f11273sf;
    private long xha;

    /* JADX INFO: renamed from: ik */
    private C3582pv f11267ik = C3582pv.m16566ik();

    /* JADX INFO: renamed from: ka */
    private C3582pv f11268ka = C3582pv.m16566ik();

    /* JADX INFO: renamed from: di */
    public long m14147di() {
        return this.jbs;
    }

    /* JADX INFO: renamed from: fi */
    public long m14148fi() {
        return this.f11270mj;
    }

    /* JADX INFO: renamed from: ik */
    public long m14149ik() {
        return this.f11265di;
    }

    public long jbs() {
        return this.f11264co;
    }

    /* JADX INFO: renamed from: ka */
    public long m14150ka() {
        return this.xha;
    }

    /* JADX INFO: renamed from: lr */
    public long m14151lr() {
        return this.f11266fi;
    }

    /* JADX INFO: renamed from: lr */
    public synchronized void m14152lr(int i) {
        this.f11263aw = i;
    }

    /* JADX INFO: renamed from: lr */
    public void m14153lr(long j) {
        this.f11264co = j;
    }

    /* JADX INFO: renamed from: lr */
    public void m14154lr(C3582pv c3582pv) {
        this.f11268ka = c3582pv;
        this.jbs = c3582pv.m16572ri(this.f11267ik);
    }

    /* JADX INFO: renamed from: mj */
    public int m14155mj() {
        return this.f11273sf;
    }

    /* JADX INFO: renamed from: qt */
    public synchronized int m14156qt() {
        return this.f11263aw;
    }

    /* JADX INFO: renamed from: ri */
    public C3582pv m14157ri() {
        return this.f11267ik;
    }

    /* JADX INFO: renamed from: ri */
    public void m14158ri(int i) {
        this.f11273sf = i;
    }

    /* JADX INFO: renamed from: ri */
    public void m14159ri(long j) {
        this.f11271qt = j;
    }

    /* JADX INFO: renamed from: ri */
    public void m14160ri(C3582pv c3582pv) {
        this.f11267ik = c3582pv;
    }

    /* JADX INFO: renamed from: ri */
    public void m14161ri(C3582pv c3582pv, C3582pv c3582pv2, int i, C3582pv c3582pv3) {
        this.f11266fi = c3582pv.m16572ri(this.f11267ik);
        this.f11265di = c3582pv2.m16572ri(c3582pv);
        this.xha = i;
        this.f11270mj = c3582pv3.m16572ri(c3582pv2);
    }

    public long xha() {
        return this.f11271qt;
    }
}
