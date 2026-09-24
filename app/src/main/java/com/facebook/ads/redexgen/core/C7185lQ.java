package com.facebook.ads.redexgen.core;

import androidx.core.app.FrameMetricsAggregator;
import com.google.android.material.internal.ViewUtils;
import java.util.Arrays;
import java.util.Collections;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.lQ */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C7185lQ implements InterfaceC5564Kv {
    public static byte[] A0L;
    public static String[] A0M = {"mrTKvxULVENuxsX20WcrAJ4v", "LussONYVy0olIUlKNuZbFssmQ2DfHEVf", "zvJRCSTXMBsZ1hE0Mr7ze3FhUb04dJIh", "L0YacQwQPMjWe9KaI5mJ2LmFBjZFt0ZK", "1hx48ZBneHnM7bdYLzCUfsF2U1nSOVt0", "UVBTZnk6apz1fVZpxMzmfRHtaRIycLGw", "Y7M7p8C63xXJXfMDaPj4j21Etz7HrkAn", "dpgmp2dWdChOdFvADkjRIu4gRUIL2TAI"};
    public static final byte[] A0N;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public long A07;
    public long A08;
    public long A09;
    public InterfaceC5361Hd A0A;
    public InterfaceC5361Hd A0B;
    public InterfaceC5361Hd A0C;
    public String A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public final C45934u A0H;
    public final C45944v A0I;
    public final String A0J;
    public final boolean A0K;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0L, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 9);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A09() {
        A0L = new byte[]{99, 87, -103, -84, -85, 87, -104, -86, -86, -84, -92, -96, -91, -98, 87, 120, 120, 122, 87, -125, 122, 101, -98, -63, -47, -48, -81, -62, -66, -63, -62, -49, 77, 110, 125, 110, 108, 125, 110, 109, 41, 106, 126, 109, 114, 120, 41, 120, 107, 115, 110, 108, 125, 41, 125, -126, 121, 110, 67, 41, -47, -32, -32, -36, -39, -45, -47, -28, -39, -33, -34, -97, -39, -44, -93, -74, -54, -71, -66, -60, -124, -62, -59, -119, -74, -126, -63, -74, -55, -62};
    }

    static {
        A09();
        A0N = new byte[]{73, 68, 51};
    }

    public C7185lQ(boolean z) {
        this(z, null);
    }

    public C7185lQ(boolean z, String str) {
        this.A0H = new C45934u(new byte[7]);
        this.A0I = new C45944v(Arrays.copyOf(A0N, 10));
        A06();
        this.A03 = -1;
        this.A02 = -1;
        this.A08 = -9223372036854775807L;
        this.A09 = -9223372036854775807L;
        this.A0K = z;
        this.A0J = str;
    }

    @EnsuresNonNull({"output", "currentOutput", "id3Output"})
    private void A01() {
        AbstractC45353y.A01(this.A0C);
    }

    @RequiresNonNull({"output"})
    private void A02() throws C44963K {
        this.A0H.A08(0);
        if (!this.A0G) {
            int iA04 = this.A0H.A04(2) + 1;
            if (iA04 != 2) {
                AbstractC45794g.A07(A00(22, 10, 84), A00(32, 28, 0) + iA04 + A00(0, 22, 46));
                iA04 = 2;
            }
            this.A0H.A09(5);
            int iA05 = this.A0H.A04(3);
            int audioObjectType = this.A02;
            byte[] bArrA07 = AbstractC5309Gn.A07(iA04, audioObjectType, iA05);
            C5308Gm aacConfig = AbstractC5309Gn.A03(bArrA07);
            C44672p c44672pA0w = new C44672p().A0y(this.A0D).A11(A00(75, 15, 76)).A0w(aacConfig.A02);
            int audioObjectType2 = aacConfig.A00;
            C44672p c44672pA0b = c44672pA0w.A0b(audioObjectType2);
            int audioObjectType3 = aacConfig.A01;
            C7472qI c7472qIA14 = c44672pA0b.A0m(audioObjectType3).A12(Collections.singletonList(bArrA07)).A10(this.A0J).A14();
            int audioObjectType4 = c7472qIA14.A0G;
            this.A08 = 1024000000 / ((long) audioObjectType4);
            this.A0C.A6e(c7472qIA14);
            this.A0G = true;
        } else {
            this.A0H.A09(10);
        }
        this.A0H.A09(4);
        int iA06 = (this.A0H.A04(13) - 2) - 5;
        boolean z = this.A0F;
        String[] strArr = A0M;
        String str = strArr[5];
        String str2 = strArr[1];
        int iCharAt = str.charAt(31);
        int sampleSize = str2.charAt(31);
        if (iCharAt == sampleSize) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0M;
        strArr2[5] = "giOljvViomSrN4IHC4QybJTR7ABLuXqE";
        strArr2[1] = "jFLriiyuw9puslkouPTFj8AuXirD2Rvz";
        if (z) {
            iA06 -= 2;
        }
        A0D(this.A0C, this.A08, 0, iA06);
    }

    @RequiresNonNull({"id3Output"})
    private void A03() {
        this.A0B.AIr(this.A0I, 10);
        this.A0I.A0f(6);
        A0D(this.A0B, 0L, 10, this.A0I.A0H() + 10);
    }

    private void A04() {
        this.A0E = false;
        A06();
    }

    private void A05() {
        this.A06 = 1;
        this.A00 = 0;
    }

    private void A06() {
        this.A06 = 0;
        this.A00 = 0;
        this.A04 = 256;
    }

    private void A07() {
        this.A06 = 3;
        this.A00 = 0;
    }

    private void A08() {
        this.A06 = 2;
        this.A00 = A0N.length;
        this.A05 = 0;
        this.A0I.A0f(0);
    }

    private void A0A(C45944v c45944v) {
        if (c45944v.A07() == 0) {
            return;
        }
        this.A0H.A00[0] = c45944v.A0l()[c45944v.A09()];
        this.A0H.A08(2);
        int iA04 = this.A0H.A04(4);
        if (this.A02 != -1) {
            int i = this.A02;
            String[] strArr = A0M;
            String str = strArr[5];
            String str2 = strArr[1];
            int iCharAt = str.charAt(31);
            int currentFrameSampleRateIndex = str2.charAt(31);
            if (iCharAt == currentFrameSampleRateIndex) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0M;
            strArr2[2] = "gsvCXwBusIGEB1WA3fanWinNUC0stLKn";
            strArr2[4] = "jdr5Xoms36XQNA1pdvYLzBfLUyE1GaLW";
            if (iA04 != i) {
                A04();
                return;
            }
        }
        if (!this.A0E) {
            this.A0E = true;
            int currentFrameSampleRateIndex2 = this.A01;
            this.A03 = currentFrameSampleRateIndex2;
            this.A02 = iA04;
        }
        A07();
    }

    private void A0B(C45944v c45944v) {
        byte[] bArrA0l = c45944v.A0l();
        int iA09 = c45944v.A09();
        int iA0A = c45944v.A0A();
        while (iA09 < iA0A) {
            int endOffset = iA09 + 1;
            int i = bArrA0l[iA09] & 255;
            if (this.A04 == 512 && A0E((byte) -1, (byte) i) && (this.A0E || A0G(c45944v, endOffset - 2))) {
                this.A01 = (i & 8) >> 3;
                this.A0F = (i & 1) == 0;
                if (!this.A0E) {
                    A05();
                } else {
                    A07();
                }
                c45944v.A0f(endOffset);
                return;
            }
            switch (this.A04 | i) {
                case 329:
                    this.A04 = ViewUtils.EDGE_TO_EDGE_FLAGS;
                    iA09 = endOffset;
                    break;
                case FrameMetricsAggregator.EVERY_DURATION /* 511 */:
                    this.A04 = 512;
                    iA09 = endOffset;
                    break;
                case 836:
                    this.A04 = 1024;
                    iA09 = endOffset;
                    break;
                case 1075:
                    A08();
                    c45944v.A0f(endOffset);
                    return;
                default:
                    int data = this.A04;
                    if (data != 256) {
                        this.A04 = 256;
                        iA09 = endOffset - 1;
                        int data2 = A0M[3].charAt(30);
                        if (data2 == 52) {
                            throw new RuntimeException();
                        }
                        String[] strArr = A0M;
                        strArr[5] = "GFWHNKn9X7s15i1eiUIDtSq2eHiOoz5U";
                        strArr[1] = "NE8NIWAGBkU3RGGIPZnBOUiADBs4e2Uh";
                    } else {
                        iA09 = endOffset;
                    }
                    break;
            }
        }
        c45944v.A0f(iA09);
    }

    @RequiresNonNull({"currentOutput"})
    private void A0C(C45944v c45944v) {
        int iMin = Math.min(c45944v.A07(), this.A05 - this.A00);
        this.A0A.AIr(c45944v, iMin);
        int bytesToRead = this.A00;
        this.A00 = bytesToRead + iMin;
        int i = this.A00;
        int bytesToRead2 = this.A05;
        if (i == bytesToRead2) {
            if (this.A09 != -9223372036854775807L) {
                this.A0A.AIu(this.A09, 1, this.A05, 0, null);
                this.A09 += this.A07;
            }
            A06();
        }
    }

    private void A0D(InterfaceC5361Hd interfaceC5361Hd, long j, int i, int i2) {
        this.A06 = 4;
        this.A00 = i;
        this.A0A = interfaceC5361Hd;
        this.A07 = j;
        this.A05 = i2;
    }

    private boolean A0E(byte b, byte b2) {
        return A0F(((b & 255) << 8) | (b2 & 255));
    }

    public static boolean A0F(int i) {
        return (65526 & i) == 65520;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0078 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:26:0x0079  */
    /* JADX WARN: Code duplicated, block: B:28:0x008b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:29:0x008c  */
    /* JADX WARN: Code duplicated, block: B:31:0x0097 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:32:0x0098  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ba A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:40:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:44:0x00cf A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:46:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:49:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:51:0x00dd A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:52:0x00de  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:55:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:57:0x00eb A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:58:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f4 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:61:0x00f5 A[RETURN, SYNTHETIC] */
    private boolean A0G(C45944v c45944v, int i) {
        int iA04;
        byte[] bArrA0l;
        int dataLimit;
        int i2;
        int nextSyncPosition;
        int currentFrameVersion;
        int currentFrameVersion2;
        int currentFrameVersion3;
        int currentFrameVersion4;
        int currentFrameVersion5;
        int currentFrameVersion6;
        int currentFrameVersion7;
        c45944v.A0f(i + 1);
        if (!A0I(c45944v, this.A0H.A00, 1)) {
            return false;
        }
        this.A0H.A08(4);
        int iA05 = this.A0H.A04(1);
        int currentFrameVersion8 = this.A03;
        if (currentFrameVersion8 != -1) {
            int currentFrameVersion9 = this.A03;
            if (iA05 != currentFrameVersion9) {
                return false;
            }
        }
        int currentFrameVersion10 = this.A02;
        if (currentFrameVersion10 != -1) {
            C45934u c45934u = this.A0H;
            String[] strArr = A0M;
            String str = strArr[6];
            String str2 = strArr[7];
            int iCharAt = str.charAt(30);
            int currentFrameVersion11 = str2.charAt(30);
            if (iCharAt == currentFrameVersion11) {
                A0M[3] = "jLrw1acULskGm0062b4gZF3kQyMgNqoA";
                if (!A0I(c45944v, c45934u.A00, 1)) {
                    return true;
                }
                this.A0H.A08(2);
                int iA06 = this.A0H.A04(4);
                int currentFrameVersion12 = this.A02;
                if (iA06 != currentFrameVersion12) {
                    return false;
                }
                int currentFrameVersion13 = i + 2;
                c45944v.A0f(currentFrameVersion13);
                if (!A0I(c45944v, this.A0H.A00, 4)) {
                    return true;
                }
                this.A0H.A08(14);
                iA04 = this.A0H.A04(13);
                if (iA04 < 7) {
                    return false;
                }
                bArrA0l = c45944v.A0l();
                dataLimit = c45944v.A0A();
                i2 = i + iA04;
                if (i2 >= dataLimit) {
                    return true;
                }
                nextSyncPosition = bArrA0l[i2];
                if (A0M[0].length() == 24) {
                    String[] strArr2 = A0M;
                    strArr2[2] = "CseuUypkgzVyQ9FeMZonHsAsUfwYiVF8";
                    strArr2[4] = "Ey77lIcw04xWGEhpgcU1ARBrUIvYEeZM";
                    if (nextSyncPosition == -1) {
                        currentFrameVersion5 = i2 + 1;
                        if (currentFrameVersion5 == dataLimit) {
                            return true;
                        }
                        currentFrameVersion6 = i2 + 1;
                        if (A0E((byte) -1, bArrA0l[currentFrameVersion6])) {
                            currentFrameVersion7 = i2 + 1;
                            if (((bArrA0l[currentFrameVersion7] & 8) >> 3) == iA05) {
                                return true;
                            }
                        }
                        return false;
                    }
                    if (bArrA0l[i2] != 73) {
                        return false;
                    }
                    currentFrameVersion = i2 + 1;
                    if (currentFrameVersion == dataLimit) {
                        return true;
                    }
                    currentFrameVersion2 = i2 + 1;
                    if (bArrA0l[currentFrameVersion2] != 68) {
                        return false;
                    }
                    currentFrameVersion3 = i2 + 2;
                    if (currentFrameVersion3 == dataLimit) {
                        return true;
                    }
                    currentFrameVersion4 = i2 + 2;
                    if (bArrA0l[currentFrameVersion4] == 51) {
                        return true;
                    }
                    return false;
                }
            }
        } else {
            if (!A0I(c45944v, this.A0H.A00, 4)) {
                return true;
            }
            this.A0H.A08(14);
            iA04 = this.A0H.A04(13);
            if (iA04 < 7) {
                return false;
            }
            bArrA0l = c45944v.A0l();
            dataLimit = c45944v.A0A();
            i2 = i + iA04;
            if (i2 >= dataLimit) {
                return true;
            }
            nextSyncPosition = bArrA0l[i2];
            if (A0M[0].length() == 24) {
                String[] strArr3 = A0M;
                strArr3[2] = "CseuUypkgzVyQ9FeMZonHsAsUfwYiVF8";
                strArr3[4] = "Ey77lIcw04xWGEhpgcU1ARBrUIvYEeZM";
                if (nextSyncPosition == -1) {
                    currentFrameVersion5 = i2 + 1;
                    if (currentFrameVersion5 == dataLimit) {
                        return true;
                    }
                    currentFrameVersion6 = i2 + 1;
                    if (A0E((byte) -1, bArrA0l[currentFrameVersion6])) {
                        currentFrameVersion7 = i2 + 1;
                        if (((bArrA0l[currentFrameVersion7] & 8) >> 3) == iA05) {
                            return true;
                        }
                    }
                    return false;
                }
                if (bArrA0l[i2] != 73) {
                    return false;
                }
                currentFrameVersion = i2 + 1;
                if (currentFrameVersion == dataLimit) {
                    return true;
                }
                currentFrameVersion2 = i2 + 1;
                if (bArrA0l[currentFrameVersion2] != 68) {
                    return false;
                }
                currentFrameVersion3 = i2 + 2;
                if (currentFrameVersion3 == dataLimit) {
                    return true;
                }
                currentFrameVersion4 = i2 + 2;
                if (bArrA0l[currentFrameVersion4] == 51) {
                    return true;
                }
                return false;
            }
        }
        throw new RuntimeException();
    }

    private boolean A0H(C45944v c45944v, byte[] bArr, int i) {
        int iMin = Math.min(c45944v.A07(), i - this.A00);
        int bytesToRead = this.A00;
        c45944v.A0k(bArr, bytesToRead, iMin);
        int bytesToRead2 = this.A00;
        this.A00 = bytesToRead2 + iMin;
        int bytesToRead3 = this.A00;
        return bytesToRead3 == i;
    }

    private boolean A0I(C45944v c45944v, byte[] bArr, int i) {
        if (c45944v.A07() < i) {
            return false;
        }
        c45944v.A0k(bArr, 0, i);
        return true;
    }

    public final long A0J() {
        return this.A08;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5564Kv
    public final void A5A(C45944v c45944v) throws C44963K {
        A01();
        while (c45944v.A07() > 0) {
            switch (this.A06) {
                case 0:
                    A0B(c45944v);
                    break;
                case 1:
                    A0A(c45944v);
                    break;
                case 2:
                    if (A0H(c45944v, this.A0I.A0l(), 10)) {
                        A03();
                    }
                    break;
                case 3:
                    if (A0H(c45944v, this.A0H.A00, this.A0F ? 7 : 5)) {
                        A02();
                    }
                    break;
                case 4:
                    A0C(c45944v);
                    break;
                default:
                    throw new IllegalStateException();
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5564Kv
    public final void A5c(InterfaceC5332HA interfaceC5332HA, C5585LG c5585lg) {
        c5585lg.A05();
        this.A0D = c5585lg.A04();
        this.A0C = interfaceC5332HA.AKS(c5585lg.A03(), 1);
        this.A0A = this.A0C;
        if (this.A0K) {
            c5585lg.A05();
            this.A0B = interfaceC5332HA.AKS(c5585lg.A03(), 5);
            this.A0B.A6e(new C44672p().A0y(c5585lg.A04()).A11(A00(60, 15, 103)).A14());
            return;
        }
        this.A0B = new C7264mt();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5564Kv
    public final void AGp() {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5564Kv
    public final void AGq(long j, int i) {
        if (j != -9223372036854775807L) {
            this.A09 = j;
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5564Kv
    public final void AJ5() {
        this.A09 = -9223372036854775807L;
        A04();
    }
}
