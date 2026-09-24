package com.facebook.ads.redexgen.core;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.JX */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C5478JX {
    public static byte[] A0B;
    public static String[] A0C = {"k49nAlN8KevTPYFSOASLph6sBsYk4fa7", "ZHcqIGWhgUaBv559uPYodmfdla4z6YNf", "jyudHMVcZvePNcLp", "lBa1kLRes0ajIcq6EZkhg1VE2ZO4hxQe", "m2AqQobddrkuylEWDBAfxEjZEg6GjKoy", "b8nnr3L8PmBoSjec6BWbo41G2gNha3bi", "", ""};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public long A06;
    public long A07;
    public long A08;
    public final int[] A09 = new int[255];
    public final C45944v A0A = new C45944v(255);

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0B, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 21);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A0B = new byte[]{55, 44, 49, 55, 50, 50, 45, 48, 54, 39, 38, 98, 32, 43, 54, 98, 49, 54, 48, 39, 35, 47, 98, 48, 39, 52, 43, 49, 43, 45, 44};
    }

    static {
        A01();
    }

    public final void A02() {
        this.A03 = 0;
        this.A04 = 0;
        this.A05 = 0L;
        this.A08 = 0L;
        this.A07 = 0L;
        this.A06 = 0L;
        this.A02 = 0;
        this.A01 = 0;
        this.A00 = 0;
    }

    public final boolean A03(InterfaceC7263ms interfaceC7263ms) throws IOException {
        return A04(interfaceC7263ms, -1L);
    }

    public final boolean A04(InterfaceC7263ms interfaceC7263ms, long j) throws IOException {
        int iAK0;
        AbstractC45353y.A07(interfaceC7263ms.A8n() == interfaceC7263ms.A8i());
        this.A0A.A0d(4);
        while (true) {
            if (j != -1 && interfaceC7263ms.A8n() + 4 >= j) {
                break;
            }
            boolean zA04 = AbstractC5333HB.A04(interfaceC7263ms, this.A0A.A0l(), 0, 4, true);
            if (A0C[4].charAt(30) == '5') {
                throw new RuntimeException();
            }
            A0C[0] = "pwarRjQHbZVi4rcQZ7lOEWakVYY08Z6g";
            if (!zA04) {
                break;
            }
            this.A0A.A0f(0);
            if (this.A0A.A0Q() == 1332176723) {
                interfaceC7263ms.AIl();
                return true;
            }
            interfaceC7263ms.AK3(1);
        }
        do {
            if (j != -1 && interfaceC7263ms.A8n() >= j) {
                break;
            }
            iAK0 = interfaceC7263ms.AK0(1);
            if (A0C[0].charAt(26) != 'Y') {
                throw new RuntimeException();
            }
            String[] strArr = A0C;
            strArr[3] = "68cxMfwSaXaldqHF3br6ENxggzqDHiHt";
            strArr[1] = "gDTREffoH4ayxQFZG5Xi34FUHKUeipYB";
        } while (iAK0 != -1);
        return false;
    }

    public final boolean A05(InterfaceC7263ms interfaceC7263ms, boolean z) throws IOException {
        A02();
        this.A0A.A0d(27);
        if (!AbstractC5333HB.A04(interfaceC7263ms, this.A0A.A0l(), 0, 27, z) || this.A0A.A0Q() != 1332176723) {
            return false;
        }
        C45944v c45944v = this.A0A;
        if (A0C[0].charAt(26) != 'Y') {
            throw new RuntimeException();
        }
        A0C[2] = "M9XA72oAU7";
        this.A03 = c45944v.A0I();
        if (this.A03 != 0) {
            if (z) {
                return false;
            }
            throw C44963K.A00(A00(0, 31, 87));
        }
        this.A04 = this.A0A.A0I();
        this.A05 = this.A0A.A0N();
        this.A08 = this.A0A.A0O();
        this.A07 = this.A0A.A0O();
        this.A06 = this.A0A.A0O();
        this.A02 = this.A0A.A0I();
        this.A01 = this.A02 + 27;
        this.A0A.A0d(this.A02);
        if (!AbstractC5333HB.A04(interfaceC7263ms, this.A0A.A0l(), 0, this.A02, z)) {
            return false;
        }
        for (int i = 0; i < i; i++) {
            int[] iArr = this.A09;
            int i2 = this.A0A.A0I();
            iArr[i] = i2;
            int i3 = this.A00;
            int i4 = this.A09[i];
            this.A00 = i3 + i4;
        }
        return true;
    }
}
