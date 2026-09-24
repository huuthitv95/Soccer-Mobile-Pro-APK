package com.facebook.ads.redexgen.core;

import android.net.Uri;
import android.util.Pair;
import android.util.SparseArray;
import com.facebook.ads.androidx.media3.common.DrmInitData;
import com.facebook.ads.androidx.media3.extractor.metadata.emsg.EventMessage;
import com.facebook.internal.FacebookRequestErrorClassification;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.vungle.ads.internal.protos.Sdk;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.p300io.encoding.Base64;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.m6 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C7227m6 implements InterfaceC5331H9 {
    public static byte[] A0e;
    public static String[] A0f = {"ywSCwlzG1SMdvvW", "WbYO2rYjmhbf4R3oYDPvQZ3H98amgjSr", "Za", "aa8pMmtLKrvpWkukTfymetmlHniL9M", "752FE5aLUbaesINptKDix8v", "1m6bsNbzXuacY99BBbBsLUDHw0asFdhp", "tFAwrqTGVJ2tUOf2i", "X0elgRXJnrwhMbXNAucG6j3nQ1B9k96A"};
    public static final InterfaceC5335HD A0g;
    public static final C7472qI A0h;
    public static final byte[] A0i;
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
    public long A0A;
    public long A0B;
    public long A0C;
    public SparseArray<C5452J7> A0D;
    public C45944v A0E;
    public InterfaceC5332HA A0F;
    public C5452J7 A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public InterfaceC5361Hd[] A0K;
    public InterfaceC5361Hd[] A0L;
    public final int A0M;
    public final DrmInitData A0N;
    public final C45944v A0O;
    public final C45944v A0P;
    public final C45944v A0Q;
    public final C45944v A0R;
    public final C45944v A0S;
    public final C460253 A0T;
    public final InterfaceC5361Hd A0U;
    public final C5384I0 A0V;
    public final C5469JO A0W;
    public final ArrayDeque<C7235mE> A0X;
    public final ArrayDeque<C5451J6> A0Y;
    public final List<C7472qI> A0Z;
    public final boolean A0a;
    public final boolean A0b;
    public final boolean A0c;
    public final byte[] A0d;

    /* JADX WARN: Code duplicated, block: B:11:0x0061  */
    /* JADX WARN: Code duplicated, block: B:14:0x0067  */
    /* JADX WARN: Code duplicated, block: B:17:0x006f  */
    /* JADX WARN: Code duplicated, block: B:20:0x0075  */
    /* JADX WARN: Code duplicated, block: B:23:0x007b  */
    /* JADX WARN: Code duplicated, block: B:26:0x0081  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:43:0x00bc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x00be  */
    /* JADX WARN: Code duplicated, block: B:46:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:48:0x00da  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:61:0x0117  */
    /* JADX WARN: Code duplicated, block: B:62:0x0119 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x011b  */
    /* JADX WARN: Code duplicated, block: B:64:0x0120  */
    /* JADX WARN: Code duplicated, block: B:67:0x012f  */
    /* JADX WARN: Code duplicated, block: B:68:0x0139  */
    /* JADX WARN: Code duplicated, block: B:69:0x013c  */
    /* JADX WARN: Code duplicated, block: B:70:0x013f  */
    /* JADX WARN: Code duplicated, block: B:71:0x0143  */
    /* JADX WARN: Code duplicated, block: B:72:0x0147  */
    /* JADX WARN: Code duplicated, block: B:73:0x014b  */
    /* JADX WARN: Code duplicated, block: B:74:0x014f  */
    /* JADX WARN: Code duplicated, block: B:75:0x0153  */
    /* JADX WARN: Code duplicated, block: B:78:0x0045 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x0045 A[SYNTHETIC] */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static int A00(C5452J7 c5452j7, int i, long j, int i2, C45944v c45944v, int i3) {
        boolean z;
        int iA0L;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        long j2;
        int[] iArr;
        long[] jArr;
        boolean[] zArr;
        boolean z6;
        int i4;
        long j3;
        int iA0L2;
        int iA0L3;
        int iA0C;
        boolean z7;
        String[] strArr;
        int i5 = i3;
        long j4 = j;
        c45944v.A0f(8);
        int iA00 = AbstractC5439Iu.A00(c45944v.A0C());
        C5469JO c5469jo = c5452j7.A05;
        C5471JQ c5471jq = c5452j7.A07;
        C5446J1 c5446j1 = c5471jq.A06;
        c5471jq.A0C[i] = c45944v.A0L();
        c5471jq.A0E[i] = c5471jq.A04;
        if ((iA00 & 1) == 0) {
            if ((iA00 & 4) != 0) {
                z = true;
            } else {
                z = false;
            }
            iA0L = c5446j1.A01;
            if (z) {
                iA0L = c45944v.A0L();
            }
            if ((iA00 & 256) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if ((iA00 & 512) != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if ((iA00 & 1024) != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if ((iA00 & 2048) != 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            j2 = 0;
            if (c5469jo.A08 != null) {
                j2 = c5469jo.A09[0];
            }
            iArr = c5471jq.A0B;
            jArr = c5471jq.A0D;
            zArr = c5471jq.A0G;
            if (c5469jo.A03 == 2) {
                z6 = false;
            } else {
                z6 = false;
            }
            i4 = i5 + c5471jq.A0C[i];
            j3 = c5469jo.A06;
            if (i > 0) {
                j4 = c5471jq.A05;
            }
            while (i5 < i4) {
                if (z2) {
                    iA0L2 = c45944v.A0L();
                } else {
                    iA0L2 = c5446j1.A00;
                }
                if (z3) {
                    iA0L3 = c45944v.A0L();
                    strArr = A0f;
                    if (strArr[3].length() != strArr[6].length()) {
                        String[] strArr2 = A0f;
                        strArr2[1] = "prYCRILb9XoLiqEuzjLvSymHGedE7tyJ";
                        strArr2[5] = "tQPxWhVMkiMqfE1WSn5JfVNHf8FlQpL7";
                    }
                } else {
                    iA0L3 = c5446j1.A03;
                }
                if (i5 != 0) {
                    if (z4) {
                        iA0C = c45944v.A0C();
                    } else if (A0f[4].length() == 23) {
                        A0f[4] = "VUSN2W3IkwtruuiuKY2zNmE";
                        iA0C = c5446j1.A01;
                    }
                } else if (z4) {
                    iA0C = c45944v.A0C();
                } else if (A0f[4].length() == 23) {
                    A0f[4] = "VUSN2W3IkwtruuiuKY2zNmE";
                    iA0C = c5446j1.A01;
                }
                jArr[i5] = AbstractC46115C.A0U((((long) (z5 ? c45944v.A0C() : 0)) + j4) - j2, 1000000L, j3);
                if (((iA0C >> 16) & 1) == 0) {
                    z7 = false;
                } else {
                    z7 = false;
                }
                zArr[i5] = z7;
                iArr[i5] = iA0L3;
                j4 += (long) iA0L2;
                i5++;
            }
            c5471jq.A05 = j4;
            return i4;
        }
        long[] jArr2 = c5471jq.A0E;
        String[] strArr3 = A0f;
        if (strArr3[1].charAt(23) == strArr3[5].charAt(23)) {
            A0f[2] = "02";
            jArr2[i] = jArr2[i] + ((long) c45944v.A0C());
            if ((iA00 & 4) != 0) {
                z = true;
            } else {
                z = false;
            }
            iA0L = c5446j1.A01;
            if (z) {
                iA0L = c45944v.A0L();
            }
            if ((iA00 & 256) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if ((iA00 & 512) != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if ((iA00 & 1024) != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if ((iA00 & 2048) != 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            j2 = 0;
            if (c5469jo.A08 != null && c5469jo.A08.length == 1 && c5469jo.A08[0] == 0) {
                j2 = c5469jo.A09[0];
            }
            iArr = c5471jq.A0B;
            jArr = c5471jq.A0D;
            zArr = c5471jq.A0G;
            if (c5469jo.A03 == 2 || (i2 & 1) == 0) {
                z6 = false;
            } else {
                z6 = true;
            }
            i4 = i5 + c5471jq.A0C[i];
            j3 = c5469jo.A06;
            if (i > 0) {
                j4 = c5471jq.A05;
            }
            while (i5 < i4) {
                if (z2) {
                    iA0L2 = c45944v.A0L();
                } else {
                    iA0L2 = c5446j1.A00;
                }
                if (z3) {
                    iA0L3 = c45944v.A0L();
                    strArr = A0f;
                    if (strArr[3].length() != strArr[6].length()) {
                        String[] strArr4 = A0f;
                        strArr4[1] = "prYCRILb9XoLiqEuzjLvSymHGedE7tyJ";
                        strArr4[5] = "tQPxWhVMkiMqfE1WSn5JfVNHf8FlQpL7";
                    }
                } else {
                    iA0L3 = c5446j1.A03;
                }
                if (i5 != 0 && z) {
                    iA0C = iA0L;
                } else if (z4) {
                    iA0C = c45944v.A0C();
                } else if (A0f[4].length() == 23) {
                    A0f[4] = "VUSN2W3IkwtruuiuKY2zNmE";
                    iA0C = c5446j1.A01;
                }
                jArr[i5] = AbstractC46115C.A0U((((long) (z5 ? c45944v.A0C() : 0)) + j4) - j2, 1000000L, j3);
                if (((iA0C >> 16) & 1) == 0 || (z6 && i5 != 0)) {
                    z7 = false;
                } else {
                    z7 = true;
                }
                zArr[i5] = z7;
                iArr[i5] = iA0L3;
                j4 += (long) iA0L2;
                i5++;
            }
            c5471jq.A05 = j4;
            return i4;
        }
        throw new RuntimeException();
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static Pair<Long, C7268my> A04(C45944v c45944v, long j) throws C44963K {
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
                throw new C44963K(A0B(634, 28, 93));
            }
            long jA0Q2 = c45944v.A0Q();
            iArr[i] = Integer.MAX_VALUE & iA0C;
            jArr[i] = jA0R2;
            jArr3[i] = jA0U2;
            jA0R += jA0Q2;
            jA0U2 = AbstractC46115C.A0U(jA0R, 1000000L, jA0Q);
            String[] strArr = A0f;
            if (strArr[3].length() == strArr[6].length()) {
                throw new RuntimeException();
            }
            A0f[7] = "mBjUzKzbBV9DJWZlH52EoviqXd7Fx3w7";
            jArr2[i] = jA0U2 - jArr3[i];
            c45944v.A0g(4);
            jA0R2 += (long) iArr[i];
        }
        return Pair.create(Long.valueOf(jA0U), new C7268my(iArr, jArr, jArr2, jArr3));
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C5452J7 A09(C45944v c45944v, SparseArray<C5452J7> sparseArray, boolean z) {
        c45944v.A0f(8);
        int iA00 = AbstractC5439Iu.A00(c45944v.A0C());
        C5452J7 c5452j7A08 = A08(sparseArray, c45944v.A0C(), z);
        if (c5452j7A08 == null) {
            return null;
        }
        if ((iA00 & 1) != 0) {
            long jA0R = c45944v.A0R();
            c5452j7A08.A07.A04 = jA0R;
            c5452j7A08.A07.A03 = jA0R;
        }
        C5446J1 c5446j1 = c5452j7A08.A04;
        c5452j7A08.A07.A06 = new C5446J1((iA00 & 2) != 0 ? c45944v.A0L() - 1 : c5446j1.A02, (iA00 & 8) != 0 ? c45944v.A0L() : c5446j1.A00, (iA00 & 16) != 0 ? c45944v.A0L() : c5446j1.A03, (iA00 & 32) != 0 ? c45944v.A0L() : c5446j1.A01);
        return c5452j7A08;
    }

    public static String A0B(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0e, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 99);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0E() {
        String[] strArr = A0f;
        if (strArr[1].charAt(23) != strArr[5].charAt(23)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0f;
        strArr2[1] = "BGZmKOZPo9hBykc2GdFNUQpHC0I3sPv1";
        strArr2[5] = "CvUkm70dQ0grN9w1V6xWMg6HVylPciNL";
        A0e = new byte[]{84, 88, 95, 106, 113, 115, 62, 109, 119, 100, 123, 62, 114, 123, 109, 109, 62, 106, 118, 127, 112, 62, 118, 123, 127, 122, 123, 108, 62, 114, 123, 112, 121, 106, 118, 62, 54, 107, 112, 109, 107, 110, 110, 113, 108, 106, 123, 122, 55, 48, 99, 72, 82, 84, 95, 6, 69, 73, 83, 72, 82, 6, 79, 72, 6, 85, 68, 65, 86, 6, 7, Ascii.ESC, 6, Ascii.ETB, 6, Ascii.f22500SO, 83, 72, 85, 83, 86, 86, 73, 84, 82, 67, 66, Ascii.f22499SI, 8, 73, 98, 120, 126, 117, 44, 111, 99, 121, 98, 120, 44, 101, 98, 44, 127, 107, 124, 104, 44, 45, 49, 44, Base64.padSymbol, 44, 36, 121, 98, 127, 121, 124, 124, 99, 126, 120, 105, 104, 37, 34, 104, 92, 79, 73, 67, 75, SignedBytes.MAX_POWER_OF_TWO, 90, 75, 74, 99, 94, Ascii.SUB, 107, 86, 90, 92, 79, 77, 90, 65, 92, 57, Ascii.ETB, Ascii.f22498RS, Ascii.f22502US, 2, Ascii.f22491EM, Ascii.f22498RS, Ascii.ETB, 80, Ascii.f22498RS, Ascii.NAK, Ascii.ETB, 17, 4, Ascii.f22491EM, 6, Ascii.NAK, 80, Ascii.f22502US, Ascii.SYN, Ascii.SYN, 3, Ascii.NAK, 4, 80, 4, Ascii.f22502US, 80, 3, 17, Ascii.f22494GS, 0, Ascii.f22493FS, Ascii.NAK, 80, Ascii.DC4, 17, 4, 17, 94, 116, 83, 75, 92, 81, 84, 89, Ascii.f22494GS, 115, 124, 113, Ascii.f22494GS, 81, 88, 83, 90, 73, 85, 113, 88, 92, 91, Ascii.f22494GS, 92, 73, 82, 80, Ascii.f22494GS, 89, 88, 91, 84, 83, 88, 78, Ascii.f22494GS, 88, 69, 73, 88, 83, 89, 88, 89, Ascii.f22494GS, 92, 73, 82, 80, Ascii.f22494GS, 78, 84, 71, 88, Ascii.f22494GS, Ascii.NAK, 72, 83, 78, 72, 77, 77, 82, 79, 73, 88, 89, Ascii.DC4, 19, 62, Ascii.ETB, 19, Ascii.DC4, 82, 19, 6, Ascii.f22494GS, Ascii.f22502US, 82, 5, Ascii.ESC, 6, Ascii.SUB, 82, Ascii.f22498RS, Ascii.ETB, Ascii.f22493FS, Ascii.NAK, 6, Ascii.SUB, 82, 76, 82, SignedBytes.MAX_POWER_OF_TWO, 67, 70, 69, 70, 74, 65, 68, 70, 69, 82, 90, 7, Ascii.f22493FS, 1, 7, 2, 2, Ascii.f22494GS, 0, 6, Ascii.ETB, Ascii.SYN, 91, 92, 2, 43, 32, 41, 58, 38, 110, 35, 39, Base64.padSymbol, 35, 47, 58, 45, 38, 116, 110, 82, 123, 123, 110, 120, 105, Base64.padSymbol, 105, 114, Base64.padSymbol, 120, 115, 126, 111, 100, 109, 105, 116, 114, 115, Base64.padSymbol, 121, 124, 105, 124, Base64.padSymbol, 106, 124, 110, Base64.padSymbol, 115, 120, 122, 124, 105, 116, 107, 120, 51, 123, 82, 82, 71, 81, SignedBytes.MAX_POWER_OF_TWO, Ascii.DC4, SignedBytes.MAX_POWER_OF_TWO, 91, Ascii.DC4, 81, 90, 80, Ascii.DC4, 91, 82, Ascii.DC4, 89, 80, 85, SignedBytes.MAX_POWER_OF_TWO, Ascii.DC4, 67, 85, 71, Ascii.DC4, 90, 81, 83, 85, SignedBytes.MAX_POWER_OF_TWO, 93, 66, 81, Ascii.SUB, Base64.padSymbol, 4, Ascii.ETB, 0, 0, Ascii.ESC, Ascii.SYN, Ascii.ESC, Ascii.f22493FS, Ascii.NAK, 82, 38, 0, 19, 17, Ascii.f22491EM, 55, Ascii.f22493FS, 17, 0, Ascii.f22503VT, 2, 6, Ascii.ESC, Ascii.f22494GS, Ascii.f22493FS, 48, Ascii.f22494GS, 10, 82, 2, 19, 0, 19, Ascii.f22502US, Ascii.ETB, 6, Ascii.ETB, 0, 1, 82, Ascii.ESC, 1, 82, 7, Ascii.f22493FS, 1, 7, 2, 2, Ascii.f22494GS, 0, 6, Ascii.ETB, Ascii.SYN, 92, 84, 108, 110, 119, 119, 98, 99, 39, 119, 116, 116, 111, 39, 102, 115, 104, 106, 39, 47, 97, 102, 110, 107, 98, 99, 39, 115, 104, 39, 98, 127, 115, 117, 102, 100, 115, 39, 114, 114, 110, 99, 46, 60, 4, 6, Ascii.f22502US, Ascii.f22502US, 6, 1, 8, 79, Ascii.f22500SO, Ascii.ESC, 0, 2, 79, Ascii.CAN, 6, Ascii.ESC, 7, 79, 3, 10, 1, 8, Ascii.ESC, 7, 79, 81, 79, 93, 94, 91, 88, 91, 87, 92, 89, 91, 88, 79, 71, Ascii.SUB, 1, Ascii.f22493FS, Ascii.SUB, Ascii.f22502US, Ascii.f22502US, 0, Ascii.f22494GS, Ascii.ESC, 10, Ascii.f22503VT, 70, 65, 79, 119, 117, 108, 108, 117, 114, 123, 60, 105, 114, 111, 105, 108, 108, 115, 110, 104, 121, 120, 60, 121, 113, 111, 123, 60, 106, 121, 110, 111, 117, 115, 114, 38, 60, 57, 2, 9, Ascii.DC4, Ascii.f22493FS, 9, Ascii.f22499SI, Ascii.CAN, 9, 8, 76, 1, 3, 3, Ascii.SUB, 76, Ascii.f22500SO, 3, Ascii.DC4, 66, 71, 124, 119, 106, 98, 119, 113, 102, 119, 118, 50, 97, 115, 123, 125, 50, 119, 124, 102, 96, 107, 50, 113, 125, 103, 124, 102, 40, 50, 107, 80, 86, 95, 80, 90, 82, 91, 90, Ascii.f22498RS, 87, 80, 90, 87, 76, 91, 93, 74, Ascii.f22498RS, 76, 91, 88, 91, 76, 91, 80, 93, 91, 107, 92, 79, 84, 92, 95, 81, 88, Ascii.f22494GS, 81, 88, 83, 90, 73, 85, Ascii.f22494GS, 89, 88, 78, 94, 79, 84, 77, 73, 84, 82, 83, Ascii.f22494GS, 84, 83, Ascii.f22494GS, 78, 90, 77, 89, Ascii.f22494GS, 91, 82, 72, 83, 89, Ascii.f22494GS, Ascii.NAK, 72, 83, 78, 72, 77, 77, 82, 79, 73, 88, 89, Ascii.DC4, 83, 66, 66, 94, 91, 81, 83, 70, 91, 93, 92, Ascii.f22494GS, 74, Ascii.f22502US, 87, 95, 65, 85, 66, 83, 83, 79, 74, SignedBytes.MAX_POWER_OF_TWO, 66, 87, 74, 76, 77, Ascii.f22492FF, 91, Ascii.f22500SO, 78, 83, Ascii.ETB, Ascii.f22500SO, 85, 87, 87, 70, 89, 84, 85, 95, Ascii.f22502US, 88, 85, 70, 83, 40, 55, 58, 59, 49, 113, 51, 46, 106};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private void A0I(C45944v c45944v, Uri uri) {
        String str;
        String str2;
        long jA05;
        long jA0U;
        long jA0Q;
        if (this.A0L == null || this.A0L.length == 0) {
            return;
        }
        c45944v.A0f(8);
        int iA01 = AbstractC5439Iu.A01(c45944v.A0C());
        long jA0U2 = -9223372036854775807L;
        switch (iA01) {
            case 0:
                str = (String) AbstractC45353y.A01(c45944v.A0U());
                str2 = (String) AbstractC45353y.A01(c45944v.A0U());
                if (A0f[2].length() != 2) {
                    throw new RuntimeException();
                }
                A0f[0] = "4yWaL9iFGGaDiXT";
                long jA0Q2 = c45944v.A0Q();
                jA0U2 = AbstractC46115C.A0U(c45944v.A0Q(), 1000000L, jA0Q2);
                jA05 = this.A0C != -9223372036854775807L ? this.A0C + jA0U2 : -9223372036854775807L;
                jA0U = AbstractC46115C.A0U(c45944v.A0Q(), 1000L, jA0Q2);
                jA0Q = c45944v.A0Q();
                break;
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
                AbstractC45794g.A07(A0B(128, 22, 77), A0B(550, 35, 127) + iA01);
                return;
        }
        byte[] bArr = new byte[c45944v.A07()];
        c45944v.A0k(bArr, 0, c45944v.A07());
        int i = 0;
        C45944v c45944v2 = new C45944v(this.A0V.A01(new EventMessage(str, str2, jA0U, jA0Q, bArr)));
        int iA07 = c45944v2.A07();
        InterfaceC5361Hd[] interfaceC5361HdArr = this.A0L;
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
            this.A0Y.addLast(new C5451J6(jA0U2, iA07));
            this.A03 += iA07;
            return;
        }
        if (this.A0T != null) {
            jA05 = this.A0T.A05(jA05);
        }
        if (this.A0b && this.A0A != -9223372036854775807L) {
            jA05 = this.A0A;
        }
        for (InterfaceC5361Hd interfaceC5361Hd2 : this.A0L) {
            interfaceC5361Hd2.AIu(jA05, 1, iA07, 0, null);
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static void A0J(C45944v c45944v, C45944v c45944v2, String str, C5471JQ c5471jq) throws C44963K {
        c45944v.A0f(8);
        int iA0C = c45944v.A0C();
        if (c45944v.A0C() != 1936025959) {
            return;
        }
        int iA01 = AbstractC5439Iu.A01(iA0C);
        if (A0f[2].length() != 2) {
            throw new RuntimeException();
        }
        A0f[0] = "QrVDtjxvyixdHPq";
        if (iA01 == 1) {
            c45944v.A0g(4);
        }
        if (c45944v.A0C() != 1) {
            throw new C44963K(A0B(50, 39, 69));
        }
        c45944v2.A0f(8);
        int iA0C2 = c45944v2.A0C();
        if (c45944v2.A0C() != 1936025959) {
            return;
        }
        int iA02 = AbstractC5439Iu.A01(iA0C2);
        if (iA02 == 1) {
            if (c45944v2.A0Q() == 0) {
                throw new C44963K(A0B(662, 55, 94));
            }
        } else if (iA02 >= 2) {
            c45944v2.A0g(4);
        }
        if (c45944v2.A0Q() != 1) {
            throw new C44963K(A0B(89, 39, 111));
        }
        c45944v2.A0g(1);
        int iA0I = c45944v2.A0I();
        int i = (iA0I & 240) >> 4;
        int i2 = iA0I & 15;
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
            c5471jq.A07 = new C5470JP(z, str, iA0I2, bArr, i, i2, bArr2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0096  */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private void A0R(C7235mE c7235mE) throws C44963K {
        AbstractC45353y.A0A(this.A0W == null, A0B(585, 20, 15));
        DrmInitData drmInitDataA05 = A05(c7235mE.A02);
        C7235mE c7235mE2 = (C7235mE) AbstractC45353y.A01(c7235mE.A06(1836475768));
        SparseArray<C5446J1> sparseArray = new SparseArray<>();
        long jA01 = -9223372036854775807L;
        int size = c7235mE2.A02.size();
        for (int i = 0; i < size; i++) {
            C7234mD c7234mD = c7235mE2.A02.get(i);
            if (((AbstractC5439Iu) c7234mD).A00 == 1953654136) {
                Pair<Integer, C5446J1> pairA03 = A03(c7234mD.A00);
                int iIntValue = ((Integer) pairA03.first).intValue();
                Object obj = pairA03.second;
                if (A0f[7].charAt(29) == '0') {
                    throw new RuntimeException();
                }
                A0f[0] = "KUxAVqQLzsv7ujT";
                sparseArray.put(iIntValue, (C5446J1) obj);
            } else {
                int i2 = ((AbstractC5439Iu) c7234mD).A00;
                if (A0f[7].charAt(29) != '0') {
                    A0f[2] = "EA";
                    if (i2 == 1835362404) {
                        jA01 = A01(c7234mD.A00);
                    }
                } else {
                    String[] strArr = A0f;
                    strArr[3] = "P1l2XCTjN0GLzwkC984rH7zDpCyyqZ";
                    strArr[6] = "39xRaNo9QFkrA6tLq";
                    if (i2 == 237072518) {
                        jA01 = A01(c7234mD.A00);
                    }
                }
            }
        }
        SparseArray sparseArray2 = new SparseArray();
        int size2 = c7235mE.A01.size();
        for (int i3 = 0; i3 < size2; i3++) {
            C7235mE c7235mE3 = c7235mE.A01.get(i3);
            if (((AbstractC5439Iu) c7235mE3).A00 == 1953653099) {
                C5469JO c5469joA0A = A0A(AbstractC5445J0.A0J(c7235mE3, c7235mE.A07(1836476516), jA01, drmInitDataA05, (this.A0M & 16) != 0, false));
                if (c5469joA0A != null) {
                    sparseArray2.put(c5469joA0A.A00, c5469joA0A);
                }
            }
        }
        int size3 = sparseArray2.size();
        if (this.A0D.size() != 0) {
            AbstractC45353y.A08(this.A0D.size() == size3);
            for (int i4 = 0; i4 < size3; i4++) {
                C5469JO c5469jo = (C5469JO) sparseArray2.valueAt(i4);
                this.A0D.get(c5469jo.A00).A08(c5469jo, A06(sparseArray, c5469jo.A00));
            }
            return;
        }
        for (int i5 = 0; i5 < size3; i5++) {
            C5469JO c5469jo2 = (C5469JO) sparseArray2.valueAt(i5);
            C5452J7 c5452j7 = new C5452J7(this.A0F.AKS(i5, c5469jo2.A03));
            c5452j7.A08(c5469jo2, A06(sparseArray, c5469jo2.A00));
            this.A0D.put(c5469jo2.A00, c5452j7);
            this.A08 = Math.max(this.A08, c5469jo2.A04);
        }
        A0D();
        InterfaceC5332HA interfaceC5332HA = this.A0F;
        if (A0f[7].charAt(29) != '0') {
            String[] strArr2 = A0f;
            strArr2[3] = "NZTZhjA83sW4NrmiIOwSslFR5UdjBx";
            strArr2[6] = "jWtg8I2sGrLmtghr5";
            interfaceC5332HA.A6O();
            return;
        }
        throw new RuntimeException();
    }

    /* JADX WARN: Code duplicated, block: B:18:0x006a A[PHI: r0 r3
  0x006a: PHI (r0v33 com.facebook.ads.redexgen.X.mD) = (r0v12 com.facebook.ads.redexgen.X.mD), (r0v38 com.facebook.ads.redexgen.X.mD) binds: [B:43:0x0106, B:17:0x0068] A[DONT_GENERATE, DONT_INLINE]
  0x006a: PHI (r3v6 com.facebook.ads.redexgen.X.JP) = (r3v1 com.facebook.ads.redexgen.X.JP), (r3v7 com.facebook.ads.redexgen.X.JP) binds: [B:43:0x0106, B:17:0x0068] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static void A0T(C7235mE c7235mE, SparseArray<C5452J7> sparseArray, int i, byte[] bArr, boolean z) throws C44963K {
        C5470JP c5470jpA00;
        C7234mD c7234mDA07;
        C5452J7 c5452j7A09 = A09(c7235mE.A07(1952868452).A00, sparseArray, z);
        if (c5452j7A09 == null) {
            return;
        }
        C5471JQ c5471jq = c5452j7A09.A07;
        long jA02 = c5471jq.A05;
        c5452j7A09.A05();
        if (c7235mE.A07(1952867444) != null) {
            int i2 = i & 2;
            if (A0f[0].length() != 15) {
                throw new RuntimeException();
            }
            A0f[4] = "8CfIIEomKXR2z1rzEceKdGz";
            if (i2 == 0) {
                jA02 = A02(c7235mE.A07(1952867444).A00);
            }
        }
        A0U(c7235mE, c5452j7A09, jA02, i);
        C5469JO c5469jo = c5452j7A09.A05;
        if (A0f[2].length() != 2) {
            c5470jpA00 = c5469jo.A00(c5471jq.A06.A02);
            c7234mDA07 = c7235mE.A07(1935763834);
            if (c7234mDA07 != null) {
                A0W(c5470jpA00, c7234mDA07.A00, c5471jq);
            }
        } else {
            String[] strArr = A0f;
            strArr[1] = "KgLNgt4jXc3ey27lHSoy2KaHmXxTtgSL";
            strArr[5] = "0TnPqkkfx8cOSuGK7tHkJ8yHXf83oy0i";
            c5470jpA00 = c5469jo.A00(c5471jq.A06.A02);
            c7234mDA07 = c7235mE.A07(1935763834);
            if (c7234mDA07 != null) {
                A0W(c5470jpA00, c7234mDA07.A00, c5471jq);
            }
        }
        C7234mD c7234mDA08 = c7235mE.A07(1935763823);
        if (c7234mDA08 != null) {
            C45944v c45944v = c7234mDA08.A00;
            if (A0f[7].charAt(29) != '0') {
                A0f[2] = "tW";
                A0K(c45944v, c5471jq);
            } else {
                A0f[0] = "kXc0iULHRQw05uA";
                A0K(c45944v, c5471jq);
            }
        }
        C7234mD c7234mDA09 = c7235mE.A07(1936027235);
        if (c7234mDA09 != null) {
            A0L(c7234mDA09.A00, c5471jq);
        }
        C7234mD c7234mDA010 = c7235mE.A07(1935828848);
        C7234mD c7234mDA011 = c7235mE.A07(1936158820);
        if (c7234mDA010 != null && c7234mDA011 != null) {
            A0J(c7234mDA010.A00, c7234mDA011.A00, c5470jpA00 != null ? c5470jpA00.A02 : null, c5471jq);
        }
        int size = c7235mE.A02.size();
        for (int i3 = 0; i3 < size; i3++) {
            C7234mD c7234mD = c7235mE.A02.get(i3);
            if (((AbstractC5439Iu) c7234mD).A00 == 1970628964) {
                A0M(c7234mD.A00, c5471jq, bArr);
            }
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static void A0W(C5470JP c5470jp, C45944v c45944v, C5471JQ c5471jq) throws C44963K {
        int i = c5470jp.A00;
        c45944v.A0f(8);
        if ((AbstractC5439Iu.A00(c45944v.A0C()) & 1) == 1) {
            c45944v.A0g(8);
        }
        int iA0I = c45944v.A0I();
        int iA0L = c45944v.A0L();
        if (iA0L != c5471jq.A00) {
            throw new C44963K(A0B(308, 17, 45) + iA0L + A0B(0, 2, 27) + c5471jq.A00);
        }
        int i2 = 0;
        if (iA0I == 0) {
            boolean[] zArr = c5471jq.A0F;
            for (int i3 = 0; i3 < iA0L; i3++) {
                int iA0I2 = c45944v.A0I();
                i2 += iA0I2;
                zArr[i3] = iA0I2 > i;
            }
        } else {
            i2 = 0 + (iA0I * iA0L);
            Arrays.fill(c5471jq.A0F, 0, iA0L, iA0I > i);
        }
        c5471jq.A02(i2);
    }

    static {
        A0E();
        A0g = new InterfaceC5335HD() { // from class: com.facebook.ads.redexgen.X.mA
            @Override // com.facebook.ads.redexgen.core.InterfaceC5335HD
            public final InterfaceC5331H9[] A5N() {
                return C7227m6.A0b();
            }

            @Override // com.facebook.ads.redexgen.core.InterfaceC5335HD
            public final /* synthetic */ InterfaceC5331H9[] A5O(Uri uri, Map map) {
                return AbstractC5334HC.A01(this, uri, map);
            }
        };
        A0i = new byte[]{-94, 57, 79, 82, 90, -101, 79, Ascii.DC4, -94, 68, 108, 66, 124, 100, -115, -12};
        A0h = new C44672p().A11(A0B(717, 18, 81)).A14();
    }

    public C7227m6() {
        this(0);
    }

    public C7227m6(int i) {
        this(i, null);
    }

    public C7227m6(int i, C460253 c460253) {
        this(i, c460253, null, null);
    }

    public C7227m6(int i, C460253 c460253, C5469JO c5469jo, DrmInitData drmInitData) {
        this(i, c460253, c5469jo, drmInitData, Collections.emptyList());
    }

    public C7227m6(int i, C460253 c460253, C5469JO c5469jo, DrmInitData drmInitData, List<C7472qI> list) {
        this(i, c460253, c5469jo, drmInitData, list, null, false, false, false);
    }

    public C7227m6(int i, C460253 c460253, C5469JO c5469jo, DrmInitData drmInitData, List<C7472qI> list, InterfaceC5361Hd interfaceC5361Hd, boolean z, boolean z2, boolean z3) {
        this.A0A = -9223372036854775807L;
        this.A0M = (c5469jo != null ? 8 : 0) | i;
        this.A0T = c460253;
        this.A0W = c5469jo;
        this.A0N = drmInitData;
        this.A0Z = Collections.unmodifiableList(list);
        this.A0U = interfaceC5361Hd;
        this.A0c = z;
        this.A0b = z2;
        this.A0a = z3;
        this.A0V = new C5384I0();
        this.A0O = new C45944v(16);
        this.A0R = new C45944v(AbstractC5350HS.A03);
        this.A0Q = new C45944v(5);
        this.A0P = new C45944v();
        this.A0d = new byte[16];
        this.A0S = new C45944v(this.A0d);
        this.A0X = new ArrayDeque<>();
        this.A0Y = new ArrayDeque<>();
        this.A0D = new SparseArray<>();
        this.A08 = -9223372036854775807L;
        this.A0B = -9223372036854775807L;
        this.A0C = -9223372036854775807L;
        A0C();
    }

    public static long A01(C45944v c45944v) {
        c45944v.A0f(8);
        int fullAtom = c45944v.A0C();
        return AbstractC5439Iu.A01(fullAtom) == 0 ? c45944v.A0Q() : c45944v.A0R();
    }

    public static long A02(C45944v c45944v) {
        c45944v.A0f(8);
        int fullAtom = c45944v.A0C();
        int version = AbstractC5439Iu.A01(fullAtom);
        return version == 1 ? c45944v.A0R() : c45944v.A0Q();
    }

    public static Pair<Integer, C5446J1> A03(C45944v c45944v) {
        c45944v.A0f(12);
        int defaultSampleDescriptionIndex = c45944v.A0C();
        int trackId = c45944v.A0L();
        int defaultSampleFlags = c45944v.A0L();
        int defaultSampleSize = c45944v.A0L();
        int defaultSampleDuration = c45944v.A0C();
        return Pair.create(Integer.valueOf(defaultSampleDescriptionIndex), new C5446J1(trackId - 1, defaultSampleFlags, defaultSampleSize, defaultSampleDuration));
    }

    public static DrmInitData A05(List<C7234mD> list) {
        ArrayList arrayList = null;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C7234mD c7234mD = list.get(i);
            int leafChildrenSize = A0f[4].length();
            if (leafChildrenSize != 23) {
                throw new RuntimeException();
            }
            A0f[0] = "gRucWkmmr3YeQcV";
            C7234mD c7234mD2 = c7234mD;
            int leafChildrenSize2 = ((AbstractC5439Iu) c7234mD2).A00;
            if (leafChildrenSize2 == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArr = c7234mD2.A00.A00;
                UUID uuidA02 = AbstractC5462JH.A02(bArr);
                if (uuidA02 == null) {
                    AbstractC45794g.A07(A0B(128, 22, 77), A0B(455, 42, 100));
                } else {
                    arrayList.add(new DrmInitData.SchemeData(uuidA02, A0B(766, 9, 61), bArr));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new DrmInitData(arrayList);
    }

    private C5446J1 A06(SparseArray<C5446J1> sparseArray, int i) {
        if (sparseArray.size() == 1) {
            return sparseArray.valueAt(0);
        }
        return (C5446J1) AbstractC45353y.A01(sparseArray.get(i));
    }

    public static C5452J7 A07(SparseArray<C5452J7> sparseArray) {
        C5452J7 c5452j7 = null;
        long j = Long.MAX_VALUE;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            C5452J7 c5452j7ValueAt = sparseArray.valueAt(i);
            if (c5452j7ValueAt.A02 != c5452j7ValueAt.A07.A01) {
                long nextTrackRunOffset = c5452j7ValueAt.A07.A0E[c5452j7ValueAt.A02];
                if (nextTrackRunOffset < j) {
                    c5452j7 = c5452j7ValueAt;
                    j = nextTrackRunOffset;
                }
            }
        }
        return c5452j7;
    }

    public static C5452J7 A08(SparseArray<C5452J7> sparseArray, int i, boolean z) {
        if (sparseArray.size() == 1 && !z) {
            return sparseArray.valueAt(0);
        }
        return sparseArray.get(i);
    }

    private final C5469JO A0A(C5469JO c5469jo) {
        return c5469jo;
    }

    private void A0C() {
        this.A02 = 0;
        this.A00 = 0;
    }

    private void A0D() {
        if (this.A0L == null) {
            this.A0L = new InterfaceC5361Hd[2];
            int i = 0;
            if (this.A0U != null) {
                this.A0L[0] = this.A0U;
                i = 0 + 1;
            }
            int emsgTrackOutputCount = this.A0M;
            if ((emsgTrackOutputCount & 4) != 0) {
                InterfaceC5361Hd[] interfaceC5361HdArr = this.A0L;
                int i2 = i + 1;
                if (A0f[7].charAt(29) == '0') {
                    throw new RuntimeException();
                }
                String[] strArr = A0f;
                strArr[1] = "2Ynf6gmdLfe6xE9EEWKUzFfHKl41sL7a";
                strArr[5] = "AN0qqeacVBgpTr6ZS3JdezHHRUzhKU8l";
                interfaceC5361HdArr[i] = this.A0F.AKS(this.A0D.size(), 5);
                i = i2;
            }
            this.A0L = (InterfaceC5361Hd[]) Arrays.copyOf(this.A0L, i);
            for (InterfaceC5361Hd interfaceC5361Hd : this.A0L) {
                interfaceC5361Hd.A6e(A0h);
            }
        }
        if (this.A0K == null) {
            this.A0K = new InterfaceC5361Hd[this.A0Z.size()];
            for (int i3 = 0; i3 < i; i3++) {
                InterfaceC5332HA interfaceC5332HA = this.A0F;
                int i4 = this.A0D.size();
                InterfaceC5361Hd output = interfaceC5332HA.AKS(i4 + 1 + i3, 3);
                output.A6e(this.A0Z.get(i3));
                this.A0K[i3] = output;
            }
        }
    }

    private void A0F(long j) {
        while (!this.A0Y.isEmpty()) {
            C5451J6 c5451j6RemoveFirst = this.A0Y.removeFirst();
            this.A03 -= c5451j6RemoveFirst.A00;
            long jA05 = j + c5451j6RemoveFirst.A01;
            if (this.A0T != null) {
                jA05 = this.A0T.A05(jA05);
            }
            for (InterfaceC5361Hd interfaceC5361Hd : this.A0L) {
                interfaceC5361Hd.AIu(jA05, 1, c5451j6RemoveFirst.A00, this.A03, null);
            }
        }
    }

    private void A0G(long j) throws C44963K {
        while (!this.A0X.isEmpty() && this.A0X.peek().A00 == j) {
            A0P(this.A0X.pop());
        }
        A0C();
    }

    public static void A0H(C45944v c45944v, int i, C5471JQ c5471jq) throws C44963K {
        c45944v.A0f(i + 8);
        int fullAtom = c45944v.A0C();
        int flags = AbstractC5439Iu.A00(fullAtom);
        int fullAtom2 = flags & 1;
        if (fullAtom2 == 0) {
            int fullAtom3 = flags & 2;
            boolean z = fullAtom3 != 0;
            int sampleCount = c45944v.A0L();
            int fullAtom4 = c5471jq.A00;
            if (sampleCount == fullAtom4) {
                Arrays.fill(c5471jq.A0F, 0, sampleCount, z);
                int fullAtom5 = c45944v.A07();
                c5471jq.A02(fullAtom5);
                c5471jq.A04(c45944v);
                return;
            }
            StringBuilder sbAppend = new StringBuilder().append(A0B(308, 17, 45)).append(sampleCount).append(A0B(0, 2, 27));
            int fullAtom6 = c5471jq.A00;
            throw new C44963K(sbAppend.append(fullAtom6).toString());
        }
        throw new C44963K(A0B(399, 56, 17));
    }

    public static void A0K(C45944v c45944v, C5471JQ c5471jq) throws C44963K {
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
        throw new C44963K(A0B(605, 29, 113) + iA0L);
    }

    public static void A0L(C45944v c45944v, C5471JQ c5471jq) throws C44963K {
        A0H(c45944v, 0, c5471jq);
    }

    public static void A0M(C45944v c45944v, C5471JQ c5471jq, byte[] bArr) throws C44963K {
        c45944v.A0f(8);
        c45944v.A0k(bArr, 0, 16);
        if (!Arrays.equals(bArr, A0i)) {
            return;
        }
        A0H(c45944v, 16, c5471jq);
    }

    private void A0N(InterfaceC7263ms interfaceC7263ms) throws IOException {
        int i = ((int) this.A07) - this.A00;
        if (this.A0E != null) {
            interfaceC7263ms.readFully(this.A0E.A00, 8, i);
            A0V(new C7234mD(this.A01, this.A0E), interfaceC7263ms);
        } else {
            interfaceC7263ms.AK3(i);
        }
        A0G(interfaceC7263ms.A8n());
    }

    private void A0O(InterfaceC7263ms interfaceC7263ms) throws IOException {
        C5452J7 c5452j7ValueAt = null;
        long j = Long.MAX_VALUE;
        int size = this.A0D.size();
        for (int i = 0; i < size; i++) {
            C5452J7 nextTrackBundle = this.A0D.valueAt(i);
            C5471JQ c5471jq = nextTrackBundle.A07;
            if (c5471jq.A0A) {
                long nextDataOffset = c5471jq.A03;
                String[] strArr = A0f;
                if (strArr[3].length() == strArr[6].length()) {
                    throw new RuntimeException();
                }
                A0f[4] = "mIjUpcDFQdM2YkTgY6cnbvy";
                if (nextDataOffset < j) {
                    j = c5471jq.A03;
                    c5452j7ValueAt = this.A0D.valueAt(i);
                }
            }
        }
        if (c5452j7ValueAt == null) {
            if (A0f[4].length() == 23) {
                A0f[0] = "NbtoUSPOiQE3wq0";
                this.A02 = 3;
                return;
            }
            throw new RuntimeException();
        }
        int iA8n = (int) (j - interfaceC7263ms.A8n());
        if (iA8n >= 0) {
            interfaceC7263ms.AK3(iA8n);
            c5452j7ValueAt.A07.A05(interfaceC7263ms);
            return;
        }
        throw new C44963K(A0B(325, 39, 126));
    }

    private void A0P(C7235mE c7235mE) throws C44963K {
        if (((AbstractC5439Iu) c7235mE).A00 == 1836019574) {
            A0R(c7235mE);
        } else if (((AbstractC5439Iu) c7235mE).A00 == 1836019558) {
            A0Q(c7235mE);
        } else {
            if (this.A0X.isEmpty()) {
                return;
            }
            this.A0X.peek().A08(c7235mE);
        }
    }

    private void A0Q(C7235mE c7235mE) throws C44963K {
        A0S(c7235mE, this.A0D, this.A0M, this.A0d, this.A0c);
        DrmInitData drmInitDataA05 = this.A0N != null ? null : A05(c7235mE.A02);
        if (drmInitDataA05 != null) {
            int i = this.A0D.size();
            for (int trackCount = 0; trackCount < i; trackCount++) {
                this.A0D.valueAt(trackCount).A07(drmInitDataA05);
            }
        }
        if (this.A0B != -9223372036854775807L) {
            int size = this.A0D.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.A0D.valueAt(i2).A06(this.A0B);
            }
            this.A0B = -9223372036854775807L;
        }
    }

    public static void A0S(C7235mE c7235mE, SparseArray<C5452J7> sparseArray, int i, byte[] bArr, boolean z) throws C44963K {
        int size = c7235mE.A01.size();
        for (int i2 = 0; i2 < size; i2++) {
            C7235mE child = c7235mE.A01.get(i2);
            int i3 = ((AbstractC5439Iu) child).A00;
            if (i3 == 1953653094) {
                boolean z2 = true;
                if (size <= 1 || !z) {
                    z2 = false;
                }
                A0T(child, sparseArray, i, bArr, z2);
            }
        }
    }

    public static void A0U(C7235mE c7235mE, C5452J7 c5452j7, long j, int i) {
        int i2 = 0;
        int i3 = 0;
        List<C7234mD> list = c7235mE.A02;
        int size = list.size();
        int i4 = 0;
        while (true) {
            String[] strArr = A0f;
            if (strArr[1].charAt(23) != strArr[5].charAt(23)) {
                throw new RuntimeException();
            }
            A0f[0] = "3b9EJYgpciD07do";
            if (i4 < size) {
                C7234mD c7234mD = list.get(i4);
                if (((AbstractC5439Iu) c7234mD).A00 == 1953658222) {
                    C45944v trunData = c7234mD.A00;
                    trunData.A0f(12);
                    int iA0L = trunData.A0L();
                    if (iA0L > 0) {
                        i3 += iA0L;
                        i2++;
                    }
                }
                i4++;
            } else {
                c5452j7.A02 = 0;
                c5452j7.A00 = 0;
                c5452j7.A01 = 0;
                c5452j7.A07.A03(i2, i3);
                int i5 = 0;
                int trunStartPosition = 0;
                for (int i6 = 0; i6 < size; i6++) {
                    C7234mD c7234mD2 = list.get(i6);
                    if (((AbstractC5439Iu) c7234mD2).A00 == 1953658222) {
                        trunStartPosition = A00(c5452j7, i5, j, i, c7234mD2.A00, trunStartPosition);
                        i5++;
                    }
                }
                return;
            }
        }
    }

    private void A0V(C7234mD c7234mD, InterfaceC7263ms interfaceC7263ms) throws C44963K {
        Uri uriA9P;
        if (!this.A0X.isEmpty()) {
            this.A0X.peek().A09(c7234mD);
            return;
        }
        if (((AbstractC5439Iu) c7234mD).A00 == 1936286840) {
            Pair<Long, C7268my> pairA04 = A04(c7234mD.A00, interfaceC7263ms.A8n());
            this.A0C = ((Long) pairA04.first).longValue();
            this.A0F.AJ7((InterfaceC5356HY) pairA04.second);
            if (A0f[2].length() != 2) {
                throw new RuntimeException();
            }
            A0f[2] = "jw";
            this.A0H = true;
            return;
        }
        if (((AbstractC5439Iu) c7234mD).A00 != 1701671783 || (uriA9P = interfaceC7263ms.A9P()) == null) {
            return;
        }
        A0I(c7234mD.A00, uriA9P);
    }

    public static boolean A0X(int i) {
        return i == 1836019574 || i == 1953653099 || i == 1835297121 || i == 1835626086 || i == 1937007212 || i == 1836019558 || i == 1953653094 || i == 1836475768 || i == 1701082227;
    }

    public static boolean A0Y(int i) {
        if (i != 1751411826 && i != 1835296868 && i != 1836476516 && i != 1936286840 && i != 1937011556 && i != 1952867444 && i != 1952868452 && i != 1953196132 && i != 1953654136 && i != 1953658222 && i != 1886614376) {
            if (A0f[0].length() != 15) {
                throw new RuntimeException();
            }
            String[] strArr = A0f;
            strArr[1] = "pufslWDHGkolcxIdleA53YlHTmcCni23";
            strArr[5] = "pxTVwd0BvZHkKJbeu8mcyfUHnPvesqsQ";
            if (i != 1935763834 && i != 1935763823 && i != 1936027235 && i != 1970628964 && i != 1935828848 && i != 1936158820 && i != 1701606260 && i != 1835362404 && i != 1701671783) {
                return false;
            }
        }
        return true;
    }

    private boolean A0Z(InterfaceC7263ms interfaceC7263ms) throws IOException {
        if (this.A00 == 0) {
            if (!interfaceC7263ms.AHR(this.A0O.A00, 0, 8, true)) {
                return false;
            }
            this.A00 = 8;
            this.A0O.A0f(0);
            this.A07 = this.A0O.A0Q();
            this.A01 = this.A0O.A0C();
        }
        if (this.A07 == 1) {
            interfaceC7263ms.readFully(this.A0O.A00, 8, 8);
            int headerBytesRemaining = this.A00;
            this.A00 = headerBytesRemaining + 8;
            this.A07 = this.A0O.A0R();
        } else if (this.A07 == 0) {
            long jA8O = interfaceC7263ms.A8O();
            if (jA8O == -1 && !this.A0X.isEmpty()) {
                jA8O = this.A0X.peek().A00;
            }
            if (jA8O != -1) {
                long jA8n = jA8O - interfaceC7263ms.A8n();
                int trackCount = this.A00;
                this.A07 = jA8n + ((long) trackCount);
            }
        }
        if (this.A07 >= this.A00) {
            long jA8n2 = interfaceC7263ms.A8n() - ((long) this.A00);
            if (this.A01 == 1836019558) {
                int size = this.A0D.size();
                for (int i = 0; i < size; i++) {
                    C5471JQ c5471jq = this.A0D.valueAt(i).A07;
                    c5471jq.A02 = jA8n2;
                    c5471jq.A03 = jA8n2;
                    c5471jq.A04 = jA8n2;
                }
            }
            if (this.A01 == 1835295092) {
                this.A0G = null;
                this.A09 = this.A07 + jA8n2;
                if (!this.A0H) {
                    this.A0F.AJ7(new C7258mn(this.A08, jA8n2));
                    this.A0H = true;
                }
                this.A02 = 2;
                return true;
            }
            boolean zA0X = A0X(this.A01);
            String[] strArr = A0f;
            if (strArr[3].length() == strArr[6].length()) {
                throw new RuntimeException();
            }
            A0f[7] = "BTpsgrbOJA5y808qoKaZGmPima83kMX9";
            if (zA0X) {
                long jA8n3 = (interfaceC7263ms.A8n() + this.A07) - 8;
                this.A0X.push(new C7235mE(this.A01, jA8n3));
                if (this.A07 == this.A00) {
                    A0G(jA8n3);
                } else {
                    A0C();
                }
            } else if (A0Y(this.A01)) {
                if (this.A00 != 8) {
                    throw new C44963K(A0B(Sdk.SDKError.Reason.INVALID_BID_PAYLOAD_VALUE, 51, 94));
                }
                if (this.A07 <= 2147483647L) {
                    this.A0E = new C45944v((int) this.A07);
                    System.arraycopy(this.A0O.A00, 0, this.A0E.A00, 0, 8);
                    this.A02 = 1;
                } else {
                    throw new C44963K(A0B(259, 49, 17));
                }
            } else if (this.A07 <= 2147483647L) {
                this.A0E = null;
                this.A02 = 1;
            } else {
                throw new C44963K(A0B(497, 53, 12));
            }
            return true;
        }
        throw new C44963K(A0B(2, 48, Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE));
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0186 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:105:0x0306 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:106:0x016b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:107:0x0122 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:112:0x002e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x0098  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:37:0x0104 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x0106  */
    /* JADX WARN: Code duplicated, block: B:41:0x011e  */
    /* JADX WARN: Code duplicated, block: B:45:0x0132  */
    /* JADX WARN: Code duplicated, block: B:47:0x014a  */
    /* JADX WARN: Code duplicated, block: B:54:0x0171  */
    /* JADX WARN: Code duplicated, block: B:55:0x0184  */
    /* JADX WARN: Code duplicated, block: B:58:0x018a  */
    /* JADX WARN: Code duplicated, block: B:60:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:61:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:64:0x0201  */
    /* JADX WARN: Code duplicated, block: B:66:0x0205  */
    /* JADX WARN: Code duplicated, block: B:69:0x022a  */
    /* JADX WARN: Code duplicated, block: B:72:0x023f A[LOOP:1: B:67:0x0224->B:72:0x023f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:75:0x025d  */
    /* JADX WARN: Code duplicated, block: B:78:0x0266  */
    /* JADX WARN: Code duplicated, block: B:84:0x0290  */
    /* JADX WARN: Code duplicated, block: B:86:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:89:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:91:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:94:0x02d7  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private boolean A0a(InterfaceC7263ms interfaceC7263ms) throws IOException {
        C5471JQ c5471jq;
        C5469JO c5469jo;
        InterfaceC5361Hd interfaceC5361Hd;
        int i;
        long jA00;
        int i2;
        int i3;
        boolean z;
        C5359Hb c5359Hb;
        C5470JP c5470jpA00;
        ?? r11;
        int i4;
        String[] strArr;
        String str;
        String[] strArr2;
        byte[] bArr;
        int i5;
        int i6;
        int iA0C;
        boolean z2;
        int iAIp;
        int i7 = 4;
        int i8 = 1;
        int i9 = 0;
        if (this.A02 == 3) {
            if (this.A0G == null) {
                C5452J7 c5452j7A07 = A07(this.A0D);
                if (c5452j7A07 == null) {
                    int iA8n = (int) (this.A09 - interfaceC7263ms.A8n());
                    if (A0f[0].length() == 15) {
                        A0f[4] = "i1YiOY4gD0FAVv8vBgekv9L";
                        if (iA8n >= 0) {
                            interfaceC7263ms.AK3(iA8n);
                            A0C();
                            return false;
                        }
                        throw new C44963K(A0B(364, 35, 87));
                    }
                } else {
                    int iA8n2 = (int) (c5452j7A07.A07.A0E[c5452j7A07.A02] - interfaceC7263ms.A8n());
                    if (iA8n2 < 0) {
                        AbstractC45794g.A07(A0B(128, 22, 77), A0B(150, 40, 19));
                        iA8n2 = 0;
                    }
                    interfaceC7263ms.AK3(iA8n2);
                    this.A0G = c5452j7A07;
                }
            }
            this.A06 = this.A0G.A07.A0B[this.A0G.A01];
            if (this.A0G.A01 < this.A0G.A03) {
                interfaceC7263ms.AK3(this.A06);
                if (A0f[4].length() != 23) {
                    this.A0G.A02();
                    if (!this.A0G.A09()) {
                        this.A0G = null;
                    }
                } else {
                    A0f[0] = "A3KFlo0OZ1vz3cN";
                    this.A0G.A02();
                    if (!this.A0G.A09()) {
                        this.A0G = null;
                    }
                }
                this.A02 = 3;
                return true;
            }
            if (this.A0G.A05.A02 == 1) {
                this.A06 -= 8;
                interfaceC7263ms.AK3(8);
            }
            this.A04 = this.A0G.A04();
            this.A06 += this.A04;
            this.A02 = 4;
            this.A05 = 0;
            c5471jq = this.A0G.A07;
            c5469jo = this.A0G.A05;
            interfaceC5361Hd = this.A0G.A06;
            i = this.A0G.A01;
            jA00 = c5471jq.A00(i);
            if (this.A0T != null) {
                jA00 = this.A0T.A05(jA00);
            }
            i2 = c5469jo.A01;
            if (A0f[0].length() != 15) {
                if (i2 != 0) {
                    bArr = this.A0Q.A00;
                    bArr[0] = 0;
                    bArr[1] = 0;
                    bArr[2] = 0;
                    i5 = c5469jo.A01 + 1;
                    i6 = 4 - c5469jo.A01;
                    while (this.A04 < this.A06) {
                        if (this.A05 == 0) {
                            interfaceC7263ms.readFully(bArr, i6, i5);
                            this.A0Q.A0f(i9);
                            iA0C = this.A0Q.A0C();
                            if (iA0C >= i8) {
                                this.A05 = iA0C - 1;
                                this.A0R.A0f(i9);
                                interfaceC5361Hd.AIr(this.A0R, i7);
                                interfaceC5361Hd.AIr(this.A0Q, i8);
                                if (this.A0K.length > 0) {
                                    z2 = false;
                                } else {
                                    z2 = false;
                                }
                                this.A0J = z2;
                                this.A04 += 5;
                                if (A0f[2].length() != 2) {
                                    throw new RuntimeException();
                                }
                                String[] strArr3 = A0f;
                                strArr3[3] = "rGJs1bdDcV9vWCpHaV2ADCTyGiB9Xi";
                                strArr3[6] = "SO50y9aywvhjzs541";
                                this.A06 += i6;
                                i8 = 1;
                            } else {
                                throw new C44963K(A0B(FacebookRequestErrorClassification.EC_INVALID_TOKEN, 18, 94));
                            }
                        } else {
                            if (this.A0J) {
                                this.A0P.A0d(this.A05);
                                interfaceC7263ms.readFully(this.A0P.A00, i9, this.A05);
                                interfaceC5361Hd.AIr(this.A0P, this.A05);
                                iAIp = this.A05;
                                int iA02 = AbstractC5350HS.A02(this.A0P.A00, this.A0P.A0A());
                                this.A0P.A0f(A0B(756, 10, 83).equals(c5469jo.A07.A0W) ? 1 : 0);
                                this.A0P.A0e(iA02);
                                AbstractC5499Js.A03(jA00, this.A0P, this.A0K);
                            } else {
                                iAIp = interfaceC5361Hd.AIp(interfaceC7263ms, this.A05, false);
                            }
                            this.A04 += iAIp;
                            this.A05 -= iAIp;
                            i7 = 4;
                            i8 = 1;
                            i9 = 0;
                        }
                    }
                } else {
                    if (this.A0I) {
                        AbstractC5316Gu.A07(this.A06, this.A0S);
                        int iA0A = this.A0S.A0A();
                        interfaceC5361Hd.AIr(this.A0S, iA0A);
                        this.A06 += iA0A;
                        this.A04 += iA0A;
                        this.A0I = false;
                    }
                    while (this.A04 < this.A06) {
                        i3 = this.A06 - this.A04;
                        if (A0f[4].length() != 23) {
                            A0f[4] = "4fzpRPid5Z3e8Rz7esUDMjQ";
                            this.A04 += interfaceC5361Hd.AIp(interfaceC7263ms, i3, false);
                        }
                    }
                }
                z = c5471jq.A0G[i];
                c5359Hb = null;
                c5470jpA00 = this.A0G.A00();
                r11 = z;
                if (c5470jpA00 != null) {
                    int i10 = (z ? 1 : 0) | 1073741824;
                    c5359Hb = c5470jpA00.A01;
                    r11 = i10;
                }
                i4 = r11;
                if (this.A0G != null) {
                    str = this.A0G.A05.A07.A0W;
                    strArr2 = A0f;
                    if (strArr2[3].length() != strArr2[6].length()) {
                        A0f[2] = "aG";
                        if (str == A0B(735, 21, 64)) {
                            i4 = r11;
                            i4 = r11;
                            i4 = r11;
                            i4 = (r11 == true ? 1 : 0) | true;
                        }
                    }
                }
                i4 = r11;
                i4 = r11;
                i4 = r11;
                i4 = r11;
                i4 = r11;
                i4 = r11;
                long j = jA00;
                interfaceC5361Hd.AIu(jA00, i4, this.A06, 0, c5359Hb);
                this.A0A = j;
                A0F(j);
                if (!this.A0G.A09()) {
                    strArr = A0f;
                    if (strArr[1].charAt(23) != strArr[5].charAt(23)) {
                        this.A0G = null;
                    } else {
                        String[] strArr4 = A0f;
                        strArr4[1] = "si2y9gsn9mC0ma4HRQ4DLaiHkSELP0XP";
                        strArr4[5] = "aeCrUYztm6cMo33HVXFI6qvHQZYHBxKr";
                        this.A0G = null;
                    }
                }
                this.A02 = 3;
                return true;
            }
            String[] strArr5 = A0f;
            strArr5[1] = "1reQ2pcS16Hgv6ya8EYaKcYHA8e9gTqM";
            strArr5[5] = "zXUoCiVQDhh6v7GYUtROZrCHyvEA77y8";
            if (i2 != 0) {
                bArr = this.A0Q.A00;
                bArr[0] = 0;
                bArr[1] = 0;
                bArr[2] = 0;
                i5 = c5469jo.A01 + 1;
                i6 = 4 - c5469jo.A01;
                while (this.A04 < this.A06) {
                    if (this.A05 == 0) {
                        interfaceC7263ms.readFully(bArr, i6, i5);
                        this.A0Q.A0f(i9);
                        iA0C = this.A0Q.A0C();
                        if (iA0C >= i8) {
                            this.A05 = iA0C - 1;
                            this.A0R.A0f(i9);
                            interfaceC5361Hd.AIr(this.A0R, i7);
                            interfaceC5361Hd.AIr(this.A0Q, i8);
                            if (this.A0K.length > 0) {
                                z2 = false;
                            } else {
                                z2 = false;
                            }
                            this.A0J = z2;
                            this.A04 += 5;
                            if (A0f[2].length() != 2) {
                                throw new RuntimeException();
                            }
                            String[] strArr6 = A0f;
                            strArr6[3] = "rGJs1bdDcV9vWCpHaV2ADCTyGiB9Xi";
                            strArr6[6] = "SO50y9aywvhjzs541";
                            this.A06 += i6;
                            i8 = 1;
                        } else {
                            throw new C44963K(A0B(FacebookRequestErrorClassification.EC_INVALID_TOKEN, 18, 94));
                        }
                    } else {
                        if (this.A0J) {
                            this.A0P.A0d(this.A05);
                            interfaceC7263ms.readFully(this.A0P.A00, i9, this.A05);
                            interfaceC5361Hd.AIr(this.A0P, this.A05);
                            iAIp = this.A05;
                            int iA03 = AbstractC5350HS.A02(this.A0P.A00, this.A0P.A0A());
                            this.A0P.A0f(A0B(756, 10, 83).equals(c5469jo.A07.A0W) ? 1 : 0);
                            this.A0P.A0e(iA03);
                            AbstractC5499Js.A03(jA00, this.A0P, this.A0K);
                        } else {
                            iAIp = interfaceC5361Hd.AIp(interfaceC7263ms, this.A05, false);
                        }
                        this.A04 += iAIp;
                        this.A05 -= iAIp;
                        i7 = 4;
                        i8 = 1;
                        i9 = 0;
                    }
                }
            } else {
                if (this.A0I) {
                    AbstractC5316Gu.A07(this.A06, this.A0S);
                    int iA0A2 = this.A0S.A0A();
                    interfaceC5361Hd.AIr(this.A0S, iA0A2);
                    this.A06 += iA0A2;
                    this.A04 += iA0A2;
                    this.A0I = false;
                }
                while (this.A04 < this.A06) {
                    i3 = this.A06 - this.A04;
                    if (A0f[4].length() != 23) {
                        A0f[4] = "4fzpRPid5Z3e8Rz7esUDMjQ";
                        this.A04 += interfaceC5361Hd.AIp(interfaceC7263ms, i3, false);
                    }
                }
            }
            z = c5471jq.A0G[i];
            c5359Hb = null;
            c5470jpA00 = this.A0G.A00();
            r11 = z;
            if (c5470jpA00 != null) {
                int i11 = (z ? 1 : 0) | 1073741824;
                c5359Hb = c5470jpA00.A01;
                r11 = i11;
            }
            i4 = r11;
            if (this.A0G != null) {
                str = this.A0G.A05.A07.A0W;
                strArr2 = A0f;
                if (strArr2[3].length() != strArr2[6].length()) {
                    A0f[2] = "aG";
                    if (str == A0B(735, 21, 64)) {
                        i4 = r11;
                        i4 = r11;
                        i4 = r11;
                        i4 = (r11 == true ? 1 : 0) | true;
                    }
                }
            }
            i4 = r11;
            i4 = r11;
            i4 = r11;
            i4 = r11;
            i4 = r11;
            i4 = r11;
            long j2 = jA00;
            interfaceC5361Hd.AIu(jA00, i4, this.A06, 0, c5359Hb);
            this.A0A = j2;
            A0F(j2);
            if (!this.A0G.A09()) {
                strArr = A0f;
                if (strArr[1].charAt(23) != strArr[5].charAt(23)) {
                    this.A0G = null;
                } else {
                    String[] strArr7 = A0f;
                    strArr7[1] = "si2y9gsn9mC0ma4HRQ4DLaiHkSELP0XP";
                    strArr7[5] = "aeCrUYztm6cMo33HVXFI6qvHQZYHBxKr";
                    this.A0G = null;
                }
            }
            this.A02 = 3;
            return true;
        }
        c5471jq = this.A0G.A07;
        c5469jo = this.A0G.A05;
        interfaceC5361Hd = this.A0G.A06;
        i = this.A0G.A01;
        jA00 = c5471jq.A00(i);
        if (this.A0T != null) {
            jA00 = this.A0T.A05(jA00);
        }
        i2 = c5469jo.A01;
        if (A0f[0].length() != 15) {
            if (i2 != 0) {
                bArr = this.A0Q.A00;
                bArr[0] = 0;
                bArr[1] = 0;
                bArr[2] = 0;
                i5 = c5469jo.A01 + 1;
                i6 = 4 - c5469jo.A01;
                while (this.A04 < this.A06) {
                    if (this.A05 == 0) {
                        interfaceC7263ms.readFully(bArr, i6, i5);
                        this.A0Q.A0f(i9);
                        iA0C = this.A0Q.A0C();
                        if (iA0C >= i8) {
                            this.A05 = iA0C - 1;
                            this.A0R.A0f(i9);
                            interfaceC5361Hd.AIr(this.A0R, i7);
                            interfaceC5361Hd.AIr(this.A0Q, i8);
                            if (this.A0K.length > 0 || !AbstractC5350HS.A0I(c5469jo.A07.A0W, bArr[i7])) {
                                z2 = false;
                            } else {
                                z2 = true;
                            }
                            this.A0J = z2;
                            this.A04 += 5;
                            if (A0f[2].length() != 2) {
                                throw new RuntimeException();
                            }
                            String[] strArr8 = A0f;
                            strArr8[3] = "rGJs1bdDcV9vWCpHaV2ADCTyGiB9Xi";
                            strArr8[6] = "SO50y9aywvhjzs541";
                            this.A06 += i6;
                            i8 = 1;
                        } else {
                            throw new C44963K(A0B(FacebookRequestErrorClassification.EC_INVALID_TOKEN, 18, 94));
                        }
                    } else {
                        if (this.A0J) {
                            this.A0P.A0d(this.A05);
                            interfaceC7263ms.readFully(this.A0P.A00, i9, this.A05);
                            interfaceC5361Hd.AIr(this.A0P, this.A05);
                            iAIp = this.A05;
                            int iA04 = AbstractC5350HS.A02(this.A0P.A00, this.A0P.A0A());
                            this.A0P.A0f(A0B(756, 10, 83).equals(c5469jo.A07.A0W) ? 1 : 0);
                            this.A0P.A0e(iA04);
                            AbstractC5499Js.A03(jA00, this.A0P, this.A0K);
                        } else {
                            iAIp = interfaceC5361Hd.AIp(interfaceC7263ms, this.A05, false);
                        }
                        this.A04 += iAIp;
                        this.A05 -= iAIp;
                        i7 = 4;
                        i8 = 1;
                        i9 = 0;
                    }
                }
            } else {
                if (this.A0I) {
                    AbstractC5316Gu.A07(this.A06, this.A0S);
                    int iA0A3 = this.A0S.A0A();
                    interfaceC5361Hd.AIr(this.A0S, iA0A3);
                    this.A06 += iA0A3;
                    this.A04 += iA0A3;
                    this.A0I = false;
                }
                while (this.A04 < this.A06) {
                    i3 = this.A06 - this.A04;
                    if (A0f[4].length() != 23) {
                        A0f[4] = "4fzpRPid5Z3e8Rz7esUDMjQ";
                        this.A04 += interfaceC5361Hd.AIp(interfaceC7263ms, i3, false);
                    }
                }
            }
            z = c5471jq.A0G[i];
            c5359Hb = null;
            c5470jpA00 = this.A0G.A00();
            r11 = z;
            if (c5470jpA00 != null) {
                int i12 = (z ? 1 : 0) | 1073741824;
                c5359Hb = c5470jpA00.A01;
                r11 = i12;
            }
            i4 = r11;
            if (this.A0G != null && this.A0G.A05 != null && this.A0G.A05.A07 != null) {
                str = this.A0G.A05.A07.A0W;
                strArr2 = A0f;
                if (strArr2[3].length() != strArr2[6].length()) {
                    A0f[2] = "aG";
                    if (str == A0B(735, 21, 64)) {
                        i4 = r11;
                        i4 = r11;
                        i4 = r11;
                        i4 = (r11 == true ? 1 : 0) | true;
                    }
                }
            }
            i4 = r11;
            i4 = r11;
            i4 = r11;
            i4 = r11;
            i4 = r11;
            i4 = r11;
            long j3 = jA00;
            interfaceC5361Hd.AIu(jA00, i4, this.A06, 0, c5359Hb);
            this.A0A = j3;
            A0F(j3);
            if (!this.A0G.A09()) {
                strArr = A0f;
                if (strArr[1].charAt(23) != strArr[5].charAt(23)) {
                    this.A0G = null;
                } else {
                    String[] strArr9 = A0f;
                    strArr9[1] = "si2y9gsn9mC0ma4HRQ4DLaiHkSELP0XP";
                    strArr9[5] = "aeCrUYztm6cMo33HVXFI6qvHQZYHBxKr";
                    this.A0G = null;
                }
            }
            this.A02 = 3;
            return true;
        }
        String[] strArr10 = A0f;
        strArr10[1] = "1reQ2pcS16Hgv6ya8EYaKcYHA8e9gTqM";
        strArr10[5] = "zXUoCiVQDhh6v7GYUtROZrCHyvEA77y8";
        if (i2 != 0) {
            bArr = this.A0Q.A00;
            bArr[0] = 0;
            bArr[1] = 0;
            bArr[2] = 0;
            i5 = c5469jo.A01 + 1;
            i6 = 4 - c5469jo.A01;
            while (this.A04 < this.A06) {
                if (this.A05 == 0) {
                    interfaceC7263ms.readFully(bArr, i6, i5);
                    this.A0Q.A0f(i9);
                    iA0C = this.A0Q.A0C();
                    if (iA0C >= i8) {
                        this.A05 = iA0C - 1;
                        this.A0R.A0f(i9);
                        interfaceC5361Hd.AIr(this.A0R, i7);
                        interfaceC5361Hd.AIr(this.A0Q, i8);
                        if (this.A0K.length > 0) {
                            z2 = false;
                        } else {
                            z2 = false;
                        }
                        this.A0J = z2;
                        this.A04 += 5;
                        if (A0f[2].length() != 2) {
                            throw new RuntimeException();
                        }
                        String[] strArr11 = A0f;
                        strArr11[3] = "rGJs1bdDcV9vWCpHaV2ADCTyGiB9Xi";
                        strArr11[6] = "SO50y9aywvhjzs541";
                        this.A06 += i6;
                        i8 = 1;
                    } else {
                        throw new C44963K(A0B(FacebookRequestErrorClassification.EC_INVALID_TOKEN, 18, 94));
                    }
                } else {
                    if (this.A0J) {
                        this.A0P.A0d(this.A05);
                        interfaceC7263ms.readFully(this.A0P.A00, i9, this.A05);
                        interfaceC5361Hd.AIr(this.A0P, this.A05);
                        iAIp = this.A05;
                        int iA05 = AbstractC5350HS.A02(this.A0P.A00, this.A0P.A0A());
                        this.A0P.A0f(A0B(756, 10, 83).equals(c5469jo.A07.A0W) ? 1 : 0);
                        this.A0P.A0e(iA05);
                        AbstractC5499Js.A03(jA00, this.A0P, this.A0K);
                    } else {
                        iAIp = interfaceC5361Hd.AIp(interfaceC7263ms, this.A05, false);
                    }
                    this.A04 += iAIp;
                    this.A05 -= iAIp;
                    i7 = 4;
                    i8 = 1;
                    i9 = 0;
                }
            }
        } else {
            if (this.A0I) {
                AbstractC5316Gu.A07(this.A06, this.A0S);
                int iA0A4 = this.A0S.A0A();
                interfaceC5361Hd.AIr(this.A0S, iA0A4);
                this.A06 += iA0A4;
                this.A04 += iA0A4;
                this.A0I = false;
            }
            while (this.A04 < this.A06) {
                i3 = this.A06 - this.A04;
                if (A0f[4].length() != 23) {
                    A0f[4] = "4fzpRPid5Z3e8Rz7esUDMjQ";
                    this.A04 += interfaceC5361Hd.AIp(interfaceC7263ms, i3, false);
                }
            }
        }
        z = c5471jq.A0G[i];
        c5359Hb = null;
        c5470jpA00 = this.A0G.A00();
        r11 = z;
        if (c5470jpA00 != null) {
            int i13 = (z ? 1 : 0) | 1073741824;
            c5359Hb = c5470jpA00.A01;
            r11 = i13;
        }
        i4 = r11;
        if (this.A0G != null) {
            str = this.A0G.A05.A07.A0W;
            strArr2 = A0f;
            if (strArr2[3].length() != strArr2[6].length()) {
                A0f[2] = "aG";
                if (str == A0B(735, 21, 64)) {
                    i4 = r11;
                    i4 = r11;
                    i4 = r11;
                    i4 = (r11 == true ? 1 : 0) | true;
                }
            }
        }
        i4 = r11;
        i4 = r11;
        i4 = r11;
        i4 = r11;
        i4 = r11;
        i4 = r11;
        long j4 = jA00;
        interfaceC5361Hd.AIu(jA00, i4, this.A06, 0, c5359Hb);
        this.A0A = j4;
        A0F(j4);
        if (!this.A0G.A09()) {
            strArr = A0f;
            if (strArr[1].charAt(23) != strArr[5].charAt(23)) {
                this.A0G = null;
            } else {
                String[] strArr12 = A0f;
                strArr12[1] = "si2y9gsn9mC0ma4HRQ4DLaiHkSELP0XP";
                strArr12[5] = "aeCrUYztm6cMo33HVXFI6qvHQZYHBxKr";
                this.A0G = null;
            }
        }
        this.A02 = 3;
        return true;
        i4 = r11;
        i4 = r11;
        throw new RuntimeException();
    }

    public static /* synthetic */ InterfaceC5331H9[] A0b() {
        return new InterfaceC5331H9[]{new C7227m6()};
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5331H9
    public final void AAC(InterfaceC5332HA interfaceC5332HA) {
        this.A0F = interfaceC5332HA;
        if (this.A0W != null) {
            C5452J7 c5452j7 = new C5452J7(interfaceC5332HA.AKS(0, this.A0W.A03));
            c5452j7.A08(this.A0W, new C5446J1(0, 0, 0, 0));
            this.A0D.put(0, c5452j7);
            A0D();
            this.A0F.A6O();
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5331H9
    public final int AHL(InterfaceC7263ms interfaceC7263ms, C5353HV c5353hv) throws IOException {
        while (true) {
            int i = this.A02;
            if (A0f[0].length() != 15) {
                throw new RuntimeException();
            }
            String[] strArr = A0f;
            strArr[3] = "yYIiClYY3RZS73RDJ5vLPk2bDdZFXU";
            strArr[6] = "bGm4sUzBrXbQjG5ES";
            switch (i) {
                case 0:
                    if (!A0Z(interfaceC7263ms)) {
                        return -1;
                    }
                    break;
                    break;
                case 1:
                    A0N(interfaceC7263ms);
                    break;
                case 2:
                    A0O(interfaceC7263ms);
                    break;
                default:
                    if (A0a(interfaceC7263ms)) {
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
        int size = this.A0D.size();
        for (int i = 0; i < size; i++) {
            this.A0D.valueAt(i).A05();
        }
        this.A0Y.clear();
        this.A03 = 0;
        this.A0B = j2;
        this.A0X.clear();
        this.A0I = false;
        A0C();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5331H9
    public final boolean AK5(InterfaceC7263ms interfaceC7263ms) throws IOException {
        return AbstractC5467JM.A01(interfaceC7263ms);
    }
}
