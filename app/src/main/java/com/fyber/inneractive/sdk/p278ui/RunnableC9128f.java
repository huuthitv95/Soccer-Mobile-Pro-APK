package com.fyber.inneractive.sdk.p278ui;

import com.fyber.inneractive.sdk.web.C9248m;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.ui.f */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC9128f implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ IAmraidWebViewController f21422a;

    public RunnableC9128f(IAmraidWebViewController iAmraidWebViewController) {
        this.f21422a = iAmraidWebViewController;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C9248m c9248m = this.f21422a.f21565b;
        if (c9248m != null) {
            try {
                c9248m.invalidate();
            } catch (Throwable unused) {
            }
        }
    }
}
