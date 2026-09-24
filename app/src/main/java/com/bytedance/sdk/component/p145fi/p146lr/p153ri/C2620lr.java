package com.bytedance.sdk.component.p145fi.p146lr.p153ri;

import com.unity3d.ads.BuildConfig;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.bytedance.sdk.component.fi.lr.ri.lr */
/* JADX INFO: loaded from: classes3.dex */
public class C2620lr {

    /* JADX INFO: renamed from: ri */
    private static final TimeUnit f7385ri = TimeUnit.SECONDS;

    /* JADX INFO: renamed from: ri */
    public static ExecutorService m9734ri() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 2, 30L, f7385ri, new LinkedBlockingQueue(), new ThreadFactoryC2621ri(BuildConfig.FLAVOR));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }
}
