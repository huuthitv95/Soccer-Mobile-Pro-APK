package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ds */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class RunnableC6727ds implements Runnable {
    public final /* synthetic */ C5288GS A00;

    public RunnableC6727ds(C5288GS c5288gs) {
        this.A00 = c5288gs;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (AbstractC6271WU.A02(this)) {
            return;
        }
        try {
            this.A00.A00.A0H(EnumC6199VH.A0b);
        } catch (Throwable th) {
            AbstractC6271WU.A00(th, this);
        }
    }
}
