package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.L9 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C5578L9 {
    public static byte[] A02;
    public final List<C7472qI> A00;
    public final InterfaceC5361Hd[] A01;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 29);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{119, -100, -92, -113, -102, -105, -110, 78, -111, -102, -99, -95, -109, -110, 78, -111, -113, -98, -94, -105, -99, -100, 78, -101, -105, -101, -109, 78, -94, -89, -98, -109, 78, -98, -96, -99, -92, -105, -110, -109, -110, 104, 78, -123, -108, -108, -112, -115, -121, -123, -104, -115, -109, -110, 83, -121, -119, -123, 81, 90, 84, 92, -49, -34, -34, -38, -41, -47, -49, -30, -41, -35, -36, -99, -47, -45, -49, -101, -91, -98, -90};
    }

    public C5578L9(List<C7472qI> list) {
        this.A00 = list;
        this.A01 = new InterfaceC5361Hd[list.size()];
    }

    public final void A02(long j, C45944v c45944v) {
        AbstractC5325H3.A03(j, c45944v, this.A01);
    }

    public final void A03(InterfaceC5332HA interfaceC5332HA, C5585LG c5585lg) {
        for (int i = 0; i < i; i++) {
            c5585lg.A05();
            InterfaceC5361Hd interfaceC5361HdAKS = interfaceC5332HA.AKS(c5585lg.A03(), 3);
            C7472qI c7472qI = this.A00.get(i);
            String str = c7472qI.A0W;
            AbstractC45353y.A09(A00(43, 19, 7).equals(str) || A00(62, 19, 81).equals(str), A00(0, 43, 17) + str);
            C44672p c44672pA11 = new C44672p().A0y(c7472qI.A0T != null ? c7472qI.A0T : c5585lg.A04()).A11(str);
            int i2 = c7472qI.A0H;
            C44672p c44672pA10 = c44672pA11.A0n(i2).A10(c7472qI.A0V);
            int i3 = c7472qI.A03;
            interfaceC5361HdAKS.A6e(c44672pA10.A0Z(i3).A12(c7472qI.A0X).A14());
            this.A01[i] = interfaceC5361HdAKS;
        }
    }
}
