package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.3x */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C45343x extends AbstractC5139E2 {
    public final /* synthetic */ C5123Dm A00;

    public C45343x(C5123Dm c5123Dm) {
        this.A00 = c5123Dm;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.AbstractC6143UN
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(C5140E3 c5140e3) {
        if ((this.A00.A03 && this.A00.A02) || !this.A00.A05 || !this.A00.A04) {
            return;
        }
        this.A00.A05 = false;
        if (!this.A00.A0G(EnumC6815fJ.A03) && !this.A00.A06) {
            if (!this.A00.A0G(EnumC6815fJ.A02)) {
                return;
            }
            this.A00.A03();
            this.A00.A06(true, true);
            return;
        }
        this.A00.A06 = false;
        this.A00.A07.postDelayed(new C5125Do(this), this.A00.A00);
    }
}
