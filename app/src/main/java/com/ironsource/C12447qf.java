package com.ironsource;

import android.os.Handler;
import android.os.HandlerThread;
import com.ironsource.mediationsdk.logger.C12362c;

/* JADX INFO: renamed from: com.ironsource.qf */
/* JADX INFO: loaded from: classes6.dex */
public class C12447qf extends Thread {

    /* JADX INFO: renamed from: b */
    private static C12447qf f31806b;

    /* JADX INFO: renamed from: a */
    private a f31807a;

    /* JADX INFO: renamed from: com.ironsource.qf$a */
    private class a extends HandlerThread {

        /* JADX INFO: renamed from: a */
        private Handler f31808a;

        a(String str) {
            super(str);
            setUncaughtExceptionHandler(new C12362c());
        }

        /* JADX INFO: renamed from: a */
        Handler m33204a() {
            return this.f31808a;
        }

        /* JADX INFO: renamed from: b */
        void m33205b() {
            this.f31808a = new Handler(getLooper());
        }
    }

    private C12447qf() {
        a aVar = new a(getClass().getSimpleName());
        this.f31807a = aVar;
        aVar.start();
        this.f31807a.m33205b();
    }

    /* JADX INFO: renamed from: a */
    public static synchronized C12447qf m33202a() {
        if (f31806b == null) {
            f31806b = new C12447qf();
        }
        return f31806b;
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m33203a(Runnable runnable) {
        a aVar = this.f31807a;
        if (aVar == null) {
            return;
        }
        Handler handlerM33204a = aVar.m33204a();
        if (handlerM33204a != null) {
            handlerM33204a.post(runnable);
        }
    }
}
