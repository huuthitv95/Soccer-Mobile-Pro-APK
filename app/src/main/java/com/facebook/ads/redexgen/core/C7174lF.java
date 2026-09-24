package com.facebook.ads.redexgen.core;

import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.lF */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C7174lF implements InterfaceC5577L8 {
    public C7472qI A00;
    public C460253 A01;
    public InterfaceC5361Hd A02;

    public C7174lF(String str) {
        this.A00 = new C44672p().A11(str).A14();
    }

    @EnsuresNonNull({"timestampAdjuster", "output"})
    private void A00() {
        AbstractC45353y.A02(this.A01);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5577L8
    public final void A5A(C45944v c45944v) {
        A00();
        long jA03 = this.A01.A03();
        long jA04 = this.A01.A04();
        if (jA03 == -9223372036854775807L || jA04 == -9223372036854775807L) {
            return;
        }
        if (jA04 != this.A00.A0M) {
            this.A00 = this.A00.A07().A0s(jA04).A14();
            this.A02.A6e(this.A00);
        }
        int iA07 = c45944v.A07();
        this.A02.AIr(c45944v, iA07);
        this.A02.AIu(jA03, 1, iA07, 0, null);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5577L8
    public final void AAA(C460253 c460253, InterfaceC5332HA interfaceC5332HA, C5585LG c5585lg) {
        this.A01 = c460253;
        c5585lg.A05();
        this.A02 = interfaceC5332HA.AKS(c5585lg.A03(), 5);
        this.A02.A6e(this.A00);
    }
}
