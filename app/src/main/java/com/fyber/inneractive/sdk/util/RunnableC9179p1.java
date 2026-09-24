package com.fyber.inneractive.sdk.util;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.util.p1 */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC9179p1 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C9188s1 f21474a;

    public RunnableC9179p1(C9188s1 c9188s1) {
        this.f21474a = c9188s1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C9188s1 c9188s1 = this.f21474a;
        c9188s1.getClass();
        AbstractC9183r.f21477a.execute(new RunnableC9185r1(c9188s1));
    }
}
