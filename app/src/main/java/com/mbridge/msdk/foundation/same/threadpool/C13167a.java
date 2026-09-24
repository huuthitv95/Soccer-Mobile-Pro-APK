package com.mbridge.msdk.foundation.same.threadpool;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.mbridge.msdk.foundation.same.threadpool.a */
/* JADX INFO: compiled from: ThreadPoolUtils.java */
/* JADX INFO: loaded from: classes6.dex */
public class C13167a {

    /* JADX INFO: renamed from: a */
    public static ThreadPoolExecutor f36203a;

    /* JADX INFO: renamed from: b */
    private static ThreadPoolExecutor f36204b;

    /* JADX INFO: renamed from: c */
    private static Handler f36205c;

    /* JADX INFO: renamed from: d */
    private static ThreadPoolExecutor f36206d;

    /* JADX INFO: renamed from: e */
    private static ThreadPoolExecutor f36207e;

    /* JADX INFO: renamed from: f */
    private static ThreadPoolExecutor f36208f;

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.same.threadpool.a$a */
    /* JADX INFO: compiled from: ThreadPoolUtils.java */
    class a implements ThreadFactory {
        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread threadNewThread = Executors.defaultThreadFactory().newThread(runnable);
            threadNewThread.setName("BitmapThreadPool");
            return threadNewThread;
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.same.threadpool.a$b */
    /* JADX INFO: compiled from: ThreadPoolUtils.java */
    class b implements ThreadFactory {
        b() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread threadNewThread = Executors.defaultThreadFactory().newThread(runnable);
            threadNewThread.setName("CommonThreadPool");
            return threadNewThread;
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.same.threadpool.a$c */
    /* JADX INFO: compiled from: ThreadPoolUtils.java */
    class c implements ThreadFactory {
        c() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread threadNewThread = Executors.defaultThreadFactory().newThread(runnable);
            threadNewThread.setName("NwtThreadPool");
            return threadNewThread;
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.same.threadpool.a$d */
    /* JADX INFO: compiled from: ThreadPoolUtils.java */
    class d implements ThreadFactory {
        d() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread threadNewThread = Executors.defaultThreadFactory().newThread(runnable);
            threadNewThread.setName("ReportThreadPool");
            return threadNewThread;
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.same.threadpool.a$e */
    /* JADX INFO: compiled from: ThreadPoolUtils.java */
    class e implements ThreadFactory {
        e() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName("rv-load-tread");
            return thread;
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.same.threadpool.a$f */
    /* JADX INFO: compiled from: ThreadPoolUtils.java */
    private static class f extends Handler {
        public f() {
            super(Looper.getMainLooper());
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
        }
    }

    /* JADX INFO: renamed from: a */
    public static ThreadPoolExecutor m37542a() {
        if (f36204b == null) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 5, 10L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(10), new a(), new ThreadPoolExecutor.DiscardPolicy());
            f36204b = threadPoolExecutor;
            threadPoolExecutor.allowCoreThreadTimeOut(true);
        }
        return f36204b;
    }

    /* JADX INFO: renamed from: b */
    public static ThreadPoolExecutor m37543b() {
        if (f36203a == null) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 25, 10L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(100), new b(), new ThreadPoolExecutor.DiscardPolicy());
            f36203a = threadPoolExecutor;
            threadPoolExecutor.allowCoreThreadTimeOut(true);
        }
        return f36203a;
    }

    /* JADX INFO: renamed from: c */
    public static Handler m37544c() {
        if (f36205c == null) {
            f36205c = new f();
        }
        return f36205c;
    }

    /* JADX INFO: renamed from: d */
    public static ThreadPoolExecutor m37545d() {
        if (f36206d == null) {
            f36206d = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(1), new c(), new ThreadPoolExecutor.DiscardPolicy());
        }
        return f36206d;
    }

    /* JADX INFO: renamed from: e */
    public static ThreadPoolExecutor m37546e() {
        if (f36207e == null) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 15, 10L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(100), new d(), new ThreadPoolExecutor.DiscardPolicy());
            f36207e = threadPoolExecutor;
            threadPoolExecutor.allowCoreThreadTimeOut(true);
        }
        return f36207e;
    }

    /* JADX INFO: renamed from: f */
    public static ThreadPoolExecutor m37547f() {
        if (f36208f == null) {
            e eVar = new e();
            int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(iAvailableProcessors, iAvailableProcessors * 2, 10L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(30), eVar, new ThreadPoolExecutor.DiscardPolicy());
            f36208f = threadPoolExecutor;
            threadPoolExecutor.allowCoreThreadTimeOut(true);
        }
        return f36208f;
    }
}
