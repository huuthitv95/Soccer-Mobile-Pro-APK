package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.dc */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class RunnableC6711dc implements Runnable {
    public final /* synthetic */ C460455 A00;

    public RunnableC6711dc(C460455 c460455) {
        this.A00 = c460455;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (AbstractC6271WU.A02(this)) {
            return;
        }
        try {
            if (this.A00.A07 != null && this.A00.getResources().getConfiguration().orientation == 1) {
                this.A00.A07.A0A();
            }
        } catch (Throwable th) {
            AbstractC6271WU.A00(th, this);
        }
    }
}
