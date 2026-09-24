package com.facebook.ads.redexgen.core;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.pJ */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C7412pJ implements InterfaceC45704X {
    public static final List<C7413pK> A01 = new ArrayList(50);
    public final Handler A00;

    public C7412pJ(Handler handler) {
        this.A00 = handler;
    }

    public static C7413pK A00() {
        C7413pK c7413pK;
        synchronized (A01) {
            c7413pK = A01.isEmpty() ? new C7413pK() : A01.remove(A01.size() - 1);
        }
        return c7413pK;
    }

    public static void A01(C7413pK c7413pK) {
        synchronized (A01) {
            if (A01.size() < 50) {
                A01.add(c7413pK);
            }
        }
    }

    public final boolean A03(Runnable runnable) {
        return this.A00.post(runnable);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC45704X
    public final Looper A8R() {
        return this.A00.getLooper();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC45704X
    public final boolean A9n(int i) {
        return this.A00.hasMessages(i);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC45704X
    public final C7413pK ACg(int i) {
        return A00().A01(this.A00.obtainMessage(i), this);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC45704X
    public final C7413pK ACh(int i, int i2, int i3) {
        return A00().A01(this.A00.obtainMessage(i, i2, i3), this);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC45704X
    public final C7413pK ACi(int i, int i2, int i3, Object obj) {
        return A00().A01(this.A00.obtainMessage(i, i2, i3, obj), this);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC45704X
    public final C7413pK ACj(int i, Object obj) {
        return A00().A01(this.A00.obtainMessage(i, obj), this);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC45704X
    public final void AIT(int i) {
        this.A00.removeMessages(i);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC45704X
    public final boolean AJA(int i) {
        return this.A00.sendEmptyMessage(i);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC45704X
    public final boolean AJB(int i, long j) {
        return this.A00.sendEmptyMessageAtTime(i, j);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC45704X
    public final boolean AJD(InterfaceC45694W interfaceC45694W) {
        return ((C7413pK) interfaceC45694W).A03(this.A00);
    }
}
