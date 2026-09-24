package com.facebook.ads.redexgen.core;

import com.google.common.base.Ascii;
import com.vungle.ads.internal.protos.Sdk;
import java.io.IOException;
import java.util.Arrays;
import kotlin.p300io.encoding.Base64;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.L6 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C5575L6 {
    public static byte[] A08;
    public static String[] A09 = {"voRQ6Eoiy", "dM5sUr3BWW4nkGo5nRVfbphD0FkiLgeI", "t4ngtozvUcRON5qFCPMw9NZHviWOcz8N", "2o", "HR4o0SgaegzvmEvMyBsSV3cy", "Fxd3YqblXENYapC", "iFe6DhKEBr1iW4qwRCto7Lk6hMgexe67", "drzzj9o5hc6Li6ZR2JGiBSJ"};
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final C460253 A07 = new C460253(0);
    public long A01 = -9223372036854775807L;
    public long A02 = -9223372036854775807L;
    public long A00 = -9223372036854775807L;
    public final C45944v A06 = new C45944v();

    public static String A08(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A08, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 79);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A09() {
        A08 = new byte[]{-19, -33, Ascii.DC4, 50, 40, 45, 38, -33, 19, 8, Ascii.f22492FF, 4, Ascii.f22498RS, Ascii.DC4, Ascii.f22490CR, Ascii.DC2, 4, 19, -33, 40, 45, 50, 51, 36, 32, 35, -19, Ascii.DC2, 55, 63, 42, 53, 50, 45, -23, 45, 62, 59, 42, Base64.padSymbol, 50, 56, 55, 3, -23, Ascii.SYN, 57, 10, 59, 56, 39, 58, 47, 53, 52, Ascii.CAN, 43, 39, 42, 43, 56};
    }

    static {
        A09();
    }

    private int A00(InterfaceC7263ms interfaceC7263ms) {
        this.A06.A0i(AbstractC46115C.A07);
        this.A03 = true;
        interfaceC7263ms.AIl();
        return 0;
    }

    private int A01(InterfaceC7263ms interfaceC7263ms, C5353HV c5353hv) throws IOException {
        int iMin = (int) Math.min(20000L, interfaceC7263ms.A8O());
        if (interfaceC7263ms.A8n() != 0) {
            c5353hv.A00 = 0;
            return 1;
        }
        C45944v c45944v = this.A06;
        int bytesToSearch = A09[6].length();
        if (bytesToSearch == 30) {
            throw new RuntimeException();
        }
        A09[6] = "JjjcAHcIe3bphcpehmdhx0lOvmd2";
        c45944v.A0d(iMin);
        interfaceC7263ms.AIl();
        interfaceC7263ms.AGt(this.A06.A0l(), 0, iMin);
        this.A01 = A04(this.A06);
        this.A04 = true;
        return 0;
    }

    private int A02(InterfaceC7263ms interfaceC7263ms, C5353HV c5353hv) throws IOException {
        long jA8O = interfaceC7263ms.A8O();
        int iMin = (int) Math.min(20000L, jA8O);
        long j = jA8O - ((long) iMin);
        long searchStartPosition = interfaceC7263ms.A8n();
        if (searchStartPosition != j) {
            c5353hv.A00 = j;
            return 1;
        }
        this.A06.A0d(iMin);
        interfaceC7263ms.AIl();
        interfaceC7263ms.AGt(this.A06.A0l(), 0, iMin);
        long inputLength = A05(this.A06);
        this.A02 = inputLength;
        this.A05 = true;
        return 0;
    }

    private int A03(byte[] bArr, int i) {
        return ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8) | (bArr[i + 3] & 255);
    }

    private long A04(C45944v c45944v) {
        int iA0A = c45944v.A0A();
        for (int iA09 = c45944v.A09(); iA09 < searchStartPosition; iA09++) {
            int searchEndPosition = A03(c45944v.A0l(), iA09);
            if (searchEndPosition == 442) {
                int searchStartPosition = iA09 + 4;
                c45944v.A0f(searchStartPosition);
                long jA06 = A06(c45944v);
                if (jA06 != -9223372036854775807L) {
                    return jA06;
                }
            }
        }
        return -9223372036854775807L;
    }

    private long A05(C45944v c45944v) {
        int iA09 = c45944v.A09();
        int searchStartPosition = c45944v.A0A();
        for (int nextStartCode = searchStartPosition - 4; nextStartCode >= iA09; nextStartCode--) {
            int searchEndPosition = A03(c45944v.A0l(), nextStartCode);
            if (searchEndPosition == 442) {
                int searchStartPosition2 = nextStartCode + 4;
                c45944v.A0f(searchStartPosition2);
                long jA06 = A06(c45944v);
                int searchEndPosition2 = A09[1].charAt(26);
                if (searchEndPosition2 != 107) {
                    throw new RuntimeException();
                }
                A09[6] = "fZ";
                if (jA06 != -9223372036854775807L) {
                    return jA06;
                }
            }
        }
        return -9223372036854775807L;
    }

    public static long A06(C45944v c45944v) {
        int iA09 = c45944v.A09();
        if (c45944v.A07() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        int originalPosition = bArr.length;
        c45944v.A0k(bArr, 0, originalPosition);
        c45944v.A0f(iA09);
        if (A0A(bArr)) {
            return A07(bArr);
        }
        return -9223372036854775807L;
    }

    public static long A07(byte[] bArr) {
        return (((((long) bArr[0]) & 56) >> 3) << 30) | ((((long) bArr[0]) & 3) << 28) | ((((long) bArr[1]) & 255) << 20) | (((((long) bArr[2]) & 248) >> 3) << 15) | ((((long) bArr[2]) & 3) << 13) | ((((long) bArr[3]) & 255) << 5) | ((((long) bArr[4]) & 248) >> 3);
    }

    public static boolean A0A(byte[] bArr) {
        return (bArr[0] & 196) == 68 && (bArr[2] & 4) == 4 && (bArr[4] & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3;
    }

    public final int A0B(InterfaceC7263ms interfaceC7263ms, C5353HV c5353hv) throws IOException {
        if (!this.A05) {
            return A02(interfaceC7263ms, c5353hv);
        }
        if (this.A02 == -9223372036854775807L) {
            return A00(interfaceC7263ms);
        }
        if (!this.A04) {
            return A01(interfaceC7263ms, c5353hv);
        }
        if (this.A01 == -9223372036854775807L) {
            return A00(interfaceC7263ms);
        }
        this.A00 = this.A07.A06(this.A02) - this.A07.A06(this.A01);
        if (this.A00 < 0) {
            AbstractC45794g.A07(A08(45, 16, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE), A08(27, 18, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE) + this.A00 + A08(0, 27, 112));
            this.A00 = -9223372036854775807L;
        }
        return A00(interfaceC7263ms);
    }

    public final long A0C() {
        return this.A00;
    }

    public final C460253 A0D() {
        return this.A07;
    }

    public final boolean A0E() {
        return this.A03;
    }
}
