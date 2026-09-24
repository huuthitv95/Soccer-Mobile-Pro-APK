package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.GE */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C5274GE implements InterfaceC6732dx {
    public final /* synthetic */ C45684V A00;

    public C5274GE(C45684V c45684v) {
        this.A00 = c45684v;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6732dx
    public final void A9l() {
        if (this.A00.A02 instanceof C46786H) {
            ((C46786H) this.A00.A02).A1X();
            C6200VI.A02(EnumC6199VH.A0e, null, ((AbstractC5305Gj) this.A00).A03.A2E(), ((AbstractC5305Gj) this.A00).A05.A0A());
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6732dx
    public final void AJz() {
        if (this.A00.A02 instanceof C46786H) {
            ((C46786H) this.A00.A02).A1b(this.A00.A0N);
            C6200VI.A02(EnumC6199VH.A0e, null, ((AbstractC5305Gj) this.A00).A03.A2E(), ((AbstractC5305Gj) this.A00).A05.A0A());
        }
        this.A00.A0n();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6732dx
    public final void AKE() {
        this.A00.A0e();
        if (this.A00.A02 instanceof C46786H) {
            ((C46786H) this.A00.A02).getAdDetailsView().setVisibility(8);
        }
    }
}
