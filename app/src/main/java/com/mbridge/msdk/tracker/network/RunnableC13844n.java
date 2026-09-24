package com.mbridge.msdk.tracker.network;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: renamed from: com.mbridge.msdk.tracker.network.n */
/* JADX INFO: compiled from: NetworkDispatcher.java */
/* JADX INFO: loaded from: classes7.dex */
public class RunnableC13844n implements Runnable {

    /* JADX INFO: renamed from: a */
    private final BlockingQueue<AbstractC13850t<?>> f39462a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC13843m f39463b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC13830b f39464c;

    /* JADX INFO: renamed from: d */
    private final InterfaceC13868w f39465d;

    /* JADX INFO: renamed from: e */
    private volatile boolean f39466e = false;

    public RunnableC13844n(BlockingQueue<AbstractC13850t<?>> blockingQueue, InterfaceC13843m interfaceC13843m, InterfaceC13830b interfaceC13830b, InterfaceC13868w interfaceC13868w) {
        this.f39462a = blockingQueue;
        this.f39463b = interfaceC13843m;
        this.f39464c = interfaceC13830b;
        this.f39465d = interfaceC13868w;
    }

    /* JADX INFO: renamed from: a */
    private void m41126a() throws InterruptedException {
        m41129b(this.f39462a.take());
    }

    /* JADX INFO: renamed from: a */
    private void m41127a(AbstractC13850t<?> abstractC13850t) {
        TrafficStats.setThreadStatsTag(abstractC13850t.m41247s());
    }

    /* JADX INFO: renamed from: a */
    private void m41128a(AbstractC13850t<?> abstractC13850t, AbstractC13831b0 abstractC13831b0) {
        this.f39465d.mo41102a(abstractC13850t, abstractC13850t.m41230c(abstractC13831b0));
    }

    /* JADX INFO: renamed from: b */
    void m41129b(AbstractC13850t<?> abstractC13850t) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        abstractC13850t.m41220a(3);
        try {
            try {
                abstractC13850t.m41224a("network-queue-take");
                if (abstractC13850t.m41250v()) {
                    abstractC13850t.m41233c("network-discard-cancelled");
                    abstractC13850t.m41252x();
                    return;
                }
                if (abstractC13850t.m41253y()) {
                    m41127a(abstractC13850t);
                }
                C13847q c13847qMo41125a = this.f39463b.mo41125a(abstractC13850t);
                abstractC13850t.m41224a("network-http-complete");
                if (c13847qMo41125a.f39518e && abstractC13850t.m41249u()) {
                    abstractC13850t.m41233c("not-modified");
                    abstractC13850t.m41252x();
                    return;
                }
                C13867v<?> c13867vMo41116a = abstractC13850t.mo41116a(c13847qMo41125a);
                abstractC13850t.m41224a("network-parse-complete");
                if (abstractC13850t.m41254z() && c13867vMo41116a.f39591b != null) {
                    this.f39464c.mo41088a(abstractC13850t.m41236e(), c13867vMo41116a.f39591b);
                    abstractC13850t.m41224a("network-cache-written");
                }
                abstractC13850t.m41251w();
                this.f39465d.mo41103a(abstractC13850t, c13867vMo41116a);
                abstractC13850t.m41223a(c13867vMo41116a);
            } catch (AbstractC13831b0 e) {
                e.m41090a(SystemClock.elapsedRealtime() - jElapsedRealtime);
                m41128a(abstractC13850t, e);
                abstractC13850t.m41252x();
            } catch (Exception e2) {
                C13833c0.m41094a(e2, "Unhandled exception %s", e2.toString());
                C13829a0 c13829a0 = new C13829a0(e2);
                c13829a0.m41090a(SystemClock.elapsedRealtime() - jElapsedRealtime);
                this.f39465d.mo41102a(abstractC13850t, c13829a0);
                abstractC13850t.m41252x();
            }
        } finally {
            abstractC13850t.m41220a(4);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                m41126a();
            } catch (InterruptedException unused) {
                if (this.f39466e) {
                    Thread.currentThread().interrupt();
                    return;
                }
                C13833c0.m41096c("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
