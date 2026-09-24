package com.fyber.inneractive.sdk.player.mediaplayer;

import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.mediaplayer.j */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC8863j implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f20808a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C8869p f20809b;

    public RunnableC8863j(C8869p c8869p, int i) {
        this.f20809b = c8869p;
        this.f20808a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C8869p c8869p = this.f20809b;
        int i = this.f20808a;
        String strM21413b = c8869p.m21413b();
        long jCurrentTimeMillis = System.currentTimeMillis();
        c8869p.seekTo(i);
        IAlog.m21949e(strM21413b + "timelog: seekTo took " + (System.currentTimeMillis() - jCurrentTimeMillis) + " msec", new Object[0]);
    }
}
