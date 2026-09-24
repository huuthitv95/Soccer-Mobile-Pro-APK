package com.bytedance.sdk.component.p130di.p131ri.p138lr;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.sdk.component.p130di.p131ri.C2555lr;
import com.bytedance.sdk.component.p130di.p131ri.InterfaceC2540fi;
import com.bytedance.sdk.component.p130di.p131ri.p133fi.AbstractRunnableC2541fi;
import com.bytedance.sdk.component.p130di.p131ri.p134ik.C2547lr;
import com.bytedance.sdk.component.p130di.p131ri.p135ka.InterfaceC2552ri;
import com.bytedance.sdk.component.p130di.p131ri.p138lr.p139lr.HandlerThreadC2559ik;
import com.bytedance.sdk.component.p130di.p131ri.p138lr.p140ri.C2563ri;
import com.bytedance.sdk.component.p130di.p131ri.xha;
import java.util.Comparator;
import java.util.concurrent.Executor;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: com.bytedance.sdk.component.di.ri.lr.ka */
/* JADX INFO: loaded from: classes3.dex */
public class C2557ka {

    /* JADX INFO: renamed from: co */
    private final PriorityBlockingQueue<InterfaceC2552ri> f7085co;
    private volatile HandlerThreadC2559ik jbs;

    /* JADX INFO: renamed from: qt */
    private volatile Handler f7088qt;

    /* JADX INFO: renamed from: sf */
    private final Comparator<InterfaceC2552ri> f7089sf;

    /* JADX INFO: renamed from: ri */
    public static final C2557ka f7084ri = new C2557ka();

    /* JADX INFO: renamed from: ka */
    public static final C2563ri f7082ka = new C2563ri();

    /* JADX INFO: renamed from: fi */
    public static final AtomicLong f7081fi = new AtomicLong(0);

    /* JADX INFO: renamed from: di */
    public static final AtomicLong f7080di = new AtomicLong(0);
    public static final long xha = System.currentTimeMillis();

    /* JADX INFO: renamed from: mj */
    public static long f7083mj = 0;

    /* JADX INFO: renamed from: lr */
    public volatile boolean f7087lr = false;

    /* JADX INFO: renamed from: ik */
    public volatile boolean f7086ik = false;

    private C2557ka() {
        Comparator<InterfaceC2552ri> comparator = new Comparator<InterfaceC2552ri>() { // from class: com.bytedance.sdk.component.di.ri.lr.ka.1
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
            public int compare(InterfaceC2552ri interfaceC2552ri, InterfaceC2552ri interfaceC2552ri2) {
                return C2557ka.this.m9319ri(interfaceC2552ri, interfaceC2552ri2);
            }
        };
        this.f7089sf = comparator;
        this.f7085co = new PriorityBlockingQueue<>(8, comparator);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ri */
    public int m9319ri(InterfaceC2552ri interfaceC2552ri, InterfaceC2552ri interfaceC2552ri2) {
        long jMo9300ri;
        long jMo9299lr;
        long jMo9299lr2;
        long jMo9300ri2;
        if (interfaceC2552ri == null) {
            return interfaceC2552ri2 == null ? 0 : -1;
        }
        if (interfaceC2552ri2 == null) {
            return 1;
        }
        if (interfaceC2552ri.mo9283fi() != interfaceC2552ri2.mo9283fi()) {
            return interfaceC2552ri.mo9283fi() - interfaceC2552ri2.mo9283fi();
        }
        if (interfaceC2552ri.mo9291ri() != null) {
            jMo9300ri = interfaceC2552ri.mo9291ri().mo9300ri();
            jMo9299lr = interfaceC2552ri.mo9291ri().mo9299lr();
        } else {
            jMo9300ri = 0;
            jMo9299lr = 0;
        }
        if (interfaceC2552ri2.mo9291ri() != null) {
            jMo9300ri2 = interfaceC2552ri2.mo9291ri().mo9300ri();
            jMo9299lr2 = interfaceC2552ri2.mo9291ri().mo9299lr();
        } else {
            jMo9299lr2 = 0;
            jMo9300ri2 = 0;
        }
        if (jMo9300ri == 0 || jMo9300ri2 == 0) {
            return 0;
        }
        long j = jMo9300ri - jMo9300ri2;
        if (Math.abs(j) > 2147483647L) {
            return 0;
        }
        if (j != 0) {
            return (int) j;
        }
        if (jMo9299lr == 0 || jMo9299lr2 == 0) {
            return 0;
        }
        return (int) (jMo9299lr - jMo9299lr2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ri */
    public void m9321ri(InterfaceC2540fi interfaceC2540fi, long j) {
        HandlerThreadC2559ik handlerThreadC2559ik = this.jbs;
        if (interfaceC2540fi == null || handlerThreadC2559ik == null) {
            return;
        }
        C2563ri c2563ri = f7082ka;
        handlerThreadC2559ik.m9364ri(interfaceC2540fi.mo9224ri(c2563ri.m9394lr(j)), true);
        c2563ri.zyn();
    }

    /* JADX INFO: renamed from: ri */
    private void m9322ri(final InterfaceC2540fi interfaceC2540fi, InterfaceC2552ri interfaceC2552ri) {
        if (interfaceC2540fi != null) {
            try {
                if (interfaceC2540fi.xha()) {
                    final long jMo9299lr = (interfaceC2552ri == null || interfaceC2552ri.mo9291ri() == null) ? 0L : interfaceC2552ri.mo9291ri().mo9299lr();
                    if (jMo9299lr == 1) {
                        f7083mj = System.currentTimeMillis();
                    }
                    AtomicLong atomicLongM9409tw = f7082ka.m9409tw();
                    C2547lr.m9244ri(atomicLongM9409tw, 1);
                    if (atomicLongM9409tw.get() == 200) {
                        try {
                            if (Looper.getMainLooper() != Looper.myLooper()) {
                                m9321ri(interfaceC2540fi, jMo9299lr);
                                return;
                            }
                            Executor executorMo9218ka = interfaceC2540fi.mo9218ka();
                            if (executorMo9218ka == null) {
                                executorMo9218ka = interfaceC2540fi.mo9215fi();
                            }
                            if (executorMo9218ka != null) {
                                executorMo9218ka.execute(new AbstractRunnableC2541fi("report") { // from class: com.bytedance.sdk.component.di.ri.lr.ka.2
                                    @Override // java.lang.Runnable
                                    public void run() {
                                        C2557ka.this.m9321ri(interfaceC2540fi, jMo9299lr);
                                    }
                                });
                            }
                        } catch (Exception unused) {
                        }
                    }
                }
            } catch (Exception unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: fi */
    public void m9324fi() {
        C2547lr.m9244ri(f7082ka.dzy(), 1);
        final HandlerThreadC2559ik handlerThreadC2559ik = this.jbs;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            if (handlerThreadC2559ik != null) {
                handlerThreadC2559ik.m9362ik(2);
                return;
            }
            return;
        }
        InterfaceC2540fi interfaceC2540fiM9549vr = xha.m9524di().m9549vr();
        if (interfaceC2540fiM9549vr != null) {
            Executor executorMo9218ka = interfaceC2540fiM9549vr.mo9218ka();
            if (executorMo9218ka == null) {
                executorMo9218ka = interfaceC2540fiM9549vr.mo9215fi();
            }
            if (executorMo9218ka != null) {
                executorMo9218ka.execute(new AbstractRunnableC2541fi("flush") { // from class: com.bytedance.sdk.component.di.ri.lr.ka.3
                    @Override // java.lang.Runnable
                    public void run() {
                        HandlerThreadC2559ik handlerThreadC2559ik2 = handlerThreadC2559ik;
                        if (handlerThreadC2559ik2 != null) {
                            handlerThreadC2559ik2.m9362ik(2);
                        }
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: ik */
    public void m9325ik() {
        if (this.jbs == null || !this.jbs.isAlive()) {
            return;
        }
        synchronized (this) {
            if (this.jbs != null && this.jbs.isAlive()) {
                if (this.f7088qt != null) {
                    this.f7088qt.removeCallbacksAndMessages(null);
                }
                this.jbs.m9365ri(false);
                this.jbs.quitSafely();
                this.jbs = null;
            }
        }
    }

    /* JADX INFO: renamed from: ka */
    public boolean m9326ka() {
        try {
            if (this.jbs != null || C2555lr.m9310lr()) {
                return false;
            }
            synchronized (this) {
                if (this.jbs != null) {
                    return false;
                }
                this.jbs = new HandlerThreadC2559ik(this.f7085co);
                this.jbs.start();
                return true;
            }
        } catch (Throwable th) {
            th.getMessage();
            return false;
        }
    }

    /* JADX INFO: renamed from: lr */
    public void m9327lr() {
        m9326ka();
        m9324fi();
    }

    /* JADX INFO: renamed from: ri */
    public PriorityBlockingQueue<InterfaceC2552ri> m9328ri() {
        return this.f7085co;
    }

    /* JADX INFO: renamed from: ri */
    public void m9329ri(Handler handler) {
        this.f7088qt = handler;
    }

    /* JADX INFO: renamed from: ri */
    public void m9330ri(InterfaceC2552ri interfaceC2552ri, int i) {
        m9326ka();
        InterfaceC2540fi interfaceC2540fiM9549vr = xha.m9524di().m9549vr();
        HandlerThreadC2559ik handlerThreadC2559ik = this.jbs;
        if (handlerThreadC2559ik != null) {
            m9322ri(interfaceC2540fiM9549vr, interfaceC2552ri);
            handlerThreadC2559ik.m9364ri(interfaceC2552ri, interfaceC2552ri.mo9283fi() == 4);
        }
    }
}
