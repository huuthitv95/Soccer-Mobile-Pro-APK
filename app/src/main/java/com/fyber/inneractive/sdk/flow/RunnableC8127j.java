package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.flow.j */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC8127j implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractC8129k f18088a;

    public RunnableC8127j(AbstractC8129k abstractC8129k) {
        this.f18088a = abstractC8129k;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC8129k abstractC8129k = this.f18088a;
        abstractC8129k.getClass();
        IAlog.m21945a("%s : IAAdContentLoaderImpl : retry load ad task started execution", IAlog.m21943a(abstractC8129k));
        this.f18088a.mo20551b();
    }
}
