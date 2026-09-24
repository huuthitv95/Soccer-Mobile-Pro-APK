package com.facebook.ads.redexgen.core;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.YS */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C6391YS {
    public static C6391YS A02;
    public final C5864Pp A00;
    public final C6393YU A01;

    public C6391YS(C6902gi c6902gi, Executor executor, C6117Tw c6117Tw) {
        this.A01 = new C6393YU(c6902gi);
        this.A00 = new C5864Pp(executor, c6117Tw, c6902gi);
    }

    private void A00() {
        this.A01.A03(this.A00);
    }

    public static void A01(C6902gi c6902gi, Executor executor, C6117Tw c6117Tw) {
        if (!C6171Up.A1c(c6902gi)) {
            return;
        }
        if (A02 == null) {
            A02 = new C6391YS(c6902gi, executor, c6117Tw);
            A02.A00();
        } else {
            A02.A02(c6117Tw);
        }
    }

    private void A02(C6117Tw c6117Tw) {
        this.A00.A07(c6117Tw);
    }
}
