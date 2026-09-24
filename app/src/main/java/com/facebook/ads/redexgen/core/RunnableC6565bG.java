package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bG */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class RunnableC6565bG implements Runnable {
    public final /* synthetic */ AbstractC5589LK A00;

    public RunnableC6565bG(AbstractC5589LK abstractC5589LK) {
        this.A00 = abstractC5589LK;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (AbstractC6271WU.A02(this)) {
            return;
        }
        try {
            if (this.A00.A0I.getVisibility() == 0) {
                this.A00.A0t(8);
            }
        } catch (Throwable th) {
            AbstractC6271WU.A00(th, this);
        }
    }
}
