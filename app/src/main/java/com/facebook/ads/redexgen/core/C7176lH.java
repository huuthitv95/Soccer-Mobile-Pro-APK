package com.facebook.ads.redexgen.core;

import com.google.common.base.Ascii;
import java.util.Arrays;
import java.util.Collections;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.lH */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C7176lH implements InterfaceC5564Kv {
    public static byte[] A0L;
    public static String[] A0M = {"j9JFF3HN4WHOogTAo3Zp2vJcrDXalLKC", "xTu", "o", "YpEMu", "L", "xqkbJV3NP5tWtCpR6dlW7fuQWbu0Okpq", "9ZwPJyvjhOXD2", "3pAsgJTRE4XOqhE7"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public long A09;
    public long A0A;
    public C7472qI A0C;
    public InterfaceC5361Hd A0D;
    public String A0E;
    public String A0F;
    public boolean A0G;
    public boolean A0H;
    public final String A0K;
    public final C45944v A0J = new C45944v(1024);
    public final C45934u A0I = new C45934u(this.A0J.A0l());
    public long A0B = -9223372036854775807L;

    public static String A03(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0L, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A0M;
            if (strArr[2].length() != strArr[4].length()) {
                throw new RuntimeException();
            }
            A0M[5] = "ZyB29Ut14cj6jISqnQaPpNUB2bA7E60q";
            if (i4 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 57);
            i4++;
        }
    }

    public static void A04() {
        A0L = new byte[]{3, Ascii.ETB, 6, Ascii.f22503VT, Ascii.f22490CR, 77, Ascii.f22499SI, Ascii.DC2, 86, 3, 79, Ascii.f22500SO, 3, Ascii.SYN, Ascii.f22499SI};
    }

    static {
        A04();
    }

    public C7176lH(String str) {
        this.A0K = str;
    }

    private int A00(C45934u c45934u) throws C44963K {
        int iA01 = c45934u.A01();
        C5308Gm config = AbstractC5309Gn.A02(c45934u, true);
        this.A0E = config.A02;
        int bitsLeft = config.A01;
        this.A05 = bitsLeft;
        int bitsLeft2 = config.A00;
        this.A02 = bitsLeft2;
        int bitsLeft3 = c45934u.A01();
        return iA01 - bitsLeft3;
    }

    private int A01(C45934u c45934u) throws C44963K {
        int tmp;
        int i = 0;
        int muxSlotLengthBytes = this.A03;
        if (muxSlotLengthBytes == 0) {
            do {
                tmp = c45934u.A04(8);
                i += tmp;
            } while (tmp == 255);
            return i;
        }
        throw C44963K.A01(null, null);
    }

    public static long A02(C45934u c45934u) {
        int bytesForValue = c45934u.A04(2);
        return c45934u.A04((bytesForValue + 1) * 8);
    }

    private void A05(int i) {
        this.A0J.A0d(i);
        this.A0I.A0D(this.A0J.A0l());
    }

    @RequiresNonNull({"output"})
    private void A06(C45934u c45934u) throws C44963K {
        boolean useSameStreamMux = c45934u.A0H();
        if (!useSameStreamMux) {
            this.A0H = true;
            A08(c45934u);
        } else {
            boolean useSameStreamMux2 = this.A0H;
            if (!useSameStreamMux2) {
                return;
            }
        }
        if (this.A00 == 0) {
            if (this.A04 == 0) {
                A09(c45934u, A01(c45934u));
                boolean useSameStreamMux3 = this.A0G;
                if (useSameStreamMux3) {
                    c45934u.A09((int) this.A09);
                    return;
                }
                return;
            }
            throw C44963K.A01(null, null);
        }
        throw C44963K.A01(null, null);
    }

    private void A07(C45934u c45934u) {
        this.A03 = c45934u.A04(3);
        switch (this.A03) {
            case 0:
                c45934u.A09(8);
                return;
            case 1:
                c45934u.A09(9);
                return;
            case 2:
            default:
                throw new IllegalStateException();
            case 3:
            case 4:
            case 5:
                c45934u.A09(6);
                return;
            case 6:
            case 7:
                c45934u.A09(1);
                return;
        }
    }

    @RequiresNonNull({"output"})
    private void A08(C45934u c45934u) throws C44963K {
        int iA04;
        boolean zA0H;
        int iA05 = c45934u.A04(1);
        if (iA05 == 1) {
            iA04 = c45934u.A04(1);
        } else {
            iA04 = 0;
        }
        this.A00 = iA04;
        if (this.A00 == 0) {
            if (iA05 == 1) {
                A02(c45934u);
            }
            if (c45934u.A0H()) {
                this.A04 = c45934u.A04(6);
                int iA06 = c45934u.A04(4);
                int audioMuxVersion = A0M[5].charAt(25);
                if (audioMuxVersion != 98) {
                    throw new RuntimeException();
                }
                A0M[5] = "b1jqAFGEyfNrz2WgotNy1OFmmbCQivCc";
                int iA07 = c45934u.A04(3);
                if (iA06 == 0 && iA07 == 0) {
                    if (iA05 == 0) {
                        int iA03 = c45934u.A03();
                        int audioMuxVersion2 = A00(c45934u);
                        c45934u.A08(iA03);
                        byte[] bArr = new byte[(audioMuxVersion2 + 7) / 8];
                        c45934u.A0F(bArr, 0, audioMuxVersion2);
                        C7472qI c7472qIA14 = new C44672p().A0y(this.A0F).A11(A03(0, 15, 91)).A0w(this.A0E).A0b(this.A02).A0m(this.A05).A12(Collections.singletonList(bArr)).A10(this.A0K).A14();
                        if (!c7472qIA14.equals(this.A0C)) {
                            this.A0C = c7472qIA14;
                            this.A0A = 1024000000 / ((long) c7472qIA14.A0G);
                            this.A0D.A6e(c7472qIA14);
                        }
                    } else {
                        int audioMuxVersion3 = (int) A02(c45934u);
                        c45934u.A09(audioMuxVersion3 - A00(c45934u));
                    }
                    A07(c45934u);
                    this.A0G = c45934u.A0H();
                    this.A09 = 0L;
                    if (this.A0G) {
                        if (iA05 == 1) {
                            this.A09 = A02(c45934u);
                        } else {
                            do {
                                zA0H = c45934u.A0H();
                                this.A09 = (this.A09 << 8) + ((long) c45934u.A04(8));
                            } while (zA0H);
                        }
                    }
                    boolean crcCheckPresent = c45934u.A0H();
                    if (crcCheckPresent) {
                        c45934u.A09(8);
                        return;
                    }
                    return;
                }
                throw C44963K.A01(null, null);
            }
            throw C44963K.A01(null, null);
        }
        throw C44963K.A01(null, null);
    }

    @RequiresNonNull({"output"})
    private void A09(C45934u c45934u, int i) {
        int iA03 = c45934u.A03();
        int bitPosition = iA03 & 7;
        if (bitPosition == 0) {
            int bitPosition2 = iA03 >> 3;
            this.A0J.A0f(bitPosition2);
        } else {
            int bitPosition3 = i * 8;
            c45934u.A0F(this.A0J.A0l(), 0, bitPosition3);
            this.A0J.A0f(0);
        }
        this.A0D.AIr(this.A0J, i);
        if (this.A0B != -9223372036854775807L) {
            this.A0D.AIu(this.A0B, 1, i, 0, null);
            this.A0B += this.A0A;
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5564Kv
    public final void A5A(C45944v c45944v) throws C44963K {
        AbstractC45353y.A02(this.A0D);
        while (c45944v.A07() > 0) {
            switch (this.A08) {
                case 0:
                    int secondByte = c45944v.A0I();
                    if (secondByte == 86) {
                        this.A08 = 1;
                    }
                    break;
                case 1:
                    int iA0I = c45944v.A0I();
                    if ((iA0I & 224) == 224) {
                        this.A07 = iA0I;
                        this.A08 = 2;
                    } else if (iA0I != 86) {
                        this.A08 = 0;
                    }
                    break;
                case 2:
                    int bytesToRead = this.A07;
                    this.A06 = ((bytesToRead & (-225)) << 8) | c45944v.A0I();
                    if (this.A06 > this.A0J.A0l().length) {
                        A05(this.A06);
                    }
                    this.A01 = 0;
                    this.A08 = 3;
                    break;
                case 3:
                    int iMin = Math.min(c45944v.A07(), this.A06 - this.A01);
                    byte[] bArr = this.A0I.A00;
                    int bytesToRead2 = this.A01;
                    c45944v.A0k(bArr, bytesToRead2, iMin);
                    int bytesToRead3 = this.A01;
                    this.A01 = bytesToRead3 + iMin;
                    int i = this.A01;
                    int bytesToRead4 = this.A06;
                    if (i == bytesToRead4) {
                        this.A0I.A08(0);
                        A06(this.A0I);
                        this.A08 = 0;
                    }
                    break;
                default:
                    throw new IllegalStateException();
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5564Kv
    public final void A5c(InterfaceC5332HA interfaceC5332HA, C5585LG c5585lg) {
        c5585lg.A05();
        this.A0D = interfaceC5332HA.AKS(c5585lg.A03(), 1);
        this.A0F = c5585lg.A04();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5564Kv
    public final void AGp() {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5564Kv
    public final void AGq(long j, int i) {
        if (j != -9223372036854775807L) {
            this.A0B = j;
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5564Kv
    public final void AJ5() {
        this.A08 = 0;
        this.A0B = -9223372036854775807L;
        this.A0H = false;
    }
}
