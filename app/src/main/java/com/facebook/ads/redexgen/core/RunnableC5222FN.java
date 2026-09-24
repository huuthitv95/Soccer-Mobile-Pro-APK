package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.FN */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class RunnableC5222FN implements Runnable {
    public final InterfaceC5221FM A00;

    public RunnableC5222FN(InterfaceC5221FM interfaceC5221FM) {
        this.A00 = interfaceC5221FM;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (AbstractC6271WU.A02(this)) {
            return;
        }
        try {
            this.A00.AEj();
        } catch (Throwable th) {
            AbstractC6271WU.A00(th, this);
        }
    }
}
