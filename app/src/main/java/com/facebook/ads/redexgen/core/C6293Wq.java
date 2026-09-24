package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Wq */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C6293Wq extends AbstractRunnableC6279Wc {
    public final /* synthetic */ C6289Wm A00;

    public C6293Wq(C6289Wm c6289Wm) {
        this.A00 = c6289Wm;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC6279Wc
    public final void A07() {
        this.A00.A0C = false;
        if (this.A00.A0B.getQueue().isEmpty()) {
            this.A00.A0B.execute(this.A00.A0A);
        }
    }
}
