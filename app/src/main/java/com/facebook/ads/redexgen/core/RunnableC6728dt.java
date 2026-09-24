package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.dt */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class RunnableC6728dt implements Runnable {
    public final /* synthetic */ C45684V A00;

    public RunnableC6728dt(C45684V c45684v) {
        this.A00 = c45684v;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (AbstractC6271WU.A02(this)) {
            return;
        }
        try {
            ((AbstractC5305Gj) this.A00).A0A.A4j(((AbstractC5305Gj) this.A00).A0B.A7w());
        } catch (Throwable th) {
            AbstractC6271WU.A00(th, this);
        }
    }
}
