package com.ironsource;

import com.ironsource.lifecycle.C12311b;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: renamed from: com.ironsource.Q0 */
/* JADX INFO: loaded from: classes6.dex */
public class C11623Q0 {

    /* JADX INFO: renamed from: a */
    private final C11588O0 f25544a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC11365Bb f25545b;

    /* JADX INFO: renamed from: c */
    private final C12479sb f25546c = m27268c();

    /* JADX INFO: renamed from: d */
    private Timer f25547d;

    /* JADX INFO: renamed from: com.ironsource.Q0$a */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C11623Q0.this.f25545b.mo25485b();
        }
    }

    /* JADX INFO: renamed from: com.ironsource.Q0$b */
    class b extends TimerTask {
        b() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            C11623Q0.this.f25545b.mo25485b();
        }
    }

    public C11623Q0(C11588O0 c11588o0, InterfaceC11365Bb interfaceC11365Bb) {
        this.f25544a = c11588o0;
        this.f25545b = interfaceC11365Bb;
    }

    /* JADX INFO: renamed from: b */
    private synchronized void m27267b(long j) {
        m27269j();
        Timer timer = new Timer();
        this.f25547d = timer;
        timer.schedule(new b(), j);
    }

    /* JADX INFO: renamed from: c */
    private C12479sb m27268c() {
        return new C12479sb(new a(), C12311b.m32099d(), new C11654Rf());
    }

    /* JADX INFO: renamed from: j */
    private synchronized void m27269j() {
        Timer timer = this.f25547d;
        if (timer != null) {
            timer.cancel();
            this.f25547d = null;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m27270a() {
        if (this.f25544a.m26706a() == C11588O0.a.MANUAL_WITH_AUTOMATIC_RELOAD) {
            IronLog.INTERNAL.verbose();
            m27278i();
        }
    }

    /* JADX INFO: renamed from: d */
    protected boolean m27273d() {
        return this.f25544a.m26708c() > 0;
    }

    /* JADX INFO: renamed from: e */
    public void m27274e() {
        if (this.f25544a.m26710e()) {
            IronLog.INTERNAL.verbose();
            m27267b(this.f25544a.m26708c());
        }
    }

    /* JADX INFO: renamed from: f */
    public void m27275f() {
        if (this.f25544a.m26706a() == C11588O0.a.AUTOMATIC_LOAD_AFTER_CLOSE) {
            IronLog.INTERNAL.verbose();
            m27267b(this.f25544a.m26709d());
        }
    }

    /* JADX INFO: renamed from: g */
    public void m27276g() {
        if (this.f25544a.m26710e()) {
            IronLog.INTERNAL.verbose();
            m27267b(0L);
        }
    }

    /* JADX INFO: renamed from: h */
    public void m27277h() {
        if (this.f25544a.m26706a() != C11588O0.a.AUTOMATIC_LOAD_WHILE_SHOW || this.f25544a.m26709d() < 0) {
            return;
        }
        IronLog.INTERNAL.verbose();
        m27267b(this.f25544a.m26709d());
    }

    /* JADX INFO: renamed from: i */
    protected void m27278i() {
        C12479sb c12479sb = this.f25546c;
        if (c12479sb != null) {
            c12479sb.m33318b();
        }
    }

    /* JADX INFO: renamed from: k */
    public void m27279k() {
        if (this.f25544a.m26706a() != C11588O0.a.MANUAL_WITH_AUTOMATIC_RELOAD || this.f25544a.m26707b() <= 0) {
            return;
        }
        IronLog.INTERNAL.verbose();
        m27271a(this.f25544a.m26707b());
    }

    /* JADX INFO: renamed from: b */
    protected C11588O0 m27272b() {
        return this.f25544a;
    }

    /* JADX INFO: renamed from: a */
    protected void m27271a(long j) {
        C12479sb c12479sb = this.f25546c;
        if (c12479sb != null) {
            c12479sb.m33317a(j);
        }
    }
}
