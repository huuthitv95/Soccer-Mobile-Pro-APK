package com.fyber.inneractive.sdk.util;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.util.q */
/* JADX INFO: loaded from: classes4.dex */
public final class RejectedExecutionHandlerC9180q implements RejectedExecutionHandler {
    @Override // java.util.concurrent.RejectedExecutionHandler
    public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        IAlog.m21945a("rejectedExecution received for - %s", runnable);
    }
}
