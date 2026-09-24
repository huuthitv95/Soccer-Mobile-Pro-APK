package com.ironsource;

import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;

/* JADX INFO: renamed from: com.ironsource.zd */
/* JADX INFO: loaded from: classes6.dex */
public class C12642zd extends C12316m3 {

    /* JADX INFO: renamed from: d */
    private static final C12642zd f33303d = new C12642zd();

    /* JADX INFO: renamed from: b */
    private InterfaceC12389nb f33304b = null;

    /* JADX INFO: renamed from: c */
    private InterfaceC12389nb f33305c = null;

    /* JADX INFO: renamed from: com.ironsource.zd$a */
    class a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ boolean f33306a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ AdInfo f33307b;

        a(boolean z, AdInfo adInfo) {
            this.f33306a = z;
            this.f33307b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C12642zd c12642zd = C12642zd.this;
            InterfaceC12389nb interfaceC12389nb = c12642zd.f33304b;
            if (interfaceC12389nb != null) {
                if (!this.f33306a) {
                    ((InterfaceC12407ob) interfaceC12389nb).mo26025a();
                    IronLog.CALLBACK.info("onAdUnavailable()");
                    return;
                }
                ((InterfaceC12407ob) interfaceC12389nb).mo26033d(c12642zd.m32149a(this.f33307b));
                IronLog.CALLBACK.info("onAdAvailable() adInfo = " + C12642zd.this.m32149a(this.f33307b));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.zd$b */
    class b implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C12135cd f33309a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ AdInfo f33310b;

        b(C12135cd c12135cd, AdInfo adInfo) {
            this.f33309a = c12135cd;
            this.f33310b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C12642zd c12642zd = C12642zd.this;
            InterfaceC12389nb interfaceC12389nb = c12642zd.f33305c;
            if (interfaceC12389nb != null) {
                interfaceC12389nb.mo26029b(this.f33309a, c12642zd.m32149a(this.f33310b));
                IronLog.CALLBACK.info("onAdRewarded() placement = " + this.f33309a + ", adInfo = " + C12642zd.this.m32149a(this.f33310b));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.zd$c */
    class c implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C12135cd f33312a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ AdInfo f33313b;

        c(C12135cd c12135cd, AdInfo adInfo) {
            this.f33312a = c12135cd;
            this.f33313b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C12642zd c12642zd = C12642zd.this;
            InterfaceC12389nb interfaceC12389nb = c12642zd.f33304b;
            if (interfaceC12389nb != null) {
                interfaceC12389nb.mo26029b(this.f33312a, c12642zd.m32149a(this.f33313b));
                IronLog.CALLBACK.info("onAdRewarded() placement = " + this.f33312a + ", adInfo = " + C12642zd.this.m32149a(this.f33313b));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.zd$d */
    class d implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ IronSourceError f33315a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ AdInfo f33316b;

        d(IronSourceError ironSourceError, AdInfo adInfo) {
            this.f33315a = ironSourceError;
            this.f33316b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C12642zd c12642zd = C12642zd.this;
            InterfaceC12389nb interfaceC12389nb = c12642zd.f33305c;
            if (interfaceC12389nb != null) {
                interfaceC12389nb.mo26028a(this.f33315a, c12642zd.m32149a(this.f33316b));
                IronLog.CALLBACK.info("onAdShowFailed() adInfo = " + C12642zd.this.m32149a(this.f33316b) + ", error = " + this.f33315a.getErrorMessage());
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.zd$e */
    class e implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ IronSourceError f33318a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ AdInfo f33319b;

        e(IronSourceError ironSourceError, AdInfo adInfo) {
            this.f33318a = ironSourceError;
            this.f33319b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C12642zd c12642zd = C12642zd.this;
            InterfaceC12389nb interfaceC12389nb = c12642zd.f33304b;
            if (interfaceC12389nb != null) {
                interfaceC12389nb.mo26028a(this.f33318a, c12642zd.m32149a(this.f33319b));
                IronLog.CALLBACK.info("onAdShowFailed() adInfo = " + C12642zd.this.m32149a(this.f33319b) + ", error = " + this.f33318a.getErrorMessage());
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.zd$f */
    class f implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C12135cd f33321a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ AdInfo f33322b;

        f(C12135cd c12135cd, AdInfo adInfo) {
            this.f33321a = c12135cd;
            this.f33322b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C12642zd c12642zd = C12642zd.this;
            InterfaceC12389nb interfaceC12389nb = c12642zd.f33305c;
            if (interfaceC12389nb != null) {
                interfaceC12389nb.mo26026a(this.f33321a, c12642zd.m32149a(this.f33322b));
                IronLog.CALLBACK.info("onAdClicked() placement = " + this.f33321a + ", adInfo = " + C12642zd.this.m32149a(this.f33322b));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.zd$g */
    class g implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C12135cd f33324a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ AdInfo f33325b;

        g(C12135cd c12135cd, AdInfo adInfo) {
            this.f33324a = c12135cd;
            this.f33325b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C12642zd c12642zd = C12642zd.this;
            InterfaceC12389nb interfaceC12389nb = c12642zd.f33304b;
            if (interfaceC12389nb != null) {
                interfaceC12389nb.mo26026a(this.f33324a, c12642zd.m32149a(this.f33325b));
                IronLog.CALLBACK.info("onAdClicked() placement = " + this.f33324a + ", adInfo = " + C12642zd.this.m32149a(this.f33325b));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.zd$h */
    class h implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ AdInfo f33327a;

        h(AdInfo adInfo) {
            this.f33327a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C12642zd c12642zd = C12642zd.this;
            InterfaceC12389nb interfaceC12389nb = c12642zd.f33305c;
            if (interfaceC12389nb != null) {
                ((InterfaceC12425pb) interfaceC12389nb).mo26027a(c12642zd.m32149a(this.f33327a));
                IronLog.CALLBACK.info("onAdReady() adInfo = " + C12642zd.this.m32149a(this.f33327a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.zd$i */
    class i implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ AdInfo f33329a;

        i(AdInfo adInfo) {
            this.f33329a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C12642zd c12642zd = C12642zd.this;
            InterfaceC12389nb interfaceC12389nb = c12642zd.f33304b;
            if (interfaceC12389nb != null) {
                ((InterfaceC12425pb) interfaceC12389nb).mo26027a(c12642zd.m32149a(this.f33329a));
                IronLog.CALLBACK.info("onAdReady() adInfo = " + C12642zd.this.m32149a(this.f33329a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.zd$j */
    class j implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ IronSourceError f33331a;

        j(IronSourceError ironSourceError) {
            this.f33331a = ironSourceError;
        }

        @Override // java.lang.Runnable
        public void run() {
            InterfaceC12389nb interfaceC12389nb = C12642zd.this.f33305c;
            if (interfaceC12389nb != null) {
                ((InterfaceC12425pb) interfaceC12389nb).mo26031b(this.f33331a);
                IronLog.CALLBACK.info("onAdLoadFailed() error = " + this.f33331a.getErrorMessage());
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.zd$k */
    class k implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ IronSourceError f33333a;

        k(IronSourceError ironSourceError) {
            this.f33333a = ironSourceError;
        }

        @Override // java.lang.Runnable
        public void run() {
            InterfaceC12389nb interfaceC12389nb = C12642zd.this.f33304b;
            if (interfaceC12389nb != null) {
                ((InterfaceC12425pb) interfaceC12389nb).mo26031b(this.f33333a);
                IronLog.CALLBACK.info("onAdLoadFailed() error = " + this.f33333a.getErrorMessage());
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.zd$l */
    class l implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ AdInfo f33335a;

        l(AdInfo adInfo) {
            this.f33335a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C12642zd c12642zd = C12642zd.this;
            InterfaceC12389nb interfaceC12389nb = c12642zd.f33305c;
            if (interfaceC12389nb != null) {
                interfaceC12389nb.mo26032c(c12642zd.m32149a(this.f33335a));
                IronLog.CALLBACK.info("onAdOpened() adInfo = " + C12642zd.this.m32149a(this.f33335a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.zd$m */
    class m implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ AdInfo f33337a;

        m(AdInfo adInfo) {
            this.f33337a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C12642zd c12642zd = C12642zd.this;
            InterfaceC12389nb interfaceC12389nb = c12642zd.f33304b;
            if (interfaceC12389nb != null) {
                interfaceC12389nb.mo26032c(c12642zd.m32149a(this.f33337a));
                IronLog.CALLBACK.info("onAdOpened() adInfo = " + C12642zd.this.m32149a(this.f33337a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.zd$n */
    class n implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ AdInfo f33339a;

        n(AdInfo adInfo) {
            this.f33339a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C12642zd c12642zd = C12642zd.this;
            InterfaceC12389nb interfaceC12389nb = c12642zd.f33305c;
            if (interfaceC12389nb != null) {
                interfaceC12389nb.mo26030b(c12642zd.m32149a(this.f33339a));
                IronLog.CALLBACK.info("onAdClosed() adInfo = " + C12642zd.this.m32149a(this.f33339a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.zd$o */
    class o implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ AdInfo f33341a;

        o(AdInfo adInfo) {
            this.f33341a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C12642zd c12642zd = C12642zd.this;
            InterfaceC12389nb interfaceC12389nb = c12642zd.f33304b;
            if (interfaceC12389nb != null) {
                interfaceC12389nb.mo26030b(c12642zd.m32149a(this.f33341a));
                IronLog.CALLBACK.info("onAdClosed() adInfo = " + C12642zd.this.m32149a(this.f33341a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.zd$p */
    class p implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ boolean f33343a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ AdInfo f33344b;

        p(boolean z, AdInfo adInfo) {
            this.f33343a = z;
            this.f33344b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C12642zd c12642zd = C12642zd.this;
            InterfaceC12389nb interfaceC12389nb = c12642zd.f33305c;
            if (interfaceC12389nb != null) {
                if (!this.f33343a) {
                    ((InterfaceC12407ob) interfaceC12389nb).mo26025a();
                    IronLog.CALLBACK.info("onAdUnavailable()");
                    return;
                }
                ((InterfaceC12407ob) interfaceC12389nb).mo26033d(c12642zd.m32149a(this.f33344b));
                IronLog.CALLBACK.info("onAdAvailable() adInfo = " + C12642zd.this.m32149a(this.f33344b));
            }
        }
    }

    private C12642zd() {
    }

    /* JADX INFO: renamed from: b */
    public void m34354b() {
    }

    /* JADX INFO: renamed from: c */
    public void m34358c() {
    }

    /* JADX INFO: renamed from: a */
    public static C12642zd m34322a() {
        return f33303d;
    }

    /* JADX INFO: renamed from: b */
    public void m34357b(InterfaceC12389nb interfaceC12389nb) {
        this.f33305c = interfaceC12389nb;
    }

    /* JADX INFO: renamed from: c */
    public void m34359c(AdInfo adInfo) {
        if (this.f33305c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new l(adInfo));
        } else if (this.f33304b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new m(adInfo));
        }
    }

    /* JADX INFO: renamed from: d */
    public void m34360d(AdInfo adInfo) {
        if (this.f33305c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new h(adInfo));
            return;
        }
        InterfaceC12389nb interfaceC12389nb = this.f33304b;
        if (interfaceC12389nb == null || !(interfaceC12389nb instanceof InterfaceC12425pb)) {
            return;
        }
        IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new i(adInfo));
    }

    /* JADX INFO: renamed from: a */
    public void m34352a(InterfaceC12389nb interfaceC12389nb) {
        this.f33304b = interfaceC12389nb;
    }

    /* JADX INFO: renamed from: b */
    public void m34356b(AdInfo adInfo) {
        if (this.f33305c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new n(adInfo));
        } else if (this.f33304b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new o(adInfo));
        }
    }

    /* JADX INFO: renamed from: a */
    public void m34350a(IronSourceError ironSourceError) {
        if (this.f33305c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new j(ironSourceError));
            return;
        }
        InterfaceC12389nb interfaceC12389nb = this.f33304b;
        if (interfaceC12389nb == null || !(interfaceC12389nb instanceof InterfaceC12425pb)) {
            return;
        }
        IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new k(ironSourceError));
    }

    /* JADX INFO: renamed from: b */
    public void m34355b(C12135cd c12135cd, AdInfo adInfo) {
        if (this.f33305c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new b(c12135cd, adInfo));
        } else if (this.f33304b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new c(c12135cd, adInfo));
        }
    }

    /* JADX INFO: renamed from: a */
    public void m34353a(boolean z, AdInfo adInfo) {
        if (this.f33305c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new p(z, adInfo));
            return;
        }
        InterfaceC12389nb interfaceC12389nb = this.f33304b;
        if (interfaceC12389nb == null || !(interfaceC12389nb instanceof InterfaceC12407ob)) {
            return;
        }
        IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new a(z, adInfo));
    }

    /* JADX INFO: renamed from: a */
    public void m34351a(IronSourceError ironSourceError, AdInfo adInfo) {
        if (this.f33305c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new d(ironSourceError, adInfo));
        } else if (this.f33304b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new e(ironSourceError, adInfo));
        }
    }

    /* JADX INFO: renamed from: a */
    public void m34349a(C12135cd c12135cd, AdInfo adInfo) {
        if (this.f33305c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new f(c12135cd, adInfo));
        } else if (this.f33304b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new g(c12135cd, adInfo));
        }
    }

    /* JADX INFO: renamed from: a */
    private void m34323a(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, str, 1);
    }
}
