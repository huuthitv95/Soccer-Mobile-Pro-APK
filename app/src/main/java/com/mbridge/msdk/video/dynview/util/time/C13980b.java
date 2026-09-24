package com.mbridge.msdk.video.dynview.util.time;

import android.os.CountDownTimer;

/* JADX INFO: renamed from: com.mbridge.msdk.video.dynview.util.time.b */
/* JADX INFO: compiled from: MBCountDownTimer.java */
/* JADX INFO: loaded from: classes7.dex */
public class C13980b {

    /* JADX INFO: renamed from: a */
    private long f40090a = 0;

    /* JADX INFO: renamed from: b */
    private long f40091b;

    /* JADX INFO: renamed from: c */
    private InterfaceC13979a f40092c;

    /* JADX INFO: renamed from: d */
    private a f40093d;

    /* JADX INFO: renamed from: com.mbridge.msdk.video.dynview.util.time.b$a */
    /* JADX INFO: compiled from: MBCountDownTimer.java */
    private static class a extends CountDownTimer {

        /* JADX INFO: renamed from: a */
        private InterfaceC13979a f40094a;

        public a(long j, long j2) {
            super(j, j2);
        }

        /* JADX INFO: renamed from: a */
        void m41878a(InterfaceC13979a interfaceC13979a) {
            this.f40094a = interfaceC13979a;
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            InterfaceC13979a interfaceC13979a = this.f40094a;
            if (interfaceC13979a != null) {
                interfaceC13979a.onFinish();
            }
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
            InterfaceC13979a interfaceC13979a = this.f40094a;
            if (interfaceC13979a != null) {
                interfaceC13979a.onTick(j);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public C13980b m41871a(long j) {
        if (j < 0) {
            j = 1000;
        }
        this.f40091b = j;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public C13980b m41872a(InterfaceC13979a interfaceC13979a) {
        this.f40092c = interfaceC13979a;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public void m41873a() {
        a aVar = this.f40093d;
        if (aVar != null) {
            aVar.cancel();
            this.f40093d = null;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m41874a(long j, InterfaceC13979a interfaceC13979a) {
        this.f40090a = j;
        this.f40092c = interfaceC13979a;
        m41876b();
        a aVar = this.f40093d;
        if (aVar != null) {
            aVar.start();
        }
    }

    /* JADX INFO: renamed from: b */
    public C13980b m41875b(long j) {
        this.f40090a = j;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public void m41876b() {
        a aVar = this.f40093d;
        if (aVar != null) {
            aVar.cancel();
            this.f40093d = null;
        }
        if (this.f40091b <= 0) {
            this.f40091b = this.f40090a + 1000;
        }
        a aVar2 = new a(this.f40090a, this.f40091b);
        this.f40093d = aVar2;
        aVar2.m41878a(this.f40092c);
    }

    /* JADX INFO: renamed from: c */
    public void m41877c() {
        if (this.f40093d == null) {
            m41876b();
        }
        this.f40093d.start();
    }
}
