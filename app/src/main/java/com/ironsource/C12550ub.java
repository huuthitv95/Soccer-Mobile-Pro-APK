package com.ironsource;

import android.os.Handler;
import android.os.Looper;
import java.util.Date;

/* JADX INFO: renamed from: com.ironsource.ub */
/* JADX INFO: loaded from: classes6.dex */
public class C12550ub {

    /* JADX INFO: renamed from: a */
    private final a f32563a;

    /* JADX INFO: renamed from: b */
    protected long f32564b;

    /* JADX INFO: renamed from: com.ironsource.ub$a */
    private class a extends Thread {

        /* JADX INFO: renamed from: a */
        private Handler f32565a;

        private a() {
        }

        /* JADX INFO: renamed from: a */
        public Handler m33913a() {
            return this.f32565a;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Looper.prepare();
            this.f32565a = new Handler();
            Looper.loop();
        }
    }

    public C12550ub() {
        a aVar = new a();
        this.f32563a = aVar;
        aVar.start();
        this.f32564b = new Date().getTime();
    }

    /* JADX INFO: renamed from: a */
    protected boolean m33912a(Object obj) {
        return (obj == null || this.f32563a == null) ? false : true;
    }

    /* JADX INFO: renamed from: a */
    protected void m33911a(Runnable runnable) {
        Handler handlerM33913a;
        a aVar = this.f32563a;
        if (aVar == null || (handlerM33913a = aVar.m33913a()) == null) {
            return;
        }
        handlerM33913a.post(runnable);
    }
}
