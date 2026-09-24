package com.facebook.ads.redexgen.core;

import com.facebook.ads.AdError;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.jD */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C7053jD implements InterfaceC6048Sp {
    public final /* synthetic */ AbstractC7077jd A00;
    public final /* synthetic */ InterfaceC5747Nt A01;
    public final /* synthetic */ C5748Nu A02;
    public final /* synthetic */ C6902gi A03;
    public final /* synthetic */ boolean A04;

    public C7053jD(C5748Nu c5748Nu, C6902gi c6902gi, boolean z, AbstractC7077jd abstractC7077jd, InterfaceC5747Nt interfaceC5747Nt) {
        this.A02 = c5748Nu;
        this.A03 = c6902gi;
        this.A04 = z;
        this.A00 = abstractC7077jd;
        this.A01 = interfaceC5747Nt;
    }

    private void A00(boolean z) {
        if (z) {
            if (C6171Up.A1q(this.A03) && this.A04) {
                this.A02.A02.add(AbstractC6686dD.A01(this.A03, this.A00, 1, new C7054jE(this)));
                return;
            } else {
                this.A01.ACp();
                return;
            }
        }
        this.A01.ACo(AdError.CACHE_ERROR);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6048Sp
    public final void ADL() {
        A00(false);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6048Sp
    public final void ADT() {
        A00(true);
    }
}
