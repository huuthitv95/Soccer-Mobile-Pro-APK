package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.util.AbstractC9183r;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.flow.c */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC8077c implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C8079d f17967a;

    public RunnableC8077c(C8079d c8079d) {
        this.f17967a = c8079d;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC9183r.f21478b.post(this.f17967a.f17974c);
    }
}
