package com.mbridge.msdk.foundation.same.report.crashreport;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* JADX INFO: renamed from: com.mbridge.msdk.foundation.same.report.crashreport.c */
/* JADX INFO: compiled from: AnrMonitor.java */
/* JADX INFO: loaded from: classes6.dex */
public class C13139c extends Thread {

    /* JADX INFO: renamed from: e */
    private static volatile C13139c f36080e;

    /* JADX INFO: renamed from: a */
    private final Handler f36081a;

    /* JADX INFO: renamed from: b */
    private volatile b f36082b;

    /* JADX INFO: renamed from: c */
    private InterfaceC13137a f36083c;

    /* JADX INFO: renamed from: d */
    private int f36084d;

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.same.report.crashreport.c$b */
    /* JADX INFO: compiled from: AnrMonitor.java */
    private class b implements Runnable {

        /* JADX INFO: renamed from: a */
        private long f36085a;

        /* JADX INFO: renamed from: b */
        private boolean f36086b;

        /* JADX INFO: renamed from: c */
        private long f36087c;

        private b() {
            this.f36085a = SystemClock.uptimeMillis();
        }

        /* JADX INFO: renamed from: b */
        void m37301b() {
            this.f36086b = false;
            this.f36087c = SystemClock.uptimeMillis();
            C13139c.this.f36081a.postAtFrontOfQueue(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (C13139c.this) {
                this.f36086b = true;
                this.f36085a = SystemClock.uptimeMillis();
            }
        }

        /* JADX INFO: renamed from: a */
        boolean m37300a() {
            return !this.f36086b || this.f36085a - this.f36087c >= ((long) C13139c.this.f36084d);
        }
    }

    private C13139c() {
        super("AnrMonitor-Thread");
        this.f36081a = new Handler(Looper.getMainLooper());
        this.f36084d = 5000;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0089 */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            r6 = this;
            r0 = 10
            android.os.Process.setThreadPriority(r0)
        L5:
            boolean r0 = r6.isInterrupted()
            if (r0 != 0) goto L8c
            com.mbridge.msdk.foundation.same.report.crashreport.c$b r0 = r6.f36082b
            if (r0 == 0) goto L17
            com.mbridge.msdk.foundation.same.report.crashreport.c$b r0 = r6.f36082b
            boolean r0 = com.mbridge.msdk.foundation.same.report.crashreport.C13139c.b.m37299a(r0)
            if (r0 == 0) goto L8c
        L17:
            monitor-enter(r6)
            com.mbridge.msdk.foundation.same.report.crashreport.c$b r0 = r6.f36082b     // Catch: java.lang.Throwable -> L89
            if (r0 != 0) goto L24
            com.mbridge.msdk.foundation.same.report.crashreport.c$b r0 = new com.mbridge.msdk.foundation.same.report.crashreport.c$b     // Catch: java.lang.Throwable -> L89
            r1 = 0
            r0.<init>()     // Catch: java.lang.Throwable -> L89
            r6.f36082b = r0     // Catch: java.lang.Throwable -> L89
        L24:
            com.mbridge.msdk.foundation.same.report.crashreport.c$b r0 = r6.f36082b     // Catch: java.lang.Throwable -> L89
            r0.m37301b()     // Catch: java.lang.Throwable -> L89
            int r0 = r6.f36084d     // Catch: java.lang.Throwable -> L89
            long r0 = (long) r0     // Catch: java.lang.Throwable -> L89
            long r2 = android.os.SystemClock.uptimeMillis()     // Catch: java.lang.Throwable -> L89
        L30:
            r4 = 0
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 <= 0) goto L4f
            r6.wait(r0)     // Catch: java.lang.InterruptedException -> L3a java.lang.Throwable -> L89
            goto L44
        L3a:
            r0 = move-exception
            java.lang.String r1 = "AnrMonitor"
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L89
            android.util.Log.w(r1, r0)     // Catch: java.lang.Throwable -> L89
        L44:
            long r0 = android.os.SystemClock.uptimeMillis()     // Catch: java.lang.Throwable -> L89
            long r0 = r0 - r2
            int r4 = r6.f36084d     // Catch: java.lang.Throwable -> L89
            long r4 = (long) r4     // Catch: java.lang.Throwable -> L89
            long r0 = r4 - r0
            goto L30
        L4f:
            com.mbridge.msdk.foundation.same.report.crashreport.c$b r0 = r6.f36082b     // Catch: java.lang.Throwable -> L89
            boolean r0 = r0.m37300a()     // Catch: java.lang.Throwable -> L89
            if (r0 != 0) goto L60
            com.mbridge.msdk.foundation.same.report.crashreport.a r0 = r6.f36083c     // Catch: java.lang.Throwable -> L89
            if (r0 == 0) goto L5e
            r0.mo37291a()     // Catch: java.lang.Throwable -> L89
        L5e:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L89
            goto L5
        L60:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L89
            boolean r0 = android.os.Debug.isDebuggerConnected()
            if (r0 != 0) goto L5
            boolean r0 = android.os.Debug.waitingForDebugger()
            if (r0 == 0) goto L6e
            goto L5
        L6e:
            com.mbridge.msdk.foundation.same.report.crashreport.a r0 = r6.f36083c
            if (r0 == 0) goto L5
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            java.lang.Thread r0 = r0.getThread()
            java.lang.StackTraceElement[] r0 = r0.getStackTrace()
            java.lang.String r1 = com.mbridge.msdk.foundation.same.report.crashreport.C13140d.m37307b(r0)
            com.mbridge.msdk.foundation.same.report.crashreport.a r2 = r6.f36083c
            r2.mo37292a(r1, r0)
            goto L5
        L89:
            r0 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L89
            throw r0
        L8c:
            int r0 = r6.f36084d     // Catch: java.lang.Exception -> L5
            long r0 = (long) r0     // Catch: java.lang.Exception -> L5
            java.lang.Thread.sleep(r0)     // Catch: java.lang.Exception -> L5
            goto L5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.same.report.crashreport.C13139c.run():void");
    }

    /* JADX INFO: renamed from: a */
    public static C13139c m37296a() {
        if (f36080e == null) {
            synchronized (C13139c.class) {
                if (f36080e == null) {
                    f36080e = new C13139c();
                }
            }
        }
        return f36080e;
    }

    /* JADX INFO: renamed from: a */
    public C13139c m37298a(int i, InterfaceC13137a interfaceC13137a) {
        this.f36084d = i;
        this.f36083c = interfaceC13137a;
        return this;
    }
}
