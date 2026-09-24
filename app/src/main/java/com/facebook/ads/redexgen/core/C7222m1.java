package com.facebook.ads.redexgen.core;

import androidx.work.WorkRequest;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.m1 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C7222m1 implements InterfaceC5356HY {
    public final /* synthetic */ C7221m0 A00;

    public C7222m1(C7221m0 c7221m0) {
        this.A00 = c7221m0;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5356HY
    public final long A7t() {
        return this.A00.A0B.A05(this.A00.A07);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5356HY
    public final C5355HX A91(long j) {
        long jA06 = this.A00.A0B.A06(j);
        long j2 = this.A00.A09;
        long j3 = this.A00.A08;
        long targetGranule = this.A00.A09;
        long j4 = (j3 - targetGranule) * jA06;
        long targetGranule2 = this.A00.A07;
        long estimatedPosition = AbstractC46115C.A0T((j2 + (j4 / targetGranule2)) - WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, this.A00.A09, this.A00.A08 - 1);
        return new C5355HX(new C5357HZ(j, estimatedPosition));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5356HY
    public final boolean AAj() {
        return true;
    }
}
