package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.LJ */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C5588LJ {
    public static byte[] A02;
    public static String[] A03 = {"5V45xVrzlJXesqnrbjrZeT76qkPwv", "706Txtts1K7q5FoHp33PEv9HaNMSsjAK", "qupHUySH2p9zJgxISfihn0myWA92wmd9", "5DvGIEuDVuIxxSW2dLmZtZYg2a6kN8VU", "n2fidlshYBQzN55WQs4Vi6", "kTscsm2f8c9DflsdA4bvXVbGUagx", "", "mbeoGjxKtAefmgmFA563kx"};
    public final List<C7472qI> A00;
    public final InterfaceC5361Hd[] A01;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A03[5].length() == 31) {
                throw new RuntimeException();
            }
            A03[0] = "BUpOOmvQBkZMcHt4Z";
            if (i4 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 6);
            i4++;
        }
    }

    public static void A01() {
        A02 = new byte[]{-114, -77, -69, -90, -79, -82, -87, 101, -88, -79, -76, -72, -86, -87, 101, -88, -90, -75, -71, -82, -76, -77, 101, -78, -82, -78, -86, 101, -71, -66, -75, -86, 101, -75, -73, -76, -69, -82, -87, -86, -87, 127, 101, -38, -23, -23, -27, -30, -36, -38, -19, -30, -24, -25, -88, -36, -34, -38, -90, -81, -87, -79, -116, -101, -101, -105, -108, -114, -116, -97, -108, -102, -103, 90, -114, -112, -116, 88, 98, 91, 99};
    }

    static {
        A01();
    }

    public C5588LJ(List<C7472qI> list) {
        this.A00 = list;
        this.A01 = new InterfaceC5361Hd[list.size()];
    }

    public final void A02(long j, C45944v c45944v) {
        if (c45944v.A07() < 9) {
            return;
        }
        int userDataIdentifier = c45944v.A0C();
        int iA0C = c45944v.A0C();
        int iA0I = c45944v.A0I();
        if (userDataIdentifier == 434) {
            int userDataIdentifier2 = A03[3].charAt(2);
            if (userDataIdentifier2 != 118) {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[7] = "5ag0VzOfRdhx9UNauvnxAz";
            strArr[4] = "f0o3UWjxlhBFesYxHlhgg4";
            if (iA0C == 1195456820 && iA0I == 3) {
                AbstractC5325H3.A04(j, c45944v, this.A01);
            }
        }
    }

    public final void A03(InterfaceC5332HA interfaceC5332HA, C5585LG c5585lg) {
        for (int i = 0; i < i; i++) {
            c5585lg.A05();
            InterfaceC5361Hd interfaceC5361HdAKS = interfaceC5332HA.AKS(c5585lg.A03(), 3);
            C7472qI c7472qI = this.A00.get(i);
            String str = c7472qI.A0W;
            AbstractC45353y.A09(A00(43, 19, 115).equals(str) || A00(62, 19, 37).equals(str), A00(0, 43, 63) + str);
            C44672p c44672pA11 = new C44672p().A0y(c5585lg.A04()).A11(str);
            int i2 = c7472qI.A0H;
            C44672p c44672pA10 = c44672pA11.A0n(i2).A10(c7472qI.A0V);
            int i3 = c7472qI.A03;
            interfaceC5361HdAKS.A6e(c44672pA10.A0Z(i3).A12(c7472qI.A0X).A14());
            this.A01[i] = interfaceC5361HdAKS;
        }
    }
}
