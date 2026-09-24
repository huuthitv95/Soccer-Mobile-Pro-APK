package com.ironsource;

import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;

/* JADX INFO: renamed from: com.ironsource.b8 */
/* JADX INFO: loaded from: classes6.dex */
public class C12112b8 extends C12316m3 {

    /* JADX INFO: renamed from: d */
    private static final C12112b8 f30091d = new C12112b8();

    /* JADX INFO: renamed from: b */
    private InterfaceC12133cb f30092b = null;

    /* JADX INFO: renamed from: c */
    private InterfaceC12133cb f30093c = null;

    /* JADX INFO: renamed from: com.ironsource.b8$a */
    class a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ AdInfo f30094a;

        a(AdInfo adInfo) {
            this.f30094a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C12112b8 c12112b8 = C12112b8.this;
            InterfaceC12133cb interfaceC12133cb = c12112b8.f30092b;
            if (interfaceC12133cb != null) {
                interfaceC12133cb.mo26024e(c12112b8.m32149a(this.f30094a));
                IronLog.CALLBACK.info("onAdShowSucceeded() adInfo = " + C12112b8.this.m32149a(this.f30094a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.b8$b */
    class b implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ IronSourceError f30096a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ AdInfo f30097b;

        b(IronSourceError ironSourceError, AdInfo adInfo) {
            this.f30096a = ironSourceError;
            this.f30097b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C12112b8 c12112b8 = C12112b8.this;
            InterfaceC12133cb interfaceC12133cb = c12112b8.f30093c;
            if (interfaceC12133cb != null) {
                interfaceC12133cb.mo26019a(this.f30096a, c12112b8.m32149a(this.f30097b));
                IronLog.CALLBACK.info("onAdShowFailed() adInfo = " + C12112b8.this.m32149a(this.f30097b) + ", error = " + this.f30096a.getErrorMessage());
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.b8$c */
    class c implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ IronSourceError f30099a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ AdInfo f30100b;

        c(IronSourceError ironSourceError, AdInfo adInfo) {
            this.f30099a = ironSourceError;
            this.f30100b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C12112b8 c12112b8 = C12112b8.this;
            InterfaceC12133cb interfaceC12133cb = c12112b8.f30092b;
            if (interfaceC12133cb != null) {
                interfaceC12133cb.mo26019a(this.f30099a, c12112b8.m32149a(this.f30100b));
                IronLog.CALLBACK.info("onAdShowFailed() adInfo = " + C12112b8.this.m32149a(this.f30100b) + ", error = " + this.f30099a.getErrorMessage());
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.b8$d */
    class d implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ AdInfo f30102a;

        d(AdInfo adInfo) {
            this.f30102a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C12112b8 c12112b8 = C12112b8.this;
            InterfaceC12133cb interfaceC12133cb = c12112b8.f30093c;
            if (interfaceC12133cb != null) {
                interfaceC12133cb.mo26023d(c12112b8.m32149a(this.f30102a));
                IronLog.CALLBACK.info("onAdClicked() adInfo = " + C12112b8.this.m32149a(this.f30102a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.b8$e */
    class e implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ AdInfo f30104a;

        e(AdInfo adInfo) {
            this.f30104a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C12112b8 c12112b8 = C12112b8.this;
            InterfaceC12133cb interfaceC12133cb = c12112b8.f30092b;
            if (interfaceC12133cb != null) {
                interfaceC12133cb.mo26023d(c12112b8.m32149a(this.f30104a));
                IronLog.CALLBACK.info("onAdClicked() adInfo = " + C12112b8.this.m32149a(this.f30104a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.b8$f */
    class f implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ AdInfo f30106a;

        f(AdInfo adInfo) {
            this.f30106a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C12112b8 c12112b8 = C12112b8.this;
            InterfaceC12133cb interfaceC12133cb = c12112b8.f30093c;
            if (interfaceC12133cb != null) {
                interfaceC12133cb.mo26018a(c12112b8.m32149a(this.f30106a));
                IronLog.CALLBACK.info("onAdReady() adInfo = " + C12112b8.this.m32149a(this.f30106a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.b8$g */
    class g implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ AdInfo f30108a;

        g(AdInfo adInfo) {
            this.f30108a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C12112b8 c12112b8 = C12112b8.this;
            InterfaceC12133cb interfaceC12133cb = c12112b8.f30092b;
            if (interfaceC12133cb != null) {
                interfaceC12133cb.mo26018a(c12112b8.m32149a(this.f30108a));
                IronLog.CALLBACK.info("onAdReady() adInfo = " + C12112b8.this.m32149a(this.f30108a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.b8$h */
    class h implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ IronSourceError f30110a;

        h(IronSourceError ironSourceError) {
            this.f30110a = ironSourceError;
        }

        @Override // java.lang.Runnable
        public void run() {
            InterfaceC12133cb interfaceC12133cb = C12112b8.this.f30093c;
            if (interfaceC12133cb != null) {
                interfaceC12133cb.mo26021b(this.f30110a);
                IronLog.CALLBACK.info("onAdLoadFailed() error = " + this.f30110a.getErrorMessage());
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.b8$i */
    class i implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ IronSourceError f30112a;

        i(IronSourceError ironSourceError) {
            this.f30112a = ironSourceError;
        }

        @Override // java.lang.Runnable
        public void run() {
            InterfaceC12133cb interfaceC12133cb = C12112b8.this.f30092b;
            if (interfaceC12133cb != null) {
                interfaceC12133cb.mo26021b(this.f30112a);
                IronLog.CALLBACK.info("onAdLoadFailed() error = " + this.f30112a.getErrorMessage());
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.b8$j */
    class j implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ AdInfo f30114a;

        j(AdInfo adInfo) {
            this.f30114a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C12112b8 c12112b8 = C12112b8.this;
            InterfaceC12133cb interfaceC12133cb = c12112b8.f30093c;
            if (interfaceC12133cb != null) {
                interfaceC12133cb.mo26022c(c12112b8.m32149a(this.f30114a));
                IronLog.CALLBACK.info("onAdOpened() adInfo = " + C12112b8.this.m32149a(this.f30114a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.b8$k */
    class k implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ AdInfo f30116a;

        k(AdInfo adInfo) {
            this.f30116a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C12112b8 c12112b8 = C12112b8.this;
            InterfaceC12133cb interfaceC12133cb = c12112b8.f30092b;
            if (interfaceC12133cb != null) {
                interfaceC12133cb.mo26022c(c12112b8.m32149a(this.f30116a));
                IronLog.CALLBACK.info("onAdOpened() adInfo = " + C12112b8.this.m32149a(this.f30116a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.b8$l */
    class l implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ AdInfo f30118a;

        l(AdInfo adInfo) {
            this.f30118a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C12112b8 c12112b8 = C12112b8.this;
            InterfaceC12133cb interfaceC12133cb = c12112b8.f30093c;
            if (interfaceC12133cb != null) {
                interfaceC12133cb.mo26020b(c12112b8.m32149a(this.f30118a));
                IronLog.CALLBACK.info("onAdClosed() adInfo = " + C12112b8.this.m32149a(this.f30118a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.b8$m */
    class m implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ AdInfo f30120a;

        m(AdInfo adInfo) {
            this.f30120a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C12112b8 c12112b8 = C12112b8.this;
            InterfaceC12133cb interfaceC12133cb = c12112b8.f30092b;
            if (interfaceC12133cb != null) {
                interfaceC12133cb.mo26020b(c12112b8.m32149a(this.f30120a));
                IronLog.CALLBACK.info("onAdClosed() adInfo = " + C12112b8.this.m32149a(this.f30120a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.b8$n */
    class n implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ AdInfo f30122a;

        n(AdInfo adInfo) {
            this.f30122a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C12112b8 c12112b8 = C12112b8.this;
            InterfaceC12133cb interfaceC12133cb = c12112b8.f30093c;
            if (interfaceC12133cb != null) {
                interfaceC12133cb.mo26024e(c12112b8.m32149a(this.f30122a));
                IronLog.CALLBACK.info("onAdShowSucceeded() adInfo = " + C12112b8.this.m32149a(this.f30122a));
            }
        }
    }

    private C12112b8() {
    }

    /* JADX INFO: renamed from: a */
    public static synchronized C12112b8 m31149a() {
        return f30091d;
    }

    /* JADX INFO: renamed from: b */
    public synchronized void m31178b(InterfaceC12133cb interfaceC12133cb) {
        this.f30093c = interfaceC12133cb;
    }

    /* JADX INFO: renamed from: c */
    public void m31180c(AdInfo adInfo) {
        if (this.f30093c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new l(adInfo));
        } else if (this.f30092b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new m(adInfo));
        }
    }

    /* JADX INFO: renamed from: d */
    public void m31181d(AdInfo adInfo) {
        if (this.f30093c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new j(adInfo));
        } else if (this.f30092b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new k(adInfo));
        }
    }

    /* JADX INFO: renamed from: e */
    public void m31182e(AdInfo adInfo) {
        if (this.f30093c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new f(adInfo));
        } else if (this.f30092b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new g(adInfo));
        }
    }

    /* JADX INFO: renamed from: f */
    public void m31183f(AdInfo adInfo) {
        if (this.f30093c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new n(adInfo));
        } else if (this.f30092b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new a(adInfo));
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m31175a(InterfaceC12133cb interfaceC12133cb) {
        this.f30092b = interfaceC12133cb;
    }

    /* JADX INFO: renamed from: b */
    public void m31179b(AdInfo adInfo) {
        if (this.f30093c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new d(adInfo));
        } else if (this.f30092b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new e(adInfo));
        }
    }

    /* JADX INFO: renamed from: a */
    public void m31176a(IronSourceError ironSourceError) {
        if (this.f30093c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new h(ironSourceError));
        } else if (this.f30092b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new i(ironSourceError));
        }
    }

    /* JADX INFO: renamed from: a */
    public void m31177a(IronSourceError ironSourceError, AdInfo adInfo) {
        if (this.f30093c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new b(ironSourceError, adInfo));
        } else if (this.f30092b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new c(ironSourceError, adInfo));
        }
    }

    /* JADX INFO: renamed from: a */
    private void m31151a(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, str, 1);
    }
}
