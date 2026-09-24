package com.facebook.ads.redexgen.core;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.nT */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C7299nT implements InterfaceC5490Jj {
    public final long A00;
    public final AbstractC4978BP<C7422pT> A01;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BP != com.google.common.collect.ImmutableList<com.facebook.ads.androidx.media3.common.text.Cue> */
    public C7299nT(long j, AbstractC4978BP<C7422pT> abstractC4978BP) {
        this.A00 = j;
        this.A01 = abstractC4978BP;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5490Jj
    public final List<C7422pT> A7X(long j) {
        return j >= this.A00 ? this.A01 : Collections.emptyList();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5490Jj
    public final long A83(int i) {
        AbstractC45353y.A07(i == 0);
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5490Jj
    public final int A84() {
        return 1;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5490Jj
    public final int A8a(long j) {
        return this.A00 > j ? 0 : -1;
    }
}
