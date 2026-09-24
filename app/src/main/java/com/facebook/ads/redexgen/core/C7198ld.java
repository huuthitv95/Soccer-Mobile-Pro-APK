package com.facebook.ads.redexgen.core;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ld */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C7198ld implements InterfaceC5490Jj {
    public final long[] A00;
    public final C7422pT[] A01;

    public C7198ld(C7422pT[] c7422pTArr, long[] jArr) {
        this.A01 = c7422pTArr;
        this.A00 = jArr;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5490Jj
    public final List<C7422pT> A7X(long j) {
        int iA0L = AbstractC46115C.A0L(this.A00, j, true, false);
        if (iA0L == -1 || this.A01[iA0L] == C7422pT.A0J) {
            return Collections.emptyList();
        }
        return Collections.singletonList(this.A01[iA0L]);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5490Jj
    public final long A83(int i) {
        boolean z = true;
        AbstractC45353y.A07(i >= 0);
        if (i >= this.A00.length) {
            z = false;
        }
        AbstractC45353y.A07(z);
        return this.A00[i];
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5490Jj
    public final int A84() {
        return this.A00.length;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5490Jj
    public final int A8a(long j) {
        int iA0K = AbstractC46115C.A0K(this.A00, j, false, false);
        int index = this.A00.length;
        if (iA0K < index) {
            return iA0K;
        }
        return -1;
    }
}
