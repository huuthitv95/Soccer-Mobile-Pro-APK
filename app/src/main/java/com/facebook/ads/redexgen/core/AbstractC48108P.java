package com.facebook.ads.redexgen.core;

import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.8P */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC48108P extends AbstractC7392oz implements InterfaceC5490Jj {
    public long A00;
    public InterfaceC5490Jj A01;

    @Override // com.facebook.ads.redexgen.core.AbstractC7392oz
    public abstract void A0B();

    @Override // com.facebook.ads.redexgen.core.AbstractC46555u
    public final void A0A() {
        super.A0A();
        this.A01 = null;
    }

    public final void A0C(long j, InterfaceC5490Jj interfaceC5490Jj, long j2) {
        super.A01 = j;
        this.A01 = interfaceC5490Jj;
        if (j2 == Long.MAX_VALUE) {
            j2 = super.A01;
        }
        this.A00 = j2;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5490Jj
    public final List<C7422pT> A7X(long j) {
        return ((InterfaceC5490Jj) AbstractC45353y.A01(this.A01)).A7X(j - this.A00);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5490Jj
    public final long A83(int i) {
        return ((InterfaceC5490Jj) AbstractC45353y.A01(this.A01)).A83(i) + this.A00;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5490Jj
    public final int A84() {
        return ((InterfaceC5490Jj) AbstractC45353y.A01(this.A01)).A84();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5490Jj
    public final int A8a(long j) {
        return ((InterfaceC5490Jj) AbstractC45353y.A01(this.A01)).A8a(j - this.A00);
    }
}
