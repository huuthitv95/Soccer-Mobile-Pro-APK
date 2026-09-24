package com.fyber.inneractive.sdk.player.controller;

import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Iterator;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.controller.n */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC8473n implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractC8476q f18866a;

    public RunnableC8473n(AbstractC8476q abstractC8476q) {
        this.f18866a = abstractC8476q;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Iterator it = this.f18866a.f18868b.iterator();
            while (it.hasNext()) {
                ((InterfaceC8475p) it.next()).mo20904d();
            }
        } catch (Exception e) {
            if (IAlog.f21426a <= 3) {
                AbstractC8476q abstractC8476q = this.f18866a;
                abstractC8476q.getClass();
                IAlog.m21944a("%sonDrawnToSurface callback threw an exception!", e, IAlog.m21943a(abstractC8476q));
            }
        }
    }
}
