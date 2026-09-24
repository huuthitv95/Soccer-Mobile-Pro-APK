package com.bytedance.sdk.component.p130di.p131ri.p138lr.p139lr;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import androidx.work.WorkRequest;
import com.bytedance.sdk.component.p130di.p131ri.C2555lr;
import com.bytedance.sdk.component.p130di.p131ri.InterfaceC2540fi;
import com.bytedance.sdk.component.p130di.p131ri.p133fi.AbstractRunnableC2541fi;
import com.bytedance.sdk.component.p130di.p131ri.p134ik.C2547lr;
import com.bytedance.sdk.component.p130di.p131ri.p134ik.C2548ri;
import com.bytedance.sdk.component.p130di.p131ri.p135ka.C2550lr;
import com.bytedance.sdk.component.p130di.p131ri.p135ka.InterfaceC2552ri;
import com.bytedance.sdk.component.p130di.p131ri.p138lr.C2557ka;
import com.bytedance.sdk.component.p130di.p131ri.p138lr.InterfaceC2556ik;
import com.bytedance.sdk.component.p130di.p131ri.p138lr.InterfaceC2558lr;
import com.bytedance.sdk.component.p130di.p131ri.p141ri.C2569lr;
import com.bytedance.sdk.component.p130di.p131ri.p141ri.InterfaceC2568ka;
import com.bytedance.sdk.component.p130di.p131ri.xha;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.component.di.ri.lr.lr.ik */
/* JADX INFO: loaded from: classes3.dex */
public class HandlerThreadC2559ik extends HandlerThread implements Handler.Callback {

    /* JADX INFO: renamed from: bu */
    private static int f7096bu = 10;
    private static int tan = 200;

    /* JADX INFO: renamed from: ac */
    private final int f7097ac;

    /* JADX INFO: renamed from: aw */
    private volatile Handler f7098aw;
    private final List<InterfaceC2552ri> bgr;

    /* JADX INFO: renamed from: co */
    private final AtomicInteger f7099co;

    /* JADX INFO: renamed from: di */
    private volatile int f7100di;

    /* JADX INFO: renamed from: fi */
    private final PriorityBlockingQueue<InterfaceC2552ri> f7101fi;
    private final int ihz;

    /* JADX INFO: renamed from: ik */
    private final Object f7102ik;
    private final AtomicInteger jbs;

    /* JADX INFO: renamed from: ka */
    private InterfaceC2556ik f7103ka;

    /* JADX INFO: renamed from: lr */
    private volatile boolean f7104lr;

    /* JADX INFO: renamed from: mj */
    private volatile long f7105mj;

    /* JADX INFO: renamed from: nr */
    private long f7106nr;

    /* JADX INFO: renamed from: qt */
    private final long f7107qt;

    /* JADX INFO: renamed from: ri */
    protected InterfaceC2568ka f7108ri;

    /* JADX INFO: renamed from: sf */
    private final long f7109sf;
    private final AtomicInteger slm;

    /* JADX INFO: renamed from: uq */
    private final int f7110uq;

    /* JADX INFO: renamed from: vr */
    private final AtomicInteger f7111vr;
    private volatile long xha;

    public HandlerThreadC2559ik(PriorityBlockingQueue<InterfaceC2552ri> priorityBlockingQueue) {
        super("csj_log");
        this.f7104lr = true;
        this.f7102ik = new Object();
        this.xha = 0L;
        this.f7105mj = 0L;
        this.jbs = new AtomicInteger(0);
        this.f7107qt = 5000L;
        this.f7109sf = 5000000000L;
        this.f7099co = new AtomicInteger(0);
        this.bgr = new ArrayList();
        this.f7111vr = new AtomicInteger(0);
        this.slm = new AtomicInteger(0);
        this.f7106nr = 60000L;
        this.f7097ac = 1;
        this.ihz = 2;
        this.f7110uq = 3;
        this.f7101fi = priorityBlockingQueue;
        this.f7108ri = new C2569lr();
        if (C2555lr.m9310lr()) {
            return;
        }
        long jMo9213co = xha.m9524di().m9549vr().mo9213co();
        if (jMo9213co > 0) {
            this.f7106nr = jMo9213co;
        }
    }

    /* JADX INFO: renamed from: di */
    private void m9333di() {
        C2547lr.m9244ri(C2557ka.f7082ka.m9410uq(), 1);
        m9365ri(false);
        C2557ka.f7084ri.m9325ik();
    }

    /* JADX INFO: renamed from: fi */
    private void m9334fi() {
        while (m9366ri()) {
            try {
                C2547lr.m9244ri(C2557ka.f7082ka.m9395mj(), 1);
                InterfaceC2552ri interfaceC2552riPoll = this.f7101fi.poll(this.f7106nr, TimeUnit.MILLISECONDS);
                int size = this.f7101fi.size();
                if (interfaceC2552riPoll instanceof C2550lr) {
                    m9351ri(interfaceC2552riPoll, size);
                } else if (interfaceC2552riPoll == null) {
                    int iIncrementAndGet = this.jbs.incrementAndGet();
                    C2547lr.m9244ri(C2557ka.f7082ka.feb(), 1);
                    if (m9338ka(iIncrementAndGet)) {
                        m9333di();
                        return;
                    } else if (iIncrementAndGet < 4) {
                        this.f7100di = 1;
                        m9342lr((InterfaceC2552ri) null);
                    }
                } else {
                    m9350ri(interfaceC2552riPoll);
                    m9342lr(interfaceC2552riPoll);
                }
            } catch (Throwable th) {
                th.getMessage();
                C2547lr.m9244ri(C2557ka.f7082ka.m9401qd(), 1);
            }
        }
    }

    /* JADX INFO: renamed from: fi */
    private void m9335fi(int i) {
        if (m9366ri()) {
            C2547lr.m9244ri(C2557ka.f7082ka.m9404ri(), 1);
            return;
        }
        if (this.f7098aw == null) {
            return;
        }
        C2547lr.m9244ri(C2557ka.f7082ka.m9389ik(), 1);
        if (this.f7098aw.hasMessages(1)) {
            return;
        }
        if (i == 1) {
            C2547lr.m9244ri(C2557ka.f7082ka.m9383di(), 1);
        } else if (i == 2) {
            C2547lr.m9244ri(C2557ka.f7082ka.m9391ka(), 1);
        } else if (i == 3) {
            C2547lr.m9244ri(C2557ka.f7082ka.m9386fi(), 1);
        }
        this.f7098aw.sendEmptyMessage(1);
    }

    /* JADX INFO: renamed from: ik */
    private void m9336ik() {
        m9337ka();
        C2547lr.m9244ri(C2557ka.f7082ka.m9400pv(), 1);
        m9362ik(1);
    }

    private void jbs() {
        try {
            if (this.f7101fi.size() == 0 && this.f7098aw.hasMessages(11) && m9366ri()) {
                m9365ri(false);
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }

    /* JADX INFO: renamed from: ka */
    private void m9337ka() {
        if (!isAlive()) {
            C2557ka.f7084ri.m9326ka();
        } else {
            if (m9366ri()) {
                return;
            }
            m9362ik(6);
        }
    }

    /* JADX INFO: renamed from: ka */
    private boolean m9338ka(int i) {
        return i >= 4 && this.f7099co.get() == 0 && !C2557ka.f7084ri.f7087lr && !C2557ka.f7084ri.f7086ik;
    }

    /* JADX INFO: renamed from: lr */
    private void m9340lr() {
        long jSlm = xha.m9524di().slm();
        if (jSlm <= 0) {
            return;
        }
        this.f7108ri.mo9449ri(Integer.MAX_VALUE, jSlm);
    }

    /* JADX INFO: renamed from: lr */
    public static void m9341lr(int i) {
        tan = i;
    }

    /* JADX INFO: renamed from: lr */
    private void m9342lr(InterfaceC2552ri interfaceC2552ri) {
        List<InterfaceC2552ri> listMo9448ri;
        if (C2548ri.m9257lr() && xha.m9524di().m9547ri()) {
            return;
        }
        int i = 0;
        if (m9345mj()) {
            C2548ri.m9260ri(this.f7100di);
            C2547lr.m9244ri(C2557ka.f7082ka.m9382co(), 1);
            if (this.f7101fi.size() != 0) {
                return;
            }
            if (this.f7098aw.hasMessages(2)) {
                m9365ri(false);
                return;
            }
            C2557ka.f7084ri.f7087lr = false;
            this.f7105mj = 0L;
            this.xha = 0L;
            this.f7111vr.set(0);
            this.slm.set(0);
        }
        do {
            boolean zM9367ri = m9367ri(this.f7100di, C2557ka.f7084ri.f7087lr);
            C2548ri.m9269ri(zM9367ri, this.f7100di, interfaceC2552ri);
            C2547lr.m9244ri(C2557ka.f7082ka.m9379aw(), 1);
            if (!zM9367ri || (listMo9448ri = this.f7108ri.mo9448ri(this.f7100di, -1, null)) == null) {
                jbs();
            } else {
                listMo9448ri.size();
                m9356ri(listMo9448ri);
            }
            i++;
            if (!zM9367ri) {
                return;
            }
        } while (i <= 6);
    }

    /* JADX INFO: renamed from: lr */
    private void m9343lr(List<InterfaceC2552ri> list) {
        this.bgr.addAll(list);
        this.bgr.size();
        InterfaceC2540fi interfaceC2540fiM9549vr = xha.m9524di().m9549vr();
        if (interfaceC2540fiM9549vr != null && interfaceC2540fiM9549vr.mo9229sf() != null) {
            f7096bu = interfaceC2540fiM9549vr.mo9229sf().m9175lr();
        }
        if (this.bgr.size() >= f7096bu) {
            if (this.f7098aw.hasMessages(11)) {
                this.f7098aw.removeMessages(11);
            }
            ArrayList arrayList = new ArrayList(this.bgr);
            this.bgr.clear();
            m9360ri((List<InterfaceC2552ri>) arrayList, false, "max_size_dispatch");
            m9346qt();
            return;
        }
        if (this.f7101fi.size() != 0) {
            this.bgr.size();
            return;
        }
        m9365ri(false);
        if (this.f7098aw.hasMessages(11)) {
            this.f7098aw.removeMessages(11);
        }
        if (this.f7098aw.hasMessages(1)) {
            this.f7098aw.removeMessages(1);
        }
        long jM9176ri = tan;
        if (interfaceC2540fiM9549vr != null && interfaceC2540fiM9549vr.mo9229sf() != null) {
            jM9176ri = interfaceC2540fiM9549vr.mo9229sf().m9176ri();
        }
        this.f7098aw.sendEmptyMessageDelayed(11, jM9176ri);
    }

    /* JADX INFO: renamed from: lr */
    private void m9344lr(List<InterfaceC2552ri> list, final boolean z, final long j) {
        this.f7099co.incrementAndGet();
        C2547lr.m9244ri(C2557ka.f7082ka.aac(), 1);
        try {
            HashMap map = new HashMap();
            Iterator<InterfaceC2552ri> it = list.iterator();
            while (it.hasNext()) {
                InterfaceC2552ri next = it.next();
                int iJbs = next == null ? 0 : next.jbs();
                if (map.get(Integer.valueOf(iJbs)) == null) {
                    map.put(Integer.valueOf(iJbs), new ArrayList());
                }
                ((List) map.get(Integer.valueOf(iJbs))).add(next);
            }
            for (Integer num : map.keySet()) {
                if (num.intValue() == 0 || xha.m9524di().m9533lr() == null || xha.m9524di().m9533lr().get(num) == null) {
                    this.f7103ka.mo9318ri(list, new InterfaceC2558lr() { // from class: com.bytedance.sdk.component.di.ri.lr.lr.ik.2
                        @Override // com.bytedance.sdk.component.p130di.p131ri.p138lr.InterfaceC2558lr
                        /* JADX INFO: renamed from: ri */
                        public void mo9332ri(List<C2561ri> list2) {
                            try {
                                HandlerThreadC2559ik.this.f7099co.decrementAndGet();
                                if (list2 == null || list2.size() == 0) {
                                    return;
                                }
                                int size = list2.size();
                                for (int i = 0; i < size; i++) {
                                    C2561ri c2561ri = list2.get(i);
                                    if (c2561ri != null) {
                                        HandlerThreadC2559ik.this.m9361ri(z, c2561ri.m9369ri(), c2561ri.m9368lr(), j);
                                    }
                                }
                            } catch (Exception unused) {
                            }
                        }
                    });
                } else {
                    xha.m9524di().m9533lr().get(num).mo9318ri(list, new InterfaceC2558lr() { // from class: com.bytedance.sdk.component.di.ri.lr.lr.ik.3
                        @Override // com.bytedance.sdk.component.p130di.p131ri.p138lr.InterfaceC2558lr
                        /* JADX INFO: renamed from: ri */
                        public void mo9332ri(List<C2561ri> list2) {
                            try {
                                HandlerThreadC2559ik.this.f7099co.decrementAndGet();
                                if (list2 == null || list2.size() == 0) {
                                    return;
                                }
                                int size = list2.size();
                                for (int i = 0; i < size; i++) {
                                    C2561ri c2561ri = list2.get(i);
                                    if (c2561ri != null) {
                                        HandlerThreadC2559ik.this.m9361ri(z, c2561ri.m9369ri(), c2561ri.m9368lr(), j);
                                    }
                                }
                            } catch (Exception unused) {
                            }
                        }
                    });
                }
            }
        } catch (Exception e) {
            e.getMessage();
            C2547lr.m9244ri(C2557ka.f7082ka.m9401qd(), 1);
            this.f7099co.decrementAndGet();
        }
    }

    /* JADX INFO: renamed from: mj */
    private boolean m9345mj() {
        if (C2557ka.f7084ri.f7087lr) {
            return this.f7100di == 4 || this.f7100di == 7 || this.f7100di == 6 || this.f7100di == 5 || this.f7100di == 2;
        }
        return false;
    }

    /* JADX INFO: renamed from: qt */
    private void m9346qt() {
        if (this.f7098aw.hasMessages(11)) {
            jbs();
        } else {
            m9335fi(1);
        }
        C2547lr.m9244ri(C2557ka.f7082ka.m9393lr(), 1);
        if (this.f7100di != 2) {
            return;
        }
        C2547lr.m9244ri(C2557ka.f7082ka.xha(), 1);
        synchronized (this.f7102ik) {
            try {
                try {
                    long jNanoTime = System.nanoTime();
                    this.f7102ik.wait(5000L);
                    long jNanoTime2 = System.nanoTime() - jNanoTime;
                    if (!C2557ka.f7084ri.f7087lr) {
                        boolean z = C2557ka.f7084ri.f7086ik;
                    }
                    if (jNanoTime2 < 5000000000L && 5000000000L - jNanoTime2 >= 50000000) {
                        if (!C2557ka.f7084ri.f7087lr && !C2557ka.f7084ri.f7086ik) {
                            C2547lr.m9244ri(C2557ka.f7082ka.m9388ig(), 1);
                            m9362ik(2);
                            return;
                        }
                        C2547lr.m9244ri(C2557ka.f7082ka.m9406sf(), 1);
                        return;
                    }
                    C2547lr.m9244ri(C2557ka.f7082ka.m9403qt(), 1);
                } catch (InterruptedException e) {
                    e.getMessage();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ri */
    public static void m9348ri(int i) {
        f7096bu = i;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0069 A[Catch: all -> 0x00fd, TryCatch #0 {, blocks: (B:5:0x0005, B:8:0x000b, B:53:0x00eb, B:55:0x00ef, B:56:0x00f4, B:18:0x0030, B:20:0x0040, B:22:0x0042, B:24:0x004f, B:26:0x0051, B:28:0x005f, B:29:0x0064, B:30:0x0069, B:32:0x006f, B:34:0x0075, B:36:0x0085, B:37:0x008a, B:39:0x0092, B:40:0x0097, B:41:0x00b4, B:43:0x00c4, B:45:0x00c6, B:47:0x00d3, B:49:0x00d5, B:51:0x00e3, B:52:0x00e8, B:59:0x00fb), top: B:64:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0075 A[Catch: all -> 0x00fd, TryCatch #0 {, blocks: (B:5:0x0005, B:8:0x000b, B:53:0x00eb, B:55:0x00ef, B:56:0x00f4, B:18:0x0030, B:20:0x0040, B:22:0x0042, B:24:0x004f, B:26:0x0051, B:28:0x005f, B:29:0x0064, B:30:0x0069, B:32:0x006f, B:34:0x0075, B:36:0x0085, B:37:0x008a, B:39:0x0092, B:40:0x0097, B:41:0x00b4, B:43:0x00c4, B:45:0x00c6, B:47:0x00d3, B:49:0x00d5, B:51:0x00e3, B:52:0x00e8, B:59:0x00fb), top: B:64:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x0085 A[Catch: all -> 0x00fd, TryCatch #0 {, blocks: (B:5:0x0005, B:8:0x000b, B:53:0x00eb, B:55:0x00ef, B:56:0x00f4, B:18:0x0030, B:20:0x0040, B:22:0x0042, B:24:0x004f, B:26:0x0051, B:28:0x005f, B:29:0x0064, B:30:0x0069, B:32:0x006f, B:34:0x0075, B:36:0x0085, B:37:0x008a, B:39:0x0092, B:40:0x0097, B:41:0x00b4, B:43:0x00c4, B:45:0x00c6, B:47:0x00d3, B:49:0x00d5, B:51:0x00e3, B:52:0x00e8, B:59:0x00fb), top: B:64:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x0092 A[Catch: all -> 0x00fd, TryCatch #0 {, blocks: (B:5:0x0005, B:8:0x000b, B:53:0x00eb, B:55:0x00ef, B:56:0x00f4, B:18:0x0030, B:20:0x0040, B:22:0x0042, B:24:0x004f, B:26:0x0051, B:28:0x005f, B:29:0x0064, B:30:0x0069, B:32:0x006f, B:34:0x0075, B:36:0x0085, B:37:0x008a, B:39:0x0092, B:40:0x0097, B:41:0x00b4, B:43:0x00c4, B:45:0x00c6, B:47:0x00d3, B:49:0x00d5, B:51:0x00e3, B:52:0x00e8, B:59:0x00fb), top: B:64:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00b4 A[Catch: all -> 0x00fd, TryCatch #0 {, blocks: (B:5:0x0005, B:8:0x000b, B:53:0x00eb, B:55:0x00ef, B:56:0x00f4, B:18:0x0030, B:20:0x0040, B:22:0x0042, B:24:0x004f, B:26:0x0051, B:28:0x005f, B:29:0x0064, B:30:0x0069, B:32:0x006f, B:34:0x0075, B:36:0x0085, B:37:0x008a, B:39:0x0092, B:40:0x0097, B:41:0x00b4, B:43:0x00c4, B:45:0x00c6, B:47:0x00d3, B:49:0x00d5, B:51:0x00e3, B:52:0x00e8, B:59:0x00fb), top: B:64:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00c4 A[Catch: all -> 0x00fd, DONT_GENERATE, TryCatch #0 {, blocks: (B:5:0x0005, B:8:0x000b, B:53:0x00eb, B:55:0x00ef, B:56:0x00f4, B:18:0x0030, B:20:0x0040, B:22:0x0042, B:24:0x004f, B:26:0x0051, B:28:0x005f, B:29:0x0064, B:30:0x0069, B:32:0x006f, B:34:0x0075, B:36:0x0085, B:37:0x008a, B:39:0x0092, B:40:0x0097, B:41:0x00b4, B:43:0x00c4, B:45:0x00c6, B:47:0x00d3, B:49:0x00d5, B:51:0x00e3, B:52:0x00e8, B:59:0x00fb), top: B:64:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00c6 A[Catch: all -> 0x00fd, TryCatch #0 {, blocks: (B:5:0x0005, B:8:0x000b, B:53:0x00eb, B:55:0x00ef, B:56:0x00f4, B:18:0x0030, B:20:0x0040, B:22:0x0042, B:24:0x004f, B:26:0x0051, B:28:0x005f, B:29:0x0064, B:30:0x0069, B:32:0x006f, B:34:0x0075, B:36:0x0085, B:37:0x008a, B:39:0x0092, B:40:0x0097, B:41:0x00b4, B:43:0x00c4, B:45:0x00c6, B:47:0x00d3, B:49:0x00d5, B:51:0x00e3, B:52:0x00e8, B:59:0x00fb), top: B:64:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00d3 A[Catch: all -> 0x00fd, DONT_GENERATE, TryCatch #0 {, blocks: (B:5:0x0005, B:8:0x000b, B:53:0x00eb, B:55:0x00ef, B:56:0x00f4, B:18:0x0030, B:20:0x0040, B:22:0x0042, B:24:0x004f, B:26:0x0051, B:28:0x005f, B:29:0x0064, B:30:0x0069, B:32:0x006f, B:34:0x0075, B:36:0x0085, B:37:0x008a, B:39:0x0092, B:40:0x0097, B:41:0x00b4, B:43:0x00c4, B:45:0x00c6, B:47:0x00d3, B:49:0x00d5, B:51:0x00e3, B:52:0x00e8, B:59:0x00fb), top: B:64:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00d5 A[Catch: all -> 0x00fd, TryCatch #0 {, blocks: (B:5:0x0005, B:8:0x000b, B:53:0x00eb, B:55:0x00ef, B:56:0x00f4, B:18:0x0030, B:20:0x0040, B:22:0x0042, B:24:0x004f, B:26:0x0051, B:28:0x005f, B:29:0x0064, B:30:0x0069, B:32:0x006f, B:34:0x0075, B:36:0x0085, B:37:0x008a, B:39:0x0092, B:40:0x0097, B:41:0x00b4, B:43:0x00c4, B:45:0x00c6, B:47:0x00d3, B:49:0x00d5, B:51:0x00e3, B:52:0x00e8, B:59:0x00fb), top: B:64:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00e3 A[Catch: all -> 0x00fd, TryCatch #0 {, blocks: (B:5:0x0005, B:8:0x000b, B:53:0x00eb, B:55:0x00ef, B:56:0x00f4, B:18:0x0030, B:20:0x0040, B:22:0x0042, B:24:0x004f, B:26:0x0051, B:28:0x005f, B:29:0x0064, B:30:0x0069, B:32:0x006f, B:34:0x0075, B:36:0x0085, B:37:0x008a, B:39:0x0092, B:40:0x0097, B:41:0x00b4, B:43:0x00c4, B:45:0x00c6, B:47:0x00d3, B:49:0x00d5, B:51:0x00e3, B:52:0x00e8, B:59:0x00fb), top: B:64:0x0005 }] */
    /* JADX INFO: renamed from: ri */
    private void m9349ri(int i, List<InterfaceC2552ri> list, long j) {
        synchronized (this.f7102ik) {
            if (list != null) {
                if (this.f7098aw != null) {
                    C2548ri.m9263ri(i, list, j);
                    this.f7108ri.mo9450ri(i, list);
                    xha.m9524di().m9549vr();
                    if (i == -2) {
                        C2557ka.f7084ri.f7087lr = false;
                        C2557ka.f7084ri.f7086ik = true;
                        if (this.f7098aw.hasMessages(3)) {
                            return;
                        }
                        if (System.currentTimeMillis() - this.f7105mj < 15000) {
                            return;
                        }
                        this.f7105mj = System.currentTimeMillis();
                        if (this.f7098aw.hasMessages(2)) {
                            this.f7098aw.removeMessages(2);
                        }
                        m9363ri(3, 15000L);
                    } else if (i == -1) {
                        if (C2557ka.f7084ri.f7087lr || C2557ka.f7084ri.f7086ik) {
                            C2557ka.f7084ri.f7087lr = false;
                            C2557ka.f7084ri.f7086ik = false;
                            if (this.f7098aw.hasMessages(2)) {
                                this.f7098aw.removeMessages(2);
                            }
                            if (this.f7098aw.hasMessages(3)) {
                                this.f7098aw.removeMessages(3);
                            }
                            this.f7105mj = 0L;
                            this.xha = 0L;
                            this.f7111vr.set(0);
                            this.slm.set(0);
                            C2547lr.m9244ri(C2557ka.f7082ka.srn(), 1);
                            m9362ik(2);
                        }
                    } else if (i == 0) {
                        C2557ka.f7084ri.f7087lr = false;
                        C2557ka.f7084ri.f7086ik = true;
                        if (this.f7098aw.hasMessages(3)) {
                            return;
                        }
                        if (System.currentTimeMillis() - this.f7105mj < 15000) {
                            return;
                        }
                        this.f7105mj = System.currentTimeMillis();
                        if (this.f7098aw.hasMessages(2)) {
                            this.f7098aw.removeMessages(2);
                        }
                        m9363ri(3, 15000L);
                    } else if (i != 200) {
                        if (i == 509) {
                            C2557ka.f7084ri.f7087lr = true;
                            C2557ka.f7084ri.f7086ik = false;
                            if (this.f7098aw.hasMessages(2)) {
                                return;
                            }
                            if (System.currentTimeMillis() - this.xha < WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS) {
                                return;
                            }
                            this.xha = System.currentTimeMillis();
                            if (this.f7098aw.hasMessages(3)) {
                                this.f7098aw.removeMessages(3);
                            }
                            m9363ri(2, WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS);
                        }
                    } else if (C2557ka.f7084ri.f7087lr) {
                        C2557ka.f7084ri.f7087lr = false;
                        C2557ka.f7084ri.f7086ik = false;
                        if (this.f7098aw.hasMessages(2)) {
                            this.f7098aw.removeMessages(2);
                        }
                        if (this.f7098aw.hasMessages(3)) {
                            this.f7098aw.removeMessages(3);
                        }
                        this.f7105mj = 0L;
                        this.xha = 0L;
                        this.f7111vr.set(0);
                        this.slm.set(0);
                        C2547lr.m9244ri(C2557ka.f7082ka.srn(), 1);
                        m9362ik(2);
                    } else {
                        C2557ka.f7084ri.f7087lr = false;
                        C2557ka.f7084ri.f7086ik = false;
                        if (this.f7098aw.hasMessages(2)) {
                            this.f7098aw.removeMessages(2);
                        }
                        if (this.f7098aw.hasMessages(3)) {
                            this.f7098aw.removeMessages(3);
                        }
                        this.f7105mj = 0L;
                        this.xha = 0L;
                        this.f7111vr.set(0);
                        this.slm.set(0);
                        C2547lr.m9244ri(C2557ka.f7082ka.srn(), 1);
                        m9362ik(2);
                    }
                    if (this.f7100di == 2) {
                        this.f7102ik.notify();
                    }
                    this.f7101fi.size();
                }
            }
        }
    }

    /* JADX INFO: renamed from: ri */
    private void m9350ri(InterfaceC2552ri interfaceC2552ri) {
        this.jbs.set(0);
        if (C2557ka.f7084ri.f7087lr) {
            this.f7100di = 5;
        } else if (C2557ka.f7084ri.f7086ik) {
            this.f7100di = 7;
        } else {
            this.f7100di = 4;
        }
        C2547lr.m9244ri(C2557ka.f7082ka.siy(), 1);
        this.f7108ri.mo9451ri(interfaceC2552ri, this.f7100di);
        C2548ri.xha(interfaceC2552ri);
    }

    /* JADX INFO: renamed from: ri */
    private void m9351ri(InterfaceC2552ri interfaceC2552ri, int i) {
        this.jbs.set(0);
        if (i == 0) {
            this.f7100di = ((C2550lr) interfaceC2552ri).m9290qt();
            if (this.f7100di != 6) {
                C2547lr.m9244ri(C2557ka.f7082ka.m9392kt(), 1);
                m9342lr(interfaceC2552ri);
                return;
            }
            return;
        }
        C2550lr c2550lr = (C2550lr) interfaceC2552ri;
        if (c2550lr.m9290qt() == 1) {
            this.f7100di = 1;
            m9342lr(interfaceC2552ri);
        } else if (c2550lr.m9290qt() == 2) {
            xha();
            this.f7100di = 2;
            m9342lr(interfaceC2552ri);
        }
    }

    /* JADX INFO: renamed from: ri */
    private void m9354ri(C2560lr c2560lr, List<InterfaceC2552ri> list) {
        if (c2560lr == null || !c2560lr.f7126ri) {
            return;
        }
        List<Object> listM9311ri = C2555lr.m9311ri();
        if (list == null || listM9311ri == null || listM9311ri.size() == 0) {
            return;
        }
        for (InterfaceC2552ri interfaceC2552ri : list) {
            if (interfaceC2552ri.mo9283fi() == 1) {
                C2548ri.m9261ri(interfaceC2552ri);
                C2548ri.m9247fi(interfaceC2552ri);
                Iterator<Object> it = listM9311ri.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
        }
    }

    /* JADX INFO: renamed from: ri */
    private void m9355ri(String str) {
        if (this.f7098aw.hasMessages(11)) {
            this.f7098aw.removeMessages(11);
        }
        if (this.bgr.size() != 0) {
            ArrayList arrayList = new ArrayList(this.bgr);
            this.bgr.clear();
            m9360ri((List<InterfaceC2552ri>) arrayList, false, "before_".concat(String.valueOf(str)));
            m9346qt();
            arrayList.size();
        }
    }

    /* JADX INFO: renamed from: ri */
    private void m9356ri(List<InterfaceC2552ri> list) {
        if (list.size() == 0) {
            jbs();
            return;
        }
        C2548ri.m9265ri(list, this.f7101fi.size());
        if (list.size() > 1 || C2548ri.m9251ik()) {
            m9357ri(list, "batchRead");
            return;
        }
        InterfaceC2552ri interfaceC2552ri = list.get(0);
        if (interfaceC2552ri != null) {
            if (interfaceC2552ri.mo9283fi() == 1) {
                m9357ri(list, "highPriority");
                return;
            }
            if (interfaceC2552ri.mo9286ka() == 0 && interfaceC2552ri.mo9283fi() == 2) {
                if (interfaceC2552ri.mo9287lr() == 3) {
                    m9357ri(list, "version_v3");
                    return;
                } else {
                    m9343lr(list);
                    return;
                }
            }
            if (interfaceC2552ri.mo9286ka() == 1) {
                m9357ri(list, "stats");
            } else if (interfaceC2552ri.mo9286ka() == 3) {
                m9357ri(list, "adType_v3");
            } else if (interfaceC2552ri.mo9286ka() == 2) {
                m9357ri(list, "other");
            }
        }
    }

    /* JADX INFO: renamed from: ri */
    private void m9357ri(List<InterfaceC2552ri> list, String str) {
        m9355ri(str);
        m9360ri(list, false, str);
        m9346qt();
    }

    /* JADX INFO: renamed from: ri */
    private void m9358ri(final List<InterfaceC2552ri> list, final boolean z, final long j) {
        InterfaceC2540fi interfaceC2540fiM9549vr = xha.m9524di().m9549vr();
        if (interfaceC2540fiM9549vr != null) {
            Executor executorMo9215fi = interfaceC2540fiM9549vr.mo9215fi();
            if (list.get(0).mo9283fi() == 1) {
                executorMo9215fi = interfaceC2540fiM9549vr.mo9218ka();
            }
            if (executorMo9215fi == null) {
                return;
            }
            this.f7099co.incrementAndGet();
            executorMo9215fi.execute(new AbstractRunnableC2541fi("csj_log_upload") { // from class: com.bytedance.sdk.component.di.ri.lr.lr.ik.1
                @Override // java.lang.Runnable
                public void run() {
                    HandlerThreadC2559ik handlerThreadC2559ik = HandlerThreadC2559ik.this;
                    handlerThreadC2559ik.m9359ri((List<InterfaceC2552ri>) list, z, j, handlerThreadC2559ik.f7100di);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ri */
    public void m9359ri(List<InterfaceC2552ri> list, boolean z, long j, int i) {
        HandlerThreadC2559ik handlerThreadC2559ik;
        Throwable th;
        C2560lr c2560lrMo9241ri;
        try {
            InterfaceC2552ri interfaceC2552ri = list.get(0);
            C2547lr.m9244ri(C2557ka.f7082ka.aac(), 1);
            try {
                if (interfaceC2552ri.mo9286ka() == 0) {
                    c2560lrMo9241ri = xha.m9525ka().mo9240ri(list);
                    m9354ri(c2560lrMo9241ri, list);
                    if (c2560lrMo9241ri != null) {
                        C2548ri.m9267ri(list, c2560lrMo9241ri.f7124ka);
                    }
                } else {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        JSONArray jSONArray = new JSONArray();
                        Iterator<InterfaceC2552ri> it = list.iterator();
                        while (it.hasNext()) {
                            jSONArray.put(it.next().mo9282di());
                        }
                        jSONObject.put("stats_list", jSONArray);
                    } catch (Exception e) {
                        e.getMessage();
                    }
                    c2560lrMo9241ri = xha.m9525ka().mo9241ri(jSONObject);
                }
                C2560lr c2560lr = c2560lrMo9241ri;
                this.f7099co.decrementAndGet();
                handlerThreadC2559ik = this;
                try {
                    handlerThreadC2559ik.m9361ri(z, c2560lr, list, j);
                } catch (Throwable th2) {
                    th = th2;
                    th = th;
                    th.getMessage();
                    C2547lr.m9244ri(C2557ka.f7082ka.m9401qd(), 1);
                    handlerThreadC2559ik.f7099co.decrementAndGet();
                }
            } catch (Throwable th3) {
                th = th3;
                handlerThreadC2559ik = this;
                th.getMessage();
                C2547lr.m9244ri(C2557ka.f7082ka.m9401qd(), 1);
                handlerThreadC2559ik.f7099co.decrementAndGet();
            }
        } catch (Throwable th4) {
            th = th4;
            handlerThreadC2559ik = this;
        }
    }

    /* JADX INFO: renamed from: ri */
    private void m9360ri(List<InterfaceC2552ri> list, boolean z, String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        C2548ri.m9266ri(list, this.f7100di, str);
        InterfaceC2556ik interfaceC2556ikXha = xha.m9524di().xha();
        this.f7103ka = interfaceC2556ikXha;
        if (interfaceC2556ikXha != null) {
            m9344lr(list, z, jCurrentTimeMillis);
        } else {
            m9358ri(list, z, jCurrentTimeMillis);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ri */
    public void m9361ri(boolean z, C2560lr c2560lr, List<InterfaceC2552ri> list, long j) {
        if (z || c2560lr == null) {
            return;
        }
        int i = c2560lr.f7125lr;
        int i2 = -2;
        if (c2560lr.f7122fi) {
            i = -1;
        } else if (i < 0) {
            i = -2;
        }
        if (i == 510 || i == 511) {
            i = -2;
        }
        if (c2560lr.f7126ri || ((i < 500 || i >= 509) && i <= 513 && i != 404)) {
            i2 = i;
        }
        if (list != null) {
            list.size();
            this.f7099co.get();
        }
        m9349ri(i2, list, j);
    }

    private void xha() {
        if (this.f7101fi.size() >= 100) {
            for (int i = 0; i < 100; i++) {
                InterfaceC2552ri interfaceC2552riPoll = this.f7101fi.poll();
                if (!(interfaceC2552riPoll instanceof C2550lr) && interfaceC2552riPoll != null) {
                    m9350ri(interfaceC2552riPoll);
                }
            }
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        int i = message.what;
        try {
            if (i == 1) {
                C2547lr.m9244ri(C2557ka.f7082ka.jbs(), 1);
                m9340lr();
                m9365ri(true);
                m9334fi();
            } else {
                if (i != 2 && i != 3) {
                    if (i == 11) {
                        ArrayList arrayList = new ArrayList(this.bgr);
                        this.bgr.clear();
                        m9360ri((List<InterfaceC2552ri>) arrayList, false, "timeout_dispatch");
                        m9346qt();
                    }
                    return true;
                }
                m9336ik();
            }
        } catch (Throwable th) {
            th.getMessage();
        }
        return true;
    }

    /* JADX INFO: renamed from: ik */
    public void m9362ik(int i) {
        try {
            boolean zM9367ri = m9367ri(i, C2557ka.f7084ri.f7087lr);
            if (i != 6 && !zM9367ri) {
                return;
            }
            C2550lr c2550lr = new C2550lr();
            c2550lr.m9292ri(i);
            this.f7101fi.add(c2550lr);
            m9335fi(3);
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // android.os.HandlerThread
    protected void onLooperPrepared() {
        super.onLooperPrepared();
        this.f7098aw = new Handler(getLooper(), this);
        C2557ka.f7084ri.m9329ri(this.f7098aw);
        this.f7098aw.sendEmptyMessage(1);
    }

    /* JADX INFO: renamed from: ri */
    public void m9363ri(int i, long j) {
        if (this.f7098aw == null) {
            return;
        }
        Message messageObtain = Message.obtain();
        messageObtain.what = i;
        if (i == 2) {
            this.f7098aw.sendMessageDelayed(messageObtain, ((long) (((this.f7111vr.incrementAndGet() - 1) % 4) + 1)) * j);
        } else if (i == 3) {
            this.f7098aw.sendMessageDelayed(messageObtain, ((long) (((this.slm.incrementAndGet() - 1) % 4) + 1)) * j);
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m9364ri(InterfaceC2552ri interfaceC2552ri, boolean z) {
        if (interfaceC2552ri == null) {
            return;
        }
        interfaceC2552ri.mo9286ka();
        if (!z) {
            this.f7101fi.add(interfaceC2552ri);
            m9335fi(2);
        } else if (this.f7098aw != null) {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(interfaceC2552ri);
            m9360ri((List<InterfaceC2552ri>) arrayList, true, "ignore_result_dispatch");
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m9365ri(boolean z) {
        this.f7104lr = z;
    }

    /* JADX INFO: renamed from: ri */
    public boolean m9366ri() {
        return this.f7104lr;
    }

    /* JADX INFO: renamed from: ri */
    public boolean m9367ri(int i, boolean z) {
        InterfaceC2540fi interfaceC2540fiM9549vr = xha.m9524di().m9549vr();
        if (interfaceC2540fiM9549vr == null || !interfaceC2540fiM9549vr.mo9228ri(xha.m9524di().m9528fi())) {
            return false;
        }
        return this.f7108ri.mo9452ri(i, z);
    }
}
