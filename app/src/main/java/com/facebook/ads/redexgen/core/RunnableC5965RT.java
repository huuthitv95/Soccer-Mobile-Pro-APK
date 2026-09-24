package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.RT */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class RunnableC5965RT implements Runnable {
    public final /* synthetic */ C5966RU A00;

    public RunnableC5965RT(C5966RU c5966ru) {
        this.A00 = c5966ru;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (AbstractC6271WU.A02(this)) {
            return;
        }
        try {
            this.A00.A05 = 0L;
            this.A00.A06 = false;
        } catch (Throwable th) {
            AbstractC6271WU.A00(th, this);
        }
    }
}
