package com.facebook.ads.redexgen.core;

import com.google.common.base.Ascii;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import kotlin.p300io.encoding.Base64;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.lE */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C7173lE implements InterfaceC5586LH {
    public static byte[] A0C;
    public static String[] A0D = {"PKE6bUnMb8YRJi5c3EKctidvnGObkWUW", "Sj6HMP0SOTonM2", "QNuElofm8mn1vxmEMVf480D516cE6c1A", "mo3DY2i4ZftrkN8KZEKpxWPbRUkrlx1j", "gCiGT026Vp", "", "zTp2xHG3y1GADYyWqYlevGmnNqTbrtlk", "l459osJydpsPWra20sllrfS"};
    public int A00;
    public int A01;
    public int A02;
    public long A04;
    public C460253 A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public final InterfaceC5564Kv A0B;
    public final C45934u A0A = new C45934u(new byte[10]);
    public int A03 = 0;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0C, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 118);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A0C = new byte[]{-23, 54, 56, 59, 46, -23, 43, 66, Base64.padSymbol, 46, 60, 49, 90, 96, 89, 79, Ascii.f22503VT, 89, 80, 82, 76, 95, 84, 97, 80, Ascii.f22503VT, 91, 76, 78, 86, 80, 95, Ascii.f22503VT, 91, 76, 100, 87, 90, 76, 79, Ascii.f22503VT, 94, 84, 101, 80, 37, Ascii.f22503VT, 36, 57, 71, 38, 57, 53, 56, 57, 70, -7, Ascii.DC2, 9, Ascii.f22493FS, Ascii.DC4, 9, 7, Ascii.CAN, 9, 8, -60, Ascii.ETB, Ascii.CAN, 5, Ascii.SYN, Ascii.CAN, -60, 7, 19, 8, 9, -60, Ascii.DC4, Ascii.SYN, 9, 10, Ascii.f22490CR, Ascii.f22493FS, -34, -60, Ascii.f22503VT, 36, Ascii.ESC, 46, 38, Ascii.ESC, Ascii.f22491EM, 42, Ascii.ESC, Ascii.SUB, -42, 41, 42, Ascii.ETB, 40, 42, -42, Ascii.f22502US, 36, Ascii.SUB, Ascii.f22502US, Ascii.f22491EM, Ascii.ETB, 42, 37, 40, -42, 40, Ascii.ESC, Ascii.ETB, Ascii.SUB, Ascii.f22502US, 36, Ascii.f22494GS, -42, Ascii.ESC, 46, 42, Ascii.ESC, 36, Ascii.SUB, Ascii.ESC, Ascii.SUB, -42, Ascii.f22498RS, Ascii.ESC, Ascii.ETB, Ascii.SUB, Ascii.ESC, 40, 4, Ascii.f22494GS, Ascii.DC4, 39, Ascii.f22502US, Ascii.DC4, Ascii.DC2, 35, Ascii.DC4, 19, -49, 34, 35, Ascii.DLE, 33, 35, -49, Ascii.CAN, Ascii.f22494GS, 19, Ascii.CAN, Ascii.DC2, Ascii.DLE, 35, Ascii.f22498RS, 33, -23, -49, Ascii.DC4, 39, Ascii.f22502US, Ascii.DC4, Ascii.DC2, 35, Ascii.DC4, 19, -49};
    }

    static {
        A02();
    }

    public C7173lE(InterfaceC5564Kv interfaceC5564Kv) {
        this.A0B = interfaceC5564Kv;
    }

    @RequiresNonNull({"timestampAdjuster"})
    private void A01() {
        this.A0A.A08(0);
        this.A04 = -9223372036854775807L;
        if (this.A08) {
            this.A0A.A09(4);
            long jA04 = ((long) this.A0A.A04(3)) << 30;
            this.A0A.A09(1);
            long pts = this.A0A.A04(15) << 15;
            long j = jA04 | pts;
            this.A0A.A09(1);
            long pts2 = this.A0A.A04(15);
            long j2 = j | pts2;
            this.A0A.A09(1);
            if (!this.A09 && this.A07) {
                this.A0A.A09(4);
                long pts3 = this.A0A.A04(3);
                this.A0A.A09(1);
                long pts4 = (pts3 << 30) | ((long) (this.A0A.A04(15) << 15));
                this.A0A.A09(1);
                long pts5 = pts4 | ((long) this.A0A.A04(15));
                this.A0A.A09(1);
                this.A05.A06(pts5);
                this.A09 = true;
            }
            this.A04 = this.A05.A06(j2);
        }
    }

    private void A03(int i) {
        this.A03 = i;
        this.A00 = 0;
    }

    private boolean A04() {
        this.A0A.A08(0);
        int iA04 = this.A0A.A04(24);
        String strA00 = A00(47, 9, 94);
        if (iA04 != 1) {
            AbstractC45794g.A07(strA00, A00(56, 30, 46) + iA04);
            this.A02 = -1;
            return false;
        }
        this.A0A.A09(8);
        int iA05 = this.A0A.A04(16);
        this.A0A.A09(5);
        this.A06 = this.A0A.A0H();
        this.A0A.A09(2);
        this.A08 = this.A0A.A0H();
        this.A07 = this.A0A.A0H();
        this.A0A.A09(6);
        int startCodePrefix = this.A0A.A04(8);
        this.A01 = startCodePrefix;
        if (iA05 == 0) {
            this.A02 = -1;
        } else {
            int startCodePrefix2 = iA05 + 6;
            int packetLength = startCodePrefix2 - 9;
            int startCodePrefix3 = this.A01;
            this.A02 = packetLength - startCodePrefix3;
            int startCodePrefix4 = this.A02;
            if (startCodePrefix4 < 0) {
                StringBuilder sbAppend = new StringBuilder().append(A00(11, 36, Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE));
                int startCodePrefix5 = this.A02;
                AbstractC45794g.A07(strA00, sbAppend.append(startCodePrefix5).toString());
                this.A02 = -1;
            }
        }
        return true;
    }

    private boolean A05(C45944v c45944v, byte[] bArr, int i) {
        int iMin = Math.min(c45944v.A07(), i - this.A00);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            c45944v.A0g(iMin);
        } else {
            int bytesToRead = this.A00;
            c45944v.A0k(bArr, bytesToRead, iMin);
        }
        int bytesToRead2 = this.A00;
        this.A00 = bytesToRead2 + iMin;
        int bytesToRead3 = this.A00;
        return bytesToRead3 == i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.facebook.ads.redexgen.core.InterfaceC5586LH
    public final void A5B(C45944v c45944v, int i) throws C44963K {
        AbstractC45353y.A02(this.A05);
        if ((i & 1) != 0) {
            int i2 = this.A03;
            String strA00 = A00(47, 9, 94);
            switch (i2) {
                case 0:
                case 1:
                    A03(1);
                    break;
                case 2:
                    AbstractC45794g.A07(strA00, A00(86, 50, 64));
                    A03(1);
                    break;
                case 3:
                    if (this.A02 != -1) {
                        AbstractC45794g.A07(strA00, A00(136, 37, 57) + this.A02 + A00(0, 11, 83));
                    }
                    this.A0B.AGp();
                    A03(1);
                    break;
                default:
                    throw new IllegalStateException();
            }
        }
        while (c45944v.A07() > 0) {
            int i3 = 0;
            switch (this.A03) {
                case 0:
                    c45944v.A0g(c45944v.A07());
                    break;
                case 1:
                    if (A05(c45944v, this.A0A.A00, 9)) {
                        boolean zA04 = A04();
                        if (A0D[5].length() != 12) {
                            A0D[6] = "QQT4Wvnf7PZI1aBOQkpVRuEJ9a4y7TW0";
                            A03(zA04 ? 2 : 0);
                        }
                    } else {
                        continue;
                    }
                    break;
                case 2:
                    int iMin = Math.min(10, this.A01);
                    byte[] bArr = this.A0A.A00;
                    if (A0D[1].length() != 20) {
                        A0D[4] = "l8YJPAfB3X";
                        if (A05(c45944v, bArr, iMin) && A05(c45944v, null, this.A01)) {
                            A01();
                            i |= this.A06 ? 4 : 0;
                            this.A0B.AGq(this.A04, i);
                            A03(3);
                        }
                    } else {
                        throw new RuntimeException();
                    }
                    break;
                case 3:
                    int iA07 = c45944v.A07();
                    int readLength = this.A02;
                    if (readLength != -1) {
                        int readLength2 = this.A02;
                        i3 = iA07 - readLength2;
                    }
                    if (i3 > 0) {
                        iA07 -= i3;
                        int iA09 = c45944v.A09() + iA07;
                        if (A0D[6].charAt(7) != '6') {
                            A0D[2] = "lFx9fkjTnk1xSHr5wh3B5PMDNRGZ6lqn";
                            c45944v.A0e(iA09);
                        }
                    }
                    this.A0B.A5A(c45944v);
                    int readLength3 = this.A02;
                    if (readLength3 != -1) {
                        int readLength4 = this.A02;
                        this.A02 = readLength4 - iA07;
                        int readLength5 = this.A02;
                        if (readLength5 == 0) {
                            this.A0B.AGp();
                            A03(1);
                        }
                    }
                    break;
                default:
                    throw new IllegalStateException();
            }
            throw new RuntimeException();
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5586LH
    public final void AAA(C460253 c460253, InterfaceC5332HA interfaceC5332HA, C5585LG c5585lg) {
        this.A05 = c460253;
        this.A0B.A5c(interfaceC5332HA, c5585lg);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5586LH
    public final void AJ5() {
        this.A03 = 0;
        this.A00 = 0;
        this.A09 = false;
        this.A0B.AJ5();
    }
}
