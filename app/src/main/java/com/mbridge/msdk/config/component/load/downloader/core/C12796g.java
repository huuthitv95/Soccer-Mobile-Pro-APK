package com.mbridge.msdk.config.component.load.downloader.core;

import com.mbridge.msdk.config.component.load.downloader.C12788b;
import com.mbridge.msdk.config.component.load.downloader.C12806d;
import com.mbridge.msdk.config.component.load.downloader.DownloadProgress;
import com.mbridge.msdk.config.component.load.downloader.EnumC12811e;
import com.mbridge.msdk.config.component.load.downloader.database.C12808b;
import com.mbridge.msdk.config.component.load.downloader.database.InterfaceC12809c;
import com.mbridge.msdk.config.component.load.downloader.utils.C12818a;
import com.mbridge.msdk.config.component.load.downloader.utils.C12819b;
import com.mbridge.msdk.foundation.download.core.IDownloadTask;
import com.mbridge.msdk.foundation.tools.C13219q0;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.mbridge.msdk.config.component.load.downloader.core.g */
/* JADX INFO: compiled from: DownloadTask.java */
/* JADX INFO: loaded from: classes5.dex */
public class C12796g implements InterfaceC12802m {

    /* JADX INFO: renamed from: b */
    private InterfaceC12809c f34145b;

    /* JADX INFO: renamed from: c */
    private volatile C12788b f34146c;

    /* JADX INFO: renamed from: f */
    private volatile C12793d f34149f;

    /* JADX INFO: renamed from: a */
    private final Object f34144a = new Object();

    /* JADX INFO: renamed from: d */
    private volatile C12808b f34147d = null;

    /* JADX INFO: renamed from: e */
    private volatile boolean f34148e = true;

    /* JADX INFO: renamed from: com.mbridge.msdk.config.component.load.downloader.core.g$a */
    /* JADX INFO: compiled from: DownloadTask.java */
    class a implements InterfaceC12809c.a {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ CountDownLatch f34150a;

        a(CountDownLatch countDownLatch) {
            this.f34150a = countDownLatch;
        }

        @Override // com.mbridge.msdk.config.component.load.downloader.database.InterfaceC12809c.a
        /* JADX INFO: renamed from: a */
        public void mo35414a(C12808b c12808b) {
            synchronized (C12796g.this.f34144a) {
                if (C12796g.this.f34148e) {
                    C12796g.this.f34147d = c12808b;
                }
            }
            this.f34150a.countDown();
        }
    }

    private C12796g(C12793d c12793d, C12788b c12788b, InterfaceC12809c interfaceC12809c) {
        this.f34149f = c12793d;
        this.f34146c = c12788b;
        this.f34145b = interfaceC12809c;
    }

    @Override // com.mbridge.msdk.config.component.load.downloader.core.InterfaceC12802m
    public C12806d run() {
        String strM35386f = this.f34149f.m35386f();
        if (this.f34149f.m35390j() == EnumC12811e.CANCELLED) {
            C12806d c12806d = new C12806d();
            c12806d.m35440a(true);
            return c12806d;
        }
        if (this.f34146c.m35353c() == 0) {
            C12806d c12806d2 = new C12806d();
            c12806d2.m35441b(true);
            return c12806d2;
        }
        String strM35355e = this.f34146c.m35355e();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.f34145b.mo35451a(strM35386f, strM35355e, new a(countDownLatch));
        try {
            try {
                countDownLatch.await(10L, TimeUnit.SECONDS);
                synchronized (this.f34144a) {
                    this.f34148e = false;
                }
            } catch (InterruptedException e) {
                C13219q0.m37814a(IDownloadTask.TAG, e.getMessage(), e);
                countDownLatch.countDown();
                synchronized (this.f34144a) {
                    this.f34148e = false;
                }
            }
            C12806d c12806dRun = C12800k.m35419a(this.f34149f, this.f34147d, this.f34145b, strM35386f, this.f34146c).run();
            if (!C12818a.m35507a(c12806dRun) || !c12806dRun.m35443c()) {
                if (this.f34146c != null) {
                    this.f34146c.m35351a(false);
                }
                return C12803n.m35430a(this.f34149f, this.f34147d, this.f34145b, this.f34146c).run();
            }
            if (this.f34146c != null) {
                this.f34146c.m35351a(true);
                this.f34146c.m35348a(this.f34149f.m35392l());
                this.f34146c.m35349a(this.f34147d.m35465d());
                this.f34146c.m35347a(((this.f34149f.m35387g() * 1.0f) / this.f34149f.m35392l()) * 100.0f);
            }
            m35412a(this.f34149f, this.f34146c);
            this.f34147d = C12808b.m35454a(this.f34147d.m35462c(), this.f34147d.m35468e(), this.f34147d.m35459b(), this.f34147d.m35472i(), System.currentTimeMillis(), this.f34149f.m35392l(), this.f34147d.m35455a(), this.f34147d.m35469f(), this.f34147d.m35465d());
            this.f34145b.mo35449a(this.f34147d, this.f34146c.m35355e());
            return c12806dRun;
        } catch (Throwable th) {
            synchronized (this.f34144a) {
                this.f34148e = false;
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    static InterfaceC12802m m35409a(C12793d c12793d, C12788b c12788b, InterfaceC12809c interfaceC12809c) {
        return new C12796g(c12793d, c12788b, interfaceC12809c);
    }

    /* JADX INFO: renamed from: a */
    private void m35412a(C12793d c12793d, C12788b c12788b) {
        if (c12793d.m35390j() != EnumC12811e.CANCELLED) {
            long jM35387g = this.f34149f.m35387g();
            long jM35392l = this.f34149f.m35392l();
            c12793d.m35373a(c12788b, new DownloadProgress(jM35387g, jM35392l, C12819b.m35510a(jM35392l, jM35387g)));
        }
    }
}
