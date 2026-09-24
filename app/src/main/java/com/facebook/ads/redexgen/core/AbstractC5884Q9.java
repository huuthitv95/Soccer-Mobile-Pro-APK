package com.facebook.ads.redexgen.core;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Q9 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC5884Q9<T> extends AbstractRunnableC6279Wc {
    public final WeakReference<T> A00;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Q9 != com.facebook.ads.internal.util.common.WeakRunnable<T> */
    public AbstractC5884Q9(T reference) {
        this.A00 = new WeakReference<>(reference);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Q9 != com.facebook.ads.internal.util.common.WeakRunnable<T> */
    public final T A08() {
        return this.A00.get();
    }
}
