package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Wr */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C6294Wr extends AbstractRunnableC6279Wc {
    public final /* synthetic */ C6289Wm A00;

    public C6294Wr(C6289Wm c6289Wm) {
        this.A00 = c6289Wm;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC6279Wc
    public final void A07() throws Exception {
        C6289Wm.A00(this.A00);
        if (this.A00.A01 > 0) {
            try {
                Thread.sleep(this.A00.A01);
            } catch (InterruptedException unused) {
            }
        }
        this.A00.A0B();
    }
}
