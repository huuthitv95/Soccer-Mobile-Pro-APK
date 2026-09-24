package com.pgl.ssdk;

import android.os.Handler;

/* JADX INFO: renamed from: com.pgl.ssdk.ar */
/* JADX INFO: loaded from: classes7.dex */
public class C14260ar {
    /* JADX INFO: renamed from: a */
    private static Handler m42991a() {
        return C14237a0.m42784a().m42787b();
    }

    /* JADX INFO: renamed from: a */
    public static void m42992a(Runnable runnable) {
        Handler handlerM42991a;
        if (runnable == null || (handlerM42991a = m42991a()) == null) {
            return;
        }
        handlerM42991a.post(runnable);
    }

    /* JADX INFO: renamed from: a */
    public static void m42993a(Runnable runnable, long j) {
        Handler handlerM42994b;
        if (runnable == null || (handlerM42994b = m42994b()) == null) {
            return;
        }
        handlerM42994b.postDelayed(runnable, j);
    }

    /* JADX INFO: renamed from: b */
    public static Handler m42994b() {
        return C14237a0.m42784a().m42789c();
    }

    /* JADX INFO: renamed from: b */
    public static void m42995b(Runnable runnable) {
        m42993a(runnable, 0L);
    }
}
