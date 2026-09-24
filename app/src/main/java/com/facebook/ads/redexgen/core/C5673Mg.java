package com.facebook.ads.redexgen.core;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Mg */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C5673Mg {
    public static byte[] A05;
    public static String[] A06 = {"nQDli3B322dNyuNUEmcA1lNjVYYmcThQ", "JG8wfEU3nZ2EADYXO0uZDMHFqmVSkpWr", "8K0NmfCVVugnhGVgpCD", "5JHmUKWu4ei3dzUY0lNr", "xKwnuhTKVDH3YhaAiUGpqwLltg47C3CG", "Jcwv8MY0", "vBOLiuiZ", "hny3hth3cGmNH4IG9ndqfAmzri4VXjHL"};
    public C7122kN A00;
    public final int A01;
    public final String A02;
    public final ArrayList<C5672Mf> A03;
    public final TreeSet<C7120kL> A04;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 47);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{115, -57, -62, 115, -100, -70, -68, -63, -66, -67, -100, -56, -57, -51, -66, -57, -51, -57, -30, -22, -19, -26, -27, -95, -11, -16, -95, -13, -26, -17, -30, -18, -26, -95};
    }

    static {
        A01();
    }

    public C5673Mg(int i, String str) {
        this(i, str, C7122kN.A03);
    }

    public C5673Mg(int i, String str, C7122kN c7122kN) {
        this.A01 = i;
        this.A02 = str;
        this.A00 = c7122kN;
        this.A04 = new TreeSet<>();
        this.A03 = new ArrayList<>();
    }

    public final long A02(long j, long j2) {
        boolean z = true;
        AbstractC45353y.A07(j >= 0);
        if (j2 < 0) {
            z = false;
        }
        AbstractC45353y.A07(z);
        C7120kL c7120kLA04 = A04(j, j2);
        if (c7120kLA04.A03()) {
            return -Math.min(c7120kLA04.A04() ? Long.MAX_VALUE : c7120kLA04.A01, j2);
        }
        long j3 = j + j2;
        if (j3 < 0) {
            j3 = Long.MAX_VALUE;
        }
        long currentEndPosition = c7120kLA04.A02 + c7120kLA04.A01;
        if (currentEndPosition < j3) {
            TreeSet<C7120kL> treeSet = this.A04;
            String[] strArr = A06;
            if (strArr[5].length() != strArr[6].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A06;
            strArr2[2] = "31viDRwdD8ErVcI5dXS";
            strArr2[3] = "q1k4diPGE3D0s4ujqDJA";
            for (C7120kL c7120kL : treeSet.tailSet(c7120kLA04, false)) {
                if (c7120kL.A02 > currentEndPosition) {
                    break;
                }
                long j4 = c7120kL.A02;
                long queryEndPosition = c7120kL.A01;
                currentEndPosition = Math.max(currentEndPosition, j4 + queryEndPosition);
                if (currentEndPosition >= j3) {
                    break;
                }
            }
        }
        return Math.min(currentEndPosition - j, j2);
    }

    public final C7122kN A03() {
        return this.A00;
    }

    public final C7120kL A04(long j, long j2) {
        C7120kL c7120kLA03 = C7120kL.A03(this.A02, j);
        C7120kL c7120kLFloor = this.A04.floor(c7120kLA03);
        if (c7120kLFloor != null && c7120kLFloor.A02 + c7120kLFloor.A01 > j) {
            return c7120kLFloor;
        }
        C7120kL lookupSpan = this.A04.ceiling(c7120kLA03);
        if (lookupSpan != null) {
            long jMin = lookupSpan.A02 - j;
            if (j2 != -1) {
                jMin = Math.min(jMin, j2);
            }
            j2 = jMin;
        }
        return C7120kL.A04(this.A02, j, j2);
    }

    public final C7120kL A05(C7120kL c7120kL, long j, boolean z) {
        AbstractC45353y.A08(this.A04.remove(c7120kL));
        File file = (File) AbstractC45353y.A01(c7120kL.A03);
        if (z) {
            File file2 = file.getParentFile();
            File fileA05 = C7120kL.A05((File) AbstractC45353y.A01(file2), this.A01, c7120kL.A02, j);
            if (file.renameTo(fileA05)) {
                file = fileA05;
            } else {
                AbstractC45794g.A07(A00(4, 13, 42), A00(17, 17, 82) + file + A00(0, 4, 36) + fileA05);
            }
        }
        C7120kL newCacheSpan = c7120kL.A09(file, j);
        this.A04.add(newCacheSpan);
        return newCacheSpan;
    }

    public final TreeSet<C7120kL> A06() {
        return this.A04;
    }

    public final void A07(long j) {
        for (int i = 0; i < i; i++) {
            if (this.A03.get(i).A01 == j) {
                this.A03.remove(i);
                return;
            }
        }
        throw new IllegalStateException();
    }

    public final void A08(C7120kL c7120kL) {
        this.A04.add(c7120kL);
    }

    public final boolean A09() {
        return this.A04.isEmpty();
    }

    public final boolean A0A() {
        return this.A03.isEmpty();
    }

    public final boolean A0B(long j, long j2) {
        for (int i = 0; i < i; i++) {
            if (this.A03.get(i).A00(j, j2)) {
                return true;
            }
        }
        return false;
    }

    public final boolean A0C(long j, long j2) {
        for (int i = 0; i < i; i++) {
            if (this.A03.get(i).A01(j, j2)) {
                return false;
            }
        }
        this.A03.add(new C5672Mf(j, j2));
        return true;
    }

    public final boolean A0D(C5666MZ c5666mz) {
        if (this.A04.remove(c5666mz)) {
            if (c5666mz.A03 != null) {
                c5666mz.A03.delete();
                return true;
            }
            return true;
        }
        String[] strArr = A06;
        if (strArr[2].length() == strArr[3].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A06;
        strArr2[2] = "U4uu0ltzeeg5QMm1KwS";
        strArr2[3] = "VtFGErd1YdVsfyUNL3Po";
        return false;
    }

    public final boolean A0E(C5678Ml c5678Ml) {
        C7122kN c7122kN = this.A00;
        C7122kN oldMetadata = this.A00;
        this.A00 = oldMetadata.A05(c5678Ml);
        C7122kN oldMetadata2 = this.A00;
        return !oldMetadata2.equals(c7122kN);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C5673Mg c5673Mg = (C5673Mg) obj;
        if (this.A01 == c5673Mg.A01 && this.A02.equals(c5673Mg.A02) && this.A04.equals(c5673Mg.A04) && this.A00.equals(c5673Mg.A00)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int result = this.A01;
        int i = result * 31;
        int result2 = this.A02.hashCode();
        return ((i + result2) * 31) + this.A00.hashCode();
    }
}
