package com.fyber.inneractive.sdk.player.exoplayer2.video;

import android.view.Surface;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.video.n */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC8842n implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Surface f20760a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ VideoRendererEventListener.EventDispatcher f20761b;

    public RunnableC8842n(VideoRendererEventListener.EventDispatcher eventDispatcher, Surface surface) {
        this.f20761b = eventDispatcher;
        this.f20760a = surface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f20761b.listener.onRenderedFirstFrame(this.f20760a);
    }
}
