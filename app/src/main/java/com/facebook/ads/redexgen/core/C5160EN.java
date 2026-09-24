package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.EN */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C5160EN extends AbstractC6143UN<C5140E3> {
    public final /* synthetic */ C45584L A00;

    public C5160EN(C45584L c45584l) {
        this.A00 = c45584l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.AbstractC6143UN
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(C5140E3 c5140e3) {
        if (!this.A00.A02) {
            this.A00.A02 = true;
        } else {
            this.A00.A0d();
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC6143UN
    public final Class<C5140E3> A01() {
        return C5140E3.class;
    }
}
