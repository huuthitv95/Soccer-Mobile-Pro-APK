package com.ironsource;

import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: renamed from: com.ironsource.U7 */
/* JADX INFO: loaded from: classes6.dex */
public class C11697U7 extends InterfaceC11731W7.a<ISDemandOnlyInterstitialListener> implements ISDemandOnlyInterstitialListener {

    /* JADX INFO: renamed from: com.ironsource.U7$a */
    class a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f25888a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ ISDemandOnlyInterstitialListener f25889b;

        a(String str, ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
            this.f25888a = str;
            this.f25889b = iSDemandOnlyInterstitialListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C11697U7.this.m27814a(this.f25888a, "onInterstitialAdReady()");
            this.f25889b.onInterstitialAdReady(this.f25888a);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.U7$b */
    class b implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f25891a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ IronSourceError f25892b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ ISDemandOnlyInterstitialListener f25893c;

        b(String str, IronSourceError ironSourceError, ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
            this.f25891a = str;
            this.f25892b = ironSourceError;
            this.f25893c = iSDemandOnlyInterstitialListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C11697U7.this.m27814a(this.f25891a, "onInterstitialAdLoadFailed() error = " + this.f25892b.getErrorMessage());
            this.f25893c.onInterstitialAdLoadFailed(this.f25891a, this.f25892b);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.U7$c */
    class c implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f25895a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ ISDemandOnlyInterstitialListener f25896b;

        c(String str, ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
            this.f25895a = str;
            this.f25896b = iSDemandOnlyInterstitialListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C11697U7.this.m27814a(this.f25895a, "onInterstitialAdOpened()");
            this.f25896b.onInterstitialAdOpened(this.f25895a);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.U7$d */
    class d implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f25898a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ IronSourceError f25899b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ ISDemandOnlyInterstitialListener f25900c;

        d(String str, IronSourceError ironSourceError, ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
            this.f25898a = str;
            this.f25899b = ironSourceError;
            this.f25900c = iSDemandOnlyInterstitialListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C11697U7.this.m27814a(this.f25898a, "onInterstitialAdShowFailed() error = " + this.f25899b.getErrorMessage());
            this.f25900c.onInterstitialAdShowFailed(this.f25898a, this.f25899b);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.U7$e */
    class e implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f25902a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ ISDemandOnlyInterstitialListener f25903b;

        e(String str, ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
            this.f25902a = str;
            this.f25903b = iSDemandOnlyInterstitialListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C11697U7.this.m27814a(this.f25902a, "onInterstitialAdClicked()");
            this.f25903b.onInterstitialAdClicked(this.f25902a);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.U7$f */
    class f implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f25905a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ ISDemandOnlyInterstitialListener f25906b;

        f(String str, ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
            this.f25905a = str;
            this.f25906b = iSDemandOnlyInterstitialListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C11697U7.this.m27814a(this.f25905a, "onInterstitialAdClosed()");
            this.f25906b.onInterstitialAdClosed(this.f25905a);
        }
    }

    C11697U7(ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
        m27815b(iSDemandOnlyInterstitialListener);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public void onInterstitialAdClicked(String str) {
        ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListenerM27812a = m27812a();
        m27813a(new e(str, iSDemandOnlyInterstitialListenerM27812a), iSDemandOnlyInterstitialListenerM27812a != null);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public void onInterstitialAdClosed(String str) {
        ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListenerM27812a = m27812a();
        m27813a(new f(str, iSDemandOnlyInterstitialListenerM27812a), iSDemandOnlyInterstitialListenerM27812a != null);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public void onInterstitialAdLoadFailed(String str, IronSourceError ironSourceError) {
        ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListenerM27812a = m27812a();
        m27813a(new b(str, ironSourceError, iSDemandOnlyInterstitialListenerM27812a), iSDemandOnlyInterstitialListenerM27812a != null);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public void onInterstitialAdOpened(String str) {
        ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListenerM27812a = m27812a();
        m27813a(new c(str, iSDemandOnlyInterstitialListenerM27812a), iSDemandOnlyInterstitialListenerM27812a != null);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public void onInterstitialAdReady(String str) {
        ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListenerM27812a = m27812a();
        m27813a(new a(str, iSDemandOnlyInterstitialListenerM27812a), iSDemandOnlyInterstitialListenerM27812a != null);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public void onInterstitialAdShowFailed(String str, IronSourceError ironSourceError) {
        ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListenerM27812a = m27812a();
        m27813a(new d(str, ironSourceError, iSDemandOnlyInterstitialListenerM27812a), iSDemandOnlyInterstitialListenerM27812a != null);
    }

    C11697U7() {
    }
}
