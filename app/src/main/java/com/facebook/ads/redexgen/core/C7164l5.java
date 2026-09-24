package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.l5 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C7164l5 implements InterfaceC5577L8 {
    public final C45934u A00 = new C45934u(new byte[4]);
    public final /* synthetic */ C7162l3 A01;

    public C7164l5(C7162l3 c7162l3) {
        this.A01 = c7162l3;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5577L8
    public final void A5A(C45944v c45944v) {
        int tableId = c45944v.A0I();
        if (tableId != 0) {
            return;
        }
        int tableId2 = c45944v.A0I();
        if ((tableId2 & 128) == 0) {
            return;
        }
        c45944v.A0g(6);
        int iA07 = c45944v.A07() / 4;
        for (int i = 0; i < iA07; i++) {
            c45944v.A0h(this.A00, 4);
            int programCount = this.A00.A04(16);
            this.A00.A09(3);
            if (programCount == 0) {
                this.A00.A09(13);
            } else {
                int iA04 = this.A00.A04(13);
                if (this.A01.A0B.get(iA04) == null) {
                    this.A01.A0B.put(iA04, new C7168l9(new C7163l4(this.A01, iA04)));
                    C7162l3.A02(this.A01);
                }
            }
        }
        int secondHeaderByte = this.A01.A09;
        if (secondHeaderByte != 2) {
            this.A01.A0B.remove(0);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5577L8
    public final void AAA(C460253 c460253, InterfaceC5332HA interfaceC5332HA, C5585LG c5585lg) {
    }
}
