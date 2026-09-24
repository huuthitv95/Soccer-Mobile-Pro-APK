package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.dg */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class RunnableC6715dg implements Runnable {
    public final /* synthetic */ C460455 A00;

    public RunnableC6715dg(C460455 c460455) {
        this.A00 = c460455;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (AbstractC6271WU.A02(this)) {
            return;
        }
        try {
            this.A00.A0B = true;
            this.A00.A0Z.AFw(true);
        } catch (Throwable th) {
            AbstractC6271WU.A00(th, this);
        }
    }
}
