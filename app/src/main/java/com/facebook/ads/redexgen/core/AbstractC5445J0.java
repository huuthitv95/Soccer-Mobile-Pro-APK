package com.facebook.ads.redexgen.core;

import android.util.Pair;
import com.facebook.ads.androidx.media3.common.ColorInfo;
import com.facebook.ads.androidx.media3.common.DrmInitData;
import com.facebook.ads.androidx.media3.common.Metadata;
import com.facebook.ads.androidx.media3.extractor.metadata.mp4.MdtaMetadataEntry;
import com.facebook.ads.androidx.media3.extractor.metadata.mp4.SmtaMetadataEntry;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.ironsource.InterfaceC11669Sd;
import com.ironsource.mediationsdk.demandOnly.InterfaceC12339e;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vungle.ads.internal.protos.Sdk;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.p300io.encoding.Base64;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.J0 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
@MetaExoPlayerCustomization(type = {"INCREASE_VISIBILITY"}, value = "To support OculusMp4Extractor")
public abstract class AbstractC5445J0 {
    public static byte[] A00;
    public static String[] A01 = {"3VpIAtFn", "NjWxo0tcAFilzYXB2gd1dub2S4KYfC0G", "7dc9OwNzjfbA4WDbGdH3UDrd", "kTLJpOKA", "odl5U202HvuloegJiYsgd2o0Bsn6ktlS", "Tqd8q9EAW1nxLdrfn3G624yWy86zlBE3", "GM6CYLF4x47fKf9mrP144TBtf3lMkKEe", "FJhXpGWKImafMZTrlZrsHtUKnb1aBvQ9"};
    public static final byte[] A02;

    @MetaExoPlayerCustomization("Needed for oculus customization")
    public static final int[] A03;

    /* JADX WARN: Code duplicated, block: B:51:0x0172  */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static ColorInfo A0B(C45944v c45944v) {
        C44542a c44542a = new C44542a();
        C45934u c45934u = new C45934u(c45944v.A0l());
        c45934u.A08(c45944v.A09() * 8);
        c45934u.A0A(1);
        c45934u.A04(3);
        c45934u.A09(6);
        c45934u.A0H();
        c45934u.A0H();
        c45934u.A09(13);
        c45934u.A07();
        int iA04 = c45934u.A04(4);
        String strA0M = A0M(178, 11, 68);
        if (iA04 != 1) {
            AbstractC45794g.A06(strA0M, A0M(593, 22, 87) + iA04);
            return c44542a.A03();
        }
        if (c45934u.A0H()) {
            AbstractC45794g.A06(strA0M, A0M(563, 30, 42));
            return c44542a.A03();
        }
        boolean zA0H = c45934u.A0H();
        c45934u.A07();
        if (zA0H && c45934u.A04(8) > 127) {
            AbstractC45794g.A06(strA0M, A0M(189, 18, 61));
            return c44542a.A03();
        }
        int iA05 = c45934u.A04(3);
        c45934u.A07();
        if (c45934u.A0H()) {
            AbstractC45794g.A06(strA0M, A0M(IronSourceError.ERROR_BN_LOAD_NO_CONFIG, 40, 96));
            return c44542a.A03();
        }
        if (c45934u.A0H()) {
            AbstractC45794g.A06(strA0M, A0M(655, 36, 7));
            return c44542a.A03();
        }
        if (c45934u.A0H()) {
            AbstractC45794g.A06(strA0M, A0M(494, 46, Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE));
            return c44542a.A03();
        }
        int iA06 = c45934u.A04(5);
        for (int i = 0; i <= iA06; i++) {
            c45934u.A09(12);
            if (c45934u.A04(5) > 7) {
                c45934u.A07();
            }
        }
        int iA07 = c45934u.A04(4);
        int iA08 = c45934u.A04(4);
        c45934u.A09(iA07 + 1);
        c45934u.A09(iA08 + 1);
        if (c45934u.A0H()) {
            c45934u.A09(7);
        }
        c45934u.A09(7);
        boolean zA0H2 = c45934u.A0H();
        if (zA0H2) {
            c45934u.A09(2);
        }
        boolean zA0H3 = c45934u.A0H();
        String[] strArr = A01;
        if (strArr[1].charAt(26) == strArr[6].charAt(26)) {
            throw new RuntimeException();
        }
        A01[2] = "spdqEdfVqdQubNKbzHaSCSbA";
        if ((zA0H3 ? 2 : c45934u.A04(1)) > 0) {
            boolean zA0H4 = c45934u.A0H();
            if (A01[5].charAt(23) != 'W') {
                A01[5] = "fpomjt14ZeQUreCUx8H2Qj9W8NeulNVr";
                if (!zA0H4) {
                    c45934u.A09(1);
                }
            } else {
                String[] strArr2 = A01;
                strArr2[7] = "VYuT40g5EEwFWTEBAX27ZdDSMSIcM78J";
                strArr2[4] = "WUQpgtHZDasrpP5hdEQLNs2AngJpMhTI";
                if (!zA0H4) {
                    c45934u.A09(1);
                }
            }
        }
        if (zA0H2) {
            c45934u.A09(3);
        }
        c45934u.A09(3);
        boolean zA0H5 = c45934u.A0H();
        if (iA05 == 2 && zA0H5) {
            c45934u.A07();
        }
        boolean z = iA05 != 1 && c45934u.A0H();
        if (c45934u.A0H()) {
            int iA09 = c45934u.A04(8);
            int iA010 = c45934u.A04(8);
            c44542a.A01(ColorInfo.A00(iA09)).A00(((z || iA09 != 1 || iA010 != 13 || c45934u.A04(8) != 0) ? c45934u.A04(1) : 1) != 1 ? 2 : 1).A02(ColorInfo.A01(iA010));
        }
        return c44542a.A03();
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static Metadata A0F(C7235mE c7235mE) {
        C7234mD c7234mDA07 = c7235mE.A07(1751411826);
        C7234mD c7234mDA08 = c7235mE.A07(1801812339);
        C7234mD c7234mDA09 = c7235mE.A07(1768715124);
        if (c7234mDA07 == null || c7234mDA08 == null || c7234mDA09 == null || A03(c7234mDA07.A00) != 1835299937) {
            return null;
        }
        C45944v c45944v = c7234mDA08.A00;
        c45944v.A0f(12);
        int iA0C = c45944v.A0C();
        String[] strArr = new String[iA0C];
        for (int i = 0; i < iA0C; i++) {
            int iA0C2 = c45944v.A0C();
            c45944v.A0g(4);
            strArr[i] = c45944v.A0W(iA0C2 - 8);
        }
        C45944v c45944v2 = c7234mDA09.A00;
        c45944v2.A0f(8);
        ArrayList arrayList = new ArrayList();
        while (c45944v2.A07() > 8) {
            int iA09 = c45944v2.A09();
            int iA0C3 = c45944v2.A0C();
            int iA0C4 = c45944v2.A0C() - 1;
            if (iA0C4 < 0 || iA0C4 >= strArr.length) {
                AbstractC45794g.A07(A0M(178, 11, 68), A0M(359, 41, 107) + iA0C4);
            } else {
                MdtaMetadataEntry mdtaMetadataEntryA09 = AbstractC5456JB.A09(c45944v2, iA09 + iA0C3, strArr[iA0C4]);
                if (mdtaMetadataEntryA09 != null) {
                    arrayList.add(mdtaMetadataEntryA09);
                }
            }
            c45944v2.A0f(iA09 + iA0C3);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C5441Iw A0G(C45944v c45944v, int i) {
        c45944v.A0f(i + 8 + 4);
        c45944v.A0g(1);
        A02(c45944v);
        c45944v.A0g(2);
        int iA0I = c45944v.A0I();
        if ((iA0I & 128) != 0) {
            c45944v.A0g(2);
        }
        if ((iA0I & 64) != 0) {
            c45944v.A0g(c45944v.A0I());
        }
        if ((iA0I & 32) != 0) {
            c45944v.A0g(2);
        }
        c45944v.A0g(1);
        A02(c45944v);
        String strA05 = AbstractC44953J.A05(c45944v.A0I());
        if (A0M(947, 10, 17).equals(strA05) || A0M(989, 13, Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE).equals(strA05) || A0M(1002, 16, 39).equals(strA05)) {
            return new C5441Iw(strA05, null, -1L, -1L);
        }
        c45944v.A0g(4);
        long jA0Q = c45944v.A0Q();
        long jA0Q2 = c45944v.A0Q();
        c45944v.A0g(1);
        int iA02 = A02(c45944v);
        byte[] bArr = new byte[iA02];
        c45944v.A0k(bArr, 0, iA02);
        if (jA0Q2 <= 0) {
            jA0Q2 = -1;
        }
        if (jA0Q <= 0) {
            jA0Q = -1;
        }
        return new C5441Iw(strA05, bArr, jA0Q2, jA0Q);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C5444Iz A0I(C45944v c45944v) {
        long jA0Q;
        int i;
        c45944v.A0f(8);
        int iA01 = AbstractC5439Iu.A01(c45944v.A0C());
        c45944v.A0g(iA01 == 0 ? 8 : 16);
        int iA0C = c45944v.A0C();
        c45944v.A0g(4);
        boolean z = true;
        int iA09 = c45944v.A09();
        int i2 = iA01 == 0 ? 4 : 8;
        for (int i3 = 0; i3 < i2; i3++) {
            if (c45944v.A0l()[iA09 + i3] != -1) {
                z = false;
                break;
            }
        }
        if (z) {
            c45944v.A0g(i2);
            jA0Q = -9223372036854775807L;
        } else {
            jA0Q = iA01 == 0 ? c45944v.A0Q() : c45944v.A0R();
            if (jA0Q == 0) {
                jA0Q = -9223372036854775807L;
            }
        }
        c45944v.A0g(16);
        int iA0C2 = c45944v.A0C();
        int iA0C3 = c45944v.A0C();
        c45944v.A0g(4);
        int iA0C4 = c45944v.A0C();
        int iA0C5 = c45944v.A0C();
        if (iA0C2 == 0 && iA0C3 == 65536 && iA0C4 == (-65536) && iA0C5 == 0) {
            i = 90;
        } else if (iA0C2 == 0 && iA0C3 == (-65536) && iA0C4 == 65536 && iA0C5 == 0) {
            i = 270;
        } else {
            i = (iA0C2 == (-65536) && iA0C3 == 0 && iA0C4 == 0 && iA0C5 == (-65536)) ? 180 : 0;
        }
        return new C5444Iz(iA0C, jA0Q, i);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @MetaExoPlayerCustomization(type = {"INCREASE_VISIBILITY"}, value = "To support OculusMp4Extractor")
    public static C5469JO A0J(C7235mE c7235mE, C7234mD c7234mD, long j, DrmInitData drmInitData, boolean z, boolean z2) throws C44963K {
        C7235mE c7235mEA06;
        long j2 = j;
        C7235mE c7235mE2 = (C7235mE) AbstractC45353y.A01(c7235mE.A06(1835297121));
        int iA01 = A01(A03(((C7234mD) AbstractC45353y.A01(c7235mE2.A07(1751411826))).A00));
        if (iA01 == -1) {
            return null;
        }
        C5444Iz c5444IzA0I = A0I(((C7234mD) AbstractC45353y.A01(c7235mE.A07(1953196132))).A00);
        if (j2 == -9223372036854775807L) {
            j2 = c5444IzA0I.A02;
        }
        long jA05 = A05(c7234mD.A00);
        long jA0U = j2 == -9223372036854775807L ? -9223372036854775807L : AbstractC46115C.A0U(j2, 1000000L, jA05);
        C7235mE c7235mE3 = (C7235mE) AbstractC45353y.A01(((C7235mE) AbstractC45353y.A01(c7235mE2.A06(1835626086))).A06(1937007212));
        Pair<Long, String> pairA06 = A06(((C7234mD) AbstractC45353y.A01(c7235mE2.A07(1835296868))).A00);
        C7234mD c7234mDA07 = c7235mE3.A07(1937011556);
        if (c7234mDA07 == null) {
            throw C44963K.A01(A0M(288, 63, 20), null);
        }
        C5443Iy c5443IyA0H = A0H(c7234mDA07.A00, c5444IzA0I.A00, c5444IzA0I.A01, (String) pairA06.second, drmInitData, z2);
        long[] jArr = null;
        long[] jArr2 = null;
        if (!z && (c7235mEA06 = c7235mE.A06(1701082227)) != null) {
            Pair<long[], long[]> pairA09 = A09(c7235mEA06);
            String[] strArr = A01;
            if (strArr[1].charAt(26) == strArr[6].charAt(26)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[7] = "IbqpVMf9BLmnuF5BFBlg7Wi48qFbo4Yh";
            strArr2[4] = "amD11xiy90bj3UvdeHvItss5MLCDKaRi";
            if (pairA09 != null) {
                jArr = (long[]) pairA09.first;
                jArr2 = (long[]) pairA09.second;
            }
        }
        if (c5443IyA0H.A02 == null) {
            return null;
        }
        return new C5469JO(c5444IzA0I.A00, iA01, ((Long) pairA06.first).longValue(), jA05, jA0U, c5443IyA0H.A02, c5443IyA0H.A01, c5443IyA0H.A03, c5443IyA0H.A00, jArr, jArr2);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C5470JP A0K(C45944v c45944v, int i, int i2, String str) {
        int i3 = i + 8;
        while (i3 - i < i2) {
            c45944v.A0f(i3);
            int iA0C = c45944v.A0C();
            if (c45944v.A0C() == 1952804451) {
                int iA01 = AbstractC5439Iu.A01(c45944v.A0C());
                c45944v.A0g(1);
                int i4 = 0;
                int i5 = 0;
                if (iA01 == 0) {
                    c45944v.A0g(1);
                } else {
                    int iA0I = c45944v.A0I();
                    i4 = (iA0I & 240) >> 4;
                    i5 = iA0I & 15;
                }
                boolean z = c45944v.A0I() == 1;
                int iA0I2 = c45944v.A0I();
                byte[] bArr = new byte[16];
                c45944v.A0k(bArr, 0, bArr.length);
                byte[] bArr2 = null;
                if (z && iA0I2 == 0) {
                    int iA0I3 = c45944v.A0I();
                    bArr2 = new byte[iA0I3];
                    c45944v.A0k(bArr2, 0, iA0I3);
                }
                return new C5470JP(z, str, iA0I2, bArr, i4, i5, bArr2);
            }
            i3 += iA0C;
        }
        return null;
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @MetaExoPlayerCustomization(type = {"INCREASE_VISIBILITY"}, value = "To support OculusMp4Extractor")
    public static C5472JR A0L(C5469JO c5469jo, C7235mE c7235mE, C5342HK c5342hk) throws C44963K {
        InterfaceC5442Ix c7232mB;
        long[] jArrCopyOf;
        int[] iArrCopyOf;
        long[] jArrCopyOf2;
        int[] iArrCopyOf2;
        String strA0M;
        long j;
        C5469JO c5469jo2;
        String strA0M2;
        long[] jArr;
        int i;
        int[] iArr;
        C7234mD c7234mDA07 = c7235mE.A07(1937011578);
        if (c7234mDA07 != null) {
            c7232mB = new C7233mC(c7234mDA07, c5469jo.A07);
        } else {
            C7234mD c7234mDA08 = c7235mE.A07(1937013298);
            if (c7234mDA08 == null) {
                throw C44963K.A01(A0M(400, 42, 111), null);
            }
            c7232mB = new C7232mB(c7234mDA08);
        }
        int iA8v = c7232mB.A8v();
        String[] strArr = A01;
        if (strArr[7].charAt(30) != strArr[4].charAt(30)) {
            A01[5] = "VWWx1kGHZbX2q2PAsWKgJgHWMUDi0u3b";
            if (iA8v == 0) {
                return new C5472JR(c5469jo, new long[0], new int[0], 0, new long[0], new int[0], 0L);
            }
            boolean z = false;
            C7234mD c7234mDA09 = c7235mE.A07(1937007471);
            if (c7234mDA09 == null) {
                z = true;
                c7234mDA09 = (C7234mD) AbstractC45353y.A01(c7235mE.A07(1668232756));
            }
            C45944v c45944v = c7234mDA09.A00;
            C45944v c45944v2 = ((C7234mD) AbstractC45353y.A01(c7235mE.A07(1937011555))).A00;
            C45944v c45944v3 = ((C7234mD) AbstractC45353y.A01(c7235mE.A07(1937011827))).A00;
            C7234mD c7234mDA010 = c7235mE.A07(1937011571);
            C45944v c45944v4 = c7234mDA010 != null ? c7234mDA010.A00 : null;
            C7234mD c7234mDA011 = c7235mE.A07(1668576371);
            C45944v c45944v5 = c7234mDA011 != null ? c7234mDA011.A00 : null;
            C5440Iv c5440Iv = new C5440Iv(c45944v2, c45944v, z);
            c45944v3.A0f(12);
            int iA0L = c45944v3.A0L() - 1;
            int iA0L2 = c45944v3.A0L();
            int iA0L3 = c45944v3.A0L();
            int iA0L4 = 0;
            int iA0L5 = 0;
            int iA0C = 0;
            if (c45944v5 != null) {
                c45944v5.A0f(12);
                iA0L5 = c45944v5.A0L();
            }
            int iA0L6 = -1;
            int iA0L7 = 0;
            if (c45944v4 != null) {
                c45944v4.A0f(12);
                iA0L7 = c45944v4.A0L();
                if (iA0L7 > 0) {
                    iA0L6 = c45944v4.A0L() - 1;
                } else {
                    c45944v4 = null;
                }
            }
            int iA8A = c7232mB.A8A();
            String str = c5469jo.A07.A0W;
            int i2 = 0;
            long j2 = 0;
            if (iA8A != -1 && (A0M(967, 9, 94).equals(str) || A0M(897, 15, 77).equals(str) || A0M(882, 15, 96).equals(str)) && iA0L == 0 && iA0L5 == 0 && iA0L7 == 0) {
                long[] jArr2 = new long[c5440Iv.A05];
                String[] strArr2 = A01;
                if (strArr2[1].charAt(26) != strArr2[6].charAt(26)) {
                    A01[2] = "it49YraTc1fDpxLwGLRBh0ec";
                    iArr = new int[c5440Iv.A05];
                } else {
                    String[] strArr3 = A01;
                    strArr3[0] = "cQxifTbk";
                    strArr3[3] = "kvbBtLxb";
                    iArr = new int[c5440Iv.A05];
                }
                while (c5440Iv.A02()) {
                    jArr2[c5440Iv.A00] = c5440Iv.A02;
                    iArr[c5440Iv.A00] = c5440Iv.A01;
                }
                C5448J3 c5448j3A00 = AbstractC5449J4.A00(iA8A, jArr2, iArr, iA0L3);
                jArrCopyOf = c5448j3A00.A04;
                iArrCopyOf = c5448j3A00.A03;
                i2 = c5448j3A00.A00;
                jArrCopyOf2 = c5448j3A00.A05;
                iArrCopyOf2 = c5448j3A00.A02;
                j = c5448j3A00.A01;
                c5469jo2 = c5469jo;
            } else {
                jArrCopyOf = new long[iA8v];
                iArrCopyOf = new int[iA8v];
                jArrCopyOf2 = new long[iA8v];
                iArrCopyOf2 = new int[iA8v];
                long j3 = 0;
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    strA0M = A0M(178, 11, 68);
                    if (i4 >= iA8v) {
                        i4 = iA8v;
                        break;
                    }
                    boolean zA02 = true;
                    while (i3 == 0) {
                        zA02 = c5440Iv.A02();
                        if (!zA02) {
                            break;
                        }
                        if (A01[5].charAt(23) != 'W') {
                            throw new RuntimeException();
                        }
                        A01[5] = "M5jbBIfsv36G8eW66Ax72viWGVpCEb4z";
                        j3 = c5440Iv.A02;
                        i3 = c5440Iv.A01;
                    }
                    if (!zA02) {
                        AbstractC45794g.A07(strA0M, A0M(442, 28, 94));
                        jArrCopyOf = Arrays.copyOf(jArrCopyOf, i4);
                        iArrCopyOf = Arrays.copyOf(iArrCopyOf, i4);
                        jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i4);
                        iArrCopyOf2 = Arrays.copyOf(iArrCopyOf2, i4);
                        break;
                    }
                    if (c45944v5 != null) {
                        while (iA0L4 == 0 && iA0L5 > 0) {
                            iA0L4 = c45944v5.A0L();
                            iA0C = c45944v5.A0C();
                            iA0L5--;
                        }
                        iA0L4--;
                    }
                    jArrCopyOf[i4] = j3;
                    iArrCopyOf[i4] = c7232mB.AHS();
                    if (iArrCopyOf[i4] > i2) {
                        i2 = iArrCopyOf[i4];
                    }
                    jArrCopyOf2[i4] = j2 + ((long) iA0C);
                    iArrCopyOf2[i4] = c45944v4 == null ? 1 : 0;
                    if (i4 == iA0L6) {
                        iArrCopyOf2[i4] = 1;
                        iA0L7--;
                        if (iA0L7 > 0) {
                            iA0L6 = ((C45944v) AbstractC45353y.A01(c45944v4)).A0L() - 1;
                        }
                    }
                    j2 += (long) iA0L3;
                    iA0L2--;
                    if (iA0L2 == 0 && iA0L > 0) {
                        iA0L2 = c45944v3.A0L();
                        iA0L3 = c45944v3.A0C();
                        iA0L--;
                    }
                    j3 += (long) iArrCopyOf[i4];
                    i3--;
                    i4++;
                }
                j = j2 + ((long) iA0C);
                boolean z2 = true;
                if (c45944v5 != null) {
                    while (iA0L5 > 0) {
                        if (c45944v5.A0L() != 0) {
                            z2 = false;
                            break;
                        }
                        c45944v5.A0C();
                        iA0L5--;
                    }
                }
                if (iA0L7 == 0 && iA0L2 == 0 && i3 == 0 && iA0L == 0 && iA0L4 == 0 && z2) {
                    c5469jo2 = c5469jo;
                } else {
                    c5469jo2 = c5469jo;
                    StringBuilder sbAppend = new StringBuilder().append(A0M(207, 32, 24)).append(c5469jo2.A00).append(A0M(144, 34, 36)).append(iA0L7).append(A0M(14, 35, 65)).append(iA0L2).append(A0M(85, 26, 14)).append(i3).append(A0M(111, 33, 41)).append(iA0L).append(A0M(49, 36, 31)).append(iA0L4);
                    if (!z2) {
                        strA0M2 = A0M(0, 14, 12);
                    } else if (A01[5].charAt(23) != 'W') {
                        strA0M2 = A0M(0, 0, 93);
                    } else {
                        String[] strArr4 = A01;
                        strArr4[7] = "aaylILcGBS6VDtnpev9y5b4BJZBYR2y3";
                        strArr4[4] = "0XgNPN0ZQsO4pNqGOHtpLFxyHM4aJjFv";
                        strA0M2 = A0M(0, 0, 93);
                    }
                    AbstractC45794g.A07(strA0M, sbAppend.append(strA0M2).toString());
                }
                iA8v = i4;
            }
            long j4 = c5469jo2.A06;
            if (A01[2].length() == 24) {
                String[] strArr5 = A01;
                strArr5[7] = "ipyvZTOv07cYtbuH1DKg84aCsuigBUI1";
                strArr5[4] = "ch7TyunNM6oXEfHdpbs8btnx2NdPJSj4";
                long jA0U = AbstractC46115C.A0U(j, 1000000L, j4);
                if (c5469jo2.A08 == null) {
                    AbstractC46115C.A13(jArrCopyOf2, 1000000L, c5469jo2.A06);
                    return new C5472JR(c5469jo, jArrCopyOf, iArrCopyOf, i2, jArrCopyOf2, iArrCopyOf2, jA0U);
                }
                if (c5469jo2.A08.length == 1 && c5469jo2.A03 == 1 && jArrCopyOf2.length >= 2) {
                    long j5 = ((long[]) AbstractC45353y.A01(c5469jo2.A09))[0];
                    long jA0U2 = j5 + AbstractC46115C.A0U(c5469jo2.A08[0], c5469jo2.A06, c5469jo2.A05);
                    if (A0V(jArrCopyOf2, j, j5, jA0U2)) {
                        long jA0U3 = AbstractC46115C.A0U(j5 - jArrCopyOf2[0], c5469jo2.A07.A0G, c5469jo2.A06);
                        long jA0U4 = AbstractC46115C.A0U(j - jA0U2, c5469jo2.A07.A0G, c5469jo2.A06);
                        if (jA0U3 != 0 || jA0U4 != 0) {
                            jArrCopyOf2 = jArrCopyOf2;
                            jArrCopyOf2 = jArrCopyOf2;
                            if (jA0U3 <= 2147483647L && jA0U4 <= 2147483647L) {
                                c5342hk.A00 = (int) jA0U3;
                                c5342hk.A01 = (int) jA0U4;
                                AbstractC46115C.A13(jArrCopyOf2, 1000000L, c5469jo2.A06);
                                return new C5472JR(c5469jo, jArrCopyOf, iArrCopyOf, i2, jArrCopyOf2, iArrCopyOf2, AbstractC46115C.A0U(c5469jo2.A08[0], 1000000L, c5469jo2.A05));
                            }
                        }
                    }
                }
                jArrCopyOf2 = jArrCopyOf2;
                jArrCopyOf2 = jArrCopyOf2;
                if (c5469jo2.A08.length == 1 && c5469jo2.A08[0] == 0) {
                    long j6 = ((long[]) AbstractC45353y.A01(c5469jo2.A09))[0];
                    for (int i5 = 0; i5 < jArrCopyOf2.length; i5++) {
                        jArrCopyOf2[i5] = AbstractC46115C.A0U(jArrCopyOf2[i5] - j6, 1000000L, c5469jo2.A06);
                    }
                    return new C5472JR(c5469jo, jArrCopyOf, iArrCopyOf, i2, jArrCopyOf2, iArrCopyOf2, AbstractC46115C.A0U(j - j6, 1000000L, c5469jo2.A06));
                }
                boolean z3 = c5469jo2.A03 == 1;
                int i6 = 0;
                int i7 = 0;
                boolean z4 = false;
                int[] iArr2 = new int[c5469jo2.A08.length];
                int[] iArr3 = new int[c5469jo2.A08.length];
                long[] jArr3 = c5469jo2.A09;
                if (A01[5].charAt(23) != 'W') {
                    jArr = (long[]) AbstractC45353y.A01(jArr3);
                    i = 0;
                } else {
                    String[] strArr6 = A01;
                    strArr6[0] = "YPXXFbwg";
                    strArr6[3] = "nX0rcUWc";
                    jArr = (long[]) AbstractC45353y.A01(jArr3);
                    i = 0;
                }
                while (i < c5469jo2.A08.length) {
                    long j7 = jArr[i];
                    if (j7 != -1) {
                        long jA0U5 = AbstractC46115C.A0U(c5469jo2.A08[i], c5469jo2.A06, c5469jo2.A05);
                        iArr2[i] = AbstractC46115C.A0L(jArrCopyOf2, j7, true, true);
                        iArr3[i] = AbstractC46115C.A0K(jArrCopyOf2, j7 + jA0U5, z3, false);
                        while (iArr2[i] < iArr3[i] && (iArrCopyOf2[iArr2[i]] & 1) == 0) {
                            iArr2[i] = iArr2[i] + 1;
                        }
                        i6 += iArr3[i] - iArr2[i];
                        String[] strArr7 = A01;
                        if (strArr7[1].charAt(26) != strArr7[6].charAt(26)) {
                            String[] strArr8 = A01;
                            strArr8[0] = "N8MUiUXq";
                            strArr8[3] = "O0bSFd8k";
                            z4 |= i7 != iArr2[i];
                            i7 = iArr3[i];
                        }
                    }
                    i++;
                }
                boolean z5 = z4 | (i6 != iA8v);
                long[] jArr4 = z5 ? new long[i6] : jArrCopyOf;
                int[] iArr4 = z5 ? new int[i6] : iArrCopyOf;
                if (z5) {
                    i2 = 0;
                }
                String[] strArr9 = A01;
                if (strArr9[7].charAt(30) != strArr9[4].charAt(30)) {
                    A01[5] = "xPfk6NQdScK777382m5CuwBWtM3rjqH6";
                    int[] iArr5 = z5 ? new int[i6] : iArrCopyOf2;
                    long[] jArr5 = new long[i6];
                    long j8 = 0;
                    int i8 = 0;
                    for (int i9 = 0; i9 < c5469jo2.A08.length; i9++) {
                        long j9 = c5469jo2.A09[i9];
                        int i10 = iArr2[i9];
                        int i11 = iArr3[i9];
                        if (z5) {
                            int i12 = i11 - i10;
                            System.arraycopy(jArrCopyOf, i10, jArr4, i8, i12);
                            System.arraycopy(iArrCopyOf, i10, iArr4, i8, i12);
                            System.arraycopy(iArrCopyOf2, i10, iArr5, i8, i12);
                        } else if (A01[5].charAt(23) != 'W') {
                            A01[2] = "bpFLG5yiCjaNBTatiJL832yJ";
                        } else {
                            String[] strArr10 = A01;
                            strArr10[0] = "uU6cy1oD";
                            strArr10[3] = "C1luViVj";
                        }
                        while (i10 < i11) {
                            jArr5[i8] = AbstractC46115C.A0U(j8, 1000000L, c5469jo2.A05) + AbstractC46115C.A0U(Math.max(0L, jArrCopyOf2[i10] - j9), 1000000L, c5469jo2.A06);
                            if (z5 && iArr4[i8] > i2) {
                                i2 = iArrCopyOf[i10];
                            }
                            i8++;
                            i10++;
                        }
                        j8 += c5469jo2.A08[i9];
                    }
                    return new C5472JR(c5469jo, jArr4, iArr4, i2, jArr5, iArr5, AbstractC46115C.A0U(j8, 1000000L, c5469jo2.A05));
                }
            }
        }
        throw new RuntimeException();
    }

    public static String A0M(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 102);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0P() {
        A00 = new byte[]{70, 74, 9, Ascii.f22498RS, Ascii.f22498RS, Ascii.f22491EM, 74, 3, 4, Ascii.f22493FS, Ascii.f22503VT, 6, 3, Ascii.f22500SO, Ascii.f22503VT, 7, 85, 66, 74, 70, 78, 73, 78, 73, SignedBytes.MAX_POWER_OF_TWO, 116, 70, 74, 87, 75, 66, 84, 102, 83, 115, 78, 74, 66, 84, 83, 70, 74, 87, 99, 66, 75, 83, 70, 7, 85, 89, Ascii.f22503VT, Ascii.f22493FS, Ascii.DC4, Ascii.CAN, Ascii.DLE, Ascii.ETB, Ascii.DLE, Ascii.ETB, Ascii.f22498RS, 42, Ascii.CAN, Ascii.DC4, 9, Ascii.NAK, Ascii.f22493FS, 10, 56, Ascii.f22490CR, 45, Ascii.DLE, Ascii.DC4, Ascii.f22493FS, 10, Ascii.f22490CR, Ascii.CAN, Ascii.DC4, 9, 54, Ascii.f22502US, Ascii.f22502US, 10, Ascii.f22493FS, Ascii.f22490CR, 89, 68, 72, Ascii.SUB, Ascii.f22490CR, 5, 9, 1, 6, 1, 6, Ascii.f22499SI, 59, 9, 5, Ascii.CAN, 4, Ascii.f22490CR, Ascii.ESC, 33, 6, 43, 0, Ascii.f22494GS, 6, 3, 72, 99, 111, Base64.padSymbol, 42, 34, 46, 38, 33, 38, 33, 40, Ascii.ESC, 38, 34, 42, 60, 59, 46, 34, 63, Ascii.f22503VT, 42, 35, 59, 46, Ascii.f22492FF, 39, 46, 33, 40, 42, 60, 111, 120, 98, 48, 39, 47, 35, 43, 44, 43, 44, 37, 17, 59, 44, 33, 42, 48, 45, 44, 43, 56, 35, 54, 43, 45, 44, 17, 35, 47, 50, 46, 39, 49, 98, 99, 86, 77, 79, 114, 67, 80, 81, 71, 80, 81, Ascii.f22498RS, 35, 56, 62, 40, 40, 50, 45, 62, 123, 52, 57, 46, 4, 40, 50, 33, 62, 55, Ascii.DLE, Ascii.f22494GS, 17, Ascii.DLE, Ascii.f22490CR, Ascii.ETB, Ascii.f22490CR, 10, Ascii.ESC, Ascii.DLE, 10, 94, Ascii.f22490CR, 10, Ascii.f22493FS, Ascii.DC2, 94, Ascii.f22493FS, 17, 6, 94, Ascii.CAN, 17, Ascii.f22492FF, 94, 10, Ascii.f22492FF, Ascii.f22502US, Ascii.f22494GS, Ascii.NAK, 94, 8, 47, 55, 32, 45, 40, 37, 97, 50, 32, 44, 49, 45, 36, 97, 51, 32, 53, 36, 97, 39, 46, 51, 97, 5, 46, 45, 35, 56, 97, Ascii.NAK, 51, 52, 36, 9, 5, 97, Ascii.f22492FF, Ascii.f22490CR, 17, 97, 50, 53, 51, 36, 32, 44, 123, 97, 63, 19, Ascii.f22498RS, Ascii.DC4, Ascii.f22494GS, 0, Ascii.f22502US, Ascii.ETB, Ascii.SYN, 82, 1, 19, Ascii.f22502US, 2, Ascii.f22498RS, Ascii.ETB, 82, 6, 19, Ascii.DLE, Ascii.f22498RS, Ascii.ETB, 82, 90, 1, 6, Ascii.DLE, Ascii.f22498RS, 91, 82, Ascii.f22502US, Ascii.ESC, 1, 1, Ascii.ESC, Ascii.f22493FS, Ascii.NAK, 82, 1, 19, Ascii.f22502US, 2, Ascii.f22498RS, Ascii.ETB, 82, Ascii.SYN, Ascii.ETB, 1, 17, 0, Ascii.ESC, 2, 6, Ascii.ESC, Ascii.f22494GS, Ascii.f22493FS, 82, 90, 1, 6, 1, Ascii.SYN, 91, 33, Ascii.f22498RS, Ascii.ESC, Ascii.f22494GS, 38, Ascii.f22503VT, Ascii.f22499SI, 10, 94, 102, 100, 125, 125, 104, 105, 45, 96, 104, 121, 108, 105, 108, 121, 108, 45, 122, 100, 121, 101, 45, 120, 99, 102, 99, 98, 122, 99, 45, 102, 104, 116, 45, 100, 99, 105, 104, 117, 55, 45, 93, 123, 104, 106, 98, 41, 97, 104, 122, 41, 103, 102, 41, 122, 104, 100, 121, 101, 108, 41, 125, 104, 107, 101, 108, 41, 122, 96, 115, 108, 41, 96, 103, 111, 102, 123, 100, 104, 125, 96, 102, 103, 109, 86, 93, SignedBytes.MAX_POWER_OF_TWO, 72, 93, 91, 76, 93, 92, Ascii.CAN, 93, 86, 92, Ascii.CAN, 87, 94, Ascii.CAN, 91, 80, 77, 86, 83, Ascii.CAN, 92, 89, 76, 89, 90, 97, 124, 122, 127, 127, 96, 125, 123, 106, 107, 47, 108, 96, 99, 96, 125, 47, 123, 118, 127, 106, 53, 47, 72, 115, 110, 104, 109, 109, 114, 111, 105, 120, 121, Base64.padSymbol, 116, 115, 116, 105, 116, 124, 113, 66, 121, 116, 110, 109, 113, 124, 100, 66, 121, 120, 113, 124, 100, 66, 109, 111, 120, 110, 120, 115, 105, 66, 123, 113, 124, 122, 105, 82, 79, 73, 76, 76, 83, 78, 72, 89, 88, Ascii.f22493FS, 81, 89, 88, 85, 93, Ascii.f22493FS, 78, 93, 72, 89, Ascii.DC2, Ascii.f22491EM, 34, 63, 57, 60, 60, 35, 62, 56, 41, 40, 108, 35, 46, 57, 19, 41, 52, 56, 41, 34, 63, 37, 35, 34, 19, 42, 32, 45, 43, 100, 95, 66, 68, 65, 65, 94, 67, 69, 84, 85, 17, 94, 83, 68, 110, 69, 72, 65, 84, Ascii.f22503VT, 17, 83, 104, 117, 115, 118, 118, 105, 116, 114, 99, 98, 38, 116, 99, 98, 115, 101, 99, 98, 89, 117, 114, 111, 106, 106, 89, 118, 111, 101, 114, 115, 116, 99, 89, 110, 99, 103, 98, 99, 116, 52, Ascii.f22499SI, Ascii.DC2, Ascii.DC4, 17, 17, Ascii.f22500SO, 19, Ascii.NAK, 4, 5, 65, Ascii.NAK, 8, Ascii.f22492FF, 8, Ascii.f22499SI, 6, 62, 8, Ascii.f22499SI, 7, Ascii.f22500SO, 62, 17, 19, 4, Ascii.DC2, 4, Ascii.f22499SI, Ascii.NAK, 62, 7, Ascii.f22490CR, 0, 6, 96, 113, 113, 109, 104, 98, 96, 117, 104, 110, 111, 46, 117, 117, 108, 109, 42, 121, 108, 109, 33, 48, 48, 44, 41, 35, 33, 52, 41, 47, 46, 111, 56, 109, 35, 33, 45, 37, 50, 33, 109, 45, 47, 52, 41, 47, 46, 78, 95, 95, 67, 70, 76, 78, 91, 70, SignedBytes.MAX_POWER_OF_TWO, 65, 0, 87, 2, 66, 95, Ascii.ESC, 2, 76, 74, 78, 2, Ascii.f22491EM, Ascii.f22502US, Ascii.ETB, 95, 78, 78, 82, 87, 93, 95, 74, 87, 81, 80, 17, 70, 19, 83, 78, 10, 19, 72, 74, 74, Base64.padSymbol, 44, 44, 48, 53, 63, Base64.padSymbol, 40, 53, 51, 50, 115, 36, 113, 45, 41, 53, 63, 55, 40, 53, 49, 57, 113, 40, 36, 111, 59, 80, 68, 85, 88, 94, Ascii.f22498RS, 2, 86, 65, 65, 58, 46, 63, 50, 52, 116, 58, 56, 104, 42, 62, 47, 34, 36, 100, 42, 40, 127, 46, 58, 43, 38, 32, 96, 46, 35, 46, 44, 34, 54, 39, 42, 44, 108, 34, 46, 49, 110, 52, 33, 77, 89, 72, 69, 67, 3, 73, 77, 79, Ascii.f22502US, 3, Ascii.ETB, 6, Ascii.f22503VT, Ascii.f22490CR, 77, 4, Ascii.f22500SO, 3, 1, 103, 115, 98, 111, 105, 41, 97, 49, 55, 55, 43, 103, 106, 103, 113, 74, 94, 79, 66, 68, 4, 76, Ascii.f22493FS, Ascii.SUB, Ascii.SUB, 6, 70, 71, 74, 92, 34, 54, 39, 42, 44, 108, 46, 43, 34, 114, Ascii.ETB, 3, Ascii.DC2, Ascii.f22502US, Ascii.f22491EM, 89, Ascii.ESC, Ascii.f22498RS, Ascii.ESC, 71, 96, 116, 101, 104, 110, 46, 108, 113, 53, 96, 44, 109, 96, 117, 108, Ascii.SYN, 2, 19, Ascii.f22498RS, Ascii.CAN, 88, Ascii.SUB, 7, Ascii.DC2, Ascii.DLE, 68, 80, 65, 76, 74, 10, 74, 85, 80, 86, 89, 77, 92, 81, 87, Ascii.ETB, 74, 89, 79, 74, 94, 79, 66, 68, 4, 95, 89, 94, 78, 6, 67, 79, 114, 102, 119, 122, 124, 60, 101, 125, 119, Base64.padSymbol, 119, 
        103, 96, 32, 52, 37, 40, 46, 110, 55, 47, 37, 111, 37, 53, 50, 111, 41, 37, 68, 80, 65, 76, 74, 10, 83, 75, 65, Ascii.f22503VT, 65, 81, 86, Ascii.f22503VT, 77, 65, Ascii.f22498RS, 85, 87, 74, 67, 76, 73, SignedBytes.MAX_POWER_OF_TWO, Ascii.CAN, 73, 71, 87, 88, 76, 93, 80, 86, Ascii.SYN, 79, 87, 93, Ascii.ETB, 93, 77, 74, Ascii.ETB, 76, 81, 93, 2, 73, 75, 86, 95, 80, 85, 92, 4, 73, Ascii.f22503VT, 54, 55, 54, 100, 87, 86, 87, 71, 79, 73, 66, 79, 50, 52, 63, 34, 74, 65, SignedBytes.MAX_POWER_OF_TWO, 69, 77, 104, 93, 70, 68, 122, SignedBytes.MAX_POWER_OF_TWO, 83, 76, 9, 68, 92, 90, 93, 9, 75, 76, 9, 89, 70, 90, SignedBytes.MAX_POWER_OF_TWO, 93, SignedBytes.MAX_POWER_OF_TWO, 95, 76, 49, 37, 58, 54, 119, 54, 35, 56, 58, 119, 62, 36, 119, 58, 54, 57, 51, 54, 35, 56, 37, 46, 59, 43, 32, 33, 104, 41, 60, 39, 37, 104, 33, 59, 104, 37, 41, 38, 44, 41, 60, 39, 58, 49, Ascii.f22499SI, Ascii.f22498RS, Ascii.NAK, Ascii.CAN, 91, Ascii.SUB, Ascii.f22499SI, Ascii.DC4, Ascii.SYN, 91, Ascii.DC2, 8, 91, Ascii.SYN, Ascii.SUB, Ascii.NAK, Ascii.f22502US, Ascii.SUB, Ascii.f22499SI, Ascii.DC4, 9, 2, 5, Ascii.SUB, Ascii.ETB, Ascii.SYN, Ascii.f22493FS, 92, SignedBytes.MAX_POWER_OF_TWO, Ascii.DC4, 3, 3, 67, 92, 81, 80, 90, Ascii.SUB, 84, 67, 5, 4, 35, 60, 49, 48, 58, 122, 52, 35, 54, 72, 87, 90, 91, 81, 17, 90, 81, 82, 92, 71, 19, 72, 87, 77, 87, 81, 80, 68, 91, 86, 87, 93, Ascii.f22494GS, 90, 87, 68, 81, Ascii.SUB, 5, 8, 9, 3, 67, 1, Ascii.f22493FS, 9, Ascii.f22503VT, 95, SignedBytes.MAX_POWER_OF_TWO, 77, 76, 70, 6, 81, 4, 95, 71, 77, 7, 70, 71, Ascii.ESC, 7, 95, 89, 17, 3, Ascii.f22493FS, 17, Ascii.DLE, Ascii.SUB, 90, Ascii.f22490CR, 88, 3, Ascii.ESC, 17, 91, Ascii.SUB, Ascii.ESC, 71, 91, 3, 5, 76};
    }

    /* JADX WARN: Code duplicated, block: B:101:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:104:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:106:0x02b0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:107:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:110:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:111:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:112:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:114:0x02f9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:115:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:117:0x0365  */
    /* JADX WARN: Code duplicated, block: B:119:0x036a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:120:0x036c  */
    /* JADX WARN: Code duplicated, block: B:122:0x037d  */
    /* JADX WARN: Code duplicated, block: B:123:0x037f  */
    /* JADX WARN: Code duplicated, block: B:125:0x0384 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:126:0x0386  */
    /* JADX WARN: Code duplicated, block: B:129:0x0399  */
    /* JADX WARN: Code duplicated, block: B:130:0x039f  */
    /* JADX WARN: Code duplicated, block: B:131:0x03a1  */
    /* JADX WARN: Code duplicated, block: B:133:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:134:0x03ae  */
    /* JADX WARN: Code duplicated, block: B:136:0x03b3  */
    /* JADX WARN: Code duplicated, block: B:137:0x03b9  */
    /* JADX WARN: Code duplicated, block: B:139:0x03be  */
    /* JADX WARN: Code duplicated, block: B:141:0x03c8  */
    /* JADX WARN: Code duplicated, block: B:147:0x03e7  */
    /* JADX WARN: Code duplicated, block: B:148:0x03e9  */
    /* JADX WARN: Code duplicated, block: B:149:0x03eb  */
    /* JADX WARN: Code duplicated, block: B:150:0x03ed  */
    /* JADX WARN: Code duplicated, block: B:151:0x03ef  */
    /* JADX WARN: Code duplicated, block: B:152:0x03fd  */
    /* JADX WARN: Code duplicated, block: B:173:0x046b  */
    /* JADX WARN: Code duplicated, block: B:175:0x047f  */
    /* JADX WARN: Code duplicated, block: B:176:0x048d  */
    /* JADX WARN: Code duplicated, block: B:185:0x03e1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:188:0x019d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:196:0x019d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x0173 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x0175  */
    /* JADX WARN: Code duplicated, block: B:53:0x0197  */
    /* JADX WARN: Code duplicated, block: B:56:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:60:0x01b6 A[PHI: r2
  0x01b6: PHI (r2v12 int) = (r2v11 int), (r2v56 int) binds: [B:58:0x01b3, B:48:0x0171] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:62:0x01bb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:66:0x01df  */
    /* JADX WARN: Code duplicated, block: B:68:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:69:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:73:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:75:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:98:0x0284 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:99:0x0286  */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @MetaExoPlayerCustomization("Adding Colorspace support for AV1")
    public static void A0R(C45944v c45944v, int i, int i2, int i3, int i4, int i5, DrmInitData drmInitData, C5443Iy c5443Iy, int i6) throws C44963K {
        byte[] bArrArray;
        int iA0C;
        C5328H6 c5328h6A00;
        String[] strArr;
        int iA0I;
        String[] strArr2;
        boolean z;
        byte[] bArr;
        boolean z2;
        boolean z3;
        boolean z4;
        C5343HL c5343hlA00;
        boolean z5;
        C5317Gv c5317GvA00;
        DrmInitData drmInitDataA01 = drmInitData;
        int iIntValue = i;
        c45944v.A0f(i2 + 8 + 8);
        c45944v.A0g(16);
        int iA0M = c45944v.A0M();
        int iA0M2 = c45944v.A0M();
        boolean z6 = false;
        float fA00 = 1.0f;
        c45944v.A0g(50);
        int iA09 = c45944v.A09();
        if (iIntValue == 1701733238) {
            Pair<Integer, C5470JP> pairA08 = A08(c45944v, i2, i3);
            if (pairA08 != null) {
                iIntValue = ((Integer) pairA08.first).intValue();
                drmInitDataA01 = drmInitDataA01 == null ? null : drmInitDataA01.A01(((C5470JP) pairA08.second).A02);
                c5443Iy.A03[i6] = (C5470JP) pairA08.second;
            }
            c45944v.A0f(iA09);
        }
        String strA0M = null;
        if (iIntValue == 1831958048) {
            strA0M = A0M(1243, 10, 10);
        } else if (iIntValue == 1211250227) {
            strA0M = A0M(1186, 10, 21);
        }
        List<byte[]> listA04 = null;
        String str = null;
        byte[] bArrA0W = null;
        int i7 = -1;
        C5441Iw c5441IwA0G = null;
        int iA00 = -1;
        int i8 = -1;
        int iA01 = -1;
        ByteBuffer byteBufferA0N = null;
        while (true) {
            int i9 = iA09 - i2;
            if (A01[5].charAt(23) == 'W') {
                A01[5] = "UV8763Z4eJ1eqclMrzFGVnLWDHgV5Y7v";
                if (i9 < i3) {
                    c45944v.A0f(iA09);
                    int iA010 = c45944v.A09();
                    int iA0C2 = c45944v.A0C();
                    if (iA0C2 != 0 || c45944v.A09() - i2 != i3) {
                        boolean z7 = iA0C2 > 0;
                        String strA0M2 = A0M(1090, 30, 79);
                        if (A01[5].charAt(23) != 'W') {
                            AbstractC5333HB.A01(z7, strA0M2);
                            iA0C = c45944v.A0C();
                            if (iA0C == 1635148611) {
                                if (strA0M == null) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                AbstractC5333HB.A01(z5, null);
                                strA0M = A0M(InterfaceC11669Sd.a.f25675e, 9, 51);
                                c45944v.A0f(iA010 + 8);
                                c5317GvA00 = C5317Gv.A00(c45944v);
                                listA04 = c5317GvA00.A05;
                                c5443Iy.A00 = c5317GvA00.A02;
                                if (!z6) {
                                    fA00 = c5317GvA00.A00;
                                }
                                str = c5317GvA00.A04;
                            } else if (iA0C == 1752589123) {
                                if (strA0M == null) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                AbstractC5333HB.A01(z4, null);
                                strA0M = A0M(1233, 10, 84);
                                c45944v.A0f(iA010 + 8);
                                c5343hlA00 = C5343HL.A00(c45944v);
                                listA04 = c5343hlA00.A08;
                                c5443Iy.A00 = c5343hlA00.A05;
                                if (!z6) {
                                    fA00 = c5343hlA00.A00;
                                }
                                str = c5343hlA00.A07;
                                iA00 = c5343hlA00.A02;
                                i8 = c5343hlA00.A01;
                                iA01 = c5343hlA00.A03;
                            } else if (iA0C != 1685480259 || iA0C == 1685485123) {
                                c5328h6A00 = C5328H6.A00(c45944v);
                                if (c5328h6A00 != null) {
                                    str = c5328h6A00.A02;
                                    strA0M = A0M(1215, 18, 88);
                                }
                            } else if (iA0C == 1987076931) {
                                AbstractC5333HB.A01(strA0M == null, null);
                                strA0M = iIntValue == 1987063864 ? A0M(1253, 19, 79) : A0M(1272, 19, 19);
                                c45944v.A0f(iA010 + 12);
                                c45944v.A0g(2);
                                boolean z8 = (c45944v.A0I() & 1) != 0;
                                int iA0I2 = c45944v.A0I();
                                int iA0I3 = c45944v.A0I();
                                iA00 = ColorInfo.A00(iA0I2);
                                i8 = z8 ? 1 : 2;
                                iA01 = ColorInfo.A01(iA0I3);
                            } else {
                                String[] strArr3 = A01;
                                if (strArr3[7].charAt(30) != strArr3[4].charAt(30)) {
                                    A01[5] = "obOtuNmXmw3Srs7TxB3R2veWOWOW6QJb";
                                    if (iA0C == 1635135811) {
                                        if (strA0M == null) {
                                            z3 = true;
                                        } else {
                                            z3 = false;
                                        }
                                        AbstractC5333HB.A01(z3, null);
                                        strA0M = A0M(1196, 10, 83);
                                        c45944v.A0f(iA010 + 8);
                                        ColorInfo colorInfoA0B = A0B(c45944v);
                                        iA00 = colorInfoA0B.A02;
                                        i8 = colorInfoA0B.A01;
                                        iA01 = colorInfoA0B.A03;
                                    } else if (iA0C == 1668050025) {
                                        if (byteBufferA0N == null) {
                                            byteBufferA0N = A0N();
                                        }
                                        byteBufferA0N.position(21);
                                        byteBufferA0N.putShort(c45944v.A0b());
                                        byteBufferA0N.putShort(c45944v.A0b());
                                        if (A01[5].charAt(23) != 'W') {
                                            String[] strArr4 = A01;
                                            strArr4[7] = "cMBnz4dZXlFeWyM9hfqqzsh9zqwjLPKg";
                                            strArr4[4] = "lv8fWd8FNFrcw1jaRvaQVznvgsfH83Rg";
                                        } else {
                                            String[] strArr5 = A01;
                                            strArr5[0] = "x7EuuBNN";
                                            strArr5[3] = "05WogHTT";
                                        }
                                    } else if (iA0C == 1835295606) {
                                        if (byteBufferA0N == null) {
                                            byteBufferA0N = A0N();
                                        }
                                        short sA0b = c45944v.A0b();
                                        short sA0b2 = c45944v.A0b();
                                        short sA0b3 = c45944v.A0b();
                                        short sA0b4 = c45944v.A0b();
                                        short sA0b5 = c45944v.A0b();
                                        short sA0b6 = c45944v.A0b();
                                        short sA0b7 = c45944v.A0b();
                                        short sA0b8 = c45944v.A0b();
                                        long jA0Q = c45944v.A0Q();
                                        long jA0Q2 = c45944v.A0Q();
                                        byteBufferA0N.position(1);
                                        byteBufferA0N.putShort(sA0b5);
                                        byteBufferA0N.putShort(sA0b6);
                                        byteBufferA0N.putShort(sA0b);
                                        byteBufferA0N.putShort(sA0b2);
                                        byteBufferA0N.putShort(sA0b3);
                                        byteBufferA0N.putShort(sA0b4);
                                        byteBufferA0N.putShort(sA0b7);
                                        byteBufferA0N.putShort(sA0b8);
                                        byteBufferA0N.putShort((short) (jA0Q / 10000));
                                        byteBufferA0N.putShort((short) (jA0Q2 / 10000));
                                    } else if (iA0C == 1681012275) {
                                        if (strA0M == null) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                        AbstractC5333HB.A01(z2, null);
                                        strA0M = A0M(1186, 10, 21);
                                    } else if (iA0C == 1702061171) {
                                        if (strA0M == null) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        AbstractC5333HB.A01(z, null);
                                        c5441IwA0G = A0G(c45944v, iA010);
                                        strA0M = c5441IwA0G.A02;
                                        bArr = c5441IwA0G.A03;
                                        if (bArr != null) {
                                            listA04 = AbstractC4978BP.A04(bArr);
                                        }
                                    } else if (iA0C == 1885434736) {
                                        fA00 = A00(c45944v, iA010);
                                        z6 = true;
                                    } else if (iA0C == 1937126244) {
                                        bArrA0W = A0W(c45944v, iA010, iA0C2);
                                    } else if (iA0C == 1936995172) {
                                        iA0I = c45944v.A0I();
                                        c45944v.A0g(3);
                                        if (iA0I == 0) {
                                            switch (c45944v.A0I()) {
                                                case 0:
                                                    i7 = 0;
                                                    break;
                                                case 1:
                                                    i7 = 1;
                                                    break;
                                                case 2:
                                                    i7 = 2;
                                                    break;
                                                case 3:
                                                    i7 = 3;
                                                    break;
                                            }
                                        }
                                        strArr2 = A01;
                                        if (strArr2[0].length() != strArr2[3].length()) {
                                            throw new RuntimeException();
                                        }
                                        String[] strArr6 = A01;
                                        strArr6[7] = "0aivzU98O0ZXtjwpHxuX2T7FoukhoekU";
                                        strArr6[4] = "nV94P8gaAxhOD3b386SRtcx64PXkWIfI";
                                    } else if (iA0C != 1668246642 && iA00 == -1 && i8 == -1 && iA01 == -1) {
                                        int iA0C3 = c45944v.A0C();
                                        if (iA0C3 == 1852009592 || iA0C3 == 1852009571) {
                                            int iA0M3 = c45944v.A0M();
                                            int iA0M4 = c45944v.A0M();
                                            c45944v.A0g(2);
                                            boolean z9 = iA0C2 == 19 && (c45944v.A0I() & 128) != 0;
                                            iA00 = ColorInfo.A00(iA0M3);
                                            i8 = z9 ? 1 : 2;
                                            iA01 = ColorInfo.A01(iA0M4);
                                        } else {
                                            AbstractC45794g.A07(A0M(178, 11, 68), A0M(470, 24, 105) + AbstractC5439Iu.A02(iA0C3));
                                            strArr = A01;
                                            if (strArr[7].charAt(30) != strArr[4].charAt(30)) {
                                                String[] strArr7 = A01;
                                                strArr7[0] = "ZXEhGysO";
                                                strArr7[3] = "dMfXFnuv";
                                            } else {
                                                String[] strArr8 = A01;
                                                strArr8[0] = "PjY9iWjn";
                                                strArr8[3] = "RXgmgrZF";
                                            }
                                        }
                                    } else {
                                        strArr = A01;
                                        if (strArr[7].charAt(30) != strArr[4].charAt(30)) {
                                            String[] strArr9 = A01;
                                            strArr9[0] = "ZXEhGysO";
                                            strArr9[3] = "dMfXFnuv";
                                        } else {
                                            String[] strArr10 = A01;
                                            strArr10[0] = "PjY9iWjn";
                                            strArr10[3] = "RXgmgrZF";
                                        }
                                    }
                                } else if (iA0C == 1635135811) {
                                    if (strA0M == null) {
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                    AbstractC5333HB.A01(z3, null);
                                    strA0M = A0M(1196, 10, 83);
                                    c45944v.A0f(iA010 + 8);
                                    ColorInfo colorInfoA0B2 = A0B(c45944v);
                                    iA00 = colorInfoA0B2.A02;
                                    i8 = colorInfoA0B2.A01;
                                    iA01 = colorInfoA0B2.A03;
                                } else if (iA0C == 1668050025) {
                                    if (byteBufferA0N == null) {
                                        byteBufferA0N = A0N();
                                    }
                                    byteBufferA0N.position(21);
                                    byteBufferA0N.putShort(c45944v.A0b());
                                    byteBufferA0N.putShort(c45944v.A0b());
                                    if (A01[5].charAt(23) != 'W') {
                                        String[] strArr11 = A01;
                                        strArr11[7] = "cMBnz4dZXlFeWyM9hfqqzsh9zqwjLPKg";
                                        strArr11[4] = "lv8fWd8FNFrcw1jaRvaQVznvgsfH83Rg";
                                    } else {
                                        String[] strArr12 = A01;
                                        strArr12[0] = "x7EuuBNN";
                                        strArr12[3] = "05WogHTT";
                                    }
                                } else if (iA0C == 1835295606) {
                                    if (byteBufferA0N == null) {
                                        byteBufferA0N = A0N();
                                    }
                                    short sA0b9 = c45944v.A0b();
                                    short sA0b10 = c45944v.A0b();
                                    short sA0b11 = c45944v.A0b();
                                    short sA0b12 = c45944v.A0b();
                                    short sA0b13 = c45944v.A0b();
                                    short sA0b14 = c45944v.A0b();
                                    short sA0b15 = c45944v.A0b();
                                    short sA0b16 = c45944v.A0b();
                                    long jA0Q3 = c45944v.A0Q();
                                    long jA0Q4 = c45944v.A0Q();
                                    byteBufferA0N.position(1);
                                    byteBufferA0N.putShort(sA0b13);
                                    byteBufferA0N.putShort(sA0b14);
                                    byteBufferA0N.putShort(sA0b9);
                                    byteBufferA0N.putShort(sA0b10);
                                    byteBufferA0N.putShort(sA0b11);
                                    byteBufferA0N.putShort(sA0b12);
                                    byteBufferA0N.putShort(sA0b15);
                                    byteBufferA0N.putShort(sA0b16);
                                    byteBufferA0N.putShort((short) (jA0Q3 / 10000));
                                    byteBufferA0N.putShort((short) (jA0Q4 / 10000));
                                } else if (iA0C == 1681012275) {
                                    if (strA0M == null) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    AbstractC5333HB.A01(z2, null);
                                    strA0M = A0M(1186, 10, 21);
                                } else if (iA0C == 1702061171) {
                                    if (strA0M == null) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    AbstractC5333HB.A01(z, null);
                                    c5441IwA0G = A0G(c45944v, iA010);
                                    strA0M = c5441IwA0G.A02;
                                    bArr = c5441IwA0G.A03;
                                    if (bArr != null) {
                                        listA04 = AbstractC4978BP.A04(bArr);
                                    }
                                } else if (iA0C == 1885434736) {
                                    fA00 = A00(c45944v, iA010);
                                    z6 = true;
                                } else if (iA0C == 1937126244) {
                                    bArrA0W = A0W(c45944v, iA010, iA0C2);
                                } else if (iA0C == 1936995172) {
                                    iA0I = c45944v.A0I();
                                    c45944v.A0g(3);
                                    if (iA0I == 0) {
                                        switch (c45944v.A0I()) {
                                            case 0:
                                                i7 = 0;
                                                break;
                                            case 1:
                                                i7 = 1;
                                                break;
                                            case 2:
                                                i7 = 2;
                                                break;
                                            case 3:
                                                i7 = 3;
                                                break;
                                        }
                                    }
                                    strArr2 = A01;
                                    if (strArr2[0].length() != strArr2[3].length()) {
                                        throw new RuntimeException();
                                    }
                                    String[] strArr13 = A01;
                                    strArr13[7] = "0aivzU98O0ZXtjwpHxuX2T7FoukhoekU";
                                    strArr13[4] = "nV94P8gaAxhOD3b386SRtcx64PXkWIfI";
                                } else if (iA0C != 1668246642) {
                                    strArr = A01;
                                    if (strArr[7].charAt(30) != strArr[4].charAt(30)) {
                                        String[] strArr14 = A01;
                                        strArr14[0] = "ZXEhGysO";
                                        strArr14[3] = "dMfXFnuv";
                                    } else {
                                        String[] strArr15 = A01;
                                        strArr15[0] = "PjY9iWjn";
                                        strArr15[3] = "RXgmgrZF";
                                    }
                                } else {
                                    strArr = A01;
                                    if (strArr[7].charAt(30) != strArr[4].charAt(30)) {
                                        String[] strArr16 = A01;
                                        strArr16[0] = "ZXEhGysO";
                                        strArr16[3] = "dMfXFnuv";
                                    } else {
                                        String[] strArr17 = A01;
                                        strArr17[0] = "PjY9iWjn";
                                        strArr17[3] = "RXgmgrZF";
                                    }
                                }
                            }
                        } else {
                            A01[2] = "a7F234D58gsc4SWrdwKeU3Lp";
                            AbstractC5333HB.A01(z7, strA0M2);
                            iA0C = c45944v.A0C();
                            if (iA0C == 1635148611) {
                                if (strA0M == null) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                AbstractC5333HB.A01(z5, null);
                                strA0M = A0M(InterfaceC11669Sd.a.f25675e, 9, 51);
                                c45944v.A0f(iA010 + 8);
                                c5317GvA00 = C5317Gv.A00(c45944v);
                                listA04 = c5317GvA00.A05;
                                c5443Iy.A00 = c5317GvA00.A02;
                                if (!z6) {
                                    fA00 = c5317GvA00.A00;
                                }
                                str = c5317GvA00.A04;
                            } else if (iA0C == 1752589123) {
                                if (strA0M == null) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                AbstractC5333HB.A01(z4, null);
                                strA0M = A0M(1233, 10, 84);
                                c45944v.A0f(iA010 + 8);
                                c5343hlA00 = C5343HL.A00(c45944v);
                                listA04 = c5343hlA00.A08;
                                c5443Iy.A00 = c5343hlA00.A05;
                                if (!z6) {
                                    fA00 = c5343hlA00.A00;
                                }
                                str = c5343hlA00.A07;
                                iA00 = c5343hlA00.A02;
                                i8 = c5343hlA00.A01;
                                iA01 = c5343hlA00.A03;
                            } else if (iA0C != 1685480259) {
                                c5328h6A00 = C5328H6.A00(c45944v);
                                if (c5328h6A00 != null) {
                                    str = c5328h6A00.A02;
                                    strA0M = A0M(1215, 18, 88);
                                }
                            } else {
                                c5328h6A00 = C5328H6.A00(c45944v);
                                if (c5328h6A00 != null) {
                                    str = c5328h6A00.A02;
                                    strA0M = A0M(1215, 18, 88);
                                }
                            }
                        }
                        iA09 += iA0C2;
                    }
                }
            }
            throw new RuntimeException();
        }
        if (strA0M == null) {
            return;
        }
        C44672p c44672pA0u = new C44672p().A0g(i4).A11(strA0M).A0w(str).A0r(iA0M).A0f(iA0M2).A0Y(fA00).A0l(i5).A13(bArrA0W).A0o(i7).A12(listA04).A0u(drmInitDataA01);
        if (iA00 != -1 || i8 != -1 || iA01 != -1 || byteBufferA0N != null) {
            if (byteBufferA0N != null) {
                bArrArray = byteBufferA0N.array();
                String[] strArr18 = A01;
                if (strArr18[7].charAt(30) != strArr18[4].charAt(30)) {
                    String[] strArr19 = A01;
                    strArr19[1] = "iNSGYMD2WjZqNKpCGRiE11Ag0KcZMJ4O";
                    strArr19[6] = "kUdBVFFCHZ7OFsLW60c88KXDOWnZQcPh";
                }
                throw new RuntimeException();
            }
            bArrArray = null;
            c44672pA0u.A0t(new ColorInfo(iA00, i8, iA01, bArrArray));
        }
        if (c5441IwA0G != null) {
            c44672pA0u.A0a(AbstractC4945As.A03(c5441IwA0G.A00)).A0j(AbstractC4945As.A03(c5441IwA0G.A01));
        }
        c5443Iy.A02 = c44672pA0u.A14();
    }

    /* JADX WARN: Code duplicated, block: B:113:0x0350  */
    /* JADX WARN: Code duplicated, block: B:119:0x0370  */
    /* JADX WARN: Code duplicated, block: B:121:0x0375  */
    /* JADX WARN: Code duplicated, block: B:122:0x0381  */
    /* JADX WARN: Code duplicated, block: B:124:0x0386  */
    /* JADX WARN: Code duplicated, block: B:125:0x0392  */
    /* JADX WARN: Code duplicated, block: B:127:0x03a7  */
    /* JADX WARN: Code duplicated, block: B:129:0x03b5  */
    /* JADX WARN: Code duplicated, block: B:130:0x03c1  */
    /* JADX WARN: Code duplicated, block: B:133:0x03cb  */
    /* JADX WARN: Code duplicated, block: B:135:0x03d0  */
    /* JADX WARN: Code duplicated, block: B:136:0x03dc  */
    /* JADX WARN: Code duplicated, block: B:138:0x03e1  */
    /* JADX WARN: Code duplicated, block: B:140:0x03e6  */
    /* JADX WARN: Code duplicated, block: B:199:0x0538 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:201:0x012d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:202:0x012d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x014a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x014c  */
    /* JADX WARN: Code duplicated, block: B:53:0x0150  */
    /* JADX WARN: Code duplicated, block: B:55:0x015e  */
    /* JADX WARN: Code duplicated, block: B:57:0x016e  */
    /* JADX WARN: Code duplicated, block: B:59:0x017f  */
    /* JADX WARN: Code duplicated, block: B:76:0x01f9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:77:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:80:0x0203  */
    /* JADX WARN: Code duplicated, block: B:84:0x020d  */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static void A0T(C45944v c45944v, int i, int i2, int i3, int i4, String str, boolean z, DrmInitData drmInitData, C5443Iy c5443Iy, int i5) throws C44963K {
        int iA0M;
        int iA0J;
        String[] strArr;
        int iA04;
        byte[] bArr;
        int iIntValue = i;
        DrmInitData drmInitDataA01 = drmInitData;
        c45944v.A0f(i2 + 8 + 8);
        int iA0M2 = 0;
        if (z) {
            iA0M2 = c45944v.A0M();
            c45944v.A0g(6);
        } else {
            c45944v.A0g(8);
        }
        int iA0C = 0;
        int i6 = -1;
        String str2 = null;
        C5441Iw c5441IwA0G = null;
        if (A01[2].length() == 24) {
            String[] strArr2 = A01;
            strArr2[0] = "6JAwliLs";
            strArr2[3] = "MHNM5nZH";
            if (iA0M2 == 0 || iA0M2 == 1) {
                iA0M = c45944v.A0M();
                c45944v.A0g(6);
                iA0J = c45944v.A0J();
                c45944v.A0f(c45944v.A09() - 4);
                iA0C = c45944v.A0C();
                if (iA0M2 == 1) {
                    c45944v.A0g(16);
                }
            } else {
                if (iA0M2 != 2) {
                    return;
                }
                c45944v.A0g(16);
                iA0J = (int) Math.round(c45944v.A06());
                iA0M = c45944v.A0L();
                c45944v.A0g(20);
            }
            int iA09 = c45944v.A09();
            if (iIntValue == 1701733217) {
                Pair<Integer, C5470JP> pairA08 = A08(c45944v, i2, i3);
                if (pairA08 != null) {
                    iIntValue = ((Integer) pairA08.first).intValue();
                    if (drmInitDataA01 != null) {
                        drmInitDataA01 = drmInitDataA01.A01(((C5470JP) pairA08.second).A02);
                    } else if (A01[2].length() != 24) {
                        drmInitDataA01 = null;
                    } else {
                        String[] strArr3 = A01;
                        strArr3[0] = "GRTMmxkT";
                        strArr3[3] = "8R10f2wp";
                        drmInitDataA01 = null;
                    }
                    C5470JP[] c5470jpArr = c5443Iy.A03;
                    C5470JP c5470jp = (C5470JP) pairA08.second;
                    String[] strArr4 = A01;
                    if (strArr4[1].charAt(26) != strArr4[6].charAt(26)) {
                        String[] strArr5 = A01;
                        strArr5[7] = "lvh8KGFHktoLjastkJ82cPetj14Rk4EU";
                        strArr5[4] = "lCZg4scnRLhDwR3AaCs1YjGUJehF9RDz";
                        c5470jpArr[i5] = c5470jp;
                    } else {
                        String[] strArr6 = A01;
                        strArr6[0] = "dju2geGd";
                        strArr6[3] = "bzT2ebja";
                        c5470jpArr[i5] = c5470jp;
                    }
                } else {
                    String[] strArr7 = A01;
                    if (strArr7[0].length() != strArr7[3].length()) {
                        throw new RuntimeException();
                    }
                    String[] strArr8 = A01;
                    strArr8[7] = "gPFMLbY3dC1lU3feUmGywMAQlXFn4oyw";
                    strArr8[4] = "p7gqQJ524nkvgJLmUWGAgmNX9hqHunnJ";
                }
                c45944v.A0f(iA09);
            }
            String strA0M = null;
            if (iIntValue == 1633889587) {
                strA0M = A0M(822, 9, 61);
            } else if (iIntValue == 1700998451) {
                strA0M = A0M(862, 10, 74);
            } else if (iIntValue == 1633889588) {
                String[] strArr9 = A01;
                if (strArr9[7].charAt(30) != strArr9[4].charAt(30)) {
                    String[] strArr10 = A01;
                    strArr10[0] = "ajRR6yPd";
                    strArr10[3] = "wapOpR6f";
                    strA0M = A0M(831, 9, 45);
                } else {
                    strA0M = A0M(831, 9, 45);
                }
            } else if (iIntValue == 1685353315) {
                String[] strArr11 = A01;
                if (strArr11[1].charAt(26) != strArr11[6].charAt(26)) {
                    A01[2] = "KJpCB4t3K52AuUO24XLWBqo9";
                    strA0M = A0M(989, 13, Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE);
                }
            } else {
                String[] strArr12 = A01;
                if (strArr12[7].charAt(30) != strArr12[4].charAt(30)) {
                    String[] strArr13 = A01;
                    strArr13[1] = "E8vPAuGqR2xNMC3W8Z6piDguEQA0iYD6";
                    strArr13[6] = "JqGyLM9U6ZTAdL5rS6oZcwJBCNvZXK39";
                    if (iIntValue != 1685353320) {
                        if (iIntValue == 1685353324) {
                            if (iIntValue == 1685353317) {
                                strA0M = A0M(1018, 28, 67);
                            } else if (iIntValue == 1685353336) {
                                strA0M = A0M(1046, 28, 95);
                            } else {
                                strArr = A01;
                                if (strArr[0].length() != strArr[3].length()) {
                                    String[] strArr14 = A01;
                                    strArr14[0] = "UBbPjz2J";
                                    strArr14[3] = "vZen3GMl";
                                    if (iIntValue == 1935764850) {
                                        strA0M = A0M(812, 10, 87);
                                    } else if (iIntValue == 1935767394) {
                                        strA0M = A0M(850, 12, 37);
                                    } else if (iIntValue != 1819304813 || iIntValue == 1936684916) {
                                        strA0M = A0M(967, 9, 94);
                                        i6 = 2;
                                    } else if (iIntValue == 1953984371) {
                                        strA0M = A0M(967, 9, 94);
                                        i6 = 268435456;
                                    } else if (iIntValue == 778924082 || iIntValue == 778924083) {
                                        strA0M = A0M(947, 10, 17);
                                    } else if (iIntValue == 1835557169) {
                                        strA0M = A0M(912, 10, 37);
                                    } else if (iIntValue == 1835560241) {
                                        strA0M = A0M(922, 10, 16);
                                    } else if (iIntValue == 1634492771) {
                                        if (A01[2].length() != 24) {
                                            String[] strArr15 = A01;
                                            strArr15[7] = "Tx0aPYhLQcdbhycZDJ63DJlxAHLYnZiL";
                                            strArr15[4] = "3h5vNAL3r5q44mC2VqL1y1SAaDe1rbn7";
                                            strA0M = A0M(840, 1, 31);
                                        } else {
                                            A01[5] = "qx3Rs2jX7JB6Nuy9TisbRByWp1zn9Qj8";
                                            strA0M = A0M(840, 10, 41);
                                        }
                                    } else if (iIntValue == 1634492791) {
                                        strA0M = A0M(882, 15, 96);
                                    } else if (iIntValue == 1970037111) {
                                        strA0M = A0M(897, 15, 77);
                                    } else if (iIntValue == 1332770163) {
                                        strA0M = A0M(957, 10, 67);
                                    } else if (iIntValue == 1716281667) {
                                        strA0M = A0M(872, 10, 4);
                                    } else if (iIntValue == 1835823201) {
                                        strA0M = A0M(976, 13, 77);
                                    }
                                } else {
                                    A01[2] = "gBDk9Jrqoo24V0L1mHSTaoLt";
                                    if (iIntValue == 1935764850) {
                                        strA0M = A0M(812, 10, 87);
                                    } else if (iIntValue == 1935767394) {
                                        strA0M = A0M(850, 12, 37);
                                    } else if (iIntValue != 1819304813) {
                                        strA0M = A0M(967, 9, 94);
                                        i6 = 2;
                                    } else {
                                        strA0M = A0M(967, 9, 94);
                                        i6 = 2;
                                    }
                                }
                            }
                        }
                    }
                } else {
                    String[] strArr16 = A01;
                    strArr16[0] = "jXw0aAnX";
                    strArr16[3] = "tHH1zIUY";
                    if (iIntValue != 1685353320) {
                        if (iIntValue == 1685353324) {
                            if (iIntValue == 1685353317) {
                                strA0M = A0M(1018, 28, 67);
                            } else if (iIntValue == 1685353336) {
                                strA0M = A0M(1046, 28, 95);
                            } else {
                                strArr = A01;
                                if (strArr[0].length() != strArr[3].length()) {
                                    String[] strArr17 = A01;
                                    strArr17[0] = "UBbPjz2J";
                                    strArr17[3] = "vZen3GMl";
                                    if (iIntValue == 1935764850) {
                                        strA0M = A0M(812, 10, 87);
                                    } else if (iIntValue == 1935767394) {
                                        strA0M = A0M(850, 12, 37);
                                    } else if (iIntValue != 1819304813) {
                                        strA0M = A0M(967, 9, 94);
                                        i6 = 2;
                                    } else {
                                        strA0M = A0M(967, 9, 94);
                                        i6 = 2;
                                    }
                                } else {
                                    A01[2] = "gBDk9Jrqoo24V0L1mHSTaoLt";
                                    if (iIntValue == 1935764850) {
                                        strA0M = A0M(812, 10, 87);
                                    } else if (iIntValue == 1935767394) {
                                        strA0M = A0M(850, 12, 37);
                                    } else if (iIntValue != 1819304813) {
                                        strA0M = A0M(967, 9, 94);
                                        i6 = 2;
                                    } else {
                                        strA0M = A0M(967, 9, 94);
                                        i6 = 2;
                                    }
                                }
                            }
                        }
                    }
                }
                strA0M = A0M(1002, 16, 39);
            }
            List<byte[]> listA04 = null;
            while (iA09 - i2 < i3) {
                c45944v.A0f(iA09);
                int iA0C2 = c45944v.A0C();
                boolean z2 = iA0C2 > 0;
                String strA0M2 = A0M(1090, 30, 79);
                String[] strArr18 = A01;
                if (strArr18[7].charAt(30) != strArr18[4].charAt(30)) {
                    A01[2] = "1WqyRoRGMALZfYpxNfh8k5AQ";
                    AbstractC5333HB.A01(z2, strA0M2);
                    int iA0C3 = c45944v.A0C();
                    if (iA0C3 == 1835557187) {
                        int i7 = iA0C2 - 13;
                        byte[] bArr2 = new byte[i7];
                        c45944v.A0f(13 + iA09);
                        c45944v.A0k(bArr2, 0, i7);
                        listA04 = AbstractC4978BP.A04(bArr2);
                    } else if (iA0C3 == 1702061171) {
                        if (iA0C3 == 1702061171) {
                            iA04 = iA09;
                        } else {
                            iA04 = A04(c45944v, 1702061171, iA09, iA0C2);
                        }
                        if (iA04 != -1) {
                            c5441IwA0G = A0G(c45944v, iA04);
                            strA0M = c5441IwA0G.A02;
                            bArr = c5441IwA0G.A03;
                            if (bArr != null) {
                                if (A0M(932, 15, 103).equals(strA0M)) {
                                    C5308Gm c5308GmA03 = AbstractC5309Gn.A03(bArr);
                                    iA0J = c5308GmA03.A01;
                                    iA0M = c5308GmA03.A00;
                                    str2 = c5308GmA03.A02;
                                }
                                listA04 = AbstractC4978BP.A04(bArr);
                            }
                        }
                    } else {
                        if (z) {
                            if (A01[5].charAt(23) == 'W') {
                                String[] strArr19 = A01;
                                strArr19[0] = "uRIbW45A";
                                strArr19[3] = "EDIb1o31";
                                if (iA0C3 == 2002876005) {
                                    if (iA0C3 == 1702061171) {
                                        iA04 = iA09;
                                    } else {
                                        iA04 = A04(c45944v, 1702061171, iA09, iA0C2);
                                    }
                                    if (iA04 != -1) {
                                        c5441IwA0G = A0G(c45944v, iA04);
                                        strA0M = c5441IwA0G.A02;
                                        bArr = c5441IwA0G.A03;
                                        if (bArr != null) {
                                            if (A0M(932, 15, 103).equals(strA0M)) {
                                                C5308Gm c5308GmA04 = AbstractC5309Gn.A03(bArr);
                                                iA0J = c5308GmA04.A01;
                                                iA0M = c5308GmA04.A00;
                                                str2 = c5308GmA04.A02;
                                            }
                                            listA04 = AbstractC4978BP.A04(bArr);
                                        }
                                    }
                                }
                            } else if (iA0C3 == 2002876005) {
                                if (iA0C3 == 1702061171) {
                                    iA04 = iA09;
                                } else {
                                    iA04 = A04(c45944v, 1702061171, iA09, iA0C2);
                                }
                                if (iA04 != -1) {
                                    c5441IwA0G = A0G(c45944v, iA04);
                                    strA0M = c5441IwA0G.A02;
                                    bArr = c5441IwA0G.A03;
                                    if (bArr != null) {
                                        if (A0M(932, 15, 103).equals(strA0M)) {
                                            C5308Gm c5308GmA05 = AbstractC5309Gn.A03(bArr);
                                            iA0J = c5308GmA05.A01;
                                            iA0M = c5308GmA05.A00;
                                            str2 = c5308GmA05.A02;
                                        }
                                        listA04 = AbstractC4978BP.A04(bArr);
                                    }
                                }
                            }
                        }
                        if (iA0C3 == 1684103987) {
                            c45944v.A0f(iA09 + 8);
                            c5443Iy.A02 = AbstractC5313Gr.A07(c45944v, Integer.toString(i4), str, drmInitDataA01);
                        } else if (iA0C3 == 1684366131) {
                            c45944v.A0f(iA09 + 8);
                            c5443Iy.A02 = AbstractC5313Gr.A08(c45944v, Integer.toString(i4), str, drmInitDataA01);
                        } else if (iA0C3 == 1684103988) {
                            c45944v.A0f(iA09 + 8);
                            c5443Iy.A02 = AbstractC5316Gu.A03(c45944v, Integer.toString(i4), str, drmInitDataA01);
                        } else {
                            String[] strArr20 = A01;
                            if (strArr20[7].charAt(30) != strArr20[4].charAt(30)) {
                                String[] strArr21 = A01;
                                strArr21[7] = "XWUeG0Lj6KL9JW7Z7jfQ0rtemNqiryGw";
                                strArr21[4] = "DGFAmtAGFYrNnmS6p9Hy3BCjcLzUjlt2";
                                if (iA0C3 == 1684892784) {
                                    if (iA0C > 0) {
                                        throw C44963K.A01(A0M(239, 49, 39) + iA0C, null);
                                    }
                                    iA0M = 2;
                                    iA0J = iA0C;
                                } else if (iA0C3 != 1684305011 || iA0C3 == 1969517683) {
                                    c5443Iy.A02 = new C44672p().A0g(i4).A11(strA0M).A0b(iA0M).A0m(iA0J).A0u(drmInitDataA01).A10(str).A14();
                                } else if (iA0C3 == 1682927731) {
                                    int i8 = iA0C2 - 8;
                                    byte[] bArrCopyOf = Arrays.copyOf(A02, A02.length + i8);
                                    c45944v.A0f(iA09 + 8);
                                    c45944v.A0k(bArrCopyOf, A02.length, i8);
                                    listA04 = AbstractC5351HT.A06(bArrCopyOf);
                                } else if (iA0C3 == 1684425825) {
                                    int i9 = iA0C2 - 12;
                                    byte[] bArr3 = new byte[i9 + 4];
                                    bArr3[0] = 102;
                                    bArr3[1] = 76;
                                    bArr3[2] = 97;
                                    bArr3[3] = 67;
                                    c45944v.A0f(iA09 + 12);
                                    c45944v.A0k(bArr3, 4, i9);
                                    listA04 = AbstractC4978BP.A04(bArr3);
                                } else if (iA0C3 == 1634492771) {
                                    int i10 = iA0C2 - 12;
                                    byte[] bArr4 = new byte[i10];
                                    c45944v.A0f(iA09 + 12);
                                    c45944v.A0k(bArr4, 0, i10);
                                    Pair<Integer, Integer> pairA00 = AbstractC454346.A00(bArr4);
                                    iA0J = ((Integer) pairA00.first).intValue();
                                    iA0M = ((Integer) pairA00.second).intValue();
                                    listA04 = AbstractC4978BP.A04(bArr4);
                                }
                            } else if (iA0C3 == 1684892784) {
                                if (iA0C > 0) {
                                    throw C44963K.A01(A0M(239, 49, 39) + iA0C, null);
                                }
                                iA0M = 2;
                                iA0J = iA0C;
                            } else if (iA0C3 != 1684305011) {
                                c5443Iy.A02 = new C44672p().A0g(i4).A11(strA0M).A0b(iA0M).A0m(iA0J).A0u(drmInitDataA01).A10(str).A14();
                            } else {
                                c5443Iy.A02 = new C44672p().A0g(i4).A11(strA0M).A0b(iA0M).A0m(iA0J).A0u(drmInitDataA01).A10(str).A14();
                            }
                        }
                    }
                    iA09 += iA0C2;
                }
            }
            if (c5443Iy.A02 != null || strA0M == null) {
                return;
            }
            C44672p c44672pA10 = new C44672p().A0g(i4).A11(strA0M).A0w(str2).A0b(iA0M).A0m(iA0J).A0i(i6).A12(listA04).A0u(drmInitDataA01).A10(str);
            if (c5441IwA0G != null) {
                c44672pA10.A0a(AbstractC4945As.A03(c5441IwA0G.A00)).A0j(AbstractC4945As.A03(c5441IwA0G.A01));
            }
            c5443Iy.A02 = c44672pA10.A14();
            return;
        }
        throw new RuntimeException();
    }

    static {
        A0P();
        A03 = new int[]{-3374493, -128628077, -2011932550, 38936541};
        A02 = AbstractC46115C.A1G(A0M(351, 8, 8));
    }

    public static float A00(C45944v c45944v, int i) {
        c45944v.A0f(i + 8);
        int vSpacing = c45944v.A0L();
        int hSpacing = c45944v.A0L();
        return vSpacing / hSpacing;
    }

    public static int A01(int i) {
        if (i == 1936684398) {
            return 1;
        }
        if (i == 1986618469) {
            return 2;
        }
        String[] strArr = A01;
        if (strArr[1].charAt(26) == strArr[6].charAt(26)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[0] = "Iy7m3jJh";
        strArr2[3] = "9tkcHcc8";
        if (i == 1952807028 || i == 1935832172 || i == 1937072756 || i == 1668047728) {
            return 3;
        }
        if (i == 1835365473) {
            return 5;
        }
        return -1;
    }

    public static int A02(C45944v c45944v) {
        int iA0I = c45944v.A0I();
        int i = iA0I & 127;
        while (true) {
            int i2 = iA0I & 128;
            String[] strArr = A01;
            String str = strArr[7];
            String str2 = strArr[4];
            int size = str.charAt(30);
            int currentByte = str2.charAt(30);
            if (size == currentByte) {
                throw new RuntimeException();
            }
            A01[5] = "pSNibJ1kKp1RE21akOqiyNuWX3n84SWQ";
            if (i2 == 128) {
                iA0I = c45944v.A0I();
                int i3 = i << 7;
                String[] strArr2 = A01;
                String str3 = strArr2[0];
                String str4 = strArr2[3];
                int size2 = str3.length();
                int currentByte2 = str4.length();
                if (size2 != currentByte2) {
                    String[] strArr3 = A01;
                    strArr3[0] = "dUXzi2Ex";
                    strArr3[3] = "FqHw8aws";
                    int currentByte3 = iA0I & 127;
                    i = i3 | currentByte3;
                } else {
                    A01[2] = "53iEjHDa99dBpQfClHLnj3Lr";
                    int currentByte4 = iA0I & 127;
                    i = i3 | currentByte4;
                }
            } else {
                return i;
            }
        }
    }

    public static int A03(C45944v c45944v) {
        c45944v.A0f(16);
        return c45944v.A0C();
    }

    public static int A04(C45944v c45944v, int i, int i2, int i3) throws C44963K {
        int childAtomSize = c45944v.A09();
        AbstractC5333HB.A01(childAtomSize >= i2, null);
        while (childAtomPosition < i3) {
            c45944v.A0f(childAtomSize);
            int iA0C = c45944v.A0C();
            boolean z = iA0C > 0;
            if (A01[5].charAt(23) != 'W') {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[7] = "6gtDIh58mAlo0zqgdjwPUqi1ndJRBK82";
            strArr[4] = "DRBAnAjKoyJp6qnYv3HHxzBKoLLYYD5q";
            AbstractC5333HB.A01(z, A0M(1090, 30, 79));
            int childAtomPosition = c45944v.A0C();
            if (childAtomPosition == i) {
                return childAtomSize;
            }
            childAtomSize += iA0C;
        }
        return -1;
    }

    public static long A05(C45944v c45944v) {
        int fullAtom = 8;
        c45944v.A0f(8);
        if (AbstractC5439Iu.A01(c45944v.A0C()) != 0) {
            fullAtom = 16;
        }
        c45944v.A0g(fullAtom);
        return c45944v.A0Q();
    }

    public static Pair<Long, String> A06(C45944v c45944v) {
        c45944v.A0f(8);
        int fullAtom = AbstractC5439Iu.A01(c45944v.A0C());
        int languageCode = fullAtom == 0 ? 8 : 16;
        c45944v.A0g(languageCode);
        long jA0Q = c45944v.A0Q();
        int version = fullAtom == 0 ? 4 : 8;
        c45944v.A0g(version);
        int iA0M = c45944v.A0M();
        int languageCode2 = iA0M >> 10;
        StringBuilder sbAppend = new StringBuilder().append(A0M(0, 0, 93)).append((char) ((languageCode2 & 31) + 96));
        int languageCode3 = iA0M >> 5;
        StringBuilder sbAppend2 = sbAppend.append((char) ((languageCode3 & 31) + 96));
        int languageCode4 = iA0M & 31;
        return Pair.create(Long.valueOf(jA0Q), sbAppend2.append((char) (languageCode4 + 96)).toString());
    }

    public static Pair<Integer, C5470JP> A07(C45944v c45944v, int i, int i2) throws C44963K {
        int i3 = i + 8;
        int childAtomType = -1;
        int childAtomSize = 0;
        String strA0W = null;
        Integer numValueOf = null;
        while (childPosition < i2) {
            c45944v.A0f(i3);
            int iA0C = c45944v.A0C();
            int iA0C2 = c45944v.A0C();
            int schemeInformationBoxPosition = A01[2].length();
            if (schemeInformationBoxPosition != 24) {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[0] = "312zVnav";
            strArr[3] = "fwhHyPzp";
            if (iA0C2 == 1718775137) {
                int childPosition = c45944v.A0C();
                numValueOf = Integer.valueOf(childPosition);
            } else if (iA0C2 == 1935894637) {
                c45944v.A0g(4);
                strA0W = c45944v.A0W(4);
            } else if (iA0C2 == 1935894633) {
                childAtomType = i3;
                childAtomSize = iA0C;
            }
            i3 += iA0C;
        }
        int schemeInformationBoxPosition2 = A01[2].length();
        if (schemeInformationBoxPosition2 == 24) {
            A01[5] = "Q2dt9svTwucQVjxlQtJloRQWafbIItZ7";
            if (A0M(1082, 4, 74).equals(strA0W) || A0M(1074, 4, 51).equals(strA0W) || A0M(1086, 4, 55).equals(strA0W) || A0M(1078, 4, 82).equals(strA0W)) {
                boolean z = true;
                AbstractC5333HB.A01(numValueOf != null, A0M(1120, 22, 49));
                AbstractC5333HB.A01(childAtomType != -1, A0M(1142, 22, 46));
                C5470JP c5470jpA0K = A0K(c45944v, childAtomType, childAtomSize, strA0W);
                if (c5470jpA0K == null) {
                    z = false;
                }
                AbstractC5333HB.A01(z, A0M(InterfaceC12339e.a.f31141j, 22, 29));
                return Pair.create(numValueOf, (C5470JP) AbstractC46115C.A0f(c5470jpA0K));
            }
            return null;
        }
        throw new RuntimeException();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0050 A[PHI: r0
  0x0050: PHI (r0v16 'childPosition' int) = (r0v13 'childPosition' int), (r0v19 'childPosition' int) binds: [B:20:0x007e, B:12:0x004e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x0081 A[PHI: r0
  0x0081: PHI (r0v14 'childPosition' int) = (r0v13 'childPosition' int), (r0v19 'childPosition' int) binds: [B:20:0x007e, B:12:0x004e] A[DONT_GENERATE, DONT_INLINE]] */
    public static Pair<Integer, C5470JP> A08(C45944v c45944v, int i, int i2) throws C44963K {
        int childPosition;
        boolean z;
        Pair<Integer, C5470JP> pairA07;
        int iA09 = c45944v.A09();
        while (true) {
            int i3 = iA09 - i;
            String[] strArr = A01;
            String str = strArr[0];
            String str2 = strArr[3];
            int length = str.length();
            int childPosition2 = str2.length();
            if (length != childPosition2) {
                throw new RuntimeException();
            }
            A01[2] = "alPn9WvAmZr8sIghV9sZ4SJG";
            if (i3 < i2) {
                c45944v.A0f(iA09);
                String[] strArr2 = A01;
                String str3 = strArr2[1];
                String str4 = strArr2[6];
                int iCharAt = str3.charAt(26);
                int childPosition3 = str4.charAt(26);
                if (iCharAt != childPosition3) {
                    String[] strArr3 = A01;
                    strArr3[0] = "bSC6gQO3";
                    strArr3[3] = "sEisHoVo";
                    childPosition = c45944v.A0C();
                    if (childPosition > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    String[] strArr4 = A01;
                    strArr4[1] = "sCQufaVXehZdAx160HDrkvqq2FYTSg6V";
                    strArr4[6] = "xgFgm7GbjtAXUGsxujgneuzUGgVoDuJS";
                    childPosition = c45944v.A0C();
                    if (childPosition > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
                AbstractC5333HB.A01(z, A0M(1090, 30, 79));
                int childAtomType = c45944v.A0C();
                if (childAtomType == 1936289382 && (pairA07 = A07(c45944v, iA09, childPosition)) != null) {
                    return pairA07;
                }
                iA09 += childPosition;
            } else {
                return null;
            }
        }
    }

    public static Pair<long[], long[]> A09(C7235mE c7235mE) {
        long jA0P;
        C7234mD elstAtom = c7235mE.A07(1701606260);
        if (elstAtom == null) {
            return null;
        }
        C45944v c45944v = elstAtom.A00;
        String[] strArr = A01;
        if (strArr[1].charAt(26) == strArr[6].charAt(26)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[7] = "nlx0JEXKjNTNdSyjBy8qhdzuridSUNe7";
        strArr2[4] = "QPF9oPdHODxNb0EXvgymvar5stnTE0Tg";
        c45944v.A0f(8);
        int version = AbstractC5439Iu.A01(c45944v.A0C());
        int fullAtom = c45944v.A0L();
        long[] jArr = new long[fullAtom];
        long[] jArr2 = new long[fullAtom];
        for (int i = 0; i < fullAtom; i++) {
            jArr[i] = version == 1 ? c45944v.A0R() : c45944v.A0Q();
            if (version == 1) {
                jA0P = c45944v.A0P();
            } else {
                int entryCount = c45944v.A0C();
                jA0P = entryCount;
            }
            jArr2[i] = jA0P;
            int entryCount2 = c45944v.A0b();
            if (entryCount2 == 1) {
                c45944v.A0g(2);
            } else {
                throw new IllegalArgumentException(A0M(540, 23, 90));
            }
        }
        return Pair.create(jArr, jArr2);
    }

    public static Pair<Metadata, Metadata> A0A(C7234mD c7234mD) {
        C45944v c45944v = c7234mD.A00;
        c45944v.A0f(8);
        Metadata metadataA0E = null;
        Metadata metadataA0D = null;
        while (true) {
            int iA07 = c45944v.A07();
            String[] strArr = A01;
            if (strArr[7].charAt(30) == strArr[4].charAt(30)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[0] = "ATF6ss1I";
            strArr2[3] = "jntry4xS";
            if (iA07 >= 8) {
                int iA09 = c45944v.A09();
                int iA0C = c45944v.A0C();
                int iA0C2 = c45944v.A0C();
                if (iA0C2 == 1835365473) {
                    c45944v.A0f(iA09);
                    metadataA0E = A0E(c45944v, iA09 + iA0C);
                } else if (iA0C2 == 1936553057) {
                    c45944v.A0f(iA09);
                    metadataA0D = A0D(c45944v, iA09 + iA0C);
                }
                c45944v.A0f(iA09 + iA0C);
            } else {
                return Pair.create(metadataA0E, metadataA0D);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x005d, code lost:
    
        if (r4 != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005f, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0061, code lost:
    
        if (r4 != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:?, code lost:
    
        return new com.facebook.ads.androidx.media3.common.Metadata(r3);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.facebook.ads.androidx.media3.common.Metadata A0C(com.facebook.ads.redexgen.core.C45944v r5, int r6) {
        /*
            r0 = 8
            r5.A0g(r0)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
        La:
            int r0 = r5.A09()
            if (r0 >= r6) goto L39
            com.facebook.ads.androidx.media3.extractor.metadata.id3.Id3Frame r4 = com.facebook.ads.redexgen.core.AbstractC5456JB.A04(r5)
            java.lang.String[] r1 = com.facebook.ads.redexgen.core.AbstractC5445J0.A01
            r0 = 2
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 24
            if (r1 == r0) goto L27
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L27:
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.AbstractC5445J0.A01
            java.lang.String r1 = "lHUs7TBcARFSvdLvQvihflkVmEpZ1MYm"
            r0 = 7
            r2[r0] = r1
            java.lang.String r1 = "ww6ZL200nHcHREaExV9g08P8Dpl3Z1fQ"
            r0 = 4
            r2[r0] = r1
            if (r4 == 0) goto La
            r3.add(r4)
            goto La
        L39:
            boolean r4 = r3.isEmpty()
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.AbstractC5445J0.A01
            r0 = 1
            r1 = r2[r0]
            r0 = 6
            r2 = r2[r0]
            r0 = 26
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto L61
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.AbstractC5445J0.A01
            java.lang.String r1 = "WnDUA4AhIDsAjF22CXXz4OtQUCX0JoWn"
            r0 = 7
            r2[r0] = r1
            java.lang.String r1 = "j7UA12dewj7emLVLNadXlb6UYVuvbHls"
            r0 = 4
            r2[r0] = r1
            if (r4 == 0) goto L64
        L5f:
            r0 = 0
        L60:
            return r0
        L61:
            if (r4 == 0) goto L64
            goto L5f
        L64:
            com.facebook.ads.androidx.media3.common.Metadata r0 = new com.facebook.ads.androidx.media3.common.Metadata
            r0.<init>(r3)
            goto L60
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.AbstractC5445J0.A0C(com.facebook.ads.redexgen.X.4v, int):com.facebook.ads.androidx.media3.common.Metadata");
    }

    public static Metadata A0D(C45944v c45944v, int i) {
        c45944v.A0g(12);
        while (true) {
            int iA09 = c45944v.A09();
            if (A01[5].charAt(23) != 'W') {
                throw new RuntimeException();
            }
            A01[2] = "yKVAIw0tCkGB7M4Cua27Coqh";
            if (iA09 >= i) {
                return null;
            }
            int atomSize = c45944v.A09();
            int iA0C = c45944v.A0C();
            int atomPosition = c45944v.A0C();
            if (atomPosition == 1935766900) {
                if (iA0C < 14) {
                    return null;
                }
                c45944v.A0g(5);
                int iA0I = c45944v.A0I();
                if (iA0I != 12 && iA0I != 13) {
                    return null;
                }
                float f = iA0I == 12 ? 240.0f : 120.0f;
                c45944v.A0g(1);
                return new Metadata(new SmtaMetadataEntry(f, c45944v.A0I()));
            }
            c45944v.A0f(atomSize + iA0C);
        }
    }

    public static Metadata A0E(C45944v c45944v, int i) {
        c45944v.A0g(8);
        A0Q(c45944v);
        while (c45944v.A09() < i) {
            int iA09 = c45944v.A09();
            int atomType = c45944v.A0C();
            int atomSize = c45944v.A0C();
            if (atomSize == 1768715124) {
                c45944v.A0f(iA09);
                return A0C(c45944v, iA09 + atomType);
            }
            c45944v.A0f(iA09 + atomType);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:118:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:59:0x00fa  */
    public static C5443Iy A0H(C45944v c45944v, int i, int i2, String str, DrmInitData drmInitData, boolean z) throws C44963K {
        c45944v.A0f(12);
        int iA0C = c45944v.A0C();
        C5443Iy c5443Iy = new C5443Iy(iA0C);
        for (int childStartPosition = 0; childStartPosition < iA0C; childStartPosition++) {
            int iA09 = c45944v.A09();
            int iA0C2 = c45944v.A0C();
            AbstractC5333HB.A01(iA0C2 > 0, A0M(1090, 30, 79));
            int iA0C3 = c45944v.A0C();
            if (iA0C3 != 1635148593 && iA0C3 != 1635148595 && iA0C3 != 1701733238 && iA0C3 != 1831958048 && iA0C3 != 1836070006 && iA0C3 != 1752589105 && iA0C3 != 1751479857 && iA0C3 != 1932670515 && iA0C3 != 1211250227 && iA0C3 != 1987063864 && iA0C3 != 1987063865 && iA0C3 != 1635135537 && iA0C3 != 1685479798 && iA0C3 != 1685479729 && iA0C3 != 1685481573 && iA0C3 != 1685481521) {
                if (A01[5].charAt(23) == 'W') {
                    String[] strArr = A01;
                    strArr[0] = "Lno9V07i";
                    strArr[3] = "YEniY2O3";
                    if (iA0C3 == 1836069985 || iA0C3 == 1701733217 || iA0C3 == 1633889587 || iA0C3 == 1700998451 || iA0C3 == 1633889588) {
                        A0T(c45944v, iA0C3, iA09, iA0C2, i, str, z, drmInitData, c5443Iy, childStartPosition);
                    } else {
                        if (A01[2].length() != 24) {
                            String[] strArr2 = A01;
                            strArr2[1] = "oNdMvJKT47PBcE7ne9hrfWimoE8yMs3Y";
                            strArr2[6] = "E91ArCAwNKvmlCTKVUGyb2erGBttgGv0";
                            if (iA0C3 != 1835823201) {
                                if (iA0C3 == 1685353315 && iA0C3 != 1685353317 && iA0C3 != 1685353320 && iA0C3 != 1685353324 && iA0C3 != 1685353336 && iA0C3 != 1935764850 && iA0C3 != 1935767394 && iA0C3 != 1819304813 && iA0C3 != 1936684916 && iA0C3 != 1953984371 && iA0C3 != 778924082 && iA0C3 != 778924083 && iA0C3 != 1835557169 && iA0C3 != 1835560241 && iA0C3 != 1634492771 && iA0C3 != 1634492791 && iA0C3 != 1970037111 && iA0C3 != 1332770163 && iA0C3 != 1716281667) {
                                    String[] strArr3 = A01;
                                    if (strArr3[0].length() == strArr3[3].length()) {
                                        A01[5] = "mlJGx5h1gegl7007OPiYCkGWkqECmimV";
                                        if (iA0C3 == 1414810956) {
                                            iA09 = iA09;
                                            iA0C2 = iA0C2;
                                            A0S(c45944v, iA0C3, iA09, iA0C2, i, str, c5443Iy);
                                        } else {
                                            if (A01[5].charAt(23) != 'W') {
                                                throw new RuntimeException();
                                            }
                                            A01[2] = "522w9jUs1Cdec5FzFXJEv7rx";
                                            if (iA0C3 == 1954034535 || iA0C3 == 2004251764 || iA0C3 == 1937010800 || iA0C3 == 1664495672) {
                                                iA09 = iA09;
                                                iA0C2 = iA0C2;
                                                A0S(c45944v, iA0C3, iA09, iA0C2, i, str, c5443Iy);
                                            } else if (iA0C3 == 1835365492) {
                                                A0U(c45944v, iA0C3, iA09, i, c5443Iy);
                                            } else if (iA0C3 == 1667329389) {
                                                c5443Iy.A02 = new C44672p().A0g(i).A11(A0M(IronSourceError.ERROR_NT_INSTANCE_LOAD_EMPTY_ADAPTER, 27, 38)).A14();
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            A01[2] = "3e9ArAGLRrjfeL1rnoEKSVyw";
                            if (iA0C3 != 1835823201) {
                                if (iA0C3 == 1685353315) {
                                }
                            }
                        }
                        A0T(c45944v, iA0C3, iA09, iA0C2, i, str, z, drmInitData, c5443Iy, childStartPosition);
                    }
                }
                throw new RuntimeException();
            }
            A0R(c45944v, iA0C3, iA09, iA0C2, i, i2, drmInitData, c5443Iy, childStartPosition);
            c45944v.A0f(iA09 + iA0C2);
        }
        return c5443Iy;
    }

    public static ByteBuffer A0N() {
        return ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.kO != com.google.common.base.Function<com.facebook.ads.androidx.media3.extractor.mp4.Track, com.facebook.ads.androidx.media3.extractor.mp4.Track> */
    public static List<C5472JR> A0O(C7235mE c7235mE, C5342HK c5342hk, long j, DrmInitData drmInitData, boolean z, boolean z2, InterfaceC7123kO<C5469JO, C5469JO> interfaceC7123kO) throws C44963K {
        C5469JO c5469joA4B;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < c7235mE.A01.size(); i++) {
            C7235mE c7235mE2 = c7235mE.A01.get(i);
            if (((AbstractC5439Iu) c7235mE2).A00 == 1953653099 && (c5469joA4B = interfaceC7123kO.A4B(A0J(c7235mE2, (C7234mD) AbstractC45353y.A01(c7235mE.A07(1836476516)), j, drmInitData, z, z2))) != null) {
                C7235mE c7235mE3 = (C7235mE) AbstractC45353y.A01(c7235mE2.A06(1835297121));
                if (A01[2].length() != 24) {
                    throw new RuntimeException();
                }
                String[] strArr = A01;
                strArr[0] = "jveTcVJC";
                strArr[3] = "kDhQUkZe";
                arrayList.add(A0L(c5469joA4B, (C7235mE) AbstractC45353y.A01(((C7235mE) AbstractC45353y.A01(c7235mE3.A06(1835626086))).A06(1937007212)), c5342hk));
            }
        }
        return arrayList;
    }

    public static void A0Q(C45944v c45944v) {
        int iA09 = c45944v.A09();
        c45944v.A0g(4);
        if (c45944v.A0C() != 1751411826) {
            iA09 += 4;
        }
        c45944v.A0f(iA09);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BP != com.google.common.collect.ImmutableList<byte[]> */
    public static void A0S(C45944v c45944v, int i, int i2, int i3, int i4, String str, C5443Iy c5443Iy) {
        String strA0M;
        c45944v.A0f(i2 + 8 + 8);
        AbstractC4978BP abstractC4978BPA04 = null;
        long j = Long.MAX_VALUE;
        if (i == 1414810956) {
            strA0M = A0M(691, 20, 103);
        } else if (i == 1954034535) {
            strA0M = A0M(784, 28, 58);
            int sampleDescriptionLength = (i3 - 8) - 8;
            byte[] bArr = new byte[sampleDescriptionLength];
            c45944v.A0k(bArr, 0, sampleDescriptionLength);
            abstractC4978BPA04 = AbstractC4978BP.A04(bArr);
        } else if (i == 2004251764) {
            strA0M = A0M(763, 21, 88);
        } else if (i == 1937010800) {
            strA0M = A0M(691, 20, 103);
            j = 0;
        } else if (i == 1664495672) {
            strA0M = A0M(738, 25, 73);
            c5443Iy.A01 = 1;
        } else {
            throw new IllegalStateException();
        }
        c5443Iy.A02 = new C44672p().A0g(i4).A11(strA0M).A10(str).A0s(j).A12(abstractC4978BPA04).A14();
    }

    public static void A0U(C45944v c45944v, int i, int i2, int i3, C5443Iy c5443Iy) {
        c45944v.A0f(i2 + 8 + 8);
        if (i == 1835365492) {
            c45944v.A0U();
            String strA0U = c45944v.A0U();
            if (strA0U != null) {
                c5443Iy.A02 = new C44672p().A0g(i3).A11(strA0U).A14();
            }
        }
    }

    public static boolean A0V(long[] jArr, long j, long j2, long j3) {
        int latestDelayIndex = jArr.length - 1;
        int iA07 = AbstractC46115C.A07(4, 0, latestDelayIndex);
        int lastIndex = jArr.length;
        int latestDelayIndex2 = AbstractC46115C.A07(lastIndex - 4, 0, latestDelayIndex);
        if (jArr[0] <= j2) {
            long j4 = jArr[iA07];
            String[] strArr = A01;
            String str = strArr[0];
            String str2 = strArr[3];
            int length = str.length();
            int lastIndex2 = str2.length();
            if (length != lastIndex2) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[7] = "4d2838LB6zuHL2SDSRFgaAe0bfX5eWcN";
            strArr2[4] = "2DmC9sheXkti4jYQDflGydtNBiOhlXlc";
            if (j2 < j4 && jArr[latestDelayIndex2] < j3 && j3 <= j) {
                return true;
            }
        }
        return false;
    }

    public static byte[] A0W(C45944v c45944v, int i, int i2) {
        int i3 = i + 8;
        while (childPosition < i2) {
            c45944v.A0f(i3);
            int iA0C = c45944v.A0C();
            int iA0C2 = c45944v.A0C();
            String[] strArr = A01;
            String str = strArr[7];
            String str2 = strArr[4];
            int childAtomSize = str.charAt(30);
            int childPosition = str2.charAt(30);
            if (childAtomSize == childPosition) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[0] = "QfAHDCYR";
            strArr2[3] = "If6V2JqI";
            if (iA0C2 == 1886547818) {
                int childPosition2 = i3 + iA0C;
                return Arrays.copyOfRange(c45944v.A0l(), i3, childPosition2);
            }
            i3 += iA0C;
        }
        return null;
    }
}
