package com.facebook.ads.redexgen.core;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.n6 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C7276n6 implements InterfaceExecutorC5236Fb {
    public final /* synthetic */ InterfaceC454649 A00;
    public final /* synthetic */ Executor A01;

    public C7276n6(Executor executor, InterfaceC454649 interfaceC454649) {
        this.A01 = executor;
        this.A00 = interfaceC454649;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceExecutorC5236Fb
    public final void AHb() {
        this.A00.A39(this.A01);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.A01.execute(runnable);
    }
}
