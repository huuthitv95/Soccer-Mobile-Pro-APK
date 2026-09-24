package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bI */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class RunnableC6567bI implements Runnable {
    public final /* synthetic */ AbstractC5589LK A00;

    public RunnableC6567bI(AbstractC5589LK abstractC5589LK) {
        this.A00 = abstractC5589LK;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (AbstractC6271WU.A02(this)) {
            return;
        }
        try {
            this.A00.A0r();
            this.A00.A0v(1000L);
        } catch (Throwable th) {
            AbstractC6271WU.A00(th, this);
        }
    }
}
