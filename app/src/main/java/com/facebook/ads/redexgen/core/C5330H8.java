package com.facebook.ads.redexgen.core;

import android.text.TextUtils;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.H8 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C5330H8 extends AbstractC6846fo {
    public final /* synthetic */ AbstractC5305Gj A00;

    public C5330H8(AbstractC5305Gj abstractC5305Gj) {
        this.A00 = abstractC5305Gj;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC6846fo
    public final void A03() {
        if (!this.A00.A08.A07()) {
            this.A00.A08.A05();
            if (!TextUtils.isEmpty(this.A00.A03.A2E())) {
                this.A00.A06.ABJ(this.A00.A03.A2E(), new C6558b9().A03(this.A00.A0C).A02(this.A00.A08).A04(this.A00.A03.A0z()).A05());
                if (this.A00.A03.A1u()) {
                    this.A00.A05.A0F().AEW();
                }
                C6288Wl.A00(this.A00.A05).A0E(this.A00.A0B.A8l(), this.A00.A03.A2E());
                C5734Ng.A07(this.A00.A03.A2A(), this.A00.A05);
                this.A00.A05.A0F().A3L();
                AbstractC5790Oa.A02(this.A00.A03.A0y(), AbstractC6349Xm.A00(this.A00.A03.A10()));
                this.A00.A0A.A4j(this.A00.A0B.A8G());
            }
        }
    }
}
