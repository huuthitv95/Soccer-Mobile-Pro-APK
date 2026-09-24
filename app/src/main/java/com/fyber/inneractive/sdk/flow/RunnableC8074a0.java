package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.flow.a0 */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC8074a0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractC8076b0 f17955a;

    public RunnableC8074a0(AbstractC8076b0 abstractC8076b0) {
        this.f17955a = abstractC8076b0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC8076b0 abstractC8076b0 = this.f17955a;
        abstractC8076b0.getClass();
        IAlog.m21945a("%sRe-enabling clicks, grace period has passed", IAlog.m21943a(abstractC8076b0));
        AbstractC8076b0 abstractC8076b1 = this.f17955a;
        abstractC8076b1.f17962f = true;
        abstractC8076b1.f17963g = null;
    }
}
