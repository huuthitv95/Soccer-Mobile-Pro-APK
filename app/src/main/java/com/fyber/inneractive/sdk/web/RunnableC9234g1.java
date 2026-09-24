package com.fyber.inneractive.sdk.web;

import com.fyber.inneractive.sdk.measurement.tracker.AbstractC8280e;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.web.g1 */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC9234g1 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractC9240i1 f21559a;

    public RunnableC9234g1(AbstractC9240i1 abstractC9240i1) {
        this.f21559a = abstractC9240i1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC8280e abstractC8280e;
        AbstractC9240i1 abstractC9240i1 = this.f21559a;
        if (abstractC9240i1.f21621H == null || (abstractC8280e = abstractC9240i1.f21622I) == null) {
            return;
        }
        abstractC8280e.mo20682c();
    }
}
