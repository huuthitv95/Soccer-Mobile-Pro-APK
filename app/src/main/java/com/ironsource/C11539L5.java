package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.ironsource.L5 */
/* JADX INFO: loaded from: classes6.dex */
public class C11539L5 {

    /* JADX INFO: renamed from: e */
    public static final int f24890e = -1;

    /* JADX INFO: renamed from: a */
    private Runnable f24891a = new a();

    /* JADX INFO: renamed from: b */
    private int f24892b;

    /* JADX INFO: renamed from: c */
    private InterfaceC12395o f24893c;

    /* JADX INFO: renamed from: d */
    private C12532tb f24894d;

    /* JADX INFO: renamed from: com.ironsource.L5$a */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IronLog.INTERNAL.verbose("loaded ads are expired");
            InterfaceC12395o interfaceC12395o = C11539L5.this.f24893c;
            if (interfaceC12395o != null) {
                interfaceC12395o.mo31702a();
            }
        }
    }

    public C11539L5(int i, InterfaceC12395o interfaceC12395o) {
        this.f24893c = interfaceC12395o;
        this.f24892b = i;
    }

    /* JADX INFO: renamed from: a */
    public void m26351a(long j) {
        if (m26352b()) {
            long millis = TimeUnit.MINUTES.toMillis(this.f24892b) - Math.max(j, 0L);
            if (millis <= 0) {
                IronLog.INTERNAL.verbose("no delay - onAdExpired called");
                this.f24893c.mo31702a();
                return;
            }
            m26350a();
            this.f24894d = new C12532tb(millis, this.f24891a, true);
            Calendar calendar = Calendar.getInstance();
            calendar.add(14, (int) millis);
            IronLog.INTERNAL.verbose("loaded ads will expire on: " + calendar.getTime() + " in " + String.format(Locale.getDefault(), "%.2f", Double.valueOf((millis / 1000.0d) / 60.0d)) + " minutes");
        }
    }

    /* JADX INFO: renamed from: b */
    public boolean m26352b() {
        return this.f24892b > 0;
    }

    /* JADX INFO: renamed from: a */
    public void m26350a() {
        if (!m26352b() || this.f24894d == null) {
            return;
        }
        IronLog.INTERNAL.verbose("canceling expiration timer");
        this.f24894d.m33790e();
        this.f24894d = null;
    }
}
