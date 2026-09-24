package com.facebook.ads.redexgen.core;

import com.google.common.base.Ascii;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.l0 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C7159l0 implements InterfaceC5590LL {
    public static byte[] A08;
    public static String[] A09 = {"mF6wsmKEoSH0oaFjYCs54xiQsDf", "7fvgeHK83IOxRTsxSXxl4b3GDJCkJYIR", "3AWdxUjQjYm4RALX7ZxT6TNspaUhotFB", "ejd6qsjsHb99jkL857XJ5GpzVF9O4Dmm", "HjmRuX1Dl2gTeBJaQInX56gY9CThxDdt", "4dP72HMzoJKZI0lPLVreHOZSlD0czmst", "VabPsN9EmqWHNd02VeXfGkhVpY5qzzPo", "1TiSMCKkeVz3FItUT5PAcFJ22kgDAGxf"};
    public int A00;
    public long A01;
    public long A02;
    public final int A03;
    public final C7472qI A04;
    public final InterfaceC5332HA A05;
    public final InterfaceC5361Hd A06;
    public final C5592LN A07;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A08, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 81);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A08 = new byte[]{-68, -95, -24, -16, -11, -69, -95, -34, 17, 9, -2, -4, Ascii.f22490CR, -2, -3, -71, -5, 5, 8, -4, 4, -71, Ascii.f22492FF, 2, 19, -2, -45, -71};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.core.InterfaceC5590LL
    public final boolean AIt(InterfaceC7263ms interfaceC7263ms, long j) throws IOException {
        long j2 = j;
        while (true) {
            String[] strArr = A09;
            if (strArr[6].charAt(28) != strArr[5].charAt(28)) {
                throw new RuntimeException();
            }
            A09[7] = "xyHijgDe1t0LZE27YhGAb5keyZPdsLp6";
            if (j2 <= 0 || this.A00 >= this.A03) {
                int i = this.A07.A02;
                int i2 = this.A00 / i;
                if (i2 > 0) {
                    long jA0U = this.A02 + AbstractC46115C.A0U(this.A01, 1000000L, this.A07.A04);
                    int i3 = i2 * i;
                    int i4 = this.A00 - i3;
                    this.A06.AIu(jA0U, 1, i3, i4, null);
                    this.A01 += (long) i2;
                    this.A00 = i4;
                }
                return j2 <= 0;
            }
            int iAIp = this.A06.AIp(interfaceC7263ms, (int) Math.min(this.A03 - this.A00, j2), true);
            if (iAIp == -1) {
                j2 = 0;
            } else {
                this.A00 += iAIp;
                j2 -= (long) iAIp;
            }
        }
    }

    static {
        A01();
    }

    public C7159l0(InterfaceC5332HA interfaceC5332HA, InterfaceC5361Hd interfaceC5361Hd, C5592LN c5592ln, String str, int i) throws C44963K {
        this.A05 = interfaceC5332HA;
        this.A06 = interfaceC5361Hd;
        this.A07 = c5592ln;
        int i2 = (c5592ln.A05 * c5592ln.A01) / 8;
        int bytesPerFrame = c5592ln.A02;
        if (bytesPerFrame == i2) {
            int bytesPerFrame2 = c5592ln.A04;
            int constantBitrate = bytesPerFrame2 * i2 * 8;
            int bytesPerFrame3 = c5592ln.A04;
            this.A03 = Math.max(i2, (bytesPerFrame3 * i2) / 10);
            C44672p c44672pA0j = new C44672p().A11(str).A0a(constantBitrate).A0j(constantBitrate);
            int bytesPerFrame4 = this.A03;
            C44672p c44672pA0h = c44672pA0j.A0h(bytesPerFrame4);
            int bytesPerFrame5 = c5592ln.A05;
            C44672p c44672pA0b = c44672pA0h.A0b(bytesPerFrame5);
            int bytesPerFrame6 = c5592ln.A04;
            this.A04 = c44672pA0b.A0m(bytesPerFrame6).A0i(i).A14();
            return;
        }
        StringBuilder sbAppend = new StringBuilder().append(A00(7, 21, 72)).append(i2).append(A00(0, 7, 48));
        int bytesPerFrame7 = c5592ln.A02;
        throw C44963K.A01(sbAppend.append(bytesPerFrame7).toString(), null);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5590LL
    public final void AA8(int i, long j) {
        this.A05.AJ7(new C7157ky(this.A07, 1, i, j));
        this.A06.A6e(this.A04);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5590LL
    public final void AIk(long j) {
        this.A02 = j;
        this.A00 = 0;
        this.A01 = 0L;
    }
}
