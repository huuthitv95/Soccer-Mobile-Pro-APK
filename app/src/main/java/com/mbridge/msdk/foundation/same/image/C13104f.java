package com.mbridge.msdk.foundation.same.image;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.mbridge.msdk.foundation.same.image.f */
/* JADX INFO: compiled from: ImageLoaderController.java */
/* JADX INFO: loaded from: classes6.dex */
public class C13104f {

    /* JADX INFO: renamed from: a */
    private static ThreadPoolExecutor f35949a;

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.same.image.f$a */
    /* JADX INFO: compiled from: ImageLoaderController.java */
    class a implements ThreadFactory {
        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName("mb-image-loader-thread");
            return thread;
        }
    }

    /* JADX INFO: renamed from: a */
    private static ThreadFactory m37179a() {
        return new a();
    }

    /* JADX INFO: renamed from: b */
    public static ThreadPoolExecutor m37180b() {
        if (f35949a == null) {
            int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
            f35949a = new ThreadPoolExecutor(iAvailableProcessors, iAvailableProcessors, 10L, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), m37179a(), new ThreadPoolExecutor.DiscardPolicy());
        }
        f35949a.allowCoreThreadTimeOut(true);
        return f35949a;
    }
}
