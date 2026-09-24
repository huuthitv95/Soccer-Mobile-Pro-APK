package com.facebook.ads.redexgen.core;

import android.util.SparseArray;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.R9 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C5945R9 {
    public SparseArray<C5944R8> A00 = new SparseArray<>();
    public int A01 = 0;

    private final long A00(long j, long j2) {
        if (j == 0) {
            return j2;
        }
        return ((j / 4) * 3) + (j2 / 4);
    }

    private C5944R8 A01(int i) {
        C5944R8 c5944r8 = this.A00.get(i);
        if (c5944r8 == null) {
            C5944R8 c5944r9 = new C5944R8();
            this.A00.put(i, c5944r9);
            return c5944r9;
        }
        return c5944r8;
    }

    private final void A02() {
        for (int i = 0; i < i; i++) {
            this.A00.valueAt(i).A03.clear();
        }
    }

    public final AbstractC5956RK A03(int i) {
        C5944R8 c5944r8 = this.A00.get(i);
        if (c5944r8 != null && !c5944r8.A03.isEmpty()) {
            ArrayList<AbstractC5956RK> arrayList = c5944r8.A03;
            return arrayList.remove(arrayList.size() - 1);
        }
        return null;
    }

    public final void A04() {
        this.A01--;
    }

    public final void A05(int i, long j) {
        C5944R8 c5944r8A01 = A01(i);
        c5944r8A01.A01 = A00(c5944r8A01.A01, j);
    }

    public final void A06(int i, long j) {
        C5944R8 c5944r8A01 = A01(i);
        c5944r8A01.A02 = A00(c5944r8A01.A02, j);
    }

    public final void A07(AbstractC5926Qq abstractC5926Qq) {
        this.A01++;
    }

    public final void A08(AbstractC5926Qq abstractC5926Qq, AbstractC5926Qq abstractC5926Qq2, boolean z) {
        if (abstractC5926Qq != null) {
            A04();
        }
        if (!z && this.A01 == 0) {
            A02();
        }
        if (abstractC5926Qq2 != null) {
            A07(abstractC5926Qq2);
        }
    }

    public final void A09(AbstractC5956RK abstractC5956RK) {
        int iA0N = abstractC5956RK.A0N();
        ArrayList<AbstractC5956RK> arrayList = A01(iA0N).A03;
        int i = this.A00.get(iA0N).A00;
        int viewType = arrayList.size();
        if (i <= viewType) {
            return;
        }
        abstractC5956RK.A0W();
        arrayList.add(abstractC5956RK);
    }

    public final boolean A0A(int i, long j, long j2) {
        long j3 = A01(i).A01;
        return j3 == 0 || j + j3 < j2;
    }

    public final boolean A0B(int i, long j, long j2) {
        long j3 = A01(i).A02;
        return j3 == 0 || j + j3 < j2;
    }
}
