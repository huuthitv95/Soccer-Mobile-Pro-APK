package com.ironsource;

import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: renamed from: com.ironsource.f */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC12183f<T> {

    /* JADX INFO: renamed from: a */
    private Object f30356a = new Object();

    /* JADX INFO: renamed from: b */
    private Timer f30357b;

    /* JADX INFO: renamed from: c */
    protected long f30358c;

    /* JADX INFO: renamed from: d */
    protected T f30359d;

    /* JADX INFO: renamed from: com.ironsource.f$a */
    class a extends TimerTask {
        a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            AbstractC12183f.this.mo27482b();
        }
    }

    public AbstractC12183f() {
    }

    /* JADX INFO: renamed from: a */
    protected boolean m31398a() {
        return this.f30358c <= 0;
    }

    /* JADX INFO: renamed from: b */
    protected abstract void mo27482b();

    /* JADX INFO: renamed from: c */
    protected void m31399c() {
        synchronized (this.f30356a) {
            Timer timer = this.f30357b;
            if (timer != null) {
                timer.cancel();
                this.f30357b = null;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public void m31400d() {
        this.f30359d = null;
    }

    /* JADX INFO: renamed from: a */
    protected void m31397a(T t) {
        if (m31398a() || t == null) {
            return;
        }
        this.f30359d = t;
        m31399c();
        synchronized (this.f30356a) {
            Timer timer = new Timer();
            this.f30357b = timer;
            timer.schedule(new a(), this.f30358c);
        }
    }

    public AbstractC12183f(long j) {
        this.f30358c = j;
    }
}
