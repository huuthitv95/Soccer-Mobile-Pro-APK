package com.ironsource;

import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: renamed from: com.ironsource.x2 */
/* JADX INFO: loaded from: classes6.dex */
public class C12595x2 extends C12316m3 {

    /* JADX INFO: renamed from: d */
    private static final C12595x2 f32733d = new C12595x2();

    /* JADX INFO: renamed from: b */
    private InterfaceC12621ya f32734b = null;

    /* JADX INFO: renamed from: c */
    private InterfaceC12621ya f32735c = null;

    /* JADX INFO: renamed from: com.ironsource.x2$a */
    class a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ AdInfo f32736a;

        a(AdInfo adInfo) {
            this.f32736a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C12595x2 c12595x2 = C12595x2.this;
            InterfaceC12621ya interfaceC12621ya = c12595x2.f32734b;
            if (interfaceC12621ya != null) {
                interfaceC12621ya.mo26038g(c12595x2.m32149a(this.f32736a));
                IronLog.CALLBACK.info("onAdLeftApplication() adInfo = " + C12595x2.this.m32149a(this.f32736a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.x2$b */
    class b implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ AdInfo f32738a;

        b(AdInfo adInfo) {
            this.f32738a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C12595x2 c12595x2 = C12595x2.this;
            InterfaceC12621ya interfaceC12621ya = c12595x2.f32735c;
            if (interfaceC12621ya != null) {
                interfaceC12621ya.mo26035d(c12595x2.m32149a(this.f32738a));
                IronLog.CALLBACK.info("onAdClicked() adInfo = " + C12595x2.this.m32149a(this.f32738a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.x2$c */
    class c implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ AdInfo f32740a;

        c(AdInfo adInfo) {
            this.f32740a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C12595x2 c12595x2 = C12595x2.this;
            InterfaceC12621ya interfaceC12621ya = c12595x2.f32734b;
            if (interfaceC12621ya != null) {
                interfaceC12621ya.mo26035d(c12595x2.m32149a(this.f32740a));
                IronLog.CALLBACK.info("onAdClicked() adInfo = " + C12595x2.this.m32149a(this.f32740a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.x2$d */
    class d implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ AdInfo f32742a;

        d(AdInfo adInfo) {
            this.f32742a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C12595x2 c12595x2 = C12595x2.this;
            InterfaceC12621ya interfaceC12621ya = c12595x2.f32735c;
            if (interfaceC12621ya != null) {
                interfaceC12621ya.mo26036e(c12595x2.m32149a(this.f32742a));
                IronLog.CALLBACK.info("onAdLoaded() adInfo = " + C12595x2.this.m32149a(this.f32742a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.x2$e */
    class e implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ AdInfo f32744a;

        e(AdInfo adInfo) {
            this.f32744a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C12595x2 c12595x2 = C12595x2.this;
            InterfaceC12621ya interfaceC12621ya = c12595x2.f32734b;
            if (interfaceC12621ya != null) {
                interfaceC12621ya.mo26036e(c12595x2.m32149a(this.f32744a));
                IronLog.CALLBACK.info("onAdLoaded() adInfo = " + C12595x2.this.m32149a(this.f32744a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.x2$f */
    class f implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ IronSourceError f32746a;

        f(IronSourceError ironSourceError) {
            this.f32746a = ironSourceError;
        }

        @Override // java.lang.Runnable
        public void run() {
            InterfaceC12621ya interfaceC12621ya = C12595x2.this.f32735c;
            if (interfaceC12621ya != null) {
                interfaceC12621ya.mo26034b(this.f32746a);
                IronLog.CALLBACK.info("onAdLoadFailed() error = " + this.f32746a.getErrorMessage());
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.x2$g */
    class g implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ IronSourceError f32748a;

        g(IronSourceError ironSourceError) {
            this.f32748a = ironSourceError;
        }

        @Override // java.lang.Runnable
        public void run() {
            InterfaceC12621ya interfaceC12621ya = C12595x2.this.f32734b;
            if (interfaceC12621ya != null) {
                interfaceC12621ya.mo26034b(this.f32748a);
                IronLog.CALLBACK.info("onAdLoadFailed() error = " + this.f32748a.getErrorMessage());
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.x2$h */
    class h implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ AdInfo f32750a;

        h(AdInfo adInfo) {
            this.f32750a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C12595x2 c12595x2 = C12595x2.this;
            InterfaceC12621ya interfaceC12621ya = c12595x2.f32735c;
            if (interfaceC12621ya != null) {
                interfaceC12621ya.mo26039h(c12595x2.m32149a(this.f32750a));
                IronLog.CALLBACK.info("onAdScreenPresented() adInfo = " + C12595x2.this.m32149a(this.f32750a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.x2$i */
    class i implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ AdInfo f32752a;

        i(AdInfo adInfo) {
            this.f32752a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C12595x2 c12595x2 = C12595x2.this;
            InterfaceC12621ya interfaceC12621ya = c12595x2.f32734b;
            if (interfaceC12621ya != null) {
                interfaceC12621ya.mo26039h(c12595x2.m32149a(this.f32752a));
                IronLog.CALLBACK.info("onAdScreenPresented() adInfo = " + C12595x2.this.m32149a(this.f32752a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.x2$j */
    class j implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ AdInfo f32754a;

        j(AdInfo adInfo) {
            this.f32754a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C12595x2 c12595x2 = C12595x2.this;
            InterfaceC12621ya interfaceC12621ya = c12595x2.f32735c;
            if (interfaceC12621ya != null) {
                interfaceC12621ya.mo26037f(c12595x2.m32149a(this.f32754a));
                IronLog.CALLBACK.info("onAdScreenDismissed() adInfo = " + C12595x2.this.m32149a(this.f32754a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.x2$k */
    class k implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ AdInfo f32756a;

        k(AdInfo adInfo) {
            this.f32756a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C12595x2 c12595x2 = C12595x2.this;
            InterfaceC12621ya interfaceC12621ya = c12595x2.f32734b;
            if (interfaceC12621ya != null) {
                interfaceC12621ya.mo26037f(c12595x2.m32149a(this.f32756a));
                IronLog.CALLBACK.info("onAdScreenDismissed() adInfo = " + C12595x2.this.m32149a(this.f32756a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.x2$l */
    class l implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ AdInfo f32758a;

        l(AdInfo adInfo) {
            this.f32758a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C12595x2 c12595x2 = C12595x2.this;
            InterfaceC12621ya interfaceC12621ya = c12595x2.f32735c;
            if (interfaceC12621ya != null) {
                interfaceC12621ya.mo26038g(c12595x2.m32149a(this.f32758a));
                IronLog.CALLBACK.info("onAdLeftApplication() adInfo = " + C12595x2.this.m32149a(this.f32758a));
            }
        }
    }

    private C12595x2() {
    }

    /* JADX INFO: renamed from: a */
    public static C12595x2 m34097a() {
        return f32733d;
    }

    /* JADX INFO: renamed from: b */
    public void m34121b(InterfaceC12621ya interfaceC12621ya) {
        this.f32735c = interfaceC12621ya;
    }

    /* JADX INFO: renamed from: c */
    public void m34122c(AdInfo adInfo) {
        if (this.f32735c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new l(adInfo));
        } else if (this.f32734b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new a(adInfo));
        }
    }

    /* JADX INFO: renamed from: d */
    public void m34123d(AdInfo adInfo) {
        if (this.f32735c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new d(adInfo));
        } else if (this.f32734b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new e(adInfo));
        }
    }

    /* JADX INFO: renamed from: e */
    public void m34124e(AdInfo adInfo) {
        if (this.f32735c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new j(adInfo));
        } else if (this.f32734b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new k(adInfo));
        }
    }

    /* JADX INFO: renamed from: f */
    public void m34125f(AdInfo adInfo) {
        if (this.f32735c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new h(adInfo));
        } else if (this.f32734b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new i(adInfo));
        }
    }

    /* JADX INFO: renamed from: a */
    public void m34118a(InterfaceC12621ya interfaceC12621ya) {
        this.f32734b = interfaceC12621ya;
    }

    /* JADX INFO: renamed from: b */
    public InterfaceC12621ya m34119b() {
        return this.f32734b;
    }

    /* JADX INFO: renamed from: a */
    public void m34117a(IronSourceError ironSourceError) {
        if (this.f32735c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new f(ironSourceError));
        } else if (this.f32734b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new g(ironSourceError));
        }
    }

    /* JADX INFO: renamed from: b */
    public void m34120b(AdInfo adInfo) {
        if (this.f32735c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new b(adInfo));
        } else if (this.f32734b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new c(adInfo));
        }
    }
}
