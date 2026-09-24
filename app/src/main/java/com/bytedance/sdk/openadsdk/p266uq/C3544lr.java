package com.bytedance.sdk.openadsdk.p266uq;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.uq.lr */
/* JADX INFO: loaded from: classes3.dex */
public class C3544lr {

    /* JADX INFO: renamed from: fi */
    private ri f12937fi;

    /* JADX INFO: renamed from: ka */
    private int f12939ka;

    /* JADX INFO: renamed from: lr */
    private C3546mj f12940lr;

    /* JADX INFO: renamed from: ri */
    private ScheduledExecutorService f12941ri = null;

    /* JADX INFO: renamed from: ik */
    private long f12938ik = 0;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.uq.lr$ri */
    public interface ri {
    }

    public C3544lr(C3546mj c3546mj, int i) {
        this.f12940lr = c3546mj;
        this.f12939ka = i;
    }

    /* JADX INFO: renamed from: lr */
    public boolean m16126lr() {
        ScheduledExecutorService scheduledExecutorService = this.f12941ri;
        if (scheduledExecutorService != null) {
            return scheduledExecutorService.isShutdown();
        }
        return true;
    }

    /* JADX INFO: renamed from: ri */
    public void m16127ri() {
        ScheduledExecutorService scheduledExecutorService = this.f12941ri;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdown();
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m16128ri(int i) {
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1);
        this.f12941ri = scheduledExecutorServiceNewScheduledThreadPool;
        scheduledExecutorServiceNewScheduledThreadPool.scheduleAtFixedRate(new Runnable() { // from class: com.bytedance.sdk.openadsdk.uq.lr.1
            @Override // java.lang.Runnable
            public void run() {
                System.currentTimeMillis();
                long unused = C3544lr.this.f12938ik;
                if (System.currentTimeMillis() - C3544lr.this.f12938ik > C3544lr.this.f12939ka) {
                    C3544lr.this.f12941ri.shutdown();
                    if (C3544lr.this.f12940lr != null) {
                        C3544lr.this.f12940lr.m16197lr(0, "Automatic detection of stuck");
                    }
                    if (C3544lr.this.f12937fi != null) {
                        ri unused2 = C3544lr.this.f12937fi;
                    }
                }
            }
        }, 0L, i, TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: renamed from: ri */
    public void m16129ri(long j) {
        this.f12938ik = j;
    }
}
