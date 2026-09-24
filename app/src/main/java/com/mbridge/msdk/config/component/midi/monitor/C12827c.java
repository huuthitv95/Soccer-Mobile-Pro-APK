package com.mbridge.msdk.config.component.midi.monitor;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.TextUtils;
import androidx.webkit.ProxyConfig;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.mbridge.msdk.config.component.common.file.C12752a;
import com.mbridge.msdk.config.component.common.file.C12753b;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.vungle.ads.internal.model.AdPayload;
import java.io.File;

/* JADX INFO: renamed from: com.mbridge.msdk.config.component.midi.monitor.c */
/* JADX INFO: compiled from: MonitorPlayerTimeout.java */
/* JADX INFO: loaded from: classes5.dex */
public class C12827c {

    /* JADX INFO: renamed from: a */
    private int f34289a;

    /* JADX INFO: renamed from: b */
    private long f34290b;

    /* JADX INFO: renamed from: c */
    private long f34291c;

    /* JADX INFO: renamed from: g */
    private Handler f34295g;

    /* JADX INFO: renamed from: h */
    private HandlerThread f34296h;

    /* JADX INFO: renamed from: i */
    private Runnable f34297i;

    /* JADX INFO: renamed from: j */
    private Runnable f34298j;

    /* JADX INFO: renamed from: k */
    private InterfaceC12825a f34299k;

    /* JADX INFO: renamed from: m */
    private String f34301m;

    /* JADX INFO: renamed from: d */
    private boolean f34292d = false;

    /* JADX INFO: renamed from: e */
    private boolean f34293e = false;

    /* JADX INFO: renamed from: f */
    private boolean f34294f = false;

    /* JADX INFO: renamed from: l */
    private int f34300l = 0;

    /* JADX INFO: renamed from: com.mbridge.msdk.config.component.midi.monitor.c$a */
    /* JADX INFO: compiled from: MonitorPlayerTimeout.java */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C12827c.this.m35588a();
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.config.component.midi.monitor.c$b */
    /* JADX INFO: compiled from: MonitorPlayerTimeout.java */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C12827c.this.f34299k != null) {
                C12827c.this.f34299k.mo35564a("Video first frame render timeout : " + C12827c.this.f34290b + "ms");
            }
            C12827c.this.m35599h();
        }
    }

    public C12827c(int i, String str) {
        this.f34289a = 3;
        this.f34301m = str;
        this.f34290b = i > 0 ? i : 3000L;
        this.f34289a = i / 1000;
        try {
            HandlerThread handlerThread = new HandlerThread("PlayerComponentThread");
            this.f34296h = handlerThread;
            handlerThread.start();
            this.f34295g = new Handler(this.f34296h.getLooper());
            m35593d();
        } catch (Exception e) {
            C13219q0.m37816b("MonitorPlayerTimeout", "初始化MonitorPlayerTimeout失败：" + e.getMessage());
            this.f34295g = new Handler(Looper.getMainLooper());
            m35593d();
        }
    }

    /* JADX INFO: renamed from: d */
    private void m35593d() {
        this.f34297i = new a();
        this.f34298j = new b();
    }

    /* JADX INFO: renamed from: e */
    public boolean m35596e() {
        return this.f34292d;
    }

    /* JADX INFO: renamed from: f */
    public void m35597f() {
        Runnable runnable;
        if (!this.f34292d || this.f34294f) {
            return;
        }
        this.f34294f = true;
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f34291c;
        C13219q0.m37818c("MonitorPlayerTimeout", "第一帧播放完成，耗时：" + jCurrentTimeMillis + "ms");
        Handler handler = this.f34295g;
        if (handler != null && (runnable = this.f34298j) != null) {
            handler.removeCallbacks(runnable);
        }
        if (jCurrentTimeMillis > this.f34290b) {
            C13219q0.m37820d("MonitorPlayerTimeout", "播放超时，但第一帧已播放，耗时：" + jCurrentTimeMillis + "ms");
        }
        m35599h();
    }

    /* JADX INFO: renamed from: g */
    public void m35598g() {
        Runnable runnable;
        if (this.f34295g == null) {
            m35599h();
            InterfaceC12825a interfaceC12825a = this.f34299k;
            if (interfaceC12825a != null) {
                interfaceC12825a.mo35564a("playerHandler is null");
            }
        }
        if (this.f34292d) {
            C13219q0.m37820d("MonitorPlayerTimeout", "已经启动监控条件 不满足");
            return;
        }
        this.f34292d = true;
        this.f34293e = false;
        this.f34294f = false;
        this.f34300l = 0;
        this.f34291c = System.currentTimeMillis();
        C13219q0.m37818c("MonitorPlayerTimeout", "开始播放超时监控，超时时间：" + this.f34290b + "ms");
        Handler handler = this.f34295g;
        if (handler != null && (runnable = this.f34298j) != null) {
            handler.postDelayed(runnable, this.f34290b);
        }
        m35588a();
    }

    /* JADX INFO: renamed from: h */
    public void m35599h() {
        if (this.f34292d) {
            this.f34292d = false;
            Handler handler = this.f34295g;
            if (handler != null) {
                Runnable runnable = this.f34297i;
                if (runnable != null) {
                    handler.removeCallbacks(runnable);
                }
                Runnable runnable2 = this.f34298j;
                if (runnable2 != null) {
                    this.f34295g.removeCallbacks(runnable2);
                }
            }
            C13219q0.m37818c("MonitorPlayerTimeout", "停止播放超时监控");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m35588a() {
        Runnable runnable;
        Runnable runnable2;
        Runnable runnable3;
        if (!this.f34292d || this.f34293e || TextUtils.isEmpty(this.f34301m)) {
            C13219q0.m37816b("MonitorPlayerTimeout", "check 条件 不满足");
            return;
        }
        try {
            String strM35592c = m35592c();
            if (TextUtils.isEmpty(strM35592c)) {
                this.f34300l++;
                C13219q0.m37820d("MonitorPlayerTimeout", "检查本地地址次数 " + this.f34300l);
                if (this.f34300l >= this.f34289a) {
                    C13219q0.m37820d("MonitorPlayerTimeout", "检查本地地址次数已达上限，停止检查");
                    return;
                }
                Handler handler = this.f34295g;
                if (handler == null || (runnable2 = this.f34297i) == null) {
                    return;
                }
                handler.postDelayed(runnable2, 1000L);
                return;
            }
            this.f34293e = true;
            C13219q0.m37818c("MonitorPlayerTimeout", "本地视频地址准备完成：" + strM35592c);
            InterfaceC12825a interfaceC12825a = this.f34299k;
            if (interfaceC12825a != null) {
                interfaceC12825a.mo35565b(strM35592c);
            }
            Handler handler2 = this.f34295g;
            if (handler2 == null || (runnable3 = this.f34297i) == null) {
                return;
            }
            handler2.removeCallbacks(runnable3);
        } catch (Exception e) {
            C13219q0.m37816b("MonitorPlayerTimeout", "检查本地地址异常：" + e.getMessage());
            Handler handler3 = this.f34295g;
            if (handler3 == null || (runnable = this.f34297i) == null) {
                return;
            }
            handler3.postDelayed(runnable, 1000L);
        }
    }

    /* JADX INFO: renamed from: c */
    private String m35592c() {
        try {
            if (this.f34301m.startsWith(AdPayload.FILE_SCHEME) || this.f34301m.startsWith(RemoteSettings.FORWARD_SLASH_STRING)) {
                File file = new File(this.f34301m.replace(AdPayload.FILE_SCHEME, ""));
                if (file.exists() && file.isFile()) {
                    return this.f34301m;
                }
            }
            if (this.f34301m.startsWith(ProxyConfig.MATCH_HTTP)) {
                C12753b c12753bM35056e = C12752a.m35056e(this.f34301m);
                String strM35063a = c12753bM35056e != null ? c12753bM35056e.m35063a() : "";
                File file2 = new File(strM35063a.replace(AdPayload.FILE_SCHEME, ""));
                if (file2.exists() && file2.isFile()) {
                    return strM35063a;
                }
            }
            return null;
        } catch (Exception e) {
            C13219q0.m37816b("MonitorPlayerTimeout", "获取本地视频地址异常：" + e.getMessage());
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m35595b() {
        try {
            m35599h();
            Handler handler = this.f34295g;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
                this.f34295g = null;
            }
            HandlerThread handlerThread = this.f34296h;
            try {
                if (handlerThread != null) {
                    try {
                        try {
                            handlerThread.quitSafely();
                            this.f34296h.join(1000L);
                        } catch (Exception e) {
                            C13219q0.m37816b("MonitorPlayerTimeout", "清理HandlerThread时发生异常：" + e.getMessage());
                        }
                    } catch (InterruptedException e2) {
                        C13219q0.m37820d("MonitorPlayerTimeout", "等待HandlerThread退出时被中断：" + e2.getMessage());
                        Thread.currentThread().interrupt();
                    }
                    this.f34296h = null;
                }
                this.f34297i = null;
                this.f34298j = null;
                this.f34299k = null;
                this.f34292d = false;
                this.f34293e = false;
                this.f34294f = false;
                this.f34300l = 0;
                C13219q0.m37818c("MonitorPlayerTimeout", "MonitorPlayerTimeout资源已完全清理");
            } catch (Throwable th) {
                this.f34296h = null;
                throw th;
            }
        } catch (Exception e3) {
            C13219q0.m37816b("MonitorPlayerTimeout", "销毁MonitorPlayerTimeout时发生异常：" + e3.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    public void m35594a(InterfaceC12825a interfaceC12825a) {
        this.f34299k = interfaceC12825a;
    }
}
