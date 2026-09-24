package com.facebook.ads.redexgen.core;

import android.app.Activity;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.X0 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C6301X0 {
    public static final C6301X0 A04 = new C6301X0(new C5935Qz(), new C5931Qv());
    public final InterfaceC6300Wz A02;
    public final InterfaceC6363Y0 A03;
    public boolean A01 = true;
    public long A00 = -1;

    public C6301X0(InterfaceC6363Y0 interfaceC6363Y0, InterfaceC6300Wz interfaceC6300Wz) {
        this.A03 = interfaceC6363Y0;
        this.A02 = interfaceC6300Wz;
    }

    public static C6301X0 A00() {
        return A04;
    }

    public final synchronized void A01() {
        this.A01 = false;
        this.A00 = this.A03.A5n();
    }

    public final synchronized void A02() {
        this.A00 = -1L;
    }

    public final boolean A03() {
        Activity lastResumedActivity = this.A02.A8M();
        boolean z = true;
        if (lastResumedActivity != null) {
            return true;
        }
        synchronized (C6301X0.class) {
            if (this.A01) {
                return true;
            }
            if (this.A00 >= 0 && this.A03.A5n() - this.A00 >= 1000) {
                z = false;
            }
            return z;
        }
    }
}
