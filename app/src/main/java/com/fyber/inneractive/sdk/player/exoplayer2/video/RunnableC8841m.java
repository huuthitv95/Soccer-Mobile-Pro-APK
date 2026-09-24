package com.fyber.inneractive.sdk.player.exoplayer2.video;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.video.m */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC8841m implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f20755a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f20756b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f20757c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ float f20758d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ VideoRendererEventListener.EventDispatcher f20759e;

    public RunnableC8841m(VideoRendererEventListener.EventDispatcher eventDispatcher, int i, int i2, int i3, float f) {
        this.f20759e = eventDispatcher;
        this.f20755a = i;
        this.f20756b = i2;
        this.f20757c = i3;
        this.f20758d = f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f20759e.listener.onVideoSizeChanged(this.f20755a, this.f20756b, this.f20757c, this.f20758d);
    }
}
