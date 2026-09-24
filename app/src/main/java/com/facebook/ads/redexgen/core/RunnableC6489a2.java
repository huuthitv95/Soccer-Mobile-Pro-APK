package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.a2 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class RunnableC6489a2 implements Runnable {
    public final /* synthetic */ C6491a4 A00;

    public RunnableC6489a2(C6491a4 c6491a4) {
        this.A00 = c6491a4;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (AbstractC6271WU.A02(this)) {
            return;
        }
        try {
            if (this.A00.A02.getVisibility() == 0) {
                this.A00.A07(8);
            }
        } catch (Throwable th) {
            AbstractC6271WU.A00(th, this);
        }
    }
}
