package com.mbridge.msdk.config.component.load.downloader.core;

import java.util.concurrent.Future;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.mbridge.msdk.config.component.load.downloader.core.b */
/* JADX INFO: compiled from: DownloadExecutor.java */
/* JADX INFO: loaded from: classes5.dex */
public class C12791b extends ThreadPoolExecutor {
    C12791b(int i, ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
        super(i, i * 2, 15L, TimeUnit.MICROSECONDS, new PriorityBlockingQueue(), threadFactory, rejectedExecutionHandler);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public Future<?> submit(Runnable runnable) {
        C12792c c12792c = new C12792c((RunnableC12797h) runnable);
        execute(c12792c);
        return c12792c;
    }
}
