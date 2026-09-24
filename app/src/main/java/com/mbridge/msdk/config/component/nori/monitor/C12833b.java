package com.mbridge.msdk.config.component.nori.monitor;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.mbridge.msdk.config.component.common.network.InterfaceC12757a;
import com.mbridge.msdk.config.component.common.network.InterfaceC12758b;
import com.mbridge.msdk.config.component.common.network.result.C12764a;
import com.mbridge.msdk.config.component.common.network.retry.InterfaceC12766b;
import com.mbridge.msdk.foundation.tools.C13219q0;

/* JADX INFO: renamed from: com.mbridge.msdk.config.component.nori.monitor.b */
/* JADX INFO: compiled from: MonitorNetworkRequestTimeout.java */
/* JADX INFO: loaded from: classes5.dex */
public class C12833b {

    /* JADX INFO: renamed from: a */
    private long f34363a;

    /* JADX INFO: renamed from: b */
    private boolean f34364b = false;

    /* JADX INFO: renamed from: c */
    private Handler f34365c;

    /* JADX INFO: renamed from: d */
    private HandlerThread f34366d;

    /* JADX INFO: renamed from: e */
    private Runnable f34367e;

    /* JADX INFO: renamed from: f */
    private InterfaceC12757a f34368f;

    /* JADX INFO: renamed from: g */
    private C12764a f34369g;

    /* JADX INFO: renamed from: h */
    private InterfaceC12758b f34370h;

    /* JADX INFO: renamed from: i */
    private InterfaceC12766b f34371i;

    /* JADX INFO: renamed from: com.mbridge.msdk.config.component.nori.monitor.b$a */
    /* JADX INFO: compiled from: MonitorNetworkRequestTimeout.java */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C13219q0.m37816b("MonitorNetworkTimeout", "超时结束触发");
            if (C12833b.this.f34368f != null && !C12833b.this.f34369g.m35166h()) {
                C12833b.this.m35672a();
                C12833b.this.f34368f.mo35104d(C12833b.this.f34369g);
            }
            C12833b.this.m35682e();
        }
    }

    public C12833b(long j) {
        if (this.f34363a < 0) {
            this.f34363a = 30L;
        } else {
            this.f34363a = j;
        }
    }

    /* JADX INFO: renamed from: d */
    public void m35681d() {
        Runnable runnable;
        if (this.f34364b) {
            C13219q0.m37820d("MonitorNetworkTimeout", "已经启动监控条件 不满足");
            return;
        }
        this.f34364b = true;
        try {
            HandlerThread handlerThread = new HandlerThread("NetComponentThread");
            this.f34366d = handlerThread;
            handlerThread.start();
            this.f34365c = new Handler(this.f34366d.getLooper());
            m35674c();
        } catch (Exception e) {
            C13219q0.m37816b("MonitorNetworkTimeout", "初始化MonitorPlayerTimeout失败：" + e.getMessage());
            this.f34365c = new Handler(Looper.getMainLooper());
            m35674c();
        }
        if (this.f34365c == null) {
            m35682e();
            InterfaceC12757a interfaceC12757a = this.f34368f;
            if (interfaceC12757a != null) {
                interfaceC12757a.mo35104d(this.f34369g);
            }
        }
        C13219q0.m37818c("MonitorNetworkTimeout", "开始网络请求，超时时间：" + this.f34363a + "ms");
        Handler handler = this.f34365c;
        if (handler == null || (runnable = this.f34367e) == null) {
            return;
        }
        handler.postDelayed(runnable, this.f34363a * 1000);
    }

    /* JADX INFO: renamed from: e */
    public void m35682e() {
        Runnable runnable;
        if (this.f34364b) {
            this.f34364b = false;
            Handler handler = this.f34365c;
            if (handler != null && (runnable = this.f34367e) != null) {
                handler.removeCallbacks(runnable);
            }
            C13219q0.m37818c("MonitorNetworkTimeout", "停止net超时监控");
        }
    }

    /* JADX INFO: renamed from: c */
    private void m35674c() {
        this.f34367e = new a();
    }

    /* JADX INFO: renamed from: a */
    public void m35677a(InterfaceC12758b interfaceC12758b) {
        this.f34370h = interfaceC12758b;
    }

    /* JADX INFO: renamed from: b */
    public void m35680b() {
        try {
            m35682e();
            Handler handler = this.f34365c;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
                this.f34365c = null;
            }
            HandlerThread handlerThread = this.f34366d;
            try {
                if (handlerThread != null) {
                    try {
                        try {
                            handlerThread.quitSafely();
                            this.f34366d.join(1000L);
                        } catch (Exception e) {
                            C13219q0.m37816b("MonitorNetworkTimeout", "清理HandlerThread时发生异常：" + e.getMessage());
                        }
                    } catch (InterruptedException e2) {
                        C13219q0.m37820d("MonitorNetworkTimeout", "等待HandlerThread退出时被中断：" + e2.getMessage());
                        Thread.currentThread().interrupt();
                    }
                    this.f34366d = null;
                }
                this.f34367e = null;
                this.f34364b = false;
                C13219q0.m37818c("MonitorNetworkTimeout", "MonitorNetworkTimeout资源已完全清理");
            } catch (Throwable th) {
                this.f34366d = null;
                throw th;
            }
        } catch (Exception e3) {
            C13219q0.m37816b("MonitorNetworkTimeout", "销毁MonitorNetworkTimeout时发生异常：" + e3.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    public void m35679a(InterfaceC12766b interfaceC12766b) {
        this.f34371i = interfaceC12766b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m35672a() {
        try {
            if (this.f34370h != null) {
                C13219q0.m37818c("MonitorNetworkTimeout", "取消网络请求");
                this.f34370h.mo35105a();
            }
            if (this.f34371i != null) {
                C13219q0.m37818c("MonitorNetworkTimeout", "取消重试任务");
                this.f34371i.mo35169a();
            }
        } catch (Exception e) {
            C13219q0.m37816b("MonitorNetworkTimeout", "取消任务时发生异常：" + e.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    public void m35678a(C12764a c12764a) {
        this.f34369g = c12764a;
    }

    /* JADX INFO: renamed from: a */
    public void m35676a(InterfaceC12757a interfaceC12757a) {
        this.f34368f = interfaceC12757a;
    }
}
