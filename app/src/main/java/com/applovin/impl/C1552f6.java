package com.applovin.impl;

import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.C1768p;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.applovin.impl.f6 */
/* JADX INFO: loaded from: classes3.dex */
public class C1552f6 {

    /* JADX INFO: renamed from: r */
    private static final ExecutorService f1592r = Executors.newFixedThreadPool(4);

    /* JADX INFO: renamed from: a */
    private final C1748l f1593a;

    /* JADX INFO: renamed from: b */
    private final C1768p f1594b;

    /* JADX INFO: renamed from: c */
    private final ScheduledThreadPoolExecutor f1595c;

    /* JADX INFO: renamed from: d */
    private final ScheduledThreadPoolExecutor f1596d;

    /* JADX INFO: renamed from: e */
    private final ScheduledThreadPoolExecutor f1597e;

    /* JADX INFO: renamed from: f */
    private final ScheduledThreadPoolExecutor f1598f;

    /* JADX INFO: renamed from: g */
    private final ScheduledThreadPoolExecutor f1599g;

    /* JADX INFO: renamed from: h */
    private final ScheduledThreadPoolExecutor f1600h;

    /* JADX INFO: renamed from: i */
    private final ScheduledThreadPoolExecutor f1601i;

    /* JADX INFO: renamed from: k */
    private ExecutorService f1603k;

    /* JADX INFO: renamed from: l */
    private ExecutorService f1604l;

    /* JADX INFO: renamed from: o */
    private boolean f1607o;

    /* JADX INFO: renamed from: p */
    private boolean f1608p;

    /* JADX INFO: renamed from: q */
    private final boolean f1609q;

    /* JADX INFO: renamed from: j */
    private final Map f1602j = new HashMap();

    /* JADX INFO: renamed from: m */
    private final List f1605m = new ArrayList(5);

    /* JADX INFO: renamed from: n */
    private final Object f1606n = new Object();

    /* JADX INFO: renamed from: com.applovin.impl.f6$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f1610a;

        static {
            int[] iArr = new int[b.values().length];
            f1610a = iArr;
            try {
                iArr[b.CORE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1610a[b.CACHING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1610a[b.MEDIATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1610a[b.TIMEOUT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: renamed from: com.applovin.impl.f6$b */
    public enum b {
        CORE,
        CACHING,
        MEDIATION,
        TIMEOUT,
        OTHER
    }

    /* JADX INFO: renamed from: com.applovin.impl.f6$c */
    private static class c extends e {

        /* JADX INFO: renamed from: f */
        private final long f1617f;

        public c(C1748l c1748l, AbstractRunnableC1601k5 abstractRunnableC1601k5, b bVar, long j) {
            super(c1748l, abstractRunnableC1601k5, bVar);
            this.f1617f = j;
        }
    }

    /* JADX INFO: renamed from: com.applovin.impl.f6$d */
    private class d implements ThreadFactory {

        /* JADX INFO: renamed from: a */
        private final String f1618a;

        /* JADX INFO: renamed from: com.applovin.impl.f6$d$a */
        class a implements Thread.UncaughtExceptionHandler {
            a() {
            }

            @Override // java.lang.Thread.UncaughtExceptionHandler
            public void uncaughtException(Thread thread, Throwable th) {
                C1768p unused = C1552f6.this.f1594b;
                if (C1768p.m5160a()) {
                    C1552f6.this.f1594b.m5172a("TaskManager", "Caught unhandled exception", th);
                }
            }
        }

        d(String str) {
            this.f1618a = str;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, "AppLovinSdk:" + this.f1618a);
            thread.setDaemon(true);
            thread.setPriority(((Integer) C1552f6.this.f1593a.m4801a(C1831z4.f3798Q)).intValue());
            thread.setUncaughtExceptionHandler(new a());
            return thread;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: com.applovin.impl.f6$e */
    static class e implements Runnable {

        /* JADX INFO: renamed from: a */
        private final C1748l f1621a;

        /* JADX INFO: renamed from: b */
        private final String f1622b;

        /* JADX INFO: renamed from: c */
        private final C1768p f1623c;

        /* JADX INFO: renamed from: d */
        protected final AbstractRunnableC1601k5 f1624d;

        /* JADX INFO: renamed from: e */
        protected final b f1625e;

        public e(C1748l c1748l, AbstractRunnableC1601k5 abstractRunnableC1601k5, b bVar) {
            this.f1621a = c1748l;
            this.f1623c = c1748l.m4782Q();
            this.f1622b = abstractRunnableC1601k5.m3086c();
            this.f1624d = abstractRunnableC1601k5;
            this.f1625e = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                AbstractC1677p0.m3797a();
                if (!this.f1621a.m4769G0() || this.f1624d.m3087d()) {
                    ScheduledFuture scheduledFutureM3085b = this.f1624d.m3085b(Thread.currentThread(), ((Long) this.f1621a.m4801a(C1831z4.f4058v)).longValue());
                    this.f1624d.run();
                    if (scheduledFutureM3085b != null) {
                        scheduledFutureM3085b.cancel(false);
                    }
                } else {
                    if (C1768p.m5160a()) {
                        this.f1623c.m5175d(this.f1622b, "Task re-scheduled...");
                    }
                    this.f1621a.m4853s0().m2605a(this.f1624d, this.f1625e, 2000L);
                }
                if (C1768p.m5160a()) {
                    this.f1623c.m5175d(this.f1622b, this.f1625e + " queue finished task " + this.f1624d.m3086c());
                }
            } catch (Throwable th) {
                try {
                    if (C1768p.m5160a()) {
                        this.f1623c.m5172a(this.f1622b, "Task failed execution", th);
                    }
                    this.f1624d.m3082a(th);
                } finally {
                    if (C1768p.m5160a()) {
                        this.f1623c.m5175d(this.f1622b, this.f1625e + " queue finished task " + this.f1624d.m3086c());
                    }
                }
            }
        }
    }

    public C1552f6(C1748l c1748l) {
        this.f1593a = c1748l;
        this.f1594b = c1748l.m4782Q();
        this.f1608p = ((Boolean) c1748l.m4801a(C1831z4.f3822T)).booleanValue();
        this.f1609q = ((Boolean) c1748l.m4801a(C1831z4.f3829T6)).booleanValue();
        this.f1595c = m2597b("auxiliary_operations", ((Integer) c1748l.m4801a(C1831z4.f3782O)).intValue());
        this.f1596d = m2597b("shared_thread_pool", ((Integer) c1748l.m4801a(C1831z4.f3774N)).intValue());
        this.f1597e = m2597b("core", ((Integer) c1748l.m4801a(C1831z4.f3830U)).intValue());
        this.f1599g = m2597b("caching", ((Integer) c1748l.m4801a(C1831z4.f3838V)).intValue());
        this.f1600h = m2597b("mediation", ((Integer) c1748l.m4801a(C1831z4.f3846W)).intValue());
        this.f1598f = m2597b("timeout", ((Integer) c1748l.m4801a(C1831z4.f3854X)).intValue());
        this.f1601i = m2597b("other", ((Integer) c1748l.m4801a(C1831z4.f3862Y)).intValue());
        if (((Boolean) c1748l.m4801a(C1831z4.f3743J0)).booleanValue() && ((Boolean) c1748l.m4801a(C1831z4.f3751K0)).booleanValue()) {
            this.f1603k = Executors.newFixedThreadPool(((Integer) c1748l.m4801a(C1831z4.f3759L0)).intValue(), new d("com.applovin.sdk.caching.shared"));
            this.f1604l = Executors.newFixedThreadPool(((Integer) c1748l.m4801a(C1831z4.f3767M0)).intValue(), new d("com.applovin.sdk.caching.html.shared"));
        }
    }

    /* JADX INFO: renamed from: a */
    private ScheduledThreadPoolExecutor m2592a(e eVar) {
        int i = a.f1610a[eVar.f1625e.ordinal()];
        if (i == 1) {
            return this.f1597e;
        }
        if (i == 2) {
            return this.f1599g;
        }
        if (i != 3) {
            return i != 4 ? this.f1601i : this.f1598f;
        }
        return this.f1600h;
    }

    /* JADX INFO: renamed from: a */
    private void m2593a(final e eVar, long j, boolean z) {
        final ScheduledThreadPoolExecutor scheduledThreadPoolExecutorM2592a = this.f1608p ? m2592a(eVar) : this.f1596d;
        if (j <= 0) {
            scheduledThreadPoolExecutorM2592a.submit(eVar);
        } else if (z) {
            C1576i0.m2851a(j, this.f1593a, new Runnable() { // from class: com.applovin.impl.f6$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    scheduledThreadPoolExecutorM2592a.execute(eVar);
                }
            });
        } else {
            scheduledThreadPoolExecutorM2592a.schedule(eVar, j, TimeUnit.MILLISECONDS);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void m2594a(String str, Runnable runnable) {
        m2603a(new C1788u6(this.f1593a, str, runnable));
    }

    /* JADX INFO: renamed from: b */
    private ScheduledThreadPoolExecutor m2597b(String str, int i) {
        return new ScheduledThreadPoolExecutor(i, new d(str));
    }

    /* JADX INFO: renamed from: b */
    private boolean m2598b(e eVar) {
        if (eVar.f1624d.m3087d()) {
            return false;
        }
        synchronized (this.f1606n) {
            if (this.f1607o) {
                return false;
            }
            this.f1605m.add(eVar);
            return true;
        }
    }

    /* JADX INFO: renamed from: a */
    public List m2599a(List list, ExecutorService executorService) {
        try {
            if (C1768p.m5160a()) {
                this.f1594b.m5171a("TaskManager", "Awaiting " + list.size() + " tasks...");
            }
            return executorService.invokeAll(list);
        } catch (Throwable th) {
            if (!C1768p.m5160a()) {
                return null;
            }
            this.f1594b.m5172a("TaskManager", "Awaiting tasks were interrupted", th);
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public Executor m2600a(final String str) {
        return new Executor() { // from class: com.applovin.impl.f6$$ExternalSyntheticLambda0
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                this.f$0.m2594a(str, runnable);
            }
        };
    }

    /* JADX INFO: renamed from: a */
    public ExecutorService m2601a() {
        return this.f1603k;
    }

    /* JADX INFO: renamed from: a */
    public ExecutorService m2602a(String str, int i) {
        return Executors.newFixedThreadPool(i, new d(str));
    }

    /* JADX INFO: renamed from: a */
    public void m2603a(AbstractRunnableC1601k5 abstractRunnableC1601k5) {
        if (abstractRunnableC1601k5 == null) {
            throw new IllegalArgumentException("No task specified");
        }
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.f1608p ? this.f1597e : this.f1596d;
        try {
            if (AbstractC1701q7.m4113i()) {
                scheduledThreadPoolExecutor.submit(new e(this.f1593a, abstractRunnableC1601k5, b.CORE));
                return;
            }
            ScheduledFuture scheduledFutureM3085b = abstractRunnableC1601k5.m3085b(Thread.currentThread(), ((Long) this.f1593a.m4801a(C1831z4.f4058v)).longValue());
            abstractRunnableC1601k5.run();
            if (scheduledFutureM3085b != null) {
                scheduledFutureM3085b.cancel(false);
            }
        } catch (Throwable th) {
            if (C1768p.m5160a()) {
                this.f1594b.m5172a(abstractRunnableC1601k5.m3086c(), "Task failed execution", th);
            }
            abstractRunnableC1601k5.m3082a(th);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m2604a(AbstractRunnableC1601k5 abstractRunnableC1601k5, b bVar) {
        m2605a(abstractRunnableC1601k5, bVar, 0L);
    }

    /* JADX INFO: renamed from: a */
    public void m2605a(AbstractRunnableC1601k5 abstractRunnableC1601k5, b bVar, long j) {
        m2606a(abstractRunnableC1601k5, bVar, j, false);
    }

    /* JADX INFO: renamed from: a */
    public void m2606a(AbstractRunnableC1601k5 abstractRunnableC1601k5, b bVar, long j, boolean z) {
        AbstractRunnableC1601k5 abstractRunnableC1601k6;
        long j2;
        e eVar;
        if (abstractRunnableC1601k5 == null) {
            throw new IllegalArgumentException("No task specified");
        }
        if (j < 0) {
            throw new IllegalArgumentException("Invalid delay (millis) specified: " + j);
        }
        if (this.f1609q) {
            abstractRunnableC1601k6 = abstractRunnableC1601k5;
            j2 = j;
            eVar = new c(this.f1593a, abstractRunnableC1601k6, bVar, j2);
        } else {
            abstractRunnableC1601k6 = abstractRunnableC1601k5;
            j2 = j;
            eVar = new e(this.f1593a, abstractRunnableC1601k6, bVar);
        }
        if (!m2598b(eVar)) {
            m2593a(eVar, j2, z);
        } else if (C1768p.m5160a()) {
            this.f1594b.m5175d(abstractRunnableC1601k6.m3086c(), "Task execution delayed until after init");
        }
    }

    /* JADX INFO: renamed from: a */
    public void m2607a(AbstractRunnableC1601k5 abstractRunnableC1601k5, C1619m3 c1619m3) {
        String strM3196b = c1619m3.m3196b();
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutorM2597b = (ScheduledThreadPoolExecutor) this.f1602j.get(strM3196b);
        if (scheduledThreadPoolExecutorM2597b == null) {
            scheduledThreadPoolExecutorM2597b = m2597b(strM3196b, 1);
            this.f1602j.put(strM3196b, scheduledThreadPoolExecutorM2597b);
        }
        scheduledThreadPoolExecutorM2597b.submit(new e(this.f1593a, abstractRunnableC1601k5, b.MEDIATION));
    }

    /* JADX INFO: renamed from: a */
    public void m2608a(Runnable runnable, b bVar) {
        if (!this.f1608p) {
            this.f1595c.submit(runnable);
            return;
        }
        C1748l c1748l = this.f1593a;
        e eVar = new e(c1748l, new C1788u6(c1748l, "auxiliaryOperation", runnable), bVar);
        m2592a(eVar).submit(eVar);
    }

    /* JADX INFO: renamed from: b */
    public ExecutorService m2609b() {
        return this.f1608p ? this.f1599g : f1592r;
    }

    /* JADX INFO: renamed from: b */
    public ScheduledFuture m2610b(AbstractRunnableC1601k5 abstractRunnableC1601k5, b bVar, long j) {
        return this.f1608p ? m2592a(new e(this.f1593a, abstractRunnableC1601k5, bVar)).schedule(abstractRunnableC1601k5, j, TimeUnit.MILLISECONDS) : this.f1595c.schedule(abstractRunnableC1601k5, j, TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: renamed from: c */
    public Executor m2611c() {
        return this.f1608p ? this.f1597e : this.f1596d;
    }

    /* JADX INFO: renamed from: d */
    public ExecutorService m2612d() {
        return this.f1604l;
    }

    /* JADX INFO: renamed from: e */
    public boolean m2613e() {
        return (m2601a() == null || m2612d() == null) ? false : true;
    }

    /* JADX INFO: renamed from: f */
    public boolean m2614f() {
        return this.f1607o;
    }

    /* JADX INFO: renamed from: g */
    public void m2615g() {
        synchronized (this.f1606n) {
            this.f1607o = true;
            for (e eVar : this.f1605m) {
                if (this.f1609q) {
                    c cVar = (c) eVar;
                    m2605a(cVar.f1624d, cVar.f1625e, cVar.f1617f);
                } else {
                    m2604a(eVar.f1624d, eVar.f1625e);
                }
            }
            this.f1605m.clear();
        }
    }

    /* JADX INFO: renamed from: h */
    public void m2616h() {
        synchronized (this.f1606n) {
            this.f1607o = false;
        }
    }
}
