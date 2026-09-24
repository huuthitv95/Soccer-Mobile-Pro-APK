package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Vw */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C6238Vw extends AbstractC5694N2 {
    public static byte[] A01;
    public final /* synthetic */ C6140UK A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 30);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{95, 112, 101, 120, 103, 116, 49, 112, 117, 98, 49, 124, 112, 127, 112, 118, 116, 99, 49, 101, 121, 116, 120, 99, 49, 126, 102, 127, 49, 120, 124, 97, 99, 116, 98, 98, 120, 126, 127, 98, 63};
    }

    public C6238Vw(C6140UK c6140uk) {
        this.A00 = c6140uk;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC5694N2
    public final void A0B(C7094ju c7094ju) {
        this.A00.A1d(c7094ju);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC5694N2
    public final void A0C() {
        if (this.A00.A0I != null) {
            this.A00.A0I.ACm();
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC5694N2
    public final void A0D() {
        throw new IllegalStateException(A00(0, 41, 15));
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC5694N2
    public final void A0F(InterfaceC5693N1 interfaceC5693N1) {
        if (this.A00.A0B != null) {
            this.A00.A0B.A0M();
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC5694N2
    public final void A0G(C6229Vm c6229Vm) {
        this.A00.A16().A0F().A3N(C6364Y1.A01(this.A00.A00), c6229Vm.A03().getErrorCode(), c6229Vm.A04());
        if (this.A00.A0I != null) {
            this.A00.A0I.ADp(c6229Vm);
        }
    }
}
