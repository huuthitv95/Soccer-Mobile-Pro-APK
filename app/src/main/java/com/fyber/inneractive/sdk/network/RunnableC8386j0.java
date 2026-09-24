package com.fyber.inneractive.sdk.network;

import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.network.j0 */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC8386j0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractC8416t0 f18662a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C8392l0 f18663b;

    public RunnableC8386j0(C8392l0 c8392l0, AbstractC8416t0 abstractC8416t0) {
        this.f18663b = c8392l0;
        this.f18662a = abstractC8416t0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IAlog.m21949e("retryNetworkRequest pre-execute - %s", this.f18662a.getClass().getName());
        this.f18663b.m20768a(this.f18662a);
    }
}
