package com.fyber.inneractive.sdk.player;

import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.g */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC8847g implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C8848h f20787a;

    public RunnableC8847g(C8848h c8848h) {
        this.f20787a = c8848h;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C8848h c8848h = this.f20787a;
        c8848h.getClass();
        IAlog.m21945a("player progress monitor: run started", new Object[0]);
        int iMo20841b = c8848h.f20788a.mo20841b();
        if (!c8848h.f20791d) {
            IAlog.m21945a("run: 2 seconds passed? played for %d since last play started", Integer.valueOf(iMo20841b));
            if (iMo20841b >= 2000) {
                IAlog.m21945a("run: setting played 2 seconds flag", new Object[0]);
                c8848h.f20791d = true;
            }
        }
        c8848h.f20788a.mo20836a(iMo20841b);
    }
}
