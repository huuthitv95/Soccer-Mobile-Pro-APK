package com.fyber.inneractive.sdk.util;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.util.r */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC9183r {

    /* JADX INFO: renamed from: a */
    public static final ThreadPoolExecutor f21477a;

    /* JADX INFO: renamed from: b */
    public static final Handler f21478b = new Handler(Looper.getMainLooper());

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 4, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(32), new ThreadFactoryC9177p(), new RejectedExecutionHandlerC9180q());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f21477a = threadPoolExecutor;
    }
}
