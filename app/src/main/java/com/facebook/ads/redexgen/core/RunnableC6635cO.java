package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.cO */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class RunnableC6635cO implements Runnable {
    public final /* synthetic */ C5521KE A00;

    public RunnableC6635cO(C5521KE c5521ke) {
        this.A00 = c5521ke;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (AbstractC6271WU.A02(this)) {
            return;
        }
        try {
            if (this.A00.A0M) {
                this.A00.A0K();
            }
        } catch (Throwable th) {
            AbstractC6271WU.A00(th, this);
        }
    }
}
