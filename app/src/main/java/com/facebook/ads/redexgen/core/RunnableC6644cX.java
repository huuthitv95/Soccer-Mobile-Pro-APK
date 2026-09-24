package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.cX */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class RunnableC6644cX implements Runnable {
    public final /* synthetic */ C5518KB A00;

    public RunnableC6644cX(C5518KB c5518kb) {
        this.A00 = c5518kb;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (AbstractC6271WU.A02(this)) {
            return;
        }
        try {
            if (this.A00.A03 != null && this.A00.A03.getVisibility() == 0) {
                this.A00.A0T(8);
            }
        } catch (Throwable th) {
            AbstractC6271WU.A00(th, this);
        }
    }
}
