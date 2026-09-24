package com.bytedance.sdk.component.p160lr.p161ri;

/* JADX INFO: renamed from: com.bytedance.sdk.component.lr.ri.di */
/* JADX INFO: loaded from: classes3.dex */
public final class C2647di {

    /* JADX INFO: renamed from: ri */
    private final String[] f7540ri;

    public C2647di(String[] strArr) {
        this.f7540ri = strArr;
    }

    /* JADX INFO: renamed from: lr */
    public String m9909lr(int i) {
        return this.f7540ri[(i * 2) + 1];
    }

    /* JADX INFO: renamed from: ri */
    public int m9910ri() {
        return this.f7540ri.length / 2;
    }

    /* JADX INFO: renamed from: ri */
    public String m9911ri(int i) {
        return this.f7540ri[i * 2];
    }
}
