package com.mbridge.msdk.config.component.common.network.connect.socket;

import com.mbridge.msdk.config.component.nori.monitor.C12832a;
import com.mbridge.msdk.foundation.tools.C13211m0;
import com.mbridge.msdk.foundation.tools.C13219q0;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: com.mbridge.msdk.config.component.common.network.connect.socket.c */
/* JADX INFO: compiled from: SocketThreadPoolManager.java */
/* JADX INFO: loaded from: classes5.dex */
public class C12763c {

    /* JADX INFO: renamed from: d */
    private static volatile C12763c f33969d;

    /* JADX INFO: renamed from: a */
    private final ConcurrentLinkedQueue<Runnable> f33970a = new ConcurrentLinkedQueue<>();

    /* JADX INFO: renamed from: b */
    private ThreadPoolExecutor f33971b;

    /* JADX INFO: renamed from: c */
    private final AtomicBoolean f33972c;

    /* JADX INFO: renamed from: com.mbridge.msdk.config.component.common.network.connect.socket.c$a */
    /* JADX INFO: compiled from: SocketThreadPoolManager.java */
    class a implements ThreadFactory {

        /* JADX INFO: renamed from: a */
        private final AtomicInteger f33973a = new AtomicInteger(1);

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, "Socket-Thread-" + this.f33973a.getAndIncrement());
            thread.setDaemon(true);
            return thread;
        }
    }

    private C12763c() {
        int iAvailableProcessors = (Runtime.getRuntime().availableProcessors() * 2) + 1;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(iAvailableProcessors, iAvailableProcessors, 10L, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new a(), new ThreadPoolExecutor.DiscardPolicy());
        this.f33971b = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f33972c = new AtomicBoolean(false);
    }

    /* JADX INFO: renamed from: a */
    public static C12763c m35145a() {
        if (f33969d == null) {
            synchronized (C12763c.class) {
                if (f33969d == null) {
                    f33969d = new C12763c();
                }
            }
        }
        return f33969d;
    }

    /* JADX INFO: renamed from: b */
    private boolean m35147b() {
        int iM37779x;
        try {
            int iM37747h = C13211m0.m37747h();
            return iM37747h > 0 && (iM37779x = C13211m0.m37779x()) > 0 && (((double) iM37747h) / ((double) iM37779x)) * 100.0d <= 5.0d;
        } catch (Exception e) {
            C13219q0.m37816b("SocketThreadPoolManager", "Memory check failed: " + e.getMessage());
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public /* synthetic */ void m35148c() {
        while (!this.f33970a.isEmpty()) {
            try {
                Runnable runnablePoll = this.f33970a.poll();
                if (runnablePoll != null) {
                    if ((runnablePoll instanceof RunnableC12762b) && ((RunnableC12762b) runnablePoll).m35144e() != null) {
                        ((RunnableC12762b) runnablePoll).m35144e().callStart();
                    }
                    runnablePoll.run();
                }
            } catch (Throwable th) {
                this.f33972c.set(false);
                if (!this.f33970a.isEmpty()) {
                    m35149d();
                }
                throw th;
            }
        }
        this.f33972c.set(false);
        if (this.f33970a.isEmpty()) {
            return;
        }
        m35149d();
    }

    /* JADX INFO: renamed from: d */
    private void m35149d() {
        if (this.f33972c.compareAndSet(false, true)) {
            this.f33971b.execute(new Runnable() { // from class: com.mbridge.msdk.config.component.common.network.connect.socket.c$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m35148c();
                }
            });
        }
    }

    /* JADX INFO: renamed from: a */
    public void m35150a(Runnable runnable, C12832a c12832a) {
        if (runnable == null) {
            return;
        }
        if (m35147b()) {
            if (c12832a != null) {
                c12832a.m35648a("Memory low");
            }
        } else if (this.f33970a.offer(runnable)) {
            if (c12832a != null) {
                c12832a.m35662m();
                m35146a(c12832a);
            }
            m35149d();
        }
    }

    /* JADX INFO: renamed from: a */
    private void m35146a(C12832a c12832a) {
        ThreadPoolExecutor threadPoolExecutor;
        if (c12832a == null || (threadPoolExecutor = this.f33971b) == null) {
            return;
        }
        c12832a.m35645a(threadPoolExecutor.getPoolSize(), this.f33971b.getActiveCount(), this.f33971b.getQueue().size());
    }
}
