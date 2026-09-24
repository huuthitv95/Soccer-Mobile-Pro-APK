package com.facebook.ads.redexgen.core;

import androidx.core.view.InputDeviceCompat;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.l9 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C7168l9 implements InterfaceC5586LH {
    public static String[] A06 = {"EnQWPJ3V2xjVAThncas5joPITTvIB7EF", "1EuaMqG73HQ", "rjBteZjJ0vNfufCjCKCkAuxJVtJJHvWb", "xDvWT2DyWg3zA1fFgEAgA6zc8FBdFJ1B", "sfKNNRwM9cmkD7QHngaf04", "qaF2qGcI8dYBUqEwfxAr3oVVO8wm", "moKLjsoCWr0SdwKtjYcTHr1Csc5rll9E", "bRjHr7kF"};
    public int A00;
    public int A01;
    public boolean A02;
    public boolean A03;
    public final C45944v A04 = new C45944v(32);
    public final InterfaceC5577L8 A05;

    public C7168l9(InterfaceC5577L8 interfaceC5577L8) {
        this.A05 = interfaceC5577L8;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5586LH
    public final void A5B(C45944v c45944v, int i) {
        boolean z = (i & 1) != 0;
        int iA09 = -1;
        if (z) {
            iA09 = c45944v.A09() + c45944v.A0I();
        }
        boolean payloadUnitStartIndicator = this.A03;
        if (payloadUnitStartIndicator) {
            if (!z) {
                return;
            }
            this.A03 = false;
            c45944v.A0f(iA09);
            this.A00 = 0;
        }
        while (c45944v.A07() > 0) {
            if (this.A00 < 3) {
                if (this.A00 == 0) {
                    int iA0I = c45944v.A0I();
                    c45944v.A0f(c45944v.A09() - 1);
                    if (iA0I == 255) {
                        this.A03 = true;
                        return;
                    }
                }
                int iMin = Math.min(c45944v.A07(), 3 - this.A00);
                c45944v.A0k(this.A04.A0l(), this.A00, iMin);
                this.A00 += iMin;
                if (this.A00 == 3) {
                    this.A04.A0f(0);
                    this.A04.A0e(3);
                    this.A04.A0g(1);
                    int iA0I2 = this.A04.A0I();
                    int iA0I3 = this.A04.A0I();
                    boolean payloadUnitStartIndicator2 = (iA0I2 & 128) != 0;
                    this.A02 = payloadUnitStartIndicator2;
                    this.A01 = (((iA0I2 & 15) << 8) | iA0I3) + 3;
                    if (this.A04.A08() < this.A01) {
                        this.A04.A0c(Math.min(InputDeviceCompat.SOURCE_TOUCHSCREEN, Math.max(this.A01, this.A04.A08() * 2)));
                    }
                }
            } else {
                int iMin2 = Math.min(c45944v.A07(), this.A01 - this.A00);
                c45944v.A0k(this.A04.A0l(), this.A00, iMin2);
                this.A00 += iMin2;
                if (this.A00 == this.A01) {
                    boolean payloadUnitStartIndicator3 = this.A02;
                    if (payloadUnitStartIndicator3) {
                        if (AbstractC46115C.A0I(this.A04.A0l(), 0, this.A01, -1) != 0) {
                            this.A03 = true;
                            return;
                        }
                        this.A04.A0e(this.A01 - 4);
                    } else {
                        this.A04.A0e(this.A01);
                    }
                    this.A04.A0f(0);
                    InterfaceC5577L8 interfaceC5577L8 = this.A05;
                    if (A06[3].charAt(18) == '6') {
                        throw new RuntimeException();
                    }
                    A06[6] = "q6sMTbjJkDPtFUqTMgY1hgSKkn8mDgdv";
                    interfaceC5577L8.A5A(this.A04);
                    this.A00 = 0;
                } else {
                    continue;
                }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5586LH
    public final void AAA(C460253 c460253, InterfaceC5332HA interfaceC5332HA, C5585LG c5585lg) {
        this.A05.AAA(c460253, interfaceC5332HA, c5585lg);
        this.A03 = true;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5586LH
    public final void AJ5() {
        this.A03 = true;
    }
}
