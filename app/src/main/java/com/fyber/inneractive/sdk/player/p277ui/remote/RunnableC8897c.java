package com.fyber.inneractive.sdk.player.p277ui.remote;

import com.fyber.inneractive.sdk.network.events.EnumC8372b;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.ui.remote.c */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC8897c implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C8898d f20923a;

    public RunnableC8897c(C8898d c8898d) {
        this.f20923a = c8898d;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IAlog.m21945a("%s : remote UI failed task executed", "RemoteUIWebviewController");
        C8898d c8898d = this.f20923a;
        if (c8898d.f20931h) {
            return;
        }
        c8898d.mo21463a(EnumC8372b.TEMPLATE_LOAD_TIMEOUT, "Loading remote UI timed out", true, null);
    }
}
