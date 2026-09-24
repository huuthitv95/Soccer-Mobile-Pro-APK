package com.fyber.inneractive.sdk.player.controller;

import com.fyber.inneractive.sdk.player.mediaplayer.C8868o;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Iterator;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.controller.j */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC8469j implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Exception f18858a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC8476q f18859b;

    public RunnableC8469j(AbstractC8476q abstractC8476q, C8868o c8868o) {
        this.f18859b = abstractC8476q;
        this.f18858a = c8868o;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC8476q abstractC8476q = this.f18859b;
        if (abstractC8476q.f18873g) {
            return;
        }
        try {
            Iterator it = abstractC8476q.f18868b.iterator();
            while (it.hasNext()) {
                ((InterfaceC8475p) it.next()).mo20902a((C8868o) this.f18858a);
            }
        } catch (Exception e) {
            if (IAlog.f21426a <= 3) {
                AbstractC8476q abstractC8476q2 = this.f18859b;
                abstractC8476q2.getClass();
                IAlog.m21944a("%sonPlayerError callback threw an exception!", e, IAlog.m21943a(abstractC8476q2));
            }
        }
    }
}
