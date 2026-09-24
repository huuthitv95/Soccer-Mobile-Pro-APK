package com.applovin.impl;

import com.applovin.impl.sdk.C1748l;

/* JADX INFO: renamed from: com.applovin.impl.u6 */
/* JADX INFO: loaded from: classes3.dex */
public class C1788u6 extends AbstractRunnableC1601k5 {

    /* JADX INFO: renamed from: g */
    private final Runnable f3428g;

    public C1788u6(C1748l c1748l, String str, Runnable runnable) {
        this(c1748l, false, str, runnable);
    }

    public C1788u6(C1748l c1748l, boolean z, String str, Runnable runnable) {
        super("TaskRunnable:" + str, c1748l, z);
        this.f3428g = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f3428g.run();
    }
}
