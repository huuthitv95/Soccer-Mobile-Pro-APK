package com.facebook.ads.redexgen.core;

import com.facebook.ads.AdError;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.7y */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C47837y extends AbstractC7044j4 {
    public final /* synthetic */ C47817w A00;
    public final /* synthetic */ AbstractC7081jh A01;
    public final /* synthetic */ C47707l A02;
    public final /* synthetic */ boolean A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C47837y(C47817w c47817w, boolean z, boolean z2, C47707l c47707l, AbstractC7081jh abstractC7081jh) {
        super(z);
        this.A00 = c47817w;
        this.A03 = z2;
        this.A02 = c47707l;
        this.A01 = abstractC7081jh;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC7044j4
    public final void A00() {
        this.A00.A01.AFp(this.A01, AdError.CACHE_ERROR);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC7044j4
    public final void A01(boolean z) {
        if (!C6171Up.A1t(this.A00.A04) || !this.A03) {
            if (this.A00.A05 == EnumC6262WK.A0J) {
                this.A00.A04.A0F().AER();
            }
            this.A00.A0C.set(true);
            this.A00.A01.AFm(this.A01);
            return;
        }
        this.A00.A06 = AbstractC6686dD.A01(this.A00.A04, this.A02, 0, new C7090jq(this));
    }
}
