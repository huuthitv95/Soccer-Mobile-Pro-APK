package com.fyber.inneractive.sdk.network;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.network.n1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8399n1 {

    /* JADX INFO: renamed from: a */
    public final WeakReference f18686a;

    /* JADX INFO: renamed from: b */
    public final WeakReference f18687b;

    /* JADX INFO: renamed from: c */
    public final int f18688c;

    /* JADX INFO: renamed from: d */
    public final RunnableC8396m1 f18689d = new RunnableC8396m1(this);

    public C8399n1(AbstractC8416t0 abstractC8416t0, Thread thread, int i) {
        this.f18687b = new WeakReference(abstractC8416t0);
        this.f18686a = new WeakReference(thread);
        this.f18688c = i;
    }
}
