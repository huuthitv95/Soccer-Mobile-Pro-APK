package com.facebook.ads.redexgen.core;

import android.text.TextUtils;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Fx */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C5257Fx extends AbstractC6846fo {
    public final /* synthetic */ C45674U A00;

    public C5257Fx(C45674U c45674u) {
        this.A00 = c45674u;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC6846fo
    public final void A03() {
        if (!this.A00.A04.A07()) {
            this.A00.setImpressionRecordingFlag(this.A00.A04);
            if (!TextUtils.isEmpty(this.A00.A08)) {
                this.A00.A0F.ABJ(this.A00.A08, new C6558b9().A03(this.A00.A07).A02(this.A00.A04).A04(this.A00.A0D.A0z()).A05());
                C5734Ng.A07(this.A00.A0D.A2A(), this.A00.A0E);
                this.A00.A0E.A0F().A3L();
                AbstractC5790Oa.A02(this.A00.A0D.A0y(), AbstractC6349Xm.A00(this.A00.A0D.A10()));
            }
        }
    }
}
