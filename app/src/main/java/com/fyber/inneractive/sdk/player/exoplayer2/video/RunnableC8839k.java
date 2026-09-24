package com.fyber.inneractive.sdk.player.exoplayer2.video;

import com.fyber.inneractive.sdk.player.exoplayer2.C8708o;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.video.k */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC8839k implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C8708o f20750a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ VideoRendererEventListener.EventDispatcher f20751b;

    public RunnableC8839k(VideoRendererEventListener.EventDispatcher eventDispatcher, C8708o c8708o) {
        this.f20751b = eventDispatcher;
        this.f20750a = c8708o;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f20751b.listener.onVideoInputFormatChanged(this.f20750a);
    }
}
