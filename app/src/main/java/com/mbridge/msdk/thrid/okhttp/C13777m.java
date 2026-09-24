package com.mbridge.msdk.thrid.okhttp;

import com.mbridge.msdk.thrid.okhttp.internal.C13723c;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;

/* JADX INFO: renamed from: com.mbridge.msdk.thrid.okhttp.m */
/* JADX INFO: compiled from: Dispatcher.java */
/* JADX INFO: loaded from: classes7.dex */
public final class C13777m {

    /* JADX INFO: renamed from: h */
    static final /* synthetic */ boolean f39158h = true;

    /* JADX INFO: renamed from: c */
    @Nullable
    private Runnable f39161c;

    /* JADX INFO: renamed from: d */
    @Nullable
    private ExecutorService f39162d;

    /* JADX INFO: renamed from: a */
    private int f39159a = 64;

    /* JADX INFO: renamed from: b */
    private int f39160b = 5;

    /* JADX INFO: renamed from: e */
    private final Deque<C13788x.b> f39163e = new ArrayDeque();

    /* JADX INFO: renamed from: f */
    private final Deque<C13788x.b> f39164f = new ArrayDeque();

    /* JADX INFO: renamed from: g */
    private final Deque<C13788x> f39165g = new ArrayDeque();

    public C13777m() {
    }

    public C13777m(ExecutorService executorService) {
        this.f39162d = executorService;
    }

    /* JADX INFO: renamed from: a */
    private <T> void m40678a(Deque<T> deque, T t) {
        Runnable runnable;
        synchronized (this) {
            if (!deque.remove(t)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
            runnable = this.f39161c;
        }
        if (m40679b() || runnable == null) {
            return;
        }
        runnable.run();
    }

    /* JADX INFO: renamed from: b */
    private boolean m40679b() {
        int i;
        boolean z;
        if (!f39158h && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator<C13788x.b> it = this.f39163e.iterator();
            while (it.hasNext()) {
                C13788x.b next = it.next();
                if (this.f39164f.size() >= this.f39159a) {
                    break;
                }
                if (m40680c(next) < this.f39160b) {
                    it.remove();
                    arrayList.add(next);
                    this.f39164f.add(next);
                }
            }
            z = m40688c() > 0;
        }
        int size = arrayList.size();
        for (i = 0; i < size; i++) {
            ((C13788x.b) arrayList.get(i)).m40821a(m40681a());
        }
        return z;
    }

    /* JADX INFO: renamed from: c */
    private int m40680c(C13788x.b bVar) {
        int i = 0;
        for (C13788x.b bVar2 : this.f39164f) {
            if (!bVar2.m40822c().f39271f && bVar2.m40823d().equals(bVar.m40823d())) {
                i++;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: a */
    public synchronized ExecutorService m40681a() {
        if (this.f39162d == null) {
            this.f39162d = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), C13723c.m40279a("OkHttp Dispatcher", false));
        }
        return this.f39162d;
    }

    /* JADX INFO: renamed from: a */
    public void m40682a(int i) {
        if (i < 1) {
            throw new IllegalArgumentException("max < 1: " + i);
        }
        synchronized (this) {
            this.f39159a = i;
        }
        m40679b();
    }

    /* JADX INFO: renamed from: a */
    void m40683a(C13788x.b bVar) {
        synchronized (this) {
            this.f39163e.add(bVar);
        }
        m40679b();
    }

    /* JADX INFO: renamed from: a */
    synchronized void m40684a(C13788x c13788x) {
        this.f39165g.add(c13788x);
    }

    /* JADX INFO: renamed from: b */
    public void m40685b(int i) {
        if (i < 1) {
            throw new IllegalArgumentException("max < 1: " + i);
        }
        synchronized (this) {
            this.f39160b = i;
        }
        m40679b();
    }

    /* JADX INFO: renamed from: b */
    void m40686b(C13788x.b bVar) {
        m40678a(this.f39164f, bVar);
    }

    /* JADX INFO: renamed from: b */
    void m40687b(C13788x c13788x) {
        m40678a(this.f39165g, c13788x);
    }

    /* JADX INFO: renamed from: c */
    public synchronized int m40688c() {
        return this.f39164f.size() + this.f39165g.size();
    }
}
