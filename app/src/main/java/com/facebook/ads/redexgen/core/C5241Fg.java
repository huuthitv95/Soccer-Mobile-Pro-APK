package com.facebook.ads.redexgen.core;

import android.text.TextUtils;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Fg */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C5241Fg extends AbstractC6846fo {
    public final /* synthetic */ C45664T A00;

    public C5241Fg(C45664T c45664t) {
        this.A00 = c45664t;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC6846fo
    public final void A03() {
        if (!this.A00.A0C.A07()) {
            this.A00.setImpressionRecordingFlag(this.A00.A0C);
            if (!TextUtils.isEmpty(this.A00.A0A)) {
                this.A00.A0F.ABJ(this.A00.A0A, new C6558b9().A03(this.A00.A09).A02(this.A00.A0C).A04(this.A00.A0D.A0z()).A05());
                C5734Ng.A07(this.A00.A0D.A2A(), this.A00.A0E);
                this.A00.A0E.A0F().A3L();
                AbstractC5790Oa.A02(this.A00.A03.A0y(), AbstractC6349Xm.A00(this.A00.A0D.A10()));
            }
        }
    }
}
