package com.fyber.inneractive.sdk.renderers;

import com.fyber.inneractive.sdk.flow.C8235w0;
import com.fyber.inneractive.sdk.flow.nativead.trackers.C8163a;
import com.fyber.inneractive.sdk.p278ui.controller.InterfaceC9125c;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.renderers.a0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9052a0 implements InterfaceC9125c {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C9056c0 f21183a;

    public C9052a0(C9056c0 c9056c0) {
        this.f21183a = c9056c0;
    }

    @Override // com.fyber.inneractive.sdk.p278ui.controller.InterfaceC9125c
    /* JADX INFO: renamed from: t */
    public final void mo20488t() {
        C9056c0 c9056c0 = this.f21183a;
        boolean z = c9056c0.f21187m;
        if (z) {
            return;
        }
        if (c9056c0.f17958b != null && !z) {
            c9056c0.f21187m = true;
            IAlog.m21945a("%sTracking impression", IAlog.m21943a(c9056c0));
            C8163a c8163a = new C8163a((C8235w0) c9056c0.f17958b);
            c9056c0.f21188n = c8163a;
            c8163a.m20575a(c9056c0);
        }
        c9056c0.m20475E();
    }
}
