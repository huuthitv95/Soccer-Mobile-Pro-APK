package com.bytedance.sdk.component.p165mj.p166lr;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.work.WorkRequest;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public class xha extends ThreadPoolExecutor {

    /* JADX INFO: renamed from: fi */
    private boolean f7653fi;

    /* JADX INFO: renamed from: ik */
    private int f7654ik;

    /* JADX INFO: renamed from: ka */
    private int f7655ka;

    /* JADX INFO: renamed from: lr */
    private int f7656lr;

    /* JADX INFO: renamed from: ri */
    private final String f7657ri;

    /* JADX INFO: renamed from: com.bytedance.sdk.component.mj.lr.xha$ri */
    public static class C2682ri {

        /* JADX INFO: renamed from: ri */
        private String f7668ri = "cache";

        /* JADX INFO: renamed from: lr */
        private int f7665lr = 4;

        /* JADX INFO: renamed from: ik */
        private int f7663ik = 100;

        /* JADX INFO: renamed from: ka */
        private int f7664ka = 0;

        /* JADX INFO: renamed from: fi */
        private long f7662fi = WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS;

        /* JADX INFO: renamed from: di */
        private boolean f7661di = false;
        private TimeUnit xha = TimeUnit.MILLISECONDS;

        /* JADX INFO: renamed from: mj */
        private boolean f7666mj = false;
        private BlockingQueue<Runnable> jbs = new PriorityBlockingQueue();

        /* JADX INFO: renamed from: qt */
        private ThreadFactory f7667qt = null;

        /* JADX INFO: renamed from: fi */
        public C2682ri m10072fi(int i) {
            return this;
        }

        /* JADX INFO: renamed from: ik */
        public C2682ri m10073ik(int i) {
            this.f7664ka = i;
            return this;
        }

        /* JADX INFO: renamed from: ka */
        public C2682ri m10074ka(int i) {
            return this;
        }

        /* JADX INFO: renamed from: lr */
        public C2682ri m10075lr(int i) {
            this.f7663ik = i;
            return this;
        }

        /* JADX INFO: renamed from: lr */
        public C2682ri m10076lr(boolean z) {
            this.f7666mj = z;
            return this;
        }

        /* JADX INFO: renamed from: ri */
        public C2682ri m10077ri(int i) {
            this.f7665lr = i;
            return this;
        }

        /* JADX INFO: renamed from: ri */
        public C2682ri m10078ri(long j) {
            this.f7662fi = j;
            return this;
        }

        /* JADX INFO: renamed from: ri */
        public C2682ri m10079ri(String str) {
            this.f7668ri = str;
            return this;
        }

        /* JADX INFO: renamed from: ri */
        public C2682ri m10080ri(boolean z) {
            this.f7661di = z;
            return this;
        }

        /* JADX INFO: renamed from: ri */
        public xha m10081ri() {
            if (this.f7667qt == null) {
                this.f7667qt = new ThreadFactoryC2675fi(this.f7668ri);
            }
            if (this.f7665lr < 0) {
                this.f7665lr = 8;
            }
            if (this.f7665lr == 0) {
                this.jbs = new SynchronousQueue();
            }
            if (this.jbs == null) {
                this.jbs = new LinkedBlockingQueue();
            }
            if (this.f7663ik > 100) {
                this.f7663ik = 100;
            }
            int i = this.f7663ik;
            int i2 = this.f7665lr;
            if (i < i2) {
                this.f7663ik = i2;
            }
            return new xha(this);
        }
    }

    private xha(C2682ri c2682ri) {
        super(c2682ri.f7665lr, Integer.MAX_VALUE, c2682ri.f7662fi, c2682ri.xha, (BlockingQueue<Runnable>) c2682ri.jbs, c2682ri.f7667qt);
        this.f7653fi = false;
        String unused = c2682ri.f7668ri;
        Integer.valueOf(c2682ri.f7665lr);
        Integer.valueOf(c2682ri.f7663ik);
        Long.valueOf(c2682ri.f7662fi);
        Integer.valueOf(c2682ri.f7664ka);
        Boolean.valueOf(c2682ri.f7666mj);
        BlockingQueue unused2 = c2682ri.jbs;
        this.f7657ri = c2682ri.f7668ri;
        this.f7656lr = c2682ri.f7665lr;
        this.f7654ik = c2682ri.f7663ik;
        this.f7655ka = c2682ri.f7664ka;
        allowCoreThreadTimeOut(c2682ri.f7661di);
        this.f7653fi = c2682ri.f7666mj;
    }

    /* JADX INFO: renamed from: ik */
    private void m10059ik() {
        int corePoolSize;
        int size;
        try {
            if (this.f7656lr != 0 && (corePoolSize = getCorePoolSize()) > this.f7656lr && (size = getQueue().size()) == 0) {
                setCorePoolSize(this.f7656lr);
                Integer.valueOf(size);
                Integer.valueOf(corePoolSize);
                Integer.valueOf(this.f7656lr);
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }

    /* JADX INFO: renamed from: lr */
    private void m10060lr() {
        int corePoolSize;
        try {
            if (this.f7656lr != 0 && (corePoolSize = getCorePoolSize()) < this.f7654ik) {
                int size = getQueue().size();
                if (getActiveCount() < this.f7656lr || size < this.f7655ka) {
                    return;
                }
                setCorePoolSize(this.f7654ik);
                Integer.valueOf(size);
                Integer.valueOf(corePoolSize);
                Integer.valueOf(this.f7654ik);
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }

    /* JADX INFO: renamed from: ri */
    private void m10061ri(Runnable runnable, Throwable th) {
        try {
            if (Looper.myLooper() != Looper.getMainLooper()) {
                runnable.run();
                return;
            }
            Handler handlerM10052lr = C2677ka.m10052lr();
            if (handlerM10052lr != null) {
                handlerM10052lr.post(runnable);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    protected void afterExecute(Runnable runnable, Throwable th) {
        boolean z = runnable instanceof AbstractRunnableC2676ik;
        if (z) {
            ((AbstractRunnableC2676ik) runnable).setAfterTimestamp(SystemClock.elapsedRealtime());
        }
        super.afterExecute(runnable, th);
        if (z) {
            AbstractRunnableC2676ik abstractRunnableC2676ik = (AbstractRunnableC2676ik) runnable;
            abstractRunnableC2676ik.getName();
            Integer.valueOf(abstractRunnableC2676ik.getPriority());
            Long.valueOf(abstractRunnableC2676ik.getSubmitTimestamp());
            Long.valueOf(abstractRunnableC2676ik.getBeforeTimestamp());
            Long.valueOf(abstractRunnableC2676ik.getAfterTimestamp());
        }
        m10059ik();
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    protected void beforeExecute(Thread thread, Runnable runnable) {
        if (runnable instanceof AbstractRunnableC2676ik) {
            ((AbstractRunnableC2676ik) runnable).setBeforeTimestamp(SystemClock.elapsedRealtime());
        }
        super.beforeExecute(thread, runnable);
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        InterfaceC2679ri interfaceC2679riM10053ri;
        if (!(runnable instanceof AbstractRunnableC2676ik)) {
            runnable = new AbstractRunnableC2676ik("unknown", runnable) { // from class: com.bytedance.sdk.component.mj.lr.xha.2
                @Override // java.lang.Runnable
                public void run() {
                    Runnable target = getTarget();
                    if (target != null) {
                        target.run();
                    }
                }
            };
        }
        if (!"cache".equals(this.f7657ri)) {
            String name = Thread.currentThread().getName();
            if (!TextUtils.isEmpty(name) && name.startsWith(ThreadFactoryC2675fi.m10050ri(this.f7657ri)) && (interfaceC2679riM10053ri = C2677ka.m10053ri()) != null) {
                interfaceC2679riM10053ri.mo10058ri(this, (AbstractRunnableC2676ik) runnable);
            }
        }
        ((AbstractRunnableC2676ik) runnable).setSubmitTimestamp(SystemClock.elapsedRealtime());
        try {
            super.execute(runnable);
            m10060lr();
        } catch (Throwable th) {
            m10061ri(runnable, th);
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m10062ri(C2682ri c2682ri) {
        try {
            if (c2682ri.f7665lr >= 0 && this.f7656lr != c2682ri.f7665lr) {
                int i = c2682ri.f7665lr;
                this.f7656lr = i;
                setCorePoolSize(i);
            }
            this.f7654ik = c2682ri.f7663ik;
            this.f7655ka = c2682ri.f7664ka;
            allowCoreThreadTimeOut(c2682ri.f7661di);
            this.f7653fi = c2682ri.f7666mj;
        } catch (Throwable th) {
            th.getMessage();
        }
        String unused = c2682ri.f7668ri;
        Integer.valueOf(c2682ri.f7665lr);
        Integer.valueOf(c2682ri.f7663ik);
        Long.valueOf(c2682ri.f7662fi);
        Integer.valueOf(c2682ri.f7664ka);
        Boolean.valueOf(c2682ri.f7666mj);
        BlockingQueue unused2 = c2682ri.jbs;
    }

    /* JADX INFO: renamed from: ri */
    public boolean m10063ri() {
        return this.f7653fi;
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.ExecutorService
    public void shutdown() {
        if ("aidl".equals(this.f7657ri)) {
            return;
        }
        super.shutdown();
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        return "aidl".equals(this.f7657ri) ? Collections.EMPTY_LIST : super.shutdownNow();
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public Future<?> submit(Runnable runnable) {
        int priority;
        String name;
        runnable.getClass();
        final RunnableFuture runnableFutureNewTaskFor = newTaskFor(runnable, null);
        if (runnable instanceof AbstractRunnableC2676ik) {
            AbstractRunnableC2676ik abstractRunnableC2676ik = (AbstractRunnableC2676ik) runnable;
            priority = abstractRunnableC2676ik.getPriority();
            name = abstractRunnableC2676ik.getName();
        } else {
            priority = 6;
            name = "";
        }
        if (priority == 0 || TextUtils.isEmpty(name)) {
            new RuntimeException();
        }
        execute(new AbstractRunnableC2676ik(name, priority) { // from class: com.bytedance.sdk.component.mj.lr.xha.1
            @Override // java.lang.Runnable
            public void run() {
                runnableFutureNewTaskFor.run();
            }
        });
        return runnableFutureNewTaskFor;
    }
}
