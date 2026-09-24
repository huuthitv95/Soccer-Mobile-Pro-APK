package com.facebook.ads.redexgen.core;

import android.util.Pair;
import com.facebook.ads.androidx.media3.common.Timeline;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.7E */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C47377E {
    public static String[] A0B = {"ytES6GjYCCZeLRsctY", "", "JAF1Tg0UjyffIggj5BNMmxVlRkgdhjMr", "rlk3ZCySajOx3", "MCGN0v", "", "6TmcGiXQ57FFOBCo2j", "Z1k2a4cknNke6aCh8ssxRFJ66FmodiBm"};
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public C47337A A04;
    public C47337A A05;
    public C47337A A06;
    public Object A07;
    public boolean A08;
    public final C7439pl A09 = new C7439pl();
    public final C7437pj A0A = new C7437pj();

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C7320no A06(Timeline timeline, Object obj, long j, long j2, C7439pl c7439pl) {
        timeline.A0J(obj, c7439pl);
        int iA08 = c7439pl.A08(j);
        return iA08 == -1 ? new C7320no(obj, j2) : new C7320no(obj, iA08, c7439pl.A05(iA08), j2);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final C47347B A0I(Timeline timeline, C47347B c47347b) {
        long jA0A;
        long j = c47347b.A01;
        boolean zA08 = A08(timeline, c47347b.A04, j);
        boolean zA09 = A09(timeline, c47347b.A04, zA08);
        timeline.A0J(c47347b.A04.A04, this.A09);
        if (c47347b.A04.A00()) {
            jA0A = this.A09.A0E(c47347b.A04.A00, c47347b.A04.A01);
        } else {
            jA0A = j == Long.MIN_VALUE ? this.A09.A0A() : j;
        }
        return new C47347B(c47347b.A04, c47347b.A03, j, c47347b.A02, jA0A, zA08, zA09);
    }

    private long A00(Timeline timeline, Object obj) {
        int oldFrontPeriodIndex;
        int holderWindowIndex = timeline.A0J(obj, this.A09).A00;
        if (this.A07 != null && (oldFrontPeriodIndex = timeline.A0A(this.A07)) != -1) {
            int windowIndex = timeline.A0H(oldFrontPeriodIndex, this.A09).A00;
            if (windowIndex == holderWindowIndex) {
                return this.A03;
            }
        }
        for (C47337A mediaPeriodHolder = A0D(); mediaPeriodHolder != null; mediaPeriodHolder = mediaPeriodHolder.A0I()) {
            if (mediaPeriodHolder.A08.equals(obj)) {
                return mediaPeriodHolder.A00.A04.A03;
            }
        }
        for (C47337A c47337aA0D = A0D(); c47337aA0D != null; c47337aA0D = c47337aA0D.A0I()) {
            int iA0A = timeline.A0A(c47337aA0D.A08);
            if (iA0A != -1) {
                int windowIndex2 = timeline.A0H(iA0A, this.A09).A00;
                if (windowIndex2 == holderWindowIndex) {
                    return c47337aA0D.A00.A04.A03;
                }
            }
        }
        long j = this.A02;
        this.A02 = 1 + j;
        return j;
    }

    private C47347B A01(Timeline timeline, C47337A c47337a, long j) {
        long jLongValue;
        C47377E c47377e = this;
        C47347B c47347b = c47337a.A00;
        if (c47347b.A07) {
            int iA0A = timeline.A0A(c47347b.A04.A04);
            C7439pl c7439pl = c47377e.A09;
            C7437pj c7437pj = c47377e.A0A;
            int currentPeriodIndex = c47377e.A01;
            int iA09 = timeline.A09(iA0A, c7439pl, c7437pj, currentPeriodIndex, c47377e.A08);
            if (iA09 == -1) {
                return null;
            }
            int i = timeline.A0I(iA09, c47377e.A09, true).A00;
            Object obj = c47377e.A09.A04;
            long j2 = c47347b.A04.A03;
            if (timeline.A0K(i, c47377e.A0A).A00 == iA09) {
                Pair<Object, Long> defaultPosition = timeline.A0F(c47377e.A0A, c47377e.A09, i, -9223372036854775807L, Math.max(0L, (c47337a.A0B() + c47347b.A00) - j));
                if (defaultPosition == null) {
                    return null;
                }
                obj = defaultPosition.first;
                jLongValue = ((Long) defaultPosition.second).longValue();
                C47337A c47337aA0I = c47337a.A0I();
                if (c47337aA0I != null && c47337aA0I.A08.equals(obj)) {
                    j2 = c47337aA0I.A00.A04.A03;
                    c47377e = this;
                } else {
                    c47377e = this;
                    j2 = c47377e.A02;
                    long startPositionUs = 1 + j2;
                    String[] strArr = A0B;
                    if (strArr[6].length() == strArr[4].length()) {
                        throw new RuntimeException();
                    }
                    A0B[0] = "5yy5YdDharfiXP";
                    c47377e.A02 = startPositionUs;
                }
            } else {
                jLongValue = 0;
            }
            return A02(timeline, A06(timeline, obj, jLongValue, j2, c47377e.A09), jLongValue, jLongValue);
        }
        C7320no c7320no = c47347b.A04;
        timeline.A0J(c7320no.A04, c47377e.A09);
        if (c7320no.A00()) {
            int i2 = c7320no.A00;
            int iA04 = c47377e.A09.A04(i2);
            if (iA04 != -1) {
                int iA06 = c47377e.A09.A06(i2, c7320no.A01);
                if (iA06 < iA04) {
                    if (!c47377e.A09.A0I(i2, iA06)) {
                        return null;
                    }
                    return A03(timeline, c7320no.A04, i2, iA06, c47347b.A02, c7320no.A03);
                }
                return A04(timeline, c7320no.A04, c47347b.A02, c7320no.A03);
            }
            String[] strArr2 = A0B;
            if (strArr2[5].length() != strArr2[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr3 = A0B;
            strArr3[5] = "";
            strArr3[1] = "";
            return null;
        }
        if (c47347b.A01 != Long.MIN_VALUE) {
            int iA08 = c47377e.A09.A08(c47347b.A01);
            if (iA08 == -1) {
                return A04(timeline, c7320no.A04, c47347b.A01, c7320no.A03);
            }
            int iA05 = c47377e.A09.A05(iA08);
            if (!c47377e.A09.A0I(iA08, iA05)) {
                return null;
            }
            return A03(timeline, c7320no.A04, iA08, iA05, c47347b.A01, c7320no.A03);
        }
        int iA03 = c47377e.A09.A03();
        if (iA03 == 0) {
            return null;
        }
        int i3 = iA03 - 1;
        if (A0B[7].charAt(7) == 'k') {
            A0B[0] = "u0JZC9rSowd61rcMlDOlOE";
            if (c47377e.A09.A0D(i3) != Long.MIN_VALUE) {
                return null;
            }
        } else if (c47377e.A09.A0D(i3) != Long.MIN_VALUE) {
            return null;
        }
        if (c47377e.A09.A0H(i3)) {
            return null;
        }
        int iA07 = c47377e.A09.A05(i3);
        if (!c47377e.A09.A0I(i3, iA07)) {
            return null;
        }
        return A03(timeline, c7320no.A04, i3, iA07, c47377e.A09.A0A(), c7320no.A03);
    }

    private C47347B A02(Timeline timeline, C7320no c7320no, long j, long j2) {
        timeline.A0J(c7320no.A04, this.A09);
        if (c7320no.A00()) {
            if (!this.A09.A0I(c7320no.A00, c7320no.A01)) {
                return null;
            }
            return A03(timeline, c7320no.A04, c7320no.A00, c7320no.A01, j, c7320no.A03);
        }
        return A04(timeline, c7320no.A04, j2, c7320no.A03);
    }

    private C47347B A03(Timeline timeline, Object obj, int i, int i2, long startPositionUs, long j) {
        long jA09;
        C7320no c7320no = new C7320no(obj, i, i2, j);
        boolean zA08 = A08(timeline, c7320no, Long.MIN_VALUE);
        boolean zA09 = A09(timeline, c7320no, zA08);
        long jA0E = timeline.A0J(c7320no.A04, this.A09).A0E(c7320no.A00, c7320no.A01);
        if (i2 == this.A09.A05(i)) {
            C7439pl c7439pl = this.A09;
            if (A0B[0].length() == 8) {
                throw new RuntimeException();
            }
            String[] strArr = A0B;
            strArr[6] = "btiW32P1CxlKUaykVb";
            strArr[4] = "aD0NnH";
            jA09 = c7439pl.A09();
        } else {
            jA09 = 0;
        }
        return new C47347B(c7320no, jA09, Long.MIN_VALUE, startPositionUs, jA0E, zA08, zA09);
    }

    private C47347B A04(Timeline timeline, Object obj, long j, long j2) {
        long jA0D;
        long jA0A;
        C7320no c7320no = new C7320no(obj, j2);
        timeline.A0J(c7320no.A04, this.A09);
        int iA07 = this.A09.A07(j);
        if (iA07 == -1) {
            jA0D = Long.MIN_VALUE;
        } else {
            C7439pl c7439pl = this.A09;
            String[] strArr = A0B;
            if (strArr[6].length() == strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0B;
            strArr2[6] = "hcjC8Oe5bspAHclLrN";
            strArr2[4] = "7U4c4Z";
            jA0D = c7439pl.A0D(iA07);
        }
        boolean isLastInTimeline = A08(timeline, c7320no, jA0D);
        boolean zA09 = A09(timeline, c7320no, isLastInTimeline);
        if (jA0D == Long.MIN_VALUE) {
            jA0A = this.A09.A0A();
        } else {
            jA0A = jA0D;
        }
        return new C47347B(c7320no, j, jA0D, -9223372036854775807L, jA0A, isLastInTimeline, zA09);
    }

    private C47347B A05(C47587Z c47587z) {
        return A02(c47587z.A03, c47587z.A05, c47587z.A01, c47587z.A02);
    }

    private boolean A07(Timeline timeline) {
        C47337A nextMediaPeriodHolder = A0D();
        if (nextMediaPeriodHolder == null) {
            return true;
        }
        int iA0A = timeline.A0A(nextMediaPeriodHolder.A08);
        if (A0B[3].length() != 26) {
            A0B[0] = "XXauRi";
            while (true) {
                iA0A = timeline.A09(iA0A, this.A09, this.A0A, this.A01, this.A08);
                while (lastValidPeriodHolder != null && !nextMediaPeriodHolder.A00.A07) {
                    nextMediaPeriodHolder = nextMediaPeriodHolder.A0I();
                }
                C47337A c47337aA0I = nextMediaPeriodHolder.A0I();
                if (iA0A == -1 || c47337aA0I == null || timeline.A0A(c47337aA0I.A08) != iA0A) {
                    boolean zA0S = A0S(nextMediaPeriodHolder);
                    String[] strArr = A0B;
                    if (strArr[5].length() != strArr[1].length()) {
                        nextMediaPeriodHolder.A00 = A0I(timeline, nextMediaPeriodHolder.A00);
                        if (!zA0S) {
                            return true;
                        }
                    } else {
                        String[] strArr2 = A0B;
                        strArr2[6] = "90zfs8gzmg4UDoZfId";
                        strArr2[4] = "a4jnrj";
                        nextMediaPeriodHolder.A00 = A0I(timeline, nextMediaPeriodHolder.A00);
                        if (!zA0S) {
                            return true;
                        }
                    }
                    return !A0N();
                }
                nextMediaPeriodHolder = c47337aA0I;
                if (A0B[7].charAt(7) != 'k') {
                    break;
                }
                A0B[2] = "Cr1P4n0WQ70sIc2hdXVlmIoPdJb3W1mn";
            }
        }
        throw new RuntimeException();
    }

    private boolean A08(Timeline timeline, C7320no c7320no, long j) {
        int adGroupCount = timeline.A0J(c7320no.A04, this.A09).A03();
        if (adGroupCount == 0) {
            return true;
        }
        int i = adGroupCount - 1;
        boolean zA00 = c7320no.A00();
        if (this.A09.A0D(i) != Long.MIN_VALUE) {
            return !zA00 && j == Long.MIN_VALUE;
        }
        int lastAdGroupIndex = this.A09.A04(i);
        if (lastAdGroupIndex == -1) {
            return false;
        }
        if (((zA00 && c7320no.A00 == i && c7320no.A01 == lastAdGroupIndex + (-1)) ? 1 : 0) == 0) {
            return !zA00 && this.A09.A05(i) == lastAdGroupIndex;
        }
        return true;
    }

    private boolean A09(Timeline timeline, C7320no c7320no, boolean z) {
        int iA0A = timeline.A0A(c7320no.A04);
        return !timeline.A0K(timeline.A0H(iA0A, this.A09).A00, this.A0A).A0D && timeline.A0O(iA0A, this.A09, this.A0A, this.A01, this.A08) && z;
    }

    private boolean A0A(C47337A c47337a, C47347B c47347b) {
        C47347B c47347b2 = c47337a.A00;
        return c47347b2.A03 == c47347b.A03 && c47347b2.A01 == c47347b.A01 && c47347b2.A04.equals(c47347b.A04);
    }

    public final C47337A A0B() {
        if (this.A05 != null) {
            if (this.A05 == this.A06) {
                C47337A c47337a = this.A05;
                if (A0B[3].length() == 26) {
                    throw new RuntimeException();
                }
                A0B[2] = "cSlSOVjTMxyZvCYIIsIM7Z4RVriFSMIi";
                this.A06 = c47337a.A0I();
            }
            this.A05.A0M();
            this.A05 = this.A05.A0I();
            this.A00--;
            if (this.A00 == 0) {
                this.A04 = null;
            }
        } else {
            this.A05 = this.A04;
            this.A06 = this.A04;
        }
        C47337A c47337a2 = this.A05;
        if (A0B[0].length() != 8) {
            A0B[7] = "hdbErrckm1X5j4dXkt1ObCB8O8NcABpS";
            return c47337a2;
        }
        A0B[3] = "prScRK6qkOjWt";
        return c47337a2;
    }

    public final C47337A A0C() {
        AbstractC45353y.A08((this.A06 == null || this.A06.A0I() == null) ? false : true);
        this.A06 = this.A06.A0I();
        return this.A06;
    }

    public final C47337A A0D() {
        return A0N() ? this.A05 : this.A04;
    }

    public final C47337A A0E() {
        return this.A04;
    }

    public final C47337A A0F() {
        return this.A05;
    }

    public final C47337A A0G() {
        return this.A06;
    }

    public final C47347B A0H(long j, C47587Z c47587z) {
        if (this.A04 == null) {
            return A05(c47587z);
        }
        return A01(c47587z.A03, this.A04, j);
    }

    public final InterfaceC7321np A0J(InterfaceC47747p[] interfaceC47747pArr, long j, AbstractC5195Ew abstractC5195Ew, InterfaceC5199F0 interfaceC5199F0, InterfaceC5072Cx interfaceC5072Cx, C47347B c47347b, C5196Ex c5196Ex) {
        long jA0B;
        if (this.A04 != null) {
            jA0B = this.A04.A0B() + this.A04.A00.A00;
        } else {
            jA0B = c47347b.A03 + j;
        }
        C47337A c47337a = new C47337A(interfaceC47747pArr, jA0B, abstractC5195Ew, interfaceC5199F0, interfaceC5072Cx, c47347b, c5196Ex);
        if (this.A04 != null) {
            AbstractC45353y.A08(A0N());
            this.A04.A0Q(c47337a);
        }
        this.A07 = null;
        this.A04 = c47337a;
        this.A00++;
        return c47337a.A07;
    }

    public final C7320no A0K(Timeline timeline, Object obj, long j) {
        return A06(timeline, obj, j, A00(timeline, obj), this.A09);
    }

    public final void A0L(long j) {
        if (this.A04 != null) {
            this.A04.A0P(j);
        }
    }

    public final void A0M(boolean z) {
        C47337A c47337aA0D = A0D();
        if (c47337aA0D != null) {
            this.A07 = z ? c47337aA0D.A08 : null;
            this.A03 = c47337aA0D.A00.A04.A03;
            c47337aA0D.A0M();
            A0S(c47337aA0D);
        } else if (!z) {
            this.A07 = null;
        }
        this.A05 = null;
        this.A04 = null;
        this.A06 = null;
        this.A00 = 0;
    }

    public final boolean A0N() {
        return this.A05 != null;
    }

    public final boolean A0O() {
        if (this.A04 != null) {
            if (!this.A04.A00.A05 && this.A04.A0R()) {
                long j = this.A04.A00.A00;
                if (A0B[2].charAt(6) == 'F') {
                    throw new RuntimeException();
                }
                A0B[3] = "WQJhcBpqvfFlde6mvMcdcISTeYvrM";
                if (j == -9223372036854775807L || this.A00 >= 100) {
                }
            }
            return false;
        }
        return true;
    }

    public final boolean A0P(Timeline timeline, int i) {
        this.A01 = i;
        return A07(timeline);
    }

    public final boolean A0Q(Timeline timeline, C7320no c7320no, long j) {
        int iA0A = timeline.A0A(c7320no.A04);
        C47337A c47337a = null;
        for (C47337A c47337aA0D = A0D(); c47337aA0D != null; c47337aA0D = c47337aA0D.A0I()) {
            if (c47337a == null) {
                c47337aA0D.A00 = A0I(timeline, c47337aA0D.A00);
            } else {
                if (iA0A != -1) {
                    boolean zEquals = c47337aA0D.A08.equals(timeline.A0M(iA0A));
                    if (A0B[3].length() == 26) {
                        throw new RuntimeException();
                    }
                    String[] strArr = A0B;
                    strArr[6] = "ytUDxXblB5dYuzkyb9";
                    strArr[4] = "n5GR8r";
                    if (zEquals) {
                        C47347B c47347bA01 = A01(timeline, c47337a, j);
                        if (c47347bA01 == null) {
                            return true ^ A0S(c47337a);
                        }
                        c47337aA0D.A00 = A0I(timeline, c47337aA0D.A00);
                        if (!A0A(c47337aA0D, c47347bA01)) {
                            return true ^ A0S(c47337a);
                        }
                    }
                }
                return true ^ A0S(c47337a);
            }
            if (c47337aA0D.A00.A07) {
                iA0A = timeline.A09(iA0A, this.A09, this.A0A, this.A01, this.A08);
            }
            c47337a = c47337aA0D;
        }
        return true;
    }

    public final boolean A0R(Timeline timeline, boolean z) {
        this.A08 = z;
        return A07(timeline);
    }

    public final boolean A0S(C47337A c47337a) {
        AbstractC45353y.A08(c47337a != null);
        boolean z = false;
        this.A04 = c47337a;
        while (c47337a.A0I() != null) {
            c47337a = c47337a.A0I();
            if (c47337a == this.A06) {
                this.A06 = this.A05;
                z = true;
            }
            c47337a.A0M();
            this.A00--;
        }
        this.A04.A0Q(null);
        return z;
    }

    public final boolean A0T(InterfaceC7321np interfaceC7321np) {
        return this.A04 != null && this.A04.A07 == interfaceC7321np;
    }
}
