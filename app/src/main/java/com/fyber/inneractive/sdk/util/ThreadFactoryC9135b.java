package com.fyber.inneractive.sdk.util;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.util.b */
/* JADX INFO: loaded from: classes4.dex */
public final class ThreadFactoryC9135b implements ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable);
        thread.setDaemon(true);
        return thread;
    }
}
