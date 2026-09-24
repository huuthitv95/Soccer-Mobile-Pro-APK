package com.facebook.ads.redexgen.core;

import com.facebook.ads.androidx.media3.common.Metadata;
import com.facebook.ads.androidx.media3.extractor.metadata.flac.PictureFrame;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.google.common.base.Ascii;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.HH */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
@MetaExoPlayerCustomization("Replaces ImmutableList.of with MetaExoPlayerCustomizedCollections")
public abstract class AbstractC5339HH {
    public static byte[] A00;
    public static String[] A01 = {"jaTfwC0cI533jMSLFdbnMioREeamNCq8", "oxYS1uYBjADPdRUL4vsR12VppXrr4BxP", "o9bG5hJtiKIeIPN2CaXw8mH6vllsT8Pg", "8s8MZLb5TSIkvuwEDH", "W6kvFYauQlSyWCDb8CQhWvVbWb1Alqwq", "aw37R0CiGakhFrBRrvipxmkRXRxeCTzI", "Y2zfIeYjiYIsjSkQMxD0jwTDeetOAull", "DaiobFePrAznnRWN86LDTmrCW9O2HPvR"};

    public static String A06(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 112);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A08() {
        A00 = new byte[]{5, 34, 42, 47, 38, 39, 99, 55, 44, 99, 49, 38, 34, 39, 99, 5, Ascii.f22499SI, 2, 0, 99, 48, 55, 49, 38, 34, 46, 99, 46, 34, 49, 40, 38, 49, 109, 125, 82, 73, 72, 79, Ascii.ESC, 93, 73, 90, 86, 94, Ascii.ESC, 95, 84, 94, 72, Ascii.ESC, 85, 84, 79, Ascii.ESC, 72, 79, 90, 73, 79, Ascii.ESC, 76, 82, 79, 83, Ascii.ESC, 72, 66, 85, 88, Ascii.ESC, 88, 84, 95, 94, Ascii.NAK};
    }

    static {
        A08();
    }

    public static int A00(InterfaceC7263ms interfaceC7263ms) throws IOException {
        interfaceC7263ms.AIl();
        C45944v c45944v = new C45944v(2);
        interfaceC7263ms.AGt(c45944v.A0l(), 0, 2);
        int syncCode = c45944v.A0M();
        int frameStartMarker = syncCode >> 2;
        if (frameStartMarker == 16382) {
            interfaceC7263ms.AIl();
            return syncCode;
        }
        interfaceC7263ms.AIl();
        throw C44963K.A01(A06(34, 42, 75), null);
    }

    public static Metadata A01(InterfaceC7263ms interfaceC7263ms, boolean z) throws IOException {
        InterfaceC5398IE id3FramePredicate;
        if (z) {
            id3FramePredicate = null;
        } else {
            id3FramePredicate = C48669U.A03;
        }
        Metadata metadataA00 = new C5344HM().A00(interfaceC7263ms, id3FramePredicate);
        if (metadataA00 == null || metadataA00.A02() == 0) {
            return null;
        }
        return metadataA00;
    }

    public static Metadata A02(InterfaceC7263ms interfaceC7263ms, boolean z) throws IOException {
        interfaceC7263ms.AIl();
        long jA8i = interfaceC7263ms.A8i();
        Metadata metadataA01 = A01(interfaceC7263ms, z);
        interfaceC7263ms.AK3((int) (interfaceC7263ms.A8i() - jA8i));
        return metadataA01;
    }

    public static C5340HI A03(C45944v c45944v) {
        c45944v.A0g(1);
        int iA0K = c45944v.A0K();
        int length = c45944v.A09();
        long j = ((long) length) + ((long) iA0K);
        int i = iA0K / 18;
        long[] jArrCopyOf = new long[i];
        long[] jArrCopyOf2 = new long[i];
        for (int i2 = 0; i2 < i; i2++) {
            long jA0P = c45944v.A0P();
            if (jA0P == -1) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i2);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i2);
                break;
            }
            jArrCopyOf[i2] = jA0P;
            jArrCopyOf2[i2] = c45944v.A0P();
            c45944v.A0g(2);
        }
        int length2 = c45944v.A09();
        c45944v.A0g((int) (j - ((long) length2)));
        return new C5340HI(jArrCopyOf, jArrCopyOf2);
    }

    public static C5340HI A04(InterfaceC7263ms interfaceC7263ms, int i) throws IOException {
        C45944v c45944v = new C45944v(i);
        interfaceC7263ms.readFully(c45944v.A0l(), 0, i);
        return A03(c45944v);
    }

    public static C5341HJ A05(InterfaceC7263ms interfaceC7263ms) throws IOException {
        byte[] bArr = new byte[38];
        interfaceC7263ms.readFully(bArr, 0, 38);
        return new C5341HJ(bArr, 4);
    }

    public static List<String> A07(InterfaceC7263ms interfaceC7263ms, int i) throws IOException {
        C45944v c45944v = new C45944v(i);
        interfaceC7263ms.readFully(c45944v.A0l(), 0, i);
        c45944v.A0g(4);
        return Arrays.asList(AbstractC5368Hk.A05(c45944v, false, false).A02);
    }

    public static void A09(InterfaceC7263ms interfaceC7263ms) throws IOException {
        C45944v c45944v = new C45944v(4);
        interfaceC7263ms.readFully(c45944v.A0l(), 0, 4);
        if (c45944v.A0Q() == 1716281667) {
        } else {
            throw C44963K.A01(A06(0, 34, 51), null);
        }
    }

    public static boolean A0A(InterfaceC7263ms interfaceC7263ms) throws IOException {
        C45944v c45944v = new C45944v(4);
        interfaceC7263ms.AGt(c45944v.A0l(), 0, 4);
        return c45944v.A0Q() == 1716281667;
    }

    public static boolean A0B(InterfaceC7263ms interfaceC7263ms, C5338HG c5338hg) throws IOException {
        interfaceC7263ms.AIl();
        C45934u c45934u = new C45934u(new byte[4]);
        interfaceC7263ms.AGt(c45934u.A00, 0, 4);
        boolean zA0H = c45934u.A0H();
        int iA04 = c45934u.A04(7);
        int iA05 = c45934u.A04(24) + 4;
        if (iA04 == 0) {
            C5341HJ c5341hjA05 = A05(interfaceC7263ms);
            String[] strArr = A01;
            if (strArr[1].charAt(0) != strArr[2].charAt(0)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[1] = "oF2KQg39ZEK5V6OHUZM6u4PkuH0D3J87";
            strArr2[2] = "opWNo3Pnwj2PHBTvqD8r5OWylRW508kK";
            c5338hg.A00 = c5341hjA05;
        } else {
            C5341HJ c5341hj = c5338hg.A00;
            if (c5341hj != null) {
                if (iA04 != 3) {
                    if (iA04 == 4) {
                        c5338hg.A00 = c5341hj.A0B(A07(interfaceC7263ms, iA05));
                    } else if (iA04 == 6) {
                        C45944v c45944v = new C45944v(iA05);
                        interfaceC7263ms.readFully(c45944v.A0l(), 0, iA05);
                        c45944v.A0g(4);
                        PictureFrame pictureFrame = PictureFrame.A00(c45944v);
                        c5338hg.A00 = c5341hj.A0A(MetaExoPlayerCustomizedCollections.A03(pictureFrame));
                    } else {
                        interfaceC7263ms.AK3(iA05);
                    }
                } else {
                    c5338hg.A00 = c5341hj.A09(A04(interfaceC7263ms, iA05));
                }
            } else {
                throw new IllegalArgumentException();
            }
        }
        return zA0H;
    }
}
