package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bx */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class RunnableC6608bx implements Runnable {
    public final /* synthetic */ C5545Kc A00;

    public RunnableC6608bx(C5545Kc c5545Kc) {
        this.A00 = c5545Kc;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (AbstractC6271WU.A02(this)) {
            return;
        }
        try {
            this.A00.A03 = true;
            if (((AbstractC6614c3) this.A00).A07.A0D() != null) {
                ((AbstractC6614c3) this.A00).A07.A0D().AFw(true);
            }
        } catch (Throwable th) {
            AbstractC6271WU.A00(th, this);
        }
    }
}
