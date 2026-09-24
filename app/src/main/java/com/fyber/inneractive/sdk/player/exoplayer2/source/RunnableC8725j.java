package com.fyber.inneractive.sdk.player.exoplayer2.source;

import com.fyber.inneractive.sdk.player.exoplayer2.C8672l;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.source.j */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC8725j implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C8731p f20354a;

    public RunnableC8725j(C8731p c8731p) {
        this.f20354a = c8731p;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C8731p c8731p = this.f20354a;
        if (c8731p.f20380G) {
            return;
        }
        C8672l c8672l = (C8672l) c8731p.f20396p;
        c8672l.getClass();
        c8672l.f20182f.obtainMessage(9, c8731p).sendToTarget();
    }
}
