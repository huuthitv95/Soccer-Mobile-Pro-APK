package com.fyber.inneractive.sdk.player.mediaplayer;

import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.mediaplayer.l */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC8865l implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C8869p f20811a;

    public RunnableC8865l(C8869p c8869p) {
        this.f20811a = c8869p;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C8869p c8869p = this.f20811a;
        String strM21413b = c8869p.m21413b();
        long jCurrentTimeMillis = System.currentTimeMillis();
        c8869p.setVolume(0.0f, 0.0f);
        IAlog.m21949e(strM21413b + "timelog: mute took " + (System.currentTimeMillis() - jCurrentTimeMillis) + " msec", new Object[0]);
    }
}
