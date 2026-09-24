package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Kk */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C5553Kk implements Comparable<C5553Kk> {
    public final int A00;
    public final C5544Kb A01;

    public C5553Kk(int i, C5544Kb c5544Kb) {
        this.A00 = i;
        this.A01 = c5544Kb;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C5553Kk c5553Kk) {
        return Integer.compare(this.A00, c5553Kk.A00);
    }
}
