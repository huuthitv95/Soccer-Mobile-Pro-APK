package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.EH */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C5154EH extends AbstractC5793Od {
    public final /* synthetic */ C5152EF A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5154EH(C5152EF c5152ef, double d, double d2, double d3, boolean z) {
        super(d, d2, d3, z);
        this.A00 = c5152ef;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC5793Od
    public final void A00(boolean z, boolean z2, C5795Of c5795Of) {
        if ((!C6171Up.A0z(this.A00.A0D) || !this.A00.A09) && z2) {
            this.A00.A09 = true;
            this.A00.A0R(this.A00.A0J, this.A00.A0J(EnumC6780ek.A03));
        }
    }
}
