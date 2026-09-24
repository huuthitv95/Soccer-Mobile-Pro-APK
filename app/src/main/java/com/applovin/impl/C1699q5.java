package com.applovin.impl;

import com.applovin.impl.sdk.C1748l;

/* JADX INFO: renamed from: com.applovin.impl.q5 */
/* JADX INFO: loaded from: classes3.dex */
public class C1699q5 extends AbstractRunnableC1601k5 {

    /* JADX INFO: renamed from: g */
    private final a f2657g;

    /* JADX INFO: renamed from: com.applovin.impl.q5$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo4013a(AbstractC1790v.a aVar);
    }

    public C1699q5(C1748l c1748l, a aVar) {
        super("TaskCollectAdvertisingId", c1748l, true);
        this.f2657g = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f2657g.mo4013a(this.f1969a.m4759B().m4945f());
    }
}
