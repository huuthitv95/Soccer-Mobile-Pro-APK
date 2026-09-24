package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.gR */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class RunnableC6885gR implements Runnable {
    public final /* synthetic */ C5048CZ A00;

    public RunnableC6885gR(C5048CZ c5048cz) {
        this.A00 = c5048cz;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (AbstractC6271WU.A02(this)) {
            return;
        }
        try {
            C5048CZ.A03(this.A00);
            throw null;
        } catch (Throwable th) {
            AbstractC6271WU.A00(th, this);
        }
    }
}
