package com.digitalturbine.ignite.authenticator.utils.concurency;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.digitalturbine.ignite.authenticator.utils.concurency.c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4265c {

    /* JADX INFO: renamed from: a */
    public static final ThreadPoolExecutor f17351a;

    /* JADX INFO: renamed from: b */
    public static final Handler f17352b = new Handler(Looper.getMainLooper());

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 2, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(5), new ThreadFactoryC4263a(), new RejectedExecutionHandlerC4264b());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f17351a = threadPoolExecutor;
    }
}
