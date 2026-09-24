package com.bytedance.sdk.openadsdk.core.model;

import java.util.List;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.model.mj */
/* JADX INFO: loaded from: classes3.dex */
public class C3285mj {

    /* JADX INFO: renamed from: di */
    private int f11304di;

    /* JADX INFO: renamed from: fi */
    private List<String> f11305fi;

    /* JADX INFO: renamed from: ik */
    private List<Integer> f11306ik;

    /* JADX INFO: renamed from: ka */
    private int f11307ka;

    /* JADX INFO: renamed from: lr */
    private int f11308lr;

    /* JADX INFO: renamed from: ri */
    private int f11309ri;
    private int xha;

    /* JADX INFO: renamed from: di */
    public List<Integer> m14200di() {
        return this.f11306ik;
    }

    /* JADX INFO: renamed from: fi */
    public int m14201fi() {
        return this.f11308lr;
    }

    /* JADX INFO: renamed from: fi */
    public void m14202fi(int i) {
        this.f11307ka = i;
    }

    /* JADX INFO: renamed from: ik */
    public List<String> m14203ik() {
        return this.f11305fi;
    }

    /* JADX INFO: renamed from: ik */
    public void m14204ik(int i) {
        this.f11309ri = i;
    }

    /* JADX INFO: renamed from: ka */
    public int m14205ka() {
        return this.f11309ri;
    }

    /* JADX INFO: renamed from: ka */
    public void m14206ka(int i) {
        this.f11308lr = i;
    }

    /* JADX INFO: renamed from: lr */
    public int m14207lr() {
        int i = this.xha;
        if (i >= 2) {
            return i;
        }
        return 0;
    }

    /* JADX INFO: renamed from: lr */
    public void m14208lr(int i) {
        this.xha = i;
    }

    /* JADX INFO: renamed from: lr */
    public void m14209lr(List<Integer> list) {
        this.f11306ik = list;
    }

    /* JADX INFO: renamed from: ri */
    public void m14210ri(int i) {
        this.f11304di = i;
    }

    /* JADX INFO: renamed from: ri */
    public void m14211ri(List<String> list) {
        this.f11305fi = list;
    }

    /* JADX INFO: renamed from: ri */
    public boolean m14212ri() {
        return this.f11304di == 1;
    }

    public int xha() {
        return this.f11307ka;
    }
}
