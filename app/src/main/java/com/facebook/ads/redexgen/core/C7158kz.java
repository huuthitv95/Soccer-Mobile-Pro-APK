package com.facebook.ads.redexgen.core;

import android.net.Uri;
import android.util.Pair;
import com.google.common.base.Ascii;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.kz */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C7158kz implements InterfaceC5331H9 {
    public static byte[] A07;
    public static String[] A08 = {"DwCwNe", "sWjhkz5Jk0aFlWxF8RAhYepliqmDVBH5", "fJB4aZ6fjAPSNUZta8hrgw0qJ7r8hoM5", "QGFmFhkJVom57VKObFa8uqUV9", "rnOb7nHa90E2wPIfOCxC", "at6D0iA1D4bxl", "SWjjSn0lfORi", "B3tBBFyQt38AAQleoY5s"};
    public static final InterfaceC5335HD A09;
    public InterfaceC5332HA A04;
    public InterfaceC5361Hd A05;
    public InterfaceC5590LL A06;
    public int A01 = 0;
    public long A03 = -1;
    public int A00 = -1;
    public long A02 = -1;

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 34);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A07 = new byte[]{87, 91, 2, 39, 50, 39, 102, 35, 62, 37, 35, 35, 34, 53, 102, 47, 40, 54, 51, 50, 102, 42, 35, 40, 33, 50, 46, 124, 102, 39, Ascii.f22493FS, 1, 7, 2, 2, Ascii.f22494GS, 0, 6, Ascii.ETB, Ascii.SYN, 82, 37, 51, 36, 82, Ascii.DC4, Ascii.f22494GS, 0, Ascii.f22502US, 19, 6, 82, 6, Ascii.f22503VT, 2, Ascii.ETB, 72, 82, 127, 68, 89, 95, 90, 90, 69, 88, 94, 79, 78, 10, 69, 88, 10, 95, 68, 88, 79, 73, 69, 77, 68, 67, 80, 79, 78, 10, 93, 75, 92, 10, 76, 67, 70, 79, 10, 94, 83, 90, 79, 4, 103, 81, 70, 117, 72, 68, 66, 81, 83, 68, 95, 66, 17, 5, Ascii.DC4, Ascii.f22491EM, Ascii.f22502US, 95, Ascii.ETB, 71, 65, 65, 93, 17, Ascii.f22493FS, 17, 7, 127, 107, 122, 119, 113, 49, 121, 41, 47, 47, 51, 115, 114, 127, 105, 55, 35, 50, 63, 57, 121, 36, 55, 33};
    }

    static {
        A03();
        A09 = new InterfaceC5335HD() { // from class: com.facebook.ads.redexgen.X.l2
            @Override // com.facebook.ads.redexgen.core.InterfaceC5335HD
            public final InterfaceC5331H9[] A5N() {
                return C7158kz.A08();
            }

            @Override // com.facebook.ads.redexgen.core.InterfaceC5335HD
            public final /* synthetic */ InterfaceC5331H9[] A5O(Uri uri, Map map) {
                return AbstractC5334HC.A01(this, uri, map);
            }
        };
    }

    private int A00(InterfaceC7263ms interfaceC7263ms) throws IOException {
        AbstractC45353y.A08(this.A02 != -1);
        return ((InterfaceC5590LL) AbstractC45353y.A01(this.A06)).AIt(interfaceC7263ms, this.A02 - interfaceC7263ms.A8n()) ? -1 : 0;
    }

    @EnsuresNonNull({"extractorOutput", "trackOutput"})
    private void A02() {
        AbstractC45353y.A02(this.A05);
    }

    private void A04(InterfaceC7263ms interfaceC7263ms) throws IOException {
        AbstractC45353y.A08(interfaceC7263ms.A8n() == 0);
        int i = this.A00;
        if (A08[5].length() != 13) {
            throw new RuntimeException();
        }
        String[] strArr = A08;
        strArr[7] = "oJOrgM3DzNUfWcxP3ghI";
        strArr[4] = "cZhhMb4kvP2y4vGeSU9A";
        if (i != -1) {
            interfaceC7263ms.AK3(this.A00);
            this.A01 = 4;
        } else {
            if (AbstractC5594LP.A06(interfaceC7263ms)) {
                interfaceC7263ms.AK3((int) (interfaceC7263ms.A8i() - interfaceC7263ms.A8n()));
                this.A01 = 1;
                return;
            }
            throw C44963K.A01(A01(58, 42, 8), null);
        }
    }

    @RequiresNonNull({"extractorOutput", "trackOutput"})
    private void A05(InterfaceC7263ms interfaceC7263ms) throws IOException {
        C5592LN wavFormat = AbstractC5594LP.A02(interfaceC7263ms);
        if (wavFormat.A03 == 17) {
            this.A06 = new C7160l1(this.A04, this.A05, wavFormat);
        } else if (wavFormat.A03 == 6) {
            this.A06 = new C7159l0(this.A04, this.A05, wavFormat, A01(112, 15, 82), -1);
        } else if (wavFormat.A03 == 7) {
            this.A06 = new C7159l0(this.A04, this.A05, wavFormat, A01(127, 15, 60), -1);
        } else {
            int iA00 = AbstractC5369Hl.A00(wavFormat.A03, wavFormat.A01);
            if (iA00 != 0) {
                this.A06 = new C7159l0(this.A04, this.A05, wavFormat, A01(142, 9, 116), iA00);
            } else {
                throw C44963K.A00(A01(29, 29, 80) + wavFormat.A03);
            }
        }
        this.A01 = 3;
    }

    private void A06(InterfaceC7263ms interfaceC7263ms) throws IOException {
        this.A03 = AbstractC5594LP.A00(interfaceC7263ms);
        this.A01 = 2;
    }

    private void A07(InterfaceC7263ms interfaceC7263ms) throws IOException {
        Pair<Long, Long> pairA01 = AbstractC5594LP.A01(interfaceC7263ms);
        this.A00 = ((Long) pairA01.first).intValue();
        long jLongValue = ((Long) pairA01.second).longValue();
        if (this.A03 != -1) {
            String[] strArr = A08;
            if (strArr[7].length() != strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A08;
            strArr2[3] = "zD8CpsX01ISLh3RSws8RgUnhS";
            strArr2[6] = "h3zG6U6JIHw0";
            if (jLongValue == 4294967295L) {
                jLongValue = this.A03;
            }
        }
        this.A02 = ((long) this.A00) + jLongValue;
        long jA8O = interfaceC7263ms.A8O();
        if (jA8O != -1 && this.A02 > jA8O) {
            AbstractC45794g.A07(A01(100, 12, 18), A01(2, 27, 100) + this.A02 + A01(0, 2, 89) + jA8O);
            this.A02 = jA8O;
        }
        ((InterfaceC5590LL) AbstractC45353y.A01(this.A06)).AA8(this.A00, this.A02);
        this.A01 = 4;
    }

    public static /* synthetic */ InterfaceC5331H9[] A08() {
        return new InterfaceC5331H9[]{new C7158kz()};
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5331H9
    public final void AAC(InterfaceC5332HA interfaceC5332HA) {
        this.A04 = interfaceC5332HA;
        this.A05 = interfaceC5332HA.AKS(0, 1);
        interfaceC5332HA.A6O();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5331H9
    public final int AHL(InterfaceC7263ms interfaceC7263ms, C5353HV c5353hv) throws IOException {
        A02();
        switch (this.A01) {
            case 0:
                A04(interfaceC7263ms);
                return 0;
            case 1:
                A06(interfaceC7263ms);
                if (A08[5].length() != 13) {
                    throw new RuntimeException();
                }
                String[] strArr = A08;
                strArr[3] = "VLLh2GyvdfrrOjqYmUQdrqO3c";
                strArr[6] = "Miu4m4vLnYY2";
                return 0;
            case 2:
                A05(interfaceC7263ms);
                return 0;
            case 3:
                A07(interfaceC7263ms);
                return 0;
            case 4:
                return A00(interfaceC7263ms);
            default:
                throw new IllegalStateException();
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5331H9
    public final void AHb() {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5331H9
    public final void AJ6(long j, long j2) {
        this.A01 = j == 0 ? 0 : 4;
        if (this.A06 != null) {
            this.A06.AIk(j2);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5331H9
    public final boolean AK5(InterfaceC7263ms interfaceC7263ms) throws IOException {
        return AbstractC5594LP.A06(interfaceC7263ms);
    }
}
