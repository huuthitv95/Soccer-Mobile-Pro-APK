package com.facebook.ads.redexgen.core;

import android.net.Uri;
import android.util.Pair;
import android.util.SparseArray;
import com.facebook.ads.androidx.media3.common.DrmInitData;
import com.facebook.ads.androidx.media3.extractor.metadata.emsg.EventMessage;
import com.facebook.internal.FacebookRequestErrorClassification;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.p300io.encoding.Base64;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.m7 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
@MetaExoPlayerCustomization("Rename the class for A/B Testing")
public final class C7228m7 implements InterfaceC5331H9 {
    public static byte[] A0Z;
    public static String[] A0a = {"vtb", "vbKonC", "9ohrxt3rIVPnhyMUHrYVmyK7bOK5FZ2r", "2NigTWH0ge82u7sbUdSeL8Wtj6iQtHIS", "zZrcpvCeqeJUqHmK3YGTET67EQVL4Dlr", "FEfAuyU", "TXQt6Bb5wsq1E0rpiydPRGzBJonmO6nW", "L3NiJ083BoYvWzKRwautviQbODBNEwGW"};
    public static final InterfaceC5335HD A0b;
    public static final C7472qI A0c;
    public static final byte[] A0d;
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

    @MetaExoPlayerCustomization("New field")
    public long A0A;
    public long A0B;
    public long A0C;
    public C45944v A0D;
    public InterfaceC5332HA A0E;
    public C5455JA A0F;
    public boolean A0G;
    public boolean A0H;
    public InterfaceC5361Hd[] A0I;
    public InterfaceC5361Hd[] A0J;
    public final int A0K;
    public final SparseArray<C5455JA> A0L;
    public final C45944v A0M;
    public final C45944v A0N;
    public final C45944v A0O;
    public final C45944v A0P;
    public final C45944v A0Q;
    public final C460253 A0R;
    public final InterfaceC5361Hd A0S;
    public final C5384I0 A0T;
    public final C5469JO A0U;
    public final ArrayDeque<C7235mE> A0V;
    public final ArrayDeque<C5454J9> A0W;
    public final List<C7472qI> A0X;
    public final byte[] A0Y;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static int A01(C5455JA c5455ja, int i, int i2, C45944v c45944v, int i3) throws C44963K {
        int iA0C;
        int iA0C2;
        int i4 = i3;
        c45944v.A0f(8);
        int iA00 = AbstractC5439Iu.A00(c45944v.A0C());
        C5469JO c5469jo = c5455ja.A05.A03;
        C5471JQ c5471jq = c5455ja.A09;
        C5446J1 c5446j1 = (C5446J1) AbstractC46115C.A0f(c5471jq.A06);
        c5471jq.A0C[i] = c45944v.A0L();
        c5471jq.A0E[i] = c5471jq.A04;
        if ((iA00 & 1) != 0) {
            long[] jArr = c5471jq.A0E;
            jArr[i] = jArr[i] + ((long) c45944v.A0C());
        }
        boolean z = (iA00 & 4) != 0;
        int iA0C3 = c5446j1.A01;
        if (z) {
            iA0C3 = c45944v.A0C();
        }
        boolean z2 = (iA00 & 256) != 0;
        boolean z3 = (iA00 & 512) != 0;
        boolean z4 = (iA00 & 1024) != 0;
        boolean z5 = (iA00 & 2048) != 0;
        long j = A0a(c5469jo) ? ((long[]) AbstractC46115C.A0f(c5469jo.A09))[0] : 0L;
        int[] iArr = c5471jq.A0B;
        long[] jArr2 = c5471jq.A0D;
        boolean[] zArr = c5471jq.A0G;
        boolean z6 = c5469jo.A03 == 2 && (i2 & 1) != 0;
        int i5 = i4 + c5471jq.A0C[i];
        long j2 = c5469jo.A06;
        long j3 = c5471jq.A05;
        while (i4 < i5) {
            if (z2) {
                iA0C = c45944v.A0C();
                if (A0a[5].length() == 30) {
                    throw new RuntimeException();
                }
                A0a[0] = "Vvd";
            } else {
                iA0C = c5446j1.A00;
            }
            int iA01 = A00(iA0C);
            int iA02 = A00(z3 ? c45944v.A0C() : c5446j1.A03);
            if (z4) {
                iA0C2 = c45944v.A0C();
            } else {
                iA0C2 = (i4 == 0 && z) ? iA0C3 : c5446j1.A01;
            }
            jArr2[i4] = AbstractC46115C.A0U((((long) (z5 ? c45944v.A0C() : 0)) + j3) - j, 1000000L, j2);
            if (!c5471jq.A09) {
                jArr2[i4] = jArr2[i4] + c5455ja.A05.A02;
            }
            iArr[i4] = iA02;
            zArr[i4] = ((iA0C2 >> 16) & 1) == 0 && (!z6 || i4 == 0);
            j3 += (long) iA01;
            i4++;
        }
        c5471jq.A05 = j3;
        return i5;
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static Pair<Long, C7268my> A05(C45944v c45944v, long j) throws C44963K {
        long jA0R;
        long jA0R2;
        c45944v.A0f(8);
        int iA01 = AbstractC5439Iu.A01(c45944v.A0C());
        c45944v.A0g(4);
        long jA0Q = c45944v.A0Q();
        if (iA01 == 0) {
            jA0R = c45944v.A0Q();
            jA0R2 = j + c45944v.A0Q();
        } else {
            jA0R = c45944v.A0R();
            jA0R2 = j + c45944v.A0R();
        }
        long jA0U = AbstractC46115C.A0U(jA0R, 1000000L, jA0Q);
        c45944v.A0g(2);
        int iA0M = c45944v.A0M();
        int[] iArr = new int[iA0M];
        long[] jArr = new long[iA0M];
        long[] jArr2 = new long[iA0M];
        long[] jArr3 = new long[iA0M];
        long jA0U2 = jA0U;
        for (int i = 0; i < iA0M; i++) {
            int iA0C = c45944v.A0C();
            if ((Integer.MIN_VALUE & iA0C) != 0) {
                throw C44963K.A01(A0A(756, 28, 79), null);
            }
            long jA0Q2 = c45944v.A0Q();
            iArr[i] = Integer.MAX_VALUE & iA0C;
            jArr[i] = jA0R2;
            jArr3[i] = jA0U2;
            jA0R += jA0Q2;
            jA0U2 = AbstractC46115C.A0U(jA0R, 1000000L, jA0Q);
            jArr2[i] = jA0U2 - jArr3[i];
            c45944v.A0g(4);
            jA0R2 += (long) iArr[i];
        }
        return Pair.create(Long.valueOf(jA0U), new C7268my(iArr, jArr, jArr2, jArr3));
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C5455JA A09(C45944v c45944v, SparseArray<C5455JA> sparseArray, boolean z) {
        c45944v.A0f(8);
        int iA00 = AbstractC5439Iu.A00(c45944v.A0C());
        C5455JA c5455jaValueAt = z ? sparseArray.valueAt(0) : sparseArray.get(c45944v.A0C());
        if (c5455jaValueAt == null) {
            String[] strArr = A0a;
            if (strArr[4].charAt(20) == strArr[6].charAt(20)) {
                throw new RuntimeException();
            }
            A0a[1] = "jDobgNhtM";
            return null;
        }
        if ((iA00 & 1) != 0) {
            long jA0R = c45944v.A0R();
            c5455jaValueAt.A09.A04 = jA0R;
            c5455jaValueAt.A09.A03 = jA0R;
        }
        C5446J1 c5446j1 = c5455jaValueAt.A04;
        c5455jaValueAt.A09.A06 = new C5446J1((iA00 & 2) != 0 ? c45944v.A0C() - 1 : c5446j1.A02, (iA00 & 8) != 0 ? c45944v.A0C() : c5446j1.A00, (iA00 & 16) != 0 ? c45944v.A0C() : c5446j1.A03, (iA00 & 32) != 0 ? c45944v.A0C() : c5446j1.A01);
        return c5455jaValueAt;
    }

    public static String A0A(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0Z, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A0a;
            if (strArr[4].charAt(20) == strArr[6].charAt(20)) {
                throw new RuntimeException();
            }
            A0a[5] = "p0M5dFs6dnHIC4r2oiX9lIp2";
            if (i4 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 74);
            i4++;
        }
    }

    public static void A0D() {
        A0Z = new byte[]{8, 65, 91, 8, 76, 65, 78, 78, 77, 90, 77, 70, 92, 8, 78, 90, 71, 69, 8, 78, 90, 73, 79, 69, 77, 70, 92, 8, 91, 73, 69, 88, 68, 77, 8, 75, 71, 93, 70, 92, 109, 36, 62, 109, 42, 63, 40, 44, 57, 40, 63, 109, 57, 37, 44, 35, 109, 43, 63, 44, 42, 32, 40, 35, 57, 109, 62, 44, 32, Base64.padSymbol, 33, 40, 109, 46, 34, 56, 35, 57, 47, Ascii.SUB, 1, 3, 78, Ascii.f22494GS, 7, Ascii.DC4, Ascii.f22503VT, 78, 2, Ascii.f22503VT, Ascii.f22494GS, Ascii.f22494GS, 78, Ascii.SUB, 6, Ascii.f22499SI, 0, 78, 6, Ascii.f22503VT, Ascii.f22499SI, 10, Ascii.f22503VT, Ascii.f22493FS, 78, 2, Ascii.f22503VT, 0, 9, Ascii.SUB, 6, 78, 70, Ascii.ESC, 0, Ascii.f22494GS, Ascii.ESC, Ascii.f22498RS, Ascii.f22498RS, 1, Ascii.f22493FS, Ascii.SUB, Ascii.f22503VT, 10, 71, SignedBytes.MAX_POWER_OF_TWO, 70, 109, 119, 113, 122, 35, 96, 108, 118, 109, 119, 35, 106, 109, 35, 112, 97, 100, 115, 35, 34, 62, 35, 50, 35, 43, 118, 109, 112, 118, 115, 115, 108, 113, 119, 102, 103, 42, 45, Ascii.f22494GS, 54, 44, 42, 33, 120, 59, 55, 45, 54, 44, 120, 49, 54, 120, 43, 63, 40, 60, 120, 121, 101, 120, 105, 120, 112, 45, 54, 43, 45, 40, 40, 55, 42, 44, Base64.padSymbol, 60, 113, 118, 71, 115, 96, 102, 108, 100, 111, 117, 100, 101, 76, 113, 53, 68, 121, 117, 115, 96, 98, 117, 110, 115, Ascii.f22500SO, 32, 41, 40, 53, 46, 41, 32, 103, 41, 34, 32, 38, 51, 46, 49, 34, 103, 40, 33, 33, 52, 34, 51, 103, 51, 40, 103, 52, 38, 42, 55, 43, 34, 103, 35, 38, 51, 38, 105, 118, 81, 73, 94, 83, 86, 91, Ascii.f22502US, 113, 126, 115, Ascii.f22502US, 83, 90, 81, 88, 75, 87, 0, 41, 45, 42, 108, 45, 56, 35, 33, 108, 40, 41, 42, 37, 34, 41, 63, 108, 41, 52, 56, 41, 34, 40, 41, 40, 108, 45, 56, 35, 33, 108, 63, 37, 54, 41, 108, 100, 57, 34, 63, 57, 60, 60, 35, 62, 56, 41, 40, 101, 98, 75, 98, 102, 97, 39, 102, 115, 104, 106, 39, 112, 110, 115, 111, 39, 107, 98, 105, 96, 115, 111, 39, 57, 39, 53, 54, 51, 48, 51, 63, 52, 49, 51, 48, 39, 47, 114, 105, 116, 114, 119, 119, 104, 117, 115, 98, 99, 46, 41, 62, Ascii.ETB, Ascii.ETB, 2, Ascii.DC4, 5, 81, 5, Ascii.f22498RS, 81, Ascii.DC4, Ascii.f22502US, Ascii.DC2, 3, 8, 1, 5, Ascii.CAN, Ascii.f22498RS, Ascii.f22502US, 81, Ascii.NAK, Ascii.DLE, 5, Ascii.DLE, 81, 6, Ascii.DLE, 2, 81, Ascii.f22502US, Ascii.DC4, Ascii.SYN, Ascii.DLE, 5, Ascii.CAN, 7, Ascii.DC4, 95, 120, 81, 81, 68, 82, 67, Ascii.ETB, 67, 88, Ascii.ETB, 82, 89, 83, Ascii.ETB, 88, 81, Ascii.ETB, 90, 83, 86, 67, Ascii.ETB, SignedBytes.MAX_POWER_OF_TWO, 86, 68, Ascii.ETB, 89, 82, 80, 86, 67, 94, 65, 82, Ascii.f22491EM, Ascii.ESC, 34, 49, 38, 38, Base64.padSymbol, 48, Base64.padSymbol, 58, 51, 116, 0, 38, 53, 55, 63, 17, 58, 55, 38, 45, 36, 32, Base64.padSymbol, 59, 58, Ascii.SYN, 59, 44, 116, 36, 53, 38, 53, 57, 49, 32, 49, 38, 39, 116, Base64.padSymbol, 39, 116, 33, 58, 39, 33, 36, 36, 59, 38, 32, 49, 48, 122, 35, 17, Ascii.f22491EM, 10, 80, 3, 17, Ascii.f22494GS, 0, Ascii.f22493FS, Ascii.NAK, 80, 19, Ascii.f22502US, 5, Ascii.f22498RS, 4, 80, 70, 112, 123, 118, 53, 102, 116, 120, 101, 121, 112, 53, 118, 122, 96, 123, 97, 53, 5, Base64.padSymbol, 63, 38, 38, 51, 50, 118, 38, 37, 37, 62, 118, 55, 34, 57, 59, 118, 126, 48, 55, 63, 58, 51, 50, 118, 34, 57, 118, 51, 46, 34, 36, 55, 53, 34, 118, 35, 35, 63, 50, 127, 78, 118, 116, 109, 109, 116, 115, 122, Base64.padSymbol, 124, 105, 114, 112, Base64.padSymbol, 106, 116, 105, 117, Base64.padSymbol, 113, 120, 115, 122, 105, 117, Base64.padSymbol, 35, Base64.padSymbol, 47, 44, 41, 42, 41, 37, 46, 43, 41, 42, Base64.padSymbol, 53, 104, 115, 110, 104, 109, 109, 114, 111, 105, 120, 121, 52, 51, 1, 57, 59, 34, 34, 59, 60, 53, 114, 39, 60, 33, 39, 34, 34, Base64.padSymbol, 32, 38, 55, 54, 114, 55, 63, 33, 53, 114, 36, 55, 32, 33, 59, Base64.padSymbol, 60, 104, 114, Ascii.ETB, 44, 39, 58, 50, 39, 33, 54, 39, 38, 98, 47, 45, 45, 52, 98, 32, 45, 58, 108, 92, 103, 108, 113, 121, 108, 106, 125, 108, 109, 41, 103, 108, 110, 104, 125, 96, 127, 108, 41, 127, 104, 101, 124, 108, 51, 41, 35, Ascii.CAN, 19, Ascii.f22500SO, 6, 19, Ascii.NAK, 2, 19, Ascii.DC2, 86, 5, Ascii.ETB, Ascii.f22502US, Ascii.f22491EM, 86, 19, Ascii.CAN, 2, 4, Ascii.f22499SI, 86, Ascii.NAK, Ascii.f22491EM, 3, Ascii.CAN, 2, 76, 86, 80, 107, 109, 100, 107, 97, 105, 96, 97, 37, 108, 107, 97, 108, 119, 96, 102, 113, 37, 119, 96, 99, 96, 119, 96, 107, 102, 96, 114, 69, 86, 77, 69, 70, 72, 65, 4, 72, 65, 74, 67, 80, 76, 4, SignedBytes.MAX_POWER_OF_TWO, 65, 87, 71, 86, 77, 84, 80, 77, 75, 74, 4, 77, 74, 4, 87, 67, 84, SignedBytes.MAX_POWER_OF_TWO, 4, 66, 75, 81, 74, SignedBytes.MAX_POWER_OF_TWO, 4, Ascii.f22492FF, 81, 74, 87, 81, 84, 84, 75, 86, 80, 65, SignedBytes.MAX_POWER_OF_TWO, Ascii.f22490CR, 102, 119, 119, 107, 110, 100, 102, 115, 110, 104, 105, 40, 127, 42, 98, 106, 116, 96, 88, 73, 73, 85, 80, 90, 88, 77, 80, 86, 87, Ascii.SYN, 65, Ascii.DC4, 84, 73, Ascii.f22490CR, Ascii.DC4, 79, 77, 77, 52, 32, 49, 60, 58, 122, 52, 54, 97, 72, 87, 90, 91, 81, 17, 86, 91, 72, 93, 126, 97, 108, 109, 103, 39, 101, 120, 60};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @MetaExoPlayerCustomization("Adding Uri for eMsg")
    private void A0H(C45944v c45944v, Uri uri) {
        String str;
        String str2;
        long jA05;
        long jA0U;
        long jA0Q;
        if (this.A0J.length == 0) {
            return;
        }
        c45944v.A0f(8);
        if (A0a[3].charAt(19) != 'e') {
            throw new RuntimeException();
        }
        A0a[1] = "i2btDlVidn";
        int iA01 = AbstractC5439Iu.A01(c45944v.A0C());
        long jA0U2 = -9223372036854775807L;
        switch (iA01) {
            case 0:
                str = (String) AbstractC45353y.A01(c45944v.A0U());
                str2 = (String) AbstractC45353y.A01(c45944v.A0U());
                long jA0Q2 = c45944v.A0Q();
                jA0U2 = AbstractC46115C.A0U(c45944v.A0Q(), 1000000L, jA0Q2);
                jA05 = this.A0C != -9223372036854775807L ? this.A0C + jA0U2 : -9223372036854775807L;
                jA0U = AbstractC46115C.A0U(c45944v.A0Q(), 1000L, jA0Q2);
                jA0Q = c45944v.A0Q();
                break;
            case 1:
                long jA0Q3 = c45944v.A0Q();
                jA05 = AbstractC46115C.A0U(c45944v.A0R(), 1000000L, jA0Q3);
                jA0U = AbstractC46115C.A0U(c45944v.A0Q(), 1000L, jA0Q3);
                jA0Q = c45944v.A0Q();
                str = (String) AbstractC45353y.A01(c45944v.A0U());
                str2 = (String) AbstractC45353y.A01(c45944v.A0U());
                break;
            default:
                AbstractC45794g.A07(A0A(204, 22, 75), A0A(645, 35, 24) + iA01);
                return;
        }
        byte[] bArr = new byte[c45944v.A07()];
        c45944v.A0k(bArr, 0, c45944v.A07());
        int i = 0;
        C45944v c45944v2 = new C45944v(this.A0T.A01(new EventMessage(str, str2, jA0U, jA0Q, bArr)));
        int iA07 = c45944v2.A07();
        InterfaceC5361Hd[] interfaceC5361HdArr = this.A0J;
        int length = interfaceC5361HdArr.length;
        int i2 = 0;
        while (i2 < length) {
            InterfaceC5361Hd interfaceC5361Hd = interfaceC5361HdArr[i2];
            c45944v2.A0f(i);
            interfaceC5361Hd.AKf(uri);
            interfaceC5361Hd.AIr(c45944v2, iA07);
            i2++;
            i = 0;
        }
        if (jA05 == -9223372036854775807L) {
            this.A0W.addLast(new C5454J9(jA0U2, true, iA07));
            this.A03 += iA07;
            return;
        }
        if (!this.A0W.isEmpty()) {
            this.A0W.addLast(new C5454J9(jA05, false, iA07));
            this.A03 += iA07;
            return;
        }
        if (this.A0R != null) {
            C460253 c460253 = this.A0R;
            if (A0a[1].length() != 3) {
                String[] strArr = A0a;
                strArr[4] = "dSij3ZZr7drragDO7KaW8OWZIZwByPGb";
                strArr[6] = "O4MuDOrrUt3KGtyHElmFzP2mmpN9Ut0I";
                jA05 = c460253.A05(jA05);
            } else {
                jA05 = c460253.A05(jA05);
            }
        }
        if (this.A0A != -9223372036854775807L && !MetaExoPlayerUpgradeConfig.A03(EnumC7071jX.A11)) {
            jA05 = this.A0A;
        }
        InterfaceC5361Hd[] interfaceC5361HdArr2 = this.A0J;
        if (A0a[0].length() != 3) {
            throw new RuntimeException();
        }
        A0a[2] = "lJ55r5gDB38Ao7rNsYIhv4IUy3LH5Ini";
        for (InterfaceC5361Hd interfaceC5361Hd2 : interfaceC5361HdArr2) {
            interfaceC5361Hd2.AIu(jA05, 1, iA07, 0, null);
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static void A0R(C7235mE c7235mE, SparseArray<C5455JA> sparseArray, boolean z, int i, byte[] bArr) throws C44963K {
        C5455JA c5455jaA09 = A09(((C7234mD) AbstractC45353y.A01(c7235mE.A07(1952868452))).A00, sparseArray, z);
        if (c5455jaA09 == null) {
            return;
        }
        C5471JQ c5471jq = c5455jaA09.A09;
        long j = c5471jq.A05;
        boolean z2 = c5471jq.A09;
        c5455jaA09.A08();
        c5455jaA09.A06 = true;
        C7234mD c7234mDA07 = c7235mE.A07(1952867444);
        if (c7234mDA07 == null || (i & 2) != 0) {
            c5471jq.A05 = j;
            String[] strArr = A0a;
            if (strArr[4].charAt(20) == strArr[6].charAt(20)) {
                throw new RuntimeException();
            }
            A0a[7] = "mrSj0GzHTHwkPK2z0oCyoB4jTU17nK7M";
            c5471jq.A09 = z2;
        } else {
            c5471jq.A05 = A03(c7234mDA07.A00);
            c5471jq.A09 = true;
        }
        A0S(c7235mE, c5455jaA09, i);
        C5469JO c5469jo = c5455jaA09.A05.A03;
        Object objA01 = AbstractC45353y.A01(c5471jq.A06);
        String[] strArr2 = A0a;
        if (strArr2[4].charAt(20) == strArr2[6].charAt(20)) {
            throw new RuntimeException();
        }
        A0a[1] = "vW8YzoDO1k8YQphW8Ysx";
        C5470JP c5470jpA00 = c5469jo.A00(((C5446J1) objA01).A02);
        C7234mD c7234mDA08 = c7235mE.A07(1935763834);
        if (c7234mDA08 != null) {
            A0V((C5470JP) AbstractC45353y.A01(c5470jpA00), c7234mDA08.A00, c5471jq);
        }
        C7234mD c7234mDA09 = c7235mE.A07(1935763823);
        if (c7234mDA09 != null) {
            A0I(c7234mDA09.A00, c5471jq);
        }
        C7234mD c7234mDA010 = c7235mE.A07(1936027235);
        if (c7234mDA010 != null) {
            A0J(c7234mDA010.A00, c5471jq);
        }
        A0T(c7235mE, c5470jpA00 != null ? c5470jpA00.A02 : null, c5471jq);
        int size = c7235mE.A02.size();
        for (int i2 = 0; i2 < size; i2++) {
            C7234mD c7234mD = c7235mE.A02.get(i2);
            if (((AbstractC5439Iu) c7234mD).A00 == 1970628964) {
                A0K(c7234mD.A00, c5471jq, bArr);
            }
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static void A0T(C7235mE c7235mE, String str, C5471JQ c5471jq) throws C44963K {
        C45944v c45944v = null;
        C45944v c45944v2 = null;
        for (int i = 0; i < c7235mE.A02.size(); i++) {
            C7234mD c7234mD = c7235mE.A02.get(i);
            C45944v c45944v3 = c7234mD.A00;
            if (((AbstractC5439Iu) c7234mD).A00 == 1935828848) {
                c45944v3.A0f(12);
                if (c45944v3.A0C() == 1936025959) {
                    c45944v = c45944v3;
                }
            } else if (((AbstractC5439Iu) c7234mD).A00 == 1936158820) {
                c45944v3.A0f(12);
                if (c45944v3.A0C() == 1936025959) {
                    c45944v2 = c45944v3;
                }
            }
        }
        if (c45944v == null || c45944v2 == null) {
            return;
        }
        c45944v.A0f(8);
        int iA01 = AbstractC5439Iu.A01(c45944v.A0C());
        c45944v.A0g(4);
        if (iA01 == 1) {
            c45944v.A0g(4);
        }
        if (c45944v.A0C() != 1) {
            throw C44963K.A00(A0A(126, 39, 73));
        }
        c45944v2.A0f(8);
        int iA02 = AbstractC5439Iu.A01(c45944v2.A0C());
        c45944v2.A0g(4);
        if (iA02 == 1) {
            if (c45944v2.A0Q() == 0) {
                throw C44963K.A00(A0A(784, 55, 110));
            }
        } else if (iA02 >= 2) {
            c45944v2.A0g(4);
        }
        if (c45944v2.A0Q() != 1) {
            throw C44963K.A00(A0A(165, 39, 18));
        }
        c45944v2.A0g(1);
        int iA0I = c45944v2.A0I();
        int i2 = (iA0I & 240) >> 4;
        int i3 = iA0I & 15;
        boolean z = c45944v2.A0I() == 1;
        if (z) {
            int iA0I2 = c45944v2.A0I();
            byte[] bArr = new byte[16];
            c45944v2.A0k(bArr, 0, bArr.length);
            byte[] bArr2 = null;
            if (iA0I2 == 0) {
                int iA0I3 = c45944v2.A0I();
                bArr2 = new byte[iA0I3];
                c45944v2.A0k(bArr2, 0, iA0I3);
            }
            c5471jq.A08 = true;
            c5471jq.A07 = new C5470JP(z, str, iA0I2, bArr, i2, i3, bArr2);
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static void A0V(C5470JP c5470jp, C45944v c45944v, C5471JQ c5471jq) throws C44963K {
        int i = c5470jp.A00;
        c45944v.A0f(8);
        if ((AbstractC5439Iu.A00(c45944v.A0C()) & 1) == 1) {
            c45944v.A0g(8);
        }
        int iA0I = c45944v.A0I();
        int iA0L = c45944v.A0L();
        if (iA0L > c5471jq.A00) {
            throw C44963K.A01(A0A(514, 18, 58) + iA0L + A0A(40, 38, 7) + c5471jq.A00, null);
        }
        int i2 = 0;
        if (iA0I == 0) {
            boolean[] zArr = c5471jq.A0F;
            if (A0a[1].length() == 3) {
                throw new RuntimeException();
            }
            A0a[0] = "ACu";
            for (int i3 = 0; i3 < iA0L; i3++) {
                int iA0I2 = c45944v.A0I();
                i2 += iA0I2;
                zArr[i3] = iA0I2 > i;
            }
        } else {
            i2 = 0 + (iA0I * iA0L);
            Arrays.fill(c5471jq.A0F, 0, iA0L, iA0I > i);
        }
        Arrays.fill(c5471jq.A0F, iA0L, c5471jq.A00, false);
        if (i2 > 0) {
            c5471jq.A02(i2);
        }
    }

    static {
        A0D();
        A0b = new InterfaceC5335HD() { // from class: com.facebook.ads.redexgen.X.m8
            @Override // com.facebook.ads.redexgen.core.InterfaceC5335HD
            public final InterfaceC5331H9[] A5N() {
                return C7228m7.A0b();
            }

            @Override // com.facebook.ads.redexgen.core.InterfaceC5335HD
            public final /* synthetic */ InterfaceC5331H9[] A5O(Uri uri, Map map) {
                return AbstractC5334HC.A01(this, uri, map);
            }
        };
        A0d = new byte[]{-94, 57, 79, 82, 90, -101, 79, Ascii.DC4, -94, 68, 108, 66, 124, 100, -115, -12};
        A0c = new C44672p().A11(A0A(839, 18, 77)).A14();
    }

    public C7228m7() {
        this(0);
    }

    public C7228m7(int i) {
        this(i, null);
    }

    public C7228m7(int i, C460253 c460253) {
        this(i, c460253, null, Collections.emptyList());
    }

    public C7228m7(int i, C460253 c460253, C5469JO c5469jo, List<C7472qI> list) {
        this(i, c460253, c5469jo, list, null);
    }

    @MetaExoPlayerCustomization("Additional fields for custom behaviors")
    public C7228m7(int i, C460253 c460253, C5469JO c5469jo, List<C7472qI> list, InterfaceC5361Hd interfaceC5361Hd) {
        this.A0A = -9223372036854775807L;
        this.A0K = i;
        this.A0R = c460253;
        this.A0U = c5469jo;
        this.A0X = Collections.unmodifiableList(list);
        this.A0S = interfaceC5361Hd;
        this.A0T = new C5384I0();
        this.A0M = new C45944v(16);
        this.A0P = new C45944v(AbstractC5350HS.A03);
        this.A0O = new C45944v(5);
        this.A0N = new C45944v();
        this.A0Y = new byte[16];
        this.A0Q = new C45944v(this.A0Y);
        this.A0V = new ArrayDeque<>();
        this.A0W = new ArrayDeque<>();
        this.A0L = new SparseArray<>();
        this.A08 = -9223372036854775807L;
        this.A0B = -9223372036854775807L;
        this.A0C = -9223372036854775807L;
        this.A0E = InterfaceC5332HA.A00;
        this.A0J = new InterfaceC5361Hd[0];
        this.A0I = new InterfaceC5361Hd[0];
    }

    public static int A00(int i) throws C44963K {
        if (i >= 0) {
            return i;
        }
        throw C44963K.A01(A0A(700, 27, 67) + i, null);
    }

    public static long A02(C45944v c45944v) {
        c45944v.A0f(8);
        int fullAtom = c45944v.A0C();
        return AbstractC5439Iu.A01(fullAtom) == 0 ? c45944v.A0Q() : c45944v.A0R();
    }

    public static long A03(C45944v c45944v) {
        c45944v.A0f(8);
        int fullAtom = c45944v.A0C();
        int version = AbstractC5439Iu.A01(fullAtom);
        return version == 1 ? c45944v.A0R() : c45944v.A0Q();
    }

    public static Pair<Integer, C5446J1> A04(C45944v c45944v) {
        c45944v.A0f(12);
        int defaultSampleDescriptionIndex = c45944v.A0C();
        int trackId = c45944v.A0C();
        int defaultSampleFlags = c45944v.A0C();
        int defaultSampleSize = c45944v.A0C();
        int defaultSampleDuration = c45944v.A0C();
        return Pair.create(Integer.valueOf(defaultSampleDescriptionIndex), new C5446J1(trackId - 1, defaultSampleFlags, defaultSampleSize, defaultSampleDuration));
    }

    public static DrmInitData A06(List<C7234mD> list) {
        ArrayList arrayList = null;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C7234mD c7234mD = list.get(i);
            int leafChildrenSize = ((AbstractC5439Iu) c7234mD).A00;
            if (leafChildrenSize == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArrA0l = c7234mD.A00.A0l();
                UUID uuidA02 = AbstractC5462JH.A02(bArrA0l);
                if (uuidA02 == null) {
                    AbstractC45794g.A07(A0A(204, 22, 75), A0A(550, 42, 28));
                } else {
                    arrayList.add(new DrmInitData.SchemeData(uuidA02, A0A(897, 9, 66), bArrA0l));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new DrmInitData(arrayList);
    }

    private C5446J1 A07(SparseArray<C5446J1> sparseArray, int i) {
        if (sparseArray.size() == 1) {
            return sparseArray.valueAt(0);
        }
        return (C5446J1) AbstractC45353y.A01(sparseArray.get(i));
    }

    public static C5455JA A08(SparseArray<C5455JA> sparseArray) {
        C5455JA c5455ja = null;
        long j = Long.MAX_VALUE;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            C5455JA c5455jaValueAt = sparseArray.valueAt(i);
            if (c5455jaValueAt.A06 || c5455jaValueAt.A01 != c5455jaValueAt.A05.A01) {
                boolean z = c5455jaValueAt.A06;
                if (A0a[7].charAt(28) == 'N') {
                    throw new RuntimeException();
                }
                A0a[2] = "bWFL5LbHycaN2QeAwKakifUxbxentXmn";
                if (!z || c5455jaValueAt.A02 != c5455jaValueAt.A09.A01) {
                    long nextSampleOffset = c5455jaValueAt.A05();
                    if (nextSampleOffset < j) {
                        c5455ja = c5455jaValueAt;
                        j = nextSampleOffset;
                    }
                }
            }
        }
        return c5455ja;
    }

    private void A0B() {
        this.A02 = 0;
        this.A00 = 0;
    }

    private void A0C() {
        int nextExtraTrackId = 100;
        this.A0J = new InterfaceC5361Hd[2];
        int i = 0;
        if (this.A0S != null) {
            int emsgTrackOutputCount = 0 + 1;
            this.A0J[0] = this.A0S;
            i = emsgTrackOutputCount;
        }
        int nextExtraTrackId2 = this.A0K;
        if ((nextExtraTrackId2 & 4) != 0) {
            int emsgTrackOutputCount2 = i + 1;
            this.A0J[i] = this.A0E.AKS(100, 5);
            i = emsgTrackOutputCount2;
            nextExtraTrackId = 100 + 1;
        }
        this.A0J = (InterfaceC5361Hd[]) AbstractC46115C.A1I(this.A0J, i);
        for (InterfaceC5361Hd interfaceC5361Hd : this.A0J) {
            interfaceC5361Hd.A6e(A0c);
        }
        int nextExtraTrackId3 = this.A0X.size();
        this.A0I = new InterfaceC5361Hd[nextExtraTrackId3];
        int i2 = 0;
        while (i2 < nextExtraTrackId) {
            int i3 = nextExtraTrackId + 1;
            InterfaceC5361Hd interfaceC5361HdAKS = this.A0E.AKS(nextExtraTrackId, 3);
            interfaceC5361HdAKS.A6e(this.A0X.get(i2));
            this.A0I[i2] = interfaceC5361HdAKS;
            i2++;
            nextExtraTrackId = i3;
        }
    }

    private void A0E(long j) {
        while (!this.A0W.isEmpty()) {
            C5454J9 c5454j9RemoveFirst = this.A0W.removeFirst();
            this.A03 -= c5454j9RemoveFirst.A00;
            if (A0a[7].charAt(28) == 'N') {
                throw new RuntimeException();
            }
            String[] strArr = A0a;
            strArr[4] = "VR2FeNKrGWLUx6XQMfWHox9ZNtks2zuu";
            strArr[6] = "s2y9CEVkGFcMGmJDsuNOnRFQ2pMNKAx2";
            long jA05 = c5454j9RemoveFirst.A01;
            if (c5454j9RemoveFirst.A02) {
                jA05 += j;
            }
            if (this.A0R != null) {
                jA05 = this.A0R.A05(jA05);
            }
            for (InterfaceC5361Hd interfaceC5361Hd : this.A0J) {
                interfaceC5361Hd.AIu(jA05, 1, c5454j9RemoveFirst.A00, this.A03, null);
            }
        }
    }

    private void A0F(long j) throws C44963K {
        while (!this.A0V.isEmpty() && this.A0V.peek().A00 == j) {
            A0N(this.A0V.pop());
        }
        A0B();
    }

    public static void A0G(C45944v c45944v, int i, C5471JQ c5471jq) throws C44963K {
        c45944v.A0f(i + 8);
        int fullAtom = c45944v.A0C();
        int flags = AbstractC5439Iu.A00(fullAtom);
        int fullAtom2 = flags & 1;
        if (fullAtom2 == 0) {
            int fullAtom3 = flags & 2;
            boolean z = fullAtom3 != 0;
            int sampleCount = c45944v.A0L();
            if (sampleCount == 0) {
                boolean[] zArr = c5471jq.A0F;
                int fullAtom4 = c5471jq.A00;
                Arrays.fill(zArr, 0, fullAtom4, false);
                return;
            }
            int fullAtom5 = c5471jq.A00;
            if (sampleCount == fullAtom5) {
                Arrays.fill(c5471jq.A0F, 0, sampleCount, z);
                int fullAtom6 = c45944v.A07();
                c5471jq.A02(fullAtom6);
                c5471jq.A04(c45944v);
                return;
            }
            StringBuilder sbAppend = new StringBuilder().append(A0A(532, 18, 95)).append(sampleCount).append(A0A(0, 40, 98));
            int fullAtom7 = c5471jq.A00;
            throw C44963K.A01(sbAppend.append(fullAtom7).toString(), null);
        }
        throw C44963K.A00(A0A(FacebookRequestErrorClassification.ESC_APP_NOT_INSTALLED, 56, 30));
    }

    public static void A0I(C45944v c45944v, C5471JQ c5471jq) throws C44963K {
        c45944v.A0f(8);
        int flags = c45944v.A0C();
        int fullAtom = AbstractC5439Iu.A00(flags) & 1;
        if (fullAtom == 1) {
            c45944v.A0g(8);
        }
        int iA0L = c45944v.A0L();
        if (iA0L == 1) {
            int entryCount = AbstractC5439Iu.A01(flags);
            c5471jq.A03 += entryCount == 0 ? c45944v.A0Q() : c45944v.A0R();
            return;
        }
        throw C44963K.A01(A0A(727, 29, 60) + iA0L, null);
    }

    public static void A0J(C45944v c45944v, C5471JQ c5471jq) throws C44963K {
        A0G(c45944v, 0, c5471jq);
    }

    public static void A0K(C45944v c45944v, C5471JQ c5471jq, byte[] bArr) throws C44963K {
        c45944v.A0f(8);
        c45944v.A0k(bArr, 0, 16);
        if (!Arrays.equals(bArr, A0d)) {
            return;
        }
        A0G(c45944v, 16, c5471jq);
    }

    @MetaExoPlayerCustomization("New parameter for getUri()")
    private void A0L(InterfaceC7263ms interfaceC7263ms) throws IOException {
        int i = ((int) this.A07) - this.A00;
        C45944v c45944v = this.A0D;
        if (c45944v != null) {
            interfaceC7263ms.readFully(c45944v.A0l(), 8, i);
            A0U(new C7234mD(this.A01, c45944v), interfaceC7263ms.A8n(), interfaceC7263ms.A9P());
        } else {
            interfaceC7263ms.AK3(i);
        }
        A0F(interfaceC7263ms.A8n());
    }

    private void A0M(InterfaceC7263ms interfaceC7263ms) throws IOException {
        C5455JA c5455jaValueAt = null;
        long j = Long.MAX_VALUE;
        int size = this.A0L.size();
        for (int i = 0; i < size; i++) {
            C5455JA nextTrackBundle = this.A0L.valueAt(i);
            C5471JQ c5471jq = nextTrackBundle.A09;
            if (c5471jq.A0A && c5471jq.A03 < j) {
                j = c5471jq.A03;
                c5455jaValueAt = this.A0L.valueAt(i);
            }
        }
        if (c5455jaValueAt == null) {
            this.A02 = 3;
            return;
        }
        int iA8n = (int) (j - interfaceC7263ms.A8n());
        if (iA8n >= 0) {
            interfaceC7263ms.AK3(iA8n);
            c5455jaValueAt.A09.A05(interfaceC7263ms);
            return;
        }
        throw C44963K.A01(A0A(384, 39, 59), null);
    }

    private void A0N(C7235mE c7235mE) throws C44963K {
        if (((AbstractC5439Iu) c7235mE).A00 == 1836019574) {
            A0P(c7235mE);
            return;
        }
        if (((AbstractC5439Iu) c7235mE).A00 == 1836019558) {
            A0O(c7235mE);
            return;
        }
        if (this.A0V.isEmpty()) {
            return;
        }
        C7235mE c7235mEPeek = this.A0V.peek();
        if (A0a[1].length() == 3) {
            throw new RuntimeException();
        }
        A0a[5] = "pjYwVuiFyV8fJrHeJXv5AlOqs";
        c7235mEPeek.A08(c7235mE);
    }

    private void A0O(C7235mE c7235mE) throws C44963K {
        A0Q(c7235mE, this.A0L, this.A0U != null, this.A0K, this.A0Y);
        DrmInitData drmInitDataA06 = A06(c7235mE.A02);
        if (drmInitDataA06 != null) {
            int i = this.A0L.size();
            for (int trackCount = 0; trackCount < i; trackCount++) {
                this.A0L.valueAt(trackCount).A0B(drmInitDataA06);
            }
        }
        long j = this.A0B;
        if (A0a[5].length() != 30) {
            String[] strArr = A0a;
            strArr[4] = "qdUBZHhFhQeTbxiPtlDH0srS7WoJbCtx";
            strArr[6] = "eg1L367OGrFS41anHFQFHM93YBMqVnGW";
            if (j != -9223372036854775807L) {
                int size = this.A0L.size();
                for (int i2 = 0; i2 < size; i2++) {
                    C5455JA c5455jaValueAt = this.A0L.valueAt(i2);
                    long j2 = this.A0B;
                    int trackCount2 = A0a[5].length();
                    if (trackCount2 != 30) {
                        A0a[3] = "ExaTttTG7QLu5ZnLvMbeVx0ab4jt6cU8";
                        c5455jaValueAt.A0A(j2);
                    }
                }
                this.A0B = -9223372036854775807L;
                return;
            }
            return;
        }
        throw new RuntimeException();
    }

    private void A0P(C7235mE c7235mE) throws C44963K {
        AbstractC45353y.A0A(this.A0U == null, A0A(680, 20, 8));
        DrmInitData drmInitDataA06 = A06(c7235mE.A02);
        C7235mE c7235mE2 = (C7235mE) AbstractC45353y.A01(c7235mE.A06(1836475768));
        SparseArray<C5446J1> sparseArray = new SparseArray<>();
        long jA02 = -9223372036854775807L;
        int size = c7235mE2.A02.size();
        for (int i = 0; i < size; i++) {
            C7234mD c7234mD = c7235mE2.A02.get(i);
            if (((AbstractC5439Iu) c7234mD).A00 == 1953654136) {
                Pair<Integer, C5446J1> pairA04 = A04(c7234mD.A00);
                Object obj = pairA04.first;
                if (A0a[7].charAt(28) == 'N') {
                    throw new RuntimeException();
                }
                A0a[2] = "1hJqa9Igz9YM2Xn7uSuVVZMPlDpSi7YR";
                sparseArray.put(((Integer) obj).intValue(), (C5446J1) pairA04.second);
            } else if (((AbstractC5439Iu) c7234mD).A00 == 1835362404) {
                jA02 = A02(c7234mD.A00);
            }
        }
        List<C5472JR> listA0O = AbstractC5445J0.A0O(c7235mE, new C5342HK(), jA02, drmInitDataA06, (this.A0K & 16) != 0, false, new InterfaceC7123kO() { // from class: com.facebook.ads.redexgen.X.m9
            @Override // com.facebook.ads.redexgen.core.InterfaceC7123kO
            public final Object A4B(Object obj2) {
                return this.A00.A0c((C5469JO) obj2);
            }
        });
        int size2 = listA0O.size();
        if (this.A0L.size() == 0) {
            for (int i2 = 0; i2 < size2; i2++) {
                C5472JR c5472jr = listA0O.get(i2);
                C5469JO c5469jo = c5472jr.A03;
                this.A0L.put(c5469jo.A00, new C5455JA(this.A0E.AKS(i2, c5469jo.A03), c5472jr, A07(sparseArray, c5469jo.A00)));
                this.A08 = Math.max(this.A08, c5469jo.A04);
            }
            this.A0E.A6O();
            return;
        }
        AbstractC45353y.A08(this.A0L.size() == size2);
        for (int i3 = 0; i3 < size2; i3++) {
            C5472JR c5472jr2 = listA0O.get(i3);
            C5469JO c5469jo2 = c5472jr2.A03;
            this.A0L.get(c5469jo2.A00).A0C(c5472jr2, A07(sparseArray, c5469jo2.A00));
        }
    }

    public static void A0Q(C7235mE c7235mE, SparseArray<C5455JA> sparseArray, boolean z, int i, byte[] bArr) throws C44963K {
        int size = c7235mE.A01.size();
        for (int i2 = 0; i2 < size; i2++) {
            C7235mE child = c7235mE.A01.get(i2);
            int i3 = ((AbstractC5439Iu) child).A00;
            if (i3 == 1953653094) {
                A0R(child, sparseArray, z, i, bArr);
            }
        }
    }

    public static void A0S(C7235mE c7235mE, C5455JA c5455ja, int i) throws C44963K {
        int i2 = 0;
        int leafChildrenSize = 0;
        List<C7234mD> list = c7235mE.A02;
        int i3 = list.size();
        int i4 = 0;
        while (totalSampleCount != 30) {
            A0a[1] = "g5KWW";
            if (i4 < i3) {
                C7234mD c7234mD = list.get(i4);
                int trunCount = ((AbstractC5439Iu) c7234mD).A00;
                if (trunCount == 1953658222) {
                    C45944v c45944v = c7234mD.A00;
                    c45944v.A0f(12);
                    int trunCount2 = c45944v.A0L();
                    if (trunCount2 > 0) {
                        leafChildrenSize += trunCount2;
                        i2++;
                    }
                }
                i4++;
            } else {
                c5455ja.A02 = 0;
                c5455ja.A00 = 0;
                c5455ja.A01 = 0;
                c5455ja.A09.A03(i2, leafChildrenSize);
                int i5 = 0;
                int trunCount3 = 0;
                for (int trunIndex = 0; trunIndex < i3; trunIndex++) {
                    C7234mD c7234mD2 = list.get(trunIndex);
                    int totalSampleCount = ((AbstractC5439Iu) c7234mD2).A00;
                    if (totalSampleCount == 1953658222) {
                        trunCount3 = A01(c5455ja, i5, i, c7234mD2.A00, trunCount3);
                        i5++;
                    }
                }
                return;
            }
        }
        throw new RuntimeException();
    }

    @MetaExoPlayerCustomization("Adding Uri for eMsg")
    private void A0U(C7234mD c7234mD, long j, Uri uri) throws C44963K {
        if (!this.A0V.isEmpty()) {
            this.A0V.peek().A09(c7234mD);
            return;
        }
        if (((AbstractC5439Iu) c7234mD).A00 == 1936286840) {
            Pair<Long, C7268my> pairA05 = A05(c7234mD.A00, j);
            Long l = (Long) pairA05.first;
            if (A0a[2].charAt(14) == 'D') {
                throw new RuntimeException();
            }
            A0a[2] = "KqHjYmkkmLRftUSzBx7x8q1P7pbSwwaZ";
            this.A0C = l.longValue();
            this.A0E.AJ7((InterfaceC5356HY) pairA05.second);
            this.A0G = true;
            return;
        }
        if (((AbstractC5439Iu) c7234mD).A00 != 1701671783 || uri == null) {
            return;
        }
        A0H(c7234mD.A00, uri);
    }

    public static boolean A0W(int i) {
        return i == 1836019574 || i == 1953653099 || i == 1835297121 || i == 1835626086 || i == 1937007212 || i == 1836019558 || i == 1953653094 || i == 1836475768 || i == 1701082227;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0060  */
    public static boolean A0X(int i) {
        if (i != 1751411826 && i != 1835296868 && i != 1836476516 && i != 1936286840 && i != 1937011556 && i != 1937011827 && i != 1668576371 && i != 1937011555) {
            if (A0a[1].length() == 3) {
                throw new RuntimeException();
            }
            String[] strArr = A0a;
            strArr[4] = "BwdOpTtZC6qkHbBW6vzemIV3sewTUKel";
            strArr[6] = "oE5SsWuxWmjvJDoIWd7OBauEjDNEKBY0";
            if (i != 1937011578) {
                if (A0a[3].charAt(19) != 'e') {
                    A0a[7] = "alBOnYvVhDOHTU7zpsfhYzjhJlh1j5qj";
                    if (i != 1937013298) {
                        if (i == 1937007471 && i != 1668232756 && i != 1937011571 && i != 1952867444 && i != 1952868452 && i != 1953196132 && i != 1953654136 && i != 1953658222 && i != 1886614376 && i != 1935763834 && i != 1935763823 && i != 1936027235 && i != 1970628964 && i != 1935828848 && i != 1936158820 && i != 1701606260 && i != 1835362404 && i != 1701671783) {
                            return false;
                        }
                    }
                } else {
                    A0a[0] = "AuC";
                    if (i != 1937013298) {
                        if (i == 1937007471) {
                        }
                    }
                }
            }
        }
        return true;
    }

    private boolean A0Y(InterfaceC7263ms interfaceC7263ms) throws IOException {
        int trackCount;
        int i;
        if (this.A00 == 0) {
            C45944v c45944v = this.A0M;
            if (A0a[2].charAt(14) != 'D') {
                A0a[5] = "Du9yMjOrUhZNFJE5GgCY";
                if (!interfaceC7263ms.AHR(c45944v.A0l(), 0, 8, true)) {
                    return false;
                }
                this.A00 = 8;
                this.A0M.A0f(0);
                this.A07 = this.A0M.A0Q();
                int iA0C = this.A0M.A0C();
                if (A0a[5].length() != 30) {
                    A0a[0] = "Nk2";
                    this.A01 = iA0C;
                }
            }
            throw new RuntimeException();
        }
        if (this.A07 == 1) {
            interfaceC7263ms.readFully(this.A0M.A0l(), 8, 8);
            int headerBytesRemaining = this.A00;
            this.A00 = headerBytesRemaining + 8;
            this.A07 = this.A0M.A0R();
        } else if (this.A07 == 0) {
            long jA8O = interfaceC7263ms.A8O();
            if (jA8O == -1 && !this.A0V.isEmpty()) {
                jA8O = this.A0V.peek().A00;
            }
            if (jA8O != -1) {
                long jA8n = jA8O - interfaceC7263ms.A8n();
                int trackCount2 = this.A00;
                this.A07 = jA8n + ((long) trackCount2);
            }
        }
        if (this.A07 >= this.A00) {
            long jA8n2 = interfaceC7263ms.A8n() - ((long) this.A00);
            if ((this.A01 == 1836019558 || this.A01 == 1835295092) && !this.A0G) {
                this.A0E.AJ7(new C7258mn(this.A08, jA8n2));
                this.A0G = true;
            }
            if (this.A01 == 1836019558) {
                SparseArray<C5455JA> sparseArray = this.A0L;
                if (A0a[0].length() != 3) {
                    A0a[7] = "3NdiubR5fLBwA18U1YAUjfhOdAcmjZCx";
                    trackCount = sparseArray.size();
                    i = 0;
                } else {
                    A0a[0] = "3Yh";
                    trackCount = sparseArray.size();
                    i = 0;
                }
                while (i < trackCount) {
                    C5471JQ c5471jq = this.A0L.valueAt(i).A09;
                    c5471jq.A02 = jA8n2;
                    c5471jq.A03 = jA8n2;
                    c5471jq.A04 = jA8n2;
                    i++;
                }
            }
            int trackCount3 = this.A01;
            if (trackCount3 == 1835295092) {
                this.A0F = null;
                this.A09 = this.A07 + jA8n2;
                this.A02 = 2;
                return true;
            }
            if (A0W(this.A01)) {
                long jA8n3 = (interfaceC7263ms.A8n() + this.A07) - 8;
                this.A0V.push(new C7235mE(this.A01, jA8n3));
                if (this.A07 == this.A00) {
                    A0F(jA8n3);
                } else {
                    A0B();
                }
            } else if (A0X(this.A01)) {
                if (this.A00 != 8) {
                    throw C44963K.A00(A0A(284, 51, 6));
                }
                if (this.A07 <= 2147483647L) {
                    C45944v c45944v2 = new C45944v((int) this.A07);
                    C45944v atomData = this.A0M;
                    System.arraycopy(atomData.A0l(), 0, c45944v2.A0l(), 0, 8);
                    this.A0D = c45944v2;
                    this.A02 = 1;
                } else {
                    throw C44963K.A00(A0A(335, 49, 77));
                }
            } else if (this.A07 <= 2147483647L) {
                this.A0D = null;
                this.A02 = 1;
            } else {
                throw C44963K.A00(A0A(592, 53, 87));
            }
            return true;
        }
        throw C44963K.A00(A0A(78, 48, 36));
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:104:0x01ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:105:0x024d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:106:0x0247 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:107:0x0160 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x0091  */
    /* JADX WARN: Code duplicated, block: B:27:0x009d  */
    /* JADX WARN: Code duplicated, block: B:29:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:37:0x00da  */
    /* JADX WARN: Code duplicated, block: B:41:0x0111  */
    /* JADX WARN: Code duplicated, block: B:43:0x0122  */
    /* JADX WARN: Code duplicated, block: B:45:0x0133  */
    /* JADX WARN: Code duplicated, block: B:48:0x0142  */
    /* JADX WARN: Code duplicated, block: B:51:0x015c  */
    /* JADX WARN: Code duplicated, block: B:55:0x0170  */
    /* JADX WARN: Code duplicated, block: B:57:0x0190  */
    /* JADX WARN: Code duplicated, block: B:63:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:66:0x01be  */
    /* JADX WARN: Code duplicated, block: B:68:0x0221  */
    /* JADX WARN: Code duplicated, block: B:69:0x0228  */
    /* JADX WARN: Code duplicated, block: B:70:0x022e  */
    /* JADX WARN: Code duplicated, block: B:77:0x025c A[LOOP:1: B:77:0x025c->B:79:0x0262, LOOP_START] */
    /* JADX WARN: Code duplicated, block: B:79:0x0262 A[LOOP:1: B:77:0x025c->B:79:0x0262, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:82:0x027c  */
    /* JADX WARN: Code duplicated, block: B:89:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:91:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:94:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:96:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:99:0x02f0  */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0049, code lost:
    
        if (r3 >= 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
    
        r19.AK3(r3);
        A0B();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0051, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005e, code lost:
    
        if (r3 >= 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0246, code lost:
    
        throw com.facebook.ads.redexgen.core.C44963K.A01(A0A(androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_WAVE_PERIOD, 35, com.vungle.ads.internal.protos.Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE), null);
     */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization("Mark text samples as sync frames")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean A0Z(com.facebook.ads.redexgen.core.InterfaceC7263ms r19) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 774
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C7228m7.A0Z(com.facebook.ads.redexgen.X.ms):boolean");
    }

    public static boolean A0a(C5469JO c5469jo) {
        if (c5469jo.A08 == null || c5469jo.A08.length != 1 || c5469jo.A09 == null) {
            return false;
        }
        if (c5469jo.A08[0] == 0) {
            return true;
        }
        long editListEndMediaTimeUs = AbstractC46115C.A0U(c5469jo.A08[0] + c5469jo.A09[0], 1000000L, c5469jo.A05);
        if (A0a[2].charAt(14) == 'D') {
            throw new RuntimeException();
        }
        A0a[1] = "wHdUW";
        return editListEndMediaTimeUs >= c5469jo.A04;
    }

    public static /* synthetic */ InterfaceC5331H9[] A0b() {
        return new InterfaceC5331H9[]{new C7227m6()};
    }

    public final C5469JO A0c(C5469JO c5469jo) {
        return c5469jo;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5331H9
    public final void AAC(InterfaceC5332HA interfaceC5332HA) {
        this.A0E = interfaceC5332HA;
        A0B();
        A0C();
        if (this.A0U != null) {
            this.A0L.put(0, new C5455JA(interfaceC5332HA.AKS(0, this.A0U.A03), new C5472JR(this.A0U, new long[0], new int[0], 0, new long[0], new int[0], 0L), new C5446J1(0, 0, 0, 0)));
            this.A0E.A6O();
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5331H9
    public final int AHL(InterfaceC7263ms interfaceC7263ms, C5353HV c5353hv) throws IOException {
        while (true) {
            switch (this.A02) {
                case 0:
                    if (!A0Y(interfaceC7263ms)) {
                        return -1;
                    }
                    break;
                    break;
                case 1:
                    A0L(interfaceC7263ms);
                    break;
                case 2:
                    A0M(interfaceC7263ms);
                    break;
                default:
                    if (A0Z(interfaceC7263ms)) {
                        return 0;
                    }
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5331H9
    public final void AHb() {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5331H9
    public final void AJ6(long j, long j2) {
        int size = this.A0L.size();
        for (int i = 0; i < size; i++) {
            this.A0L.valueAt(i).A08();
        }
        this.A0W.clear();
        this.A03 = 0;
        this.A0B = j2;
        this.A0V.clear();
        A0B();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5331H9
    public final boolean AK5(InterfaceC7263ms interfaceC7263ms) throws IOException {
        return AbstractC5467JM.A01(interfaceC7263ms);
    }
}
