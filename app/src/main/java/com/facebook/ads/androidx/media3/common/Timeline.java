package com.facebook.ads.androidx.media3.common;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Pair;
import com.facebook.ads.androidx.media3.common.Timeline;
import com.facebook.ads.redexgen.core.AbstractBinderC442022;
import com.facebook.ads.redexgen.core.AbstractC45353y;
import com.facebook.ads.redexgen.core.AbstractC454043;
import com.facebook.ads.redexgen.core.AbstractC46115C;
import com.facebook.ads.redexgen.core.AbstractC4978BP;
import com.facebook.ads.redexgen.core.C44382K;
import com.facebook.ads.redexgen.core.C4918AR;
import com.facebook.ads.redexgen.core.C4919AS;
import com.facebook.ads.redexgen.core.C7437pj;
import com.facebook.ads.redexgen.core.C7439pl;
import com.facebook.ads.redexgen.core.InterfaceC442123;
import com.facebook.ads.redexgen.core.InterfaceC442224;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class Timeline implements InterfaceC442224 {
    public static String[] A00 = {"u1TV1j0aFj13GJQ9ixTagHG8KyMgbnog", "4GMeFBxldVuonExwkIPaDDi9I59L728Z", "hqD1wOYcZTmehOTQOtlNc0UQ2KV4ETaI", "yejsGunEYiKaKfUzobCfCtheJf3zEEcL", "wYd9LRHFlTpJXE3VqmNr3ySXFdmyeGzN", "VCegaKN739XbWKUaP5Uwy30Zmvr6QTeK", "Cr3igiuAIuu", "x89DN52UD2fFRZn9rQXfWzGYhaiJYHE1"};
    public static final Timeline A02 = new C4919AS();
    public static final String A05 = AbstractC46115C.A0h(0);
    public static final String A03 = AbstractC46115C.A0h(1);
    public static final String A04 = AbstractC46115C.A0h(2);
    public static final InterfaceC442123<Timeline> A01 = new InterfaceC442123() { // from class: com.facebook.ads.redexgen.X.pq
        @Override // com.facebook.ads.redexgen.core.InterfaceC442123
        public final InterfaceC442224 A6f(Bundle bundle) {
            return Timeline.A02(bundle);
        }
    };

    public abstract int A06();

    public abstract int A07();

    public abstract int A0A(Object obj);

    public abstract C7439pl A0I(int i, C7439pl c7439pl, boolean z);

    public abstract C7437pj A0L(int i, C7437pj c7437pj, long j);

    public abstract Object A0M(int i);

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BP != com.google.common.collect.ImmutableList<com.facebook.ads.androidx.media3.common.Timeline$Period> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BP != com.google.common.collect.ImmutableList<com.facebook.ads.androidx.media3.common.Timeline$Window> */
    public static C4918AR A02(Bundle bundle) {
        AbstractC4978BP abstractC4978BPA04 = A04(C7437pj.A0J, AbstractC454043.A00(bundle, A05));
        AbstractC4978BP abstractC4978BPA05 = A04(C7439pl.A08, AbstractC454043.A00(bundle, A03));
        int[] intArray = bundle.getIntArray(A04);
        if (intArray == null) {
            intArray = A05(abstractC4978BPA04.size());
        }
        return new C4918AR(abstractC4978BPA04, abstractC4978BPA05, intArray);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.23 != com.facebook.ads.androidx.media3.common.Bundleable$Creator<T extends com.facebook.ads.redexgen.X.24> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2K != com.google.common.collect.ImmutableList$Builder<T extends com.facebook.ads.redexgen.X.24> */
    public static <T extends InterfaceC442224> AbstractC4978BP<T> A04(InterfaceC442123<T> interfaceC442123, IBinder iBinder) {
        if (iBinder == null) {
            return AbstractC4978BP.A03();
        }
        C44382K c44382k = new C44382K();
        AbstractC4978BP<Bundle> abstractC4978BPA00 = AbstractBinderC442022.A00(iBinder);
        for (int i = 0; i < abstractC4978BPA00.size(); i++) {
            c44382k.A04(interfaceC442123.A6f(abstractC4978BPA00.get(i)));
        }
        return c44382k.A05();
    }

    public static int[] A05(int i) {
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = i2;
            int i3 = A00[1].charAt(20);
            if (i3 == 50) {
                throw new RuntimeException();
            }
            String[] strArr = A00;
            strArr[2] = "bm1hpxiL8T70YPoy7qoC4X3DFFhRRvrI";
            strArr[4] = "ZU2doOYnXTdq2XyitRV5O0BVNSu1NLTL";
        }
        return iArr;
    }

    public int A08(int i, int i2, boolean z) {
        switch (i2) {
            case 0:
                if (i == A0C(z)) {
                    return -1;
                }
                return i + 1;
            case 1:
                return i;
            case 2:
                int iA0C = A0C(z);
                String[] strArr = A00;
                if (strArr[3].charAt(14) != strArr[5].charAt(14)) {
                    throw new RuntimeException();
                }
                A00[1] = "R0HEAX03GiDQUcMP0CiDD2yYG3qNGv8H";
                if (i == iA0C) {
                    return A0B(z);
                }
                return i + 1;
            default:
                throw new IllegalStateException();
        }
    }

    public final int A09(int i, C7439pl c7439pl, C7437pj c7437pj, int i2, boolean z) {
        int i3 = A0H(i, c7439pl).A00;
        int windowIndex = A0K(i3, c7437pj).A01;
        if (windowIndex == i) {
            int nextWindowIndex = A08(i3, i2, z);
            if (nextWindowIndex == -1) {
                return -1;
            }
            int windowIndex2 = A0K(nextWindowIndex, c7437pj).A00;
            return windowIndex2;
        }
        int windowIndex3 = i + 1;
        return windowIndex3;
    }

    public int A0B(boolean z) {
        return A0N() ? -1 : 0;
    }

    public int A0C(boolean z) {
        if (A0N()) {
            return -1;
        }
        return A07() - 1;
    }

    @Deprecated
    public final Pair<Object, Long> A0D(C7437pj c7437pj, C7439pl c7439pl, int i, long j) {
        return A0E(c7437pj, c7439pl, i, j);
    }

    public final Pair<Object, Long> A0E(C7437pj c7437pj, C7439pl c7439pl, int i, long j) {
        return (Pair) AbstractC45353y.A01(A0G(c7437pj, c7439pl, i, j, 0L));
    }

    @Deprecated
    public final Pair<Object, Long> A0F(C7437pj c7437pj, C7439pl c7439pl, int i, long j, long j2) {
        return A0G(c7437pj, c7439pl, i, j, j2);
    }

    public final Pair<Object, Long> A0G(C7437pj c7437pj, C7439pl c7439pl, int i, long j, long j2) {
        AbstractC45353y.A00(i, 0, A07());
        A0L(i, c7437pj, j2);
        if (j == -9223372036854775807L) {
            j = c7437pj.A05();
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        int i2 = c7437pj.A00;
        A0H(i2, c7439pl);
        while (i2 < c7437pj.A01 && c7439pl.A02 != j && A0H(i2 + 1, c7439pl).A02 <= j) {
            i2++;
        }
        A0I(i2, c7439pl, true);
        long jMin = j - c7439pl.A02;
        if (c7439pl.A01 != -9223372036854775807L) {
            long j3 = c7439pl.A01;
            if (A00[1].charAt(20) == '2') {
                throw new RuntimeException();
            }
            A00[1] = "slEcDLMOMSnRw8lzrIQwxe9jf9tcgTic";
            jMin = Math.min(jMin, j3 - 1);
        }
        return Pair.create(AbstractC45353y.A01(c7439pl.A04), Long.valueOf(Math.max(0L, jMin)));
    }

    public final C7439pl A0H(int i, C7439pl c7439pl) {
        return A0I(i, c7439pl, false);
    }

    public C7439pl A0J(Object obj, C7439pl c7439pl) {
        return A0I(A0A(obj), c7439pl, true);
    }

    public final C7437pj A0K(int i, C7437pj c7437pj) {
        return A0L(i, c7437pj, 0L);
    }

    public final boolean A0N() {
        return A07() == 0;
    }

    public final boolean A0O(int i, C7439pl c7439pl, C7437pj c7437pj, int i2, boolean z) {
        return A09(i, c7439pl, c7437pj, i2, z) == -1;
    }

    public final boolean equals(Object obj) {
        int iA0C;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Timeline)) {
            return false;
        }
        Timeline timeline = (Timeline) obj;
        if (timeline.A07() != A07() || timeline.A06() != A06()) {
            return false;
        }
        C7437pj c7437pj = new C7437pj();
        C7439pl c7439pl = new C7439pl();
        C7437pj window = new C7437pj();
        C7439pl otherPeriod = new C7439pl();
        for (int i = 0; i < A07(); i++) {
            if (!A0K(i, c7437pj).equals(timeline.A0K(i, window))) {
                return false;
            }
        }
        for (int i2 = 0; i2 < A06(); i2++) {
            boolean zEquals = A0I(i2, c7439pl, true).equals(timeline.A0I(i2, otherPeriod, true));
            if (A00[6].length() != 11) {
                throw new RuntimeException();
            }
            String[] strArr = A00;
            strArr[7] = "LCXdoHEXleHtD1UyLVprjOGqC7qnADXU";
            strArr[0] = "np8LEsRhRemsbbWWIjAQc1GjKbBRdfRS";
            if (!zEquals) {
                return false;
            }
        }
        int iA0B = A0B(true);
        if (iA0B != timeline.A0B(true) || (iA0C = A0C(true)) != timeline.A0C(true)) {
            return false;
        }
        while (iA0B != iA0C) {
            int iA08 = A08(iA0B, 0, true);
            if (iA08 != timeline.A08(iA0B, 0, true)) {
                return false;
            }
            iA0B = iA08;
        }
        return true;
    }

    public final int hashCode() {
        C7437pj c7437pj = new C7437pj();
        C7439pl c7439pl = new C7439pl();
        int result = 7 * 31;
        int i = result + A07();
        for (int i2 = 0; i2 < A07(); i2++) {
            C7437pj window = A0K(i2, c7437pj);
            i = (i * 31) + window.hashCode();
        }
        int result2 = i * 31;
        int i3 = result2 + A06();
        for (int i4 = 0; i4 < A06(); i4++) {
            i3 = (i3 * 31) + A0I(i4, c7439pl, true).hashCode();
        }
        int iA0B = A0B(true);
        while (iA0B != -1) {
            int windowIndex = i3 * 31;
            i3 = windowIndex + iA0B;
            iA0B = A08(iA0B, 0, true);
        }
        return i3;
    }
}
