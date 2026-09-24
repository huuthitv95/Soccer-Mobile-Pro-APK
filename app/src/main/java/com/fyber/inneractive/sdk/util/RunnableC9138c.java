package com.fyber.inneractive.sdk.util;

import com.fyber.inneractive.sdk.web.C9226e;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.util.c */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC9138c implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object[] f21439a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C9226e f21440b;

    public RunnableC9138c(C9226e c9226e) {
        this.f21440b = c9226e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f21440b.getClass();
        C9226e c9226e = this.f21440b;
        boolean z = c9226e.f21545f;
        if (z) {
            return;
        }
        RunnableC9141d runnableC9141d = new RunnableC9141d(c9226e);
        c9226e.f21543d = runnableC9141d;
        if (z) {
            return;
        }
        try {
            c9226e.f21540a.execute(runnableC9141d);
        } catch (NullPointerException e) {
            IAlog.m21950f("AsyncTaskExecutor : execute(): Unable to execute the null task: %s", e.getMessage());
        } catch (RejectedExecutionException e2) {
            IAlog.m21950f("AsyncTaskExecutor : execute(): Unable to execute the task: %s", e2.getMessage());
        }
    }
}
