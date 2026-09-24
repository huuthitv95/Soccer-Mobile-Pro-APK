package com.fyber.inneractive.sdk.player.exoplayer2.video;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.video.l */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC8840l implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f20752a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ long f20753b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ VideoRendererEventListener.EventDispatcher f20754c;

    public RunnableC8840l(VideoRendererEventListener.EventDispatcher eventDispatcher, int i, long j) {
        this.f20754c = eventDispatcher;
        this.f20752a = i;
        this.f20753b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f20754c.listener.onDroppedFrames(this.f20752a, this.f20753b);
    }
}
