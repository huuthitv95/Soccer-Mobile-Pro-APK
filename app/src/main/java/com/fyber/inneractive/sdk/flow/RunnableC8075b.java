package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.flow.b */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC8075b implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C8079d f17956a;

    public RunnableC8075b(C8079d c8079d) {
        this.f17956a = c8079d;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IAlog.m21945a("%s : ContentLoadTimeoutHandler Executing timeout task", IAlog.m21943a(this.f17956a));
        this.f17956a.f17973b.mo20549a();
    }
}
