package com.fyber.inneractive.sdk.player.p277ui.remote;

import com.fyber.inneractive.sdk.util.AbstractC9183r;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.ui.remote.b */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC8896b implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C8898d f20922a;

    public RunnableC8896b(C8898d c8898d) {
        this.f20922a = c8898d;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IAlog.m21945a("%s : remote UI load timeout task executed", "RemoteUIWebviewController");
        C8898d c8898d = this.f20922a;
        c8898d.f20930g = true;
        IAlog.m21945a("%s : UI load timed out", "RemoteUIWebviewController");
        AbstractC9183r.f21478b.post(c8898d.f20935l);
    }
}
