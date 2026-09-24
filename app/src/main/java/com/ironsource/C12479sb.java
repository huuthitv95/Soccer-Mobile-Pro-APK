package com.ironsource;

import android.util.Log;
import com.ironsource.lifecycle.C12311b;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: renamed from: com.ironsource.sb */
/* JADX INFO: loaded from: classes6.dex */
public class C12479sb {

    /* JADX INFO: renamed from: g */
    private static final String f31898g = "sb";

    /* JADX INFO: renamed from: a */
    private final C12311b f31899a;

    /* JADX INFO: renamed from: b */
    private final Runnable f31900b;

    /* JADX INFO: renamed from: c */
    private final C11654Rf f31901c;

    /* JADX INFO: renamed from: e */
    private Timer f31903e;

    /* JADX INFO: renamed from: d */
    private final Object f31902d = new Object();

    /* JADX INFO: renamed from: f */
    private final InterfaceC12212ga f31904f = new a();

    /* JADX INFO: renamed from: com.ironsource.sb$a */
    class a implements InterfaceC12212ga {
        a() {
        }

        @Override // com.ironsource.InterfaceC12212ga
        /* JADX INFO: renamed from: a */
        public void mo27937a() {
            C12479sb.this.f31901c.m27403c(System.currentTimeMillis());
            C12479sb.this.m33315c();
        }

        @Override // com.ironsource.InterfaceC12212ga
        /* JADX INFO: renamed from: b */
        public void mo27938b() {
            C12479sb.this.f31901c.m27402b(System.currentTimeMillis());
            C12479sb c12479sb = C12479sb.this;
            c12479sb.m33314b(c12479sb.f31901c.m27399a());
        }

        @Override // com.ironsource.InterfaceC12212ga
        /* JADX INFO: renamed from: c */
        public void mo27939c() {
        }

        @Override // com.ironsource.InterfaceC12212ga
        /* JADX INFO: renamed from: d */
        public void mo27940d() {
        }
    }

    /* JADX INFO: renamed from: com.ironsource.sb$b */
    class b extends TimerTask {
        b() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            C12479sb c12479sb = C12479sb.this;
            c12479sb.f31899a.m32109b(c12479sb.f31904f);
            C12479sb.this.f31901c.m27401b();
            C12479sb.this.f31900b.run();
        }
    }

    public C12479sb(Runnable runnable, C12311b c12311b, C11654Rf c11654Rf) {
        this.f31900b = runnable;
        this.f31899a = c12311b;
        this.f31901c = c11654Rf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public void m33315c() {
        synchronized (this.f31902d) {
            Timer timer = this.f31903e;
            if (timer != null) {
                timer.cancel();
                this.f31903e = null;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m33316a() {
        m33317a(0L);
    }

    /* JADX INFO: renamed from: b */
    public void m33318b() {
        m33315c();
        this.f31899a.m32109b(this.f31904f);
        this.f31901c.m27401b();
    }

    /* JADX INFO: renamed from: a */
    public void m33317a(long j) {
        if (j < 0) {
            Log.d(f31898g, "cannot start timer with delay < 0");
            return;
        }
        this.f31899a.m32107a(this.f31904f);
        this.f31901c.m27400a(j);
        if (this.f31899a.m32113e()) {
            this.f31901c.m27403c(System.currentTimeMillis());
        } else {
            m33314b(j);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public void m33314b(long j) {
        synchronized (this.f31902d) {
            m33315c();
            Timer timer = new Timer();
            this.f31903e = timer;
            timer.schedule(new b(), j);
        }
    }
}
