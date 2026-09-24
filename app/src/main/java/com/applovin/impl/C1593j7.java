package com.applovin.impl;

import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.C1768p;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: renamed from: com.applovin.impl.j7 */
/* JADX INFO: loaded from: classes3.dex */
public class C1593j7 {

    /* JADX INFO: renamed from: a */
    private final C1748l f1898a;

    /* JADX INFO: renamed from: b */
    private Timer f1899b;

    /* JADX INFO: renamed from: c */
    private long f1900c;

    /* JADX INFO: renamed from: d */
    private long f1901d;

    /* JADX INFO: renamed from: e */
    private long f1902e;

    /* JADX INFO: renamed from: f */
    private boolean f1903f;

    /* JADX INFO: renamed from: g */
    private final Runnable f1904g;

    /* JADX INFO: renamed from: h */
    private long f1905h;

    /* JADX INFO: renamed from: i */
    private final Object f1906i = new Object();

    /* JADX INFO: renamed from: com.applovin.impl.j7$a */
    class a extends TimerTask {
        a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            try {
                C1593j7.this.f1904g.run();
                synchronized (C1593j7.this.f1906i) {
                    if (C1593j7.this.f1903f) {
                        C1593j7.this.f1900c = System.currentTimeMillis();
                        C1593j7 c1593j7 = C1593j7.this;
                        c1593j7.f1901d = c1593j7.f1902e;
                    } else {
                        C1593j7.this.f1899b = null;
                    }
                }
            } catch (Throwable th) {
                try {
                    if (C1593j7.this.f1898a != null) {
                        C1593j7.this.f1898a.m4782Q();
                        if (C1768p.m5160a()) {
                            C1593j7.this.f1898a.m4782Q().m5172a("Timer", "Encountered error while executing timed task", th);
                        }
                        C1593j7.this.f1898a.m4764E().m4329a("Timer", "executingTimedTask", th);
                    }
                } finally {
                    synchronized (C1593j7.this.f1906i) {
                        if (C1593j7.this.f1903f) {
                            C1593j7.this.f1900c = System.currentTimeMillis();
                            C1593j7 c1593j8 = C1593j7.this;
                            c1593j8.f1901d = c1593j8.f1902e;
                        } else {
                            C1593j7.this.f1899b = null;
                        }
                    }
                }
            }
        }
    }

    private C1593j7(C1748l c1748l, Runnable runnable) {
        this.f1898a = c1748l;
        this.f1904g = runnable;
    }

    /* JADX INFO: renamed from: a */
    public static C1593j7 m3012a(long j, C1748l c1748l, Runnable runnable) {
        return m3013a(j, false, c1748l, runnable);
    }

    /* JADX INFO: renamed from: a */
    public static C1593j7 m3013a(long j, boolean z, C1748l c1748l, Runnable runnable) {
        if (j < 0) {
            throw new IllegalArgumentException("Cannot create a scheduled timer. Invalid fire time passed in: " + j + ".");
        }
        if (runnable == null) {
            throw new IllegalArgumentException("Cannot create a scheduled timer. Runnable is null.");
        }
        C1593j7 c1593j7 = new C1593j7(c1748l, runnable);
        c1593j7.f1900c = System.currentTimeMillis();
        c1593j7.f1901d = j;
        c1593j7.f1903f = z;
        c1593j7.f1902e = j;
        try {
            c1593j7.f1899b = new Timer();
            c1593j7.m3016a(c1593j7.m3019b(), j, z, c1593j7.f1902e);
            return c1593j7;
        } catch (OutOfMemoryError e) {
            c1748l.m4782Q();
            if (C1768p.m5160a()) {
                c1748l.m4782Q().m5172a("Timer", "Failed to create timer due to OOM error", e);
            }
            return c1593j7;
        }
    }

    /* JADX INFO: renamed from: a */
    private void m3016a(TimerTask timerTask, long j, boolean z, long j2) {
        if (z) {
            this.f1899b.schedule(timerTask, j, j2);
        } else {
            this.f1899b.schedule(timerTask, j);
        }
    }

    /* JADX INFO: renamed from: b */
    private TimerTask m3019b() {
        return new a();
    }

    /* JADX INFO: renamed from: a */
    public void m3023a() {
        synchronized (this.f1906i) {
            Timer timer = this.f1899b;
            if (timer != null) {
                try {
                    timer.cancel();
                    this.f1899b = null;
                } catch (Throwable th) {
                    try {
                        C1748l c1748l = this.f1898a;
                        if (c1748l != null) {
                            c1748l.m4782Q();
                            if (C1768p.m5160a()) {
                                this.f1898a.m4782Q();
                                if (C1768p.m5160a()) {
                                    this.f1898a.m4782Q().m5172a("Timer", "Encountered error while cancelling timer", th);
                                }
                            }
                        }
                        this.f1899b = null;
                    } catch (Throwable th2) {
                        this.f1899b = null;
                        this.f1905h = 0L;
                        throw th2;
                    }
                }
                this.f1905h = 0L;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public long m3024c() {
        if (this.f1899b == null) {
            return this.f1901d - this.f1905h;
        }
        return this.f1901d - (System.currentTimeMillis() - this.f1900c);
    }

    /* JADX INFO: renamed from: d */
    public void m3025d() {
        synchronized (this.f1906i) {
            Timer timer = this.f1899b;
            if (timer != null) {
                try {
                    timer.cancel();
                    this.f1905h = Math.max(1L, System.currentTimeMillis() - this.f1900c);
                    this.f1899b = null;
                } catch (Throwable th) {
                    try {
                        C1748l c1748l = this.f1898a;
                        if (c1748l != null) {
                            c1748l.m4782Q();
                            if (C1768p.m5160a()) {
                                this.f1898a.m4782Q();
                                if (C1768p.m5160a()) {
                                    this.f1898a.m4782Q().m5172a("Timer", "Encountered error while pausing timer", th);
                                }
                            }
                        }
                        this.f1899b = null;
                    } catch (Throwable th2) {
                        this.f1899b = null;
                        throw th2;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public void m3026e() {
        C1593j7 c1593j7;
        synchronized (this.f1906i) {
            try {
                try {
                    long j = this.f1905h;
                    if (j > 0) {
                        try {
                            long j2 = this.f1901d - j;
                            this.f1901d = j2;
                            if (j2 < 0) {
                                this.f1901d = 0L;
                            }
                            this.f1899b = new Timer();
                            c1593j7 = this;
                            try {
                                c1593j7.m3016a(m3019b(), this.f1901d, this.f1903f, this.f1902e);
                                c1593j7.f1900c = System.currentTimeMillis();
                                c1593j7.f1905h = 0L;
                            } catch (Throwable th) {
                                th = th;
                                try {
                                    C1748l c1748l = c1593j7.f1898a;
                                    if (c1748l != null) {
                                        c1748l.m4782Q();
                                        if (C1768p.m5160a()) {
                                            c1593j7.f1898a.m4782Q();
                                            if (C1768p.m5160a()) {
                                                c1593j7.f1898a.m4782Q().m5172a("Timer", "Encountered error while resuming timer", th);
                                            }
                                        }
                                    }
                                    c1593j7.f1905h = 0L;
                                } catch (Throwable th2) {
                                    c1593j7.f1905h = 0L;
                                    throw th2;
                                }
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            c1593j7 = this;
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    throw th;
                }
            } catch (Throwable th5) {
                th = th5;
                throw th;
            }
        }
    }
}
