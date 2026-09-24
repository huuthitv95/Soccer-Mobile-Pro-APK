package com.facebook.ads.redexgen.core;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.1a */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C43921a extends AbstractC48759j {
    public static byte[] A0H;
    public static String[] A0I = {"m5Q3aiQKICJZrVflAtkG72aHaW7D7vzV", "Te6TlfxhDkM1nSnzhWnFswazR8GhYsIL", "RAA", "kEgqAeLW1EWE377lDOv4M7tHjIvdZKXO", "06ys5nuQ5LNcvNVR71UhF3Tfl10HYLje", "yFo", "kDpjkJehLDjfyQcmHJ0GXPIrbeMaoLDA", "wnjbAtiJPFcw6YA"};
    public AbstractC48779l A00;
    public float A01;
    public int A02;
    public int A03;
    public long A04;
    public final float A05;
    public final int A06;
    public final int A07;
    public final long A08;
    public final long A09;
    public final long A0A;
    public final AbstractC4978BP<C5167EU> A0B;
    public final float A0C;
    public final int A0D;
    public final long A0E;
    public final InterfaceC454245 A0F;
    public final InterfaceC5205F6 A0G;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public C43921a(@MetaExoPlayerCustomization("Used for OculusAdaptiveTrackSelection") C7435pg c7435pg, @MetaExoPlayerCustomization("Used to retain old value for Oculus") int[] iArr, int i, InterfaceC5205F6 interfaceC5205F6, int i2, long j, long j2, long j3, int i3, int i4, float f, float f2, long j4, List<C5167EU> list, InterfaceC454245 interfaceC454245) {
        super(c7435pg, iArr, i);
        if (j3 < j) {
            AbstractC45794g.A07(A03(0, 22, 43), A03(22, 90, 50));
            j3 = j;
        }
        this.A0G = interfaceC5205F6;
        this.A0D = i2;
        this.A08 = j * 1000;
        this.A0E = j2 * 1000;
        this.A09 = 1000 * j3;
        this.A07 = i3;
        this.A06 = i4;
        this.A0C = f;
        this.A05 = f2;
        this.A0B = AbstractC4978BP.A05(list);
        this.A0A = j4;
        this.A0F = interfaceC454245;
        this.A01 = 1.0f;
        this.A02 = 0;
        this.A04 = -9223372036854775807L;
    }

    public static String A03(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0H, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 89);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A0H = new byte[]{-59, -24, -27, -12, -8, -19, -6, -23, -40, -10, -27, -25, -17, -41, -23, -16, -23, -25, -8, -19, -13, -14, -52, -17, -11, 0, -2, -1, -12, -7, -14, -85, -8, -12, -7, -49, 0, -3, -20, -1, -12, -6, -7, -33, -6, -35, -16, -1, -20, -12, -7, -52, -15, -1, -16, -3, -49, -12, -2, -18, -20, -3, -17, -40, -2, -85, -1, -6, -85, -19, -16, -85, -20, -1, -85, -9, -16, -20, -2, -1, -85, -8, -12, -7, -49, 0, -3, -20, -1, -12, -6, -7, -47, -6, -3, -36, 0, -20, -9, -12, -1, 4, -44, -7, -18, -3, -16, -20, -2, -16, -40, -2};
    }

    static {
        A04();
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0110  */
    /* JADX WARN: Code duplicated, block: B:48:0x011a  */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2K != com.google.common.collect.ImmutableList$Builder<com.facebook.ads.androidx.media3.exoplayer.trackselection.AdaptiveTrackSelection$AdaptationCheckpoint> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2K != com.google.common.collect.ImmutableList$Builder<com.google.common.collect.ImmutableList<com.facebook.ads.androidx.media3.exoplayer.trackselection.AdaptiveTrackSelection$AdaptationCheckpoint>> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BP != com.google.common.collect.ImmutableList<java.lang.Integer> */
    public static AbstractC4978BP<AbstractC4978BP<C5167EU>> A00(C5184El[] c5184ElArr) {
        C44382K c44382k;
        AbstractC4978BP abstractC4978BPA05;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < c5184ElArr.length; i++) {
            if (c5184ElArr[i] != null && c5184ElArr[i].A02.length > 1) {
                C44382K c44382kA01 = AbstractC4978BP.A01();
                c44382kA01.A04(new C5167EU(0L, 0L));
                arrayList.add(c44382kA01);
            } else {
                arrayList.add(null);
            }
        }
        long[][] jArrA06 = A06(c5184ElArr);
        int length = jArrA06.length;
        if (A0I[0].charAt(10) != 'x') {
            A0I[0] = "UXetESR07W40Ugl2KcKxfZnSKo41RBjF";
            int[] iArr = new int[length];
            long[] jArr = new long[jArrA06.length];
            for (int i2 = 0; i2 < jArrA06.length; i2++) {
                int length2 = jArrA06[i2].length;
                if (A0I[0].charAt(10) == 'x') {
                    throw new RuntimeException();
                }
                A0I[7] = "x";
                jArr[i2] = length2 == 0 ? 0L : jArrA06[i2][0];
                String[] strArr = A0I;
                if (strArr[1].charAt(10) != strArr[4].charAt(10)) {
                    String[] strArr2 = A0I;
                    strArr2[1] = "cSuX5sbs1mm7BtC5NofnfdI255eKyli3";
                    strArr2[4] = "Z411JjDvpqHs7gscP9Mv86ZFtFCMjIgX";
                }
            }
            A05(arrayList, jArr);
            AbstractC4978BP<Integer> abstractC4978BPA02 = A02(jArrA06);
            for (int i3 = 0; i3 < abstractC4978BPA02.size(); i3++) {
                int iIntValue = abstractC4978BPA02.get(i3).intValue();
                int i4 = iArr[iIntValue] + 1;
                iArr[iIntValue] = i4;
                jArr[iIntValue] = jArrA06[iIntValue][i4];
                A05(arrayList, jArr);
            }
            for (int i5 = 0; i5 < c5184ElArr.length; i5++) {
                if (arrayList.get(i5) != null) {
                    jArr[i5] = jArr[i5] * 2;
                }
            }
            A05(arrayList, jArr);
            C44382K c44382kA02 = AbstractC4978BP.A01();
            int i6 = 0;
            while (true) {
                int size = arrayList.size();
                String[] strArr3 = A0I;
                if (strArr3[5].length() != strArr3[2].length()) {
                    String[] strArr4 = A0I;
                    strArr4[5] = "B5d";
                    strArr4[2] = "E7u";
                    if (i6 >= size) {
                        break;
                    }
                    c44382k = (C44382K) arrayList.get(i6);
                    if (c44382k == null) {
                        abstractC4978BPA05 = AbstractC4978BP.A03();
                    } else {
                        abstractC4978BPA05 = c44382k.A05();
                    }
                    c44382kA02.A04(abstractC4978BPA05);
                    i6++;
                } else {
                    String[] strArr5 = A0I;
                    strArr5[6] = "P6lwie0zupyVMIziqYi4GtWsnZGWabHp";
                    strArr5[3] = "HBKI3D47JNzwp3E4fcvtN9y7FoJFPrZj";
                    if (i6 >= size) {
                        break;
                    }
                    c44382k = (C44382K) arrayList.get(i6);
                    if (c44382k == null) {
                        abstractC4978BPA05 = AbstractC4978BP.A03();
                    } else {
                        abstractC4978BPA05 = c44382k.A05();
                    }
                    c44382kA02.A04(abstractC4978BPA05);
                    i6++;
                }
            }
            return c44382kA02.A05();
        }
        throw new RuntimeException();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.q3 != com.google.common.collect.Multimap<java.lang.Double, java.lang.Integer> */
    public static AbstractC4978BP<Integer> A02(long[][] jArr) {
        InterfaceC7457q3 interfaceC7457q3A00 = AbstractC7459q5.A02().A03().A00();
        for (int i = 0; i < jArr.length; i++) {
            if (jArr[i].length > 1) {
                double[] logBitrates = new double[jArr[i].length];
                int i2 = 0;
                while (true) {
                    int length = jArr[i].length;
                    double dLog = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
                    if (i2 >= length) {
                        break;
                    }
                    if (jArr[i][i2] != -1) {
                        dLog = Math.log(jArr[i][i2]);
                    }
                    logBitrates[i2] = dLog;
                    i2++;
                }
                double d = logBitrates[logBitrates.length - 1] - logBitrates[0];
                int i3 = 0;
                for (int i4 = 1; i3 < logBitrates.length - i4; i4 = 1) {
                    interfaceC7457q3A00.AHE(Double.valueOf(d == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE ? 1.0d : (((logBitrates[i3] + logBitrates[i3 + 1]) * 0.5d) - logBitrates[0]) / d), Integer.valueOf(i));
                    i3++;
                }
            }
        }
        return AbstractC4978BP.A05(interfaceC7457q3A00.values());
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2K != com.google.common.collect.ImmutableList$Builder<com.facebook.ads.androidx.media3.exoplayer.trackselection.AdaptiveTrackSelection$AdaptationCheckpoint> */
    public static void A05(List<C44382K<C5167EU>> list, long[] jArr) {
        long j = 0;
        for (long j2 : jArr) {
            String[] strArr = A0I;
            if (strArr[5].length() != strArr[2].length()) {
                throw new RuntimeException();
            }
            A0I[0] = "hzQzkxJwAHZ0fRiIn7Pvrd3jIUiof14p";
            j += j2;
        }
        for (int i = 0; i < list.size(); i++) {
            C44382K<C5167EU> c44382k = list.get(i);
            if (A0I[0].charAt(10) == 'x') {
                throw new RuntimeException();
            }
            A0I[0] = "0V4VZlbFayh1Opq7Ah9Nva0ccysrREXP";
            if (c44382k != null) {
                c44382k.A04(new C5167EU(j, jArr[i]));
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x006e A[PHI: r5
  0x006e: PHI (r5v2 long[]) = (r5v0 long[]), (r5v3 long[]) binds: [B:21:0x007c, B:17:0x006c] A[DONT_GENERATE, DONT_INLINE]] */
    public static long[][] A06(C5184El[] c5184ElArr) {
        long j;
        long[] jArr;
        long[][] jArr2 = new long[c5184ElArr.length][];
        for (int i = 0; i < c5184ElArr.length; i++) {
            C5184El c5184El = c5184ElArr[i];
            if (c5184El == null) {
                jArr2[i] = new long[0];
            } else {
                long[] jArr3 = new long[c5184El.A02.length];
                String[] strArr = A0I;
                String str = strArr[6];
                String str2 = strArr[3];
                int i2 = str.charAt(18);
                if (i2 == str2.charAt(18)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0I;
                strArr2[5] = "e4C";
                strArr2[2] = "lZL";
                jArr2[i] = jArr3;
                for (int i3 = 0; i3 < c5184El.A02.length; i3++) {
                    int j2 = c5184El.A01.A08(c5184El.A02[i3]).A05;
                    int i4 = A0I[7].length();
                    if (i4 != 11) {
                        String[] strArr3 = A0I;
                        strArr3[5] = "HL2";
                        strArr3[2] = "liv";
                        j = j2;
                        jArr = jArr2[i];
                        if (j == -1) {
                            j = 0;
                        }
                    } else {
                        j = j2;
                        jArr = jArr2[i];
                        if (j == -1) {
                            j = 0;
                        }
                    }
                    jArr[i3] = j;
                }
                Arrays.sort(jArr2[i]);
            }
        }
        return jArr2;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC48759j, com.facebook.ads.redexgen.core.InterfaceC7284nE
    public final void A5x() {
        this.A00 = null;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC48759j, com.facebook.ads.redexgen.core.InterfaceC7284nE
    public final void A6K() {
        this.A04 = -9223372036854775807L;
        this.A00 = null;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC7284nE
    public final int A93() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC48759j, com.facebook.ads.redexgen.core.InterfaceC7284nE
    public final void AFJ(float f) {
        this.A01 = f;
    }
}
