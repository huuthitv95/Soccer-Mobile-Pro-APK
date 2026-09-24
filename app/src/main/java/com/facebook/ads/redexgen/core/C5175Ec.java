package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ec */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C5175Ec implements Comparable<C5175Ec> {
    public final boolean A00;
    public final boolean A01;

    public C5175Ec(C7472qI c7472qI, int i) {
        this.A00 = (c7472qI.A0H & 1) != 0;
        this.A01 = C48739h.A0S(i, false);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C5175Ec c5175Ec) {
        return AbstractC7324ns.A01().A09(this.A01, c5175Ec.A01).A09(this.A00, c5175Ec.A00).A05();
    }
}
