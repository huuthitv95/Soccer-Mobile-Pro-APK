package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Dk */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C5121Dk extends AbstractC6143UN<C45474A> {
    public final /* synthetic */ C5120Dj A00;

    public C5121Dk(C5120Dj c5120Dj) {
        this.A00 = c5120Dj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.AbstractC6143UN
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(C45474A c45474a) {
        if (this.A00.A00 == null) {
            return;
        }
        this.A00.setText(this.A00.A02(this.A00.A00.getDuration() - this.A00.A00.getCurrentPositionInMillis()));
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC6143UN
    public final Class<C45474A> A01() {
        return C45474A.class;
    }
}
