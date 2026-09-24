package com.ironsource.mediationsdk.logger;

/* JADX INFO: renamed from: com.ironsource.mediationsdk.logger.c */
/* JADX INFO: loaded from: classes6.dex */
public class C12362c implements Thread.UncaughtExceptionHandler {
    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "Thread name =" + thread.getName(), th);
    }
}
