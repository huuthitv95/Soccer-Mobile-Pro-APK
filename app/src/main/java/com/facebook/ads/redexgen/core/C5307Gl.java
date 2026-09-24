package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Gl */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C5307Gl implements InterfaceC6399Ya {
    public final /* synthetic */ AbstractC5305Gj A00;

    public C5307Gl(AbstractC5305Gj abstractC5305Gj) {
        this.A00 = abstractC5305Gj;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6399Ya
    public final void ACl(AbstractC6400Yb abstractC6400Yb) {
        if (abstractC6400Yb.getToolbarActionMode() == 8) {
            this.A00.A0g();
            return;
        }
        this.A00.A07.A04(EnumC6199VH.A07, null);
        if (this.A00.A0l()) {
            return;
        }
        this.A00.A05.A0F().AB0();
        this.A00.A0A.A4j(this.A00.A0B.A7w());
    }
}
