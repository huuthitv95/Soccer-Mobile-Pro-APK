package com.facebook.ads.redexgen.core;

import java.util.Objects;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.mi */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C7253mi extends AbstractC5324H2 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7253mi(final C5341HJ c5341hj, int i, long j, long j2) {
        super(new InterfaceC5319Gx() { // from class: com.facebook.ads.redexgen.X.mk
            @Override // com.facebook.ads.redexgen.core.InterfaceC5319Gx
            public final long AKQ(long j3) {
                return c5341hj.A07(j3);
            }
        }, new C7254mj(c5341hj, i), c5341hj.A06(), 0L, c5341hj.A09, j, j2, c5341hj.A05(), Math.max(6, c5341hj.A06));
        Objects.requireNonNull(c5341hj);
    }
}
