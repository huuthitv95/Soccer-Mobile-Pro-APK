package com.facebook.ads.redexgen.core;

import com.facebook.ads.AdError;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.O5 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC5759O5 {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 115);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{Ascii.f22503VT, 77, 81, 72, 73, 93, 90, SignedBytes.MAX_POWER_OF_TWO, 81, 70, 71, SignedBytes.MAX_POWER_OF_TWO, 93, SignedBytes.MAX_POWER_OF_TWO, 93, 85, 88};
    }

    public static void A02(C6902gi c6902gi, AbstractC7077jd abstractC7077jd, boolean z, InterfaceC5757O3 interfaceC5757O3) {
        if (!C6171Up.A2E(c6902gi)) {
            C6056Sx c6056Sx = new C6056Sx(c6902gi);
            C5742No c5742NoA07 = abstractC7077jd.A29().A0H().A07();
            c6056Sx.A0e(new C6200VI(abstractC7077jd.A2E(), c6902gi.A0A()));
            if (c5742NoA07 == null) {
                interfaceC5757O3.AFF(AdError.CACHE_ERROR);
                return;
            }
            if (c5742NoA07.A0Y()) {
                interfaceC5757O3.AFG();
                return;
            }
            C6052St c6052St = new C6052St(c5742NoA07.A0L(), abstractC7077jd.A1D(), abstractC7077jd.A10());
            c6052St.A04 = true;
            c6052St.A03 = A00(0, 5, 86);
            switch (C5756O2.A00[c5742NoA07.A0G().ordinal()]) {
                case 1:
                case 2:
                    c6056Sx.A0Y(c6052St);
                    break;
            }
            c6056Sx.A0c(new C6054Sv(abstractC7077jd.A2C().A01(), -1, -1, abstractC7077jd.A1D(), abstractC7077jd.A10()));
            c6056Sx.A0c(new C6054Sv(c5742NoA07.A0K(), -1, -1, abstractC7077jd.A1D(), abstractC7077jd.A10()));
            AbstractC5754O0.A00(abstractC7077jd, c6056Sx, A00(5, 12, 71));
            c6056Sx.A0X(new C7050jA(c6902gi, interfaceC5757O3, c6056Sx, c5742NoA07, z), new C6049Sq(abstractC7077jd.A1D(), abstractC7077jd.A10()));
            return;
        }
        interfaceC5757O3.AFG();
    }
}
