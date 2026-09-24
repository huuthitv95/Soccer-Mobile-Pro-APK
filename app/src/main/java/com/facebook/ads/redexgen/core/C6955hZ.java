package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.hZ */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C6955hZ extends AbstractC5943R7 {
    public boolean A00 = false;
    public final /* synthetic */ AbstractC6950hU A01;

    public C6955hZ(AbstractC6950hU abstractC6950hU) {
        this.A01 = abstractC6950hU;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC5943R7
    public final void A0L(C47457M c47457m, int i) {
        super.A0L(c47457m, i);
        if (i == 0 && this.A00) {
            this.A00 = false;
            this.A01.A0F();
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC5943R7
    public final void A0M(C47457M c47457m, int i, int i2) {
        if (i != 0 || i2 != 0) {
            this.A00 = true;
        }
    }
}
