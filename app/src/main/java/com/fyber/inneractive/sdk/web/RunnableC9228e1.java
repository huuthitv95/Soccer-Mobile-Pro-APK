package com.fyber.inneractive.sdk.web;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.web.e1 */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC9228e1 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractC9240i1 f21555a;

    public RunnableC9228e1(AbstractC9240i1 abstractC9240i1) {
        this.f21555a = abstractC9240i1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C9248m c9248m = this.f21555a.f21565b;
        if (c9248m != null) {
            c9248m.getViewTreeObserver().addOnPreDrawListener(this.f21555a.f21624K);
        }
    }
}
