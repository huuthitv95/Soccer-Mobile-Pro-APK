package com.mbridge.msdk.tracker;

import android.util.Log;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.mbridge.msdk.tracker.j */
/* JADX INFO: compiled from: ExecutorManager.java */
/* JADX INFO: loaded from: classes7.dex */
class C13823j {

    /* JADX INFO: renamed from: a */
    private volatile ThreadPoolExecutor f39400a;

    /* JADX INFO: renamed from: com.mbridge.msdk.tracker.j$a */
    /* JADX INFO: compiled from: ExecutorManager.java */
    class a implements ThreadFactory {
        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "MBridgeTrackThread");
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.tracker.j$b */
    /* JADX INFO: compiled from: ExecutorManager.java */
    private static final class b implements Runnable {

        /* JADX INFO: renamed from: a */
        private final Runnable f39402a;

        public b(Runnable runnable) {
            this.f39402a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C13882y.m41417b(this.f39402a)) {
                return;
            }
            try {
                this.f39402a.run();
            } catch (Exception e) {
                if (C13814a.f39370a) {
                    Log.e("TrackManager", "execute error", e);
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private ThreadPoolExecutor m41039a() {
        return new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new a(), new ThreadPoolExecutor.DiscardPolicy());
    }

    /* JADX INFO: renamed from: a */
    public void m41040a(Runnable runnable) {
        if (this.f39400a == null) {
            this.f39400a = m41039a();
        }
        if (this.f39400a.isShutdown()) {
            return;
        }
        this.f39400a.execute(new b(runnable));
    }
}
