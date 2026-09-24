package com.facebook.ads.redexgen.core;

import android.widget.LinearLayout;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Wa */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC6277Wa extends LinearLayout {
    public static final AtomicBoolean A00 = new AtomicBoolean();
    public static final AtomicReference<InterfaceC6269WS> A01 = new AtomicReference<>();

    public static void A00(boolean z, InterfaceC6269WS interfaceC6269WS) {
        A00.set(z);
        A01.set(interfaceC6269WS);
    }
}
