package com.mbridge.msdk.thrid.okhttp;

import com.mbridge.msdk.thrid.okhttp.internal.C13723c;
import com.mbridge.msdk.thrid.okhttp.internal.connection.C13729c;
import com.mbridge.msdk.thrid.okhttp.internal.connection.C13730d;
import com.mbridge.msdk.thrid.okhttp.internal.connection.C13733g;
import com.mbridge.msdk.thrid.okhttp.internal.platform.C13767g;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;

/* JADX INFO: renamed from: com.mbridge.msdk.thrid.okhttp.i */
/* JADX INFO: compiled from: ConnectionPool.java */
/* JADX INFO: loaded from: classes7.dex */
public final class C13720i {

    /* JADX INFO: renamed from: g */
    private static final Executor f38760g = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), C13723c.m40279a("OkHttp ConnectionPool", true));

    /* JADX INFO: renamed from: h */
    static final /* synthetic */ boolean f38761h = true;

    /* JADX INFO: renamed from: a */
    private final int f38762a;

    /* JADX INFO: renamed from: b */
    private final long f38763b;

    /* JADX INFO: renamed from: c */
    private final Runnable f38764c;

    /* JADX INFO: renamed from: d */
    private final Deque<C13729c> f38765d;

    /* JADX INFO: renamed from: e */
    final C13730d f38766e;

    /* JADX INFO: renamed from: f */
    boolean f38767f;

    /* JADX INFO: renamed from: com.mbridge.msdk.thrid.okhttp.i$a */
    /* JADX INFO: compiled from: ConnectionPool.java */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            while (true) {
                long jM40247a = C13720i.this.m40247a(System.nanoTime());
                if (jM40247a == -1) {
                    return;
                }
                if (jM40247a > 0) {
                    long j = jM40247a / 1000000;
                    long j2 = jM40247a - (1000000 * j);
                    synchronized (C13720i.this) {
                        try {
                            C13720i.this.wait(j, (int) j2);
                        } catch (InterruptedException unused) {
                        }
                    }
                }
            }
        }
    }

    public C13720i() {
        this(5, 5L, TimeUnit.MINUTES);
    }

    public C13720i(int i, long j, TimeUnit timeUnit) {
        this.f38764c = new a();
        this.f38765d = new ArrayDeque();
        this.f38766e = new C13730d();
        this.f38762a = i;
        this.f38763b = timeUnit.toNanos(j);
        if (j > 0) {
            return;
        }
        throw new IllegalArgumentException("keepAliveDuration <= 0: " + j);
    }

    /* JADX INFO: renamed from: a */
    private int m40246a(C13729c c13729c, long j) {
        List<Reference<C13733g>> list = c13729c.f38823n;
        int i = 0;
        while (i < list.size()) {
            Reference<C13733g> reference = list.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                C13767g.m40635d().mo40607a("A connection to " + c13729c.mo40245c().m40220a().m40164k() + " was leaked. Did you forget to close a response body?", ((C13733g.a) reference).f38853a);
                list.remove(i);
                c13729c.f38820k = true;
                if (list.isEmpty()) {
                    c13729c.f38824o = j - this.f38763b;
                    return 0;
                }
            }
        }
        return list.size();
    }

    /* JADX INFO: renamed from: a */
    long m40247a(long j) {
        synchronized (this) {
            C13729c c13729c = null;
            long j2 = Long.MIN_VALUE;
            int i = 0;
            int i2 = 0;
            for (C13729c c13729c2 : this.f38765d) {
                if (m40246a(c13729c2, j) > 0) {
                    i2++;
                } else {
                    i++;
                    long j3 = j - c13729c2.f38824o;
                    if (j3 > j2) {
                        c13729c = c13729c2;
                        j2 = j3;
                    }
                }
            }
            long j4 = this.f38763b;
            if (j2 < j4 && i <= this.f38762a) {
                if (i > 0) {
                    return j4 - j2;
                }
                if (i2 > 0) {
                    return j4;
                }
                this.f38767f = false;
                return -1L;
            }
            this.f38765d.remove(c13729c);
            C13723c.m40284a(c13729c.m40332g());
            return 0L;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    C13729c m40248a(C13708a c13708a, C13733g c13733g, C13713c0 c13713c0) {
        if (!f38761h && !Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        for (C13729c c13729c : this.f38765d) {
            if (c13729c.m40327a(c13708a, c13713c0)) {
                c13733g.m40358a(c13729c, true);
                return c13729c;
            }
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    Socket m40249a(C13708a c13708a, C13733g c13733g) {
        if (!f38761h && !Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        for (C13729c c13729c : this.f38765d) {
            if (c13729c.m40327a(c13708a, null) && c13729c.m40331f() && c13729c != c13733g.m40363c()) {
                return c13733g.m40362b(c13729c);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    boolean m40250a(C13729c c13729c) {
        if (!f38761h && !Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        if (c13729c.f38820k || this.f38762a == 0) {
            this.f38765d.remove(c13729c);
            return true;
        }
        notifyAll();
        return false;
    }

    /* JADX INFO: renamed from: b */
    void m40251b(C13729c c13729c) {
        if (!f38761h && !Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        if (!this.f38767f) {
            this.f38767f = true;
            f38760g.execute(this.f38764c);
        }
        this.f38765d.add(c13729c);
    }
}
