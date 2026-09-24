package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.eX */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class RunnableC6767eX implements Runnable {
    public final /* synthetic */ C5223FO A00;

    public RunnableC6767eX(C5223FO c5223fo) {
        this.A00 = c5223fo;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (AbstractC6271WU.A02(this)) {
            return;
        }
        try {
            if (this.A00.A0B() != 0) {
                this.A00.A04.scrollBy(this.A00.A00, 0);
                this.A00.A03.postDelayed(this, 16L);
            }
        } catch (Throwable th) {
            AbstractC6271WU.A00(th, this);
        }
    }
}
