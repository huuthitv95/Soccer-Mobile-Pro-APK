package com.fyber.inneractive.sdk.renderers;

import com.fyber.inneractive.sdk.p278ui.controller.InterfaceC9124b;
import com.fyber.inneractive.sdk.player.controller.C8478s;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.renderers.p */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC9072p implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C9074r f21233a;

    public RunnableC9072p(C9074r c9074r) {
        this.f21233a = c9074r;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C9074r c9074r = this.f21233a;
        if (c9074r.f21243t != null) {
            c9074r.getClass();
            IAlog.m21945a("%sIdle state reached!", IAlog.m21943a(c9074r));
            InterfaceC9124b interfaceC9124b = this.f21233a.f21202k;
            if (interfaceC9124b != null) {
                ((C8478s) interfaceC9124b).m20916j(true);
            }
            this.f21233a.f21243t = null;
        }
    }
}
