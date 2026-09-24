package com.fyber.inneractive.sdk.player.controller;

import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Iterator;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.controller.l */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC8471l implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f18862a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC8476q f18863b;

    public RunnableC8471l(AbstractC8476q abstractC8476q, int i) {
        this.f18863b = abstractC8476q;
        this.f18862a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Iterator it = this.f18863b.f18869c.iterator();
            while (it.hasNext()) {
                ((InterfaceC8474o) it.next()).mo20900a(this.f18862a);
            }
        } catch (Exception e) {
            if (IAlog.f21426a <= 3) {
                AbstractC8476q abstractC8476q = this.f18863b;
                abstractC8476q.getClass();
                IAlog.m21944a("%sonPlayerProgress callback threw an exception!", e, IAlog.m21943a(abstractC8476q));
            }
        }
    }
}
