package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.fY */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class RunnableC6830fY implements Runnable {
    public final /* synthetic */ C6833fb A00;

    public RunnableC6830fY(C6833fb c6833fb) {
        this.A00 = c6833fb;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (AbstractC6271WU.A02(this)) {
            return;
        }
        try {
            this.A00.A0A();
            this.A00.A01.removeCallbacks(this);
            this.A00.A01.postDelayed(this, 250L);
        } catch (Throwable th) {
            AbstractC6271WU.A00(th, this);
        }
    }
}
