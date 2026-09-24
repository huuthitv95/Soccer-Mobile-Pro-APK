package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.f4 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C6800f4 extends AbstractRunnableC6279Wc {
    public final /* synthetic */ C6898ge A00;

    public C6800f4(C6898ge c6898ge) {
        this.A00 = c6898ge;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC6279Wc
    public final void A07() {
        for (C6093TY c6093ty : C6092TX.A02()) {
            C6092TX.A0A(this.A00, c6093ty.A02(), c6093ty.A00(), c6093ty.A01(), false);
        }
        C6092TX.A02().clear();
    }
}
