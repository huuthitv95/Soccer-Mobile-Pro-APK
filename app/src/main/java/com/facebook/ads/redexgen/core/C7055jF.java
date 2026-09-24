package com.facebook.ads.redexgen.core;

import com.facebook.ads.AdError;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.jF */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C7055jF implements InterfaceC6020SM {
    public final /* synthetic */ AbstractC7077jd A00;
    public final /* synthetic */ InterfaceC5747Nt A01;
    public final /* synthetic */ C5748Nu A02;
    public final /* synthetic */ C6902gi A03;
    public final /* synthetic */ boolean A04;

    public C7055jF(C5748Nu c5748Nu, C6902gi c6902gi, boolean z, AbstractC7077jd abstractC7077jd, InterfaceC5747Nt interfaceC5747Nt) {
        this.A02 = c5748Nu;
        this.A03 = c6902gi;
        this.A04 = z;
        this.A00 = abstractC7077jd;
        this.A01 = interfaceC5747Nt;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6020SM
    public final void ACx() {
        if (C6171Up.A1q(this.A03) && this.A04) {
            this.A02.A02.add(AbstractC6686dD.A01(this.A03, this.A00, 1, new C7056jG(this)));
        } else {
            this.A01.ACp();
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6020SM
    public final void ACy() {
        this.A01.ACo(AdError.CACHE_ERROR);
    }
}
