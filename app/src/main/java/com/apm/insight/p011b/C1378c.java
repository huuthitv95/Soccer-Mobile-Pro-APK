package com.apm.insight.p011b;

import android.os.SystemClock;
import com.apm.insight.runtime.C1460b;
import com.apm.insight.runtime.C1467i;
import com.apm.insight.runtime.C1471m;

/* JADX INFO: renamed from: com.apm.insight.b.c */
/* JADX INFO: compiled from: ANRThread.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C1378c {

    /* JADX INFO: renamed from: b */
    private static long f409b;

    /* JADX INFO: renamed from: a */
    private final C1377b f410a;

    /* JADX INFO: renamed from: c */
    private boolean f411c = false;

    /* JADX INFO: renamed from: d */
    private final Runnable f412d;

    C1378c(C1377b c1377b) {
        Runnable runnable = new Runnable() { // from class: com.apm.insight.b.c.1
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                if (C1378c.this.f411c) {
                    return;
                }
                C1378c.this.f410a.m923d();
                long unused = C1378c.f409b = SystemClock.uptimeMillis();
                if (C1467i.m1645a().m1650b()) {
                    C1471m.m1704a().m1736a(C1378c.this.f412d, 500L);
                } else {
                    C1471m.m1704a().m1736a(C1378c.this.f412d, 500L);
                }
                C1460b.m1614a(C1378c.f409b);
            }
        };
        this.f412d = runnable;
        this.f410a = c1377b;
        C1471m.m1704a().m1736a(runnable, 5000L);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m932c() {
        return SystemClock.uptimeMillis() - f409b <= 15000;
    }

    /* JADX INFO: renamed from: a */
    public final void m934a() {
        if (this.f411c) {
            return;
        }
        C1471m.m1704a().m1736a(this.f412d, 5000L);
    }

    /* JADX INFO: renamed from: b */
    public final void m935b() {
        this.f411c = true;
    }
}
