package com.fyber.inneractive.sdk.config;

import java.util.Iterator;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.config.q */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC8025q implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C8040s f17808a;

    public RunnableC8025q(C8040s c8040s) {
        this.f17808a = c8040s;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C8040s c8040s = this.f17808a;
        Iterator it = c8040s.f17863c.iterator();
        while (it.hasNext()) {
            ((InterfaceC8027r) it.next()).onGlobalConfigChanged(c8040s, c8040s.f17862b);
        }
    }
}
