package com.ironsource;

import com.ironsource.lifecycle.C12311b;
import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: renamed from: com.ironsource.tb */
/* JADX INFO: loaded from: classes6.dex */
public class C12532tb implements InterfaceC12212ga {

    /* JADX INFO: renamed from: b */
    private Timer f32457b;

    /* JADX INFO: renamed from: e */
    private long f32460e;

    /* JADX INFO: renamed from: f */
    private Runnable f32461f;

    /* JADX INFO: renamed from: a */
    private String f32456a = "INTERNAL";

    /* JADX INFO: renamed from: c */
    private boolean f32458c = false;

    /* JADX INFO: renamed from: d */
    private Long f32459d = null;

    /* JADX INFO: renamed from: com.ironsource.tb$a */
    class a extends TimerTask {
        a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            C12532tb.this.f32461f.run();
        }
    }

    public C12532tb(long j, Runnable runnable, boolean z) {
        this.f32460e = j;
        this.f32461f = runnable;
        if (z) {
            m33791g();
        }
    }

    /* JADX INFO: renamed from: f */
    private synchronized void m33788f() {
        Timer timer = this.f32457b;
        if (timer != null) {
            timer.cancel();
            this.f32457b = null;
        }
    }

    /* JADX INFO: renamed from: h */
    private synchronized void m33789h() {
        if (this.f32457b == null) {
            Timer timer = new Timer();
            this.f32457b = timer;
            timer.schedule(new a(), this.f32460e);
            Calendar.getInstance().setTimeInMillis(this.f32459d.longValue());
        }
    }

    @Override // com.ironsource.InterfaceC12212ga
    /* JADX INFO: renamed from: a */
    public void mo27937a() {
        if (this.f32457b != null) {
            m33788f();
        }
    }

    @Override // com.ironsource.InterfaceC12212ga
    /* JADX INFO: renamed from: b */
    public void mo27938b() {
        Long l;
        if (this.f32457b == null && (l = this.f32459d) != null) {
            long jLongValue = l.longValue() - System.currentTimeMillis();
            this.f32460e = jLongValue;
            if (jLongValue > 0) {
                m33789h();
            } else {
                m33790e();
                this.f32461f.run();
            }
        }
    }

    @Override // com.ironsource.InterfaceC12212ga
    /* JADX INFO: renamed from: c */
    public void mo27939c() {
    }

    @Override // com.ironsource.InterfaceC12212ga
    /* JADX INFO: renamed from: d */
    public void mo27940d() {
    }

    /* JADX INFO: renamed from: e */
    public void m33790e() {
        m33788f();
        this.f32458c = false;
        this.f32459d = null;
        C12311b.m32099d().m32109b(this);
    }

    /* JADX INFO: renamed from: g */
    public void m33791g() {
        if (this.f32458c) {
            return;
        }
        this.f32458c = true;
        C12311b.m32099d().m32107a(this);
        this.f32459d = Long.valueOf(System.currentTimeMillis() + this.f32460e);
        if (C12311b.m32099d().m32113e()) {
            return;
        }
        m33789h();
    }
}
