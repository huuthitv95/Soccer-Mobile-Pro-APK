package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Cj */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C5058Cj implements InterfaceC6889gV {
    @Override // com.facebook.ads.redexgen.core.InterfaceC6889gV
    public final long A5m() {
        return System.nanoTime();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6889gV
    public final void AK4(Object obj, long j) throws InterruptedException {
        obj.wait(j);
    }
}
