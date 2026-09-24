package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.dO */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class RunnableC6697dO implements Runnable {
    public final /* synthetic */ C46275S A00;

    public RunnableC6697dO(C46275S c46275s) {
        this.A00 = c46275s;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (AbstractC6271WU.A02(this)) {
            return;
        }
        try {
            this.A00.A08 = true;
            this.A00.A0P.AFw(true);
        } catch (Throwable th) {
            AbstractC6271WU.A00(th, this);
        }
    }
}
