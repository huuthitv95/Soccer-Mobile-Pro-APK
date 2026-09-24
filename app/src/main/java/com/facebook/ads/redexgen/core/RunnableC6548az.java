package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.az */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class RunnableC6548az implements Runnable {
    public final /* synthetic */ C6549b0 A00;
    public final /* synthetic */ InterfaceC6550b1 A01;

    public RunnableC6548az(C6549b0 c6549b0, InterfaceC6550b1 interfaceC6550b1) {
        this.A00 = c6549b0;
        this.A01 = interfaceC6550b1;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (AbstractC6271WU.A02(this)) {
            return;
        }
        try {
            this.A01.ACz();
        } catch (Throwable th) {
            AbstractC6271WU.A00(th, this);
        }
    }
}
