package com.facebook.ads.redexgen.core;

import com.facebook.ads.internal.protocol.AdErrorType;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.k4 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C7104k4 implements InterfaceC6020SM {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C478681 A01;
    public final /* synthetic */ C478681 A02;
    public final /* synthetic */ C6118Tx A03;

    public C7104k4(C478681 c478681, int i, C6118Tx c6118Tx, C478681 c478682) {
        this.A01 = c478681;
        this.A00 = i;
        this.A03 = c6118Tx;
        this.A02 = c478682;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6020SM
    public final void ACx() {
        this.A01.A0C(this.A00, this.A03);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6020SM
    public final void ACy() {
        this.A01.A00.AEN(this.A02, C6229Vm.A00(AdErrorType.NO_FILL));
    }
}
