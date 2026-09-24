package com.facebook.ads.redexgen.core;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Wj */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC6286Wj {
    public static final AtomicReference<InterfaceC6285Wi> A00 = new AtomicReference<>(null);

    public static InterfaceC6285Wi A00() {
        InterfaceC6285Wi errorLogger = A00.get();
        if (errorLogger == null) {
            return new C5937R1();
        }
        return errorLogger;
    }

    public static void A01(InterfaceC6285Wi interfaceC6285Wi) {
        A00.set(interfaceC6285Wi);
    }
}
