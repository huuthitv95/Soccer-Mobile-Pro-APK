package com.fyber.inneractive.sdk.renderers;

import com.fyber.inneractive.sdk.flow.C8235w0;
import com.fyber.inneractive.sdk.flow.nativead.trackers.C8163a;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.renderers.b0 */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC9054b0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C9056c0 f21185a;

    public RunnableC9054b0(C9056c0 c9056c0) {
        this.f21185a = c9056c0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C9056c0 c9056c0 = this.f21185a;
        if (c9056c0.f17958b != null && !c9056c0.f21187m) {
            c9056c0.f21187m = true;
            IAlog.m21945a("%sTracking impression", IAlog.m21943a(c9056c0));
            C8163a c8163a = new C8163a((C8235w0) c9056c0.f17958b);
            c9056c0.f21188n = c8163a;
            c8163a.m20575a(c9056c0);
        }
        c9056c0.m20475E();
    }
}
