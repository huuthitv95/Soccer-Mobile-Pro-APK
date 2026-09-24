package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ch */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class RunnableC6654ch implements Runnable {
    public final /* synthetic */ C5489Ji A00;

    public RunnableC6654ch(C5489Ji c5489Ji) {
        this.A00 = c5489Ji;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (AbstractC6271WU.A02(this)) {
            return;
        }
        try {
            if (this.A00.A09 != null && this.A00.getResources().getConfiguration().orientation == 1) {
                this.A00.A09.A0A();
            }
        } catch (Throwable th) {
            AbstractC6271WU.A00(th, this);
        }
    }
}
