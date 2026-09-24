package com.mbridge.msdk.tracker.network;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: com.mbridge.msdk.tracker.network.u */
/* JADX INFO: compiled from: RequestQueue.java */
/* JADX INFO: loaded from: classes7.dex */
public class C13866u {

    /* JADX INFO: renamed from: a */
    private volatile ThreadPoolExecutor f39578a;

    /* JADX INFO: renamed from: e */
    private final int f39582e;

    /* JADX INFO: renamed from: f */
    private final InterfaceC13830b f39583f;

    /* JADX INFO: renamed from: g */
    private final InterfaceC13843m f39584g;

    /* JADX INFO: renamed from: h */
    private final InterfaceC13868w f39585h;

    /* JADX INFO: renamed from: b */
    private final AtomicInteger f39579b = new AtomicInteger();

    /* JADX INFO: renamed from: c */
    private final Set<AbstractC13850t<?>> f39580c = new HashSet();

    /* JADX INFO: renamed from: d */
    private final PriorityBlockingQueue<AbstractC13850t<?>> f39581d = new PriorityBlockingQueue<>();

    /* JADX INFO: renamed from: i */
    private final List<c> f39586i = new ArrayList();

    /* JADX INFO: renamed from: j */
    private boolean f39587j = false;

    /* JADX INFO: renamed from: com.mbridge.msdk.tracker.network.u$a */
    /* JADX INFO: compiled from: RequestQueue.java */
    class a implements ThreadFactory {
        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "NetworkDispatcher");
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.tracker.network.u$b */
    /* JADX INFO: compiled from: RequestQueue.java */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                new RunnableC13844n(C13866u.this.f39581d, C13866u.this.f39584g, C13866u.this.f39583f, C13866u.this.f39585h).run();
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.tracker.network.u$c */
    /* JADX INFO: compiled from: RequestQueue.java */
    public interface c {
        /* JADX INFO: renamed from: a */
        void m41333a(AbstractC13850t<?> abstractC13850t, int i);
    }

    public C13866u(InterfaceC13843m interfaceC13843m, InterfaceC13868w interfaceC13868w, int i, InterfaceC13830b interfaceC13830b) {
        this.f39582e = i;
        this.f39583f = interfaceC13830b;
        this.f39584g = interfaceC13843m;
        this.f39585h = interfaceC13868w;
    }

    /* JADX INFO: renamed from: a */
    private void m41321a(int i) {
        if (this.f39578a != null) {
            return;
        }
        try {
            m41323b(i);
        } catch (Throwable unused) {
            try {
                m41323b(5);
            } catch (Exception unused2) {
                this.f39578a = null;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private void m41323b(int i) {
        this.f39578a = new ThreadPoolExecutor(i, i, 100L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new a(), new ThreadPoolExecutor.DiscardPolicy());
    }

    /* JADX INFO: renamed from: a */
    public int m41326a() {
        return this.f39579b.incrementAndGet();
    }

    /* JADX INFO: renamed from: a */
    public <T> AbstractC13850t<T> m41327a(AbstractC13850t<T> abstractC13850t) {
        abstractC13850t.m41217a(this);
        synchronized (this.f39580c) {
            this.f39580c.add(abstractC13850t);
        }
        abstractC13850t.m41226b(m41326a());
        abstractC13850t.m41224a("add-to-queue");
        m41328a(abstractC13850t, 0);
        m41330b(abstractC13850t);
        if (this.f39578a == null) {
            m41321a(this.f39582e);
        }
        if (!this.f39578a.isShutdown()) {
            this.f39578a.execute(new b());
        }
        return abstractC13850t;
    }

    /* JADX INFO: renamed from: a */
    void m41328a(AbstractC13850t<?> abstractC13850t, int i) {
        synchronized (this.f39586i) {
            Iterator<c> it = this.f39586i.iterator();
            while (it.hasNext()) {
                it.next().m41333a(abstractC13850t, i);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m41329b() {
        if (!this.f39587j || this.f39578a == null) {
            m41321a(this.f39582e);
            this.f39587j = true;
        }
    }

    /* JADX INFO: renamed from: b */
    <T> void m41330b(AbstractC13850t<T> abstractC13850t) {
        m41332d(abstractC13850t);
    }

    /* JADX INFO: renamed from: c */
    <T> void m41331c(AbstractC13850t<T> abstractC13850t) {
        synchronized (this.f39580c) {
            this.f39580c.remove(abstractC13850t);
        }
        m41328a(abstractC13850t, 5);
    }

    /* JADX INFO: renamed from: d */
    <T> void m41332d(AbstractC13850t<T> abstractC13850t) {
        this.f39581d.add(abstractC13850t);
    }
}
