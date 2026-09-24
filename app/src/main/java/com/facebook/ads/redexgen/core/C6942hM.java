package com.facebook.ads.redexgen.core;

import android.view.View;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.hM */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C6942hM extends AbstractC5694N2 {
    public static byte[] A03;
    public static String[] A04 = {"G2rh", "Fb5x", "6CyVQJjLjUxkB4NOtEwwqOuY7kB2daf", "v2svMG5ZVzKjVXyH1MXvdM9krQWCKsNq", "oRWr7RpHwOoI3beQIRyDA09DO9LlUwST", "SjgxBMhR0kRV74MEQavsGpgIJGrbvWLl", "8l9W", "lapvzpZuNASF"};
    public View A00;
    public final C5975Rd A01;
    public final C472976 A02;

    public static String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 16);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        byte[] bArr = {69, 103, 104, 104, 105, 114, 38, 118, 116, 99, 117, 99, 104, 114, 38, 104, 115, 106, 106, 38, 103, 98, 80, 111, 99, 113};
        if (A04[7].length() == 31) {
            throw new RuntimeException();
        }
        A04[0] = "ScK1";
        A03 = bArr;
    }

    static {
        A03();
    }

    public C6942hM(C5975Rd c5975Rd) {
        this.A02 = c5975Rd.A09();
        this.A01 = c5975Rd;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC5694N2
    public final void A0C() {
        this.A02.A0F().A4U();
        AbstractC6270WT.A00(new C6944hO(this));
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC5694N2
    public final void A0D() {
        this.A02.A0F().A4X();
        AbstractC6270WT.A00(new C6943hN(this));
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC5694N2
    public final void A0E(View view) {
        if (view != null) {
            C472976 c472976 = this.A02;
            String[] strArr = A04;
            if (strArr[6].length() != strArr[1].length()) {
                throw new RuntimeException();
            }
            A04[0] = "eqHc";
            c472976.A0F().A4W();
            this.A00 = view;
            this.A01.A07().removeAllViews();
            this.A01.A07().addView(this.A00);
            if ((this.A00 instanceof C5600LV) || (this.A00 instanceof C6427Z2)) {
                AbstractC6234Vs.A01(this.A01.A05(), this.A00, this.A01.A0A());
            }
            C47697k controller = this.A01.A08();
            if (controller != null) {
                controller.A0L();
            }
            AbstractC6270WT.A00(new C6945hP(this));
            this.A01.A0B(this.A01.A07(), this.A00);
            if (C6171Up.A1C(this.A01.A07().getContext())) {
                C6555b6 c6555b6 = new C6555b6();
                this.A01.A0D(c6555b6);
                c6555b6.A0C(this.A01.getPlacementId());
                c6555b6.A0B(this.A01.A07().getContext().getPackageName());
                if (this.A01.A08() != null && this.A01.A08().A0J() != null) {
                    c6555b6.A09(this.A01.A08().A0J().A0C());
                }
                if (this.A00 instanceof C5600LV) {
                    c6555b6.A0A(((C5600LV) this.A00).getViewabilityChecker());
                }
                this.A00.setOnLongClickListener(new ViewOnLongClickListenerC5983Rl(this, c6555b6));
                this.A00.getOverlay().add(c6555b6);
                return;
            }
            return;
        }
        throw new IllegalStateException(A02(0, 26, 22));
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC5694N2
    public final void A0F(InterfaceC5693N1 interfaceC5693N1) {
        this.A02.A0F().A4V(this.A01.A08() != null);
        if (this.A01.A08() != null) {
            this.A01.A08().A0M();
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC5694N2
    public final void A0G(C6229Vm c6229Vm) {
        this.A02.A0F().A3N(C6364Y1.A01(this.A01.A04()), c6229Vm.A03().getErrorCode(), c6229Vm.A04());
        AbstractC6270WT.A00(new C6946hQ(this, c6229Vm));
    }
}
