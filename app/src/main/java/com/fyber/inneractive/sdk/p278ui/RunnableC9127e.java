package com.fyber.inneractive.sdk.p278ui;

import com.fyber.inneractive.sdk.web.C9248m;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.ui.e */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC9127e implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ IAmraidWebViewController f21421a;

    public RunnableC9127e(IAmraidWebViewController iAmraidWebViewController) {
        this.f21421a = iAmraidWebViewController;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C9248m c9248m = this.f21421a.f21565b;
        if (c9248m != null) {
            c9248m.m22085a("if (FyberMraidVideoController.getCurrentTime() < 0.2) { var ifr = document.createElement('iframe'); var container = document.body || document.documentElement; container.appendChild(ifr); ifr.setAttribute('sandbox', ''); ifr.setAttribute('style', 'position: fixed; bottom: -20px; border: none; visibility: hidden; height: 20px; z-index: -99999'); ifr.setAttribute('src','FyMraidVideo://fyMraidVideoAdPlaybackFailure'); console.log('dispatched closure event'); } else { console.log('video has progressed'); };");
        }
    }
}
