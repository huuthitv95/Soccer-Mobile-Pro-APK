package com.mbridge.msdk.util.timer;

import android.os.CountDownTimer;

/* JADX INFO: renamed from: com.mbridge.msdk.util.timer.b */
/* JADX INFO: compiled from: MBCountDownTimer.java */
/* JADX INFO: loaded from: classes7.dex */
public class C13889b {

    /* JADX INFO: renamed from: a */
    private InterfaceC13888a f39665a;

    /* JADX INFO: renamed from: b */
    private long f39666b;

    /* JADX INFO: renamed from: c */
    private a f39667c;

    /* JADX INFO: renamed from: d */
    private long f39668d = 0;

    /* JADX INFO: renamed from: com.mbridge.msdk.util.timer.b$a */
    /* JADX INFO: compiled from: MBCountDownTimer.java */
    private static class a extends CountDownTimer {

        /* JADX INFO: renamed from: a */
        private InterfaceC13888a f39669a;

        public a(long j, long j2) {
            super(j, j2);
        }

        /* JADX INFO: renamed from: a */
        void m41433a(InterfaceC13888a interfaceC13888a) {
            this.f39669a = interfaceC13888a;
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            InterfaceC13888a interfaceC13888a = this.f39669a;
            if (interfaceC13888a != null) {
                interfaceC13888a.onFinish();
            }
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
            InterfaceC13888a interfaceC13888a = this.f39669a;
            if (interfaceC13888a != null) {
                interfaceC13888a.onTick(j);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public C13889b m41427a(long j) {
        if (j < 0) {
            j = 1000;
        }
        this.f39666b = j;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public C13889b m41428a(InterfaceC13888a interfaceC13888a) {
        this.f39665a = interfaceC13888a;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public void m41429a() {
        a aVar = this.f39667c;
        if (aVar != null) {
            aVar.cancel();
            this.f39667c = null;
        }
    }

    /* JADX INFO: renamed from: b */
    public C13889b m41430b(long j) {
        this.f39668d = j;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public void m41431b() {
        a aVar = this.f39667c;
        if (aVar != null) {
            aVar.cancel();
            this.f39667c = null;
        }
        if (this.f39666b <= 0) {
            this.f39666b = this.f39668d + 1000;
        }
        a aVar2 = new a(this.f39668d, this.f39666b);
        this.f39667c = aVar2;
        aVar2.m41433a(this.f39665a);
    }

    /* JADX INFO: renamed from: c */
    public void m41432c() {
        if (this.f39667c == null) {
            m41431b();
        }
        this.f39667c.start();
    }
}
