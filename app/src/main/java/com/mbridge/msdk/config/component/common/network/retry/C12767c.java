package com.mbridge.msdk.config.component.common.network.retry;

import com.mbridge.msdk.config.component.common.network.InterfaceC12757a;
import com.mbridge.msdk.config.component.common.network.connect.okhttp.C12760a;
import com.mbridge.msdk.config.component.common.network.connect.socket.C12761a;
import com.mbridge.msdk.config.component.common.network.result.C12764a;
import com.mbridge.msdk.config.component.common.util.C12770c;
import com.mbridge.msdk.config.component.nori.model.C12831a;
import com.mbridge.msdk.config.component.nori.monitor.C12833b;
import com.mbridge.msdk.foundation.tools.C13219q0;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: com.mbridge.msdk.config.component.common.network.retry.c */
/* JADX INFO: compiled from: RequestRetry.java */
/* JADX INFO: loaded from: classes5.dex */
public class C12767c {

    /* JADX INFO: renamed from: d */
    private ScheduledFuture<?> f33986d;

    /* JADX INFO: renamed from: f */
    private final String f33988f;

    /* JADX INFO: renamed from: g */
    private final C12831a f33989g;

    /* JADX INFO: renamed from: h */
    private final InterfaceC12757a f33990h;

    /* JADX INFO: renamed from: i */
    private C12764a f33991i;

    /* JADX INFO: renamed from: j */
    private C12833b f33992j;

    /* JADX INFO: renamed from: a */
    private C12761a f33983a = null;

    /* JADX INFO: renamed from: b */
    private C12760a f33984b = null;

    /* JADX INFO: renamed from: c */
    private volatile boolean f33985c = false;

    /* JADX INFO: renamed from: e */
    private ScheduledExecutorService f33987e = null;

    /* JADX INFO: renamed from: k */
    private final AtomicInteger f33993k = new AtomicInteger(0);

    /* JADX INFO: renamed from: com.mbridge.msdk.config.component.common.network.retry.c$a */
    /* JADX INFO: compiled from: RequestRetry.java */
    class a implements ThreadFactory {

        /* JADX INFO: renamed from: a */
        private final AtomicInteger f33994a = new AtomicInteger(1);

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, "Retry-InstanceScheduler-" + System.currentTimeMillis() + "-" + this.f33994a.getAndIncrement());
            thread.setDaemon(true);
            return thread;
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.config.component.common.network.retry.c$b */
    /* JADX INFO: compiled from: RequestRetry.java */
    class b implements InterfaceC12765a {
        b() {
        }

        @Override // com.mbridge.msdk.config.component.common.network.retry.InterfaceC12765a
        /* JADX INFO: renamed from: a */
        public void mo35167a() {
            C12767c.this.m35170a();
        }

        @Override // com.mbridge.msdk.config.component.common.network.retry.InterfaceC12765a
        /* JADX INFO: renamed from: b */
        public void mo35168b() {
            C12767c.this.m35177g();
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.config.component.common.network.retry.c$c */
    /* JADX INFO: compiled from: RequestRetry.java */
    class c implements InterfaceC12766b {
        c() {
        }

        @Override // com.mbridge.msdk.config.component.common.network.retry.InterfaceC12766b
        /* JADX INFO: renamed from: a */
        public void mo35169a() {
            C12767c.this.m35170a();
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.config.component.common.network.retry.c$d */
    /* JADX INFO: compiled from: RequestRetry.java */
    class d implements InterfaceC12765a {
        d() {
        }

        @Override // com.mbridge.msdk.config.component.common.network.retry.InterfaceC12765a
        /* JADX INFO: renamed from: a */
        public void mo35167a() {
            C12767c.this.m35170a();
        }

        @Override // com.mbridge.msdk.config.component.common.network.retry.InterfaceC12765a
        /* JADX INFO: renamed from: b */
        public void mo35168b() {
            C12767c.this.m35177g();
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.config.component.common.network.retry.c$e */
    /* JADX INFO: compiled from: RequestRetry.java */
    class e implements InterfaceC12766b {
        e() {
        }

        @Override // com.mbridge.msdk.config.component.common.network.retry.InterfaceC12766b
        /* JADX INFO: renamed from: a */
        public void mo35169a() {
            C12767c.this.m35170a();
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.config.component.common.network.retry.c$f */
    /* JADX INFO: compiled from: RequestRetry.java */
    private static class f {

        /* JADX INFO: renamed from: b */
        private static final f f34000b = new f();

        /* JADX INFO: renamed from: a */
        private final ThreadPoolExecutor f34001a = new ThreadPoolExecutor(3, 5, 10, TimeUnit.SECONDS, new LinkedBlockingQueue(100), new a(), new ThreadPoolExecutor.DiscardOldestPolicy());

        /* JADX INFO: renamed from: com.mbridge.msdk.config.component.common.network.retry.c$f$a */
        /* JADX INFO: compiled from: RequestRetry.java */
        class a implements ThreadFactory {

            /* JADX INFO: renamed from: a */
            private final AtomicInteger f34002a = new AtomicInteger(1);

            a() {
            }

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable, "Retry-NetworkThread-" + this.f34002a.getAndIncrement());
                thread.setDaemon(true);
                return thread;
            }
        }

        private f() {
        }

        /* JADX INFO: renamed from: a */
        public static f m35182a() {
            return f34000b;
        }

        /* JADX INFO: renamed from: b */
        public ThreadPoolExecutor m35183b() {
            return this.f34001a;
        }
    }

    public C12767c(String str, C12831a c12831a, InterfaceC12757a interfaceC12757a, C12764a c12764a) {
        this.f33988f = str;
        this.f33989g = c12831a;
        this.f33990h = interfaceC12757a;
        this.f33991i = c12764a;
        this.f33992j = c12764a.m35151a();
        m35172b();
    }

    /* JADX INFO: renamed from: d */
    private void m35174d() {
        C12760a c12760a;
        try {
            try {
                this.f33984b = new C12760a(this.f33989g, this.f33991i, this.f33990h);
                m35178h();
                this.f33984b.m35121a(this.f33988f);
                c12760a = this.f33984b;
                if (c12760a == null) {
                    return;
                }
            } catch (Exception e2) {
                this.f33991i.m35161c(0);
                this.f33991i.m35158b(0);
                this.f33991i.m35155a(e2.getMessage());
                m35177g();
                c12760a = this.f33984b;
                if (c12760a == null) {
                    return;
                }
            }
            c12760a.m35122a();
        } catch (Throwable th) {
            C12760a c12760a2 = this.f33984b;
            if (c12760a2 != null) {
                c12760a2.m35122a();
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public void m35175e() {
        if (this.f33985c) {
            C13219q0.m37818c("RequestRetry", "重试任务已被取消，停止执行");
        } else if (this.f33989g.m35640i().equals(C12770c.m35209b("340"))) {
            m35176f();
        } else if (this.f33989g.m35640i().equals(C12770c.m35209b("341"))) {
            m35174d();
        }
    }

    /* JADX INFO: renamed from: f */
    private void m35176f() {
        C12761a c12761a;
        try {
            try {
                this.f33983a = new C12761a(this.f33989g, this.f33991i, this.f33990h);
                m35179i();
                this.f33983a.m35127a(this.f33988f);
                c12761a = this.f33983a;
                if (c12761a == null) {
                    return;
                }
            } catch (Exception e2) {
                this.f33991i.m35161c(0);
                this.f33991i.m35158b(0);
                this.f33991i.m35155a(e2.getMessage());
                m35177g();
                c12761a = this.f33983a;
                if (c12761a == null) {
                    return;
                }
            }
            c12761a.m35128a();
        } catch (Throwable th) {
            C12761a c12761a2 = this.f33983a;
            if (c12761a2 != null) {
                c12761a2.m35128a();
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public void m35177g() {
        if (this.f33985c) {
            C13219q0.m37818c("RequestRetry", "重试任务已被取消，停止调度重试");
            return;
        }
        this.f33993k.incrementAndGet();
        if (this.f33993k.get() >= this.f33989g.m35638g()) {
            C13219q0.m37818c("RequestRetry", "重试次数已达上限: " + this.f33993k.get());
            InterfaceC12757a interfaceC12757a = this.f33990h;
            if (interfaceC12757a != null) {
                interfaceC12757a.mo35104d(this.f33991i);
            }
            m35170a();
            return;
        }
        C13219q0.m37816b("RequestRetry", "重试 次数 " + this.f33993k.get());
        try {
            ScheduledExecutorService scheduledExecutorService = this.f33987e;
            if (scheduledExecutorService != null) {
                this.f33986d = scheduledExecutorService.schedule(new Runnable() { // from class: com.mbridge.msdk.config.component.common.network.retry.c$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m35181c();
                    }
                }, this.f33989g.m35639h(), TimeUnit.SECONDS);
                C13219q0.m37818c("RequestRetry", "已调度第 " + this.f33993k.get() + " 次重试");
            }
        } catch (Exception e2) {
            C13219q0.m37816b("RequestRetry", "调度重试任务失败: " + e2.getMessage());
            InterfaceC12757a interfaceC12757a2 = this.f33990h;
            if (interfaceC12757a2 != null) {
                interfaceC12757a2.mo35104d(this.f33991i);
            }
            m35170a();
        }
    }

    /* JADX INFO: renamed from: h */
    private void m35178h() {
        C12760a c12760a = this.f33984b;
        if (c12760a != null) {
            c12760a.m35123a(new d());
        }
        C12833b c12833b = this.f33992j;
        if (c12833b != null) {
            c12833b.m35679a(new e());
        }
    }

    /* JADX INFO: renamed from: i */
    private void m35179i() {
        C12761a c12761a = this.f33983a;
        if (c12761a != null) {
            c12761a.m35129a(new b());
        }
        C12833b c12833b = this.f33992j;
        if (c12833b != null) {
            c12833b.m35679a(new c());
        }
    }

    /* JADX INFO: renamed from: j */
    private void m35180j() {
        ScheduledExecutorService scheduledExecutorService = this.f33987e;
        if (scheduledExecutorService == null || scheduledExecutorService.isShutdown()) {
            return;
        }
        try {
            C13219q0.m37818c("RequestRetry", "正在关闭独立调度器");
            this.f33987e.shutdown();
            if (this.f33987e.awaitTermination(5L, TimeUnit.SECONDS)) {
                C13219q0.m37818c("RequestRetry", "独立调度器已成功关闭");
            } else {
                C13219q0.m37820d("RequestRetry", "独立调度器未能在5秒内关闭，强制关闭");
                this.f33987e.shutdownNow();
            }
        } catch (InterruptedException e2) {
            C13219q0.m37816b("RequestRetry", "关闭独立调度器时被中断: " + e2.getMessage());
            this.f33987e.shutdownNow();
            Thread.currentThread().interrupt();
        }
    }

    /* JADX INFO: renamed from: c */
    public void m35181c() {
        if (this.f33985c) {
            C13219q0.m37818c("RequestRetry", "重试任务已被取消，跳过执行");
        } else {
            f.m35182a().m35183b().execute(new Runnable() { // from class: com.mbridge.msdk.config.component.common.network.retry.c$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m35175e();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m35170a() {
        if (this.f33985c) {
            return;
        }
        C13219q0.m37818c("RequestRetry", "取消所有重试任务");
        this.f33985c = true;
        ScheduledFuture<?> scheduledFuture = this.f33986d;
        if (scheduledFuture != null && !scheduledFuture.isDone()) {
            this.f33986d.cancel(true);
            C13219q0.m37818c("RequestRetry", "已取消当前重试调度任务");
        }
        C12761a c12761a = this.f33983a;
        if (c12761a != null) {
            c12761a.m35128a();
            C13219q0.m37818c("RequestRetry", "已取消TCP连接");
        }
        C12760a c12760a = this.f33984b;
        if (c12760a != null) {
            c12760a.m35122a();
            C13219q0.m37818c("RequestRetry", "已取消HTTP连接");
        }
        m35180j();
    }

    /* JADX INFO: renamed from: b */
    private void m35172b() {
        try {
            this.f33987e = Executors.newSingleThreadScheduledExecutor(new a());
            C13219q0.m37818c("RequestRetry", "创建独立调度器成功");
        } catch (Exception e2) {
            C13219q0.m37816b("RequestRetry", "创建独立调度器失败: " + e2.getMessage());
        }
    }
}
