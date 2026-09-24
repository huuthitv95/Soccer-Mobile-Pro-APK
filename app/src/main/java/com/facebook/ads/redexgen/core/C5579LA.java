package com.facebook.ads.redexgen.core;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.LA */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C5579LA {
    public static byte[] A09;
    public static String[] A0A = {"YKrx4tQL3HFlbX0m6cI7YSMmMtJDnVWt", "EhNKRydGslBNjHwz4Qke8RkUgCBaonuc", "lVt1vjccWtobRJMyEDSjQomkweVugX5V", "X5vaF2wJa8umjlLI", "q53FR06vPOBUDZ08SG0Q3HmIsvEwqM01", "eDYPuZuNQVkkkUOb40HZTr2GxKWyUyQ4", "7DZ3geXrHcZNODb56yin0lXQD6ovjT1O", "oKDHpDD8v386AT9biWd"};
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final int A06;
    public final C460253 A08 = new C460253(0);
    public long A01 = -9223372036854775807L;
    public long A02 = -9223372036854775807L;
    public long A00 = -9223372036854775807L;
    public final C45944v A07 = new C45944v();

    public static String A05(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A09, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 17);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A06() {
        A09 = new byte[]{-89, -103, -50, -20, -30, -25, -32, -103, -51, -62, -58, -66, -40, -50, -57, -52, -66, -51, -103, -30, -25, -20, -19, -34, -38, -35, -89, -119, -82, -74, -95, -84, -87, -92, 96, -92, -75, -78, -95, -76, -87, -81, -82, 122, 96, -95, -64, -111, -62, -65, -82, -63, -74, -68, -69, -97, -78, -82, -79, -78, -65};
    }

    static {
        A06();
    }

    public C5579LA(int i) {
        this.A06 = i;
    }

    private int A00(InterfaceC7263ms interfaceC7263ms) {
        this.A07.A0i(AbstractC46115C.A07);
        this.A03 = true;
        interfaceC7263ms.AIl();
        return 0;
    }

    private int A01(InterfaceC7263ms interfaceC7263ms, C5353HV c5353hv, int i) throws IOException {
        int iMin = (int) Math.min(this.A06, interfaceC7263ms.A8O());
        if (interfaceC7263ms.A8n() != 0) {
            c5353hv.A00 = 0;
            return 1;
        }
        this.A07.A0d(iMin);
        interfaceC7263ms.AIl();
        interfaceC7263ms.AGt(this.A07.A0l(), 0, iMin);
        this.A01 = A03(this.A07, i);
        this.A04 = true;
        return 0;
    }

    private int A02(InterfaceC7263ms interfaceC7263ms, C5353HV c5353hv, int i) throws IOException {
        long inputLength = interfaceC7263ms.A8O();
        int iMin = (int) Math.min(this.A06, inputLength);
        long inputLength2 = inputLength - ((long) iMin);
        if (interfaceC7263ms.A8n() != inputLength2) {
            c5353hv.A00 = inputLength2;
            return 1;
        }
        this.A07.A0d(iMin);
        interfaceC7263ms.AIl();
        interfaceC7263ms.AGt(this.A07.A0l(), 0, iMin);
        this.A02 = A04(this.A07, i);
        this.A05 = true;
        return 0;
    }

    private long A03(C45944v c45944v, int i) {
        int iA0A = c45944v.A0A();
        for (int iA09 = c45944v.A09(); iA09 < iA0A; iA09++) {
            int searchEndPosition = c45944v.A0l()[iA09];
            if (searchEndPosition == 71) {
                long jA01 = AbstractC5587LI.A01(c45944v, iA09, i);
                if (jA01 != -9223372036854775807L) {
                    return jA01;
                }
            }
        }
        return -9223372036854775807L;
    }

    private long A04(C45944v c45944v, int i) {
        int iA09 = c45944v.A09();
        int iA0A = c45944v.A0A();
        for (int i2 = iA0A - 188; i2 >= iA09; i2--) {
            if (AbstractC5587LI.A03(c45944v.A0l(), iA09, iA0A, i2)) {
                long jA01 = AbstractC5587LI.A01(c45944v, i2, i);
                if (jA01 != -9223372036854775807L) {
                    return jA01;
                }
            }
        }
        return -9223372036854775807L;
    }

    public final int A07(InterfaceC7263ms interfaceC7263ms, C5353HV c5353hv, int i) throws IOException {
        if (i <= 0) {
            return A00(interfaceC7263ms);
        }
        if (!this.A05) {
            return A02(interfaceC7263ms, c5353hv, i);
        }
        if (this.A02 == -9223372036854775807L) {
            return A00(interfaceC7263ms);
        }
        if (!this.A04) {
            int iA01 = A01(interfaceC7263ms, c5353hv, i);
            if (A0A[0].charAt(2) == 'O') {
                throw new RuntimeException();
            }
            A0A[0] = "U4EwafF7WjzJM20D4nSEnM6oLnkPTMDI";
            return iA01;
        }
        if (this.A01 == -9223372036854775807L) {
            return A00(interfaceC7263ms);
        }
        this.A00 = this.A08.A06(this.A02) - this.A08.A06(this.A01);
        if (this.A00 < 0) {
            AbstractC45794g.A07(A05(45, 16, 60), A05(27, 18, 47) + this.A00 + A05(0, 27, 104));
            this.A00 = -9223372036854775807L;
        }
        return A00(interfaceC7263ms);
    }

    public final long A08() {
        return this.A00;
    }

    public final C460253 A09() {
        return this.A08;
    }

    public final boolean A0A() {
        return this.A03;
    }
}
