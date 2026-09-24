package com.facebook.ads.redexgen.core;

import com.google.common.base.Ascii;
import java.util.Arrays;
import kotlin.p300io.encoding.Base64;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.mC */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C7233mC implements InterfaceC5442Ix {
    public static byte[] A03;
    public final int A00;
    public final int A01;
    public final C45944v A02;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 108);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{65, 77, Ascii.f22498RS, Ascii.f22491EM, Ascii.f22498RS, Ascii.ETB, 77, Ascii.f22498RS, Ascii.f22492FF, 0, Ascii.f22494GS, 1, 8, 77, Ascii.f22498RS, 4, Ascii.ETB, 8, 87, 77, 70, 115, 104, 106, 87, 102, 117, 116, 98, 117, 116, 9, Base64.padSymbol, 44, 33, 39, 104, 59, 41, 37, 56, 36, 45, 104, 59, 33, 50, 45, 104, 37, 33, 59, 37, 41, 60, 43, 32, 102, 104, 59, 60, 59, 44, 104, 59, 41, 37, 56, 36, 45, 104, 59, 33, 50, 45, 114, 104, Ascii.f22491EM, Ascii.f22490CR, Ascii.f22493FS, 17, Ascii.ETB, 87, 10, Ascii.f22491EM, Ascii.f22499SI};
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0034  */
    public C7233mC(C7234mD c7234mD, C7472qI c7472qI) {
        this.A02 = c7234mD.A00;
        this.A02.A0f(12);
        int iA0L = this.A02.A0L();
        if (A00(77, 9, 20).equals(c7472qI.A0W)) {
            int i = c7472qI.A0C;
            int fixedSampleSize = c7472qI.A06;
            int iA06 = AbstractC46115C.A06(i, fixedSampleSize);
            if (iA0L != 0) {
                int fixedSampleSize2 = iA0L % iA06;
                if (fixedSampleSize2 != 0) {
                    AbstractC45794g.A07(A00(20, 11, 107), A00(31, 46, 36) + iA06 + A00(0, 20, 1) + iA0L);
                    iA0L = iA06;
                }
            } else {
                AbstractC45794g.A07(A00(20, 11, 107), A00(31, 46, 36) + iA06 + A00(0, 20, 1) + iA0L);
                iA0L = iA06;
            }
        }
        this.A00 = iA0L == 0 ? -1 : iA0L;
        int fixedSampleSize3 = this.A02.A0L();
        this.A01 = fixedSampleSize3;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5442Ix
    public final int A8A() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5442Ix
    public final int A8v() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5442Ix
    public final int AHS() {
        return this.A00 == -1 ? this.A02.A0L() : this.A00;
    }
}
