package com.mbridge.msdk.thrid.okio;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.mbridge.msdk.thrid.okio.a */
/* JADX INFO: compiled from: AsyncTimeout.java */
/* JADX INFO: loaded from: classes9.dex */
public class C13791a extends C13810t {

    /* JADX INFO: renamed from: h */
    private static final long f39292h;

    /* JADX INFO: renamed from: i */
    private static final long f39293i;

    /* JADX INFO: renamed from: j */
    static C13791a f39294j;

    /* JADX INFO: renamed from: e */
    private boolean f39295e;

    /* JADX INFO: renamed from: f */
    private C13791a f39296f;

    /* JADX INFO: renamed from: g */
    private long f39297g;

    /* JADX INFO: renamed from: com.mbridge.msdk.thrid.okio.a$a */
    /* JADX INFO: compiled from: AsyncTimeout.java */
    /* JADX INFO: loaded from: classes7.dex */
    class a implements InterfaceC13808r, AutoCloseable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC13808r f39298a;

        a(InterfaceC13808r interfaceC13808r) {
            this.f39298a = interfaceC13808r;
        }

        @Override // com.mbridge.msdk.thrid.okio.InterfaceC13808r
        /* JADX INFO: renamed from: a */
        public void mo40370a(C13793c c13793c, long j) throws IOException {
            C13811u.m40969a(c13793c.f39306b, 0L, j);
            while (true) {
                long j2 = 0;
                if (j <= 0) {
                    return;
                }
                C13805o c13805o = c13793c.f39305a;
                while (j2 < PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH) {
                    j2 += (long) (c13805o.f39340c - c13805o.f39339b);
                    if (j2 >= j) {
                        j2 = j;
                        break;
                    }
                    c13805o = c13805o.f39343f;
                }
                C13791a.this.m40858h();
                try {
                    try {
                        this.f39298a.mo40370a(c13793c, j2);
                        j -= j2;
                        C13791a.this.m40857a(true);
                    } catch (IOException e) {
                        throw C13791a.this.m40856a(e);
                    }
                } catch (Throwable th) {
                    C13791a.this.m40857a(false);
                    throw th;
                }
            }
        }

        @Override // com.mbridge.msdk.thrid.okio.InterfaceC13808r
        /* JADX INFO: renamed from: b */
        public C13810t mo40429b() {
            return C13791a.this;
        }

        @Override // com.mbridge.msdk.thrid.okio.InterfaceC13808r, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            C13791a.this.m40858h();
            try {
                try {
                    this.f39298a.close();
                    C13791a.this.m40857a(true);
                } catch (IOException e) {
                    throw C13791a.this.m40856a(e);
                }
            } catch (Throwable th) {
                C13791a.this.m40857a(false);
                throw th;
            }
        }

        @Override // com.mbridge.msdk.thrid.okio.InterfaceC13808r, java.io.Flushable
        public void flush() throws IOException {
            C13791a.this.m40858h();
            try {
                try {
                    this.f39298a.flush();
                    C13791a.this.m40857a(true);
                } catch (IOException e) {
                    throw C13791a.this.m40856a(e);
                }
            } catch (Throwable th) {
                C13791a.this.m40857a(false);
                throw th;
            }
        }

        public String toString() {
            return "AsyncTimeout.sink(" + this.f39298a + ")";
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.thrid.okio.a$b */
    /* JADX INFO: compiled from: AsyncTimeout.java */
    /* JADX INFO: loaded from: classes7.dex */
    class b implements InterfaceC13809s, AutoCloseable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC13809s f39300a;

        b(InterfaceC13809s interfaceC13809s) {
            this.f39300a = interfaceC13809s;
        }

        @Override // com.mbridge.msdk.thrid.okio.InterfaceC13809s
        /* JADX INFO: renamed from: b */
        public long mo40427b(C13793c c13793c, long j) throws IOException {
            C13791a.this.m40858h();
            try {
                try {
                    long jMo40427b = this.f39300a.mo40427b(c13793c, j);
                    C13791a.this.m40857a(true);
                    return jMo40427b;
                } catch (IOException e) {
                    throw C13791a.this.m40856a(e);
                }
            } catch (Throwable th) {
                C13791a.this.m40857a(false);
                throw th;
            }
        }

        @Override // com.mbridge.msdk.thrid.okio.InterfaceC13809s
        /* JADX INFO: renamed from: b */
        public C13810t mo40428b() {
            return C13791a.this;
        }

        @Override // com.mbridge.msdk.thrid.okio.InterfaceC13809s, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            try {
                try {
                    this.f39300a.close();
                    C13791a.this.m40857a(true);
                } catch (IOException e) {
                    throw C13791a.this.m40856a(e);
                }
            } catch (Throwable th) {
                C13791a.this.m40857a(false);
                throw th;
            }
        }

        public String toString() {
            return "AsyncTimeout.source(" + this.f39300a + ")";
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.thrid.okio.a$c */
    /* JADX INFO: compiled from: AsyncTimeout.java */
    /* JADX INFO: loaded from: classes7.dex */
    private static final class c extends Thread {
        c() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0015, code lost:
        
            r1.mo40557j();
         */
        @Override // java.lang.Thread, java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void run() {
            /*
                r3 = this;
            L0:
                java.lang.Class<com.mbridge.msdk.thrid.okio.a> r0 = com.mbridge.msdk.thrid.okio.C13791a.class
                monitor-enter(r0)     // Catch: java.lang.InterruptedException -> L0
                com.mbridge.msdk.thrid.okio.a r1 = com.mbridge.msdk.thrid.okio.C13791a.m40853g()     // Catch: java.lang.Throwable -> L19
                if (r1 != 0) goto Lb
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
                goto L0
            Lb:
                com.mbridge.msdk.thrid.okio.a r2 = com.mbridge.msdk.thrid.okio.C13791a.f39294j     // Catch: java.lang.Throwable -> L19
                if (r1 != r2) goto L14
                r1 = 0
                com.mbridge.msdk.thrid.okio.C13791a.f39294j = r1     // Catch: java.lang.Throwable -> L19
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
                return
            L14:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
                r1.mo40557j()     // Catch: java.lang.InterruptedException -> L0
                goto L0
            L19:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
                throw r1     // Catch: java.lang.InterruptedException -> L0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.thrid.okio.C13791a.c.run():void");
        }
    }

    static {
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f39292h = millis;
        f39293i = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    /* JADX INFO: renamed from: a */
    private static synchronized void m40850a(C13791a c13791a, long j, boolean z) {
        if (f39294j == null) {
            f39294j = new C13791a();
            new c().start();
        }
        long jNanoTime = System.nanoTime();
        if (j != 0 && z) {
            c13791a.f39297g = Math.min(j, c13791a.mo40933c() - jNanoTime) + jNanoTime;
        } else if (j != 0) {
            c13791a.f39297g = j + jNanoTime;
        } else {
            if (!z) {
                throw new AssertionError();
            }
            c13791a.f39297g = c13791a.mo40933c();
        }
        long jM40852b = c13791a.m40852b(jNanoTime);
        C13791a c13791a2 = f39294j;
        while (true) {
            C13791a c13791a3 = c13791a2.f39296f;
            if (c13791a3 == null || jM40852b < c13791a3.m40852b(jNanoTime)) {
                break;
                break;
            }
            c13791a2 = c13791a2.f39296f;
        }
        c13791a.f39296f = c13791a2.f39296f;
        c13791a2.f39296f = c13791a;
        if (c13791a2 == f39294j) {
            C13791a.class.notify();
        }
    }

    /* JADX INFO: renamed from: a */
    private static synchronized boolean m40851a(C13791a c13791a) {
        C13791a c13791a2 = f39294j;
        while (c13791a2 != null) {
            C13791a c13791a3 = c13791a2.f39296f;
            if (c13791a3 == c13791a) {
                c13791a2.f39296f = c13791a.f39296f;
                c13791a.f39296f = null;
                return false;
            }
            c13791a2 = c13791a3;
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    private long m40852b(long j) {
        return this.f39297g - j;
    }

    /* JADX INFO: renamed from: g */
    static C13791a m40853g() throws InterruptedException {
        C13791a c13791a = f39294j.f39296f;
        if (c13791a == null) {
            long jNanoTime = System.nanoTime();
            C13791a.class.wait(f39292h);
            if (f39294j.f39296f != null || System.nanoTime() - jNanoTime < f39293i) {
                return null;
            }
            return f39294j;
        }
        long jM40852b = c13791a.m40852b(System.nanoTime());
        if (jM40852b > 0) {
            long j = jM40852b / 1000000;
            C13791a.class.wait(j, (int) (jM40852b - (1000000 * j)));
            return null;
        }
        f39294j.f39296f = c13791a.f39296f;
        c13791a.f39296f = null;
        return c13791a;
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC13808r m40854a(InterfaceC13808r interfaceC13808r) {
        return new a(interfaceC13808r);
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC13809s m40855a(InterfaceC13809s interfaceC13809s) {
        return new b(interfaceC13809s);
    }

    /* JADX INFO: renamed from: a */
    final IOException m40856a(IOException iOException) throws IOException {
        return !m40859i() ? iOException : mo40556b(iOException);
    }

    /* JADX INFO: renamed from: a */
    final void m40857a(boolean z) throws IOException {
        if (m40859i() && z) {
            throw mo40556b((IOException) null);
        }
    }

    /* JADX INFO: renamed from: b */
    protected IOException mo40556b(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    /* JADX INFO: renamed from: h */
    public final void m40858h() {
        if (this.f39295e) {
            throw new IllegalStateException("Unbalanced enter/exit");
        }
        long jM40966f = m40966f();
        boolean zMo40934d = mo40934d();
        if (jM40966f != 0 || zMo40934d) {
            this.f39295e = true;
            m40850a(this, jM40966f, zMo40934d);
        }
    }

    /* JADX INFO: renamed from: i */
    public final boolean m40859i() {
        if (!this.f39295e) {
            return false;
        }
        this.f39295e = false;
        return m40851a(this);
    }

    /* JADX INFO: renamed from: j */
    protected void mo40557j() {
    }
}
