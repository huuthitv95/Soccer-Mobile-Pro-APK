package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Jt */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C5500Jt implements InterfaceC6579bU {
    public final /* synthetic */ C5489Ji A00;

    public C5500Jt(C5489Ji c5489Ji) {
        this.A00 = c5489Ji;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6579bU
    public final void ADY() {
        this.A00.A0Y.A04(EnumC6199VH.A0J, null);
        if (this.A00.A0W != null) {
            this.A00.A0m(((C479085) this.A00.A0W).A0M().toString());
        }
        if (this.A00.A0b.A0D() != null) {
            this.A00.A0b.A0D().ACQ();
        }
        if (this.A00.A09 != null) {
            this.A00.A09.A0B();
            this.A00.A09 = null;
        }
        this.A00.A0q(true);
    }
}
