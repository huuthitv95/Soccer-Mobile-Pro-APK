package com.facebook.ads.redexgen.core;

import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.Nullable;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.OP */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC5779OP {

    @Nullable
    public static HandlerC5778OO A00;
    public static final AtomicBoolean A01 = new AtomicBoolean();

    public static HandlerC5778OO A00(C6898ge c6898ge) {
        if (A00 == null) {
            A00 = new HandlerC5778OO(c6898ge);
        }
        return A00;
    }

    public static void A01(C6898ge c6898ge) {
        if (AbstractC6174Us.A0F(c6898ge)) {
            A03(c6898ge);
        }
    }

    public static void A02(C6898ge c6898ge) {
        if (AbstractC6174Us.A0E(c6898ge)) {
            A03(c6898ge);
        }
    }

    public static void A03(C6898ge c6898ge) {
        if (A01.compareAndSet(false, true)) {
            ExecutorC6367Y4.A01.execute(new C7001iN(c6898ge));
        }
    }
}
