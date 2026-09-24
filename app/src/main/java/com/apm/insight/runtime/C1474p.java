package com.apm.insight.runtime;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.apm.insight.C1386c;
import com.apm.insight.C1390e;
import com.apm.insight.p011b.C1381f;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: renamed from: com.apm.insight.runtime.p */
/* JADX INFO: compiled from: ThreadWithHandler.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C1474p {

    /* JADX INFO: renamed from: a */
    private final HandlerThread f901a;

    /* JADX INFO: renamed from: d */
    private volatile Handler f904d;

    /* JADX INFO: renamed from: b */
    private final Queue<c> f902b = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: c */
    private final Queue<Message> f903c = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: e */
    private final Object f905e = new Object();

    /* JADX INFO: renamed from: com.apm.insight.runtime.p$a */
    /* JADX INFO: compiled from: ThreadWithHandler.java */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            while (!C1474p.this.f903c.isEmpty()) {
                if (C1474p.this.f904d != null) {
                    try {
                        C1474p.this.f904d.sendMessageAtFrontOfQueue((Message) C1474p.this.f903c.poll());
                    } catch (Throwable unused) {
                    }
                }
            }
            while (!C1474p.this.f902b.isEmpty()) {
                c cVar = (c) C1474p.this.f902b.poll();
                if (C1474p.this.f904d != null) {
                    try {
                        C1474p.this.f904d.sendMessageAtTime(cVar.f910a, cVar.f911b);
                    } catch (Throwable unused2) {
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.apm.insight.runtime.p$b */
    /* JADX INFO: compiled from: ThreadWithHandler.java */
    class b extends HandlerThread {

        /* JADX INFO: renamed from: a */
        private volatile int f907a;

        /* JADX INFO: renamed from: b */
        private volatile boolean f908b;

        b(String str) {
            super(str);
            this.f907a = 0;
            this.f908b = false;
        }

        /* JADX INFO: Infinite loop detected, blocks: 19, insns: 0 */
        @Override // android.os.HandlerThread
        protected final void onLooperPrepared() {
            super.onLooperPrepared();
            synchronized (C1474p.this.f905e) {
                try {
                    C1474p.this.f904d = new Handler();
                } catch (Throwable th) {
                    throw th;
                }
            }
            C1474p.this.f904d.post(C1474p.this.new a());
            while (true) {
                try {
                    Looper.loop();
                } catch (Throwable th2) {
                    try {
                        C1381f.m945a(C1390e.m1032g()).m947a().m922c();
                        if (this.f907a < 5) {
                            C1386c.m990a();
                            C1468j.m1652a(th2, "NPTH_CATCH");
                        } else if (!this.f908b) {
                            this.f908b = true;
                            C1386c.m990a();
                            C1468j.m1652a(new RuntimeException(), "NPTH_ERR_MAX");
                        }
                        this.f907a++;
                    } catch (Throwable unused) {
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.apm.insight.runtime.p$c */
    /* JADX INFO: compiled from: ThreadWithHandler.java */
    static class c {

        /* JADX INFO: renamed from: a */
        Message f910a;

        /* JADX INFO: renamed from: b */
        long f911b;

        c(Message message, long j) {
            this.f910a = message;
            this.f911b = j;
        }
    }

    static {
        new Object() { // from class: com.apm.insight.runtime.p.1
        };
        new Object() { // from class: com.apm.insight.runtime.p.2
        };
    }

    public C1474p(String str) {
        this.f901a = new b(str);
    }

    /* JADX INFO: renamed from: a */
    private boolean m1728a(Message message, long j) {
        if (j < 0) {
            j = 0;
        }
        return m1731b(message, SystemClock.uptimeMillis() + j);
    }

    /* JADX INFO: renamed from: b */
    private Message m1730b(Runnable runnable) {
        return Message.obtain(this.f904d, runnable);
    }

    /* JADX INFO: renamed from: b */
    private boolean m1731b(Message message, long j) {
        if (this.f904d == null) {
            synchronized (this.f905e) {
                if (this.f904d == null) {
                    this.f902b.add(new c(message, j));
                    return true;
                }
            }
        }
        try {
            return this.f904d.sendMessageAtTime(message, j);
        } catch (Throwable unused) {
            return true;
        }
    }

    /* JADX INFO: renamed from: a */
    public final Handler m1734a() {
        return this.f904d;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m1735a(Runnable runnable) {
        return m1728a(m1730b(runnable), 0L);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m1736a(Runnable runnable, long j) {
        return m1728a(m1730b(runnable), j);
    }

    /* JADX INFO: renamed from: b */
    public final void m1737b() {
        this.f901a.start();
    }

    /* JADX INFO: renamed from: c */
    public final HandlerThread m1738c() {
        return this.f901a;
    }
}
