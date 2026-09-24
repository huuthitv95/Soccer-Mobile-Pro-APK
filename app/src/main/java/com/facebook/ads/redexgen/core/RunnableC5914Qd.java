package com.facebook.ads.redexgen.core;

import com.google.common.base.Ascii;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Qd */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class RunnableC5914Qd implements Runnable {
    public static Comparator<C5913Qc> A04;
    public static byte[] A05;
    public static String[] A06 = {"ZWObiMwNkhaZGfEgqHenCxQvRQCezgXM", "iKaB5ntiNbaiz6tgW", "JplxjEE1IYbCInXXNCkbxZV0", "UEoPOy6vCmPnpiXEMXmcZKvRtDoHf0nN", "JvUlYJe7lgtJoJN1gtwvhyIs", "RcG3r4ysor4dcgCWVGn8CFYsdgQ7jZkt", "cxmAjzJ", "EyohaYHYoMvb6y9gFGiucolIeU60NsdM"};
    public static final ThreadLocal<RunnableC5914Qd> A07;
    public long A00;
    public long A01;
    public ArrayList<C47457M> A02 = new ArrayList<>();
    public ArrayList<C5913Qc> A03 = new ArrayList<>();

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 104);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A05 = new byte[]{105, 109, Ascii.ESC, 117, 94, 72, 79, 94, 95, Ascii.ESC, 107, 73, 94, 93, 94, 79, 88, 83, 100, 96, Ascii.SYN, 102, 68, 83, 80, 83, 66, 85, 94};
    }

    static {
        A03();
        A07 = new ThreadLocal<>();
        A04 = new C5912Qb();
    }

    private AbstractC5956RK A00(C47457M c47457m, int i, long j) {
        if (A08(c47457m, i)) {
            return null;
        }
        C5946RA c5946ra = c47457m.A0r;
        try {
            c47457m.A1M();
            AbstractC5956RK abstractC5956RKA0I = c5946ra.A0I(i, false, j);
            if (abstractC5956RKA0I != null) {
                if (abstractC5956RKA0I.A0e() && !abstractC5956RKA0I.A0f()) {
                    c5946ra.A0T(abstractC5956RKA0I.A0H);
                } else {
                    c5946ra.A0Z(abstractC5956RKA0I, false);
                }
            }
            return abstractC5956RKA0I;
        } finally {
            c47457m.A1o(false);
        }
    }

    private void A02() {
        C5913Qc c5913Qc;
        int size = this.A02.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            C47457M c47457m = this.A02.get(i2);
            int viewCount = c47457m.getWindowVisibility();
            if (viewCount == 0) {
                c47457m.A02.A04(c47457m, false);
                int viewCount2 = c47457m.A02.A00;
                i += viewCount2;
            }
        }
        this.A03.ensureCapacity(i);
        int j = 0;
        for (int i3 = 0; i3 < size; i3++) {
            C47457M c47457m2 = this.A02.get(i3);
            int viewCount3 = c47457m2.getWindowVisibility();
            if (viewCount3 == 0) {
                C6973hs c6973hs = c47457m2.A02;
                int viewCount4 = c6973hs.A01;
                int i4 = Math.abs(viewCount4);
                int viewCount5 = c6973hs.A02;
                int i5 = i4 + Math.abs(viewCount5);
                for (int i6 = 0; i6 < viewCount * 2; i6 += 2) {
                    int viewCount6 = this.A03.size();
                    if (j >= viewCount6) {
                        c5913Qc = new C5913Qc();
                        this.A03.add(c5913Qc);
                    } else {
                        c5913Qc = this.A03.get(j);
                    }
                    int totalTaskCount = i6 + 1;
                    int totalTaskIndex = c6973hs.A03[totalTaskCount];
                    c5913Qc.A04 = totalTaskIndex <= i5;
                    c5913Qc.A02 = i5;
                    c5913Qc.A00 = totalTaskIndex;
                    c5913Qc.A03 = c47457m2;
                    int totalTaskCount2 = c6973hs.A03[i6];
                    c5913Qc.A01 = totalTaskCount2;
                    j++;
                }
            }
        }
        Collections.sort(this.A03, A04);
    }

    private void A04(long j) {
        for (int i = 0; i < i; i++) {
            C5913Qc c5913Qc = this.A03.get(i);
            if (A06[7].charAt(15) != 'g') {
                throw new RuntimeException();
            }
            A06[6] = "gpZ2KV2";
            C5913Qc c5913Qc2 = c5913Qc;
            if (c5913Qc2.A03 == null) {
                return;
            }
            A06(c5913Qc2, j);
            c5913Qc2.A00();
        }
    }

    private final void A05(long j) {
        A02();
        A04(j);
    }

    private void A06(C5913Qc c5913Qc, long j) {
        AbstractC5956RK abstractC5956RKA00 = A00(c5913Qc.A03, c5913Qc.A01, c5913Qc.A04 ? Long.MAX_VALUE : j);
        if (abstractC5956RKA00 != null && abstractC5956RKA00.A09 != null && abstractC5956RKA00.A0e() && !abstractC5956RKA00.A0f()) {
            C47457M c47457m = abstractC5956RKA00.A09.get();
            if (A06[3].charAt(4) != 'O') {
                throw new RuntimeException();
            }
            String[] strArr = A06;
            strArr[0] = "y01bdO2VJYUoPT1JEr7HCeGbjhjinZRt";
            strArr[5] = "ogbTL45N3M3fzw26YptkCantwmvhDLLM";
            A07(c47457m, j);
        }
    }

    private void A07(C47457M c47457m, long j) {
        if (c47457m == null) {
            return;
        }
        if (c47457m.A0C && c47457m.A01.A06() != 0) {
            c47457m.A1P();
        }
        C6973hs c6973hs = c47457m.A02;
        c6973hs.A04(c47457m, true);
        if (c6973hs.A00 != 0) {
            try {
                AbstractC5820P4.A01(A01(0, 18, 83));
                c47457m.A0s.A05(c47457m.A04);
                for (int i = 0; i < c6973hs.A00 * 2; i += 2) {
                    A00(c47457m, c6973hs.A03[i], j);
                }
                AbstractC5820P4.A00();
            } catch (Throwable th) {
                AbstractC5820P4.A00();
                throw th;
            }
        }
    }

    public static boolean A08(C47457M c47457m, int i) {
        int iA06 = c47457m.A01.A06();
        for (int i2 = 0; i2 < iA06; i2++) {
            AbstractC5956RK abstractC5956RKA0F = C47457M.A0F(c47457m.A01.A0A(i2));
            int childCount = abstractC5956RKA0F.A03;
            if (childCount == i && !abstractC5956RKA0F.A0f()) {
                return true;
            }
        }
        return false;
    }

    public final void A09(C47457M c47457m) {
        this.A02.add(c47457m);
    }

    public final void A0A(C47457M c47457m) {
        this.A02.remove(c47457m);
    }

    public final void A0B(C47457M c47457m, int i, int i2) {
        if (c47457m.isAttachedToWindow()) {
            long j = this.A01;
            String[] strArr = A06;
            if (strArr[0].charAt(20) != strArr[5].charAt(20)) {
                throw new RuntimeException();
            }
            A06[6] = "T8Y6UBY";
            if (j == 0) {
                this.A01 = c47457m.getNanoTime();
                c47457m.post(this);
            }
        }
        c47457m.A02.A03(i, i2);
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            AbstractC5820P4.A01(A01(18, 11, 94));
            if (this.A02.isEmpty()) {
                this.A01 = 0L;
                if (A06[6].length() != 7) {
                    throw new RuntimeException();
                }
                A06[7] = "jOxF3Mzmcdx8L8GgZmI4I6pGAsyGGZV3";
                AbstractC5820P4.A00();
                return;
            }
            int size = this.A02.size();
            long jMax = 0;
            for (int i = 0; i < size; i++) {
                C47457M c47457m = this.A02.get(i);
                if (c47457m.getWindowVisibility() == 0) {
                    jMax = Math.max(c47457m.getDrawingTime(), jMax);
                }
            }
            if (jMax == 0) {
                this.A01 = 0L;
                AbstractC5820P4.A00();
            } else {
                A05(TimeUnit.MILLISECONDS.toNanos(jMax) + this.A00);
                this.A01 = 0L;
                AbstractC5820P4.A00();
            }
        } catch (Throwable th) {
            this.A01 = 0L;
            AbstractC5820P4.A00();
            throw th;
        }
    }
}
