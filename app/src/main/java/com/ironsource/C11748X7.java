package com.ironsource;

import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: renamed from: com.ironsource.X7 */
/* JADX INFO: loaded from: classes6.dex */
public class C11748X7 extends InterfaceC11731W7.a<ISDemandOnlyRewardedVideoListener> implements ISDemandOnlyRewardedVideoListener {

    /* JADX INFO: renamed from: com.ironsource.X7$a */
    class a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f26517a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ ISDemandOnlyRewardedVideoListener f26518b;

        a(String str, ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
            this.f26517a = str;
            this.f26518b = iSDemandOnlyRewardedVideoListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C11748X7.this.m27814a(this.f26517a, "onRewardedVideoAdLoadSuccess()");
            this.f26518b.onRewardedVideoAdLoadSuccess(this.f26517a);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.X7$b */
    class b implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f26520a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ IronSourceError f26521b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ ISDemandOnlyRewardedVideoListener f26522c;

        b(String str, IronSourceError ironSourceError, ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
            this.f26520a = str;
            this.f26521b = ironSourceError;
            this.f26522c = iSDemandOnlyRewardedVideoListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C11748X7.this.m27814a(this.f26520a, "onRewardedVideoAdLoadFailed() error = " + this.f26521b.getErrorMessage());
            this.f26522c.onRewardedVideoAdLoadFailed(this.f26520a, this.f26521b);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.X7$c */
    class c implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f26524a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ ISDemandOnlyRewardedVideoListener f26525b;

        c(String str, ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
            this.f26524a = str;
            this.f26525b = iSDemandOnlyRewardedVideoListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C11748X7.this.m27814a(this.f26524a, "onRewardedVideoAdOpened()");
            this.f26525b.onRewardedVideoAdOpened(this.f26524a);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.X7$d */
    class d implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f26527a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ IronSourceError f26528b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ ISDemandOnlyRewardedVideoListener f26529c;

        d(String str, IronSourceError ironSourceError, ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
            this.f26527a = str;
            this.f26528b = ironSourceError;
            this.f26529c = iSDemandOnlyRewardedVideoListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C11748X7.this.m27814a(this.f26527a, "onRewardedVideoAdShowFailed() error = " + this.f26528b.getErrorMessage());
            this.f26529c.onRewardedVideoAdShowFailed(this.f26527a, this.f26528b);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.X7$e */
    class e implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f26531a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ ISDemandOnlyRewardedVideoListener f26532b;

        e(String str, ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
            this.f26531a = str;
            this.f26532b = iSDemandOnlyRewardedVideoListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C11748X7.this.m27814a(this.f26531a, "onRewardedVideoAdClicked()");
            this.f26532b.onRewardedVideoAdClicked(this.f26531a);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.X7$f */
    class f implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f26534a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ ISDemandOnlyRewardedVideoListener f26535b;

        f(String str, ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
            this.f26534a = str;
            this.f26535b = iSDemandOnlyRewardedVideoListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C11748X7.this.m27814a(this.f26534a, "onRewardedVideoAdRewarded()");
            this.f26535b.onRewardedVideoAdRewarded(this.f26534a);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.X7$g */
    class g implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f26537a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ ISDemandOnlyRewardedVideoListener f26538b;

        g(String str, ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
            this.f26537a = str;
            this.f26538b = iSDemandOnlyRewardedVideoListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C11748X7.this.m27814a(this.f26537a, "onRewardedVideoAdClosed()");
            this.f26538b.onRewardedVideoAdClosed(this.f26537a);
        }
    }

    C11748X7(ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
        m27815b(iSDemandOnlyRewardedVideoListener);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdClicked(String str) {
        ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListenerM27812a = m27812a();
        m27813a(new e(str, iSDemandOnlyRewardedVideoListenerM27812a), iSDemandOnlyRewardedVideoListenerM27812a != null);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdClosed(String str) {
        ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListenerM27812a = m27812a();
        m27813a(new g(str, iSDemandOnlyRewardedVideoListenerM27812a), iSDemandOnlyRewardedVideoListenerM27812a != null);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdLoadFailed(String str, IronSourceError ironSourceError) {
        ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListenerM27812a = m27812a();
        m27813a(new b(str, ironSourceError, iSDemandOnlyRewardedVideoListenerM27812a), iSDemandOnlyRewardedVideoListenerM27812a != null);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdLoadSuccess(String str) {
        ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListenerM27812a = m27812a();
        m27813a(new a(str, iSDemandOnlyRewardedVideoListenerM27812a), iSDemandOnlyRewardedVideoListenerM27812a != null);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdOpened(String str) {
        ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListenerM27812a = m27812a();
        m27813a(new c(str, iSDemandOnlyRewardedVideoListenerM27812a), iSDemandOnlyRewardedVideoListenerM27812a != null);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdRewarded(String str) {
        ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListenerM27812a = m27812a();
        m27813a(new f(str, iSDemandOnlyRewardedVideoListenerM27812a), iSDemandOnlyRewardedVideoListenerM27812a != null);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdShowFailed(String str, IronSourceError ironSourceError) {
        ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListenerM27812a = m27812a();
        m27813a(new d(str, ironSourceError, iSDemandOnlyRewardedVideoListenerM27812a), iSDemandOnlyRewardedVideoListenerM27812a != null);
    }

    C11748X7() {
    }
}
