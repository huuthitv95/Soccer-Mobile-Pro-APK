package com.ironsource;

import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerListener;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: renamed from: com.ironsource.w2 */
/* JADX INFO: loaded from: classes6.dex */
public class C12577w2 extends InterfaceC11731W7.a<ISDemandOnlyBannerListener> {

    /* JADX INFO: renamed from: com.ironsource.w2$a */
    class a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f32654a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ IronSourceError f32655b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ ISDemandOnlyBannerListener f32656c;

        a(String str, IronSourceError ironSourceError, ISDemandOnlyBannerListener iSDemandOnlyBannerListener) {
            this.f32654a = str;
            this.f32655b = ironSourceError;
            this.f32656c = iSDemandOnlyBannerListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C12577w2.this.m27814a(this.f32654a, "onBannerAdLoadFailed() error = " + this.f32655b.getErrorMessage());
            this.f32656c.onBannerAdLoadFailed(this.f32654a, this.f32655b);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.w2$b */
    class b implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f32658a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ ISDemandOnlyBannerListener f32659b;

        b(String str, ISDemandOnlyBannerListener iSDemandOnlyBannerListener) {
            this.f32658a = str;
            this.f32659b = iSDemandOnlyBannerListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C12577w2.this.m27814a(this.f32658a, "onBannerAdLoaded()");
            this.f32659b.onBannerAdLoaded(this.f32658a);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.w2$c */
    class c implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f32661a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ ISDemandOnlyBannerListener f32662b;

        c(String str, ISDemandOnlyBannerListener iSDemandOnlyBannerListener) {
            this.f32661a = str;
            this.f32662b = iSDemandOnlyBannerListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C12577w2.this.m27814a(this.f32661a, "onBannerAdShown()");
            this.f32662b.onBannerAdShown(this.f32661a);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.w2$d */
    class d implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f32664a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ ISDemandOnlyBannerListener f32665b;

        d(String str, ISDemandOnlyBannerListener iSDemandOnlyBannerListener) {
            this.f32664a = str;
            this.f32665b = iSDemandOnlyBannerListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C12577w2.this.m27814a(this.f32664a, "onBannerAdClicked()");
            this.f32665b.onBannerAdClicked(this.f32664a);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.w2$e */
    class e implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f32667a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ ISDemandOnlyBannerListener f32668b;

        e(String str, ISDemandOnlyBannerListener iSDemandOnlyBannerListener) {
            this.f32667a = str;
            this.f32668b = iSDemandOnlyBannerListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C12577w2.this.m27814a(this.f32667a, "onBannerAdLeftApplication()");
            this.f32668b.onBannerAdLeftApplication(this.f32667a);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m34031a(String str, IronSourceError ironSourceError) {
        ISDemandOnlyBannerListener iSDemandOnlyBannerListenerM27812a = m27812a();
        m27813a(new a(str, ironSourceError, iSDemandOnlyBannerListenerM27812a), iSDemandOnlyBannerListenerM27812a != null);
    }

    /* JADX INFO: renamed from: b */
    public void m34032b(String str) {
        ISDemandOnlyBannerListener iSDemandOnlyBannerListenerM27812a = m27812a();
        m27813a(new e(str, iSDemandOnlyBannerListenerM27812a), iSDemandOnlyBannerListenerM27812a != null);
    }

    /* JADX INFO: renamed from: c */
    public void m34033c(String str) {
        ISDemandOnlyBannerListener iSDemandOnlyBannerListenerM27812a = m27812a();
        m27813a(new b(str, iSDemandOnlyBannerListenerM27812a), iSDemandOnlyBannerListenerM27812a != null);
    }

    /* JADX INFO: renamed from: d */
    public void m34034d(String str) {
        ISDemandOnlyBannerListener iSDemandOnlyBannerListenerM27812a = m27812a();
        m27813a(new c(str, iSDemandOnlyBannerListenerM27812a), iSDemandOnlyBannerListenerM27812a != null);
    }

    /* JADX INFO: renamed from: a */
    public void m34030a(String str) {
        ISDemandOnlyBannerListener iSDemandOnlyBannerListenerM27812a = m27812a();
        m27813a(new d(str, iSDemandOnlyBannerListenerM27812a), iSDemandOnlyBannerListenerM27812a != null);
    }
}
