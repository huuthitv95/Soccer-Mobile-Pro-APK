package com.fyber.inneractive.sdk.web;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.web.a1 */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC9216a1 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C9219b1 f21522a;

    public RunnableC9216a1(C9219b1 c9219b1) {
        this.f21522a = c9219b1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f21522a.f21526a.evictAll();
        } catch (Throwable unused) {
        }
    }
}
