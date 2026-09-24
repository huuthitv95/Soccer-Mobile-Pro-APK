package com.fyber.inneractive.sdk.web;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.web.s0 */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC9264s0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C9270v0 f21667a;

    public RunnableC9264s0(C9270v0 c9270v0) {
        this.f21667a = c9270v0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f21667a.f21697u.compareAndSet(false, true)) {
            this.f21667a.m22091d("onCancelResult(true);");
            this.f21667a.f21698v.set(false);
        }
    }
}
