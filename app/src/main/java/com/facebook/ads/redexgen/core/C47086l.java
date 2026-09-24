package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.6l */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C47086l implements Comparable<C47086l> {
    public int A00;
    public long A01;
    public Object A02;
    public final C47627d A03;

    public C47086l(C47627d c47627d) {
        this.A03 = c47627d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C47086l c47086l) {
        if ((this.A02 == null) != (c47086l.A02 == null)) {
            return this.A02 != null ? -1 : 1;
        }
        if (this.A02 == null) {
            return 0;
        }
        int i = this.A00 - c47086l.A00;
        if (i != 0) {
            return i;
        }
        int comparePeriodIndex = AbstractC46115C.A08(this.A01, c47086l.A01);
        return comparePeriodIndex;
    }

    public final void A01(int i, long j, Object obj) {
        this.A00 = i;
        this.A01 = j;
        this.A02 = obj;
    }
}
