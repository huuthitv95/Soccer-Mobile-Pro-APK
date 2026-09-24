package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.3c */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C45143c extends AbstractC5130Dt {
    public final /* synthetic */ C5118Dh A00;

    public C45143c(C5118Dh c5118Dh) {
        this.A00 = c5118Dh;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.AbstractC6143UN
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(C5131Du c5131Du) {
        if (this.A00.A01 == null || c5131Du.A00().getAction() != 0) {
            return;
        }
        this.A00.A04.removeCallbacksAndMessages(null);
        this.A00.A07(new C6803f7(this));
    }
}
