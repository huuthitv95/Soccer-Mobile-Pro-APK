package com.fyber.inneractive.sdk.web;

import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.web.s */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC9263s implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractC9239i0 f21666a;

    public RunnableC9263s(AbstractC9239i0 abstractC9239i0) {
        this.f21666a = abstractC9239i0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            AbstractC9239i0 abstractC9239i0 = this.f21666a;
            if (abstractC9239i0.f21593V != null) {
                abstractC9239i0.getClass();
                IAlog.m21945a("%sunregistering orientation broadcast receiver", IAlog.m21943a(abstractC9239i0));
                this.f21666a.f21593V.m22053a();
            }
        } catch (IllegalArgumentException e) {
            if (e.getMessage() != null && !e.getMessage().contains("Receiver not registered")) {
                throw e;
            }
        }
        this.f21666a.f21593V = null;
    }
}
