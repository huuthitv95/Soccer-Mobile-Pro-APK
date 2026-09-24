package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.cj */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class RunnableC6656cj implements Runnable {
    public final /* synthetic */ C5489Ji A00;

    public RunnableC6656cj(C5489Ji c5489Ji) {
        this.A00 = c5489Ji;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (AbstractC6271WU.A02(this)) {
            return;
        }
        try {
            this.A00.A0C = true;
            if (this.A00.A0b.A0D() != null) {
                this.A00.A0b.A0D().AFw(true);
            }
        } catch (Throwable th) {
            AbstractC6271WU.A00(th, this);
        }
    }
}
