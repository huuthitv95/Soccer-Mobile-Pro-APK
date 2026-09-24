package com.chartboost.sdk.impl;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.o2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3951o2 {

    /* JADX INFO: renamed from: a */
    public static final C3951o2 f15624a = new C3951o2();

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.o2$a */
    public static final class a implements ThreadFactory {

        /* JADX INFO: renamed from: a */
        public final String f15625a;

        /* JADX INFO: renamed from: b */
        public final AtomicInteger f15626b;

        public a(String prefix) {
            Intrinsics.checkNotNullParameter(prefix, "prefix");
            this.f15625a = prefix;
            this.f15626b = new AtomicInteger(1);
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable r) {
            Intrinsics.checkNotNullParameter(r, "r");
            return new Thread(r, this.f15625a + this.f15626b.getAndIncrement());
        }
    }

    /* JADX INFO: renamed from: a */
    public static final ExecutorService m18867a(int i, long j, TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i, i, j, timeUnit, new PriorityBlockingQueue());
        threadPoolExecutor.prestartAllCoreThreads();
        return threadPoolExecutor;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ ExecutorService m18868a(int i, long j, TimeUnit timeUnit, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            j = 10;
        }
        if ((i2 & 4) != 0) {
            timeUnit = TimeUnit.SECONDS;
        }
        return m18867a(i, j, timeUnit);
    }

    /* JADX INFO: renamed from: a */
    public static final ScheduledExecutorService m18869a(int i, String threadPrefix) {
        Intrinsics.checkNotNullParameter(threadPrefix, "threadPrefix");
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(i, new a(threadPrefix));
        scheduledThreadPoolExecutor.prestartAllCoreThreads();
        return scheduledThreadPoolExecutor;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ ScheduledExecutorService m18870a(int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 2;
        }
        if ((i2 & 2) != 0) {
            str = "CBAsync-";
        }
        return m18869a(i, str);
    }
}
